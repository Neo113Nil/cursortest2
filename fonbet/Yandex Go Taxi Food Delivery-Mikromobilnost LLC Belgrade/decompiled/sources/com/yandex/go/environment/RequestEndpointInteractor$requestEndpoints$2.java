package com.yandex.go.environment;

import com.yandex.go.masstransit.sdk.order.impl.orders.k;
import defpackage.atd0;
import defpackage.bxl;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.nfh;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pv0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.z110;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2", f = "RequestEndpointInteractor.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class RequestEndpointInteractor$requestEndpoints$2 extends SuspendLambda implements wls {
    final /* synthetic */ pv0 $addressInfo;
    final /* synthetic */ RoutePointType $pointType;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1", f = "RequestEndpointInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ pv0 $addressInfo;
        final /* synthetic */ RoutePointType $pointType;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$1", f = "RequestEndpointInteractor.kt", l = {38}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$1, reason: invalid class name and collision with other inner class name */
        final class C00541 extends SuspendLambda implements wls {
            final /* synthetic */ pv0 $addressInfo;
            final /* synthetic */ RoutePointType $pointType;
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00541(b bVar, pv0 pv0Var, RoutePointType routePointType, Continuation continuation) {
                super(2, continuation);
                this.this$0 = bVar;
                this.$addressInfo = pv0Var;
                this.$pointType = routePointType;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00541(this.this$0, this.$addressInfo, this.$pointType, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C00541) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    tpr a = atd0.a(this.this$0.e, this.$addressInfo.a.B(), this.$pointType);
                    this.label = 1;
                    if (kotlinx.coroutines.flow.e.A(a, this) == coroutineSingletons) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$2", f = "RequestEndpointInteractor.kt", l = {41}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements wls {
            final /* synthetic */ pv0 $addressInfo;
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(b bVar, pv0 pv0Var, Continuation continuation) {
                super(2, continuation);
                this.this$0 = bVar;
                this.$addressInfo = pv0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.this$0, this.$addressInfo, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    b bVar = this.this$0;
                    String zoneName = this.$addressInfo.a.getZoneName();
                    zzs B = this.$addressInfo.a.B();
                    this.label = 1;
                    if (b.a(bVar, zoneName, B, this) == coroutineSingletons) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$3", f = "RequestEndpointInteractor.kt", l = {44}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$3, reason: invalid class name */
        final class AnonymousClass3 extends SuspendLambda implements wls {
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(b bVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    z110 z110Var = this.this$0.c;
                    this.label = 1;
                    if (((k) z110Var).n(this) == coroutineSingletons) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$4", f = "RequestEndpointInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$4, reason: invalid class name */
        final class AnonymousClass4 extends SuspendLambda implements wls {
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(b bVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) create((tse) obj, (Continuation) obj2);
                zy11 zy11Var = zy11.a;
                anonymousClass4.invokeSuspend(zy11Var);
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
                ((com.yandex.go.payments.paymentlist.data.c) this.this$0.d).p();
                return zy11.a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$5", f = "RequestEndpointInteractor.kt", l = {50}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$5, reason: invalid class name */
        final class AnonymousClass5 extends SuspendLambda implements wls {
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(b bVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.banners.model.h hVar = this.this$0.f;
                    this.label = 1;
                    if (hVar.m(this) == coroutineSingletons) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$6", f = "RequestEndpointInteractor.kt", l = {53}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$6, reason: invalid class name */
        final class AnonymousClass6 extends SuspendLambda implements wls {
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(b bVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass6(this.this$0, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass6) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.favorites.data.repo.a aVar = this.this$0.h;
                    this.label = 1;
                    if (aVar.c(false, this) == coroutineSingletons) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$7", f = "RequestEndpointInteractor.kt", l = {56}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$7, reason: invalid class name */
        final class AnonymousClass7 extends SuspendLambda implements wls {
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(b bVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass7(this.this$0, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass7) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    nfh nfhVar = this.this$0.i;
                    this.label = 1;
                    if (((com.yandex.go.splash.dynamic.a) nfhVar.b).a(new bxl(21, nfhVar), this) == coroutineSingletons) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$8", f = "RequestEndpointInteractor.kt", l = {59}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.environment.RequestEndpointInteractor$requestEndpoints$2$1$8, reason: invalid class name */
        final class AnonymousClass8 extends SuspendLambda implements wls {
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(b bVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass8(this.this$0, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass8) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.scooters.domain.e eVar = this.this$0.j;
                    this.label = 1;
                    if (eVar.d(this) == coroutineSingletons) {
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
        public AnonymousClass1(b bVar, pv0 pv0Var, RoutePointType routePointType, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$addressInfo = pv0Var;
            this.$pointType = routePointType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$addressInfo, this.$pointType, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
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
            tje.N(tseVar, null, null, new C00541(this.this$0, this.$addressInfo, this.$pointType, null), 3);
            tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, this.$addressInfo, null), 3);
            tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, null), 3);
            tje.N(tseVar, null, null, new AnonymousClass4(this.this$0, null), 3);
            tje.N(tseVar, null, null, new AnonymousClass5(this.this$0, null), 3);
            tje.N(tseVar, null, null, new AnonymousClass6(this.this$0, null), 3);
            this.this$0.g.getClass();
            sjh sjhVar = uyj.a;
            tje.N(tseVar, o400.a, null, new AnonymousClass7(this.this$0, null), 2);
            tje.N(tseVar, null, null, new AnonymousClass8(this.this$0, null), 3);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestEndpointInteractor$requestEndpoints$2(b bVar, pv0 pv0Var, RoutePointType routePointType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$addressInfo = pv0Var;
        this.$pointType = routePointType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequestEndpointInteractor$requestEndpoints$2(this.this$0, this.$addressInfo, this.$pointType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequestEndpointInteractor$requestEndpoints$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.g.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$addressInfo, this.$pointType, null);
            this.label = 1;
            if (tje.k0(mdhVar, anonymousClass1, this) == coroutineSingletons) {
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
