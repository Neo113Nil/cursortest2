package com.yandex.go.pickup_from_photo.presentation;

import defpackage.hbj;
import defpackage.job0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "initialAzimuth", "Lhbj;", "orientation", "", "<anonymous>", "(FLhbj;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoPresenter$needShowAzimuthHintFlow$2", f = "PickupFromPhotoPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PickupFromPhotoPresenter$needShowAzimuthHintFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ job0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupFromPhotoPresenter$needShowAzimuthHintFlow$2(job0 job0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = job0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PickupFromPhotoPresenter$needShowAzimuthHintFlow$2 pickupFromPhotoPresenter$needShowAzimuthHintFlow$2 = new PickupFromPhotoPresenter$needShowAzimuthHintFlow$2(this.this$0, (Continuation) obj3);
        pickupFromPhotoPresenter$needShowAzimuthHintFlow$2.L$0 = (Float) obj;
        pickupFromPhotoPresenter$needShowAzimuthHintFlow$2.L$1 = (hbj) obj2;
        return pickupFromPhotoPresenter$needShowAzimuthHintFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Float f = (Float) this.L$0;
        hbj hbjVar = (hbj) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = false;
        if (f != null) {
            job0 job0Var = this.this$0;
            float floatValue = f.floatValue();
            float f2 = hbjVar.a;
            int i = job0Var.E.b().m.c;
            float abs = Math.abs(f2 - floatValue);
            if (abs > 180.0f) {
                abs = 360.0f - abs;
            }
            boolean z2 = abs <= ((float) i);
            if (!z2) {
                job0Var.H = false;
            }
            if (z2 && job0Var.H) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
