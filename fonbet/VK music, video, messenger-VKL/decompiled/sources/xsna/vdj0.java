package xsna;

import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: ShimmerModifier.kt */
/* loaded from: classes17.dex */
public final class vdj0 implements kio, j680 {
    public final kdj0 a;
    public final odj0 b;

    public vdj0(kdj0 kdj0Var, odj0 odj0Var) {
        this.a = kdj0Var;
        this.b = odj0Var;
    }

    @Override // xsna.q630.b, xsna.q630
    public final <R> R a(R r, wzs<? super R, ? super q630.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // xsna.j680
    public final void o(tny tnyVar) {
        long U = tnyVar.U(0L);
        int i = (int) (U >> 32);
        int i2 = (int) (U & 4294967295L);
        zhf0 zhf0Var = new zhf0(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + ((int) (tnyVar.a() >> 32)), Float.intBitsToFloat(i2) + ((int) (4294967295L & tnyVar.a())));
        kdj0 kdj0Var = this.a;
        if (zhf0Var.equals(kdj0Var.h)) {
            return;
        }
        kdj0Var.h = zhf0Var;
        kdj0Var.a();
    }

    @Override // xsna.kio
    public final void v(toy toyVar) {
        er9 er9Var = toyVar.b;
        odj0 odj0Var = this.b;
        Matrix matrix = odj0Var.h;
        kdj0 kdj0Var = this.a;
        if (kdj0Var.g.g() || kdj0Var.h.g()) {
            return;
        }
        float floatValue = odj0Var.g.d().floatValue();
        float f = kdj0Var.e;
        float intBitsToFloat = Float.intBitsToFloat((int) (kdj0Var.f >> 32)) + (f * floatValue) + ((-f) / 2);
        matrix.reset();
        matrix.postTranslate(intBitsToFloat, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        matrix.postRotate(odj0Var.c, Float.intBitsToFloat((int) (kdj0Var.f >> 32)), Float.intBitsToFloat((int) (kdj0Var.f & 4294967295L)));
        odj0Var.i.setLocalMatrix(matrix);
        zhf0 e = p490.e(0L, er9Var.d());
        yq9 a = er9Var.c.a();
        try {
            a.r(e, odj0Var.k);
            toyVar.s1();
            a.n(e, odj0Var.j);
        } finally {
            a.a();
        }
    }
}
