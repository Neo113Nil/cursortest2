package yads;

import com.unity3d.services.UnityAdsConstants;
import xsna.bxj0;

/* loaded from: classes10.dex */
public final class wg0 {
    public static final wg0 g = new wg0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public wg0(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final float a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg0)) {
            return false;
        }
        wg0 wg0Var = (wg0) obj;
        return Float.compare(this.a, wg0Var.a) == 0 && Float.compare(this.b, wg0Var.b) == 0 && Float.compare(this.c, wg0Var.c) == 0 && Float.compare(this.d, wg0Var.d) == 0 && Float.compare(this.e, wg0Var.e) == 0 && Float.compare(this.f, wg0Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        float f5 = this.e;
        float f6 = this.f;
        StringBuilder a = bxj0.a("DisplayInsetsF(left=", f, ", top=", f2, ", right=");
        xsna.gq.h(a, f3, ", bottom=", f4, ", cutoutTop=");
        a.append(f5);
        a.append(", cutoutBottom=");
        a.append(f6);
        a.append(")");
        return a.toString();
    }
}
