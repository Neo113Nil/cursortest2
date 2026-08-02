package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ea4 {
    public final String a;
    public final String b;
    public final String c;
    public final fxy0 d;
    public final fxy0 e;
    public final fxy0 f;
    public final fxy0 g;
    public final ArrayList h;
    public final fwt0 i;
    public final String j;

    public ea4(String str, String str2, String str3, fxy0 fxy0Var, fxy0 fxy0Var2, fxy0 fxy0Var3, fxy0 fxy0Var4, ArrayList arrayList, fwt0 fwt0Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = fxy0Var;
        this.e = fxy0Var2;
        this.f = fxy0Var3;
        this.g = fxy0Var4;
        this.h = arrayList;
        this.i = fwt0Var;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea4)) {
            return false;
        }
        ea4 ea4Var = (ea4) obj;
        return jl40.l(this.a, ea4Var.a) && jl40.l(this.b, ea4Var.b) && jl40.l(this.c, ea4Var.c) && jl40.l(this.d, ea4Var.d) && jl40.l(this.e, ea4Var.e) && jl40.l(this.f, ea4Var.f) && jl40.l(this.g, ea4Var.g) && this.h.equals(ea4Var.h) && this.i.equals(ea4Var.i) && jl40.l(this.j, ea4Var.j);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (this.i.a.hashCode() + ly3.b((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.h)) * 31;
        String str2 = this.j;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AutotopupWidgetSummaryDataEntity(title=", this.a, ", subtitle=", this.b, ", futureIncomeTitle=");
        v.append(this.c);
        v.append(", leftImage=");
        v.append(this.d);
        v.append(", actionImage=");
        v.append(this.e);
        v.append(", futureIncomeBackgroundColor=");
        v.append(this.f);
        v.append(", backgroundColor=");
        v.append(this.g);
        v.append(", blocks=");
        v.append(this.h);
        v.append(", spoilerParams=");
        v.append(this.i);
        v.append(", tooltipText=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
