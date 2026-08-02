package xsna;

import com.vk.api.generated.serverEffects.dto.ServerEffectsGetGeneratedVideoInfoResponseDto;
import com.vk.dto.common.id.UserId;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: SmartCropRepositoryImpl.kt */
@b6l(c = "com.vk.video.ui.smartcrop.impl.data.SmartCropRepositoryImpl$getCropVideoStatus$2", f = "SmartCropRepositoryImpl.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class c5k0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends mik>>, Object> {
    final /* synthetic */ long $ovId;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ a5k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5k0(a5k0 a5k0Var, long j, spj<? super c5k0> spjVar) {
        super(2, spjVar);
        this.this$0 = a5k0Var;
        this.$ovId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c5k0(this.this$0, this.$ovId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends mik>> spjVar) {
        return ((c5k0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        a5k0 a5k0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                a5k0 a5k0Var2 = this.this$0;
                iz2 A = yfb.A(new sdi().u(this.$ovId, new UserId(a5k0Var2.a.b.n), new Integer(a5k0Var2.a.b.o)));
                this.L$0 = a5k0Var2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                Object p = evj.p(A, this);
                if (p == coroutineSingletons) {
                    return coroutineSingletons;
                }
                a5k0Var = a5k0Var2;
                obj = p;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a5k0Var = (a5k0) this.L$0;
                kotlin.a.a(obj);
            }
            obj2 = a5k0.c(a5k0Var, ((ServerEffectsGetGeneratedVideoInfoResponseDto) obj).d());
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
