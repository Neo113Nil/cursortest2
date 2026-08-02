package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class p7f extends s7f {
    public final String a;

    public p7f(String str) {
        this.a = str;
    }

    @Override // defpackage.s7f
    public final boolean a(s7f s7fVar) {
        return s7fVar instanceof p7f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p7f) && jl40.l(this.a, ((p7f) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("CountWarning(warningText=", this.a, Extension.C_BRAKE);
    }
}
