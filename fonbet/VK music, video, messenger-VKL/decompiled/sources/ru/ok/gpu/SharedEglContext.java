package ru.ok.gpu;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import xsna.cqi;
import xsna.et;
import xsna.ho8;

/* loaded from: classes9.dex */
public class SharedEglContext {
    public static final int EGL14_API_LEVEL = 17;
    public static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    public static final int EGL_DRAW = 12377;
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_OPENGL_ES3_BIT_KHR = 64;
    public static final int EGL_READ = 12378;
    private static final String TAG = "SharedEglContext";
    private EGL10 egl;
    private EGLContext egl14Context;
    private EGLConfig eglConfig;
    private javax.microedition.khronos.egl.EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private int glVersion;
    private long nativeEglContext;
    private int[] singleIntArray;

    public SharedEglContext() {
        this.eglDisplay = EGL10.EGL_NO_DISPLAY;
        this.eglConfig = null;
        this.eglContext = EGL10.EGL_NO_CONTEXT;
        this.nativeEglContext = 0L;
        this.egl14Context = null;
        this.egl = (EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
    }

    private void createContext(javax.microedition.khronos.egl.EGLContext eGLContext, int i, @Nullable int[] iArr) {
        EGLConfig config = getConfig(i, iArr);
        this.eglConfig = config;
        if (config == null) {
            throw new RuntimeException("Unable to find a suitable EGLConfig");
        }
        javax.microedition.khronos.egl.EGLContext eglCreateContext = this.egl.eglCreateContext(this.eglDisplay, config, eGLContext, new int[]{EGL_CONTEXT_CLIENT_VERSION, i, 12344});
        this.eglContext = eglCreateContext;
        if (eglCreateContext == null || eglCreateContext == EGL10.EGL_NO_CONTEXT) {
            int eglGetError = this.egl.eglGetError();
            StringBuilder sb = new StringBuilder("Could not create GL context: EGL error: 0x");
            sb.append(Integer.toHexString(eglGetError));
            sb.append(eglGetError == 12294 ? ": parent context uses a different version of OpenGL" : "");
            throw new RuntimeException(sb.toString());
        }
    }

    private javax.microedition.khronos.egl.EGLContext egl10ContextFromEgl14Context(EGLContext eGLContext) {
        EGLSurface eGLSurface;
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        android.opengl.EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(EGL_DRAW);
        EGLSurface eglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(EGL_READ);
        android.opengl.EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetCurrentContext.equals(eGLContext)) {
            eGLSurface = null;
        } else {
            eGLSurface = EGL14.eglCreatePbufferSurface(eglGetCurrentDisplay, getThrowawayConfig(eglGetDisplay), new int[]{12375, 1, 12374, 1, 12344}, 0);
            EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        javax.microedition.khronos.egl.EGLContext eglGetCurrentContext2 = this.egl.eglGetCurrentContext();
        if (!eglGetCurrentContext.equals(eGLContext)) {
            EGL14.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface, eglGetCurrentSurface2, eglGetCurrentContext);
            EGL14.eglDestroySurface(eglGetDisplay, eGLSurface);
        }
        return eglGetCurrentContext2;
    }

    private int findConfigAttrib(EGLConfig eGLConfig, int i, int i2) {
        return this.egl.eglGetConfigAttrib(this.eglDisplay, eGLConfig, i, this.singleIntArray) ? this.singleIntArray[0] : i2;
    }

    private EGLConfig getConfig(int i, @Nullable int[] iArr) {
        EGLConfig eGLConfig;
        int[] mergeAttribLists = mergeAttribLists(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12352, i == 3 ? 64 : 4, 12339, 5, 12344}, iArr);
        int[] iArr2 = this.singleIntArray;
        if (!this.egl.eglChooseConfig(this.eglDisplay, mergeAttribLists, null, 0, iArr2)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i2 = iArr2[0];
        if (i2 <= 0) {
            throw new IllegalArgumentException("No configs match requested attributes");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i2];
        if (!this.egl.eglChooseConfig(this.eglDisplay, mergeAttribLists, eGLConfigArr, i2, iArr2)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                eGLConfig = null;
                break;
            }
            eGLConfig = eGLConfigArr[i3];
            int findConfigAttrib = findConfigAttrib(eGLConfig, 12324, 0);
            int findConfigAttrib2 = findConfigAttrib(eGLConfig, 12323, 0);
            int findConfigAttrib3 = findConfigAttrib(eGLConfig, 12322, 0);
            int findConfigAttrib4 = findConfigAttrib(eGLConfig, 12321, 0);
            if (findConfigAttrib == 8 && findConfigAttrib2 == 8 && findConfigAttrib3 == 8 && findConfigAttrib4 == 8) {
                break;
            }
            i3++;
        }
        return eGLConfig == null ? eGLConfigArr[0] : eGLConfig;
    }

    private android.opengl.EGLConfig getThrowawayConfig(android.opengl.EGLDisplay eGLDisplay) {
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        int[] iArr = this.singleIntArray;
        if (!EGL14.eglChooseConfig(eGLDisplay, new int[]{12339, 5, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        if (iArr[0] > 0) {
            return eGLConfigArr[0];
        }
        throw new IllegalArgumentException("No configs match requested attributes");
    }

    private int[] mergeAttribLists(int[] iArr, @Nullable int[] iArr2) {
        if (iArr2 == null) {
            return iArr;
        }
        HashMap hashMap = new HashMap();
        int[][] iArr3 = {iArr, iArr2};
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            int[] iArr4 = iArr3[i2];
            for (int i3 = 0; i3 < iArr4.length / 2; i3++) {
                int i4 = i3 * 2;
                int i5 = iArr4[i4];
                int i6 = iArr4[i4 + 1];
                if (i5 == 12344) {
                    break;
                }
                hashMap.put(Integer.valueOf(i5), Integer.valueOf(i6));
            }
        }
        int[] iArr5 = new int[(hashMap.size() * 2) + 1];
        for (Map.Entry entry : hashMap.entrySet()) {
            int i7 = i + 1;
            iArr5[i] = ((Integer) entry.getKey()).intValue();
            i += 2;
            iArr5[i7] = ((Integer) entry.getValue()).intValue();
        }
        iArr5[i] = 12344;
        return iArr5;
    }

    public void checkEglError(String str) {
        int eglGetError = this.egl.eglGetError();
        if (eglGetError != 12288) {
            throw new RuntimeException(et.a(eglGetError, ho8.b(str, ": EGL error: 0x")));
        }
    }

    public javax.microedition.khronos.egl.EGLSurface createOffscreenSurface(int i, int i2) {
        javax.microedition.khronos.egl.EGLSurface eglCreatePbufferSurface = this.egl.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344});
        checkEglError("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }

    public javax.microedition.khronos.egl.EGLContext getContext() {
        return this.eglContext;
    }

    public int getGlVersion() {
        return this.glVersion;
    }

    public void makeCurrent(javax.microedition.khronos.egl.EGLSurface eGLSurface, javax.microedition.khronos.egl.EGLSurface eGLSurface2) {
        if (!this.egl.eglMakeCurrent(this.eglDisplay, eGLSurface, eGLSurface2, this.eglContext)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void makeNothingCurrent() {
        EGL10 egl10 = this.egl;
        EGLDisplay eGLDisplay = this.eglDisplay;
        javax.microedition.khronos.egl.EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void release() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        javax.microedition.khronos.egl.EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLDisplay eGLDisplay2 = EGL10.EGL_NO_DISPLAY;
        if (eGLDisplay != eGLDisplay2) {
            EGL10 egl10 = this.egl;
            javax.microedition.khronos.egl.EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
            this.egl.eglTerminate(this.eglDisplay);
        }
        this.eglDisplay = eGLDisplay2;
        this.eglContext = eGLContext;
        this.eglConfig = null;
    }

    public void releaseSurface(javax.microedition.khronos.egl.EGLSurface eGLSurface) {
        this.egl.eglDestroySurface(this.eglDisplay, eGLSurface);
    }

    public SharedEglContext(@Nullable Object obj) {
        this(obj, null);
    }

    public SharedEglContext(@Nullable Object obj, @Nullable int[] iArr) {
        EGLDisplay eGLDisplay = EGL10.EGL_NO_DISPLAY;
        this.eglDisplay = eGLDisplay;
        this.eglConfig = null;
        javax.microedition.khronos.egl.EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        this.eglContext = eGLContext;
        this.nativeEglContext = 0L;
        this.egl14Context = null;
        this.singleIntArray = new int[1];
        EGL10 egl10 = (EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.egl = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.eglDisplay = eglGetDisplay;
        if (eglGetDisplay != eGLDisplay) {
            if (this.egl.eglInitialize(eglGetDisplay, new int[2])) {
                if (obj != null) {
                    if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
                        eGLContext = (javax.microedition.khronos.egl.EGLContext) obj;
                    } else if (obj instanceof EGLContext) {
                        if (obj != EGL14.EGL_NO_CONTEXT) {
                            eGLContext = egl10ContextFromEgl14Context((EGLContext) obj);
                        }
                    } else {
                        throw new RuntimeException(cqi.c(obj, "invalid parent context: "));
                    }
                }
                try {
                    createContext(eGLContext, 3, iArr);
                    this.glVersion = 3;
                    return;
                } catch (RuntimeException e) {
                    e.toString();
                    createContext(eGLContext, 2, iArr);
                    this.glVersion = 2;
                    return;
                }
            }
            throw new RuntimeException("eglInitialize failed");
        }
        throw new RuntimeException("eglGetDisplay failed");
    }
}
