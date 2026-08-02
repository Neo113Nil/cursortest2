package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o2d0;

/* compiled from: Button.kt */
@b6l(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", l = {998, 1007}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class rp8 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ if2<pco, sq2> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ vax $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ sp8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp8(if2<pco, sq2> if2Var, float f, boolean z, sp8 sp8Var, vax vaxVar, spj<? super rp8> spjVar) {
        super(2, spjVar);
        this.$animatable = if2Var;
        this.$target = f;
        this.$enabled = z;
        this.this$0 = sp8Var;
        this.$interaction = vaxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rp8(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rp8) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r6.e(r2, r5) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        if (xsna.ebp.a(r1, r3, r6, r4, r5) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vax pvrVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (!pco.b(((pco) ((zak0) this.$animatable.e).getValue()).b, this.$target)) {
                if (this.$enabled) {
                    float f = ((pco) ((zak0) this.$animatable.e).getValue()).b;
                    this.this$0.getClass();
                    if (pco.b(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                        pvrVar = new o2d0.b(0L);
                    } else {
                        this.this$0.getClass();
                        if (pco.b(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                            pvrVar = new lgv();
                        } else {
                            this.this$0.getClass();
                            pvrVar = pco.b(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? new pvr() : null;
                        }
                    }
                    if2<pco, sq2> if2Var = this.$animatable;
                    float f2 = this.$target;
                    vax vaxVar = this.$interaction;
                    this.label = 2;
                } else {
                    if2<pco, sq2> if2Var2 = this.$animatable;
                    pco pcoVar = new pco(this.$target);
                    this.label = 1;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
