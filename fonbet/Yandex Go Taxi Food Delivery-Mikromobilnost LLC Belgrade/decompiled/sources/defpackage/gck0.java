package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gck0 {
    public final ick0 a;
    public final ick0 b;

    public gck0(ick0 ick0Var, ick0 ick0Var2) {
        this.a = ick0Var;
        this.b = ick0Var2;
    }

    public final ick0 a() {
        return this.a;
    }

    public final ick0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gck0)) {
            return false;
        }
        gck0 gck0Var = (gck0) obj;
        return this.a.equals(gck0Var.a) && this.b.equals(gck0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AvailabilityInfo(compact=" + this.a + ", details=" + this.b + Extension.C_BRAKE;
    }
}
