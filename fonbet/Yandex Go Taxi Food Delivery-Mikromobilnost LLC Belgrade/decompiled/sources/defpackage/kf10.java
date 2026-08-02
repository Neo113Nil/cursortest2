package defpackage;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kf10 implements ga5 {
    public final String a;
    public final ea5 b;
    public final g8v c;
    public final sp8 d;
    public final boolean e;
    public final ProductMode$Taxi.SectionType f;

    public /* synthetic */ kf10(String str, ea5 ea5Var, g8v g8vVar, int i) {
        this(str, ea5Var, g8vVar, (i & 8) != 0 ? op8.a : pp8.a, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf10)) {
            return false;
        }
        kf10 kf10Var = (kf10) obj;
        return jl40.l(this.a, kf10Var.a) && jl40.l(this.b, kf10Var.b) && jl40.l(this.c, kf10Var.c) && jl40.l(this.d, kf10Var.d) && this.e == kf10Var.e && this.f == kf10Var.f;
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
        int e = unr0.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
        ProductMode$Taxi.SectionType sectionType = this.f;
        return e + (sectionType == null ? 0 : sectionType.hashCode());
    }

    @Override // defpackage.ga5
    public final ga5 r(boolean z, ProductMode$Taxi.SectionType sectionType) {
        return new kf10(this.a, this.b, this.c, this.d, z, sectionType);
    }

    @Override // defpackage.ga5
    public final boolean t() {
        return this.e;
    }

    public final String toString() {
        return "MediaShortcutModel(id=" + this.a + ", base=" + this.b + ", backgroundAnchor=" + this.c + ", cardType=" + this.d + ", useNavWidth=" + this.e + ", sectionType=" + this.f + Extension.C_BRAKE;
    }

    public kf10(String str, ea5 ea5Var, g8v g8vVar, sp8 sp8Var, boolean z, ProductMode$Taxi.SectionType sectionType) {
        this.a = str;
        this.b = ea5Var;
        this.c = g8vVar;
        this.d = sp8Var;
        this.e = z;
        this.f = sectionType;
    }
}
