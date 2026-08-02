package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class f541 {
    public final String a;
    public final boolean b;
    public final List c;
    public final String d;
    public final String e;
    public final List f;

    public f541(String str, String str2, String str3, List list, List list2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = str2;
        this.e = str3;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f541)) {
            return false;
        }
        f541 f541Var = (f541) obj;
        return jl40.l(this.a, f541Var.a) && this.b == f541Var.b && jl40.l(this.c, f541Var.c) && this.d.equals(f541Var.d) && jl40.l(this.e, f541Var.e) && jl40.l(this.f, f541Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.c(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("WalkNavPayload(routeUri=", this.a, ", skipOverview=", ", addresses=", this.b);
        oyr.D(", hubSessionId=", this.d, ", generation=", l, this.c);
        return tse0.j(this.e, ", alternativeRouteUris=", Extension.C_BRAKE, l, this.f);
    }
}
