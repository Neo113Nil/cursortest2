package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ijw0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final miw0 e;

    public ijw0(String str, String str2, String str3, String str4, miw0 miw0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = miw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijw0)) {
            return false;
        }
        ijw0 ijw0Var = (ijw0) obj;
        return jl40.l(this.a, ijw0Var.a) && jl40.l(this.b, ijw0Var.b) && jl40.l(this.c, ijw0Var.c) && jl40.l(this.d, ijw0Var.d) && this.e.equals(ijw0Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SupportItem(id=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", iconUrl=", this.d, ", action=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
