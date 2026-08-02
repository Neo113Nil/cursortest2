package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: RectSize.kt */
/* loaded from: classes4.dex */
public final class kif0 {
    public static final kif0 c = new kif0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final float a;
    public final float b;

    public kif0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static kif0 a(kif0 kif0Var) {
        float f = kif0Var.a;
        float f2 = kif0Var.b;
        kif0Var.getClass();
        return new kif0(f, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kif0)) {
            return false;
        }
        kif0 kif0Var = (kif0) obj;
        return Float.compare(this.a, kif0Var.a) == 0 && Float.compare(this.b, kif0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RectSize(width=" + this.a + ", height=" + this.b + ")";
    }
}
