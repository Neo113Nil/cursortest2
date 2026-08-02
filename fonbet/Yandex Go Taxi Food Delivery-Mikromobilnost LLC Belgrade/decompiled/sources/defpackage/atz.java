package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class atz implements btz {
    public final String a;

    public /* synthetic */ atz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atz) {
            return jl40.l(this.a, ((atz) obj).a);
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
