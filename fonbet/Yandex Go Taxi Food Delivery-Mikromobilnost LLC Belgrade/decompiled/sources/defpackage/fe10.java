package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class fe10 {
    public static final /* synthetic */ int g = 0;
    public final String a;
    public final zd10 b;
    public final yd10 c;
    public final re10 d;
    public final wd10 e;
    public final be10 f;

    static {
        new td10().a();
        tw21.Q(0);
        tw21.Q(1);
        tw21.Q(2);
        tw21.Q(3);
        tw21.Q(4);
        tw21.Q(5);
    }

    public fe10(String str, wd10 wd10Var, zd10 zd10Var, yd10 yd10Var, re10 re10Var, be10 be10Var) {
        this.a = str;
        this.b = zd10Var;
        this.c = yd10Var;
        this.d = re10Var;
        this.e = wd10Var;
        this.f = be10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe10)) {
            return false;
        }
        fe10 fe10Var = (fe10) obj;
        return Objects.equals(this.a, fe10Var.a) && this.e.equals(fe10Var.e) && Objects.equals(this.b, fe10Var.b) && this.c.equals(fe10Var.c) && Objects.equals(this.d, fe10Var.d) && Objects.equals(this.f, fe10Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zd10 zd10Var = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + (zd10Var != null ? zd10Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return hashCode2;
    }
}
