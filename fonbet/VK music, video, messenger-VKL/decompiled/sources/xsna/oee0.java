package xsna;

import android.content.SharedPreferences;
import com.vk.dto.hints.HintId;
import io.jsonwebtoken.JwtParser;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PublishSharedPrefsImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.sharedpref.PublishSharedPrefsImpl$incrementAuthorOnboardingShowCount$2", f = "PublishSharedPrefsImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class oee0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends Integer>>, Object> {
    final /* synthetic */ HintId $hintId;
    int label;
    final /* synthetic */ pee0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oee0(pee0 pee0Var, HintId hintId, spj<? super oee0> spjVar) {
        super(2, spjVar);
        this.this$0 = pee0Var;
        this.$hintId = hintId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new oee0(this.this$0, this.$hintId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends Integer>> spjVar) {
        return ((oee0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
        pee0 pee0Var = this.this$0;
        HintId hintId = this.$hintId;
        try {
            int c = pee0.c(pee0Var, hintId.getId());
            k7b k7bVar = pee0Var.a;
            int i = c + 1;
            SharedPreferences.Editor edit = k7bVar.a().edit();
            edit.putInt(k7bVar.b() + JwtParser.SEPARATOR_CHAR + hintId.getId(), i);
            edit.apply();
            obj2 = new Integer(i);
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
