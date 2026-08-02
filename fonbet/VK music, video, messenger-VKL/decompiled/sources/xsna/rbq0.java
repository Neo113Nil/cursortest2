package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.media.MediaUtils;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UploadItemView.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.upload.video.view.UploadItemViewKt$UploadCover$1$1", f = "UploadItemView.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class rbq0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $filePath;
    final /* synthetic */ wh50<agw> $imageBitmap$delegate;
    final /* synthetic */ long $previewSize;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbq0(long j, Context context, String str, wh50<agw> wh50Var, spj<? super rbq0> spjVar) {
        super(2, spjVar);
        this.$previewSize = j;
        this.$context = context;
        this.$filePath = str;
        this.$imageBitmap$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rbq0(this.$previewSize, this.$context, this.$filePath, this.$imageBitmap$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rbq0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i;
        Bitmap bitmap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            MediaUtils.d dVar = new MediaUtils.d(iah0.a(Float.intBitsToFloat((int) (this.$previewSize >> 32))), iah0.a(Float.intBitsToFloat((int) (this.$previewSize & 4294967295L))));
            Context context = this.$context;
            Uri parse = Uri.parse(this.$filePath);
            this.L$0 = null;
            this.label = 1;
            i = kpt0.i(context, parse, dVar, this);
            if (i == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            i = ((Result) obj).d();
        }
        wh50<agw> wh50Var = this.$imageBitmap$delegate;
        if (!(i instanceof Result.Failure) && (bitmap = (Bitmap) i) != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            wh50Var.setValue(new aa2(bitmap));
        }
        return s3q0.a;
    }
}
