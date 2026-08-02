package com.yandex.go.pickup_from_photo.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oy80;
import defpackage.r1s;
import defpackage.s8v;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.w8v;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.data.PhotoRepository$takeAndSavePhoto$2", f = "PhotoRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PhotoRepository$takeAndSavePhoto$2 extends SuspendLambda implements wls {
    final /* synthetic */ w8v $imageCapture;
    final /* synthetic */ tls $onError;
    final /* synthetic */ sls $onFinish;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoRepository$takeAndSavePhoto$2(a aVar, w8v w8vVar, sls slsVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$imageCapture = w8vVar;
        this.$onFinish = slsVar;
        this.$onError = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhotoRepository$takeAndSavePhoto$2(this.this$0, this.$imageCapture, this.$onFinish, this.$onError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PhotoRepository$takeAndSavePhoto$2 photoRepository$takeAndSavePhoto$2 = (PhotoRepository$takeAndSavePhoto$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        photoRepository$takeAndSavePhoto$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$imageCapture.O(new r1s((File) null, new FileOutputStream(this.this$0.c.a(this.this$0.c.b.size())), (s8v) null), this.this$0.a.a, new oy80(11, this.$onFinish, this.$onError));
        return zy11.a;
    }
}
