package com.yandex.go.taxi.order.map;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.RoadObjectsOverlayPresenter$visibilityFlow$3", f = "RoadObjectsOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RoadObjectsOverlayPresenter$visibilityFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadObjectsOverlayPresenter$visibilityFlow$3(r rVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RoadObjectsOverlayPresenter$visibilityFlow$3 roadObjectsOverlayPresenter$visibilityFlow$3 = new RoadObjectsOverlayPresenter$visibilityFlow$3(this.this$0, continuation);
        roadObjectsOverlayPresenter$visibilityFlow$3.Z$0 = ((Boolean) obj).booleanValue();
        return roadObjectsOverlayPresenter$visibilityFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        RoadObjectsOverlayPresenter$visibilityFlow$3 roadObjectsOverlayPresenter$visibilityFlow$3 = (RoadObjectsOverlayPresenter$visibilityFlow$3) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        roadObjectsOverlayPresenter$visibilityFlow$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.z = z;
        return zy11.a;
    }
}
