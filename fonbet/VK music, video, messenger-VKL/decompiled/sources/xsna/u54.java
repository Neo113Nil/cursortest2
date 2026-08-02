package xsna;

import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.dto.common.VideoFile;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.sft0;

/* compiled from: AttachedClipsNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.attachedclips.data.network.AttachedClipsNetworkApiImpl$getVideoAttachedClips$2", f = "AttachedClipsNetworkApiImpl.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class u54 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends List<? extends VideoFile>>>, Object> {
    final /* synthetic */ String $videoId;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ x54 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u54(x54 x54Var, String str, spj<? super u54> spjVar) {
        super(2, spjVar);
        this.this$0 = x54Var;
        this.$videoId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new u54(this.this$0, this.$videoId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends List<? extends VideoFile>>> spjVar) {
        return ((u54) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
                iz2 A = yfb.A(sft0.a.b(this.this$0.a, null, Collections.singletonList(this.$videoId), null, null, null, null, null, 16777207));
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
            obj2 = ((VideoFile) j5g.Y(ums0.e(ums0.a, ((VideoGetResponseDto) obj).e(), null, null, false, 62))).b7();
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
