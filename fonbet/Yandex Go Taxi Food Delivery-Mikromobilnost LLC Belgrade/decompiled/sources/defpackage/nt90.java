package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nt90 extends n351 {
    public final l2a0 c;
    public final n07 d;

    public nt90(l2a0 l2a0Var, n07 n07Var) {
        super("pay-now-key", false, 14);
        this.c = l2a0Var;
        this.d = n07Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt90)) {
            return false;
        }
        nt90 nt90Var = (nt90) obj;
        return this.c.equals(nt90Var.c) && this.d.equals(nt90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "PayNowModel(paymentItemModel=" + this.c + ", buttonItemModel=" + this.d + Extension.C_BRAKE;
    }
}
