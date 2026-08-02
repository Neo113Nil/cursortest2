package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlaybackQueue.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueue$QueueScaffold$2$1", f = "PlaybackQueue.kt", l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class fxa0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isOnScreen;
    final /* synthetic */ xvy $listState;
    final /* synthetic */ rg50 $scrollToItemIndex$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxa0(boolean z, xvy xvyVar, rg50 rg50Var, spj<? super fxa0> spjVar) {
        super(2, spjVar);
        this.$isOnScreen = z;
        this.$listState = xvyVar;
        this.$scrollToItemIndex$delegate = rg50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new fxa0(this.$isOnScreen, this.$listState, this.$scrollToItemIndex$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((fxa0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$isOnScreen) {
                xvy xvyVar = this.$listState;
                int intValue = this.$scrollToItemIndex$delegate.getIntValue();
                this.label = 1;
                fh9 fh9Var = xvy.y;
                if (xvyVar.f(intValue, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
