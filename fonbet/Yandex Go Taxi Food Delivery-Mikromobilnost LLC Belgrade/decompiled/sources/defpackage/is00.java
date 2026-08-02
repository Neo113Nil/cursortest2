package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class is00 {
    public final boolean a;
    public final String b;

    public is00(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is00)) {
            return false;
        }
        is00 is00Var = (is00) obj;
        return this.a == is00Var.a && this.b.equals(is00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xvz.m("MapStyle(isDark=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }
}
