package com.yandex.go.pickup_from_photo.presentation;

import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PhotoPickUpSource;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PhotoPickUpState;
import defpackage.job0;
import defpackage.mvg;
import defpackage.nhb0;
import defpackage.ny61;
import defpackage.ppb0;
import defpackage.qpb0;
import defpackage.zls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqpb0;", "previousState", "currentState", "<anonymous>", "(Lqpb0;Lqpb0;)Lqpb0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoPresenter$attachView$1$onStart$2", f = "PickupFromPhotoPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PickupFromPhotoPresenter$attachView$1$onStart$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ job0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupFromPhotoPresenter$attachView$1$onStart$2(job0 job0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = job0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PickupFromPhotoPresenter$attachView$1$onStart$2 pickupFromPhotoPresenter$attachView$1$onStart$2 = new PickupFromPhotoPresenter$attachView$1$onStart$2(this.this$0, (Continuation) obj3);
        pickupFromPhotoPresenter$attachView$1$onStart$2.L$0 = (qpb0) obj;
        pickupFromPhotoPresenter$attachView$1$onStart$2.L$1 = (qpb0) obj2;
        return pickupFromPhotoPresenter$attachView$1$onStart$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r0.k == r2.k) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qpb0 qpb0Var = (qpb0) this.L$0;
        qpb0 qpb0Var2 = (qpb0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        PhotoPickUpAnalytics$PhotoPickUpState photoPickUpAnalytics$PhotoPickUpState = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (qpb0Var2 != null) {
            job0 job0Var = this.this$0;
            job0Var.getClass();
            if (qpb0Var2 instanceof ppb0) {
                if (qpb0Var instanceof ppb0) {
                    ppb0 ppb0Var = (ppb0) qpb0Var;
                    ppb0 ppb0Var2 = (ppb0) qpb0Var2;
                    if (ppb0Var.g == ppb0Var2.g) {
                    }
                }
                ppb0 ppb0Var3 = (ppb0) qpb0Var2;
                PhotoPickUpAnalytics$PhotoPickUpSource photoPickUpAnalytics$PhotoPickUpSource = ppb0Var3.k;
                if (photoPickUpAnalytics$PhotoPickUpSource != null) {
                    int i = ppb0Var3.g;
                    if (i == ppb0Var3.h) {
                        photoPickUpAnalytics$PhotoPickUpState = PhotoPickUpAnalytics$PhotoPickUpState.Loading;
                    } else if (i == 0) {
                        photoPickUpAnalytics$PhotoPickUpState = PhotoPickUpAnalytics$PhotoPickUpState.FirstPhoto;
                    } else if (i == 1) {
                        photoPickUpAnalytics$PhotoPickUpState = PhotoPickUpAnalytics$PhotoPickUpState.SecondPhoto;
                    } else if (i == 2) {
                        photoPickUpAnalytics$PhotoPickUpState = PhotoPickUpAnalytics$PhotoPickUpState.ThirdPhoto;
                    }
                    if (photoPickUpAnalytics$PhotoPickUpState != null) {
                        nhb0 nhb0Var = job0Var.C.a;
                        nhb0Var.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("source", photoPickUpAnalytics$PhotoPickUpSource.getEventValue());
                        hashMap.put(ClidProvider.STATE, photoPickUpAnalytics$PhotoPickUpState.getEventValue());
                        nhb0Var.a.a("PhotoPickUp.Shown", hashMap, 1, new HashMap());
                    }
                }
            }
        }
        return qpb0Var2;
    }
}
