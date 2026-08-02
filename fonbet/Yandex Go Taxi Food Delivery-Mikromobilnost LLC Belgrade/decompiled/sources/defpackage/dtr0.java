package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dtr0 {
    public final int a;

    public static String a(int i) {
        return oyr.j(i, "SheetTarget(id=", Extension.C_BRAKE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dtr0) {
            return this.a == ((dtr0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
