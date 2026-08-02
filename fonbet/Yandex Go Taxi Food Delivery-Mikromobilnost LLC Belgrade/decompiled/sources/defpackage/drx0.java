package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.PlusTarifficatorMobileArguments;
import java.util.UUID;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class drx0 extends yr31 {
    public final v1m0 A;
    public final fwa0 B;
    public boolean C;
    public final jnd0 b;
    public final bdt c;
    public final s570 w;
    public final ftb x;
    public final sls y;
    public final sls z;

    public drx0(PlusTarifficatorMobileArguments plusTarifficatorMobileArguments, jnd0 jnd0Var, bdt bdtVar, s570 s570Var, ftb ftbVar, sls slsVar, sls slsVar2, v1m0 v1m0Var, fwa0 fwa0Var) {
        this.b = jnd0Var;
        this.c = bdtVar;
        this.w = s570Var;
        this.x = ftbVar;
        this.y = slsVar;
        this.z = slsVar2;
        this.A = v1m0Var;
        this.B = fwa0Var;
        UUID purchaseSessionId = plusTarifficatorMobileArguments.getPurchaseSessionId();
        PlusPayCompositeOffers.Offer offer = plusTarifficatorMobileArguments.getOffer();
        PlusTarifficatorPurchase.Status.NotFinished notFinished = PlusTarifficatorPurchase.Status.NotFinished.INSTANCE;
        PlusTarifficatorPurchase.Source source = PlusTarifficatorPurchase.Source.DEFAULT;
        PlusPayCompositeOffers.Offer offer2 = plusTarifficatorMobileArguments.getOffer();
        boolean z = false;
        boolean z2 = plusTarifficatorMobileArguments.getPreferredMode() == PlusTarifficatorMobileArguments.PreferredMode.SILENT;
        boolean z3 = tpd.b(offer2) == PlusPayCompositeOffers.Offer.Vendor.NATIVE;
        if (tpd.b(offer2) == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY && ((Boolean) slsVar2.invoke()).booleanValue()) {
            z = true;
        }
        jnd0Var.a.a = new ind0(purchaseSessionId, new PlusTarifficatorPurchase(offer, null, null, notFinished, source, (z2 && (z3 || z)) ? PlusTarifficatorPurchase.Type.SILENT : PlusTarifficatorPurchase.Type.DEFAULT, null), EmptyList.a, plusTarifficatorMobileArguments.getAnalyticsParams(), plusTarifficatorMobileArguments.getExternalCallerPayload());
        v1m0Var.b.b.put("SAVED_BUNDLE", new i550(3, this));
    }
}
