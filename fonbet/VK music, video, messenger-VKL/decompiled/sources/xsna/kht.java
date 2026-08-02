package xsna;

import android.opengl.GLES20;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: GaussianBlurFilter.kt */
/* loaded from: classes12.dex */
public final class kht extends e0u {
    public final boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public float v;
    public float w;

    /* compiled from: GaussianBlurFilter.kt */
    public static final class a {

        /* compiled from: GaussianBlurFilter.kt */
        /* renamed from: xsna.kht$a$a, reason: collision with other inner class name */
        public static final class C3181a {
            public final float[] a;
            public final float[] b;

            public C3181a(float[] fArr, float[] fArr2) {
                this.a = fArr;
                this.b = fArr2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3181a)) {
                    return false;
                }
                C3181a c3181a = (C3181a) obj;
                return epx.f(this.a, c3181a.a) && epx.f(this.b, c3181a.b);
            }

            public final int hashCode() {
                return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "GaussianCalculation(weights=" + Arrays.toString(this.a) + ", optimizedOffsets=" + Arrays.toString(this.b) + ')';
            }
        }

        public static C3181a a(float f, int i) {
            int i2 = i + 1;
            float[] fArr = new float[i2];
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (int i3 = 0; i3 < i2; i3++) {
                double d = f;
                double d2 = 2.0f;
                float sqrt = (float) ((1.0f / Math.sqrt(((float) Math.pow(d, d2)) * 6.283185307179586d)) * ((float) Math.exp((-((float) Math.pow(i3, d2))) / (((float) Math.pow(d, d2)) * 2.0f))));
                fArr[i3] = sqrt;
                if (i3 != 0) {
                    sqrt *= 2.0f;
                }
                f2 += sqrt;
            }
            for (int i4 = 0; i4 < i2; i4++) {
                fArr[i4] = fArr[i4] / f2;
            }
            int min = Math.min((i % 2) + (i / 2), 7);
            float[] fArr2 = new float[min];
            for (int i5 = 0; i5 < min; i5++) {
                int i6 = i5 * 2;
                int i7 = i6 + 1;
                float f3 = fArr[i7];
                int i8 = i6 + 2;
                float f4 = fArr[i8];
                fArr2[i5] = ((f4 * i8) + (f3 * i7)) / (f3 + f4);
            }
            return new C3181a(fArr, fArr2);
        }

        public static kht b(boolean z) {
            int i;
            float rint = (float) Math.rint(8.0f);
            if (rint >= 1.0f) {
                double d = rint;
                double d2 = 2.0f;
                int floor = (int) Math.floor(Math.sqrt(Math.log(Math.sqrt(((float) Math.pow(d, d2)) * 6.283185307179586d) * 0.00390625f) * ((float) Math.pow(d, d2)) * (-2.0f)));
                i = (floor % 2) + floor;
            } else {
                i = 0;
            }
            float[] fArr = a(rint, i).b;
            String str = "uniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\nattribute highp vec4 aPosition;\nattribute highp vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 blurCoordinates[" + ((fArr.length * 2) + 1) + "];\nvoid main() {\n    vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n    gl_Position = mvpMatrix * aPosition;\n    vTextureCoord = (texMatrix * aTextureCoord).xy;\n    blurCoordinates[0] = vTextureCoord;\n";
            int length = fArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                String c = c(fArr[i2]);
                StringBuilder b = ho8.b(str + "    blurCoordinates[" + (i3 + 1) + "] = vTextureCoord + singleStepOffset * " + c + ";\n", "    blurCoordinates[");
                b.append(i3 + 2);
                b.append("] = vTextureCoord - singleStepOffset * ");
                b.append(c);
                b.append(";\n");
                str = b.toString();
            }
            String a = fo8.a(str, "}\n");
            C3181a a2 = a(rint, i);
            float[] fArr2 = a2.a;
            float[] fArr3 = a2.b;
            int i4 = (i % 2) + (i / 2);
            String b2 = gq.b((fArr3.length * 2) + 1, "%s\nuniform %s sTexture;\nuniform highp float texelWidthOffset;\nuniform highp float texelHeightOffset;\nvarying highp vec2 blurCoordinates[", "];\nvoid main() {\n    lowp vec4 sum = vec4(0.0);\n    sum += texture2D(sTexture, blurCoordinates[0]) * ", c(fArr2[0]), ";\n");
            int length2 = fArr3.length;
            for (int i5 = 0; i5 < length2; i5++) {
                int i6 = i5 * 2;
                int i7 = i6 + 1;
                int i8 = i6 + 2;
                String c2 = c(fArr2[i7] + fArr2[i8]);
                b2 = (b2 + "    sum += texture2D(sTexture, blurCoordinates[" + i7 + "]) * " + c2 + ";\n") + "    sum += texture2D(sTexture, blurCoordinates[" + i8 + "]) * " + c2 + ";\n";
            }
            if (i4 > fArr3.length) {
                String a3 = fo8.a(b2, "    highp vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n");
                b2 = a3;
                for (int length3 = fArr3.length; length3 < i4; length3++) {
                    int i9 = length3 * 2;
                    int i10 = i9 + 1;
                    float f = fArr2[i10];
                    int i11 = i9 + 2;
                    float f2 = fArr2[i11];
                    float f3 = f + f2;
                    float f4 = f2 * i11;
                    String c3 = c(f3);
                    String c4 = c((f4 + (f * i10)) / f3);
                    StringBuilder b3 = i5s.b(b2, "    sum += texture2D(sTexture, blurCoordinates[0] + singleStepOffset * ", c4, ") * ", c3);
                    b3.append(";\n");
                    StringBuilder b4 = i5s.b(b3.toString(), "    sum += texture2D(sTexture, blurCoordinates[0] - singleStepOffset * ", c4, ") * ", c3);
                    b4.append(";\n");
                    b2 = b4.toString();
                }
            }
            return new kht(z, a, fo8.a(fo8.a(b2, "    gl_FragColor = sum;\n"), "}\n"));
        }

        public static String c(float f) {
            return String.format(Locale.US, "%f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        }
    }

    public kht(boolean z, String str, String str2) {
        super(str, str2);
        this.q = z;
        this.r = -1;
        this.t = -1;
    }

    @Override // xsna.e0u, xsna.umv
    public final void a(int i, int i2) {
        this.s = i;
        this.u = i2;
    }

    @Override // xsna.e0u, xsna.umv
    public final void h(float f) {
        float f2 = swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (this.q) {
            this.v = f2;
        } else {
            this.w = f2;
        }
    }

    @Override // xsna.e0u, xsna.umv
    public final void init() {
        super.init();
        this.r = f("texelWidthOffset");
        this.t = f("texelHeightOffset");
    }

    @Override // xsna.e0u, xsna.umv
    public final void onDraw() {
        float f = this.v / this.s;
        float f2 = this.w / this.u;
        GLES20.glUniform1f(this.r, f);
        GLES20.glUniform1f(this.t, f2);
    }
}
