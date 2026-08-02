package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class kgq0 {
    public final as9 a;
    public final ir9 b;
    public final boolean c;

    public kgq0(as9 as9Var, ir9 ir9Var, boolean z) {
        this.a = as9Var;
        this.b = ir9Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgq0)) {
            return false;
        }
        kgq0 kgq0Var = (kgq0) obj;
        return jl40.l(this.a, kgq0Var.a) && jl40.l(this.b, kgq0Var.b) && this.c == kgq0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedDetails(details=");
        sb.append(this.a);
        sb.append(", discount=");
        sb.append(this.b);
        sb.append(", openedFromTargetDiscount=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
