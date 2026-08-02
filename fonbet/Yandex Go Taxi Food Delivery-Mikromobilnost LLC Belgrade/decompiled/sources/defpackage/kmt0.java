package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kmt0 extends s151 {
    public final ArrayList a;
    public final Integer b;
    public final boolean c;
    public final Object d;
    public final String e;

    public kmt0(ArrayList arrayList, Integer num, boolean z, Object obj, String str) {
        this.a = arrayList;
        this.b = num;
        this.c = z;
        this.d = obj;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmt0)) {
            return false;
        }
        kmt0 kmt0Var = (kmt0) obj;
        return jl40.l(this.a, kmt0Var.a) && jl40.l(this.b, kmt0Var.b) && this.c == kmt0Var.c && jl40.l(this.d, kmt0Var.d) && jl40.l(this.e, kmt0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int e = unr0.e((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        Object obj = this.d;
        int hashCode2 = (e + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.e;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpannableGridModel(tiles=");
        sb.append(this.a);
        sb.append(", columns=");
        sb.append(this.b);
        sb.append(", showWhenSectionCollapsed=");
        sb.append(this.c);
        sb.append(", meta=");
        sb.append(this.d);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
