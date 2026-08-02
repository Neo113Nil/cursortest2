package xsna;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: SlotShader.kt */
/* loaded from: classes4.dex */
public final class s2k0 {
    public static final short[] u = {0, 1, 2, 0, 2, 3};
    public final c a;
    public final int b;
    public final Integer c;
    public float d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final FloatBuffer r;
    public final FloatBuffer s;
    public final ShortBuffer t;

    /* compiled from: SlotShader.kt */
    public static final class a {
        public static c a(m1t m1tVar, Size size, f2t f2tVar, float[] fArr) {
            float f;
            float width;
            float f2;
            float f3;
            float f4;
            float f5;
            int i;
            float[] fArr2;
            float f6 = m1tVar.g;
            float f7 = m1tVar.h;
            float width2 = size.getWidth() / size.getHeight();
            float f8 = m1tVar.c;
            float width3 = size.getWidth() * f8;
            float f9 = m1tVar.d;
            float height = size.getHeight() * f9;
            float f10 = width3 / height;
            float f11 = f2tVar.b / f2tVar.c;
            float f12 = m1tVar.a;
            float f13 = m1tVar.b;
            float f14 = f12 + f8;
            float f15 = f13 + f9;
            if (f10 >= f11) {
                f = (width3 / f11) / size.getHeight();
                float f16 = (f - f9) / 2.0f;
                f3 = f12;
                f4 = f13 - f16;
                f5 = f16 + f15;
                width = f14 - f12;
                f2 = f14;
            } else {
                f = f15 - f13;
                width = (height * f11) / size.getWidth();
                float f17 = (width - f8) / 2.0f;
                float f18 = f12 - f17;
                f2 = f17 + f14;
                f3 = f18;
                f4 = f13;
                f5 = f15;
            }
            float f19 = -width2;
            float f20 = f;
            float f21 = width;
            float[] fArr3 = {b(f3, f19, width2), -b(f4, -1.0f, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b(f3, f19, width2), -b(f5, -1.0f, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b(f2, f19, width2), -b(f5, -1.0f, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b(f2, f19, width2), -b(f4, -1.0f, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
            b bVar = new b(f12, 1.0f - f15, f14, 1.0f - f13);
            float[] fArr4 = new float[16];
            Matrix.setIdentityM(fArr4, 0);
            float[] fArr5 = new float[16];
            Matrix.setIdentityM(fArr5, 0);
            float[] fArr6 = new float[16];
            Matrix.setIdentityM(fArr6, 0);
            float[] fArr7 = new float[16];
            Matrix.translateM(fArr4, 0, m1tVar.e * width2 * 2.0f, (-m1tVar.f) * 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float b = b((f21 * 0.5f) + f3, f19, width2);
            float b2 = b((0.5f * f20) + f4, -1.0f, 1.0f);
            if (f7 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr2 = fArr5;
                i = 0;
            } else {
                i = 0;
                Matrix.translateM(fArr5, 0, b, -b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Matrix.rotateM(fArr5, 0, -f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                fArr2 = fArr5;
                Matrix.translateM(fArr2, 0, -b, b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (f6 != 1.0f) {
                Matrix.translateM(fArr6, i, b, -b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Matrix.scaleM(fArr6, i, f6, f6, 1.0f);
                Matrix.translateM(fArr6, i, -b, b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            Matrix.multiplyMM(fArr7, 0, fArr, 0, fArr4, 0);
            Matrix.multiplyMM(fArr7, 0, (float[]) fArr7.clone(), 0, fArr6, 0);
            Matrix.multiplyMM(fArr7, 0, (float[]) fArr7.clone(), 0, fArr2, 0);
            return new c(fArr3, bVar, fArr7);
        }

        public static float b(float f, float f2, float f3) {
            return f3 - ((f3 - f2) * (1.0f - f));
        }
    }

    /* compiled from: SlotShader.kt */
    public static final class b {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.a, bVar.a) == 0 && Float.compare(this.b, bVar.b) == 0 && Float.compare(this.c, bVar.c) == 0 && Float.compare(this.d, bVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder a = bxj0.a("Frame(x1=", this.a, ", y1=", this.b, ", x2=");
            a.append(this.c);
            a.append(", y2=");
            a.append(this.d);
            a.append(")");
            return a.toString();
        }
    }

    /* compiled from: SlotShader.kt */
    public static final class c {
        public final float[] a;
        public final b b;
        public final float[] c;

        public c(float[] fArr, b bVar, float[] fArr2) {
            this.a = fArr;
            this.b = bVar;
            this.c = fArr2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.c) + ((this.b.hashCode() + (Arrays.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            String arrays = Arrays.toString(this.a);
            String arrays2 = Arrays.toString(this.c);
            StringBuilder sb = new StringBuilder("LayoutParams(vertices=");
            sb.append(arrays);
            sb.append(", frame=");
            sb.append(this.b);
            sb.append(", transformMatrix=");
            return i5s.a(sb, arrays2, ")");
        }
    }

    public s2k0(int i, int i2, c cVar, int i3, Integer num) {
        this.a = cVar;
        this.b = i3;
        this.c = num;
        int glCreateProgram = GLES20.glCreateProgram();
        this.e = glCreateProgram;
        this.q = 12;
        float[] fArr = cVar.a;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        this.r = asFloatBuffer;
        float[] fArr2 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(48);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(fArr2);
        asFloatBuffer2.position(0);
        this.s = asFloatBuffer2;
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(12);
        allocateDirect3.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect3.asShortBuffer();
        asShortBuffer.put(u);
        asShortBuffer.position(0);
        this.t = asShortBuffer;
        GLES20.glAttachShader(glCreateProgram, i);
        GLES20.glAttachShader(glCreateProgram, i2);
        GLES20.glLinkProgram(glCreateProgram);
        this.g = GLES20.glGetUniformLocation(glCreateProgram, "u_MVPMatrix");
        this.h = GLES20.glGetUniformLocation(glCreateProgram, "u_Texture");
        this.f = GLES20.glGetAttribLocation(glCreateProgram, "a_Position");
        this.i = GLES20.glGetAttribLocation(glCreateProgram, "a_TexCoordinate");
        this.j = GLES20.glGetUniformLocation(glCreateProgram, "u_EnhanceEnabled");
        this.k = GLES20.glGetUniformLocation(glCreateProgram, "u_EnhanceIntensity");
        this.l = GLES20.glGetUniformLocation(glCreateProgram, "u_EnhancedTexture");
        this.m = GLES20.glGetUniformLocation(glCreateProgram, "u_FrameX1");
        this.n = GLES20.glGetUniformLocation(glCreateProgram, "u_FrameY1");
        this.o = GLES20.glGetUniformLocation(glCreateProgram, "u_FrameX2");
        this.p = GLES20.glGetUniformLocation(glCreateProgram, "u_FrameY2");
    }
}
