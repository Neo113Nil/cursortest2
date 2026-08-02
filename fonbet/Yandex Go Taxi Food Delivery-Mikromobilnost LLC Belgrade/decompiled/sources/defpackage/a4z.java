package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class a4z {
    public final String a;
    public final String b;

    public a4z(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4z)) {
            return false;
        }
        a4z a4zVar = (a4z) obj;
        return this.a.equals(a4zVar.a) && this.b.equals(a4zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("LocalNotificationBody(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
