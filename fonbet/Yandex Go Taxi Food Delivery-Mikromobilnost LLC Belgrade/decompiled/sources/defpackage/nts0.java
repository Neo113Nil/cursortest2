package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nts0 implements pts0 {
    public final g5v a;

    public nts0(g5v g5vVar) {
        this.a = g5vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nts0) && this.a.equals(((nts0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LeadIconSpot(iconSpot=" + this.a + Extension.C_BRAKE;
    }
}
