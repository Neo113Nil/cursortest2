package defpackage;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.ui.api.feature.payment.PlusPaymentFlowErrorReason;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;

/* loaded from: classes2.dex */
public final class h7t implements g7t {
    public final zgh a;
    public final pgz b;

    public h7t(zgh zghVar, pgz pgzVar) {
        this.a = zghVar;
        this.b = pgzVar;
    }

    public final oz90 a(ind0 ind0Var) {
        PlusTarifficatorPurchase b = ind0Var.b();
        PlusTarifficatorPurchase.Status status = b.getStatus();
        boolean z = status instanceof PlusTarifficatorPurchase.Status.Error;
        zgh zghVar = this.a;
        if (z) {
            return zghVar.a(b.getOffer(), ((PlusTarifficatorPurchase.Status.Error) status).getReason());
        }
        if (!(status instanceof PlusTarifficatorPurchase.Status.NotFinished) && !(status instanceof PlusTarifficatorPurchase.Status.Success)) {
            w511.b();
            return null;
        }
        LogPriority logPriority = LogPriority.ERROR;
        pgz pgzVar = this.b;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "GetErrorScreenContentInteractorImpl", "Unexpected last payment status for error screen: " + b);
        }
        return zghVar.a(b.getOffer(), PlusPaymentFlowErrorReason.Unexpected.INSTANCE);
    }
}
