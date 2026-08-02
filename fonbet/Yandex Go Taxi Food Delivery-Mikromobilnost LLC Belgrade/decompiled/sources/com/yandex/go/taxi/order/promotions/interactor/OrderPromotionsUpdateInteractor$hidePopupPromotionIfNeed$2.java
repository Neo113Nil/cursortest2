package com.yandex.go.taxi.order.promotions.interactor;

import defpackage.a4y0;
import defpackage.d4y0;
import defpackage.e4y0;
import defpackage.f4y0;
import defpackage.g4y0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.usc;
import defpackage.v4r0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$CloseReason;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$ModalType;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$RideOpenReason;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrsn;", "", "Lg4y0;", "emitHolder", "Lzy11;", "<anonymous>", "(Lrsn;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promotions.interactor.OrderPromotionsUpdateInteractor$hidePopupPromotionIfNeed$2", f = "OrderPromotionsUpdateInteractor.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPromotionsUpdateInteractor$hidePopupPromotionIfNeed$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPromotionsUpdateInteractor$hidePopupPromotionIfNeed$2(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderPromotionsUpdateInteractor$hidePopupPromotionIfNeed$2 orderPromotionsUpdateInteractor$hidePopupPromotionIfNeed$2 = new OrderPromotionsUpdateInteractor$hidePopupPromotionIfNeed$2(this.this$0, continuation);
        orderPromotionsUpdateInteractor$hidePopupPromotionIfNeed$2.L$0 = obj;
        return orderPromotionsUpdateInteractor$hidePopupPromotionIfNeed$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPromotionsUpdateInteractor$hidePopupPromotionIfNeed$2) create((rsn) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        usc uscVar;
        CommunicationModalAnalyticsData$ModalType communicationModalAnalyticsData$ModalType;
        rsn rsnVar = (rsn) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            Set set = (Set) rsnVar.b;
            Set set2 = (Set) rsnVar.a;
            if (set2 != null) {
                Set g = v4r0.g(set2, set);
                a4y0 a4y0Var = (a4y0) this.this$0.a.a.getValue();
                if (a4y0Var != null) {
                    Iterator it = g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        g4y0 g4y0Var = (g4y0) obj2;
                        if (jl40.l(g4y0Var.b(), a4y0Var.b) && jl40.l(g4y0Var.a(), a4y0Var.a)) {
                            break;
                        }
                    }
                    g4y0 g4y0Var2 = (g4y0) obj2;
                    if (g4y0Var2 != null) {
                        String b = g4y0Var2.b();
                        this.this$0.getClass();
                        if (g4y0Var2 instanceof d4y0) {
                            communicationModalAnalyticsData$ModalType = CommunicationModalAnalyticsData$ModalType.DEFAULT;
                        } else if (g4y0Var2 instanceof e4y0) {
                            communicationModalAnalyticsData$ModalType = CommunicationModalAnalyticsData$ModalType.SHARE_ORDER;
                        } else {
                            if (!(g4y0Var2 instanceof f4y0)) {
                                w511.b();
                                return null;
                            }
                            communicationModalAnalyticsData$ModalType = CommunicationModalAnalyticsData$ModalType.ROBOTAXI;
                        }
                        uscVar = new usc(b, communicationModalAnalyticsData$ModalType, g4y0Var2.a(), CommunicationModalAnalyticsData$RideOpenReason.AUTOMATIC);
                        this.this$0.a.a.l(null);
                        n0 n0Var = this.this$0.a.b;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = uscVar;
                        this.label = 1;
                        if (n0Var.emit(zy11Var, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
            }
            return zy11Var;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uscVar = (usc) this.L$6;
        kotlin.b.b(obj);
        this.this$0.f.b(uscVar, CommunicationModalAnalyticsData$CloseReason.TIMEOUT);
        return zy11Var;
    }
}
