package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: CLNumber.java */
/* loaded from: classes11.dex */
public final class av8 extends yu8 {
    public float f;

    public av8(float f) {
        super(null);
        this.f = f;
    }

    @Override // xsna.yu8
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof av8) {
            float j = j();
            float j2 = ((av8) obj).j();
            if ((Float.isNaN(j) && Float.isNaN(j2)) || j == j2) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.yu8
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        float f = this.f;
        return hashCode + (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f) : 0);
    }

    @Override // xsna.yu8
    public final float j() {
        char[] cArr;
        if (Float.isNaN(this.f) && (cArr = this.b) != null && cArr.length >= 1) {
            this.f = Float.parseFloat(i());
        }
        return this.f;
    }

    @Override // xsna.yu8
    public final int k() {
        char[] cArr;
        if (Float.isNaN(this.f) && (cArr = this.b) != null && cArr.length >= 1) {
            this.f = Integer.parseInt(i());
        }
        return (int) this.f;
    }
}
