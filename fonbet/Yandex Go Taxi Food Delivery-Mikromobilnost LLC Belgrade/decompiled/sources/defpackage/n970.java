package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class n970 implements z970 {
    public final String a;

    public /* synthetic */ n970(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n970) {
            return jl40.l(this.a, ((n970) obj).a);
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
        return oyr.p("ActiveSuperPasses(openReason=", this.a, Extension.C_BRAKE);
    }
}
