package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class bak0 implements ibk0 {
    public final String a;

    public bak0(String str) {
        this.a = str;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bak0) && jl40.l(this.a, ((bak0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenDetails(analyticsName=", this.a, Extension.C_BRAKE);
    }
}
