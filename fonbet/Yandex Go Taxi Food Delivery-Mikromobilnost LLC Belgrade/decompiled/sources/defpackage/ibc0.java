package defpackage;

import com.yandex.go.places.models.data.entities.network.CategoryFilterType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ibc0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final jbc0 f;
    public final CategoryFilterType g;
    public final boolean h;
    public final boolean i;

    public ibc0(String str, String str2, String str3, String str4, String str5, jbc0 jbc0Var, CategoryFilterType categoryFilterType, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = jbc0Var;
        this.g = categoryFilterType;
        this.h = z;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibc0)) {
            return false;
        }
        ibc0 ibc0Var = (ibc0) obj;
        return jl40.l(this.a, ibc0Var.a) && jl40.l(this.b, ibc0Var.b) && jl40.l(this.c, ibc0Var.c) && jl40.l(this.d, ibc0Var.d) && jl40.l(this.e, ibc0Var.e) && jl40.l(this.f, ibc0Var.f) && this.g == ibc0Var.g && this.h == ibc0Var.h && this.i == ibc0Var.i;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.i) + unr0.e((this.g.hashCode() + ((this.f.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder v = b64.v("PlacesMapScreenCategoryFilter(id=", this.a, ", analyticsType=", this.b, ", iconUrl=");
        g8e.D(v, this.c, ", title=", this.d, ", contentDescription=");
        v.append(this.e);
        v.append(", action=");
        v.append(this.f);
        v.append(", type=");
        v.append(this.g);
        v.append(", useV2Chips=");
        v.append(this.h);
        v.append(", isSelected=");
        return x4e.i(v, this.i, Extension.C_BRAKE);
    }
}
