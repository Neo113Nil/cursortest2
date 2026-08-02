package defpackage;

import com.yandex.plus.core.benchmark.b;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;

/* loaded from: classes2.dex */
public final class hva0 implements fod0 {
    public final PlusPayCompositeOffers.Offer a;
    public final fwa0 b;

    public hva0(PlusPayCompositeOffers.Offer offer, fwa0 fwa0Var) {
        this.a = offer;
        this.b = fwa0Var;
    }

    @Override // defpackage.fod0
    public final zy11 a(ind0 ind0Var, uod0 uod0Var) {
        boolean l = jl40.l(ind0Var.b.getOffer(), this.a);
        zy11 zy11Var = zy11.a;
        if (!l) {
            return zy11Var;
        }
        boolean z = uod0Var instanceof rod0;
        fwa0 fwa0Var = this.b;
        if (z) {
            hwa0 hwa0Var = (hwa0) fwa0Var;
            pgz pgzVar = hwa0Var.e;
            LogPriority logPriority = LogPriority.DEBUG;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, "PerformanceSessionImpl", "onEndPurchase()");
            }
            hwa0Var.a((ll5) hwa0Var.g.getValue());
            pgz pgzVar2 = hwa0Var.e;
            if (pgzVar2.e(logPriority)) {
                pgzVar2.a(logPriority, "PerformanceSessionImpl", "onStartPolling()");
            }
            ((b) ((ll5) hwa0Var.h.getValue())).b();
            return zy11Var;
        }
        if (uod0Var instanceof ood0) {
            hwa0 hwa0Var2 = (hwa0) fwa0Var;
            pgz pgzVar3 = hwa0Var2.e;
            LogPriority logPriority2 = LogPriority.DEBUG;
            if (pgzVar3.e(logPriority2)) {
                pgzVar3.a(logPriority2, "PerformanceSessionImpl", "onEndPolling()");
            }
            hwa0Var2.a((ll5) hwa0Var2.h.getValue());
            return zy11Var;
        }
        if ((uod0Var instanceof pod0) || (uod0Var instanceof qod0) || (uod0Var instanceof nod0) || (uod0Var instanceof sod0) || (uod0Var instanceof tod0)) {
            return zy11Var;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.fod0
    public final void b(ind0 ind0Var) {
    }

    @Override // defpackage.fod0
    public final void c(ind0 ind0Var, kod0 kod0Var) {
    }
}
