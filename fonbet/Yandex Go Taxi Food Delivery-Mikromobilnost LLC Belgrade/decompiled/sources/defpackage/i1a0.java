package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class i1a0 implements n1a0 {
    public final String a;

    public i1a0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1a0) && jl40.l(this.a, ((i1a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Agreement(agreementId=", this.a, Extension.C_BRAKE);
    }
}
