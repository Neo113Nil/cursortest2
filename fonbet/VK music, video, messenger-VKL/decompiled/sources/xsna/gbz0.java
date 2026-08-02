package xsna;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class gbz0 extends rgz0 {
    public final long d;
    public long e;

    public gbz0(ziy0 ziy0Var, b6z0 b6z0Var, long j) {
        super(ziy0Var, b6z0Var);
        this.e = 0L;
        this.d = j;
    }

    public final boolean f(boolean z) {
        if (!z) {
            this.e = 0L;
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.e == 0) {
            this.e = currentTimeMillis;
        }
        long j = currentTimeMillis - this.e;
        long j2 = this.d;
        if (j < j2) {
            gu8.c("ViewabilityTracker: ContinuousVisibilityBaseTracker", "view continuous visibility < " + j2 + " millis");
            return false;
        }
        gu8.c("ViewabilityTracker: ContinuousVisibilityBaseTracker", "view continuous visible for " + j2 + " millis");
        return true;
    }
}
