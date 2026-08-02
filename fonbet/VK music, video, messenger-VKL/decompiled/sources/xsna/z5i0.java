package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SegmentedSlider.kt */
@b6l(c = "com.vk.libvideo.design.compose.base.timeline.SegmentedSliderKt$SegmentedSlider$2$drag$1$1", f = "SegmentedSlider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z5i0 extends SuspendLambda implements yzs<yvj, Float, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<izs<Float, s3q0>> $gestureEndAction;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z5i0(mtk0<? extends izs<? super Float, s3q0>> mtk0Var, spj<? super z5i0> spjVar) {
        super(3, spjVar);
        this.$gestureEndAction = mtk0Var;
    }

    @Override // xsna.yzs
    public final Object invoke(yvj yvjVar, Float f, spj<? super s3q0> spjVar) {
        float floatValue = f.floatValue();
        z5i0 z5i0Var = new z5i0(this.$gestureEndAction, spjVar);
        z5i0Var.F$0 = floatValue;
        return z5i0Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f = this.F$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$gestureEndAction.getValue().invoke(new Float(f));
        return s3q0.a;
    }
}
