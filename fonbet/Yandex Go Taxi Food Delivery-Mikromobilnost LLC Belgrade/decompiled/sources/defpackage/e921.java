package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class e921 {
    public final String a;
    public final String b;

    public e921(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e921)) {
            return false;
        }
        e921 e921Var = (e921) obj;
        return this.a.equals(e921Var.a) && this.b.equals(e921Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("UpgradeAccountMenuItem(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
