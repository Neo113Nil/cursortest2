package com.yandex.go.scooters.qr.preview.domain;

import android.graphics.Rect;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Rect;", "qrViewSize", "bottomOffset", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.qr.preview.domain.ScootersPreviewPositionInteractor$listenAvailableAreaRect$1", f = "ScootersPreviewPositionInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPreviewPositionInteractor$listenAvailableAreaRect$1 extends SuspendLambda implements zls {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        ScootersPreviewPositionInteractor$listenAvailableAreaRect$1 scootersPreviewPositionInteractor$listenAvailableAreaRect$1 = new ScootersPreviewPositionInteractor$listenAvailableAreaRect$1(3, (Continuation) obj3);
        scootersPreviewPositionInteractor$listenAvailableAreaRect$1.L$0 = (Rect) obj;
        scootersPreviewPositionInteractor$listenAvailableAreaRect$1.I$0 = intValue;
        return scootersPreviewPositionInteractor$listenAvailableAreaRect$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Rect rect = (Rect) this.L$0;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Rect rect2 = new Rect(rect);
        rect2.bottom -= i;
        return rect2;
    }
}
