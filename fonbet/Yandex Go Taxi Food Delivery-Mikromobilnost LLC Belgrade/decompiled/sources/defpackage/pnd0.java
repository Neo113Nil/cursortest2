package defpackage;

import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayInAppReplacementParams;
import com.yandex.plus.pay.api.model.SyncType;
import com.yandex.plus.pay.internal.b;
import com.yandex.plus.pay.internal.di.d;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class pnd0 implements mod0 {
    public final v7d0 a;

    public pnd0(v7d0 v7d0Var) {
        this.a = v7d0Var;
    }

    @Override // defpackage.mod0
    public final lod0 a(ind0 ind0Var) {
        PlusPayCompositeOffers.Offer.Vendor vendor;
        PlusTarifficatorPurchase plusTarifficatorPurchase = ind0Var.b;
        PlusPayCompositeOffers.Offer offer = plusTarifficatorPurchase.getOffer();
        PlusPayInAppReplacementParams inAppReplacementParams = plusTarifficatorPurchase.getInAppReplacementParams();
        god0 god0Var = new god0(offer, inAppReplacementParams);
        dpd0 dpd0Var = (dpd0) ((b) this.a).g.getValue();
        PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams = ind0Var.d;
        UUID uuid = ind0Var.a;
        Map map = ind0Var.e;
        epd0 epd0Var = (epd0) dpd0Var;
        epd0Var.getClass();
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        if (tariffOffer == null || (vendor = tariffOffer.getVendor()) == null) {
            PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) a.R(offer.getOptionOffers());
            if (option == null) {
                ny61.r("Offer must not be empty!");
                return null;
            }
            vendor = option.getVendor();
        }
        PlusPayCompositeOffers.Offer.Vendor vendor2 = PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY;
        if (vendor != vendor2) {
            yhl.d(vendor2, "Invalid vendor for payment request! Must be ");
            return null;
        }
        efd0 efd0Var = epd0Var.a;
        Set<SyncType> all = SyncType.INSTANCE.all();
        d dVar = (d) efd0Var;
        dbd0 dbd0Var = dVar.d;
        ocd0 d = dbd0Var.d();
        ibd0 ibd0Var = dVar.e;
        gzu0 gzu0Var = (gzu0) ibd0Var.l.getValue();
        t1v0 t1v0Var = (t1v0) ibd0Var.i.getValue();
        com.yandex.plus.pay.internal.feature.cache.a b = ibd0Var.b();
        fad0 fad0Var = dVar.b;
        nq80 nq80Var = (nq80) fad0Var.k.getValue();
        qqx0 qqx0Var = (qqx0) fad0Var.m.getValue();
        com.yandex.plus.experiments.impl.providers.a b2 = dbd0Var.b();
        ndd0 ndd0Var = fad0Var.e;
        com.yandex.plus.pay.internal.di.b bVar = dVar.a;
        com.yandex.plus.core.benchmark.a aVar = bVar.w;
        ((wyj) bVar.n).getClass();
        com.yandex.plus.pay.internal.feature.payment.inapp.google.b bVar2 = new com.yandex.plus.pay.internal.feature.payment.inapp.google.b(offer, inAppReplacementParams, plusPayPaymentAnalyticsParams, uuid, map, d, gzu0Var, t1v0Var, b, nq80Var, qqx0Var, b2, ndd0Var, aVar, all, wyj.e);
        mdd0.c(epd0Var.b, gt90.b, epd0Var + ".startPayment(" + god0Var + Extension.FIX_SPACE + plusPayPaymentAnalyticsParams.asString$pay_sdk_release() + Extension.FIX_SPACE + uuid + ") = " + bVar2);
        return bVar2;
    }

    @Override // defpackage.mod0
    public final boolean b(ind0 ind0Var) {
        return tpd.b(ind0Var.b.getOffer()) == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY;
    }
}
