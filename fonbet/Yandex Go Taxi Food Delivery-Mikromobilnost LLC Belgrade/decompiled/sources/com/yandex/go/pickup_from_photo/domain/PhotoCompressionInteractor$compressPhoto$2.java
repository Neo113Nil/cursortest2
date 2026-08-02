package com.yandex.go.pickup_from_photo.domain;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rzo;
import defpackage.sgb0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Ltse;)[B"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.domain.PhotoCompressionInteractor$compressPhoto$2", f = "PhotoCompressionInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PhotoCompressionInteractor$compressPhoto$2 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ sgb0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoCompressionInteractor$compressPhoto$2(sgb0 sgb0Var, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sgb0Var;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhotoCompressionInteractor$compressPhoto$2(this.this$0, this.$uri, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PhotoCompressionInteractor$compressPhoto$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        InputStream openInputStream = this.this$0.a.getContentResolver().openInputStream(this.$uri);
        if (openInputStream == null) {
            throw new FileNotFoundException();
        }
        byte[] R = rzo.R(openInputStream);
        int d = new androidx.exifinterface.media.a(new ByteArrayInputStream(R)).d(1, "Orientation");
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(R, 0, R.length);
        sgb0 sgb0Var = this.this$0;
        int width = decodeByteArray.getWidth();
        int height = decodeByteArray.getHeight();
        int i = sgb0Var.c.b().j.a;
        Integer valueOf = i > 0 ? Integer.valueOf(i) : null;
        float intValue = valueOf != null ? valueOf.intValue() : 512;
        float max = Math.max(intValue / width, intValue / height);
        this.this$0.getClass();
        Matrix matrix = new Matrix();
        switch (d) {
            case 2:
                matrix.setScale(-max, max);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-max, max);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-max, max);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-max, max);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
        matrix.postScale(max, max);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        decodeByteArray.recycle();
        createBitmap.recycle();
        return byteArrayOutputStream.toByteArray();
    }
}
