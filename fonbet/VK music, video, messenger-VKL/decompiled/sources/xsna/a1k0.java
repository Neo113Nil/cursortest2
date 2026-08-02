package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Slider.kt */
@b6l(c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class a1k0 extends SuspendLambda implements yzs<yvj, Float, spj<? super s3q0>, Object> {
    final /* synthetic */ g1k0 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1k0(g1k0 g1k0Var, spj<? super a1k0> spjVar) {
        super(3, spjVar);
        this.$state = g1k0Var;
    }

    @Override // xsna.yzs
    public final Object invoke(yvj yvjVar, Float f, spj<? super s3q0> spjVar) {
        f.floatValue();
        return new a1k0(this.$state, spjVar).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$state.n.invoke();
        return s3q0.a;
    }
}
