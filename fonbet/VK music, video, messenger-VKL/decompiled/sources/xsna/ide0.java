package xsna;

import com.vk.api.generated.video.dto.VideoGetAlbumsExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PublishNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.network.PublishNetworkApiImpl$getAlbums$2", f = "PublishNetworkApiImpl.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ide0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends List<? extends VideoAlbum>>>, Object> {
    final /* synthetic */ int $count;
    final /* synthetic */ int $offset;
    final /* synthetic */ UserId $ownerId;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ bee0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ide0(bee0 bee0Var, UserId userId, int i, int i2, spj<? super ide0> spjVar) {
        super(2, spjVar);
        this.this$0 = bee0Var;
        this.$ownerId = userId;
        this.$offset = i;
        this.$count = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ide0(this.this$0, this.$ownerId, this.$offset, this.$count, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends List<? extends VideoAlbum>>> spjVar) {
        return ((ide0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
                iz2 A = yfb.A(bee0Var.a.t(this.$ownerId, new Integer(this.$offset), new Integer(this.$count)));
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
            List<VideoVideoAlbumFullDto> d = ((VideoGetAlbumsExtendedResponseDto) obj).d();
            failure = new ArrayList(c5g.u(d, 10));
            Iterator<T> it = d.iterator();
            while (it.hasNext()) {
                failure.add(b1s0.a((VideoVideoAlbumFullDto) it.next()));
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
