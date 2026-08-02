package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RadioWithBottomPlayer.kt */
@b6l(c = "com.vk.music.stickyplayer.presentation.RadioWithBottomPlayerKt$RadioContent$2$1", f = "RadioWithBottomPlayer.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class xve0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ s7k0 $snackbarEvent;
    final /* synthetic */ dlv0 $snackbarHostState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xve0(dlv0 dlv0Var, s7k0 s7k0Var, spj<? super xve0> spjVar) {
        super(2, spjVar);
        this.$snackbarHostState = dlv0Var;
        this.$snackbarEvent = s7k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xve0(this.$snackbarHostState, this.$snackbarEvent, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xve0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            dlv0 dlv0Var = this.$snackbarHostState;
            String s7k0Var = this.$snackbarEvent.toString();
            this.label = 1;
            if (dlv0.d(dlv0Var, s7k0Var, null, this, 30) == coroutineSingletons) {
                return coroutineSingletons;
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
