package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ca21 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public ca21(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca21)) {
            return false;
        }
        ca21 ca21Var = (ca21) obj;
        return jl40.l(this.a, ca21Var.a) && this.b == ca21Var.b && this.c == ca21Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(oo31.l("InputState(oldValue=", this.a, ", suggestUsed=", ", hasChanged=", this.b), this.c, Extension.C_BRAKE);
    }
}
