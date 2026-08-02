package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import ru.yandex.taxi.address.clarification.AddressClarificationCloseReason;
import ru.yandex.taxi.address.clarification.impl.ui.AddressAdjustmentModalView;
import ru.yandex.taxi.preorder.source.domain.r;

/* loaded from: classes5.dex */
public final class np0 extends s45 {
    public final /* synthetic */ op0 a;
    public final /* synthetic */ AddressAdjustmentModalView b;
    public final /* synthetic */ bc1 c;
    public final /* synthetic */ xp0 d;
    public final /* synthetic */ AtomicReference e;

    public np0(op0 op0Var, AddressAdjustmentModalView addressAdjustmentModalView, bc1 bc1Var, xp0 xp0Var, AtomicReference atomicReference) {
        this.a = op0Var;
        this.b = addressAdjustmentModalView;
        this.c = bc1Var;
        this.d = xp0Var;
        this.e = atomicReference;
    }

    @Override // defpackage.s45
    public final void a(int i) {
        op0 op0Var = this.a;
        a3v a3vVar = op0Var.F;
        AddressAdjustmentModalView addressAdjustmentModalView = this.b;
        a3vVar.Td(tje.u(360, addressAdjustmentModalView.getContext()) - ((int) addressAdjustmentModalView.getTranslationY()), AddressAdjustmentModalView.class);
        op0Var.G.c();
        pv0 pv0Var = this.c.d;
        if (pv0Var != null) {
            h56 h56Var = op0Var.S;
            h56.b(h56Var, h56Var.b.b(pv0Var, false), h56Var.c, pv0Var, op0Var.R.a, null, 16);
            ((r) op0Var.M).i(pv0Var);
            e56 e56Var = op0Var.J;
            String str = pv0Var.b.d;
            if (str == null) {
                e56Var.getClass();
            } else {
                e56Var.a.add(str);
            }
        }
    }

    @Override // defpackage.s45
    public final void b() {
        pv0 pv0Var = this.c.d;
        xp0 xp0Var = this.d;
        op0 op0Var = this.a;
        if (pv0Var != null) {
            h56 h56Var = op0Var.S;
            h56.b(h56Var, h56Var.b.b(pv0Var, jl40.l(xp0Var, tp0.b)), h56Var.c, pv0Var, op0Var.R.a, null, 16);
        }
        AddressClarificationCloseReason addressClarificationCloseReason = (AddressClarificationCloseReason) this.e.get();
        op0Var.F.Lc(AddressAdjustmentModalView.class, null);
        op0Var.G.c();
        op0Var.r(new v5(8, xp0Var, addressClarificationCloseReason));
    }
}
