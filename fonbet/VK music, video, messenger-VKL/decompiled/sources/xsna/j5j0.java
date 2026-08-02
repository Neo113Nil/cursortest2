package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ShakeModifier.kt */
@b6l(c = "com.vk.biometrics.lock.impl.presentation.base.mvi.pin.animation.modifier.ShakeModifierKt$shake$1$1$1$1", f = "ShakeModifier.kt", l = {20, 25}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class j5j0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ if2<Float, sq2> $shake;
    final /* synthetic */ e5j0 $shakeConfig;
    int I$0;
    int I$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5j0(e5j0 e5j0Var, if2<Float, sq2> if2Var, spj<? super j5j0> spjVar) {
        super(2, spjVar);
        this.$shakeConfig = e5j0Var;
        this.$shake = if2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new j5j0(this.$shakeConfig, this.$shake, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((j5j0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (xsna.if2.c(r6, r7, r8, null, r10, 12) != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (xsna.if2.c(r6, r7, null, null, r10, 14) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0058 -> B:12:0x005b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        j5j0 j5j0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.a.a(obj);
            this.$shakeConfig.getClass();
            i = 4;
            i2 = 0;
            if2<Float, sq2> if2Var = this.$shake;
            Float f = new Float(i2 % 2 != 0 ? 1.0f : -1.0f);
            this.$shakeConfig.getClass();
            xmk0 c = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100000.0f, null, 5);
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 1;
            j5j0Var = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            i = this.I$1;
            i2 = this.I$0;
            kotlin.a.a(obj);
            j5j0Var = this;
            if (i2 != i) {
                i2++;
                if2<Float, sq2> if2Var2 = this.$shake;
                Float f2 = new Float(i2 % 2 != 0 ? 1.0f : -1.0f);
                this.$shakeConfig.getClass();
                xmk0 c2 = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100000.0f, null, 5);
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 1;
                j5j0Var = this;
            } else {
                if2<Float, sq2> if2Var3 = j5j0Var.$shake;
                Float f3 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                j5j0Var.label = 2;
            }
        }
    }
}
