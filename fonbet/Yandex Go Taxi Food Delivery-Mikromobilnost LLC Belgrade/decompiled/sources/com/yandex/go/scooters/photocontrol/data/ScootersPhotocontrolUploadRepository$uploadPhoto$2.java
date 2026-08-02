package com.yandex.go.scooters.photocontrol.data;

import android.net.Uri;
import defpackage.m5j0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wms;
import defpackage.y8b1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lm5j0;", "<anonymous>", "(Ltse;)Lm5j0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.photocontrol.data.ScootersPhotocontrolUploadRepository$uploadPhoto$2", f = "ScootersPhotocontrolUploadRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPhotocontrolUploadRepository$uploadPhoto$2 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $scooterPhoto;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPhotocontrolUploadRepository$uploadPhoto$2(c cVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$scooterPhoto = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPhotocontrolUploadRepository$uploadPhoto$2(this.this$0, this.$scooterPhoto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPhotocontrolUploadRepository$uploadPhoto$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        int i = m5j0.a;
        return wms.b(7, null, y8b1.a(this.this$0.a, this.$scooterPhoto, 500));
    }
}
