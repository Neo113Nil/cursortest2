package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class po4 {
    public final Drawable a;
    public final List b;
    public final List c;
    public final dv4 d;
    public final boolean e;

    public po4(Drawable drawable, List list, List list2, dv4 dv4Var, boolean z) {
        this.a = drawable;
        this.b = list;
        this.c = list2;
        this.d = dv4Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po4)) {
            return false;
        }
        po4 po4Var = (po4) obj;
        return jl40.l(this.a, po4Var.a) && jl40.l(this.b, po4Var.b) && jl40.l(this.c, po4Var.c) && jl40.l(this.d, po4Var.d) && this.e == po4Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BalanceWidgetState(background=");
        sb.append(this.a);
        sb.append(", leadIcons=");
        sb.append(this.b);
        sb.append(", trailIcons=");
        sb.append(this.c);
        sb.append(", barState=");
        sb.append(this.d);
        sb.append(", isExpanded=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
