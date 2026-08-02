package xsna;

import xsna.ma5;

/* compiled from: AuthorHeaderPicturePager.kt */
/* loaded from: classes5.dex */
public final class nb5 {
    public final ma5.b a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final fb5 g;
    public final boolean h;

    public nb5(ma5.b bVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, fb5 fb5Var, boolean z6) {
        this.a = bVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = fb5Var;
        this.h = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb5)) {
            return false;
        }
        nb5 nb5Var = (nb5) obj;
        return epx.f(this.a, nb5Var.a) && this.b == nb5Var.b && this.c == nb5Var.c && this.d == nb5Var.d && this.e == nb5Var.e && this.f == nb5Var.f && epx.f(this.g, nb5Var.g) && this.h == nb5Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(this.a.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorHeaderVideoPageParams(item=");
        sb.append(this.a);
        sb.append(", canPlay=");
        sb.append(this.b);
        sb.append(", shouldAutoAdvance=");
        sb.append(this.c);
        sb.append(", replayOnSamePage=");
        sb.append(this.d);
        sb.append(", isCurrentSettledPage=");
        sb.append(this.e);
        sb.append(", isScrollInProgress=");
        sb.append(this.f);
        sb.append(", presentation=");
        sb.append(this.g);
        sb.append(", isExpanded=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
