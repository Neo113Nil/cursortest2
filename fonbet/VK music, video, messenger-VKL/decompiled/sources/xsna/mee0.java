package xsna;

import com.vk.dto.hints.HintId;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PublishSharedPrefsImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.sharedpref.PublishSharedPrefsImpl$getAuthorOnboardingShowCount$2", f = "PublishSharedPrefsImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class mee0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends Integer>>, Object> {
    final /* synthetic */ HintId $hintId;
    int label;
    final /* synthetic */ pee0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mee0(pee0 pee0Var, HintId hintId, spj<? super mee0> spjVar) {
        super(2, spjVar);
        this.this$0 = pee0Var;
        this.$hintId = hintId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mee0(this.this$0, this.$hintId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends Integer>> spjVar) {
        return ((mee0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        try {
            failure = new Integer(pee0.c(this.this$0, this.$hintId.getId()));
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
