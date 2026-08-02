package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class lf51 {
    public final mq91 a;

    public lf51(mq91 mq91Var) {
        this.a = mq91Var;
    }

    public final mq91 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lf51) && this.a.equals(((lf51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "YBCheckPaymentInfo(resolution=" + this.a + Extension.C_BRAKE;
    }
}
