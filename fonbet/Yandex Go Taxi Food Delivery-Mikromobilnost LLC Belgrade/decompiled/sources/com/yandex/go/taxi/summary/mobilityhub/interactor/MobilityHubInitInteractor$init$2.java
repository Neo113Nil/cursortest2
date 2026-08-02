package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.iv20;
import defpackage.jqr;
import defpackage.mdh;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.v811;
import defpackage.w3r0;
import defpackage.w811;
import defpackage.wls;
import defpackage.wmm;
import defpackage.z721;
import defpackage.zvr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.MobilityHubInitInteractor$init$2", f = "MobilityHubInitInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MobilityHubInitInteractor$init$2 extends SuspendLambda implements wls {
    final /* synthetic */ iv20 $mobilityHubData;
    final /* synthetic */ sls $onVerticalGone;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.MobilityHubInitInteractor$init$2$1", f = "MobilityHubInitInteractor.kt", l = {26}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.mobilityhub.interactor.MobilityHubInitInteractor$init$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(j jVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tpr k;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                z721 z721Var = this.this$0.c;
                this.label = 1;
                k = z721Var.d.k(RoutePointType.POINT_A, false);
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(new jqr(new m0(new w(k), com.yandex.go.coroutines.b.d(z721Var.b.c(), new UpdateSourceAddressInteractor$zoneInfoFlow$$inlined$start$1(z721Var, null)), new UpdateSourceAddressInteractor$startSourceAddressUpdates$2(z721Var, null)), new UpdateSourceAddressInteractor$startSourceAddressUpdates$3(2, z721Var, z721.class, "setSourceAddress", "setSourceAddress(Lcom/yandex/go/address/models/ZoneAddress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), 3), new UpdateSourceAddressInteractor$startSourceAddressUpdates$4(3, null));
                sjh sjhVar = uyj.a;
                if (kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.F(oVar, mdh.b), this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.MobilityHubInitInteractor$init$2$2", f = "MobilityHubInitInteractor.kt", l = {30}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.mobilityhub.interactor.MobilityHubInitInteractor$init$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(j jVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
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
                wmm wmmVar = this.this$0.f;
                this.label = 1;
                jqr jqrVar = new jqr(new f(new d(wmmVar.a.k())), new DropIntermediateRoutePointsInteractor$startDrop$4(wmmVar, null), 3);
                sjh sjhVar = uyj.a;
                if (kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.F(jqrVar, mdh.b), this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.MobilityHubInitInteractor$init$2$3", f = "MobilityHubInitInteractor.kt", l = {34}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.mobilityhub.interactor.MobilityHubInitInteractor$init$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ sls $onVerticalGone;
        int label;
        final /* synthetic */ j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(j jVar, sls slsVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = jVar;
            this.$onVerticalGone = slsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, this.$onVerticalGone, continuation);
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
                l lVar = this.this$0.b;
                zvr zvrVar = new zvr(7, this.$onVerticalGone);
                this.label = 1;
                if (lVar.a(zvrVar, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.MobilityHubInitInteractor$init$2$4", f = "MobilityHubInitInteractor.kt", l = {38}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.mobilityhub.interactor.MobilityHubInitInteractor$init$2$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        final /* synthetic */ iv20 $mobilityHubData;
        Object L$0;
        int label;
        final /* synthetic */ j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(iv20 iv20Var, j jVar, Continuation continuation) {
            super(2, continuation);
            this.$mobilityHubData = iv20Var;
            this.this$0 = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass4(this.$mobilityHubData, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                iv20 iv20Var = this.$mobilityHubData;
                if (iv20Var != null) {
                    com.yandex.go.taxi.summary.mobilityhub.deeplink.b bVar = this.this$0.e;
                    this.L$0 = null;
                    this.label = 1;
                    if (bVar.a(iv20Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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
    @mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.MobilityHubInitInteractor$init$2$5", f = "MobilityHubInitInteractor.kt", l = {42}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.mobilityhub.interactor.MobilityHubInitInteractor$init$2$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(j jVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = jVar;
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
                w811 w811Var = this.this$0.d;
                this.label = 1;
                u uVar = new u(new mth(new m0(w811Var.a.k(), kotlinx.coroutines.flow.e.t(new s(w811Var.c.a())), new TransportRoutesLoadingInteractor$startLoading$2(w811Var, null)), 6));
                sjh sjhVar = uyj.a;
                if (new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.F(new jqr(kotlinx.coroutines.flow.e.F(uVar, mdh.b), new TransportRoutesLoadingInteractor$startLoading$4(w811Var, null), 3), o400.a), new TransportRoutesLoadingInteractor$startLoading$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new v811(), this) == coroutineSingletons) {
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
    public MobilityHubInitInteractor$init$2(j jVar, sls slsVar, iv20 iv20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$onVerticalGone = slsVar;
        this.$mobilityHubData = iv20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MobilityHubInitInteractor$init$2 mobilityHubInitInteractor$init$2 = new MobilityHubInitInteractor$init$2(this.this$0, this.$onVerticalGone, this.$mobilityHubData, continuation);
        mobilityHubInitInteractor$init$2.L$0 = obj;
        return mobilityHubInitInteractor$init$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MobilityHubInitInteractor$init$2 mobilityHubInitInteractor$init$2 = (MobilityHubInitInteractor$init$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mobilityHubInitInteractor$init$2.invokeSuspend(zy11Var);
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
        w3r0.b(this.this$0.a, EmptyList.a, null, null, null, 14);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass3(this.this$0, this.$onVerticalGone, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass4(this.$mobilityHubData, this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass5(this.this$0, null), 3);
        return zy11.a;
    }
}
