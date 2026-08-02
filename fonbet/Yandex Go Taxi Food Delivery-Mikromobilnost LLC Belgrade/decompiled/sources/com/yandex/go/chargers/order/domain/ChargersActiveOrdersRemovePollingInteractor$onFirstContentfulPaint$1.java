package com.yandex.go.chargers.order.domain;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersRemovePollingInteractor$onFirstContentfulPaint$1", f = "ChargersActiveOrdersRemovePollingInteractor.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ChargersActiveOrdersRemovePollingInteractor$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersRemovePollingInteractor$onFirstContentfulPaint$1$1", f = "ChargersActiveOrdersRemovePollingInteractor.kt", l = {43}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.chargers.order.domain.ChargersActiveOrdersRemovePollingInteractor$onFirstContentfulPaint$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        int label;
        final /* synthetic */ d this$0;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersRemovePollingInteractor$onFirstContentfulPaint$1$1$1", f = "ChargersActiveOrdersRemovePollingInteractor.kt", l = {44}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.chargers.order.domain.ChargersActiveOrdersRemovePollingInteractor$onFirstContentfulPaint$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00491 extends SuspendLambda implements tls {
            int label;
            final /* synthetic */ d this$0;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
            @mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersRemovePollingInteractor$onFirstContentfulPaint$1$1$1$1", f = "ChargersActiveOrdersRemovePollingInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.yandex.go.chargers.order.domain.ChargersActiveOrdersRemovePollingInteractor$onFirstContentfulPaint$1$1$1$1, reason: invalid class name and collision with other inner class name */
            final class C00501 extends SuspendLambda implements wls {
                int label;
                final /* synthetic */ d this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00501(d dVar, Continuation continuation) {
                    super(2, continuation);
                    this.this$0 = dVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C00501(this.this$0, continuation);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    C00501 c00501 = (C00501) create((tse) obj, (Continuation) obj2);
                    zy11 zy11Var = zy11.a;
                    c00501.invokeSuspend(zy11Var);
                    return zy11Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    d dVar = this.this$0;
                    tje.N(dVar.b, null, null, new ChargersActiveOrdersRemovePollingInteractor$listenRemoveActiveOrders$1(dVar, null), 3);
                    return zy11.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00491(d dVar, Continuation continuation) {
                super(1, continuation);
                this.this$0 = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C00491(this.this$0, continuation);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return ((C00491) create((Continuation) obj)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    d dVar = this.this$0;
                    Lifecycle lifecycle = dVar.a;
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    C00501 c00501 = new C00501(dVar, null);
                    this.label = 1;
                    if (b0.b(lifecycle, state, c00501, this) == coroutineSingletons) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Continuation continuation) {
            super(1, continuation);
            this.this$0 = dVar;
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
            if (i == 0) {
                kotlin.b.b(obj);
                d dVar = this.this$0;
                C00491 c00491 = new C00491(dVar, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(kotlinx.coroutines.flow.e.t(dVar.f.c()), new ChargersActiveOrdersRemovePollingInteractor$onAuthorized$2(c00491, null), this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrdersRemovePollingInteractor$onFirstContentfulPaint$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersActiveOrdersRemovePollingInteractor$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersActiveOrdersRemovePollingInteractor$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(vng.l(ru.yandex.taxi.experiments.d.b(dVar.e), ChargersActiveOrdersRemovePollingInteractor$onExperimentAvailable$2.b, vng.c), new ChargersActiveOrdersRemovePollingInteractor$onExperimentAvailable$3(anonymousClass1, null), this) == coroutineSingletons) {
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
