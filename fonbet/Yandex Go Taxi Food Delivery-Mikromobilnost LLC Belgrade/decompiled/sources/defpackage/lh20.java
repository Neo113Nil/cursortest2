package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class lh20 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public lh20(boolean z, int i, String str, String str2, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z2 ? "dark" : "light";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh20)) {
            return false;
        }
        lh20 lh20Var = (lh20) obj;
        return this.a.equals(lh20Var.a) && this.b.equals(lh20Var.b) && this.c == lh20Var.c && this.d == lh20Var.d && this.e == lh20Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("MiniAppConfiguration(chatUniqueId=", this.a, ", language=", this.b, ", layoutRes=");
        tse0.z(v, this.c, ", unsafeMode=", this.d, ", darkTheme=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
