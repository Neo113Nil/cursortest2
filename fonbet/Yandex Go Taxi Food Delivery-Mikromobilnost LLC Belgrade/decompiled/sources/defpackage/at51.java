package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class at51 extends bt51 {
    public final CharSequence a;
    public final String b;
    public final tv51 c;
    public final zv51 d;
    public final String e;

    public at51(CharSequence charSequence, String str, tv51 tv51Var, zv51 zv51Var, String str2) {
        this.a = charSequence;
        this.b = str;
        this.c = tv51Var;
        this.d = zv51Var;
        this.e = str2;
    }

    @Override // defpackage.bt51
    public final String a() {
        return this.b;
    }

    @Override // defpackage.bt51
    public final CharSequence b() {
        return this.a;
    }

    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at51)) {
            return false;
        }
        at51 at51Var = (at51) obj;
        return jl40.l(this.a, at51Var.a) && jl40.l(this.b, at51Var.b) && jl40.l(this.c, at51Var.c) && this.d.equals(at51Var.d) && this.e.equals(at51Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopUpAction(title=");
        sb.append((Object) this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", ybSdkAction=");
        sb.append(this.c);
        sb.append(", intent=");
        sb.append(this.d);
        sb.append(", currencyCode=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
