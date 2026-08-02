package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class exz0 implements gxz0 {
    public final h750 a;

    public exz0(h750 h750Var) {
        this.a = h750Var;
    }

    public final h750 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exz0) && this.a.equals(((exz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Known(value=" + this.a + Extension.C_BRAKE;
    }
}
