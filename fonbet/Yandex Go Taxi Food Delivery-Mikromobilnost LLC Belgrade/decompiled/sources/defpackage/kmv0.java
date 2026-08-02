package defpackage;

import com.yandex.go.summary.analytics.CancelModalCardAnalytics$ReorderModalButton;
import com.yandex.go.summary.analytics.CancelModalCardAnalytics$ReorderModalType;
import kotlin.Pair;

/* loaded from: classes6.dex */
public final class kmv0 extends ad5 {
    public final zxs0 A;
    public final sls x;
    public final sls y;
    public final p230 z;

    public kmv0(sls slsVar, sls slsVar2, p230 p230Var, zxs0 zxs0Var) {
        super(jmv0.class);
        this.x = slsVar;
        this.y = slsVar2;
        this.z = p230Var;
        this.A = zxs0Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        String str = this.z.a;
        b1 b1Var = (b1) this.A.a;
        b1Var.getClass();
        b1Var.o("CancelModalCard.Closed", gw00.e(new Pair("modal_id", str)));
        this.y.invoke();
    }

    public final void Kg() {
        ((b1) this.A.a).h(CancelModalCardAnalytics$ReorderModalType.REORDER, CancelModalCardAnalytics$ReorderModalButton.DoNothing, this.z.a);
        this.y.invoke();
        ((jmv0) Dg()).dismiss();
    }
}
