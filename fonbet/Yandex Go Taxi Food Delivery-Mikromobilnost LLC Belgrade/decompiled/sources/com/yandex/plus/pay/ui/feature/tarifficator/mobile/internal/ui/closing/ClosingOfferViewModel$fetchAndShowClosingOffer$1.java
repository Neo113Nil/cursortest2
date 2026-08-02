package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.PayUIEvgenAnalytics$PaymentOption;
import defpackage.b5t;
import defpackage.dio;
import defpackage.eu90;
import defpackage.g7c;
import defpackage.h7c;
import defpackage.i6c;
import defpackage.i7c;
import defpackage.ind0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tcc;
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
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferViewModel$fetchAndShowClosingOffer$1", f = "ClosingOfferViewModel.kt", l = {HProv.PROV_GOST_2001_DH, HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ClosingOfferViewModel$fetchAndShowClosingOffer$1 extends SuspendLambda implements wls {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClosingOfferViewModel$fetchAndShowClosingOffer$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ClosingOfferViewModel$fetchAndShowClosingOffer$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ClosingOfferViewModel$fetchAndShowClosingOffer$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0059, code lost:
    
        if (r1 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ind0 a;
        Object a2;
        PlusPayClosingOffer plusPayClosingOffer;
        ind0 ind0Var;
        a aVar;
        pz40 pz40Var;
        PayUIEvgenAnalytics$PaymentOption a3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            r0 r0Var = this.this$0.B;
            r0Var.getClass();
            r0Var.m(null, i7c.a);
            a = this.this$0.x.a.a();
            b5t b5tVar = this.this$0.y;
            this.L$0 = a;
            this.label = 1;
            a2 = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.a) b5tVar).a(a, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pz40Var = (pz40) this.L$3;
                plusPayClosingOffer = (PlusPayClosingOffer) this.L$2;
                aVar = (a) this.L$1;
                ind0Var = (ind0) this.L$0;
                b.b(obj);
                h7c h7cVar = new h7c((i6c) obj);
                r0 r0Var2 = (r0) pz40Var;
                r0Var2.getClass();
                r0Var2.m(null, h7cVar);
                g7c g7cVar = (g7c) aVar.z;
                g7cVar.getClass();
                PlusTarifficatorPurchase c = ind0Var.c();
                a3 = dio.a(c.getOffer());
                if (a3 != null) {
                    eu90 eu90Var = g7cVar.a;
                    String d = dio.d(ind0Var.a);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = c.getOffer().getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    if (id == null) {
                        id = "no_value";
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = c.getOffer().getOptionOffers();
                    ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                    Iterator<T> it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    String paymentMethodId = c.getPaymentMethodId();
                    if (paymentMethodId == null) {
                        paymentMethodId = "no_value";
                    }
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusPayClosingOffer.getOffer().getTariffOffer();
                    String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                    String str = id2 != null ? id2 : "no_value";
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayClosingOffer.getOffer().getOptionOffers();
                    ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers2, 10));
                    Iterator<T> it2 = optionOffers2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                    }
                    eu90Var.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    xvz.x(a3, linkedHashMap, "payment_option", "payment_method_id", paymentMethodId);
                    linkedHashMap.put("purchase_session_id", d);
                    linkedHashMap.put("product_id", id);
                    linkedHashMap.put("options_id", arrayList);
                    linkedHashMap.put("closing_offer_product_id", str);
                    linkedHashMap.put("closing_offer_options_id", arrayList2);
                    linkedHashMap.put("_meta", eu90.c(new HashMap()));
                    eu90Var.f("ClosingOffer.Shown", linkedHashMap);
                    g7cVar.b.a(plusPayClosingOffer.getOffer(), 0, "closing_offer", "checkout_closing_offer_page", null, kotlin.collections.b.f());
                }
                return zy11.a;
            }
            ind0 ind0Var2 = (ind0) this.L$0;
            b.b(obj);
            a2 = obj;
            a = ind0Var2;
        }
        plusPayClosingOffer = (PlusPayClosingOffer) a2;
        a aVar2 = this.this$0;
        if (plusPayClosingOffer == null) {
            aVar2.b.a();
            return zy11.a;
        }
        aVar2.A = plusPayClosingOffer;
        r0 r0Var3 = aVar2.B;
        this.L$0 = a;
        this.L$1 = aVar2;
        this.L$2 = plusPayClosingOffer;
        this.L$3 = r0Var3;
        this.I$0 = 0;
        this.label = 2;
        Object W = a.W(aVar2, plusPayClosingOffer, this);
        if (W != coroutineSingletons) {
            ind0 ind0Var3 = a;
            obj = W;
            ind0Var = ind0Var3;
            aVar = aVar2;
            pz40Var = r0Var3;
            h7c h7cVar2 = new h7c((i6c) obj);
            r0 r0Var22 = (r0) pz40Var;
            r0Var22.getClass();
            r0Var22.m(null, h7cVar2);
            g7c g7cVar2 = (g7c) aVar.z;
            g7cVar2.getClass();
            PlusTarifficatorPurchase c2 = ind0Var.c();
            a3 = dio.a(c2.getOffer());
            if (a3 != null) {
            }
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
