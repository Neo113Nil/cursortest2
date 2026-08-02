package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeUpsale;
import com.yandex.plus.pay.ui.api.feature.payment.PlusPaymentFlowErrorReason;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.PayUIEvgenAnalytics$PaymentOption;
import defpackage.be21;
import defpackage.dio;
import defpackage.dl01;
import defpackage.dod0;
import defpackage.eu90;
import defpackage.hod0;
import defpackage.ind0;
import defpackage.iod0;
import defpackage.jod0;
import defpackage.kod0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oe21;
import defpackage.opd0;
import defpackage.ppd0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xvz;
import defpackage.y0u0;
import defpackage.zr01;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.UpsaleViewModel$startUpsalePayment$1", f = "UpsaleViewModel.kt", l = {156, 159, 174}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UpsaleViewModel$startUpsalePayment$1 extends SuspendLambda implements wls {
    final /* synthetic */ oe21 $stateBeforePayment;
    final /* synthetic */ PlusPayCompositeUpsale $upsale;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpsaleViewModel$startUpsalePayment$1(b bVar, PlusPayCompositeUpsale plusPayCompositeUpsale, oe21 oe21Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$upsale = plusPayCompositeUpsale;
        this.$stateBeforePayment = oe21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpsaleViewModel$startUpsalePayment$1(this.this$0, this.$upsale, this.$stateBeforePayment, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpsaleViewModel$startUpsalePayment$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00e4, code lost:
    
        if (r5 == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0375, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00b2, code lost:
    
        if (r8 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ind0 a;
        Object W;
        Object a2;
        zy11 zy11Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ind0 a3 = this.this$0.c.a.a();
            a = ind0.a(a3, new PlusTarifficatorPurchase(this.$upsale.getOffer(), null, a3.b().getPaymentMethodId(), PlusTarifficatorPurchase.Status.NotFinished.INSTANCE, PlusTarifficatorPurchase.Source.UPSALE, PlusTarifficatorPurchase.Type.DEFAULT, this.$upsale.getInAppReplacementParams()), null, 29);
            b bVar = this.this$0;
            bVar.c.a.a = a;
            PlusPayCompositeUpsale plusPayCompositeUpsale = this.$upsale;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = a;
            this.label = 1;
            W = b.W(bVar, plusPayCompositeUpsale, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var2;
                }
                a = (ind0) this.L$3;
                kotlin.b.b(obj);
                a2 = obj;
                kod0 kod0Var = (kod0) a2;
                if (kod0Var instanceof jod0) {
                    b bVar2 = this.this$0;
                    bVar2.F = true;
                    opd0 opd0Var = bVar2.C;
                    PlusPayCompositeUpsale plusPayCompositeUpsale2 = this.$upsale;
                    ppd0 ppd0Var = (ppd0) opd0Var;
                    ppd0Var.getClass();
                    PlusTarifficatorPurchase c = a.c();
                    PayUIEvgenAnalytics$PaymentOption a4 = dio.a(c.getOffer());
                    String paymentMethodId = c.getPaymentMethodId();
                    if (a4 != null) {
                        eu90 eu90Var = ppd0Var.a;
                        String d = dio.d(a.a);
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer = c.getOffer().getTariffOffer();
                        String id = tariffOffer != null ? tariffOffer.getId() : null;
                        zy11Var = zy11Var2;
                        String str = id == null ? "no_value" : id;
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers = c.getOffer().getOptionOffers();
                        ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                        Iterator<T> it = optionOffers.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                        }
                        String str2 = paymentMethodId == null ? "no_value" : paymentMethodId;
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusPayCompositeUpsale2.getOffer().getTariffOffer();
                        String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                        String str3 = id2 == null ? "no_value" : id2;
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayCompositeUpsale2.getOffer().getOptionOffers();
                        String str4 = str3;
                        ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers2, 10));
                        Iterator<T> it2 = optionOffers2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                        }
                        boolean z = c.getType() == PlusTarifficatorPurchase.Type.SILENT;
                        LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", str);
                        xvz.A(t, "options_id", arrayList, true, "is_tarifficator");
                        xvz.x(a4, t, "payment_option", "payment_method_id", str2);
                        t.put("card_linked", String.valueOf(false));
                        t.put("upsale_product_id", str4);
                        t.put("upsale_options_id", arrayList2);
                        t.put("silent", String.valueOf(z));
                        t.put("_meta", eu90.c(new HashMap()));
                        eu90Var.f("Upsale.Success", t);
                    } else {
                        zy11Var = zy11Var2;
                    }
                    this.this$0.Y();
                    return zy11Var;
                }
                if (!(kod0Var instanceof iod0)) {
                    if (kod0Var instanceof hod0) {
                        this.this$0.I.l(this.$stateBeforePayment);
                        return zy11Var2;
                    }
                    w511.b();
                    return null;
                }
                opd0 opd0Var2 = this.this$0.C;
                PlusPayCompositeUpsale plusPayCompositeUpsale3 = this.$upsale;
                PlusPaymentFlowErrorReason plusPaymentFlowErrorReason = ((iod0) kod0Var).a;
                ppd0 ppd0Var2 = (ppd0) opd0Var2;
                ppd0Var2.getClass();
                PlusTarifficatorPurchase c2 = a.c();
                PayUIEvgenAnalytics$PaymentOption a5 = dio.a(c2.getOffer());
                String paymentMethodId2 = c2.getPaymentMethodId();
                if (a5 != null) {
                    eu90 eu90Var2 = ppd0Var2.a;
                    String d2 = dio.d(a.a);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer3 = c2.getOffer().getTariffOffer();
                    String id3 = tariffOffer3 != null ? tariffOffer3.getId() : null;
                    String str5 = id3 == null ? "no_value" : id3;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers3 = c2.getOffer().getOptionOffers();
                    ArrayList arrayList3 = new ArrayList(tcc.n(optionOffers3, 10));
                    Iterator<T> it3 = optionOffers3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                    }
                    String str6 = paymentMethodId2 == null ? "no_value" : paymentMethodId2;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer4 = plusPayCompositeUpsale3.getOffer().getTariffOffer();
                    String id4 = tariffOffer4 != null ? tariffOffer4.getId() : null;
                    if (id4 == null) {
                        id4 = "no_value";
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers4 = plusPayCompositeUpsale3.getOffer().getOptionOffers();
                    String str7 = id4;
                    ArrayList arrayList4 = new ArrayList(tcc.n(optionOffers4, 10));
                    Iterator<T> it4 = optionOffers4.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((PlusPayCompositeOffers.Offer.Option) it4.next()).getId());
                    }
                    String c3 = dio.c(plusPaymentFlowErrorReason);
                    boolean z2 = c2.getType() == PlusTarifficatorPurchase.Type.SILENT;
                    LinkedHashMap t2 = xvz.t(eu90Var2, "purchase_session_id", d2, "product_id", str5);
                    xvz.A(t2, "options_id", arrayList3, true, "is_tarifficator");
                    xvz.x(a5, t2, "payment_option", "payment_method_id", str6);
                    t2.put("card_linked", String.valueOf(false));
                    t2.put("upsale_product_id", str7);
                    t2.put("upsale_options_id", arrayList4);
                    t2.put("fail_reason", c3);
                    t2.put("silent", String.valueOf(z2));
                    t2.put("_meta", eu90.c(new HashMap()));
                    eu90Var2.f("Upsale.Fail", t2);
                }
                b bVar3 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 3;
                bVar3.H.b();
                ((y0u0) bVar3.B).a();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var2 == coroutineSingletons ? coroutineSingletons : zy11Var2;
            }
            a = (ind0) this.L$3;
            kotlin.b.b(obj);
            W = obj;
        }
        be21 be21Var = (be21) W;
        b.X(this.this$0, be21Var);
        b bVar4 = this.this$0;
        dod0 dod0Var = bVar4.w;
        dl01 dl01Var = new dl01(21, bVar4, this.$upsale);
        zr01 zr01Var = new zr01(18, bVar4, be21Var);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = a;
        this.L$4 = null;
        this.label = 2;
        a2 = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.b) dod0Var).a(a, dl01Var, zr01Var, this);
    }
}
