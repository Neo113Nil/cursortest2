package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class h101 implements i101 {
    public final String a;

    public h101(String str) {
        this.a = str;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h101) && jl40.l(this.a, ((h101) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("TapUrl(url=", this.a, Extension.C_BRAKE);
    }
}
