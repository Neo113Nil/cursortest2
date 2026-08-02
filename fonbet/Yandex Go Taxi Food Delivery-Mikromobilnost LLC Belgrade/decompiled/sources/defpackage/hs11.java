package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class hs11 {
    public final String a;
    public final String b;
    public final boolean c;

    public hs11(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs11)) {
            return false;
        }
        hs11 hs11Var = (hs11) obj;
        return this.a.equals(hs11Var.a) && this.b.equals(hs11Var.b) && this.c == hs11Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("UgcItem(title=", this.a, ", subtitle=", this.b, ", isEnabled="), this.c, Extension.C_BRAKE);
    }
}
