package defpackage;

import com.yandex.go.requirements.api.domain.model.OptionViewStyle;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ejj0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final OptionViewStyle f;
    public final n7v g;
    public final n7v h;
    public final n7v i;
    public final String j;
    public final String k;
    public final kf70 l;
    public final de70 m;
    public final String n;
    public final Map o;

    public ejj0(String str, String str2, String str3, int i, int i2, OptionViewStyle optionViewStyle, n7v n7vVar, n7v n7vVar2, n7v n7vVar3, String str4, String str5, kf70 kf70Var, de70 de70Var, String str6, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = optionViewStyle;
        this.g = n7vVar;
        this.h = n7vVar2;
        this.i = n7vVar3;
        this.j = str4;
        this.k = str5;
        this.l = kf70Var;
        this.m = de70Var;
        this.n = str6;
        this.o = map;
    }

    public static ejj0 a(ejj0 ejj0Var, int i, int i2) {
        return new ejj0(ejj0Var.a, ejj0Var.b, ejj0Var.c, i, i2, ejj0Var.f, ejj0Var.g, ejj0Var.h, ejj0Var.i, ejj0Var.j, ejj0Var.k, ejj0Var.l, ejj0Var.m, ejj0Var.n, ejj0Var.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejj0)) {
            return false;
        }
        ejj0 ejj0Var = (ejj0) obj;
        return jl40.l(this.a, ejj0Var.a) && jl40.l(this.b, ejj0Var.b) && jl40.l(this.c, ejj0Var.c) && this.d == ejj0Var.d && this.e == ejj0Var.e && this.f == ejj0Var.f && jl40.l(this.g, ejj0Var.g) && jl40.l(this.h, ejj0Var.h) && jl40.l(this.i, ejj0Var.i) && jl40.l(this.j, ejj0Var.j) && jl40.l(this.k, ejj0Var.k) && jl40.l(this.l, ejj0Var.l) && this.m.equals(ejj0Var.m) && jl40.l(this.n, ejj0Var.n) && jl40.l(this.o, ejj0Var.o);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + oyr.b(this.e, oyr.b(this.d, unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31)) * 31;
        n7v n7vVar = this.g;
        int hashCode2 = (hashCode + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31;
        n7v n7vVar2 = this.h;
        int hashCode3 = (hashCode2 + (n7vVar2 == null ? 0 : n7vVar2.hashCode())) * 31;
        n7v n7vVar3 = this.i;
        int hashCode4 = (hashCode3 + (n7vVar3 == null ? 0 : n7vVar3.hashCode())) * 31;
        String str = this.j;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        kf70 kf70Var = this.l;
        return this.o.hashCode() + unr0.b((this.m.hashCode() + ((hashCode6 + (kf70Var != null ? kf70Var.hashCode() : 0)) * 31)) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder v = b64.v("RequirementOption(name=", this.a, ", title=", this.b, ", label=");
        b64.A(this.d, this.c, ", weight=", ", maxCount=", v);
        v.append(this.e);
        v.append(", style=");
        v.append(this.f);
        v.append(", icon=");
        v.append(this.g);
        v.append(", iconDisabled=");
        v.append(this.h);
        v.append(", image=");
        v.append(this.i);
        v.append(", imageBigTag=");
        v.append(this.j);
        v.append(", carouselImage=");
        v.append(this.k);
        v.append(", value=");
        v.append(this.l);
        v.append(", disabledLabels=");
        v.append(this.m);
        v.append(", itemTrail=");
        v.append(this.n);
        v.append(", titleForms=");
        return b64.r(v, this.o, Extension.C_BRAKE);
    }
}
