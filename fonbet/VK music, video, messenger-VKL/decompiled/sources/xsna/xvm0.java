package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.video.playlist.playlistscreen.domain.PlaylistDataDo;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenInfoDataState;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SubscribeDelegate.kt */
@b6l(c = "com.vk.video.playlist.playlistscreen.ui.store.delegate.SubscribeDelegateKt$applyUnSubscribe$1", f = "SubscribeDelegate.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class xvm0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ PlaylistScreenInfoDataState $playlistInfoState;
    final /* synthetic */ vcb0 $this_applyUnSubscribe;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvm0(vcb0 vcb0Var, PlaylistScreenInfoDataState playlistScreenInfoDataState, spj<? super xvm0> spjVar) {
        super(2, spjVar);
        this.$this_applyUnSubscribe = vcb0Var;
        this.$playlistInfoState = playlistScreenInfoDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xvm0(this.$this_applyUnSubscribe, this.$playlistInfoState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xvm0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            vcb0 vcb0Var = this.$this_applyUnSubscribe;
            bdb0 bdb0Var = vcb0Var.d;
            PlaylistDataDo playlistDataDo = ((PlaylistScreenInfoDataState.Loaded) this.$playlistInfoState).b;
            UserId userId = playlistDataDo.c;
            int i2 = playlistDataDo.b;
            String str = ((PlaylistScreenState) vcb0Var.b.getCurrentState()).e;
            this.label = 1;
            e = bdb0Var.e(i2, userId, str, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            e = ((Result) obj).d();
        }
        vcb0 vcb0Var2 = this.$this_applyUnSubscribe;
        if (!(e instanceof Result.Failure)) {
            if (((PlaylistScreenState) vcb0Var2.b.getCurrentState()).d instanceof PlaylistScreenInfoDataState.Loaded) {
                yvm0.c(vcb0Var2, false, Boolean.FALSE);
            }
        }
        vcb0 vcb0Var3 = this.$this_applyUnSubscribe;
        Throwable a = Result.a(e);
        if (a != null) {
            yvm0.a(vcb0Var3);
            com.vk.metrics.eventtracking.b.a.a(a);
        }
        return s3q0.a;
    }
}
