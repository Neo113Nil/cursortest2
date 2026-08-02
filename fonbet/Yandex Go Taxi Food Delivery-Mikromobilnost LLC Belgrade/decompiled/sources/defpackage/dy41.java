package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dy41 {
    public final Object a;
    public final String b;
    public final List c;

    public dy41(Object obj, String str, List list) {
        this.a = obj;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy41)) {
            return false;
        }
        dy41 dy41Var = (dy41) obj;
        return jl40.l(this.a, dy41Var.a) && jl40.l(this.b, dy41Var.b) && this.c.equals(dy41Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WheelPickerOptionModel(value=");
        sb.append(this.a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", stateDependentVisibility=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
