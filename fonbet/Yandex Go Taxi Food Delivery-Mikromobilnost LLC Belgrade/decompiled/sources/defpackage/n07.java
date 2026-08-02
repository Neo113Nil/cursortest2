package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class n07 {
    public final cyu0 a;
    public final cyu0 b;
    public final v4v c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final fz6 g;

    public n07(cyu0 cyu0Var, cyu0 cyu0Var2, lvi0 lvi0Var, boolean z, boolean z2, boolean z3, fz6 fz6Var) {
        this.a = cyu0Var;
        this.b = cyu0Var2;
        this.c = lvi0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = fz6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n07)) {
            return false;
        }
        n07 n07Var = (n07) obj;
        return this.a.equals(n07Var.a) && jl40.l(this.b, n07Var.b) && jl40.l(this.c, n07Var.c) && this.d == n07Var.d && this.e == n07Var.e && this.f == n07Var.f && this.g.equals(n07Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cyu0 cyu0Var = this.b;
        int hashCode2 = (hashCode + (cyu0Var == null ? 0 : cyu0Var.hashCode())) * 31;
        v4v v4vVar = this.c;
        return this.g.hashCode() + unr0.e(unr0.e(unr0.e((hashCode2 + (v4vVar != null ? v4vVar.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonItemModel(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", leadIcon=");
        sb.append(this.c);
        sb.append(", isEnabled=");
        sb.append(this.d);
        sb.append(", isHighlighted=");
        nnm.v(", isShimmering=", ", clickPayload=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
