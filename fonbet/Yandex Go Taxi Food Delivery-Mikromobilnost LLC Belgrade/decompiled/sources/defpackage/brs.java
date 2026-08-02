package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.camera.core.processing.util.GLUtils$InputFormat;
import com.google.android.gms.gcm.Task;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.ProviderParameters;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public abstract class brs {
    public static final int[] a = {12344};
    public static final int[] b = {12445, 13632, 12344};
    public static final String c;
    public static final String d;
    public static final xqs e;
    public static final xqs f;
    public static final xqs g;
    public static final FloatBuffer h;
    public static final FloatBuffer i;
    public static final o74 j;

    static {
        Locale locale = Locale.US;
        c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        e = new xqs(0);
        f = new xqs(1);
        g = new xqs(2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        h = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        i = asFloatBuffer2;
        j = new o74(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        ny61.r(oyr.r(oyr.v(str, ": EGL error: 0x"), eglGetError));
    }

    public static void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        ny61.r(oyr.r(oyr.v(str, ": GL error 0x"), glGetError));
    }

    public static void c(Thread thread) {
        d6z.y("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    public static void d(boolean z, AtomicBoolean atomicBoolean) {
        d6z.y(z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z == atomicBoolean.get());
    }

    public static void e(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        ny61.r(oyr.p("Unable to locate '", str, "' in program"));
    }

    public static HashMap f(q8n q8nVar, Map map) {
        Object arsVar;
        GLUtils$InputFormat gLUtils$InputFormat;
        HashMap hashMap = new HashMap();
        GLUtils$InputFormat[] values = GLUtils$InputFormat.values();
        int length = values.length;
        for (int i2 = 0; i2 < length; i2++) {
            GLUtils$InputFormat gLUtils$InputFormat2 = values[i2];
            xqs xqsVar = (xqs) map.get(gLUtils$InputFormat2);
            if (xqsVar != null) {
                arsVar = new ars(q8nVar, xqsVar);
            } else if (gLUtils$InputFormat2 == GLUtils$InputFormat.YUV || gLUtils$InputFormat2 == (gLUtils$InputFormat = GLUtils$InputFormat.DEFAULT)) {
                arsVar = new ars(q8nVar, gLUtils$InputFormat2);
            } else {
                d6z.y("Unhandled input format: " + gLUtils$InputFormat2, gLUtils$InputFormat2 == GLUtils$InputFormat.UNKNOWN);
                if (q8nVar.a()) {
                    arsVar = new yqs();
                } else {
                    xqs xqsVar2 = (xqs) map.get(gLUtils$InputFormat);
                    arsVar = xqsVar2 != null ? new ars(q8nVar, xqsVar2) : new ars(q8nVar, gLUtils$InputFormat);
                }
            }
            Objects.toString(gLUtils$InputFormat2);
            arsVar.toString();
            hashMap.put(gLUtils$InputFormat2, arsVar);
        }
        return hashMap;
    }

    public static int g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i2 = iArr[0];
        GLES20.glBindTexture(36197, i2);
        b("glBindTexture " + i2);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, Task.EXTRAS_LIMIT_BYTES, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i2;
    }

    public static EGLSurface h(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        ny61.r("surface was null");
        return null;
    }

    public static String i() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return ProviderParameters.DEFAULT_PRODUCT_VER;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        group2.getClass();
        return g8e.p(group, Extension.DOT_CHAR, group2);
    }

    public static int j(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        b("glCreateShader type=" + i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        sgb1.g(5, "GLUtils");
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        ny61.r(oyr.k(i2, "Could not compile shader type ", ":", glGetShaderInfoLog));
        return 0;
    }
}
