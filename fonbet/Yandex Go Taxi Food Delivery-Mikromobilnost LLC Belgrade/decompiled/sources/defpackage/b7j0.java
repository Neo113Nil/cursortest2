package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class b7j0 {
    public final String a;

    public /* synthetic */ b7j0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b7j0) {
            return this.a.equals(((b7j0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("RequestId(id=", this.a, Extension.C_BRAKE);
    }
}
