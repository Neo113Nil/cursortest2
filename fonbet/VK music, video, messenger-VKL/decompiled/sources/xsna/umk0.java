package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DragCancelledAnimation.kt */
/* loaded from: classes17.dex */
public final class umk0 {
    public final if2<ov70, tq2> a = new if2<>(new ov70(0), rte0.j, null, 12);
    public final wh50 b = androidx.compose.runtime.k.b(null);

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
    
        if (xsna.if2.c(r18.a, r3, r7, null, r9, 12) != r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r18.a.e(r3, r9) == r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zux zuxVar, long j, ContinuationImpl continuationImpl) {
        tmk0 tmk0Var;
        int i;
        long j2 = j;
        if (continuationImpl instanceof tmk0) {
            tmk0Var = (tmk0) continuationImpl;
            int i2 = tmk0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tmk0Var.label = i2 - Integer.MIN_VALUE;
                tmk0 tmk0Var2 = tmk0Var;
                Object obj = tmk0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tmk0Var2.label;
                wh50 wh50Var = this.b;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ((zak0) wh50Var).setValue(zuxVar);
                    ov70 ov70Var = new ov70(j2);
                    tmk0Var2.L$0 = null;
                    tmk0Var2.J$0 = j2;
                    tmk0Var2.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        ((zak0) wh50Var).setValue(null);
                        return s3q0.a;
                    }
                    j2 = tmk0Var2.J$0;
                    kotlin.a.a(obj);
                }
                ov70 ov70Var2 = new ov70(0L);
                xmk0 c = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new ov70((Float.floatToRawIntBits(1.0f) & 4294967295L) | (Float.floatToRawIntBits(1.0f) << 32)), 1);
                tmk0Var2.L$0 = null;
                tmk0Var2.J$0 = j2;
                tmk0Var2.label = 2;
            }
        }
        tmk0Var = new tmk0(this, continuationImpl);
        tmk0 tmk0Var22 = tmk0Var;
        Object obj2 = tmk0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tmk0Var22.label;
        wh50 wh50Var2 = this.b;
        if (i != 0) {
        }
        ov70 ov70Var22 = new ov70(0L);
        xmk0 c2 = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new ov70((Float.floatToRawIntBits(1.0f) & 4294967295L) | (Float.floatToRawIntBits(1.0f) << 32)), 1);
        tmk0Var22.L$0 = null;
        tmk0Var22.J$0 = j2;
        tmk0Var22.label = 2;
    }

    public final long b() {
        return this.a.d().a;
    }
}
