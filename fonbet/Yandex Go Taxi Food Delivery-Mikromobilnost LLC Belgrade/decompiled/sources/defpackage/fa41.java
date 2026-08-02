package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class fa41 extends ye0 {
    public final String b;

    public fa41(String str) {
        super(str);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa41) && jl40.l(this.b, ((fa41) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ye0
    public final String k() {
        return this.b;
    }

    public final String toString() {
        return oyr.p("Loading(urlFor3ds=", this.b, Extension.C_BRAKE);
    }
}
