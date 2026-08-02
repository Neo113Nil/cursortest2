package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pu90 extends gv90 {
    public final String a;
    public final String b;

    public pu90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu90)) {
            return false;
        }
        pu90 pu90Var = (pu90) obj;
        return jl40.l(this.a, pu90Var.a) && jl40.l(this.b, pu90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("CopyPayload(buffer=", this.a, ", notificationText=", this.b, Extension.C_BRAKE);
    }
}
