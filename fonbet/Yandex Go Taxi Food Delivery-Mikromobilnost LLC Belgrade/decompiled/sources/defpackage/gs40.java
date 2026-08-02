package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gs40 {
    public final String a;
    public final String b;

    public gs40(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs40)) {
            return false;
        }
        gs40 gs40Var = (gs40) obj;
        return this.a.equals(gs40Var.a) && this.b.equals(gs40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("MultimodalRouteDeeplink(id=", this.a, ", routeType=", this.b, Extension.C_BRAKE);
    }
}
