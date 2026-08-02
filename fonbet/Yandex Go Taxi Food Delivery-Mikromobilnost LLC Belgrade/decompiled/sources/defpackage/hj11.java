package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class hj11 implements jj11 {
    public final bj11 a;

    public hj11(bj11 bj11Var) {
        this.a = bj11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hj11) && this.a.equals(((hj11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "V1(data=" + this.a + Extension.C_BRAKE;
    }
}
