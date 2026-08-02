package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: Scrollable.kt */
@b6l(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1150}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class chh0 extends SuspendLambda implements wzs<n160, spj<? super s3q0>, Object> {
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref$FloatRef $previousValue;
    final /* synthetic */ zhh0 $this_semanticsScrollBy;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chh0(zhh0 zhh0Var, long j, Ref$FloatRef ref$FloatRef, spj<? super chh0> spjVar) {
        super(2, spjVar);
        this.$this_semanticsScrollBy = zhh0Var;
        this.$offset = j;
        this.$previousValue = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        chh0 chh0Var = new chh0(this.$this_semanticsScrollBy, this.$offset, this.$previousValue, spjVar);
        chh0Var.L$0 = obj;
        return chh0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(n160 n160Var, spj<? super s3q0> spjVar) {
        return ((chh0) create(n160Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            n160 n160Var = (n160) this.L$0;
            float g = this.$this_semanticsScrollBy.g(this.$offset);
            k3o k3oVar = new k3o(this.$previousValue, this.$this_semanticsScrollBy, n160Var, 7);
            this.label = 1;
            if (nkn0.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, k3oVar, this, 12) == coroutineSingletons) {
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
