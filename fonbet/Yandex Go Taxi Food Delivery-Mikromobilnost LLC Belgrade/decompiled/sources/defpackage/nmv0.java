package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class nmv0 {
    public final zkv0 a;
    public final boolean b;

    public nmv0(zkv0 zkv0Var, boolean z) {
        this.a = zkv0Var;
        this.b = z;
    }

    public final zkv0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmv0)) {
            return false;
        }
        nmv0 nmv0Var = (nmv0) obj;
        return this.a.equals(nmv0Var.a) && this.b == nmv0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SummaryPromotionSingleInfo(promotion=" + this.a + ", isLoadingData=" + this.b + Extension.C_BRAKE;
    }
}
