package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pr70 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final or70 d;
    public final List e;
    public final int f;
    public final List g;
    public final nr70 h;

    static {
        new nr70(0);
    }

    public pr70(String str, CharSequence charSequence, CharSequence charSequence2, or70 or70Var, List list, int i, List list2, nr70 nr70Var) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = or70Var;
        this.e = list;
        this.f = i;
        this.g = list2;
        this.h = nr70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr70)) {
            return false;
        }
        pr70 pr70Var = (pr70) obj;
        return jl40.l(this.a, pr70Var.a) && jl40.l(this.b, pr70Var.b) && jl40.l(this.c, pr70Var.c) && this.d.equals(pr70Var.d) && jl40.l(this.e, pr70Var.e) && this.f == pr70Var.f && this.g.equals(pr70Var.g) && this.h.equals(pr70Var.h);
    }

    public final int hashCode() {
        return this.h.a.hashCode() + unr0.c(oyr.b(this.f, unr0.c((this.d.hashCode() + smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "OrderDefaultModalModel(id=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", image=");
        t.append(this.d);
        t.append(", bullets=");
        t.append(this.e);
        t.append(", maxShowCount=");
        t.append(this.f);
        t.append(", controlItems=");
        t.append(this.g);
        t.append(", headerAppearance=");
        t.append(this.h);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
