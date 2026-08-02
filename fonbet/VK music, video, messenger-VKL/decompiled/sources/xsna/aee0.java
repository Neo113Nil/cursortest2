package xsna;

import com.vk.dto.common.VideoFile;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: PublishNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.network.PublishNetworkApiImpl$removeVideoFromAlbums$2", f = "PublishNetworkApiImpl.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class aee0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends s3q0>>, Object> {
    final /* synthetic */ List<Integer> $albumsIds;
    final /* synthetic */ VideoFile $videoFile;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ bee0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aee0(bee0 bee0Var, VideoFile videoFile, List<Integer> list, spj<? super aee0> spjVar) {
        super(2, spjVar);
        this.this$0 = bee0Var;
        this.$videoFile = videoFile;
        this.$albumsIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new aee0(this.this$0, this.$videoFile, this.$albumsIds, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends s3q0>> spjVar) {
        return ((aee0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        List<Integer> list;
        List t0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                bee0 bee0Var = this.this$0;
                VideoFile videoFile = this.$videoFile;
                List<Integer> list2 = this.$albumsIds;
                iz2 A = yfb.A(bee0Var.a.z(videoFile.I0(), videoFile.o0(), videoFile.I0(), list2));
                this.L$0 = list2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = evj.p(A, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list = list2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                kotlin.a.a(obj);
            }
            t0 = j5g.t0(list, j5g.S0((List) obj));
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
        if (t0.isEmpty()) {
            obj2 = s3q0.a;
            return new Result(obj2);
        }
        throw new IOException("Couldn't remove video from playlists: " + t0);
    }
}
