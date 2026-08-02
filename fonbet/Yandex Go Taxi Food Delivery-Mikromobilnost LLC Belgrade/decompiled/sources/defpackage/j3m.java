package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class j3m {
    public final String a;
    public final String b;

    public j3m(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3m)) {
            return false;
        }
        j3m j3mVar = (j3m) obj;
        return jl40.l(this.a, j3mVar.a) && jl40.l(this.b, j3mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DocumentVerifyEntity(verificationId=", this.a, ", documentId=", this.b, Extension.C_BRAKE);
    }
}
