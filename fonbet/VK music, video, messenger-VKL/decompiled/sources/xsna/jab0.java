package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.video.playlist.playlistscreen.domain.PlaylistDataDo;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlaylistInfoDelegate.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.ui.store.delegate.PlaylistInfoDelegateKt$loadPlaylistInfo$1", f = "PlaylistInfoDelegate.kt", l = {17}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class jab0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $selectedPlaylistId;
    final /* synthetic */ vcb0 $this_loadPlaylistInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jab0(vcb0 vcb0Var, int i, spj<? super jab0> spjVar) {
        super(2, spjVar);
        this.$this_loadPlaylistInfo = vcb0Var;
        this.$selectedPlaylistId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jab0(this.$this_loadPlaylistInfo, this.$selectedPlaylistId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jab0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            rdi.y(this.$this_loadPlaylistInfo, new pyz(18));
            vcb0 vcb0Var = this.$this_loadPlaylistInfo;
            bdb0 bdb0Var = vcb0Var.d;
            int i2 = this.$selectedPlaylistId;
            UserId userId = ((PlaylistScreenState) vcb0Var.b.getCurrentState()).c;
            this.label = 1;
            b = bdb0Var.b(i2, userId, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            b = ((Result) obj).d();
        }
        vcb0 vcb0Var2 = this.$this_loadPlaylistInfo;
        if (!(b instanceof Result.Failure)) {
            rdi.y(vcb0Var2, new fv90((PlaylistDataDo) b, 6));
        }
        vcb0 vcb0Var3 = this.$this_loadPlaylistInfo;
        if (Result.a(b) != null) {
            rdi.y(vcb0Var3, new qcw(16));
        }
        return s3q0.a;
    }
}
