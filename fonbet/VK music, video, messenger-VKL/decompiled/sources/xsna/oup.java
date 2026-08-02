package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: EqualizerSlider.kt */
/* loaded from: classes3.dex */
public final class oup implements PointerInputEventHandler {
    public final /* synthetic */ l06 a;

    /* compiled from: EqualizerSlider.kt */
    @b6l(c = "com.vk.music.design.compose.equalizer.EqualizerSliderKt$EqualizerSlider$tapModifier$1$1$1", f = "EqualizerSlider.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements yzs<j2d0, ov70, spj<? super s3q0>, Object> {
        final /* synthetic */ l06 $state;
        /* synthetic */ long J$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l06 l06Var, spj<? super a> spjVar) {
            super(3, spjVar);
            this.$state = l06Var;
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
            long j = this.J$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            l06 l06Var = this.$state;
            ((vak0) l06Var.k).g(((vak0) l06Var.l).getFloatValue() - (((wak0) l06Var.i).getIntValue() - Float.intBitsToFloat((int) (j & 4294967295L))));
            return s3q0.a;
        }
    }

    public oup(l06 l06Var) {
        this.a = l06Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        l06 l06Var = this.a;
        Object e = z2o0.e(dmb0Var, null, new a(l06Var, null), new mre(l06Var, 17), spjVar, 3);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
    }
}
