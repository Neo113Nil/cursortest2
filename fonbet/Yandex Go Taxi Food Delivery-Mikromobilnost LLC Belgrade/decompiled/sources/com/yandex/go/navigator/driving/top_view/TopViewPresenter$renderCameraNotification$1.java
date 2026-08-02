package com.yandex.go.navigator.driving.top_view;

import defpackage.ah60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "distanceToUpcomingCamera", "", "canBeShown", "Lah60;", "<anonymous>", "(Ljava/lang/String;Z)Lah60;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.top_view.TopViewPresenter$renderCameraNotification$1", f = "TopViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TopViewPresenter$renderCameraNotification$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        TopViewPresenter$renderCameraNotification$1 topViewPresenter$renderCameraNotification$1 = new TopViewPresenter$renderCameraNotification$1(3, (Continuation) obj3);
        topViewPresenter$renderCameraNotification$1.L$0 = (String) obj;
        topViewPresenter$renderCameraNotification$1.Z$0 = booleanValue;
        return topViewPresenter$renderCameraNotification$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return (str == null || !z) ? new ah60("") : new ah60(str);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
