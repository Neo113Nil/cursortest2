package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: AnimationVectors.kt */
/* loaded from: classes11.dex */
public final class vq2 extends wq2 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final int e = 4;

    public vq2(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // xsna.wq2
    public final float a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.d : this.c : this.b : this.a;
    }

    @Override // xsna.wq2
    public final int b() {
        return this.e;
    }

    @Override // xsna.wq2
    public final wq2 c() {
        return new vq2(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.wq2
    public final void d() {
        this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.wq2
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vq2)) {
            return false;
        }
        vq2 vq2Var = (vq2) obj;
        return vq2Var.a == this.a && vq2Var.b == this.b && vq2Var.c == this.c && vq2Var.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
