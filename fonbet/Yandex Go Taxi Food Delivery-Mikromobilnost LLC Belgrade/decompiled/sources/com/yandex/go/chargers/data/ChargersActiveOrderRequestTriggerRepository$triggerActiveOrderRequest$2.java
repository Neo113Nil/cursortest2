package com.yandex.go.chargers.data;

import defpackage.gci0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rl9;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrl9;", "<anonymous>", "(Ltse;)Lrl9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.data.ChargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$2", f = "ChargersActiveOrderRequestTriggerRepository.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$2 extends SuspendLambda implements wls {
    final /* synthetic */ rl9 $current;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrl9;", "it", "", "<anonymous>", "(Lrl9;)Z"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.chargers.data.ChargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$2$1", f = "ChargersActiveOrderRequestTriggerRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.chargers.data.ChargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ rl9 $current;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(rl9 rl9Var, Continuation continuation) {
            super(2, continuation);
            this.$current = rl9Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$current, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((rl9) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            rl9 rl9Var = (rl9) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(!jl40.l(rl9Var, this.$current));
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$2(a aVar, rl9 rl9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$current = rl9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$2(this.this$0, this.$current, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersActiveOrderRequestTriggerRepository$triggerActiveOrderRequest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        gci0 d = kotlinx.coroutines.flow.e.d(this.this$0.a.d);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$current, null);
        this.label = 1;
        Object x = kotlinx.coroutines.flow.e.x(d, anonymousClass1, this);
        return x == coroutineSingletons ? coroutineSingletons : x;
    }
}
