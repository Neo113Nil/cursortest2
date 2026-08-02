package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class lbf0 {
    public final ArrayList a;
    public final float b;
    public final float c;
    public final float d;
    public final List e;

    public lbf0(ArrayList arrayList, float f, float f2, float f3, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbf0)) {
            return false;
        }
        lbf0 lbf0Var = (lbf0) obj;
        return this.a.equals(lbf0Var.a) && Float.compare(this.b, lbf0Var.b) == 0 && Float.compare(this.c, lbf0Var.c) == 0 && Float.compare(this.d, lbf0Var.d) == 0 && jl40.l(this.e, lbf0Var.e);
    }

    public final int hashCode() {
        int c = g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
        List list = this.e;
        return c + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GradientLayer(colorStops=");
        sb.append(this.a);
        sb.append(", centerXFraction=");
        sb.append(this.b);
        sb.append(", centerYFraction=");
        vfc.x(sb, this.c, ", radiusFraction=", this.d, ", keyframes=");
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }
}
