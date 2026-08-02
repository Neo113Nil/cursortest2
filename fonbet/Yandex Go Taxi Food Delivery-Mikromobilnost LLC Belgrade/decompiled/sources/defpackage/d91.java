package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class d91 implements k91 {
    public final oce0 a;

    public d91(oce0 oce0Var) {
        this.a = oce0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d91) && this.a.equals(((d91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Alert(param=" + this.a + Extension.C_BRAKE;
    }
}
