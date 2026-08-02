package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeUpsale;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.PayUIEvgenAnalytics$PaymentOption;
import defpackage.agd0;
import defpackage.be21;
import defpackage.dio;
import defpackage.eu90;
import defpackage.frx0;
import defpackage.fu90;
import defpackage.g8e;
import defpackage.gio;
import defpackage.ind0;
import defpackage.le21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ond0;
import defpackage.ppd0;
import defpackage.pz40;
import defpackage.rpd0;
import defpackage.tcc;
import defpackage.tpd;
import defpackage.tse;
import defpackage.wls;
import defpackage.xvz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.UpsaleViewModel$setContentState$1", f = "UpsaleViewModel.kt", l = {HProv.PP_PASSWD_TERM, HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UpsaleViewModel$setContentState$1 extends SuspendLambda implements wls {
    final /* synthetic */ PlusTarifficatorPurchase $lastPurchase;
    final /* synthetic */ ind0 $scenarioContext;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpsaleViewModel$setContentState$1(b bVar, PlusTarifficatorPurchase plusTarifficatorPurchase, ind0 ind0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$lastPurchase = plusTarifficatorPurchase;
        this.$scenarioContext = ind0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpsaleViewModel$setContentState$1(this.this$0, this.$lastPurchase, this.$scenarioContext, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpsaleViewModel$setContentState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons;
        PlusPayCompositeUpsale plusPayCompositeUpsale;
        int i;
        pz40 pz40Var;
        Object W;
        PlusPayRichText fromLegalInfo;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            ond0 ond0Var = this.this$0.b;
            PlusPayCompositeOffers.Offer offer = this.$lastPurchase.getOffer();
            this.label = 1;
            a = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.a) ond0Var).a(offer, this);
            if (a == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pz40Var = (pz40) this.L$1;
                kotlin.b.b(obj);
                W = obj;
                le21 le21Var = new le21((be21) W);
                r0 r0Var = (r0) pz40Var;
                r0Var.getClass();
                r0Var.m(null, le21Var);
                return zy11.a;
            }
            kotlin.b.b(obj);
            a = obj;
        }
        PlusPayCompositeUpsale plusPayCompositeUpsale2 = (PlusPayCompositeUpsale) a;
        b bVar = this.this$0;
        if (plusPayCompositeUpsale2 != null) {
            PlusTarifficatorPurchase plusTarifficatorPurchase = this.$lastPurchase;
            ind0 ind0Var = this.$scenarioContext;
            bVar.G = plusPayCompositeUpsale2;
            if (tpd.b(plusPayCompositeUpsale2.getOffer()) == PlusPayCompositeOffers.Offer.Vendor.NATIVE && plusTarifficatorPurchase.getPaymentMethodId() == null) {
                rpd0 rpd0Var = (rpd0) bVar.D;
                rpd0Var.getClass();
                boolean z = ind0Var.c().getType() == PlusTarifficatorPurchase.Type.SILENT;
                fu90 fu90Var = rpd0Var.a;
                fu90Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("silent", String.valueOf(z));
                linkedHashMap.put("_meta", fu90.c(new HashMap()));
                fu90Var.d("Error.Upsale.NullPaymentMethodId", linkedHashMap);
                bVar.Y();
            } else {
                ppd0 ppd0Var = (ppd0) bVar.C;
                ppd0Var.getClass();
                PlusTarifficatorPurchase c = ind0Var.c();
                PayUIEvgenAnalytics$PaymentOption a2 = dio.a(c.getOffer());
                String paymentMethodId = c.getPaymentMethodId();
                if (a2 != null) {
                    eu90 eu90Var = ppd0Var.a;
                    String d = dio.d(ind0Var.a);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = c.getOffer().getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    String str = id == null ? "no_value" : id;
                    i = 0;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = c.getOffer().getOptionOffers();
                    ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                    Iterator<T> it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    if (paymentMethodId == null) {
                        paymentMethodId = "no_value";
                    }
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusPayCompositeUpsale2.getOffer().getTariffOffer();
                    String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                    if (id2 == null) {
                        id2 = "no_value";
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayCompositeUpsale2.getOffer().getOptionOffers();
                    coroutineSingletons = coroutineSingletons2;
                    ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers2, 10));
                    Iterator<T> it2 = optionOffers2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                    }
                    boolean z2 = c.getType() == PlusTarifficatorPurchase.Type.SILENT;
                    PlusPayLegalInfo legalInfo = plusPayCompositeUpsale2.getOffer().getLegalInfo();
                    boolean z3 = z2;
                    String c2 = (legalInfo == null || (fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo)) == null) ? null : com.yandex.plus.pay.ui.common.api.utils.a.c(fromLegalInfo);
                    if (c2 == null) {
                        c2 = "no_value";
                    }
                    plusPayCompositeUpsale = plusPayCompositeUpsale2;
                    LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", str);
                    xvz.A(t, "options_id", arrayList, true, "is_tarifficator");
                    xvz.x(a2, t, "payment_option", "payment_method_id", paymentMethodId);
                    t.put("card_linked", String.valueOf(false));
                    t.put("upsale_product_id", id2);
                    t.put("upsale_options_id", arrayList2);
                    t.put("upsale_legal_text", c2);
                    t.put("silent", String.valueOf(z3));
                    t.put("_meta", eu90.c(new HashMap()));
                    eu90Var.f("Upsale.Shown", t);
                } else {
                    coroutineSingletons = coroutineSingletons2;
                    plusPayCompositeUpsale = plusPayCompositeUpsale2;
                    i = 0;
                }
                agd0 agd0Var = ppd0Var.b;
                PlusPayCompositeOffers.Offer offer2 = plusPayCompositeUpsale.getOffer();
                gio gioVar = ((frx0) agd0Var).a;
                String sessionId = offer2.getMeta().getSessionId();
                gioVar.getClass();
                LinkedHashMap x = g8e.x("session_id", sessionId);
                x.put("_meta", gio.a(new HashMap()));
                gioVar.e("PlusPayment.Step.Upsale.Start", x);
                ppd0Var.c.a(plusPayCompositeUpsale.getOffer(), 0, "upsale_offer", "checkout_upsale_page", null, kotlin.collections.b.f());
                pz40Var = bVar.I;
                this.L$0 = null;
                this.L$1 = pz40Var;
                this.I$0 = i;
                this.label = 2;
                W = b.W(bVar, plusPayCompositeUpsale, this);
                CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                if (W == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                le21 le21Var2 = new le21((be21) W);
                r0 r0Var2 = (r0) pz40Var;
                r0Var2.getClass();
                r0Var2.m(null, le21Var2);
            }
        } else {
            bVar.Y();
        }
        return zy11.a;
    }
}
