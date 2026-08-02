package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gjz0 {
    public final String a;
    public final String b;

    public gjz0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjz0)) {
            return false;
        }
        gjz0 gjz0Var = (gjz0) obj;
        return jl40.l(this.a, gjz0Var.a) && this.b.equals(gjz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TitleWithPayload(title=", this.a, ", payload=", this.b, Extension.C_BRAKE);
    }
}
