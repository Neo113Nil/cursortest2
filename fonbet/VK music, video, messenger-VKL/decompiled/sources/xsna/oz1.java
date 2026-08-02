package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "com.vk.core.compose.component.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {697}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class oz1 extends SuspendLambda implements zzs<ez1, ugo<Object>, Object, spj<? super s3q0>, Object> {
    final /* synthetic */ e12<Object> $this_animateTo;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz1(e12<Object> e12Var, float f, spj<? super oz1> spjVar) {
        super(4, spjVar);
        this.$this_animateTo = e12Var;
        this.$velocity = f;
    }

    @Override // xsna.zzs
    public final Object invoke(ez1 ez1Var, ugo<Object> ugoVar, Object obj, spj<? super s3q0> spjVar) {
        oz1 oz1Var = new oz1(this.$this_animateTo, this.$velocity, spjVar);
        oz1Var.L$0 = ez1Var;
        oz1Var.L$1 = ugoVar;
        oz1Var.L$2 = obj;
        return oz1Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ez1 ez1Var = (ez1) this.L$0;
            float c = ((ugo) this.L$1).c(this.L$2);
            if (!Float.isNaN(c)) {
                Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                float floatValue = Float.isNaN(((vak0) this.$this_animateTo.i).getFloatValue()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((vak0) this.$this_animateTo.i).getFloatValue();
                ref$FloatRef.element = floatValue;
                float f = this.$velocity;
                this.$this_animateTo.getClass();
                xmk0<Float> xmk0Var = gz1.a;
                mz1 mz1Var = new mz1(0, ez1Var, ref$FloatRef);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (nkn0.a(floatValue, c, f, xmk0Var, mz1Var, this) == coroutineSingletons) {
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
