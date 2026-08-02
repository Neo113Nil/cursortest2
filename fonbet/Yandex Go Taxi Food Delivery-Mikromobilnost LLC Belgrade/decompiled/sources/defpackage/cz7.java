package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cz7 {
    public final String a;
    public final ArrayList b;
    public final xy7 c;
    public final yy7 d;

    public cz7(String str, ArrayList arrayList, xy7 xy7Var, yy7 yy7Var) {
        this.a = str;
        this.b = arrayList;
        this.c = xy7Var;
        this.d = yy7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz7)) {
            return false;
        }
        cz7 cz7Var = (cz7) obj;
        return jl40.l(this.a, cz7Var.a) && this.b.equals(cz7Var.b) && jl40.l(this.c, cz7Var.c) && this.d.equals(cz7Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int b = ly3.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        xy7 xy7Var = this.c;
        return this.d.hashCode() + ((b + (xy7Var != null ? xy7Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = x4e.m("CancelReasonsV3UiState(title=", this.a, ", groups=", ", comment=", this.b);
        m.append(this.c);
        m.append(", doneButton=");
        m.append(this.d);
        m.append(Extension.C_BRAKE);
        return m.toString();
    }
}
