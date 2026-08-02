package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pwd0 {
    public final String a;
    public final String b;

    public pwd0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwd0)) {
            return false;
        }
        pwd0 pwd0Var = (pwd0) obj;
        return this.a.equals(pwd0Var.a) && this.b.equals(pwd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PolicyEntity(title=", this.a, ", url=", this.b, Extension.C_BRAKE);
    }
}
