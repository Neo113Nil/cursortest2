package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class dnj {
    public final String a;

    public /* synthetic */ dnj(String str) {
        this.a = str;
    }

    public static String a(String str) {
        return oyr.p("DirectiveName(rawValue=", str, Extension.C_BRAKE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dnj) {
            return this.a.equals(((dnj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }
}
