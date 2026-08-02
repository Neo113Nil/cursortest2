package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class co41 {
    public final String a;
    public final int b;

    public co41(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co41)) {
            return false;
        }
        co41 co41Var = (co41) obj;
        return this.a.equals(co41Var.a) && this.b == co41Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "Counter(chatOrBotId=", this.a, ", unread=", Extension.C_BRAKE);
    }
}
