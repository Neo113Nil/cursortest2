package xsna;

import java.util.ArrayList;
import xsna.fmc0;

/* compiled from: PostingSideEffect.kt */
/* loaded from: classes4.dex */
public final class omc0 implements fmc0.j {
    public final ga10 a;
    public final ArrayList b;
    public final int c;

    public omc0(ga10 ga10Var, ArrayList arrayList, int i) {
        this.a = ga10Var;
        this.b = arrayList;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omc0)) {
            return false;
        }
        omc0 omc0Var = (omc0) obj;
        return this.a.equals(omc0Var.a) && this.b.equals(omc0Var.b) && this.c == omc0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qr.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenProductsPicker(marketPickerContext=");
        sb.append(this.a);
        sb.append(", photos=");
        sb.append(this.b);
        sb.append(", position=");
        return vu5.b(sb, this.c, ')');
    }
}
