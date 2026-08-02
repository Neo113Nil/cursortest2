package defpackage;

import androidx.compose.ui.graphics.colorspace.a;

/* loaded from: classes10.dex */
public final class e6e extends f6e {
    public final a e;
    public final a f;
    public final float[] g;

    public e6e(a aVar, a aVar2) {
        super(aVar2, aVar, aVar2, null);
        float[] Z;
        this.e = aVar;
        this.f = aVar2;
        float[] fArr = (float[]) vit.w.b;
        lz41 lz41Var = aVar.d;
        float[] fArr2 = aVar.i;
        lz41 lz41Var2 = aVar2.d;
        float[] fArr3 = aVar2.j;
        if (ffx.w(lz41Var, lz41Var2)) {
            Z = ffx.Z(fArr3, fArr2);
        } else {
            float[] a = lz41Var.a();
            float[] a2 = lz41Var2.a();
            lz41 lz41Var3 = rzo.c;
            Z = ffx.Z(ffx.w(lz41Var2, lz41Var3) ? fArr3 : ffx.U(ffx.Z(ffx.s(fArr, a2, new float[]{0.964212f, 1.0f, 0.825188f}), aVar2.i)), ffx.w(lz41Var, lz41Var3) ? fArr2 : ffx.Z(ffx.s(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = Z;
    }

    @Override // defpackage.f6e
    public final long a(long j) {
        float h = ldc.h(j);
        float g = ldc.g(j);
        float e = ldc.e(j);
        float d = ldc.d(j);
        a3k0 a3k0Var = this.e.p;
        float a = (float) a3k0Var.a(h);
        float a2 = (float) a3k0Var.a(g);
        float a3 = (float) a3k0Var.a(e);
        float[] fArr = this.g;
        float f = (fArr[6] * a3) + (fArr[3] * a2) + (fArr[0] * a);
        float f2 = (fArr[7] * a3) + (fArr[4] * a2) + (fArr[1] * a);
        float f3 = (fArr[8] * a3) + (fArr[5] * a2) + (fArr[2] * a);
        a aVar = this.f;
        float a4 = (float) aVar.m.a(f);
        a3k0 a3k0Var2 = aVar.m;
        return rzo.c(a4, (float) a3k0Var2.a(f2), (float) a3k0Var2.a(f3), d, aVar);
    }
}
