package xsna;

import com.vk.api.generated.video.dto.VideoGetVideoForEditResponseDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PublishNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.network.PublishNetworkApiImpl$getVideoFile$2", f = "PublishNetworkApiImpl.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class sde0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends VideoFile>>, Object> {
    final /* synthetic */ String $videoId;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ bee0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sde0(String str, spj spjVar, bee0 bee0Var) {
        super(2, spjVar);
        this.$videoId = str;
        this.this$0 = bee0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new sde0(this.$videoId, spjVar, this.this$0);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends VideoFile>> spjVar) {
        return ((sde0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        r10 = xsna.yfb.A(r1.a.w(((java.lang.Number) r6.j()).intValue(), (com.vk.dto.common.id.UserId) r6.i()));
        r9.L$0 = r1;
        r9.L$1 = r6;
        r9.I$0 = 0;
        r9.I$1 = 0;
        r9.label = 1;
        r10 = xsna.evj.p(r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        if (r10 != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        r0 = r6;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        bee0 bee0Var;
        Long n;
        Pair pair;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                String str = this.$videoId;
                bee0Var = this.this$0;
                List b0 = drm0.b0(str, new char[]{'_'}, 0, 6);
                Pair pair2 = null;
                if (b0.size() == 2 && (n = arm0.n((String) b0.get(0))) != null) {
                    long longValue = n.longValue();
                    gzs<s3q0> gzsVar = fkq0.a;
                    UserId userId = new UserId(longValue);
                    Integer m = arm0.m(10, (String) b0.get(1));
                    if (m != null) {
                        pair2 = new Pair(userId, m);
                    }
                }
                throw new NullPointerException("not valid format raw videoId");
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pair = (Pair) this.L$1;
            bee0Var = (bee0) this.L$0;
            kotlin.a.a(obj);
            VideoGetVideoForEditResponseDto videoGetVideoForEditResponseDto = (VideoGetVideoForEditResponseDto) obj;
            obj2 = (VideoFile) j5g.Y(ums0.e(ums0.a, Collections.singletonList(bee0.m(bee0Var, videoGetVideoForEditResponseDto.e(), ((Number) pair.j()).intValue(), (UserId) pair.i())), videoGetVideoForEditResponseDto.f(), videoGetVideoForEditResponseDto.d(), false, 52));
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
