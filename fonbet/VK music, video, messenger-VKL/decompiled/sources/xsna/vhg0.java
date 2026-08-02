package xsna;

import com.vk.ecomm.reviews.model.communities.ReviewSourceType;
import xsna.tlo0;

/* compiled from: ReviewHeaderData.kt */
/* loaded from: classes18.dex */
public final class vhg0 {
    public final String a;
    public final Float b;
    public final tlo0 c;
    public final boolean d;
    public final ReviewSourceType e;
    public final boolean f;
    public final boolean g;

    public vhg0(String str, Float f, tlo0.f fVar, boolean z, ReviewSourceType reviewSourceType, boolean z2, boolean z3, int i) {
        fVar = (i & 8) != 0 ? null : fVar;
        z = (i & 16) != 0 ? false : z;
        reviewSourceType = (i & 32) != 0 ? ReviewSourceType.Vk : reviewSourceType;
        z2 = (i & 64) != 0 ? false : z2;
        z3 = (i & 128) != 0 ? false : z3;
        this.a = str;
        this.b = f;
        this.c = fVar;
        this.d = z;
        this.e = reviewSourceType;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhg0)) {
            return false;
        }
        vhg0 vhg0Var = (vhg0) obj;
        return epx.f(this.a, vhg0Var.a) && epx.f(this.b, vhg0Var.b) && epx.f(this.c, vhg0Var.c) && this.d == vhg0Var.d && this.e == vhg0Var.e && this.f == vhg0Var.f && this.g == vhg0Var.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        int b = qoy.b((hashCode + (f == null ? 0 : f.hashCode())) * 31, 31, false);
        tlo0 tlo0Var = this.c;
        return Boolean.hashCode(this.g) + qoy.b((this.e.hashCode() + qoy.b((b + (tlo0Var != null ? tlo0Var.hashCode() : 0)) * 31, 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewHeaderData(authorDisplayName=");
        sb.append(this.a);
        sb.append(", rating=");
        sb.append(this.b);
        sb.append(", isActionButtonVisible=false, description=");
        sb.append(this.c);
        sb.append(", isFriend=");
        sb.append(this.d);
        sb.append(", sourceType=");
        sb.append(this.e);
        sb.append(", isPinVisible=");
        sb.append(this.f);
        sb.append(", showPinReviewTooltip=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
