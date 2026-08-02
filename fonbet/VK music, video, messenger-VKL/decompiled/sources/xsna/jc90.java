package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: PagerState.kt */
@b6l(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {672}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class jc90 extends SuspendLambda implements wzs<ggh0, spj<? super s3q0>, Object> {
    final /* synthetic */ iq2<Float> $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ float $targetPageOffsetToSnappedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ mc90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc90(mc90 mc90Var, int i, float f, iq2<Float> iq2Var, spj<? super jc90> spjVar) {
        super(2, spjVar);
        this.this$0 = mc90Var;
        this.$targetPage = i;
        this.$targetPageOffsetToSnappedPosition = f;
        this.$animationSpec = iq2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        jc90 jc90Var = new jc90(this.this$0, this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, spjVar);
        jc90Var.L$0 = obj;
        return jc90Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ggh0 ggh0Var, spj<? super s3q0> spjVar) {
        return ((jc90) create(ggh0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r2 < r1) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.a.a(obj);
            ggh0 ggh0Var = (ggh0) this.L$0;
            mc90 mc90Var = this.this$0;
            ac90 ac90Var = new ac90(ggh0Var, mc90Var);
            int i4 = this.$targetPage;
            float f = this.$targetPageOffsetToSnappedPosition;
            iq2<Float> iq2Var = this.$animationSpec;
            this.label = 1;
            float f2 = rc90.a;
            ((wak0) mc90Var.q).C(mc90Var.j(new Integer(i4).intValue()));
            s3q0 s3q0Var = s3q0.a;
            boolean z = i4 > mc90Var.e;
            int c = (ac90Var.c() - mc90Var.e) + 1;
            if (((z && i4 > ac90Var.c()) || (!z && i4 < mc90Var.e)) && Math.abs(i4 - mc90Var.e) >= 3) {
                if (z) {
                    i2 = i4 - c;
                    i = mc90Var.e;
                } else {
                    int i5 = c + i4;
                    i = mc90Var.e;
                    if (i5 <= i) {
                        i2 = i5;
                        ac90Var.d(i2, 0);
                    }
                    i2 = i;
                    ac90Var.d(i2, 0);
                }
            }
            Object c2 = nkn0.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ac90Var.e(i4) + f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iq2Var, new e7c(5, new Ref$FloatRef(), ac90Var), this, 4);
            if (c2 != obj2) {
                c2 = s3q0.a;
            }
            if (c2 == obj2) {
                return obj2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
