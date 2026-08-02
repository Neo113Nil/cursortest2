package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", l = {473}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class e02 extends SuspendLambda implements yzs<fz1, vgo<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ Ref$FloatRef $leftoverVelocity;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ androidx.compose.foundation.gestures.c<Object> this$0;

    /* compiled from: AnchoredDraggable.kt */
    public static final class a implements ggh0 {
        public final /* synthetic */ androidx.compose.foundation.gestures.c<Object> a;
        public final /* synthetic */ fz1 b;

        public a(androidx.compose.foundation.gestures.c<Object> cVar, fz1 fz1Var) {
            this.a = cVar;
            this.b = fz1Var;
        }

        @Override // xsna.ggh0
        public final float f(float f) {
            androidx.compose.foundation.gestures.c<Object> cVar = this.a;
            float e = cVar.K.e(f);
            float floatValue = e - ((vak0) cVar.K.j).getFloatValue();
            this.b.a(e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return floatValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e02(androidx.compose.foundation.gestures.c<Object> cVar, Ref$FloatRef ref$FloatRef, float f, spj<? super e02> spjVar) {
        super(3, spjVar);
        this.this$0 = cVar;
        this.$leftoverVelocity = ref$FloatRef;
        this.$velocity = f;
    }

    @Override // xsna.yzs
    public final Object invoke(fz1 fz1Var, vgo<Object> vgoVar, spj<? super s3q0> spjVar) {
        e02 e02Var = new e02(this.this$0, this.$leftoverVelocity, this.$velocity, spjVar);
        e02Var.L$0 = fz1Var;
        return e02Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$FloatRef ref$FloatRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            fz1 fz1Var = (fz1) this.L$0;
            androidx.compose.foundation.gestures.c<Object> cVar = this.this$0;
            a aVar = new a(cVar, fz1Var);
            tpr tprVar = cVar.M;
            if (tprVar == null) {
                tprVar = null;
            }
            Ref$FloatRef ref$FloatRef2 = this.$leftoverVelocity;
            float f = this.$velocity;
            this.L$0 = ref$FloatRef2;
            this.label = 1;
            obj = tprVar.a(aVar, f, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            kotlin.a.a(obj);
        }
        ref$FloatRef.element = ((Number) obj).floatValue();
        return s3q0.a;
    }
}
