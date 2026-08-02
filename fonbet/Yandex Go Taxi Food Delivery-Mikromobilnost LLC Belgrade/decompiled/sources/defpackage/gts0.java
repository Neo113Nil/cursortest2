package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gts0 implements hts0 {
    public final y4v a;

    public gts0(y4v y4vVar) {
        this.a = y4vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gts0) && this.a.equals(((gts0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LeadIconSpot(iconSpot=" + this.a + Extension.C_BRAKE;
    }
}
