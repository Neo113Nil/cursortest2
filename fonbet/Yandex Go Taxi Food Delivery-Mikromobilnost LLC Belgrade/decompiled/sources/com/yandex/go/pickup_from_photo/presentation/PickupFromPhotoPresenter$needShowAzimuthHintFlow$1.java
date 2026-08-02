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
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "initial", "Lqpb0;", ClidProvider.STATE, "<anonymous>", "(FLqpb0;)F"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoPresenter$needShowAzimuthHintFlow$1", f = "PickupFromPhotoPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PickupFromPhotoPresenter$needShowAzimuthHintFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ job0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupFromPhotoPresenter$needShowAzimuthHintFlow$1(job0 job0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = job0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PickupFromPhotoPresenter$needShowAzimuthHintFlow$1 pickupFromPhotoPresenter$needShowAzimuthHintFlow$1 = new PickupFromPhotoPresenter$needShowAzimuthHintFlow$1(this.this$0, (Continuation) obj3);
        pickupFromPhotoPresenter$needShowAzimuthHintFlow$1.L$0 = (Float) obj;
        pickupFromPhotoPresenter$needShowAzimuthHintFlow$1.L$1 = (qpb0) obj2;
        return pickupFromPhotoPresenter$needShowAzimuthHintFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Float f = (Float) this.L$0;
        qpb0 qpb0Var = (qpb0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ppb0 ppb0Var = qpb0Var instanceof ppb0 ? (ppb0) qpb0Var : null;
        if (ppb0Var == null || ppb0Var.g != 1) {
            return null;
        }
        if (f != null) {
            return f;
        }
        job0 job0Var = this.this$0;
        job0Var.H = true;
        hbj currentOrientation = job0Var.D.getCurrentOrientation();
        if (currentOrientation != null) {
            return new Float(currentOrientation.a);
        }
        return null;
    }
}
