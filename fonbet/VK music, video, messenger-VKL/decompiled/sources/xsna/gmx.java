package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InternalSlider.kt */
@b6l(c = "com.vk.core.compose.component.internal.InternalSliderKt$InternalSlider$3$drag$1$1", f = "InternalSlider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class gmx extends SuspendLambda implements yzs<yvj, Float, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<gzs<s3q0>> $gestureEndAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gmx(mtk0<? extends gzs<s3q0>> mtk0Var, spj<? super gmx> spjVar) {
        super(3, spjVar);
        this.$gestureEndAction = mtk0Var;
    }

    @Override // xsna.yzs
    public final Object invoke(yvj yvjVar, Float f, spj<? super s3q0> spjVar) {
        f.floatValue();
        return new gmx(this.$gestureEndAction, spjVar).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$gestureEndAction.getValue().invoke();
        return s3q0.a;
    }
}
