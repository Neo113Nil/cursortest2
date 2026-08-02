package com.yandex.go.scooters.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.p2m0;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersStateInteractor$onAppResumed$1", f = "ScootersStateInteractor.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ScootersStateInteractor$onAppResumed$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a0 this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.domain.ScootersStateInteractor$onAppResumed$1$1", f = "ScootersStateInteractor.kt", l = {43}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.domain.ScootersStateInteractor$onAppResumed$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        int label;
        final /* synthetic */ a0 this$0;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.scooters.domain.ScootersStateInteractor$onAppResumed$1$1$1", f = "ScootersStateInteractor.kt", l = {44}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.scooters.domain.ScootersStateInteractor$onAppResumed$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00651 extends SuspendLambda implements tls {
            int label;
            final /* synthetic */ a0 this$0;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
            @mvg(c = "com.yandex.go.scooters.domain.ScootersStateInteractor$onAppResumed$1$1$1$1", f = "ScootersStateInteractor.kt", l = {45}, m = "invokeSuspend", v = 2)
            /* renamed from: com.yandex.go.scooters.domain.ScootersStateInteractor$onAppResumed$1$1$1$1, reason: invalid class name and collision with other inner class name */
            final class C00661 extends SuspendLambda implements tls {
                int label;
                final /* synthetic */ a0 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00661(a0 a0Var, Continuation continuation) {
                    super(1, continuation);
                    this.this$0 = a0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Continuation continuation) {
                    return new C00661(this.this$0, continuation);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    return ((C00661) create((Continuation) obj)).invokeSuspend(zy11.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        kotlin.b.b(obj);
                        a0 a0Var = this.this$0;
                        this.label = 1;
                        if (a0.d(a0Var, this) == coroutineSingletons) {
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
            public C00651(a0 a0Var, Continuation continuation) {
                super(1, continuation);
                this.this$0 = a0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C00651(this.this$0, continuation);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return ((C00651) create((Continuation) obj)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    a0 a0Var = this.this$0;
                    C00661 c00661 = new C00661(a0Var, null);
                    this.label = 1;
                    if (kotlinx.coroutines.flow.e.k(a0Var.f.a, new ScootersStateInteractor$onUnifiedPollingDisabled$2(a0Var, c00661, null), this) == coroutineSingletons) {
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
        public AnonymousClass1(a0 a0Var, Continuation continuation) {
            super(1, continuation);
            this.this$0 = a0Var;
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
                a0 a0Var = this.this$0;
                C00651 c00651 = new C00651(a0Var, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(kotlinx.coroutines.flow.e.t(a0Var.d.c()), new ScootersStateInteractor$onAuthorized$2(c00651, null), this) == coroutineSingletons) {
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
    public ScootersStateInteractor$onAppResumed$1(a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersStateInteractor$onAppResumed$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersStateInteractor$onAppResumed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a0 a0Var = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(a0Var, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(kotlinx.coroutines.flow.e.s(ru.yandex.taxi.experiments.d.b(a0Var.c.a), new p2m0(29)), new ScootersStateInteractor$onExperimentAvailable$3(anonymousClass1, null), this) == coroutineSingletons) {
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
