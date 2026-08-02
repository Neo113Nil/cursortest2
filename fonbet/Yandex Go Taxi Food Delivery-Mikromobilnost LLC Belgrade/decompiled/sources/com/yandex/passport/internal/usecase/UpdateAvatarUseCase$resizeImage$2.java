package com.yandex.passport.internal.usecase;

import android.graphics.Bitmap;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Ltse;)[B"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.usecase.UpdateAvatarUseCase$resizeImage$2", f = "UpdateAvatarUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class UpdateAvatarUseCase$resizeImage$2 extends SuspendLambda implements wls {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Bitmap $scaledBitmap;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateAvatarUseCase$resizeImage$2(Bitmap bitmap, Bitmap bitmap2, Continuation continuation) {
        super(2, continuation);
        this.$scaledBitmap = bitmap;
        this.$bitmap = bitmap2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpdateAvatarUseCase$resizeImage$2(this.$scaledBitmap, this.$bitmap, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateAvatarUseCase$resizeImage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap bitmap = this.$scaledBitmap;
        Bitmap bitmap2 = this.$bitmap;
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
            bitmap2.recycle();
            bitmap.recycle();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } finally {
        }
    }
}
