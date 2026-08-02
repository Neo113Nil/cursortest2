package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: LayoutResult.kt */
/* loaded from: classes7.dex */
public final class upy {
    public static final upy d = new upy(lzb0.c, kxj0.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final lzb0 a;
    public final kxj0 b;
    public final float c;

    public upy(lzb0 lzb0Var, kxj0 kxj0Var, float f) {
        this.a = lzb0Var;
        this.b = kxj0Var;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upy)) {
            return false;
        }
        upy upyVar = (upy) obj;
        return this.a.equals(upyVar.a) && epx.f(this.b, upyVar.b) && Float.compare(this.c, upyVar.c) == 0 && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + io.reactivex.rxjava3.subjects.b.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutResult(position=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", alpha=");
        return shy.c(this.c, ", z=0.0)", sb);
    }
}
