package com.yandex.go.pickup_from_photo.presentation;

import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$TipAnimation;
import com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.fob0;
import defpackage.gob0;
import defpackage.hob0;
import defpackage.iob0;
import defpackage.jl40;
import defpackage.job0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.znb0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liob0;", "hintState", "Lzy11;", "<anonymous>", "(Liob0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoPresenter$start$2", f = "PickupFromPhotoPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PickupFromPhotoPresenter$start$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ job0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupFromPhotoPresenter$start$2(job0 job0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = job0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PickupFromPhotoPresenter$start$2 pickupFromPhotoPresenter$start$2 = new PickupFromPhotoPresenter$start$2(this.this$0, continuation);
        pickupFromPhotoPresenter$start$2.L$0 = obj;
        return pickupFromPhotoPresenter$start$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PickupFromPhotoPresenter$start$2 pickupFromPhotoPresenter$start$2 = (PickupFromPhotoPresenter$start$2) create((iob0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        pickupFromPhotoPresenter$start$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        iob0 iob0Var = (iob0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (jl40.l(iob0Var, hob0.a)) {
            this.this$0.C.j(PhotoPickUpAnalytics$TipAnimation.Tilt);
            PickupPhotoRecognitionExperiment b = this.this$0.E.b();
            String Y = d6z.Y(b, b.l.b);
            str = evu0.J(Y) ? null : Y;
            ((znb0) this.this$0.Dg()).h9(str != null ? str : "", this.this$0.E.b().l.a);
        } else if (jl40.l(iob0Var, fob0.a)) {
            this.this$0.C.j(PhotoPickUpAnalytics$TipAnimation.Arrow);
            PickupPhotoRecognitionExperiment b2 = this.this$0.E.b();
            String Y2 = d6z.Y(b2, b2.m.b);
            str = evu0.J(Y2) ? null : Y2;
            ((znb0) this.this$0.Dg()).h9(str != null ? str : "", this.this$0.E.b().m.a);
        } else {
            if (!jl40.l(iob0Var, gob0.a)) {
                w511.b();
                return null;
            }
            ((znb0) this.this$0.Dg()).hideHint();
        }
        return zy11.a;
    }
}
