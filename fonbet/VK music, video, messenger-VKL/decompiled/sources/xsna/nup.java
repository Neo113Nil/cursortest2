package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: EqualizerSlider.kt */
@b6l(c = "com.vk.music.design.compose.equalizer.EqualizerSliderKt$EqualizerSlider$dragModifier$1$1", f = "EqualizerSlider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class nup extends SuspendLambda implements yzs<yvj, Float, spj<? super s3q0>, Object> {
    final /* synthetic */ l06 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nup(l06 l06Var, spj<? super nup> spjVar) {
        super(3, spjVar);
        this.$state = l06Var;
    }

    @Override // xsna.yzs
    public final Object invoke(yvj yvjVar, Float f, spj<? super s3q0> spjVar) {
        f.floatValue();
        return new nup(this.$state, spjVar).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$state.m.invoke();
        return s3q0.a;
    }
}
