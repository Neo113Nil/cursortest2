package defpackage;

import ru.yandex.taxi.address.clarification.AddressClarificationCloseReason;

/* loaded from: classes13.dex */
public final class m5s0 implements lp0 {
    public final /* synthetic */ rwo0 a;

    public m5s0(rwo0 rwo0Var) {
        this.a = rwo0Var;
    }

    @Override // defpackage.lp0
    public final void I(xp0 xp0Var, AddressClarificationCloseReason addressClarificationCloseReason) {
        qu quVar = new qu(9);
        rwo0 rwo0Var = this.a;
        rwo0Var.r(quVar);
        ((e3o0) rwo0Var.F).invoke(xp0Var, addressClarificationCloseReason);
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }
}
