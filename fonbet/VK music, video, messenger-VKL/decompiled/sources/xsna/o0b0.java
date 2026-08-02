package xsna;

import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.wqs0;
import xsna.xqs0;

/* compiled from: PlayerControlsDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.PlayerControlsDelegateKt$handleBottomLeftIconButtonClick$1", f = "PlayerControlsDelegate.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class o0b0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wqs0.c $action;
    final /* synthetic */ ActionLink $actionLink;
    final /* synthetic */ ars0 $this_handleBottomLeftIconButtonClick;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0b0(ActionLink actionLink, ars0 ars0Var, wqs0.c cVar, spj<? super o0b0> spjVar) {
        super(2, spjVar);
        this.$actionLink = actionLink;
        this.$this_handleBottomLeftIconButtonClick = ars0Var;
        this.$action = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new o0b0(this.$actionLink, this.$this_handleBottomLeftIconButtonClick, this.$action, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((o0b0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object obj2;
        ars0 ars0Var;
        wqs0.c cVar;
        VideoFile videoFile;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                String str2 = this.$actionLink.d;
                int H = drm0.H(str2);
                while (true) {
                    if (-1 >= H) {
                        str = "";
                        break;
                    }
                    if (str2.charAt(H) == '_') {
                        str = str2.substring(0, H + 1);
                        break;
                    }
                    H--;
                }
                String w0 = erm0.w0(1, str);
                UserId userId = new UserId(Long.parseLong(w0));
                int parseInt = Integer.parseInt(erm0.v0(w0.length() + 1, str2));
                ars0 ars0Var2 = this.$this_handleBottomLeftIconButtonClick;
                nb9 a = cdn.a(ars0Var2.e.b(parseInt, userId, ((VideoLargeListState) ((b2a) ars0Var2.b.b).getCurrentState()).d.C1()));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = parseInt;
                this.I$1 = 0;
                this.I$2 = 0;
                this.label = 1;
                obj = rsr.p(a, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            obj2 = (VideoFile) obj;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            ars0Var = this.$this_handleBottomLeftIconButtonClick;
            cVar = this.$action;
            if (!(obj2 instanceof Result.Failure)) {
                ars0Var.t(new xqs0.g(cVar.b, videoFile, ((VideoLargeListState) ((b2a) ars0Var.b.b).getCurrentState()).d.x8()));
            }
            return s3q0.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            ars0Var = this.$this_handleBottomLeftIconButtonClick;
            cVar = this.$action;
            if (!(obj2 instanceof Result.Failure)) {
            }
            return s3q0.a;
        }
        ars0Var = this.$this_handleBottomLeftIconButtonClick;
        cVar = this.$action;
        if (!(obj2 instanceof Result.Failure) && (videoFile = (VideoFile) obj2) != null) {
            ars0Var.t(new xqs0.g(cVar.b, videoFile, ((VideoLargeListState) ((b2a) ars0Var.b.b).getCurrentState()).d.x8()));
        }
        return s3q0.a;
    }
}
