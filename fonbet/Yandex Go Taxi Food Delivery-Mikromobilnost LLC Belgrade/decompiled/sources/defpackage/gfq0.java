package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gfq0 implements ap0 {
    public final xtd0 a;
    public final boolean b;
    public final boolean c;

    public gfq0(xtd0 xtd0Var, boolean z, boolean z2) {
        this.a = xtd0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gfq0) {
            gfq0 gfq0Var = (gfq0) obj;
            if (this.a == gfq0Var.a && this.b == gfq0Var.b && this.c == gfq0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectableOption(model=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", shouldAddSeparator=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
