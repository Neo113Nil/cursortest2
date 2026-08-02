package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: AutoEnhanceParams.kt */
/* loaded from: classes4.dex */
public final class ag5 implements g5p {
    public final float a;

    public ag5(float f) {
        this.a = f;
    }

    @Override // xsna.g5p
    public final boolean I() {
        return this.a == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag5) && Float.compare(this.a, ((ag5) obj).a) == 0;
    }

    @Override // xsna.g5p
    public final f5p getId() {
        return hg5.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AutoEnhanceParams(intensity=" + this.a + ")";
    }
}
