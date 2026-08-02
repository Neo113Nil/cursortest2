package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class et51 extends ft51 {
    public final bt51 a;
    public final bt51 b;

    public et51(bt51 bt51Var, bt51 bt51Var2) {
        this.a = bt51Var;
        this.b = bt51Var2;
    }

    public final bt51 a() {
        return this.a;
    }

    public final bt51 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et51)) {
            return false;
        }
        et51 et51Var = (et51) obj;
        return this.a.equals(et51Var.a) && this.b.equals(et51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TwoButtons(mainAction=" + this.a + ", secondaryAction=" + this.b + Extension.C_BRAKE;
    }
}
