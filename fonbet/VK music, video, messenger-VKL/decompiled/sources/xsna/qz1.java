package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", l = {1378}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class qz1 extends SuspendLambda implements zzs<fz1, vgo<Object>, Object, spj<? super s3q0>, Object> {
    final /* synthetic */ iq2<Float> $animationSpec;
    final /* synthetic */ f12<Object> $this_animateTo;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz1(f12<Object> f12Var, iq2<Float> iq2Var, spj<? super qz1> spjVar) {
        super(4, spjVar);
        this.$this_animateTo = f12Var;
        this.$animationSpec = iq2Var;
    }

    @Override // xsna.zzs
    public final Object invoke(fz1 fz1Var, vgo<Object> vgoVar, Object obj, spj<? super s3q0> spjVar) {
        qz1 qz1Var = new qz1(this.$this_animateTo, this.$animationSpec, spjVar);
        qz1Var.L$0 = fz1Var;
        qz1Var.L$1 = vgoVar;
        qz1Var.L$2 = obj;
        return qz1Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            fz1 fz1Var = (fz1) this.L$0;
            vgo vgoVar = (vgo) this.L$1;
            Object obj2 = this.L$2;
            f12<Object> f12Var = this.$this_animateTo;
            float floatValue = ((vak0) f12Var.l).getFloatValue();
            iq2<Float> iq2Var = this.$animationSpec;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (lz1.b(f12Var, floatValue, fz1Var, vgoVar, obj2, iq2Var, this) == coroutineSingletons) {
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
