package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class p7m0 {
    public final String a;

    public p7m0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p7m0) && jl40.l(this.a, ((p7m0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SavingsAccountOpeningResultEntity(requestId=", this.a, Extension.C_BRAKE);
    }
}
