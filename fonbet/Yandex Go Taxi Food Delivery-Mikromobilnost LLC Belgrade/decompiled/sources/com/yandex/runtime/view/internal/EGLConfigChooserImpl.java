package com.yandex.runtime.view.internal;

import android.opengl.GLSurfaceView;
import com.yandex.runtime.logging.Logger;
import defpackage.dy31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: classes8.dex */
public class EGLConfigChooserImpl implements GLSurfaceView.EGLConfigChooser, GLVersionProvider {
    private static final int EGL_OPENGL_ES3_BIT_KHR = 64;
    private Integer depthBits = null;

    /* loaded from: classes2.dex */
    public static class ConfigBuilder {
        Config config;

        public ConfigBuilder() {
            Config config = new Config(0);
            this.config = config;
            config.redBits = 8;
            config.greenBits = 8;
            config.blueBits = 8;
            config.alphaBits = 8;
            config.depthBits = 24;
            config.stencilBits = 8;
            config.sampleBuffers = 0;
            config.samples = 0;
        }

        public ConfigBuilder withAlphaBits(int i) {
            this.config.alphaBits = i;
            return this;
        }

        public ConfigBuilder withColorBits(int i) {
            Config config = this.config;
            config.redBits = i;
            config.greenBits = i;
            config.blueBits = i;
            return this;
        }

        public ConfigBuilder withDepthBits(int i) {
            this.config.depthBits = i;
            return this;
        }

        public ConfigBuilder withStencilBits(int i) {
            this.config.stencilBits = i;
            return this;
        }
    }

    private static List<Config> createConfigs() {
        ArrayList arrayList = new ArrayList();
        if (OffscreenBufferConfigBinding.isEnabled()) {
            arrayList.add(new ConfigBuilder().withColorBits(8).withAlphaBits(0).withDepthBits(0).withStencilBits(0).config);
        }
        arrayList.add(new ConfigBuilder().withColorBits(8).withAlphaBits(8).withDepthBits(24).withStencilBits(8).config);
        arrayList.add(new ConfigBuilder().withColorBits(8).withAlphaBits(8).withDepthBits(16).withStencilBits(8).config);
        return arrayList;
    }

    private static int[] getAttrs(Config config) {
        return new int[]{12352, 64, 12324, config.redBits, 12323, config.greenBits, 12322, config.blueBits, 12321, config.alphaBits, 12325, config.depthBits, 12326, config.stencilBits, 12344};
    }

    private static Integer getConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, String str) {
        int[] iArr = new int[1];
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
            return Integer.valueOf(iArr[0]);
        }
        Logger.warn("Failed to get EGL config " + str);
        return null;
    }

    private static int getConfigDepthBits(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        Integer configAttrib = getConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, "depth buffer bits");
        if (configAttrib != null) {
            return configAttrib.intValue();
        }
        Logger.warn("Assuming worst case of 16 bits");
        return 16;
    }

    private static Config getEGLConfigAttrs(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        Integer configAttrib = getConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, "red bits");
        Integer configAttrib2 = getConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, "green bits");
        Integer configAttrib3 = getConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, "blue bits");
        Integer configAttrib4 = getConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, "alpha bits");
        Integer configAttrib5 = getConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, "depth buffer bits");
        Integer configAttrib6 = getConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, "stencil buffer bits");
        Integer configAttrib7 = getConfigAttrib(egl10, eGLDisplay, eGLConfig, 12338, "sample buffers");
        Integer configAttrib8 = getConfigAttrib(egl10, eGLDisplay, eGLConfig, 12337, "samples");
        if (configAttrib == null || configAttrib2 == null || configAttrib3 == null || configAttrib4 == null || configAttrib5 == null || configAttrib6 == null || configAttrib7 == null || configAttrib8 == null) {
            return null;
        }
        Config config = new Config(0);
        config.redBits = configAttrib.intValue();
        config.greenBits = configAttrib2.intValue();
        config.blueBits = configAttrib3.intValue();
        config.alphaBits = configAttrib4.intValue();
        config.depthBits = configAttrib5.intValue();
        config.stencilBits = configAttrib6.intValue();
        config.sampleBuffers = configAttrib7.intValue();
        config.samples = configAttrib8.intValue();
        return config;
    }

    private static EGLConfig tryChooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        int i;
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2);
        EGLConfig eGLConfig = null;
        if (eglChooseConfig && (i = iArr2[0]) > 0) {
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i, iArr2)) {
                return null;
            }
            Config config = null;
            for (int i2 = 0; i2 < i; i2++) {
                EGLConfig eGLConfig2 = eGLConfigArr[i2];
                Config eGLConfigAttrs = getEGLConfigAttrs(egl10, eGLDisplay, eGLConfig2);
                if (eGLConfigAttrs != null && (config == null || config.sumBits() > eGLConfigAttrs.sumBits())) {
                    eGLConfig = eGLConfig2;
                    config = eGLConfigAttrs;
                }
            }
            if (eGLConfig == null) {
                return eGLConfigArr[0];
            }
        }
        return eGLConfig;
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        Config config;
        Iterator<Config> it = createConfigs().iterator();
        EGLConfig eGLConfig = null;
        while (true) {
            if (!it.hasNext()) {
                config = null;
                break;
            }
            Config next = it.next();
            Logger.warn("Trying OpenGl ES Version 3 config with " + next);
            EGLConfig tryChooseConfig = tryChooseConfig(egl10, eGLDisplay, getAttrs(next));
            if (tryChooseConfig != null) {
                config = next;
                eGLConfig = tryChooseConfig;
                break;
            }
            Logger.warn("Could not choose OpenGl ES Version 3 config with " + next + "; Got EGL error " + egl10.eglGetError());
            eGLConfig = tryChooseConfig;
        }
        if (eGLConfig == null) {
            dy31.e(egl10.eglGetError(), "eglChooseConfig() failed; Got EGL error ");
            return null;
        }
        Config eGLConfigAttrs = getEGLConfigAttrs(egl10, eGLDisplay, eGLConfig);
        if (eGLConfigAttrs != null) {
            Logger.warn("Chosen EGL config=" + eGLConfigAttrs);
        }
        if (config.depthBits == 0) {
            this.depthBits = null;
            return eGLConfig;
        }
        this.depthBits = Integer.valueOf(getConfigDepthBits(egl10, eGLDisplay, eGLConfig));
        return eGLConfig;
    }

    @Override // com.yandex.runtime.view.internal.GLVersionProvider
    public Integer getDepthBits() {
        return this.depthBits;
    }

    /* loaded from: classes2.dex */
    public static class Config {
        int alphaBits;
        int blueBits;
        int depthBits;
        int greenBits;
        int redBits;
        int sampleBuffers;
        int samples;
        int stencilBits;

        public /* synthetic */ Config(int i) {
            this();
        }

        public int sumBits() {
            int i = this.redBits + this.greenBits + this.blueBits + this.alphaBits + this.depthBits + this.stencilBits;
            return this.sampleBuffers != 0 ? i * this.samples : i;
        }

        public String toString() {
            return String.format("{r=%d, g=%d, b=%d, a=%d, d=%d, s=%d, sampleBuffers=%d, samples=%d}", Integer.valueOf(this.redBits), Integer.valueOf(this.greenBits), Integer.valueOf(this.blueBits), Integer.valueOf(this.alphaBits), Integer.valueOf(this.depthBits), Integer.valueOf(this.stencilBits), Integer.valueOf(this.sampleBuffers), Integer.valueOf(this.samples));
        }

        private Config() {
        }
    }
}
