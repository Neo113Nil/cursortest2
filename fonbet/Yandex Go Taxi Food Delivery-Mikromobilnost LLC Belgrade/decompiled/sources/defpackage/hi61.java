package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class hi61 {
    public final w191 a;
    public final h071 b;
    public final t071 c;
    public final Map d;

    public hi61(w191 w191Var, h071 h071Var, t071 t071Var, Map map) {
        this.a = w191Var;
        this.b = h071Var;
        this.c = t071Var;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi61)) {
            return false;
        }
        hi61 hi61Var = (hi61) obj;
        return this.a.equals(hi61Var.a) && this.b.equals(hi61Var.b) && this.c.equals(hi61Var.c) && this.d.equals(hi61Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ViewSizeInfo(view=" + this.a + ", layoutParams=" + this.b + ", measured=" + this.c + ", additionalInfo=" + this.d + Extension.C_BRAKE;
    }
}
