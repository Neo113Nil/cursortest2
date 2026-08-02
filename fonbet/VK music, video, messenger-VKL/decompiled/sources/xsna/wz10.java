package xsna;

import com.vk.mediastore.system.MediaStoreEntry;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: MediaStoreLoaderImpl.kt */
@b6l(c = "com.vk.mediastore.system.coroutines.MediaStoreLoaderImpl$loadEntries$2", f = "MediaStoreLoaderImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class wz10 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends List<? extends MediaStoreEntry>>>, Object> {
    final /* synthetic */ int $bucketId;
    final /* synthetic */ int $limit;
    final /* synthetic */ int $mediaType;
    final /* synthetic */ int $offset;
    int label;
    final /* synthetic */ zz10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz10(zz10 zz10Var, int i, int i2, int i3, int i4, spj<? super wz10> spjVar) {
        super(2, spjVar);
        this.this$0 = zz10Var;
        this.$mediaType = i;
        this.$limit = i2;
        this.$offset = i3;
        this.$bucketId = i4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wz10(this.this$0, this.$mediaType, this.$limit, this.$offset, this.$bucketId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends List<? extends MediaStoreEntry>>> spjVar) {
        return ((wz10) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
        zz10 zz10Var = this.this$0;
        try {
            obj2 = zz10Var.a.i(this.$mediaType, this.$limit, this.$offset, this.$bucketId);
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
