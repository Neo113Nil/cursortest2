package defpackage;

import ru.yandex.taxi.cashback.sdk.OpenPlusSubscriptionAction;

/* loaded from: classes6.dex */
public final class lrd0 implements zid0 {
    public final /* synthetic */ xus a;

    public lrd0(xus xusVar) {
        this.a = xusVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        xus xusVar = this.a;
        qxx0 qxx0Var = (qxx0) xusVar.x;
        if (qxx0Var == null) {
            return;
        }
        xusVar.P(qxx0Var);
    }

    @Override // defpackage.zid0
    public final void t0(boolean z) {
        v2d0 v2d0Var = new v2d0();
        if (z) {
            v2d0Var.a = OpenPlusSubscriptionAction.BUY_SUBSCRIPTION;
        }
        this.a.P(new qxx0("", v2d0Var.a(), null));
    }
}
