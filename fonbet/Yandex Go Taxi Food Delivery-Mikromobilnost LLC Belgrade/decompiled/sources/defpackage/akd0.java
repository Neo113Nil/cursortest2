package defpackage;

import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;

/* loaded from: classes2.dex */
public final class akd0 implements t6d0 {
    public final knd0 a;

    public akd0(knd0 knd0Var) {
        this.a = knd0Var;
    }

    @Override // defpackage.t6d0
    public final PlusPayCompositeOfferDetails a(PlusPayCompositeOfferDetails plusPayCompositeOfferDetails) {
        knd0 knd0Var = this.a;
        ind0 a = knd0Var.a();
        PlusTarifficatorPurchase plusTarifficatorPurchase = a.b;
        PlusPayCompositeOfferDetails.TariffOfferDetails tariffDetails = plusPayCompositeOfferDetails.getTariffDetails();
        knd0Var.a = ind0.a(a, PlusTarifficatorPurchase.copy$default(plusTarifficatorPurchase, null, plusPayCompositeOfferDetails, null, null, null, null, tariffDetails != null ? tariffDetails.getInAppReplacementParams() : null, 61, null), null, 29);
        return plusPayCompositeOfferDetails;
    }
}
