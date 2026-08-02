package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: AttachedClipsNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.attachedclips.data.network.AttachedClipsNetworkApiImpl$saveAttachedClips$2", f = "AttachedClipsNetworkApiImpl.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class w54 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends s3q0>>, Object> {
    final /* synthetic */ List<String> $attachedClipsIds;
    final /* synthetic */ UserId $ownerId;
    final /* synthetic */ int $videoId;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ x54 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w54(x54 x54Var, int i, UserId userId, List<String> list, spj<? super w54> spjVar) {
        super(2, spjVar);
        this.this$0 = x54Var;
        this.$videoId = i;
        this.$ownerId = userId;
        this.$attachedClipsIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new w54(this.this$0, this.$videoId, this.$ownerId, this.$attachedClipsIds, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends s3q0>> spjVar) {
        return ((w54) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        Object p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                x54 x54Var = this.this$0;
                iz2 A = yfb.A(tft0.m(x54Var.a, this.$videoId, this.$ownerId, null, null, null, null, null, null, this.$attachedClipsIds, null, 393212));
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
