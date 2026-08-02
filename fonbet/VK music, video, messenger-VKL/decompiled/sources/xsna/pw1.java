package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TimePicker.kt */
@b6l(c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", f = "TimePicker.kt", l = {823, 826}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class pw1 extends SuspendLambda implements izs<spj<? super Object>, Object> {
    final /* synthetic */ float $angle;
    final /* synthetic */ boolean $animate;
    final /* synthetic */ iq2<Float> $animationSpec;
    int label;
    final /* synthetic */ qw1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw1(qw1 qw1Var, float f, boolean z, iq2<Float> iq2Var, spj<? super pw1> spjVar) {
        super(1, spjVar);
        this.this$0 = qw1Var;
        this.$angle = f;
        this.$animate = z;
        this.$animationSpec = iq2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new pw1(this.this$0, this.$angle, this.$animate, this.$animationSpec, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super Object> spjVar) {
        return ((pw1) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        if (r13.e(r1, r12) == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.this$0.a.a() == 0) {
                qw1 qw1Var = this.this$0;
                float f = this.$angle;
                qw1Var.getClass();
                double d = 0.2617994f + 1.5707963267948966d;
                double d2 = 0.5235988f;
                qw1Var.d = ((((int) ((f + d) / d2)) % 12) % 12) * 0.5235988f;
                qw1 qw1Var2 = this.this$0;
                qw1Var2.a.e(((((int) ((qw1Var2.d + d) / d2)) % 12) % 12) + (kuo0.r(qw1Var2) ? 12 : 0));
            } else {
                qw1 qw1Var3 = this.this$0;
                float f2 = this.$angle;
                qw1Var3.getClass();
                double d3 = 0.10471976f;
                qw1Var3.e = (((int) ((f2 + r6) / d3)) % 60) * 0.10471976f;
                qw1 qw1Var4 = this.this$0;
                qw1Var4.a.f(((int) ((qw1Var4.e + (0.05235988f + 1.5707963267948966d)) / d3)) % 60);
            }
            if (this.$animate) {
                qw1 qw1Var5 = this.this$0;
                float f3 = this.$angle;
                qw1Var5.getClass();
                float f4 = f3 + 1.5707964f;
                if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f4 += 6.2831855f;
                }
                float h = qw1Var5.h(f4);
                if2<Float, sq2> if2Var = this.this$0.f;
                Float f5 = new Float(h);
                iq2<Float> iq2Var = this.$animationSpec;
                this.label = 2;
                Object c = if2.c(if2Var, f5, iq2Var, null, this, 12);
                if (c != coroutineSingletons) {
                    return c;
                }
            } else {
                if2<Float, sq2> if2Var2 = this.this$0.f;
                float f6 = this.$angle + 1.5707964f;
                if (f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f6 += 6.2831855f;
                }
                Float f7 = new Float(f6);
                this.label = 1;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        return s3q0.a;
    }
}
