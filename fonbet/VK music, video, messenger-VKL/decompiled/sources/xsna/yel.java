package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: Scrollable.kt */
@b6l(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {1079}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class yel extends SuspendLambda implements wzs<yvj, spj<? super Float>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ ggh0 $this_performFling;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ zel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yel(float f, zel zelVar, ggh0 ggh0Var, spj<? super yel> spjVar) {
        super(2, spjVar);
        this.$initialVelocity = f;
        this.this$0 = zelVar;
        this.$this_performFling = ggh0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new yel(this.$initialVelocity, this.this$0, this.$this_performFling, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Float> spjVar) {
        return ((yel) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f;
        kq2 kq2Var;
        Ref$FloatRef ref$FloatRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (Math.abs(this.$initialVelocity) <= 1.0f) {
                f = this.$initialVelocity;
                return new Float(f);
            }
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            ref$FloatRef2.element = this.$initialVelocity;
            Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
            kq2 a = s1v.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.$initialVelocity, 28);
            try {
                zel zelVar = this.this$0;
                l7l<Float> l7lVar = zelVar.a;
                aa5 aa5Var = new aa5(ref$FloatRef3, this.$this_performFling, ref$FloatRef2, zelVar, 3);
                this.L$0 = ref$FloatRef2;
                this.L$1 = a;
                this.label = 1;
                if (nkn0.d(a, l7lVar, false, aa5Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$FloatRef = ref$FloatRef2;
            } catch (CancellationException unused) {
                kq2Var = a;
                ref$FloatRef = ref$FloatRef2;
                ref$FloatRef.element = ((Number) kq2Var.c()).floatValue();
                f = ref$FloatRef.element;
                return new Float(f);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kq2Var = (kq2) this.L$1;
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            try {
                kotlin.a.a(obj);
            } catch (CancellationException unused2) {
                ref$FloatRef.element = ((Number) kq2Var.c()).floatValue();
                f = ref$FloatRef.element;
                return new Float(f);
            }
        }
        f = ref$FloatRef.element;
        return new Float(f);
    }
}
