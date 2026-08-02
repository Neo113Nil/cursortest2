package defpackage;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lxt0 implements ga5 {
    public final String a;
    public final ea5 b;
    public final tbu c;
    public final String d;
    public final sp8 e;
    public final int f;
    public final boolean g;
    public final ProductMode$Taxi.SectionType h;

    public /* synthetic */ lxt0(String str, ea5 ea5Var, tbu tbuVar, String str2, int i) {
        this(0, ea5Var, (i & 16) != 0 ? op8.a : pp8.a, tbuVar, null, str, str2, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxt0)) {
            return false;
        }
        lxt0 lxt0Var = (lxt0) obj;
        return jl40.l(this.a, lxt0Var.a) && jl40.l(this.b, lxt0Var.b) && jl40.l(this.c, lxt0Var.c) && jl40.l(this.d, lxt0Var.d) && jl40.l(this.e, lxt0Var.e) && this.f == lxt0Var.f && this.g == lxt0Var.g && this.h == lxt0Var.h;
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
        int e = unr0.e(oyr.b(this.f, (this.e.hashCode() + unr0.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31, 31), 31, this.g);
        ProductMode$Taxi.SectionType sectionType = this.h;
        return e + (sectionType == null ? 0 : sectionType.hashCode());
    }

    @Override // defpackage.ga5
    public final ga5 r(boolean z, ProductMode$Taxi.SectionType sectionType) {
        return new lxt0(this.f, this.b, this.e, this.c, sectionType, this.a, this.d, z);
    }

    @Override // defpackage.ga5
    public final boolean t() {
        return this.g;
    }

    public final String toString() {
        return "SquareButtonShortcutModel(id=" + this.a + ", base=" + this.b + ", service=" + this.c + ", iconTag=" + this.d + ", cardType=" + this.e + ", iconRes=" + this.f + ", useNavWidth=" + this.g + ", sectionType=" + this.h + Extension.C_BRAKE;
    }

    public final tbu v() {
        return this.c;
    }

    public lxt0(int i, ea5 ea5Var, sp8 sp8Var, tbu tbuVar, ProductMode$Taxi.SectionType sectionType, String str, String str2, boolean z) {
        this.a = str;
        this.b = ea5Var;
        this.c = tbuVar;
        this.d = str2;
        this.e = sp8Var;
        this.f = i;
        this.g = z;
        this.h = sectionType;
    }
}
