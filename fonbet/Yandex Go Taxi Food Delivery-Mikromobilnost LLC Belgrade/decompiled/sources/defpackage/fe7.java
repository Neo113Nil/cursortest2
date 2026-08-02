package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class fe7 {
    public static final ee7 Companion = new ee7();
    public final String a;

    public /* synthetic */ fe7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fe7) {
            return jl40.l(this.a, ((fe7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("CachingKey(rawValue=", this.a, Extension.C_BRAKE);
    }
}
