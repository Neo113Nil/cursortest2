package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class au01 implements bu01 {
    public final List a;
    public final boolean b;
    public final rtz0 c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public au01(List list, boolean z, rtz0 rtz0Var, String str, boolean z2, boolean z3) {
        this.a = list;
        this.b = z;
        this.c = rtz0Var;
        this.d = str;
        this.e = z2;
        this.f = z3;
    }

    @Override // defpackage.bu01
    public final rtz0 a() {
        return this.c;
    }

    public final boolean b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final List d() {
        return this.a;
    }

    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au01)) {
            return false;
        }
        au01 au01Var = (au01) obj;
        return this.a.equals(au01Var.a) && this.b == au01Var.b && this.c.equals(au01Var.c) && this.d.equals(au01Var.d) && this.e == au01Var.e && this.f == au01Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.e(unr0.b((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    @Override // defpackage.bu01
    public final boolean isBackButtonVisible() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(recyclerItems=");
        sb.append(this.a);
        sb.append(", isBackButtonVisible=");
        sb.append(this.b);
        sb.append(", toolbarRightPart=");
        sb.append(this.c);
        sb.append(", filterText=");
        sb.append(this.d);
        sb.append(", animateRecycler=");
        return smw0.k(", scrollToTop=", Extension.C_BRAKE, sb, this.e, this.f);
    }
}
