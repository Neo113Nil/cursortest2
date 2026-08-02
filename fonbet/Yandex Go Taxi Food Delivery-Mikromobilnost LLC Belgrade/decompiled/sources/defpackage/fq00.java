package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fq00 implements iq00 {
    public final in00 a;

    public fq00(in00 in00Var) {
        this.a = in00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fq00) && this.a.equals(((fq00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RedrawMapObject(mapObject=" + this.a + Extension.C_BRAKE;
    }
}
