package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: CoverChooseFileStorageImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.coverchoose.data.network.CoverChooseFileStorageImpl$getCover$2", f = "CoverChooseFileStorageImpl.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class p0k extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends Bitmap>>, Object> {
    final /* synthetic */ String $path;
    int I$0;
    int I$1;
    int label;

    /* compiled from: CoverChooseFileStorageImpl.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.coverchoose.data.network.CoverChooseFileStorageImpl$getCover$2$1$1", f = "CoverChooseFileStorageImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super Bitmap>, Object> {
        final /* synthetic */ String $path;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$path = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$path, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Bitmap> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return BitmapFactory.decodeFile(this.$path);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0k(String str, spj<? super p0k> spjVar) {
        super(2, spjVar);
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new p0k(this.$path, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends Bitmap>> spjVar) {
        return ((p0k) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                a aVar = new a(this.$path, null);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = oxo0.b(15000L, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            obj2 = (Bitmap) obj;
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
