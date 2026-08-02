package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class bnz0 {
    public final String a;

    public /* synthetic */ bnz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnz0) {
            return jl40.l(this.a, ((bnz0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("Token(token=", this.a, Extension.C_BRAKE);
    }
}
