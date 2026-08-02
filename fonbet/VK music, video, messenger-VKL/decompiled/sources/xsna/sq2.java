package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: AnimationVectors.kt */
/* loaded from: classes11.dex */
public final class sq2 extends wq2 {
    public float a;
    public final int b = 1;

    public sq2(float f) {
        this.a = f;
    }

    @Override // xsna.wq2
    public final float a(int i) {
        return i == 0 ? this.a : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.wq2
    public final int b() {
        return this.b;
    }

    @Override // xsna.wq2
    public final wq2 c() {
        return new sq2(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.wq2
    public final void d() {
        this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.wq2
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sq2) && ((sq2) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
