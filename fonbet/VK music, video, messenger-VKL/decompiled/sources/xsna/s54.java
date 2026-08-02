package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.dto.common.id.UserId;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.lgj0;

/* compiled from: AttachedClipsNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.attachedclips.data.network.AttachedClipsNetworkApiImpl$getClipsForAttach$2", f = "AttachedClipsNetworkApiImpl.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class s54 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends ipe>>, Object> {
    final /* synthetic */ int $count;
    final /* synthetic */ UserId $ownerId;
    final /* synthetic */ String $startFrom;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ x54 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s54(x54 x54Var, UserId userId, int i, String str, spj<? super s54> spjVar) {
        super(2, spjVar);
        this.this$0 = x54Var;
        this.$ownerId = userId;
        this.$count = i;
        this.$startFrom = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new s54(this.this$0, this.$ownerId, this.$count, this.$startFrom, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends ipe>> spjVar) {
        return ((s54) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                x54 x54Var = this.this$0;
                UserId userId = this.$ownerId;
                int i2 = this.$count;
                iz2 A = yfb.A(lgj0.a.g(x54Var.b, userId, new Integer(i2), this.$startFrom, null, null, null, null, null, null, null, 65528));
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                p = evj.p(A, this);
                if (p == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                p = obj;
            }
            ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = (ShortVideoGetOwnerVideosResponseDto) p;
            failure = new ipe(shortVideoGetOwnerVideosResponseDto.g(), ums0.f(ums0.a, shortVideoGetOwnerVideosResponseDto.e(), shortVideoGetOwnerVideosResponseDto.j(), shortVideoGetOwnerVideosResponseDto.d()));
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
