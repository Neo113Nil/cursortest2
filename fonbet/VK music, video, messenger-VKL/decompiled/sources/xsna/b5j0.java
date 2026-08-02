package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ShadowLayerInfo.kt */
/* loaded from: classes18.dex */
public final class b5j0 {
    public float a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public int b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5j0)) {
            return false;
        }
        b5j0 b5j0Var = (b5j0) obj;
        b5j0Var.getClass();
        return Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(this.a, b5j0Var.a) == 0 && this.b == b5j0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + io.reactivex.rxjava3.subjects.b.a(this.a, io.reactivex.rxjava3.subjects.b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, io.reactivex.rxjava3.subjects.b.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Boolean.hashCode(false) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowLayerInfo(shouldDrawShadow=false, shadowDx=0.0, shadowDy=0.0, radius=");
        sb.append(this.a);
        sb.append(", color=");
        return vu5.b(sb, this.b, ')');
    }
}
