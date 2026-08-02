package defpackage;

import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.b;
import com.yandex.plus.pay.internal.di.d;
import com.yandex.plus.pay.internal.feature.payment.a;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import java.util.Map;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ipd0 implements mod0 {
    public final add0 a;

    public ipd0(add0 add0Var) {
        this.a = add0Var;
    }

    @Override // defpackage.mod0
    public final lod0 a(ind0 ind0Var) {
        PlusPayCompositeOffers.Offer.Vendor vendor;
        PlusTarifficatorPurchase plusTarifficatorPurchase = ind0Var.b;
        fpd0 e = ((b) this.a).e();
        PlusPayCompositeOffers.Offer offer = plusTarifficatorPurchase.getOffer();
        PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams = ind0Var.d;
        UUID uuid = ind0Var.a;
        Map map = ind0Var.e;
        a aVar = (a) e;
        aVar.getClass();
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        if (tariffOffer == null || (vendor = tariffOffer.getVendor()) == null) {
            PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) kotlin.collections.a.R(offer.getOptionOffers());
            if (option == null) {
                ny61.r("Offer must not be empty!");
                return null;
            }
            vendor = option.getVendor();
        }
        PlusPayCompositeOffers.Offer.Vendor vendor2 = PlusPayCompositeOffers.Offer.Vendor.NATIVE;
        if (vendor != vendor2) {
            yhl.d(vendor2, "Invalid vendor for silent payment! Must be ");
            return null;
        }
        d dVar = (d) aVar.a;
        ibd0 ibd0Var = dVar.e;
        s5f s5fVar = (s5f) ibd0Var.r.getValue();
        c1u0 c1u0Var = (c1u0) ibd0Var.s.getValue();
        k0x0 k0x0Var = (k0x0) ibd0Var.t.getValue();
        com.yandex.plus.pay.internal.feature.cache.a b = ibd0Var.b();
        fad0 fad0Var = dVar.b;
        com.yandex.plus.pay.internal.feature.payment.p002native.b bVar = new com.yandex.plus.pay.internal.feature.payment.p002native.b(offer, uuid, plusPayPaymentAnalyticsParams, map, s5fVar, c1u0Var, k0x0Var, b, (qqx0) fad0Var.m.getValue(), dVar.d.b(), dVar.a.w, fad0Var.e);
        mdd0.c(aVar.b, gt90.b, aVar + ".startSilentPayment(" + offer + Extension.FIX_SPACE + plusPayPaymentAnalyticsParams.asString$pay_sdk_release() + Extension.FIX_SPACE + uuid + ")=" + bVar);
        return bVar;
    }

    @Override // defpackage.mod0
    public final boolean b(ind0 ind0Var) {
        PlusTarifficatorPurchase plusTarifficatorPurchase = ind0Var.b;
        return (tpd.b(plusTarifficatorPurchase.getOffer()) == PlusPayCompositeOffers.Offer.Vendor.NATIVE) && (plusTarifficatorPurchase.getType() == PlusTarifficatorPurchase.Type.SILENT);
    }
}
