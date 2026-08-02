package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ov9 implements uv9 {
    public final ru9 a;
    public final boolean b;
    public final ir9 c;

    public ov9(ru9 ru9Var, boolean z, ir9 ir9Var) {
        this.a = ru9Var;
        this.b = z;
        this.c = ir9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov9)) {
            return false;
        }
        ov9 ov9Var = (ov9) obj;
        return jl40.l(this.a, ov9Var.a) && this.b == ov9Var.b && jl40.l(this.c, ov9Var.c);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        ir9 ir9Var = this.c;
        return e + (ir9Var == null ? 0 : ir9Var.hashCode());
    }

    public final String toString() {
        return "DiscountToggleChanged(discount=" + this.a + ", toggled=" + this.b + ", defaultDiscount=" + this.c + Extension.C_BRAKE;
    }
}
