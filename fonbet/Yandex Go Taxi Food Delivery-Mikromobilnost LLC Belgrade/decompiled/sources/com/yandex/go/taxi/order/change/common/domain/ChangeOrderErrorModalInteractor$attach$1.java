package com.yandex.go.taxi.order.change.common.domain;

import com.yandex.go.taxi.order.models.api.ChangeOrderState$Failure;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Success;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Unavailable;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$DefaultItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$RobotaxiItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$ShareOrderItem;
import com.yandex.go.taxi.order.models.api.response.ModalItemDto$StepsInstructionsItem;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.u0;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.hxx;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jsq0;
import defpackage.m480;
import defpackage.m950;
import defpackage.mth;
import defpackage.mvg;
import defpackage.n20;
import defpackage.n8e0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pep0;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tse;
import defpackage.usc;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$ModalType;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$RideOpenReason;
import ru.yandex.taxi.communications.model.CommunicationItem;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.common.domain.ChangeOrderErrorModalInteractor$attach$1", f = "ChangeOrderErrorModalInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeOrderErrorModalInteractor$attach$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "orderHolder", "Lkotlin/Pair;", "Lo2y0;", "", "Lcom/yandex/go/taxi/order/models/api/e;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.change.common.domain.ChangeOrderErrorModalInteractor$attach$1$3", f = "ChangeOrderErrorModalInteractor.kt", l = {45}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.change.common.domain.ChangeOrderErrorModalInteractor$attach$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((TaxiOrder) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Object obj2 = null;
            if (i == 0) {
                kotlin.b.b(obj);
                n20 n20Var = this.this$0.b;
                this.L$0 = taxiOrder;
                this.label = 1;
                obj = ((com.yandex.go.taxi.order.provider.a) n20Var).k(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            Iterator it = ((Iterable) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((o2y0) next).b().a, taxiOrder.a)) {
                    obj2 = next;
                    break;
                }
            }
            return new Pair(obj2, taxiOrder.i.e());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "Lo2y0;", "", "Lcom/yandex/go/taxi/order/models/api/e;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.change.common.domain.ChangeOrderErrorModalInteractor$attach$1$4", f = "ChangeOrderErrorModalInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.change.common.domain.ChangeOrderErrorModalInteractor$attach$1$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass4 anonymousClass4 = (AnonymousClass4) create((Pair) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass4.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            TaxiOrder taxiOrder;
            Object obj2;
            Pair pair = (Pair) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            o2y0 o2y0Var = (o2y0) pair.getFirst();
            List<com.yandex.go.taxi.order.models.api.e> list = (List) pair.getSecond();
            if (o2y0Var != null) {
                c cVar = this.this$0;
                cVar.getClass();
                for (com.yandex.go.taxi.order.models.api.e eVar : list) {
                    if ((eVar instanceof ChangeOrderState$Failure) || (eVar instanceof ChangeOrderState$Unavailable)) {
                        TaxiOrder b = o2y0Var.b();
                        OrderStatusInfo.ModalsContent modalsContent = b.V().s0;
                        if (modalsContent != null) {
                            List list2 = modalsContent.a;
                            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((OrderStatusInfo.Modal) it.next()).a);
                            }
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it2.next();
                                jsq0 c = ((u0) obj2).getC();
                                if (c != null && c.contains(CommunicationItem.DisplayOnType.CHANGE_ORDER_UNIVERSAL_ERROR_CUSTOM)) {
                                    break;
                                }
                            }
                            u0 u0Var = (u0) obj2;
                            if (u0Var instanceof ModalItemDto$DefaultItem) {
                                ModalItemDto$DefaultItem modalItemDto$DefaultItem = (ModalItemDto$DefaultItem) u0Var;
                                String str = b.a;
                                n8e0 i = cVar.c.i(modalItemDto$DefaultItem, modalItemDto$DefaultItem.d);
                                if (i != null) {
                                    ((pep0) cVar.e).f((m950) cVar.d.get(), new m480(i, new usc(modalItemDto$DefaultItem.a, CommunicationModalAnalyticsData$ModalType.DEFAULT, str, CommunicationModalAnalyticsData$RideOpenReason.CHANGE_ORDER_ERROR)), hxx.a);
                                }
                            } else if (!(u0Var instanceof ModalItemDto$RobotaxiItem) && !(u0Var instanceof ModalItemDto$ShareOrderItem) && !(u0Var instanceof ModalItemDto$StepsInstructionsItem) && u0Var != null) {
                                w511.b();
                                return null;
                            }
                        }
                        r0 r0Var = o2y0Var.a;
                        do {
                            value = r0Var.getValue();
                            taxiOrder = (TaxiOrder) value;
                            taxiOrder.L(eVar);
                        } while (!r0Var.k(value, taxiOrder));
                        o2y0Var.f();
                    } else if (!(eVar instanceof ChangeOrderState$Success) && !(eVar instanceof ChangeOrderState$Pending)) {
                        w511.b();
                        return null;
                    }
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeOrderErrorModalInteractor$attach$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeOrderErrorModalInteractor$attach$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeOrderErrorModalInteractor$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(new mth(((com.yandex.go.taxi.order.provider.a) this.this$0.b).v(), 6), new ChangeOrderErrorModalInteractor$attach$1$invokeSuspend$$inlined$flatMapLatest$1(3, null));
            c cVar = this.this$0;
            jqr jqrVar = new jqr(kotlinx.coroutines.flow.e.I(new b(X, cVar), new AnonymousClass3(cVar, null)), new AnonymousClass4(this.this$0, null), 3);
            this.this$0.a.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(jqrVar, uyj.a);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.j(F, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
