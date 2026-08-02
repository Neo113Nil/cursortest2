package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ejv {
    public final cjv a;
    public final djv b;
    public final String c;

    public ejv(cjv cjvVar, djv djvVar, String str) {
        this.a = cjvVar;
        this.b = djvVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejv)) {
            return false;
        }
        ejv ejvVar = (ejv) obj;
        return this.a.equals(ejvVar.a) && this.b.equals(ejvVar.b) && this.c.equals(ejvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InAppCallScreenParams(forwarding=");
        sb.append(this.a);
        sb.append(", strings=");
        sb.append(this.b);
        sb.append(", defaultPhoneNumber=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
