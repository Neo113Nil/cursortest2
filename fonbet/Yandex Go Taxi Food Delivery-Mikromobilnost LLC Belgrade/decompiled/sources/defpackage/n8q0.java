package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class n8q0 extends n351 {
    public final String c;
    public final k9q0 d;

    public n8q0(k9q0 k9q0Var, String str) {
        super("segment", false, 14);
        this.c = str;
        this.d = k9q0Var;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8q0)) {
            return false;
        }
        n8q0 n8q0Var = (n8q0) obj;
        return jl40.l(this.c, n8q0Var.c) && jl40.l(this.d, n8q0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "SegmentModel(id=" + this.c + ", state=" + this.d + Extension.C_BRAKE;
    }
}
