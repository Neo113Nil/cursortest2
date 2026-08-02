package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class g1z0 implements i1z0 {
    public final String a;

    public g1z0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1z0) && jl40.l(this.a, ((g1z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OnNfcResult(result=", this.a, Extension.C_BRAKE);
    }
}
