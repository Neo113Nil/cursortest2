package com.yandex.go.pickup_from_photo.presentation;

import defpackage.hbj;
import defpackage.job0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppb0;
import defpackage.qpb0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqpb0;", "uiState", "Lhbj;", "orientation", "", "<anonymous>", "(Lqpb0;Lhbj;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoPresenter$needShowPitchHintFlow$1", f = "PickupFromPhotoPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PickupFromPhotoPresenter$needShowPitchHintFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ job0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupFromPhotoPresenter$needShowPitchHintFlow$1(job0 job0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = job0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PickupFromPhotoPresenter$needShowPitchHintFlow$1 pickupFromPhotoPresenter$needShowPitchHintFlow$1 = new PickupFromPhotoPresenter$needShowPitchHintFlow$1(this.this$0, (Continuation) obj3);
        pickupFromPhotoPresenter$needShowPitchHintFlow$1.L$0 = (qpb0) obj;
        pickupFromPhotoPresenter$needShowPitchHintFlow$1.L$1 = (hbj) obj2;
        return pickupFromPhotoPresenter$needShowPitchHintFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qpb0 qpb0Var = (qpb0) this.L$0;
        hbj hbjVar = (hbj) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = false;
        if (qpb0Var instanceof ppb0) {
            ppb0 ppb0Var = (ppb0) qpb0Var;
            if (ppb0Var.g < ppb0Var.h && hbjVar.b > this.this$0.E.b().l.c) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
