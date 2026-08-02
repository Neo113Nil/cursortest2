package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class l4m0 {
    public final String a;

    public l4m0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4m0) && jl40.l(this.a, ((l4m0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SavingsAccountClosingInfoEntity(requestId=", this.a, Extension.C_BRAKE);
    }
}
