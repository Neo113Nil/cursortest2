package com.yandex.mobile.drive.extensions;

import android.graphics.Bitmap;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Ltse;)[B"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.extensions.BitmapKt$compressToByteArray$2", f = "Bitmap.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BitmapKt$compressToByteArray$2 extends SuspendLambda implements wls {
    final /* synthetic */ Bitmap.CompressFormat $format;
    final /* synthetic */ int $quality;
    final /* synthetic */ Bitmap $this_compressToByteArray;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapKt$compressToByteArray$2(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, Continuation continuation) {
        super(2, continuation);
        this.$this_compressToByteArray = bitmap;
        this.$format = compressFormat;
        this.$quality = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BitmapKt$compressToByteArray$2(this.$this_compressToByteArray, this.$format, this.$quality, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BitmapKt$compressToByteArray$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.$this_compressToByteArray.compress(this.$format, this.$quality, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } finally {
        }
    }
}
