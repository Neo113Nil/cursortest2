package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class eq00 implements iq00 {
    public final List a;
    public final in00 b;

    public eq00(List list, in00 in00Var) {
        this.a = list;
        this.b = in00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq00)) {
            return false;
        }
        eq00 eq00Var = (eq00) obj;
        return this.a.equals(eq00Var.a) && jl40.l(this.b, eq00Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        in00 in00Var = this.b;
        return hashCode + (in00Var == null ? 0 : in00Var.hashCode());
    }

    public final String toString() {
        return "InitMapObjects(addedObjects=" + this.a + ", selectedPin=" + this.b + Extension.C_BRAKE;
    }
}
