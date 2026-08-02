package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class b5r0 implements g5r0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final tls e;

    public b5r0(String str, String str2, boolean z, boolean z2, tls tlsVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = tlsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5r0)) {
            return false;
        }
        b5r0 b5r0Var = (b5r0) obj;
        return jl40.l(this.a, b5r0Var.a) && this.b.equals(b5r0Var.b) && this.c == b5r0Var.c && this.d == b5r0Var.d && this.e.equals(b5r0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 961, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("CheckSetting(id=", this.a, ", title=", this.b, ", isSelected=");
        nnm.v(", iconRes=null, drawDivider=", ", onClick=", v, this.c, this.d);
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
