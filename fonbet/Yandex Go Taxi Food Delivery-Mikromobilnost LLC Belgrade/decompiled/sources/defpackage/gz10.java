package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class gz10 {
    public final String a;
    public final long b;

    public gz10(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz10)) {
            return false;
        }
        gz10 gz10Var = (gz10) obj;
        return jl40.l(this.a, gz10Var.a) && this.b == gz10Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("OriginalMessageRef(originalMessageChatId=", this.a, ", originalMessageHistoryId=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
