package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gus0 implements hus0 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public gus0(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gus0)) {
            return false;
        }
        gus0 gus0Var = (gus0) obj;
        return this.a == gus0Var.a && this.b == gus0Var.b && this.c == gus0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(oo31.l("Toggleable(role=", awk0.a(this.a), ", enabled=", ", selected=", this.b), this.c, Extension.C_BRAKE);
    }
}
