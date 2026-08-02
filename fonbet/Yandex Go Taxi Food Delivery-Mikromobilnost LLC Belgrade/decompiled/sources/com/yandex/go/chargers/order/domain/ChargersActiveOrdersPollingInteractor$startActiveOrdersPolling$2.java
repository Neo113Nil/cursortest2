package com.yandex.go.chargers.order.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bvf0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersPollingInteractor$startActiveOrdersPolling$2", f = "ChargersActiveOrdersPollingInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ChargersActiveOrdersPollingInteractor$startActiveOrdersPolling$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersPollingInteractor$startActiveOrdersPolling$2$1", f = "ChargersActiveOrdersPollingInteractor.kt", l = {56}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.chargers.order.domain.ChargersActiveOrdersPollingInteractor$startActiveOrdersPolling$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        int label;
        final /* synthetic */ b this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersPollingInteractor$startActiveOrdersPolling$2$1$1", f = "ChargersActiveOrdersPollingInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.chargers.order.domain.ChargersActiveOrdersPollingInteractor$startActiveOrdersPolling$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        final class C00461 extends SuspendLambda implements wls {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ b this$0;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
            @mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersPollingInteractor$startActiveOrdersPolling$2$1$1$1", f = "ChargersActiveOrdersPollingInteractor.kt", l = {58}, m = "invokeSuspend", v = 2)
            /* renamed from: com.yandex.go.chargers.order.domain.ChargersActiveOrdersPollingInteractor$startActiveOrdersPolling$2$1$1$1, reason: invalid class name and collision with other inner class name */
            final class C00471 extends SuspendLambda implements wls {
                int label;
                final /* synthetic */ b this$0;

                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
                @mvg(c = "com.yandex.go.chargers.order.domain.ChargersActiveOrdersPollingInteractor$startActiveOrdersPolling$2$1$1$1$1", f = "ChargersActiveOrdersPollingInteractor.kt", l = {59}, m = "invokeSuspend", v = 2)
                /* renamed from: com.yandex.go.chargers.order.domain.ChargersActiveOrdersPollingInteractor$startActiveOrdersPolling$2$1$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C00481 extends SuspendLambda implements tls {
                    int label;
                    final /* synthetic */ b this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00481(b bVar, Continuation continuation) {
                        super(1, continuation);
                        this.this$0 = bVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Continuation continuation) {
                        return new C00481(this.this$0, continuation);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        return ((C00481) create((Continuation) obj)).invokeSuspend(zy11.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        zy11 zy11Var = zy11.a;
                        if (i == 0) {
                            kotlin.b.b(obj);
                            a aVar = this.this$0.e;
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
                public C00471(b bVar, Continuation continuation) {
                    super(2, continuation);
                    this.this$0 = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C00471(this.this$0, continuation);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00471) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
                    b bVar = this.this$0;
                    C00481 c00481 = new C00481(bVar, null);
                    this.label = 1;
                    return kotlinx.coroutines.flow.e.k(com.yandex.go.coroutines.b.d(bVar.g.c, new ChargersActiveOrdersPollingInteractor$onRequestTrigger$$inlined$start$1(zy11Var, null)), new ChargersActiveOrdersPollingInteractor$onRequestTrigger$2(c00481, null), this) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00461(b bVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C00461 c00461 = new C00461(this.this$0, continuation);
                c00461.L$0 = obj;
                return c00461;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                C00461 c00461 = (C00461) create((tse) obj, (Continuation) obj2);
                zy11 zy11Var = zy11.a;
                c00461.invokeSuspend(zy11Var);
                return zy11Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                tse tseVar = (tse) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                tje.N(tseVar, null, null, new C00471(this.this$0, null), 3);
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(1, continuation);
            this.this$0 = bVar;
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
                C00461 c00461 = new C00461(this.this$0, null);
                this.label = 1;
                if (bvf0.n(c00461, this) == coroutineSingletons) {
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
    public ChargersActiveOrdersPollingInteractor$startActiveOrdersPolling$2(b bVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ChargersActiveOrdersPollingInteractor$startActiveOrdersPolling$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ChargersActiveOrdersPollingInteractor$startActiveOrdersPolling$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(kotlinx.coroutines.flow.e.t(bVar.d.c()), new ChargersActiveOrdersPollingInteractor$onAuthorized$2(anonymousClass1, null), this) == coroutineSingletons) {
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
