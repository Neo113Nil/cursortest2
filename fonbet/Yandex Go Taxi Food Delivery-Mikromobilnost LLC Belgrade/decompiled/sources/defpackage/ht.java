package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ht implements kt {
    public final CharSequence a;
    public final CharSequence b;
    public final na11 c;
    public final ArrayList d;

    public ht(CharSequence charSequence, CharSequence charSequence2, na11 na11Var, ArrayList arrayList) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = na11Var;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht)) {
            return false;
        }
        ht htVar = (ht) obj;
        return jl40.l(this.a, htVar.a) && jl40.l(this.b, htVar.b) && this.c.equals(htVar.c) && this.d.equals(htVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "OpenFilters(title=", ", buttonTitle=", ", selectedType=");
        r.append(this.c);
        r.append(", transportTypes=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
