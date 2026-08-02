package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ij11 implements jj11 {
    public final aj11 a;

    public ij11(aj11 aj11Var) {
        this.a = aj11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ij11) && this.a.equals(((ij11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "V2(data=" + this.a + Extension.C_BRAKE;
    }
}
