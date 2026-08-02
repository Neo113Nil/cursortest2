package defpackage;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class nxk0 implements ga5 {
    public final String a;
    public final ea5 b;
    public final tbu c;
    public final String d;
    public final int e;
    public final sp8 f;
    public final boolean g;
    public final ProductMode$Taxi.SectionType h;

    public nxk0(int i, ea5 ea5Var, sp8 sp8Var, tbu tbuVar, ProductMode$Taxi.SectionType sectionType, String str, String str2, boolean z) {
        this.a = str;
        this.b = ea5Var;
        this.c = tbuVar;
        this.d = str2;
        this.e = i;
        this.f = sp8Var;
        this.g = z;
        this.h = sectionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxk0)) {
            return false;
        }
        nxk0 nxk0Var = (nxk0) obj;
        return jl40.l(this.a, nxk0Var.a) && jl40.l(this.b, nxk0Var.b) && jl40.l(this.c, nxk0Var.c) && jl40.l(this.d, nxk0Var.d) && this.e == nxk0Var.e && jl40.l(this.f, nxk0Var.f) && this.g == nxk0Var.g && this.h == nxk0Var.h;
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
        int e = unr0.e((this.f.hashCode() + oyr.b(this.e, unr0.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31)) * 31, 31, this.g);
        ProductMode$Taxi.SectionType sectionType = this.h;
        return e + (sectionType == null ? 0 : sectionType.hashCode());
    }

    @Override // defpackage.ga5
    public final ga5 r(boolean z, ProductMode$Taxi.SectionType sectionType) {
        return new nxk0(this.e, this.b, this.f, this.c, sectionType, this.a, this.d, z);
    }

    @Override // defpackage.ga5
    public final boolean t() {
        return this.g;
    }

    public final String toString() {
        return "RoundButtonShortcutModel(id=" + this.a + ", base=" + this.b + ", service=" + this.c + ", iconTag=" + this.d + ", iconRes=" + this.e + ", cardType=" + this.f + ", useNavWidth=" + this.g + ", sectionType=" + this.h + Extension.C_BRAKE;
    }

    public final tbu v() {
        return this.c;
    }

    public /* synthetic */ nxk0(String str, ea5 ea5Var, tbu tbuVar, String str2, int i, int i2) {
        this((i2 & 16) != 0 ? 0 : i, ea5Var, op8.a, tbuVar, null, str, str2, false);
    }
}
