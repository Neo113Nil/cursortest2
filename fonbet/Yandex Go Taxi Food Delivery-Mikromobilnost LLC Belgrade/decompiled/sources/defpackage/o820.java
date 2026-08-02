package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class o820 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public o820(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o820)) {
            return false;
        }
        o820 o820Var = (o820) obj;
        return jl40.l(this.a, o820Var.a) && jl40.l(this.b, o820Var.b) && this.c.equals(o820Var.c) && jl40.l(this.d, o820Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("ShortcutInfo(gridId=", this.a, ", shortcutId=", this.b, ", type="), this.c, ", apiEndpoint=", this.d, Extension.C_BRAKE);
    }
}
