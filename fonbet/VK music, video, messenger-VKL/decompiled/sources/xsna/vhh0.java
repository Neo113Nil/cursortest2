package xsna;

import androidx.compose.foundation.gestures.FlingCancellationException;
import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

/* compiled from: Scrollable.kt */
@b6l(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {921}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class vhh0 extends SuspendLambda implements wzs<n160, spj<? super s3q0>, Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref$LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ zhh0 this$0;

    /* compiled from: Scrollable.kt */
    public static final class a implements ggh0 {
        public final /* synthetic */ zhh0 a;
        public final /* synthetic */ n160 b;

        public a(zhh0 zhh0Var, n160 n160Var) {
            this.a = zhh0Var;
            this.b = n160Var;
        }

        @Override // xsna.ggh0
        public final float f(float f) {
            float abs = Math.abs(f);
            zhh0 zhh0Var = this.a;
            if (abs != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !((Boolean) zhh0Var.h.invoke()).booleanValue()) {
                throw new FlingCancellationException();
            }
            return zhh0Var.d(zhh0Var.g(this.b.a(2, zhh0Var.e(zhh0Var.h(f)))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhh0(zhh0 zhh0Var, Ref$LongRef ref$LongRef, long j, spj<? super vhh0> spjVar) {
        super(2, spjVar);
        this.this$0 = zhh0Var;
        this.$result = ref$LongRef;
        this.$available = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        vhh0 vhh0Var = new vhh0(this.this$0, this.$result, this.$available, spjVar);
        vhh0Var.L$0 = obj;
        return vhh0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(n160 n160Var, spj<? super s3q0> spjVar) {
        return ((vhh0) create(n160Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zhh0 zhh0Var;
        Ref$LongRef ref$LongRef;
        zhh0 zhh0Var2;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            n160 n160Var = (n160) this.L$0;
            zhh0Var = this.this$0;
            a aVar = new a(zhh0Var, n160Var);
            ref$LongRef = this.$result;
            long j2 = this.$available;
            tpr tprVar = zhh0Var.c;
            long j3 = ref$LongRef.element;
            float d = zhh0Var.d(zhh0Var.d == Orientation.Horizontal ? jmr0.b(j2) : jmr0.c(j2));
            this.L$0 = zhh0Var;
            this.L$1 = zhh0Var;
            this.L$2 = ref$LongRef;
            this.J$0 = j3;
            this.label = 1;
            obj = tprVar.a(aVar, d, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            zhh0Var2 = zhh0Var;
            j = j3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            ref$LongRef = (Ref$LongRef) this.L$2;
            zhh0Var = (zhh0) this.L$1;
            zhh0Var2 = (zhh0) this.L$0;
            kotlin.a.a(obj);
        }
        float d2 = zhh0Var2.d(((Number) obj).floatValue());
        ref$LongRef.element = zhh0Var.d == Orientation.Horizontal ? jmr0.a(j, d2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2) : jmr0.a(j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d2, 1);
        return s3q0.a;
    }
}
