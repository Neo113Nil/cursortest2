package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dh6 implements hh6 {
    public final rr51 a;

    public dh6(rr51 rr51Var) {
        this.a = rr51Var;
    }

    public final rr51 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh6) && this.a.equals(((dh6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CheckFee(divData=" + this.a + Extension.C_BRAKE;
    }
}
