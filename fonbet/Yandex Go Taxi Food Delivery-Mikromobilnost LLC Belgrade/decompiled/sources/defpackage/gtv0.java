package defpackage;

import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gtv0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final vib1 f;
    public final SuperAppDiscoveryMapExperiment.CategoryFilterType g;
    public final boolean h;
    public final boolean i;

    public gtv0(String str, String str2, String str3, String str4, String str5, vib1 vib1Var, SuperAppDiscoveryMapExperiment.CategoryFilterType categoryFilterType, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = vib1Var;
        this.g = categoryFilterType;
        this.h = z;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtv0)) {
            return false;
        }
        gtv0 gtv0Var = (gtv0) obj;
        return jl40.l(this.a, gtv0Var.a) && jl40.l(this.b, gtv0Var.b) && jl40.l(this.c, gtv0Var.c) && jl40.l(this.d, gtv0Var.d) && jl40.l(this.e, gtv0Var.e) && jl40.l(this.f, gtv0Var.f) && this.g == gtv0Var.g && this.h == gtv0Var.h && this.i == gtv0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + unr0.e((this.g.hashCode() + ((this.f.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder v = b64.v("SuperAppDiscoveryMapCategoryFilter(id=", this.a, ", defaultIconUrl=", this.b, ", selectedIconUrl=");
        g8e.D(v, this.c, ", title=", this.d, ", analyticsType=");
        v.append(this.e);
        v.append(", action=");
        v.append(this.f);
        v.append(", type=");
        v.append(this.g);
        v.append(", isSelectable=");
        v.append(this.h);
        v.append(", isSelected=");
        return x4e.i(v, this.i, Extension.C_BRAKE);
    }
}
