package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class j2c implements wu0 {
    public final String a;
    public final String b;

    public j2c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2c)) {
            return false;
        }
        j2c j2cVar = (j2c) obj;
        return jl40.l(this.a, j2cVar.a) && jl40.l(this.b, j2cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Client(title=", this.a, ", name=", this.b, Extension.C_BRAKE);
    }
}
