package androidx.compose.animation;

import defpackage.lg2;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.sls;
import defpackage.w6f0;
import defpackage.wls;
import defpackage.zx01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw6f0;", "", "Lzy11;", "<anonymous>", "(Lw6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {746}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ zx01 $childTransition;
    final /* synthetic */ m3u0 $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(zx01 zx01Var, m3u0 m3u0Var, Continuation continuation) {
        super(2, continuation);
        this.$childTransition = zx01Var;
        this.$shouldDisposeBlockUpdated$delegate = m3u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, continuation);
        animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.L$0 = obj;
        return animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1) create((w6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            w6f0 w6f0Var = (w6f0) this.L$0;
            final zx01 zx01Var = this.$childTransition;
            rol0 o = androidx.compose.runtime.f.o(new sls() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    zx01 zx01Var2 = zx01.this;
                    Object c = zx01Var2.c();
                    EnterExitState enterExitState = EnterExitState.PostExit;
                    return Boolean.valueOf(c == enterExitState && zx01Var2.d.getValue() == enterExitState);
                }
            });
            lg2 lg2Var = new lg2(0, w6f0Var, this.$childTransition, this.$shouldDisposeBlockUpdated$delegate);
            this.label = 1;
            if (o.collect(lg2Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
