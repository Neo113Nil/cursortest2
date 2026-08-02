package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class hm50 {
    public final String a;
    public final String b;

    public hm50(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm50)) {
            return false;
        }
        hm50 hm50Var = (hm50) obj;
        return jl40.l(this.a, hm50Var.a) && jl40.l(this.b, hm50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ShowDialogEvent(messageId=", this.a, ", chatId=", this.b, Extension.C_BRAKE);
    }
}
