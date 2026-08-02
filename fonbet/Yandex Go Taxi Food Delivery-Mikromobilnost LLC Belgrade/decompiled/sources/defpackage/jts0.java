package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jts0 implements lts0 {
    public final f5v a;

    public jts0(f5v f5vVar) {
        this.a = f5vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jts0) && this.a.equals(((jts0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LeadIconSpot(iconSpot=" + this.a + Extension.C_BRAKE;
    }
}
