package defpackage;

import com.yandex.go.zone.dto.objects.VerticalType;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class oa31 {
    public final String a;
    public final String b;
    public final VerticalType c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final n7v h;
    public final n7v i;
    public final n7v j;
    public final String k;
    public final String l;
    public final cf31 m;
    public final List n;
    public final boolean o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ oa31(String str, VerticalType verticalType, int i) {
        this("", r3, r4, "", "", r7, null, null, null, null, "", null, null, r7, false);
        String str2 = (i & 2) != 0 ? "" : str;
        VerticalType verticalType2 = (i & 4) != 0 ? VerticalType.NONE : verticalType;
        EmptyList emptyList = EmptyList.a;
    }

    public static oa31 a(oa31 oa31Var, String str, List list, int i) {
        String str2 = oa31Var.a;
        String str3 = (i & 2) != 0 ? oa31Var.b : str;
        return new oa31(str2, str3, oa31Var.c, oa31Var.d, oa31Var.e, (i & 32) != 0 ? oa31Var.f : list, oa31Var.g, oa31Var.h, oa31Var.i, oa31Var.j, oa31Var.k, oa31Var.l, (i & 4096) != 0 ? oa31Var.m : null, oa31Var.n, oa31Var.o);
    }

    public final boolean b() {
        return this.c == VerticalType.DRIVE;
    }

    public final boolean c() {
        return this.c == VerticalType.GROUP;
    }

    public final boolean d() {
        return this.c == VerticalType.SINGLE_TARIFF;
    }

    public final boolean e() {
        return this.c == VerticalType.TRANSPORT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa31)) {
            return false;
        }
        oa31 oa31Var = (oa31) obj;
        return jl40.l(this.a, oa31Var.a) && jl40.l(this.b, oa31Var.b) && this.c == oa31Var.c && jl40.l(this.d, oa31Var.d) && jl40.l(this.e, oa31Var.e) && jl40.l(this.f, oa31Var.f) && jl40.l(this.g, oa31Var.g) && jl40.l(this.h, oa31Var.h) && jl40.l(this.i, oa31Var.i) && jl40.l(this.j, oa31Var.j) && jl40.l(this.k, oa31Var.k) && jl40.l(this.l, oa31Var.l) && jl40.l(this.m, oa31Var.m) && jl40.l(this.n, oa31Var.n) && this.o == oa31Var.o;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(unr0.b((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        n7v n7vVar = this.h;
        int hashCode2 = (hashCode + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31;
        n7v n7vVar2 = this.i;
        int hashCode3 = (hashCode2 + (n7vVar2 == null ? 0 : n7vVar2.hashCode())) * 31;
        n7v n7vVar3 = this.j;
        int b = unr0.b((hashCode3 + (n7vVar3 == null ? 0 : n7vVar3.hashCode())) * 31, 31, this.k);
        String str2 = this.l;
        int hashCode4 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        cf31 cf31Var = this.m;
        return Boolean.hashCode(this.o) + unr0.c((hashCode4 + (cf31Var != null ? cf31Var.hashCode() : 0)) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder v = b64.v("Vertical(id=", this.a, ", tariffClass=", this.b, ", type=");
        v.append(this.c);
        v.append(", title=");
        v.append(this.d);
        v.append(", titleTemplate=");
        tse0.x(this.e, ", tariffs=", ", defaultTariff=", v, this.f);
        v.append(this.g);
        v.append(", image=");
        v.append(this.h);
        v.append(", icon=");
        v.append(this.i);
        v.append(", headerIcon=");
        v.append(this.j);
        v.append(", headerTitle=");
        g8e.D(v, this.k, ", price=", this.l, ", multiclass=");
        v.append(this.m);
        v.append(", requirementOverrides=");
        v.append(this.n);
        v.append(", trapOnly=");
        return x4e.i(v, this.o, Extension.C_BRAKE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oa31() {
        this(null, 0 == true ? 1 : 0, 32767);
    }

    public oa31(String str, String str2, VerticalType verticalType, String str3, String str4, List list, String str5, n7v n7vVar, n7v n7vVar2, n7v n7vVar3, String str6, String str7, cf31 cf31Var, List list2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = verticalType;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = str5;
        this.h = n7vVar;
        this.i = n7vVar2;
        this.j = n7vVar3;
        this.k = str6;
        this.l = str7;
        this.m = cf31Var;
        this.n = list2;
        this.o = z;
    }
}
