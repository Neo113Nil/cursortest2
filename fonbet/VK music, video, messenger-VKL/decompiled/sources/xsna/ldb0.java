package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.video.playlist.playlistscreen.domain.PlaylistDataDo;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PlaylistScreenRepository.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.data.PlaylistScreenRepositoryImpl$getPlaylistInfoData$2", f = "PlaylistScreenRepository.kt", l = {TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ldb0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends PlaylistDataDo>>, Object> {
    final /* synthetic */ UserId $ownerId;
    final /* synthetic */ int $playlistId;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ sdb0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldb0(sdb0 sdb0Var, int i, UserId userId, spj<? super ldb0> spjVar) {
        super(2, spjVar);
        this.this$0 = sdb0Var;
        this.$playlistId = i;
        this.$ownerId = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ldb0(this.this$0, this.$playlistId, this.$ownerId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends PlaylistDataDo>> spjVar) {
        return ((ldb0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                sdb0 sdb0Var = this.this$0;
                iz2 A = yfb.A(sdb0Var.b.v(this.$playlistId, this.$ownerId));
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
            VideoAlbum a = b1s0.a((VideoVideoAlbumFullDto) obj);
            failure = new PlaylistDataDo(a.b, a.c, a.l, false, a.h, a.d, a);
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
