package xsna;

import com.vk.api.generated.video.dto.VideoGetAlbumsByVideoExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.VideoAlbumResultData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PublishNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.network.PublishNetworkApiImpl$getAlbumsByVideo$2", f = "PublishNetworkApiImpl.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class kde0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends List<? extends VideoAlbumResultData>>>, Object> {
    final /* synthetic */ UserId $targetId;
    final /* synthetic */ VideoFile $videoFile;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ bee0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kde0(bee0 bee0Var, VideoFile videoFile, UserId userId, spj<? super kde0> spjVar) {
        super(2, spjVar);
        this.this$0 = bee0Var;
        this.$videoFile = videoFile;
        this.$targetId = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new kde0(this.this$0, this.$videoFile, this.$targetId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends List<? extends VideoAlbumResultData>>> spjVar) {
        return ((kde0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                bee0 bee0Var = this.this$0;
                VideoFile videoFile = this.$videoFile;
                UserId userId = this.$targetId;
                iz2 A = yfb.A(bee0Var.a.r(videoFile.o0(), videoFile.I0(), userId));
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
            List<VideoVideoAlbumFullDto> d = ((VideoGetAlbumsByVideoExtendedResponseDto) obj).d();
            failure = new ArrayList(c5g.u(d, 10));
            for (VideoVideoAlbumFullDto videoVideoAlbumFullDto : d) {
                failure.add(new VideoAlbumResultData(videoVideoAlbumFullDto.getId(), videoVideoAlbumFullDto.getTitle()));
            }
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
