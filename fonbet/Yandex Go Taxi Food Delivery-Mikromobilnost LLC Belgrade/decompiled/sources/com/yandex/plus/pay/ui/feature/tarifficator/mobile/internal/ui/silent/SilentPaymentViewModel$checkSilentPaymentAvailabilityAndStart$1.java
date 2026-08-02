package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.PayUIEvgenAnalytics$PaymentOption;
import defpackage.PayUIEvgenAnalytics$SourceType;
import defpackage.dio;
import defpackage.ds31;
import defpackage.eu90;
import defpackage.ftb;
import defpackage.g8e;
import defpackage.gpd0;
import defpackage.hpd0;
import defpackage.ind0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p2d0;
import defpackage.pcs0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xvz;
import defpackage.xz4;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.SilentPaymentViewModel$checkSilentPaymentAvailabilityAndStart$1", f = "SilentPaymentViewModel.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SilentPaymentViewModel$checkSilentPaymentAvailabilityAndStart$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SilentPaymentViewModel$checkSilentPaymentAvailabilityAndStart$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SilentPaymentViewModel$checkSilentPaymentAvailabilityAndStart$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SilentPaymentViewModel$checkSilentPaymentAvailabilityAndStart$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        ind0 ind0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r0 r0Var = this.this$0.E;
            r0Var.getClass();
            r0Var.m(null, pcs0.a);
            ind0 a2 = this.this$0.b.a.a();
            p2d0 p2d0Var = this.this$0.c;
            PlusPayCompositeOffers.Offer offer = a2.b.getOffer();
            this.L$0 = a2;
            this.label = 1;
            a = p2d0Var.a(offer, null, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            ind0Var = a2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ind0Var = (ind0) this.L$0;
            kotlin.b.b(obj);
            a = obj;
        }
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = (PlusPayCompositeOfferDetails) a;
        b bVar = this.this$0;
        if (plusPayCompositeOfferDetails != null) {
            Boolean isSilentInvoiceAvailable = plusPayCompositeOfferDetails.isSilentInvoiceAvailable();
            gpd0 gpd0Var = bVar.C;
            ftb ftbVar = bVar.A;
            boolean l = jl40.l(isSilentInvoiceAvailable, Boolean.TRUE);
            hpd0 hpd0Var = (hpd0) gpd0Var;
            hpd0Var.getClass();
            PlusTarifficatorPurchase plusTarifficatorPurchase = ind0Var.b;
            xz4 b = dio.b(plusTarifficatorPurchase.getSource(), ind0Var.d);
            PayUIEvgenAnalytics$PaymentOption a3 = dio.a(plusTarifficatorPurchase.getOffer());
            String paymentMethodId = plusTarifficatorPurchase.getPaymentMethodId();
            if (a3 != null) {
                eu90 eu90Var = hpd0Var.a;
                String d = dio.d(ind0Var.a);
                PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
                String id = tariffOffer != null ? tariffOffer.getId() : null;
                if (id == null) {
                    id = "no_value";
                }
                List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase.getOffer().getOptionOffers();
                ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                Iterator<T> it = optionOffers.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                }
                if (paymentMethodId == null) {
                    paymentMethodId = "no_value";
                }
                String str = (String) b.a;
                if (str == null) {
                    str = "no_value";
                }
                String str2 = (String) b.b;
                String str3 = str2 != null ? str2 : "no_value";
                PayUIEvgenAnalytics$SourceType e = dio.e(plusTarifficatorPurchase.getSource());
                eu90Var.getClass();
                LinkedHashMap y = g8e.y("purchase_session_id", d, "product_id", id);
                xvz.A(y, "options_id", arrayList, true, "is_tarifficator");
                xvz.x(a3, y, "payment_option", "payment_method_id", paymentMethodId);
                y.put(Constants.KEY_PAGE, str3);
                y.put("place", str);
                y.put("source_type", e.getEventValue());
                y.put("isSilentAvailable", String.valueOf(l));
                y.put("_meta", eu90.c(new HashMap()));
                eu90Var.f("PaymentProcess.SilentRequested", y);
            }
            if (isSilentInvoiceAvailable == null) {
                bVar.X(true);
                ftbVar.b();
            } else if (isSilentInvoiceAvailable.booleanValue()) {
                tje.N(ds31.a(bVar), null, null, new SilentPaymentViewModel$startSilentPayment$1(bVar, null), 3);
            } else {
                bVar.X(true);
                ftbVar.b();
            }
        } else {
            bVar.X(true);
            bVar.A.b();
        }
        return zy11.a;
    }
}
