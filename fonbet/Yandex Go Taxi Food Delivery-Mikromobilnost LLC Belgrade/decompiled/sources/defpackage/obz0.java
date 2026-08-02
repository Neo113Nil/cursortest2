package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class obz0 extends dqb1 {
    public final String a;

    public obz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof obz0) && jl40.l(this.a, ((obz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("RemoteIcon(tag=", this.a, Extension.C_BRAKE);
    }
}
