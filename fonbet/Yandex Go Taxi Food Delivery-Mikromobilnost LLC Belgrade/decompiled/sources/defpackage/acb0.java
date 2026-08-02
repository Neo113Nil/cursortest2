package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class acb0 implements ccb0 {
    public final zcb0 a;
    public final zcb0 b;

    public acb0(zcb0 zcb0Var, zcb0 zcb0Var2) {
        this.a = zcb0Var;
        this.b = zcb0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acb0)) {
            return false;
        }
        acb0 acb0Var = (acb0) obj;
        return this.a.equals(acb0Var.a) && this.b.equals(acb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Multiple(title=" + this.a + ", subtitle=" + this.b + Extension.C_BRAKE;
    }
}
