package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class oox0 {
    public static final oox0 d = new oox0("", -1, jhc0.b);
    public final String a;
    public final int b;
    public final pox0 c;

    public oox0(String str, int i, pox0 pox0Var) {
        this.a = str;
        this.b = i;
        this.c = pox0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oox0)) {
            return false;
        }
        oox0 oox0Var = (oox0) obj;
        return jl40.l(this.a, oox0Var.a) && this.b == oox0Var.b && jl40.l(this.c, oox0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "TariffTimeInfo(routeTime=", this.a, ", routeTimeInSec=", ", routeTimeAppearance=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public /* synthetic */ oox0(String str, int i) {
        this(str, i, jhc0.b);
    }
}
