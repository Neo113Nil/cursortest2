package xsna;

import com.vk.dto.common.data.PrivacySetting;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PublishInteractor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.domain.interactor.PublishInteractorImpl$getPrivacyDisplayName$2", f = "PublishInteractor.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class mce0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends String>>, Object> {
    final /* synthetic */ List<PrivacySetting.PrivacyRule> $rules;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ uce0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mce0(uce0 uce0Var, List<? extends PrivacySetting.PrivacyRule> list, spj<? super mce0> spjVar) {
        super(2, spjVar);
        this.this$0 = uce0Var;
        this.$rules = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mce0(this.this$0, this.$rules, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends String>> spjVar) {
        return ((mce0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
                io.reactivex.rxjava3.core.x<String> b = this.this$0.d.b(zed0.a(this.$rules));
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = sd9.f(b, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            obj2 = (String) obj;
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
