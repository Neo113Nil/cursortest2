package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lh0 {
    public final String a;
    public final boolean b;
    public final jh0 c;
    public final ArrayList d;

    public lh0(String str, boolean z, jh0 jh0Var, ArrayList arrayList) {
        this.a = str;
        this.b = z;
        this.c = jh0Var;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh0)) {
            return false;
        }
        lh0 lh0Var = (lh0) obj;
        return jl40.l(this.a, lh0Var.a) && this.b == lh0Var.b && this.c.equals(lh0Var.c) && this.d.equals(lh0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder l = oo31.l("ButtonUiState(text=", this.a, ", isMain=", ", action=", this.b);
        l.append(this.c);
        l.append(", conditionsStates=");
        l.append(this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
