package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class gla0 {
    public final mds0 a;
    public final boolean b;

    public gla0(mds0 mds0Var, boolean z) {
        this.a = mds0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gla0)) {
            return false;
        }
        gla0 gla0Var = (gla0) obj;
        return this.a.equals(gla0Var.a) && this.b == gla0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentWidgetsData(simpleDivKitVo=" + this.a + ", isInitiallyCollapsed=" + this.b + Extension.C_BRAKE;
    }
}
