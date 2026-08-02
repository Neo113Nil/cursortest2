package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: SnapFlingBehavior.kt */
@b6l(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {134, 150}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class j9k0 extends SuspendLambda implements wzs<yvj, spj<? super eq2<Float, sq2>>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ izs<Float, s3q0> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ ggh0 $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ m9k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j9k0(m9k0 m9k0Var, float f, izs<? super Float, s3q0> izsVar, ggh0 ggh0Var, spj<? super j9k0> spjVar) {
        super(2, spjVar);
        this.this$0 = m9k0Var;
        this.$initialVelocity = f;
        this.$onRemainingScrollOffsetUpdate = izsVar;
        this.$this_fling = ggh0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new j9k0(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super eq2<Float, sq2>> spjVar) {
        return ((j9k0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r14 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$FloatRef ref$FloatRef;
        j9k0 j9k0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            float b = this.this$0.a.b(this.$initialVelocity, fto0.f(this.this$0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.$initialVelocity));
            if (Float.isNaN(b)) {
                xzw.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            ref$FloatRef = new Ref$FloatRef();
            float signum = Math.signum(this.$initialVelocity) * Math.abs(b);
            ref$FloatRef.element = signum;
            this.$onRemainingScrollOffsetUpdate.invoke(new Float(signum));
            m9k0 m9k0Var = this.this$0;
            ggh0 ggh0Var = this.$this_fling;
            float f = ref$FloatRef.element;
            float f2 = this.$initialVelocity;
            nk0 nk0Var = new nk0(26, ref$FloatRef, this.$onRemainingScrollOffsetUpdate);
            this.L$0 = ref$FloatRef;
            this.label = 1;
            obj = m9k0.c(m9k0Var, ggh0Var, f, f2, nk0Var, this);
            j9k0Var = this;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            kotlin.a.a(obj);
            j9k0Var = this;
        }
        kq2 kq2Var = (kq2) obj;
        float a = j9k0Var.this$0.a.a(((Number) kq2Var.c()).floatValue());
        if (Float.isNaN(a)) {
            xzw.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        ref$FloatRef.element = a;
        ggh0 ggh0Var2 = j9k0Var.$this_fling;
        kq2 c = s1v.c(kq2Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
        iq2<Float> iq2Var = j9k0Var.this$0.c;
        eci0 eci0Var = new eci0(2, ref$FloatRef, j9k0Var.$onRemainingScrollOffsetUpdate);
        j9k0Var.L$0 = null;
        j9k0Var.label = 2;
        Object b2 = r9k0.b(ggh0Var2, a, a, c, iq2Var, eci0Var, j9k0Var);
        return b2 == coroutineSingletons ? coroutineSingletons : b2;
    }
}
