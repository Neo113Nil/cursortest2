package xsna;

import xsna.tlo0;

/* compiled from: SelectGroupVerificationType.kt */
/* loaded from: classes18.dex */
public final class h8i0 {
    public final String a;
    public final tlo0.h b;
    public final tlo0.h c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public h8i0(String str, tlo0.h hVar, tlo0.h hVar2, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = hVar;
        this.c = hVar2;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8i0)) {
            return false;
        }
        h8i0 h8i0Var = (h8i0) obj;
        return epx.f(this.a, h8i0Var.a) && this.b.equals(h8i0Var.b) && this.c.equals(h8i0Var.c) && epx.f(this.d, h8i0Var.d) && epx.f(this.e, h8i0Var.e) && this.f == h8i0Var.f && this.g == h8i0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b(urd0.a(urd0.a(u11.c(u11.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c.a), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectGroupVerificationType(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", iconLight=");
        sb.append(this.d);
        sb.append(", iconDark=");
        sb.append(this.e);
        sb.append(", isWarning=");
        sb.append(this.f);
        sb.append(", isCompleted=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
