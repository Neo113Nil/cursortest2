package xsna;

/* compiled from: Connector.kt */
/* loaded from: classes11.dex */
public class u4j {
    public final d8g a;
    public final d8g b;
    public final d8g c;
    public final float[] d;

    /* compiled from: Connector.kt */
    public static final class a extends u4j {
        public final njg0 e;
        public final njg0 f;
        public final float[] g;

        public a(njg0 njg0Var, njg0 njg0Var2) {
            super(njg0Var2, njg0Var, njg0Var2, null);
            float[] f;
            this.e = njg0Var;
            this.f = njg0Var2;
            float[] fArr = bj0.b.a;
            blx0 blx0Var = njg0Var.d;
            float[] fArr2 = njg0Var.i;
            blx0 blx0Var2 = njg0Var2.d;
            float[] fArr3 = njg0Var2.j;
            if (e8g.c(blx0Var, blx0Var2)) {
                f = e8g.f(fArr3, fArr2);
            } else {
                float[] a = blx0Var.a();
                float[] a2 = blx0Var2.a();
                blx0 blx0Var3 = crx0.j;
                f = e8g.f(e8g.c(blx0Var2, blx0Var3) ? fArr3 : e8g.e(e8g.f(e8g.b(fArr, a2, new float[]{0.964212f, 1.0f, 0.825188f}), njg0Var2.i)), e8g.c(blx0Var, blx0Var3) ? fArr2 : e8g.f(e8g.b(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
            }
            this.g = f;
        }

        @Override // xsna.u4j
        public final long a(long j) {
            float i = l5g.i(j);
            float h = l5g.h(j);
            float f = l5g.f(j);
            float e = l5g.e(j);
            tp1 tp1Var = this.e.p;
            float b = (float) tp1Var.b(i);
            float b2 = (float) tp1Var.b(h);
            float b3 = (float) tp1Var.b(f);
            float[] fArr = this.g;
            float f2 = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
            float f3 = (fArr[7] * b3) + (fArr[4] * b2) + (fArr[1] * b);
            float f4 = (fArr[8] * b3) + (fArr[5] * b2) + (fArr[2] * b);
            njg0 njg0Var = this.f;
            float b4 = (float) njg0Var.m.b(f2);
            oyr oyrVar = njg0Var.m;
            return f870.b(b4, (float) oyrVar.b(f3), (float) oyrVar.b(f4), e, njg0Var);
        }
    }

    public u4j(d8g d8gVar, d8g d8gVar2, d8g d8gVar3, float[] fArr) {
        this.a = d8gVar;
        this.b = d8gVar2;
        this.c = d8gVar3;
        this.d = fArr;
    }

    public long a(long j) {
        float i = l5g.i(j);
        float h = l5g.h(j);
        float f = l5g.f(j);
        float e = l5g.e(j);
        d8g d8gVar = this.b;
        long e2 = d8gVar.e(i, h, f);
        float intBitsToFloat = Float.intBitsToFloat((int) (e2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (e2 & 4294967295L));
        float g = d8gVar.g(i, h, f);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            g *= fArr[2];
        }
        float f2 = intBitsToFloat;
        float f3 = intBitsToFloat2;
        return this.c.h(f2, f3, g, e, this.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u4j(d8g d8gVar, d8g d8gVar2, int i) {
        this(d8gVar2, r0, r1, r4);
        float[] fArr;
        long j = d8gVar.b;
        long j2 = x6g.a;
        d8g a2 = x6g.a(j, j2) ? e8g.a(d8gVar) : d8gVar;
        d8g a3 = x6g.a(d8gVar2.b, j2) ? e8g.a(d8gVar2) : d8gVar2;
        float[] fArr2 = crx0.m;
        if (i == 3) {
            boolean a4 = x6g.a(d8gVar.b, j2);
            boolean a5 = x6g.a(d8gVar2.b, j2);
            if ((!a4 || !a5) && (a4 || a5)) {
                blx0 blx0Var = ((njg0) (a4 ? d8gVar : d8gVar2)).d;
                float[] a6 = a4 ? blx0Var.a() : fArr2;
                fArr2 = a5 ? blx0Var.a() : fArr2;
                fArr = new float[]{a6[0] / fArr2[0], a6[1] / fArr2[1], a6[2] / fArr2[2]};
            }
        }
        fArr = null;
    }
}
