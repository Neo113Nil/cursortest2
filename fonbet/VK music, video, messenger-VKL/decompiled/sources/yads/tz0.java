package yads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.util.Base64;
import java.nio.charset.Charset;
import xsna.emb;

/* loaded from: classes10.dex */
public abstract class tz0 {
    public static void a() {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            ji1.b("GlUtil", "glError: " + GLU.gluErrorString(glGetError));
            i = glGetError;
        }
        if (i != 0) {
            ji1.b("GlUtil", "glError: " + GLU.gluErrorString(i));
        }
    }

    public static boolean c() {
        String eglQueryString;
        return mc3.a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static boolean a(Context context) {
        String eglQueryString;
        int i = mc3.a;
        if (i < 24) {
            return false;
        }
        if (i < 26) {
            byte[] decode = Base64.decode("c2Ftc3VuZw==", 0);
            Charset charset = emb.b;
            if (new String(decode, charset).equals(mc3.c) || new String(Base64.decode("WFQxNjUw", 0), charset).equals(mc3.d)) {
                return false;
            }
        }
        return (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content");
    }
}
