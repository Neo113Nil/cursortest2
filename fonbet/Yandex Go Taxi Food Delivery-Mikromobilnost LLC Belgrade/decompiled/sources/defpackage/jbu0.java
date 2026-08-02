package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jbu0 {
    public final CharSequence a;
    public final List b;
    public final ibu0 c;

    public jbu0(CharSequence charSequence, List list, ibu0 ibu0Var) {
        this.a = charSequence;
        this.b = list;
        this.c = ibu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbu0)) {
            return false;
        }
        jbu0 jbu0Var = (jbu0) obj;
        return jl40.l(this.a, jbu0Var.a) && this.b.equals(jbu0Var.b) && this.c.equals(jbu0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "StepsInstructionsModel(title=" + ((Object) this.a) + ", steps=" + this.b + ", widget=" + this.c + Extension.C_BRAKE;
    }
}
