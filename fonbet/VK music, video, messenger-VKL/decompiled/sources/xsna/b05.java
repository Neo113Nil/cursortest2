package xsna;

/* compiled from: AudioWaveFromFile.kt */
/* loaded from: classes18.dex */
public final class b05 implements yz4 {
    public final i05 a;
    public float[] b;
    public final float[] c;
    public int d;
    public int e;
    public Integer h;
    public final a f = new a(0);
    public final a g = new a(0);
    public final float[] i = new float[4];

    /* compiled from: AudioWaveFromFile.kt */
    public static final class a {
        public float a;
        public int b;
        public int c;
        public int d;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CalculationState(scale=");
            sb.append(this.a);
            sb.append(", startIndex=");
            sb.append(this.b);
            sb.append(", endIndex=");
            sb.append(this.c);
            sb.append(", filled=");
            return vu5.b(sb, this.d, ')');
        }

        public a(int i) {
            this.a = Float.MAX_VALUE;
            this.b = 0;
            this.c = 0;
            this.d = 0;
        }
    }

    public b05(i05 i05Var, int i, int i2) {
        this.a = i05Var;
        this.b = new float[i];
        this.c = new float[i2];
    }

    @Override // xsna.yz4
    public final int a() {
        return this.d;
    }

    @Override // xsna.yz4
    public final float[] b() {
        return this.c;
    }

    public final void c(long j, long j2, float f) {
        int i;
        float[] fArr;
        int intValue;
        boolean z;
        float f2 = 1.0f;
        float f3 = 1.0f / f;
        boolean z2 = true;
        if (f3 == 1.0f) {
            i = 1;
        } else {
            int max = (int) Math.max(1.0f, 2 * f3);
            int i2 = max | (max >> 1);
            int i3 = i2 | (i2 >> 2);
            int i4 = i3 | (i3 >> 4);
            int i5 = i4 | (i4 >> 8);
            int i6 = i5 | (i5 >> 16);
            int i7 = i6 - (i6 >> 1);
            float f4 = i7 / f3;
            i = i7;
            f2 = f4;
        }
        i05 i05Var = this.a;
        float f5 = i05Var.i * f2;
        Long l = i05Var.h;
        boolean z3 = false;
        Integer valueOf = l != null ? Integer.valueOf(swe0.g(d(l.longValue(), i05Var.g), 0, this.b.length)) : null;
        a aVar = this.g;
        aVar.a = f;
        aVar.b = swe0.g(((d(j, i05Var.g) / i) - 1) * i, 0, this.b.length);
        aVar.c = swe0.g(((d(j2, i05Var.g) / i) + 1) * i, aVar.b, this.b.length);
        int i8 = this.e;
        aVar.d = i8;
        int i9 = aVar.b;
        a aVar2 = this.f;
        if (i9 < aVar2.b || aVar.c > aVar2.c || i8 != aVar2.d || aVar.a != aVar2.a) {
            this.h = null;
            float f6 = 2.0f;
            float f7 = i * 2.0f;
            int i10 = aVar.c;
            int i11 = 0;
            float f8 = 0.0f;
            while (true) {
                fArr = this.c;
                if (i9 >= i10) {
                    break;
                }
                boolean z4 = z2;
                f8 += this.b[i9];
                if (i9 % i == 0) {
                    float f9 = ((i9 / i) * f5) + (i05Var.a / f6);
                    float f10 = f8 / f7;
                    fArr[i11] = f9;
                    z = z3;
                    float f11 = i05Var.j;
                    fArr[i11 + 1] = f11 - f10;
                    int i12 = i11 + 3;
                    fArr[i11 + 2] = f9;
                    i11 += 4;
                    fArr[i12] = f11 + f10;
                    f8 = 0.0f;
                } else {
                    z = z3;
                }
                i9++;
                z2 = z4;
                z3 = z;
                f6 = 2.0f;
            }
            boolean z5 = z2;
            boolean z6 = z3;
            this.d = i11;
            if (valueOf != null && (intValue = (valueOf.intValue() / i) * 4) >= 0 && intValue <= this.d - 4) {
                this.h = Integer.valueOf(intValue);
                float f12 = fArr[intValue];
                float[] fArr2 = this.i;
                fArr2[z6 ? 1 : 0] = f12;
                fArr2[z5 ? 1 : 0] = fArr[intValue + 1];
                fArr2[2] = fArr[intValue + 2];
                fArr2[3] = fArr[intValue + 3];
            }
            aVar2.a = aVar.a;
            aVar2.b = aVar.b;
            aVar2.c = aVar.c;
            aVar2.d = aVar.d;
        }
    }

    public final int d(long j, long j2) {
        return (int) Math.ceil((j / j2) * this.b.length);
    }
}
