package xsna;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class pb30 implements izs {
    public final /* synthetic */ qb30 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ pb30(qb30 qb30Var, int i, int i2) {
        this.b = qb30Var;
        this.c = i;
        this.d = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        View view = (View) obj;
        qb30 qb30Var = this.b;
        view.getGlobalVisibleRect(qb30Var.Q);
        return Boolean.valueOf((view instanceof eih0) && qb30Var.Q.contains(this.c, this.d));
    }
}
