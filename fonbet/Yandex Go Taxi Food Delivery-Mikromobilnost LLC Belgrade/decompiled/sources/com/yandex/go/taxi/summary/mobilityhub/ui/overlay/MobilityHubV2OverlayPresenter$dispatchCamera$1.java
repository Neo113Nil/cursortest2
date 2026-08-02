package com.yandex.go.taxi.summary.mobilityhub.ui.overlay;

import defpackage.fw20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/repository/HubContentState;", "<unused var>", "Ld0l0;", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/repository/HubContentState;Ld0l0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.ui.overlay.MobilityHubV2OverlayPresenter$dispatchCamera$1", f = "MobilityHubV2OverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MobilityHubV2OverlayPresenter$dispatchCamera$1 extends SuspendLambda implements zls {
    int label;
    final /* synthetic */ fw20 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilityHubV2OverlayPresenter$dispatchCamera$1(fw20 fw20Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = fw20Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MobilityHubV2OverlayPresenter$dispatchCamera$1 mobilityHubV2OverlayPresenter$dispatchCamera$1 = new MobilityHubV2OverlayPresenter$dispatchCamera$1(this.this$0, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        mobilityHubV2OverlayPresenter$dispatchCamera$1.invokeSuspend(zy11Var);
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
        r0 r0Var = this.this$0.M;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        return zy11.a;
    }
}
