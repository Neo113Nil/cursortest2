package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kam0 {
    public final String a;
    public final Text b;
    public final Text c;
    public final rbv d;
    public final rr51 e;
    public final rr51 f;
    public final List g;
    public final boolean h;
    public final boolean i;

    public kam0(rbv rbvVar, rr51 rr51Var, rr51 rr51Var2, Text text, Text text2, String str, List list, boolean z, boolean z2) {
        this.a = str;
        this.b = text;
        this.c = text2;
        this.d = rbvVar;
        this.e = rr51Var;
        this.f = rr51Var2;
        this.g = list;
        this.h = z;
        this.i = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    public static kam0 a(kam0 kam0Var, ArrayList arrayList, boolean z, int i) {
        String str = kam0Var.a;
        Text text = kam0Var.b;
        Text text2 = kam0Var.c;
        rbv rbvVar = kam0Var.d;
        rr51 rr51Var = kam0Var.e;
        rr51 rr51Var2 = kam0Var.f;
        ArrayList arrayList2 = arrayList;
        if ((i & 64) != 0) {
            arrayList2 = kam0Var.g;
        }
        ArrayList arrayList3 = arrayList2;
        boolean z2 = kam0Var.h;
        if ((i & 256) != 0) {
            z = kam0Var.i;
        }
        return new kam0(rbvVar, rr51Var, rr51Var2, text, text2, str, arrayList3, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kam0)) {
            return false;
        }
        kam0 kam0Var = (kam0) obj;
        return jl40.l(this.a, kam0Var.a) && jl40.l(this.b, kam0Var.b) && jl40.l(this.c, kam0Var.c) && jl40.l(this.d, kam0Var.d) && jl40.l(this.e, kam0Var.e) && jl40.l(this.f, kam0Var.f) && jl40.l(this.g, kam0Var.g) && this.h == kam0Var.h && this.i == kam0Var.i;
    }

    public final int hashCode() {
        int c = ly3.c(this.d, n.c(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
        rr51 rr51Var = this.e;
        int hashCode = (c + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        rr51 rr51Var2 = this.f;
        return Boolean.hashCode(this.i) + unr0.e(unr0.c((hashCode + (rr51Var2 != null ? rr51Var2.hashCode() : 0)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shelf(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", subtitleDivWidget=");
        sb.append(this.e);
        sb.append(", divWidget=");
        sb.append(this.f);
        sb.append(", items=");
        nzs.p(sb, this.g, ", dragAndDropEnabled=", this.h, ", expanded=");
        return x4e.i(sb, this.i, Extension.C_BRAKE);
    }
}
