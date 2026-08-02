package xsna;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import app.effectum.filter.image.GPUImage$ScaleType;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.filters.model.FilterType;
import com.vk.media.rotation.Rotation;
import com.vkontakte.android.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.gpu.SharedEglContext;

/* compiled from: CommonFiltersBridgeImpl.kt */
/* loaded from: classes12.dex */
public final class tjg implements tfr {
    public final gcr a;
    public final m900<String, Bitmap> b = new m900<>(6);

    /* compiled from: CommonFiltersBridgeImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilterType.values().length];
            try {
                iArr[FilterType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FilterType.NATURAL_02.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FilterType.NATURAL_04.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FilterType.NATURAL_05.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FilterType.RGB_01.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FilterType.RGB_02.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FilterType.RGB_03.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FilterType.RGB_05.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FilterType.VINTAGE_01.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FilterType.VINTAGE_02.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[FilterType.VINTAGE_NATURAL_06.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[FilterType.VINTAGE_LMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[FilterType.B_W_01.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[FilterType.FREAKY_GF_01.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[FilterType.LUT_01.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[FilterType.LUT_02.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[FilterType.LUT_03.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[FilterType.LUT_04.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[FilterType.LUT_05.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public tjg(gcr gcrVar) {
        this.a = gcrVar;
    }

    @Override // xsna.tfr
    public final boolean a(FilterType filterType, Context context) {
        try {
            InputStream open = context.getAssets().open(this.a.a(filterType));
            if (open == null) {
                return true;
            }
            try {
                open.close();
                return true;
            } catch (IOException e) {
                Log.e("CommonFiltersBrodgeImpl", "", e);
                return true;
            }
        } catch (IOException e2) {
            Log.e("CommonFiltersBrodgeImpl", "", e2);
            return false;
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    @Override // xsna.tfr
    public final String b(FilterType filterType, Context context) {
        int i;
        switch (a.$EnumSwitchMapping$0[filterType.ordinal()]) {
            case 1:
                i = R.string.filter_original;
                break;
            case 2:
                i = R.string.filter_natural_02;
                break;
            case 3:
                i = R.string.filter_natural_04;
                break;
            case 4:
                i = R.string.filter_natural_05;
                break;
            case 5:
                i = R.string.filter_rgb_01;
                break;
            case 6:
                i = R.string.filter_rgb_02;
                break;
            case 7:
                i = R.string.filter_rgb_03;
                break;
            case 8:
                i = R.string.filter_rgb_05;
                break;
            case 9:
                i = R.string.filter_vintage_01;
                break;
            case 10:
                i = R.string.filter_vintage_02;
                break;
            case 11:
                i = R.string.filter_vintage_natural_06;
                break;
            case 12:
                i = R.string.filter_vintage_lpm;
                break;
            case 13:
                i = R.string.filter_black_and_white_01;
                break;
            case 14:
                i = R.string.filter_freaky_gf_01;
                break;
            case 15:
                i = R.string.filter_lut_01;
                break;
            case 16:
                i = R.string.filter_lut_02;
                break;
            case 17:
                i = R.string.filter_lut_03;
                break;
            case 18:
                i = R.string.filter_lut_04;
                break;
            case 19:
                i = R.string.filter_lut_05;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return context.getString(i);
    }

    @Override // xsna.tfr
    public final umv c(FilterType filterType, Context context) {
        BufferedReader bufferedReader;
        cdi cdiVar = cdi.g;
        if (a(filterType, context)) {
            int i = a.$EnumSwitchMapping$0[filterType.ordinal()];
            m900<String, Bitmap> m900Var = this.b;
            gcr gcrVar = this.a;
            switch (i) {
                case 1:
                    break;
                case 2:
                    bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(R.raw.fragment_natural_2), emb.b), 8192);
                    try {
                        String b = a0a.b(bufferedReader);
                        bufferedReader.close();
                        return new iye0(b);
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                case 3:
                    return new qvu("uniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute highp vec4 aPosition;\nattribute highp vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = mvpMatrix * aPosition;   vTextureCoord = (texMatrix * aTextureCoord).xy;}\n", "\n%s\nprecision mediump float;\n\nvarying highp vec2 vTextureCoord;\n\nuniform %s sTexture;\nuniform float paramIntensity;\nuniform lowp float distance;\n\nvoid main() {\n    highp vec4 color = vec4(1.0);\n    highp vec4 textureColor = texture2D(sTexture, vTextureCoord);\n    highp float distance = 0.2 * paramIntensity;\n    gl_FragColor = (textureColor - distance * color) / (1.0 - distance);\n}\n");
                case 4:
                    return new j4u0("uniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute highp vec4 aPosition;\nattribute highp vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = mvpMatrix * aPosition;   vTextureCoord = (texMatrix * aTextureCoord).xy;}\n", "\n%s\nprecision mediump float;\n\nvarying vec2 vTextureCoord;\n\nuniform lowp %s sTexture;\nuniform float paramIntensity;\n\nconst lowp vec2 vignetteCenter = vec2(0.5, 0.5);\nconst highp float vignetteStart = 0.2;\nconst highp float vignetteEnd = 0.85;\nconst lowp vec3 vignetteRgb = vec3(0.0, 0.0, 0.0);\n\nvoid main() {\n    lowp vec4 textureColor = texture2D(sTexture, vTextureCoord);\n    lowp float d = distance(vTextureCoord, vec2(vignetteCenter.x, vignetteCenter.y));\n    lowp float percent = smoothstep(vignetteStart, vignetteEnd, d);\n    lowp vec4 outputColor = vec4(mix(textureColor.rgb, vignetteRgb, percent), 1.0);\n    gl_FragColor = mix(textureColor, outputColor, paramIntensity);\n}\n");
                case 5:
                    return new jw1(0.5f, 0.5f, 25);
                case 6:
                    return new lw1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.7f, 26);
                case 7:
                    return new mw1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                case 8:
                    return new kw1(0.7f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 29);
                case 9:
                    return new ski0("uniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute highp vec4 aPosition;\nattribute highp vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = mvpMatrix * aPosition;   vTextureCoord = (texMatrix * aTextureCoord).xy;}\n", "\n%s\nprecision mediump float;\nvarying highp vec2 vTextureCoord;\nuniform float paramIntensity;\n\nuniform %s sTexture;\n\nconst lowp mat4 colorMatrix = mat4(\n    0.3588, 0.7044, 0.1368, 0.0,\n    0.2990, 0.5870, 0.1140, 0.0,\n    0.2392, 0.4696, 0.0912, 0.0,\n    0, 0, 0, 1.0\n);\n\nvoid main()\n{\n    lowp vec4 textureColor = texture2D(sTexture, vTextureCoord);\n    lowp vec4 outputColor = textureColor * colorMatrix;\n    \n    gl_FragColor = mix(textureColor, outputColor, paramIntensity);\n}");
                case 10:
                    bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(R.raw.fragment_vintage_2), emb.b), 8192);
                    try {
                        String b2 = a0a.b(bufferedReader);
                        bufferedReader.close();
                        return new oye0(context, b2, gcrVar.a(filterType), m900Var);
                    } finally {
                    }
                case 11:
                    return new ojg0(Color.red(-1912854) / 255.0f, Color.green(-1912854) / 255.0f, Color.blue(-1912854) / 255.0f);
                case 12:
                    return new qjk();
                case 13:
                    return new jeu("uniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute highp vec4 aPosition;\nattribute highp vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = mvpMatrix * aPosition;   vTextureCoord = (texMatrix * aTextureCoord).xy;}\n", "\n%s\nprecision mediump float; \n\nvarying vec2 vTextureCoord;\n\nuniform %s sTexture;\nuniform float paramIntensity;\n\nconst highp vec3 weight = vec3(0.2125, 0.7154, 0.0721);\n\nvoid main()\n{\n    vec4 textureColor = texture2D(sTexture, vTextureCoord);\n    float luminance = dot(textureColor.rgb, weight);\n    vec4 outputColor = vec4(vec3(luminance), 1.0);\n    gl_FragColor = mix(textureColor, outputColor, paramIntensity);\n}\n");
                case 14:
                    return new iw1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 31);
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    return new j600(context, "\n%s\nprecision mediump float;\nuniform %s sTexture;\nuniform sampler2D oTexture;\nuniform float paramIntensity;\nvarying vec2 vTextureCoord;\n\nvec4 processLookup(vec4 textureColor, sampler2D lookupTex, float intense) {\n    float blueColor = textureColor.b * 63.0;\n    vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n    vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 8.0);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n    vec2 texPos1;\n    texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n    texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n    vec2 texPos2;\n    texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n    texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n    vec4 newColor1 = texture2D(lookupTex, texPos1);\n    vec4 newColor2 = texture2D(lookupTex, texPos2);\n    vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n    return mix(textureColor, vec4(newColor.rgb, textureColor.a), intense);\n}\n\nvoid main() {\n    vec4 textureColor = texture2D(sTexture, vTextureCoord);\n    textureColor = clamp(textureColor, vec4(0.0, 0.0, 0.0, 1.0), vec4(1.0, 1.0, 1.0, 1.0));\n    gl_FragColor = processLookup(textureColor, oTexture, paramIntensity);\n}\n", gcrVar.a(filterType), m900Var);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return cdiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01c2  */
    @Override // xsna.tfr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap d(Context context, Bitmap bitmap, FilterType filterType) {
        boolean z;
        if (filterType == FilterType.NONE) {
            return bitmap;
        }
        i0u i0uVar = new i0u(c(filterType, context));
        i0uVar.i.getClass();
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            throw new IllegalArgumentException("Invalid bitmap specified to transform: " + bitmap.getWidth() + "x" + bitmap.getHeight());
        }
        GPUImage$ScaleType gPUImage$ScaleType = GPUImage$ScaleType.CENTER_CROP;
        if (((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion < 131072) {
            throw new IllegalStateException("OpenGL ES 2.0 is not supported on this phone.");
        }
        r2t r2tVar = new r2t(new n2t());
        r2tVar.m(new q2t(r2tVar, bitmap));
        r2tVar.m(new o2t(r2tVar, i0uVar));
        r2t r2tVar2 = new r2t(i0uVar);
        Rotation rotation = Rotation.ROTATION_0;
        r2tVar2.n = r2tVar.n;
        r2tVar2.m = rotation;
        r2tVar2.k();
        r2tVar2.o = gPUImage$ScaleType;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        bqa0 bqa0Var = new bqa0();
        bqa0Var.b = width;
        bqa0Var.c = height;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        bqa0Var.e = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        bqa0Var.f = eglGetDisplay;
        egl10.eglInitialize(eglGetDisplay, new int[2]);
        int[] iArr = {12325, 0, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
        int[] iArr2 = new int[1];
        egl10.eglChooseConfig(eglGetDisplay, iArr, null, 0, iArr2);
        int i = iArr2[0];
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        bqa0Var.g = eGLConfigArr;
        egl10.eglChooseConfig(eglGetDisplay, iArr, eGLConfigArr, i, iArr2);
        EGLConfig eGLConfig = bqa0Var.g[0];
        int[] iArr3 = {SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, 2, 12344};
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, eGLContext, iArr3);
        bqa0Var.h = eglCreateContext;
        EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, width, 12374, height, 12344});
        bqa0Var.i = eglCreatePbufferSurface;
        egl10.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
        GL10 gl10 = (GL10) eglCreateContext.getGL();
        bqa0Var.j = gl10;
        bqa0Var.k = Thread.currentThread().getId();
        bqa0Var.a = r2tVar2;
        if (!bqa0Var.a("setRenderer")) {
            bqa0Var.a.onSurfaceCreated(gl10, eGLConfig);
            bqa0Var.a.onSurfaceChanged(gl10, width, height);
        }
        r2tVar2.m(new q2t(r2tVar2, bitmap));
        Bitmap bitmap2 = null;
        if (bqa0Var.a == null) {
            Log.e("PixelBuffer", "getBitmap: Renderer was not set.");
        } else if (!bqa0Var.a("getBitmap")) {
            bqa0Var.a.onDrawFrame(gl10);
            int[] iArr4 = new int[width * height];
            IntBuffer wrap = IntBuffer.wrap(iArr4);
            wrap.position(0);
            int i2 = 0;
            GLES20.glReadPixels(0, 0, width, height, 6408, 5121, wrap);
            int i3 = 0;
            while (i3 < height / 2) {
                for (int i4 = i2; i4 < width; i4++) {
                    int i5 = (i3 * width) + i4;
                    int i6 = (((height - i3) - 1) * width) + i4;
                    int i7 = iArr4[i5];
                    wrap.array();
                    int i8 = iArr4[i6];
                    iArr4[i5] = (i8 & (-16711936)) | ((i8 >> 16) & 255) | ((i8 << 16) & 16711680);
                    iArr4[i6] = (i7 & (-16711936)) | ((i7 >> 16) & 255) | ((i7 << 16) & 16711680);
                }
                i3++;
                i2 = 0;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            bqa0Var.d = createBitmap;
            int i9 = bqa0Var.b;
            createBitmap.setPixels(iArr4, 0, i9, 0, 0, i9, bqa0Var.c);
            bitmap2 = bqa0Var.d;
            z = false;
            i0uVar.h = z;
            GLES20.glDeleteProgram(i0uVar.d);
            i0uVar.c();
            r2tVar2.m(new p2t(r2tVar2));
            EGLDisplay eGLDisplay = bqa0Var.f;
            EGL10 egl102 = bqa0Var.e;
            if (!bqa0Var.a("destroy")) {
                bqa0Var.a.onDrawFrame(bqa0Var.j);
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
                egl102.eglDestroySurface(eGLDisplay, bqa0Var.i);
                egl102.eglDestroyContext(eGLDisplay, bqa0Var.h);
                egl102.eglTerminate(eGLDisplay);
                bqa0Var.k = -1L;
            }
            r2tVar.m(new o2t(r2tVar, i0uVar));
            r2tVar.m(new q2t(r2tVar, bitmap));
            return bitmap2;
        }
        z = false;
        i0uVar.h = z;
        GLES20.glDeleteProgram(i0uVar.d);
        i0uVar.c();
        r2tVar2.m(new p2t(r2tVar2));
        EGLDisplay eGLDisplay2 = bqa0Var.f;
        EGL10 egl1022 = bqa0Var.e;
        if (!bqa0Var.a("destroy")) {
        }
        r2tVar.m(new o2t(r2tVar, i0uVar));
        r2tVar.m(new q2t(r2tVar, bitmap));
        return bitmap2;
    }

    @Override // xsna.tfr
    public final lcr e() {
        tpw tpwVar = new tpw();
        tpwVar.l = new float[16];
        tpwVar.m = new float[16];
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        tpwVar.n = fArr;
        return tpwVar;
    }

    @Override // xsna.tfr
    public final void f() {
        this.b.evictAll();
    }
}
