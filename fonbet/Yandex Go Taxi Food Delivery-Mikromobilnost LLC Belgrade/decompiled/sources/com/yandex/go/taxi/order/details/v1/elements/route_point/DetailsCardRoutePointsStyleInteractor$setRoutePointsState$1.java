package com.yandex.go.taxi.order.details.v1.elements.route_point;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.z6j;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.route_point.DetailsCardRoutePointsStyleInteractor$setRoutePointsState$1", f = "DetailsCardRoutePointsStyleInteractor.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH, 62}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardRoutePointsStyleInteractor$setRoutePointsState$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $addresses;
    final /* synthetic */ DetailsCardRoutePointsStyleInteractor$RoutePointsState $state;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardRoutePointsStyleInteractor$setRoutePointsState$1(c cVar, DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$state = detailsCardRoutePointsStyleInteractor$RoutePointsState;
        this.$addresses = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardRoutePointsStyleInteractor$setRoutePointsState$1(this.this$0, this.$state, this.$addresses, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardRoutePointsStyleInteractor$setRoutePointsState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        kotlinx.coroutines.sync.a aVar;
        DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState;
        List<String> list;
        Throwable th;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                cVar = this.this$0;
                aVar = cVar.d;
                DetailsCardRoutePointsStyleInteractor$RoutePointsState detailsCardRoutePointsStyleInteractor$RoutePointsState2 = this.$state;
                List<String> list2 = this.$addresses;
                this.L$0 = aVar;
                this.L$1 = cVar;
                this.L$2 = detailsCardRoutePointsStyleInteractor$RoutePointsState2;
                this.L$3 = list2;
                this.label = 1;
                if (aVar.a(this) != coroutineSingletons) {
                    detailsCardRoutePointsStyleInteractor$RoutePointsState = detailsCardRoutePointsStyleInteractor$RoutePointsState2;
                    list = list2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g050Var = (g050) this.L$0;
                try {
                    kotlin.b.b(obj);
                    g050Var.d(null);
                    return zy11.a;
                } catch (Throwable th2) {
                    th = th2;
                    g050Var.d(null);
                    throw th;
                }
            }
            list = (List) this.L$3;
            detailsCardRoutePointsStyleInteractor$RoutePointsState = (DetailsCardRoutePointsStyleInteractor$RoutePointsState) this.L$2;
            cVar = (c) this.L$1;
            ?? r6 = (g050) this.L$0;
            kotlin.b.b(obj);
            aVar = r6;
            z6j z6jVar = new z6j(detailsCardRoutePointsStyleInteractor$RoutePointsState, list);
            cVar.e = z6jVar;
            this.L$0 = aVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (c.e(cVar, z6jVar, this) != coroutineSingletons) {
                g050Var = aVar;
                g050Var.d(null);
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar2 = aVar;
            th = th3;
            g050Var = aVar2;
            g050Var.d(null);
            throw th;
        }
    }
}
