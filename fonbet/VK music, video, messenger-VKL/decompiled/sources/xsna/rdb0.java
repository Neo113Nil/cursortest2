package xsna;

import com.vk.dto.common.id.UserId;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PlaylistScreenRepository.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.data.PlaylistScreenRepositoryImpl$unsubscribe$2", f = "PlaylistScreenRepository.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class rdb0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends s3q0>>, Object> {
    final /* synthetic */ int $id;
    final /* synthetic */ UserId $ownerId;
    final /* synthetic */ String $source;
    final /* synthetic */ String $trackCode;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ sdb0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdb0(sdb0 sdb0Var, UserId userId, int i, String str, String str2, spj<? super rdb0> spjVar) {
        super(2, spjVar);
        this.this$0 = sdb0Var;
        this.$ownerId = userId;
        this.$id = i;
        this.$trackCode = str;
        this.$source = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rdb0(this.this$0, this.$ownerId, this.$id, this.$trackCode, this.$source, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends s3q0>> spjVar) {
        return ((rdb0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
                sdb0 sdb0Var = this.this$0;
                UserId userId = this.$ownerId;
                int i2 = this.$id;
                String str = this.$trackCode;
                String str2 = this.$source;
                uft0 uft0Var = sdb0Var.b;
                Integer num = new Integer(i2);
                if (str == null) {
                    str = str2;
                }
                iz2 A = yfb.A(uft0Var.u(userId, num, str));
                fo50.J(A);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                if (evj.p(A, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            obj2 = s3q0.a;
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
