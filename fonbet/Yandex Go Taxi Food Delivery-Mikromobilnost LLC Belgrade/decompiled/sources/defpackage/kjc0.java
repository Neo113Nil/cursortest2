package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class kjc0 implements pjc0 {
    public final String a;

    public kjc0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kjc0) && this.a.equals(((kjc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ChangeUnsupportedAddressFromSuggest(message=", this.a, Extension.C_BRAKE);
    }
}
