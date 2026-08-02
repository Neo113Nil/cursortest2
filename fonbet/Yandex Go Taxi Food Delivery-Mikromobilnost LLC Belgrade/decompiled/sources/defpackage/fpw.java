package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class fpw {
    public final v0f0 a;
    public final v0f0 b;

    public fpw(v0f0 v0f0Var, v0f0 v0f0Var2) {
        this.a = v0f0Var;
        this.b = v0f0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpw)) {
            return false;
        }
        fpw fpwVar = (fpw) obj;
        return this.a.equals(fpwVar.a) && this.b.equals(fpwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IntercitySelectorPriceUi(selector=" + this.a + ", selectorSelected=" + this.b + Extension.C_BRAKE;
    }
}
