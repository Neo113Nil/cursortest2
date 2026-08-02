package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.dto.common.ClipVideoFile;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.lgj0;

/* compiled from: VideoViewerNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.videoviewer.data.network.VideoViewerNetworkApiImpl$getClipVideoFile$2", f = "VideoViewerNetworkApiImpl.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class xrt0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends ClipVideoFile>>, Object> {
    final /* synthetic */ String $videoId;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ yrt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrt0(yrt0 yrt0Var, String str, spj<? super xrt0> spjVar) {
        super(2, spjVar);
        this.this$0 = yrt0Var;
        this.$videoId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xrt0(this.this$0, this.$videoId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends ClipVideoFile>> spjVar) {
        return ((xrt0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
                iz2 A = yfb.A(lgj0.a.d(this.this$0.a, Collections.singletonList(this.$videoId), null, 62));
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
            j2r0 j2r0Var = qgj0.a;
            obj2 = (ClipVideoFile) j5g.Y(qgj0.c((ShortVideoGetResponseDto) obj));
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
