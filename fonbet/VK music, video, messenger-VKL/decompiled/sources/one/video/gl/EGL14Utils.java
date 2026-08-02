package one.video.gl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.util.Log;
import xsna.go9;
import xsna.j100;
import xsna.rl3;
import xsna.zjq;

/* compiled from: EGL14Utils.kt */
/* loaded from: classes8.dex */
public final class EGL14Utils {

    /* compiled from: EGL14Utils.kt */
    public static final class EGL14UtilsException extends Exception {
    }

    public static void a(String str, int... iArr) {
        String str2;
        int eglGetError = EGL14.eglGetError();
        Integer valueOf = Integer.valueOf(eglGetError);
        if (eglGetError == 12288) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            if (intValue == 12291) {
                str2 = "EGL_BAD_ALLOC";
            } else if (intValue == 12293) {
                str2 = "EGL_BAD_CONFIG";
            } else if (intValue != 12297) {
                switch (intValue) {
                    case 12299:
                        str2 = "EGL_BAD_NATIVE_WINDOW";
                        break;
                    case 12300:
                        str2 = "EGL_BAD_PARAMETER";
                        break;
                    case 12301:
                        str2 = "EGL_BAD_SURFACE";
                        break;
                    default:
                        str2 = go9.b("0x", Integer.toHexString(intValue));
                        break;
                }
            } else {
                str2 = "EGL_BAD_MATCH";
            }
            String str3 = str + ": " + str2;
            Log.e("EGL14Utils", str3);
            if (rl3.E(intValue, iArr)) {
                return;
            }
            EGL14UtilsException eGL14UtilsException = new EGL14UtilsException(str3);
            j100 j100Var = zjq.g;
            if (j100Var != null) {
                j100Var.logError(eGL14UtilsException);
            }
        }
    }

    public static EGLConfig b(EGLDisplay eGLDisplay, int i) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12339, i, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new RuntimeException("Unable to find EGL config");
    }
}
