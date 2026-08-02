package yads;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import xsna.epx;

/* loaded from: classes10.dex */
public final class ve1 {
    public final int a;
    public final Class b = ExtendedNativeAdView.class;
    public final zf0 c;
    public final ag0 d;

    public ve1(int i, zf0 zf0Var, ag0 ag0Var) {
        this.a = i;
        this.c = zf0Var;
        this.d = ag0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve1)) {
            return false;
        }
        ve1 ve1Var = (ve1) obj;
        return this.a == ve1Var.a && epx.f(this.b, ve1Var.b) && epx.f(this.c, ve1Var.c) && epx.f(this.d, ve1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LayoutDesign(layoutId=" + this.a + ", layoutViewClass=" + this.b + ", designComponentBinder=" + this.c + ", designConstraint=" + this.d + ")";
    }
}
