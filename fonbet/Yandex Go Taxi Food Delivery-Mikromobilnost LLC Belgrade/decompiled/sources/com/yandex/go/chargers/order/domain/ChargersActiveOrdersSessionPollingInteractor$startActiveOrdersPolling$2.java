package com.yandex.go.chargers.order.domain;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersSessionPollingInteractor$startActiveOrdersPolling$2", f = "ChargersActiveOrdersSessionPollingInteractor.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrdersSessionPollingInteractor$startActiveOrdersPolling$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersSessionPollingInteractor$startActiveOrdersPolling$2$1", f = "ChargersActiveOrdersSessionPollingInteractor.kt", l = {61}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.chargers.order.domain.ChargersActiveOrdersSessionPollingInteractor$startActiveOrdersPolling$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        int label;
        final /* synthetic */ f this$0;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersSessionPollingInteractor$startActiveOrdersPolling$2$1$1", f = "ChargersActiveOrdersSessionPollingInteractor.kt", l = {62}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.chargers.order.domain.ChargersActiveOrdersSessionPollingInteractor$startActiveOrdersPolling$2$1$1, reason: invalid class name and collision with other inner class name */
        final class C00511 extends SuspendLambda implements tls {
            int label;
            final /* synthetic */ f this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00511(f fVar, Continuation continuation) {
                super(1, continuation);
                this.this$0 = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C00511(this.this$0, continuation);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return ((C00511) create((Continuation) obj)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    a aVar = this.this$0.d;
                    this.label = 1;
                    aVar.a.getClass();
                    sjh sjhVar = uyj.a;
                    Object k0 = tje.k0(mdh.b, new ChargersActiveOrdersInteractor$pollActiveOrders$2(aVar, null), this);
                    if (k0 != coroutineSingletons) {
                        k0 = zy11Var;
                    }
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, Continuation continuation) {
            super(1, continuation);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            f fVar = this.this$0;
            C00511 c00511 = new C00511(fVar, null);
            this.label = 1;
            return kotlinx.coroutines.flow.e.k(com.yandex.go.coroutines.b.d(((com.yandex.go.chargers.data.a) fVar.g.get()).c, new ChargersActiveOrdersSessionPollingInteractor$onRequestTrigger$$inlined$start$1(zy11Var, null)), new ChargersActiveOrdersSessionPollingInteractor$onRequestTrigger$2(c00511, null), this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrdersSessionPollingInteractor$startActiveOrdersPolling$2(f fVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ChargersActiveOrdersSessionPollingInteractor$startActiveOrdersPolling$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ChargersActiveOrdersSessionPollingInteractor$startActiveOrdersPolling$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(fVar, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(kotlinx.coroutines.flow.e.t(fVar.c.c()), new ChargersActiveOrdersSessionPollingInteractor$onAuthorized$2(anonymousClass1, null), this) == coroutineSingletons) {
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
