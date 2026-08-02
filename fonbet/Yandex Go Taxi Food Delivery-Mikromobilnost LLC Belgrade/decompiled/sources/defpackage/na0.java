package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class na0 extends vi0 {
    public final String a;

    public na0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        boolean a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na0)) {
            return false;
        }
        String str = ((na0) obj).a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                a = true;
            }
            a = false;
        } else {
            if (str != null) {
                a = of91.a(str2, str);
            }
            a = false;
        }
        return a;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return of91.b(str);
    }

    public final String toString() {
        String str = this.a;
        return oyr.p("AddCardPayment(disabled=", str == null ? "null" : of91.e(str), Extension.C_BRAKE);
    }
}
