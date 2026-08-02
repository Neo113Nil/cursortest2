package xsna;

import java.util.ArrayList;

/* compiled from: OnboardingPromoVs.kt */
/* loaded from: classes4.dex */
public final class hh80 {
    public final long a;
    public final boolean b;
    public final ArrayList c;
    public final ef80 d;
    public final boolean e;

    public hh80(long j, boolean z, ArrayList arrayList, ef80 ef80Var, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = arrayList;
        this.d = ef80Var;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh80)) {
            return false;
        }
        hh80 hh80Var = (hh80) obj;
        return this.a == hh80Var.a && this.b == hh80Var.b && this.c.equals(hh80Var.c) && this.d.equals(hh80Var.d) && this.e == hh80Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + qr.a(this.c, qoy.b(Long.hashCode(this.a) * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingPromoVs(promoId=");
        sb.append(this.a);
        sb.append(", isMediaInFullScreen=");
        sb.append(this.b);
        sb.append(", slides=");
        sb.append(this.c);
        sb.append(", control=");
        sb.append(this.d);
        sb.append(", isMuted=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
