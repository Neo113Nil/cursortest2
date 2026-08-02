package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class or70 {
    public final String a;
    public final String b;
    public final boolean c;

    public or70(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or70)) {
            return false;
        }
        or70 or70Var = (or70) obj;
        return jl40.l(this.a, or70Var.a) && jl40.l(this.b, or70Var.b) && this.c == or70Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("Image(url=", this.a, ", tag=", this.b, ", isBig="), this.c, Extension.C_BRAKE);
    }

    public or70() {
        this("", "", false);
    }
}
