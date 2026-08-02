package xsna;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: CoverChooseFileStorageImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.coverchoose.data.network.CoverChooseFileStorageImpl$saveCoverToTmpFile$2", f = "CoverChooseFileStorageImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class r0k extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends File>>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0k(Bitmap bitmap, spj<? super r0k> spjVar) {
        super(2, spjVar);
        this.$bitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new r0k(this.$bitmap, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends File>> spjVar) {
        return ((r0k) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        Bitmap bitmap = this.$bitmap;
        try {
            File createTempFile = File.createTempFile("cover", System.currentTimeMillis() + ".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile.getPath());
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                s3q0 s3q0Var = s3q0.a;
                fileOutputStream.close();
                failure = createTempFile;
            } finally {
            }
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return new Result(failure);
    }
}
