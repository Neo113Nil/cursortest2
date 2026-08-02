package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.g8e;
import defpackage.gio;
import defpackage.mvg;
import defpackage.nfd0;
import defpackage.ny61;
import defpackage.pqx0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment.Confirmation3dsAnalyticsController$onNon3dsState$1$1", f = "Confirmation3dsAnalyticsController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Confirmation3dsAnalyticsController$onNon3dsState$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ PlusPayCompositeOffers.Offer $offer;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Confirmation3dsAnalyticsController$onNon3dsState$1$1(a aVar, PlusPayCompositeOffers.Offer offer, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$offer = offer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Confirmation3dsAnalyticsController$onNon3dsState$1$1(this.this$0, this.$offer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Confirmation3dsAnalyticsController$onNon3dsState$1$1 confirmation3dsAnalyticsController$onNon3dsState$1$1 = (Confirmation3dsAnalyticsController$onNon3dsState$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        confirmation3dsAnalyticsController$onNon3dsState$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        nfd0 nfd0Var = this.this$0.b;
        PlusPayCompositeOffers.Offer offer = this.$offer;
        gio gioVar = ((pqx0) nfd0Var).a;
        String sessionId = offer.getMeta().getSessionId();
        gioVar.getClass();
        LinkedHashMap x = g8e.x("session_id", sessionId);
        x.put("_meta", gio.a(new HashMap()));
        gioVar.e("PlusPayment.Step.Payment3DS.Stop", x);
        return zy11.a;
    }
}
