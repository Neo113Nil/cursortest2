package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j8x0 implements r9x0 {
    public final c0k0 a;
    public final oc21 b;
    public final x2s c;

    public j8x0(c0k0 c0k0Var, oc21 oc21Var, x2s x2sVar) {
        this.a = c0k0Var;
        this.b = oc21Var;
        this.c = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8x0)) {
            return false;
        }
        j8x0 j8x0Var = (j8x0) obj;
        return this.a.equals(j8x0Var.a) && this.b.equals(j8x0Var.b) && this.c.equals(j8x0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AddPhotocommentsAction(position=" + this.a + ", constrains=" + this.b + ", analyticsData=" + this.c + Extension.C_BRAKE;
    }
}
