package com.yandex.go.routestops.v2.interactor;

import defpackage.cfj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.routestops.v2.interactor.RouteStopsV2LifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2", f = "RouteStopsV2LifecycleSubscriptionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RouteStopsV2LifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.routestops.v2.interactor.RouteStopsV2LifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2$1", f = "RouteStopsV2LifecycleSubscriptionsInteractor.kt", l = {25}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.routestops.v2.interactor.RouteStopsV2LifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ a this$0;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx81;", "<unused var>", "", "", "<anonymous>", "(Lx81;Ljava/util/List;)Ljava/lang/Object;"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.routestops.v2.interactor.RouteStopsV2LifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2$1$1", f = "RouteStopsV2LifecycleSubscriptionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.routestops.v2.interactor.RouteStopsV2LifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2$1$1, reason: invalid class name and collision with other inner class name */
        final class C00641 extends SuspendLambda implements zls {
            int label;

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new C00641(3, (Continuation) obj3).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    kotlin.b.b(obj);
                    return new Object();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tpr p = kotlinx.coroutines.flow.e.p(new m0(this.this$0.b.d(), this.this$0.b.a(), new C00641(3, null)), 200L);
                cfj0 cfj0Var = new cfj0(12, this.this$0);
                this.label = 1;
                if (p.collect(cfj0Var, this) == coroutineSingletons) {
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
    public RouteStopsV2LifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteStopsV2LifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2 routeStopsV2LifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2 = new RouteStopsV2LifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2(this.this$0, continuation);
        routeStopsV2LifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2.L$0 = obj;
        return routeStopsV2LifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteStopsV2LifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
