package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: NotificationListFeatureV2.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.feature.NotificationListFeatureV2$markAsViewedSync$2", f = "NotificationListFeatureV2.kt", l = {695}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class db70 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends BaseBoolIntDto>>, Object> {
    final /* synthetic */ Integer $viewTime;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ wa70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db70(wa70 wa70Var, Integer num, spj<? super db70> spjVar) {
        super(2, spjVar);
        this.this$0 = wa70Var;
        this.$viewTime = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new db70(this.this$0, this.$viewTime, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends BaseBoolIntDto>> spjVar) {
        return ((db70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
                wa70 wa70Var = this.this$0;
                Integer num = this.$viewTime;
                s101 s101Var = wa70Var.l;
                wa70Var.Y().getClass();
                iz2 A = yfb.A(s101Var.C(he70.a(), num != null ? num.toString() : null));
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = evj.p(A, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            obj2 = (BaseBoolIntDto) obj;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            Result.a(obj2);
            return new Result(obj2);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            Result.a(obj2);
            return new Result(obj2);
        }
        Result.a(obj2);
        return new Result(obj2);
    }
}
