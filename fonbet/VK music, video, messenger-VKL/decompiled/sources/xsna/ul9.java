package xsna;

import android.content.Context;
import android.opengl.GLES20;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import ru.ok.gl.objects.GLProgram;
import ru.ok.media.R;

/* compiled from: CameraTexture2dProgram.java */
/* loaded from: classes12.dex */
public class ul9 extends s770 {
    public static final float[] q = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] r = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f};
    public final int c;
    public final Context d;
    public int e = 0;
    public int f;
    public int g;
    public int h;
    public int i;
    public float[] j;
    public float[] k;
    public FloatBuffer l;
    public FloatBuffer m;
    public int n;
    public int o;
    public final loo0 p;

    public ul9(Context context) {
        this.d = context;
        int i = this instanceof vl9 ? 36197 : 3553;
        this.c = i;
        this.p = new loo0(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(int i, int i2, int i3) {
        int c;
        int glCreateProgram;
        GLES20.glGetError();
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        GLES20.glClear(16640);
        v0u.a("glClear");
        GLES20.glDepthFunc(515);
        v0u.a("glDepthFunc");
        GLES20.glEnableVertexAttribArray(this.f);
        v0u.a("glEnableVertexAttribArray");
        GLES20.glEnableVertexAttribArray(this.g);
        v0u.a("glEnableVertexAttribArray");
        GLES20.glActiveTexture(33984);
        int i4 = this.c;
        GLES20.glBindTexture(i4, i);
        v0u.a("glBindTexture");
        int i5 = this.n;
        int i6 = this.o;
        int i7 = this.p.a;
        int i8 = Math.abs(((double) (((float) Math.max(i5, i6)) / ((float) Math.max(i2, i3)))) - 1.0d) < 0.01d ? 9728 : 9729;
        GLES20.glTexParameteri(i7, 10241, i8);
        GLES20.glTexParameteri(i7, 10240, i8);
        if (this.e == 0) {
            int i9 = R.raw.vertex_shader;
            Context context = this.d;
            String a = ebr.a(i9, context);
            String replace = (u() + ebr.a(R.raw.fragment_shader, context)).replace("%%SAMPLER_TYPE%%", t());
            GLES20.glGetError();
            int c2 = v0u.c(35633, a);
            if (c2 != 0 && (c = v0u.c(35632, replace)) != 0) {
                glCreateProgram = GLES20.glCreateProgram();
                v0u.a("glCreateProgram");
                if (glCreateProgram == 0) {
                    Log.e("Grafika", "Could not create program");
                } else {
                    GLES20.glAttachShader(glCreateProgram, c2);
                    v0u.a("glAttachShader");
                    GLES20.glAttachShader(glCreateProgram, c);
                    v0u.a("glAttachShader");
                    GLES20.glLinkProgram(glCreateProgram);
                    int[] iArr = new int[1];
                    GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        Log.e("Grafika", "Could not link program: ");
                        Log.e("Grafika", GLES20.glGetProgramInfoLog(glCreateProgram));
                        GLES20.glDeleteProgram(glCreateProgram);
                    }
                }
                this.e = glCreateProgram;
                if (glCreateProgram != 0) {
                    throw new RuntimeException("Unable to create program");
                }
                int glGetAttribLocation = GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
                this.f = glGetAttribLocation;
                v0u.b(glGetAttribLocation, "aPosition");
                int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.e, GLProgram.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
                this.g = glGetAttribLocation2;
                v0u.b(glGetAttribLocation2, GLProgram.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
                int glGetUniformLocation = GLES20.glGetUniformLocation(this.e, "uMVPMatrix");
                this.h = glGetUniformLocation;
                v0u.b(glGetUniformLocation, "uMVPMatrix");
                int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.e, "uTexMatrix");
                this.i = glGetUniformLocation2;
                v0u.b(glGetUniformLocation2, "uTexMatrix");
            }
            glCreateProgram = 0;
            this.e = glCreateProgram;
            if (glCreateProgram != 0) {
            }
        }
        GLES20.glUseProgram(this.e);
        v0u.a("glUseProgram");
        int i10 = this.f;
        if (this.l == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            allocateDirect.order(ByteOrder.nativeOrder());
            FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
            asFloatBuffer.put(q);
            asFloatBuffer.position(0);
            this.l = asFloatBuffer;
        }
        GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) this.l);
        v0u.a("glVertexAttribPointer");
        int i11 = this.g;
        if (this.m == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            allocateDirect2.order(ByteOrder.nativeOrder());
            FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
            asFloatBuffer2.put(r);
            asFloatBuffer2.position(0);
            this.m = asFloatBuffer2;
        }
        GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) this.m);
        v0u.a("glVertexAttribPointer");
        GLES20.glUniformMatrix4fv(this.h, 1, false, this.j, 0);
        v0u.a("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.i, 1, false, this.k, 0);
        v0u.a("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        v0u.a("glDrawArrays");
        GLES20.glBindTexture(i4, 0);
        GLES20.glUseProgram(0);
        GLES20.glDisableVertexAttribArray(this.f);
        GLES20.glDisableVertexAttribArray(this.g);
    }

    public String t() {
        return "sampler2D";
    }

    public String u() {
        return "";
    }
}
