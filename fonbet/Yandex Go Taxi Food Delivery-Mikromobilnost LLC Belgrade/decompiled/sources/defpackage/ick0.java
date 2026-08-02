package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ick0 {
    public final cck0 a;
    public final vfk0 b;

    public ick0(cck0 cck0Var, vfk0 vfk0Var) {
        this.a = cck0Var;
        this.b = vfk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ick0)) {
            return false;
        }
        ick0 ick0Var = (ick0) obj;
        return this.a.equals(ick0Var.a) && this.b.equals(ick0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PresentationInfo(availability=" + this.a + ", sourceType=" + this.b + Extension.C_BRAKE;
    }
}
