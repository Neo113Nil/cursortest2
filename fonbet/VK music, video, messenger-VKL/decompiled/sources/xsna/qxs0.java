package xsna;

import com.vk.api.generated.video.dto.VideoGetMusicMixResponseDto;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: VideoMusicMixRepositoryImpl.kt */
@b6l(c = "com.vk.video.music.impl.data.repository.VideoMusicMixRepositoryImpl$getVideoMusicMix$2", f = "VideoMusicMixRepositoryImpl.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class qxs0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends mxs0>>, Object> {
    final /* synthetic */ Integer $count;
    final /* synthetic */ String $payload;
    final /* synthetic */ String $ref;
    final /* synthetic */ String $sourceVideo;
    final /* synthetic */ String $trackCode;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ rxs0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxs0(rxs0 rxs0Var, String str, Integer num, String str2, String str3, String str4, spj<? super qxs0> spjVar) {
        super(2, spjVar);
        this.this$0 = rxs0Var;
        this.$sourceVideo = str;
        this.$count = num;
        this.$payload = str2;
        this.$ref = str3;
        this.$trackCode = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qxs0(this.this$0, this.$sourceVideo, this.$count, this.$payload, this.$ref, this.$trackCode, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends mxs0>> spjVar) {
        return ((qxs0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                rxs0 rxs0Var = this.this$0;
                iz2 A = yfb.A(tft0.d(rxs0Var.a, this.$sourceVideo, this.$count, this.$payload, this.$ref, this.$trackCode, 2));
                fo50.J(A);
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
            VideoGetMusicMixResponseDto videoGetMusicMixResponseDto = (VideoGetMusicMixResponseDto) obj;
            failure = new mxs0(ums0.e(ums0.a, videoGetMusicMixResponseDto.g(), videoGetMusicMixResponseDto.f(), videoGetMusicMixResponseDto.d(), false, 52));
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
