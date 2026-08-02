package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class nfn0 implements ofn0 {
    public final String a;

    public /* synthetic */ nfn0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nfn0) {
            return jl40.l(this.a, ((nfn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Url(url=", this.a, Extension.C_BRAKE);
    }
}
