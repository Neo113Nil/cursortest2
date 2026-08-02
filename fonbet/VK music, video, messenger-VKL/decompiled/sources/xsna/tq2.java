package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: AnimationVectors.kt */
/* loaded from: classes11.dex */
public final class tq2 extends wq2 {
    public float a;
    public float b;
    public final int c = 2;

    public tq2(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // xsna.wq2
    public final float a(int i) {
        return i != 0 ? i != 1 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.b : this.a;
    }

    @Override // xsna.wq2
    public final int b() {
        return this.c;
    }

    @Override // xsna.wq2
    public final wq2 c() {
        return new tq2(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.wq2
    public final void d() {
        this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.wq2
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tq2)) {
            return false;
        }
        tq2 tq2Var = (tq2) obj;
        return tq2Var.a == this.a && tq2Var.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
