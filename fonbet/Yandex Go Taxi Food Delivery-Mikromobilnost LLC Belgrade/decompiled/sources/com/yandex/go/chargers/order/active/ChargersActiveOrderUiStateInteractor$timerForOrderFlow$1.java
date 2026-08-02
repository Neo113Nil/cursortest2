package com.yandex.go.chargers.order.active;

import defpackage.hl9;
import defpackage.il9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.z8y;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.active.ChargersActiveOrderUiStateInteractor$timerForOrderFlow$1", f = "ChargersActiveOrderUiStateInteractor.kt", l = {152}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrderUiStateInteractor$timerForOrderFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $orderFlow;
    final /* synthetic */ String $orderId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ il9 this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz8y;", "order", "", "remainingMs", "Lhl9;", "<anonymous>", "(Lz8y;J)Lhl9;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.chargers.order.active.ChargersActiveOrderUiStateInteractor$timerForOrderFlow$1$1", f = "ChargersActiveOrderUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.chargers.order.active.ChargersActiveOrderUiStateInteractor$timerForOrderFlow$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (z8y) obj;
            anonymousClass1.L$1 = (Long) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            z8y z8yVar = (z8y) this.L$0;
            Long l = (Long) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new hl9(z8yVar, l);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrderUiStateInteractor$timerForOrderFlow$1(tpr tprVar, il9 il9Var, String str, Continuation continuation) {
        super(2, continuation);
        this.$orderFlow = tprVar;
        this.this$0 = il9Var;
        this.$orderId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersActiveOrderUiStateInteractor$timerForOrderFlow$1 chargersActiveOrderUiStateInteractor$timerForOrderFlow$1 = new ChargersActiveOrderUiStateInteractor$timerForOrderFlow$1(this.$orderFlow, this.this$0, this.$orderId, continuation);
        chargersActiveOrderUiStateInteractor$timerForOrderFlow$1.L$0 = obj;
        return chargersActiveOrderUiStateInteractor$timerForOrderFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersActiveOrderUiStateInteractor$timerForOrderFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$orderFlow;
            com.yandex.go.chargers.data.j jVar = this.this$0.i;
            tpr t = kotlinx.coroutines.flow.e.t(new m0(tprVar, kotlinx.coroutines.flow.e.t(new com.yandex.go.chargers.data.i(jVar.b, this.$orderId)), new AnonymousClass1(3, null)));
            a0 a0Var = new a0(vprVar, this.this$0, this.$orderId);
            this.L$0 = null;
            this.label = 1;
            if (t.collect(a0Var, this) == coroutineSingletons) {
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
