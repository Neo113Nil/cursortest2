package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ogz0 extends vi0 {
    public final int a;

    public ogz0(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogz0) && this.a == ((ogz0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) * 31;
    }

    public final String toString() {
        return oyr.l(this.a, "TipsPayment(tipsValue=", ", disabled=", "null", Extension.C_BRAKE);
    }
}
