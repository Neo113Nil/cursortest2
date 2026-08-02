package com.yandex.go.taxi.summary.mobilityhub.ui.overlay;

import defpackage.d0l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "mapMovedByUser", "Lcom/yandex/mapkit/ScreenRect;", "<unused var>", "Lkotlin/Pair;", "Ld0l0;", "<anonymous>", "(ZLcom/yandex/mapkit/ScreenRect;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.ui.overlay.MobilityHubOverlayPresenter$attachView$1$1$1", f = "MobilityHubOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MobilityHubOverlayPresenter$attachView$1$1$1 extends SuspendLambda implements zls {
    final /* synthetic */ d0l0 $route;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilityHubOverlayPresenter$attachView$1$1$1(d0l0 d0l0Var, Continuation continuation) {
        super(3, continuation);
        this.$route = d0l0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        MobilityHubOverlayPresenter$attachView$1$1$1 mobilityHubOverlayPresenter$attachView$1$1$1 = new MobilityHubOverlayPresenter$attachView$1$1$1(this.$route, (Continuation) obj3);
        mobilityHubOverlayPresenter$attachView$1$1$1.Z$0 = booleanValue;
        return mobilityHubOverlayPresenter$attachView$1$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(this.$route, Boolean.valueOf(z));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
