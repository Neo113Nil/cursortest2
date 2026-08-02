package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Slider.kt */
/* loaded from: classes11.dex */
public final class c1k0 implements PointerInputEventHandler {
    public final /* synthetic */ g1k0 a;

    /* compiled from: Slider.kt */
    @b6l(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements yzs<j2d0, ov70, spj<? super s3q0>, Object> {
        final /* synthetic */ g1k0 $state;
        /* synthetic */ long J$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g1k0 g1k0Var, spj<? super a> spjVar) {
            super(3, spjVar);
            this.$state = g1k0Var;
        }

        @Override // xsna.yzs
        public final Object invoke(j2d0 j2d0Var, ov70 ov70Var, spj<? super s3q0> spjVar) {
            long j = ov70Var.a;
            a aVar = new a(this.$state, spjVar);
            aVar.J$0 = j;
            return aVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            long j = this.J$0;
            g1k0 g1k0Var = this.$state;
            ((vak0) g1k0Var.p).g((g1k0Var.l == Orientation.Vertical ? Float.intBitsToFloat((int) (j & 4294967295L)) : g1k0Var.i ? ((wak0) g1k0Var.g).getIntValue() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32))) - ((vak0) g1k0Var.o).getFloatValue());
            return s3q0.a;
        }
    }

    public c1k0(g1k0 g1k0Var) {
        this.a = g1k0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        g1k0 g1k0Var = this.a;
        Object e = z2o0.e(dmb0Var, null, new a(g1k0Var, null), new ggb0(g1k0Var, 12), spjVar, 3);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
    }
}
