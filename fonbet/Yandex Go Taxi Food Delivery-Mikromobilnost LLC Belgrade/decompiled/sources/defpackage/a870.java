package defpackage;

import com.yandex.go.flex.common.actions.dto.OpenSelectPaymentMethodAction;

/* loaded from: classes12.dex */
public final class a870 extends h55 implements dw {
    public final i6r D;
    public final yvf0 E;
    public final oep0 F;
    public final xl10 G;
    public final dwl H;

    public a870(i6r i6rVar, yvf0 yvf0Var, oep0 oep0Var, xl10 xl10Var, dwl dwlVar) {
        super(null);
        this.D = i6rVar;
        this.E = yvf0Var;
        this.F = oep0Var;
        this.G = xl10Var;
        this.H = dwlVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        z((m950) this.E.get(), new z770(this, (b870) obj));
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        OpenSelectPaymentMethodAction openSelectPaymentMethodAction = (OpenSelectPaymentMethodAction) krVar;
        Object obj = this.G.a;
        hdu a = e6x.a(openSelectPaymentMethodAction.a);
        b870 b870Var = (openSelectPaymentMethodAction.a == null || a != null) ? new b870(openSelectPaymentMethodAction, n6uVar, a) : null;
        if (b870Var != null) {
            ((pep0) this.F).f(this, b870Var, hxx.a);
        }
    }
}
