package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cf50 {
    public final boolean a;
    public final String b;
    public final String c;

    public cf50(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf50)) {
            return false;
        }
        cf50 cf50Var = (cf50) obj;
        return this.a == cf50Var.a && this.b.equals(cf50Var.b) && jl40.l(this.c, cf50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(ly3.v("NavigatorShareRouteConfig(enabled=", ", shareRouteText=", this.b, ", shareRouteTitle=", this.a), this.c, Extension.C_BRAKE);
    }
}
