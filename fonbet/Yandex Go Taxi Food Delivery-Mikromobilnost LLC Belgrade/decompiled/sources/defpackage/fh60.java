package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class fh60 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public fh60(String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh60)) {
            return false;
        }
        fh60 fh60Var = (fh60) obj;
        return this.a.equals(fh60Var.a) && this.b.equals(fh60Var.b) && this.c.equals(fh60Var.c) && this.d == fh60Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("NotificationData(chatId=", this.a, ", displayName=", this.b, ", message=");
        ly3.y(this.d, this.c, ", timestamp=", v);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
