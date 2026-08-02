package com.yandex.go.routestops.v2.interactor;

import defpackage.dfl0;
import defpackage.jf61;
import defpackage.mvg;
import defpackage.n4m;
import defpackage.ny61;
import defpackage.zdl0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldfl0;", "routeUiState", "Ljf61;", "locationButtonState", "Lzdl0;", "<anonymous>", "(Ldfl0;Ljf61;)Lzdl0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.routestops.v2.interactor.RouteStopsV2UiStateInteractor$uiStateFlow$1", f = "RouteStopsV2UiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RouteStopsV2UiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteStopsV2UiStateInteractor$uiStateFlow$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RouteStopsV2UiStateInteractor$uiStateFlow$1 routeStopsV2UiStateInteractor$uiStateFlow$1 = new RouteStopsV2UiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj3);
        routeStopsV2UiStateInteractor$uiStateFlow$1.L$0 = (dfl0) obj;
        routeStopsV2UiStateInteractor$uiStateFlow$1.L$1 = (jf61) obj2;
        return routeStopsV2UiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dfl0 dfl0Var = (dfl0) this.L$0;
        jf61 jf61Var = (jf61) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new zdl0((String) this.this$0.d.getValue(), jf61Var, new n4m((String) this.this$0.e.getValue()), dfl0Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
