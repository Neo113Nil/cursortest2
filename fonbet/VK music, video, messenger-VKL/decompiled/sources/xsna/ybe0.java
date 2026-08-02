package xsna;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.vk.media.MediaUtils;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PublishFileStorageImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.file.PublishFileStorageImpl$getVideoPreview$2", f = "PublishFileStorageImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ybe0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends Bitmap>>, Object> {
    final /* synthetic */ MediaUtils.d $size;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ zbe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybe0(MediaUtils.d dVar, Uri uri, zbe0 zbe0Var, spj<? super ybe0> spjVar) {
        super(2, spjVar);
        this.$size = dVar;
        this.$uri = uri;
        this.this$0 = zbe0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ybe0(this.$size, this.$uri, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends Bitmap>> spjVar) {
        return ((ybe0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        MediaUtils.d dVar = this.$size;
        Uri uri = this.$uri;
        zbe0 zbe0Var = this.this$0;
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (oeq0.e(uri)) {
                mediaMetadataRetriever.setDataSource(zbe0Var.a, uri);
            } else {
                mediaMetadataRetriever.setDataSource(uri.getPath());
            }
            obj2 = MediaUtils.a.i(10L, mediaMetadataRetriever, dVar);
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            return new Result(obj2);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            return new Result(obj2);
        }
        return new Result(obj2);
    }
}
