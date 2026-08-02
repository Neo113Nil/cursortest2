package xsna;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* compiled from: SimpleShader.kt */
/* loaded from: classes4.dex */
public class ksj0 {
    public static final short[] k = {0, 1, 2, 0, 2, 3};
    public static final float[] l;
    public int a = -1;
    public final int b;
    public final int c;
    public final FloatBuffer d;
    public final FloatBuffer e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final ShortBuffer j;

    static {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        l = fArr;
    }

    public ksj0(int i, int i2) {
        int glCreateProgram = GLES20.glCreateProgram();
        this.b = glCreateProgram;
        float[] fArr = {-1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.c = 12;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(48);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        this.d = asFloatBuffer;
        float[] fArr2 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(48);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(fArr2);
        asFloatBuffer2.position(0);
        this.e = asFloatBuffer2;
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(12);
        allocateDirect3.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect3.asShortBuffer();
        asShortBuffer.put(k);
        asShortBuffer.position(0);
        this.j = asShortBuffer;
        GLES20.glAttachShader(glCreateProgram, i);
        GLES20.glAttachShader(glCreateProgram, i2);
        GLES20.glLinkProgram(glCreateProgram);
        this.g = GLES20.glGetUniformLocation(glCreateProgram, "u_MVPMatrix");
        this.h = GLES20.glGetUniformLocation(glCreateProgram, "u_Texture");
        this.f = GLES20.glGetAttribLocation(glCreateProgram, "a_Position");
        this.i = GLES20.glGetAttribLocation(glCreateProgram, "a_TexCoordinate");
    }

    public final void b(Size size) {
        GLES20.glUseProgram(this.b);
        a(size);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.a);
        GLES20.glUniform1i(this.h, 0);
        GLES20.glUniformMatrix4fv(this.g, 1, false, l, 0);
        GLES20.glVertexAttribPointer(this.f, 3, 5126, false, this.c, (Buffer) this.d);
        GLES20.glVertexAttribPointer(this.i, 3, 5126, false, this.c, (Buffer) this.e);
        int i = this.f;
        GLES20.glEnableVertexAttribArray(i);
        int i2 = this.i;
        GLES20.glEnableVertexAttribArray(i2);
        GLES20.glDrawElements(4, 6, 5123, this.j);
        GLES20.glDisableVertexAttribArray(i);
        GLES20.glDisableVertexAttribArray(i2);
    }

    public void a(Size size) {
    }
}
