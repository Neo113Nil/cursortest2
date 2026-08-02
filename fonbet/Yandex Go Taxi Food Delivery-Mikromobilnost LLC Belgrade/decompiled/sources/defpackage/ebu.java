package defpackage;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ebu implements ga5 {
    public final String a;
    public final ea5 b;
    public final String c;
    public final boolean d;
    public final tbu e;
    public final pcu f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final sp8 j;
    public final ProductMode$Taxi.SectionType k;

    public /* synthetic */ ebu(String str, ea5 ea5Var, String str2, boolean z, tbu tbuVar, pcu pcuVar, String str3, boolean z2, int i) {
        this(str, ea5Var, str2, z, tbuVar, (i & 128) != 0 ? null : pcuVar, false, (i & 512) != 0 ? null : str3, z2, op8.a, null);
    }

    public static ebu v(ebu ebuVar, String str, pcu pcuVar, boolean z, ProductMode$Taxi.SectionType sectionType, int i) {
        return new ebu((i & 1) != 0 ? ebuVar.a : str, ebuVar.b, ebuVar.c, ebuVar.d, ebuVar.e, (i & 128) != 0 ? ebuVar.f : pcuVar, (i & 256) != 0 ? ebuVar.g : z, ebuVar.h, ebuVar.i, ebuVar.j, (i & 4096) != 0 ? ebuVar.k : sectionType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebu)) {
            return false;
        }
        ebu ebuVar = (ebu) obj;
        return jl40.l(this.a, ebuVar.a) && jl40.l(this.b, ebuVar.b) && jl40.l(this.c, ebuVar.c) && this.d == ebuVar.d && jl40.l(this.e, ebuVar.e) && jl40.l(this.f, ebuVar.f) && this.g == ebuVar.g && jl40.l(this.h, ebuVar.h) && this.i == ebuVar.i && jl40.l(this.j, ebuVar.j) && this.k == ebuVar.k;
    }

    @Override // defpackage.ga5
    public final ea5 getBase() {
        return this.b;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int e = unr0.e((this.e.hashCode() + unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31, 961, false);
        pcu pcuVar = this.f;
        int e2 = unr0.e((e + (pcuVar == null ? 0 : pcuVar.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        int hashCode2 = (this.j.hashCode() + unr0.e((e2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i)) * 31;
        ProductMode$Taxi.SectionType sectionType = this.k;
        return hashCode2 + (sectionType != null ? sectionType.hashCode() : 0);
    }

    @Override // defpackage.ga5
    public final ga5 r(boolean z, ProductMode$Taxi.SectionType sectionType) {
        return v(this, this.a, null, z, sectionType, 3838);
    }

    @Override // defpackage.ga5
    public final boolean t() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderModel(id=");
        sb.append(this.a);
        sb.append(", base=");
        sb.append(this.b);
        sb.append(", imageTag=");
        tse0.y(this.c, ", allowHideIcon=", ", service=", sb, this.d);
        sb.append(this.e);
        sb.append(", inProgress=false, subtitleColor=null, trail=");
        sb.append(this.f);
        sb.append(", useNavWidth=");
        unr0.A(", transitionName=", this.h, ", isFullWidth=", sb, this.g);
        sb.append(this.i);
        sb.append(", cardType=");
        sb.append(this.j);
        sb.append(", sectionType=");
        sb.append(this.k);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public final tbu w() {
        return this.e;
    }

    public final String x() {
        return this.h;
    }

    public ebu(String str, ea5 ea5Var, String str2, boolean z, tbu tbuVar, pcu pcuVar, boolean z2, String str3, boolean z3, sp8 sp8Var, ProductMode$Taxi.SectionType sectionType) {
        this.a = str;
        this.b = ea5Var;
        this.c = str2;
        this.d = z;
        this.e = tbuVar;
        this.f = pcuVar;
        this.g = z2;
        this.h = str3;
        this.i = z3;
        this.j = sp8Var;
        this.k = sectionType;
    }
}
