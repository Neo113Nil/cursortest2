package xsna;

import android.content.Context;

/* compiled from: TextContextMenuModifier.android.kt */
/* loaded from: classes11.dex */
final class xn0 extends d730<yn0> {
    public final wzs<tco0, Context, s3q0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public xn0(wzs<? super tco0, ? super Context, s3q0> wzsVar) {
        this.a = wzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xn0) {
            return this.a == ((xn0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final yn0 r() {
        yn0 yn0Var = new yn0();
        yn0Var.r = this.a;
        j5 j5Var = new j5(yn0Var, 1);
        wn0 wn0Var = new wn0();
        wn0Var.p = j5Var;
        yn0Var.i2(wn0Var);
        return yn0Var;
    }

    @Override // xsna.d730
    public final void s(yn0 yn0Var) {
        yn0Var.r = this.a;
    }
}
