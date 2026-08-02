package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class iu41 {
    public final ou41 a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final Long f;

    public iu41(ou41 ou41Var, int i, String str, boolean z, boolean z2, Long l) {
        this.a = ou41Var;
        this.b = i;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = l;
    }

    public static iu41 a(iu41 iu41Var, ou41 ou41Var, int i, boolean z, Long l, int i2) {
        if ((i2 & 1) != 0) {
            ou41Var = iu41Var.a;
        }
        ou41 ou41Var2 = ou41Var;
        if ((i2 & 2) != 0) {
            i = iu41Var.b;
        }
        int i3 = i;
        String str = iu41Var.c;
        if ((i2 & 8) != 0) {
            z = iu41Var.d;
        }
        boolean z2 = z;
        boolean z3 = (i2 & 16) != 0 ? iu41Var.e : true;
        if ((i2 & 32) != 0) {
            l = iu41Var.f;
        }
        iu41Var.getClass();
        return new iu41(ou41Var2, i3, str, z2, z3, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu41)) {
            return false;
        }
        iu41 iu41Var = (iu41) obj;
        return this.a.equals(iu41Var.a) && this.b == iu41Var.b && jl40.l(this.c, iu41Var.c) && this.d == iu41Var.d && this.e == iu41Var.e && jl40.l(this.f, iu41Var.f);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int e = unr0.e(unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        Long l = this.f;
        return e + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebViewStateImpl(status=");
        sb.append(this.a);
        sb.append(", retryCount=");
        sb.append(this.b);
        sb.append(", title=");
        tse0.y(this.c, ", needClearHistory=", ", urlLoadingStarted=", sb, this.d);
        sb.append(this.e);
        sb.append(", reloadOnNextAttachWithDelay=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
