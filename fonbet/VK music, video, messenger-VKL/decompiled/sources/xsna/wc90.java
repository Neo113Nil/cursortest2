package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: LazyLayoutPager.kt */
/* loaded from: classes11.dex */
public final class wc90 implements tpr {
    public final h4o0 a;
    public final mc90 b;

    public wc90(h4o0 h4o0Var, mc90 mc90Var) {
        this.a = h4o0Var;
        this.b = mc90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ggh0 ggh0Var, float f, ContinuationImpl continuationImpl) {
        vc90 vc90Var;
        int i;
        mc90 mc90Var;
        if (continuationImpl instanceof vc90) {
            vc90Var = (vc90) continuationImpl;
            int i2 = vc90Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vc90Var.label = i2 - Integer.MIN_VALUE;
                Object obj = vc90Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vc90Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    hl1 hl1Var = new hl1(25, this, ggh0Var);
                    vc90Var.label = 1;
                    obj = this.a.b(ggh0Var, f, hl1Var, vc90Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                float floatValue = ((Number) obj).floatValue();
                mc90Var = this.b;
                if (mc90Var.l() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Math.abs(mc90Var.l()) < 0.001d) {
                    mc90.u(mc90Var, mc90Var.k());
                } else {
                    new Float(mc90Var.l());
                }
                return new Float(floatValue);
            }
        }
        vc90Var = new vc90(this, continuationImpl);
        Object obj2 = vc90Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vc90Var.label;
        if (i != 0) {
        }
        float floatValue2 = ((Number) obj2).floatValue();
        mc90Var = this.b;
        if (mc90Var.l() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            mc90.u(mc90Var, mc90Var.k());
            return new Float(floatValue2);
        }
        new Float(mc90Var.l());
        return new Float(floatValue2);
    }
}
