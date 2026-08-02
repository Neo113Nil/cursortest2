package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ov41 {
    public final boolean a;
    public final boolean b;
    public final kao c;
    public final String d;

    public ov41(boolean z, boolean z2, kao kaoVar, String str) {
        this.a = z;
        this.b = z2;
        this.c = kaoVar;
        this.d = str;
    }

    public final kao a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov41)) {
            return false;
        }
        ov41 ov41Var = (ov41) obj;
        return this.a == ov41Var.a && this.b == ov41Var.b && jl40.l(this.c, ov41Var.c) && this.d.equals(ov41Var.d);
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        kao kaoVar = this.c;
        return this.d.hashCode() + ((e + (kaoVar == null ? 0 : kaoVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder u = qv10.u("WebViewViewState(isProgressVisible=", ", isWebViewVisible=", ", errorState=", this.a, this.b);
        u.append(this.c);
        u.append(", title=");
        u.append(this.d);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
