package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class lf71 extends sr71 {
    public final fh61 b;

    public lf71(fh61 fh61Var) {
        super(fh61Var.a);
        this.b = fh61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lf71) && jl40.l(this.b, ((lf71) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "AdUnitMediationAdapter(adapter=" + this.b + Extension.C_BRAKE;
    }
}
