package defpackage;

import com.yandex.go.multitariff.SelectionRules;
import com.yandex.go.zone.dto.objects.TariffUnavailable;
import com.yandex.go.zone.dto.objects.f5;
import com.yandex.go.zone.dto.response.c;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class cf31 {
    public final String a;
    public final Integer b;
    public final ArrayList c;
    public final n7v d;
    public final String e;
    public final df31 f;
    public final SelectionRules g;
    public final boolean h;
    public final c i;
    public final List j;
    public final TariffUnavailable k;
    public final boolean l;
    public final f5 m;
    public final boolean n;
    public final List o;

    public cf31(String str, Integer num, ArrayList arrayList, n7v n7vVar, String str2, df31 df31Var, SelectionRules selectionRules, boolean z, c cVar, List list, TariffUnavailable tariffUnavailable, boolean z2, f5 f5Var, boolean z3, List list2) {
        this.a = str;
        this.b = num;
        this.c = arrayList;
        this.d = n7vVar;
        this.e = str2;
        this.f = df31Var;
        this.g = selectionRules;
        this.h = z;
        this.i = cVar;
        this.j = list;
        this.k = tariffUnavailable;
        this.l = z2;
        this.m = f5Var;
        this.n = z3;
        this.o = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf31)) {
            return false;
        }
        cf31 cf31Var = (cf31) obj;
        return jl40.l(this.a, cf31Var.a) && jl40.l(this.b, cf31Var.b) && this.c.equals(cf31Var.c) && jl40.l(this.d, cf31Var.d) && jl40.l(this.e, cf31Var.e) && this.f.equals(cf31Var.f) && jl40.l(this.g, cf31Var.g) && this.h == cf31Var.h && jl40.l(this.i, cf31Var.i) && jl40.l(this.j, cf31Var.j) && jl40.l(this.k, cf31Var.k) && this.l == cf31Var.l && jl40.l(this.m, cf31Var.m) && this.n == cf31Var.n && this.o.equals(cf31Var.o);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int b = ly3.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        n7v n7vVar = this.d;
        int e = unr0.e((this.g.a.hashCode() + ((this.f.hashCode() + unr0.b((b + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31, 31, this.e)) * 31)) * 31, 31, this.h);
        c cVar = this.i;
        int c = unr0.c((e + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.j);
        TariffUnavailable tariffUnavailable = this.k;
        return this.o.hashCode() + unr0.e((this.m.hashCode() + unr0.e((c + (tariffUnavailable != null ? tariffUnavailable.hashCode() : 0)) * 31, 31, this.l)) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder q = n.q("VerticalMulticlass(id=", this.b, this.a, ", position=", ", tariffs=");
        q.append(this.c);
        q.append(", selectorIcon=");
        q.append(this.d);
        q.append(", name=");
        q.append(this.e);
        q.append(", details=");
        q.append(this.f);
        q.append(", selectionRules=");
        q.append(this.g);
        q.append(", canBeDefault=");
        q.append(this.h);
        q.append(", estimatedWaitingDto=");
        q.append(this.i);
        q.append(", unsupportedRequirements=");
        q.append(this.j);
        q.append(", tariffUnavailable=");
        q.append(this.k);
        q.append(", isValid=");
        q.append(this.l);
        q.append(", widget=");
        q.append(this.m);
        q.append(", shouldDeactivateInappropriateTariffs=");
        q.append(this.n);
        q.append(", brandings=");
        return ly3.s(q, this.o, Extension.C_BRAKE);
    }
}
