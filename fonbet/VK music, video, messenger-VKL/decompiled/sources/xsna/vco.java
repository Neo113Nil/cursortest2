package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: TouchBoundsExpansion.kt */
/* loaded from: classes11.dex */
public final class vco {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public vco(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            uzw.a("Left must be non-negative");
        }
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            uzw.a("Top must be non-negative");
        }
        if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            uzw.a("Right must be non-negative");
        }
        if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        uzw.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vco)) {
            return false;
        }
        vco vcoVar = (vco) obj;
        return pco.b(this.a, vcoVar.a) && pco.b(this.b, vcoVar.b) && pco.b(this.c, vcoVar.c) && pco.b(this.d, vcoVar.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DpTouchBoundsExpansion(start=");
        oq.f(this.a, ", top=", sb);
        oq.f(this.b, ", end=", sb);
        oq.f(this.c, ", bottom=", sb);
        sb.append((Object) pco.c(this.d));
        sb.append(", isLayoutDirectionAware=true)");
        return sb.toString();
    }
}
