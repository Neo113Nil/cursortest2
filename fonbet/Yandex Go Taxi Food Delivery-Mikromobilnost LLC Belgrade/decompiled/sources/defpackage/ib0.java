package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ib0 {
    public final String a;

    public ib0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ib0) && this.a.equals(((ib0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Logo(contentDescription=", this.a, Extension.C_BRAKE);
    }
}
