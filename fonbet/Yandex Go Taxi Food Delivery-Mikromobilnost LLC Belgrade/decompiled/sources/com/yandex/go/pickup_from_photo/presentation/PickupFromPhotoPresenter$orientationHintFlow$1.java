package com.yandex.go.pickup_from_photo.presentation;

import defpackage.fob0;
import defpackage.gob0;
import defpackage.hob0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "needShowPitchHint", "needShowAzimuthHint", "Liob0;", "<anonymous>", "(ZZ)Liob0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoPresenter$orientationHintFlow$1", f = "PickupFromPhotoPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PickupFromPhotoPresenter$orientationHintFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        PickupFromPhotoPresenter$orientationHintFlow$1 pickupFromPhotoPresenter$orientationHintFlow$1 = new PickupFromPhotoPresenter$orientationHintFlow$1(3, (Continuation) obj3);
        pickupFromPhotoPresenter$orientationHintFlow$1.Z$0 = booleanValue;
        pickupFromPhotoPresenter$orientationHintFlow$1.Z$1 = booleanValue2;
        return pickupFromPhotoPresenter$orientationHintFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return z ? hob0.a : z2 ? fob0.a : gob0.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
