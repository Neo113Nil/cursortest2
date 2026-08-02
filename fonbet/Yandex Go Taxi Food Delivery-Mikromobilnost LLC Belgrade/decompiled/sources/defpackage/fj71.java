package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.tp0;

/* loaded from: classes7.dex */
public final class fj71 {
    public final ArrayList a;
    public final tp0 b;
    public final List c;
    public final String d;
    public final long e;

    public fj71(ArrayList arrayList, tp0 tp0Var, List list, String str, long j) {
        this.a = arrayList;
        this.b = tp0Var;
        this.c = list;
        this.d = str;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj71)) {
            return false;
        }
        fj71 fj71Var = (fj71) obj;
        return jl40.l(this.a, fj71Var.a) && jl40.l(this.b, fj71Var.b) && this.c.equals(fj71Var.c) && jl40.l(this.d, fj71Var.d) && this.e == fj71Var.e;
    }

    public final int hashCode() {
        ArrayList arrayList = this.a;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        tp0 tp0Var = this.b;
        int c = unr0.c((hashCode + (tp0Var == null ? 0 : tp0Var.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return Long.hashCode(this.e) + ((c + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Link(actions=");
        sb.append(this.a);
        sb.append(", falseClick=");
        sb.append(this.b);
        sb.append(", trackingUrls=");
        oyr.D(", url=", this.d, ", clickableDelay=", sb, this.c);
        return oyr.n(this.e, Extension.C_BRAKE, sb);
    }
}
