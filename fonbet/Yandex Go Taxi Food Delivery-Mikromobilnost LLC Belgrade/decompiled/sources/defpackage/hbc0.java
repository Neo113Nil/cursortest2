package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hbc0 {
    public final cav a;
    public final cav b;
    public final cav c;
    public final cav d;
    public final cav e;
    public final cav f;
    public final cav g;
    public final cav h;

    public hbc0(cav cavVar, cav cavVar2, cav cavVar3, cav cavVar4, cav cavVar5, cav cavVar6, cav cavVar7, cav cavVar8) {
        this.a = cavVar;
        this.b = cavVar2;
        this.c = cavVar3;
        this.d = cavVar4;
        this.e = cavVar5;
        this.f = cavVar6;
        this.g = cavVar7;
        this.h = cavVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbc0)) {
            return false;
        }
        hbc0 hbc0Var = (hbc0) obj;
        return jl40.l(this.a, hbc0Var.a) && jl40.l(this.b, hbc0Var.b) && jl40.l(this.c, hbc0Var.c) && jl40.l(this.d, hbc0Var.d) && jl40.l(this.e, hbc0Var.e) && jl40.l(this.f, hbc0Var.f) && jl40.l(this.g, hbc0Var.g) && jl40.l(this.h, hbc0Var.h);
    }

    public final int hashCode() {
        cav cavVar = this.a;
        int hashCode = (cavVar == null ? 0 : cavVar.hashCode()) * 31;
        cav cavVar2 = this.b;
        int hashCode2 = (hashCode + (cavVar2 == null ? 0 : cavVar2.hashCode())) * 31;
        cav cavVar3 = this.c;
        int hashCode3 = (hashCode2 + (cavVar3 == null ? 0 : cavVar3.hashCode())) * 31;
        cav cavVar4 = this.d;
        int hashCode4 = (hashCode3 + (cavVar4 == null ? 0 : cavVar4.hashCode())) * 31;
        cav cavVar5 = this.e;
        int hashCode5 = (hashCode4 + (cavVar5 == null ? 0 : cavVar5.hashCode())) * 31;
        cav cavVar6 = this.f;
        int hashCode6 = (hashCode5 + (cavVar6 == null ? 0 : cavVar6.hashCode())) * 31;
        cav cavVar7 = this.g;
        int hashCode7 = (hashCode6 + (cavVar7 == null ? 0 : cavVar7.hashCode())) * 31;
        cav cavVar8 = this.h;
        return hashCode7 + (cavVar8 != null ? cavVar8.hashCode() : 0);
    }

    public final String toString() {
        return "PlacesMapPinImagesInfo(homePin=" + this.a + ", workPin=" + this.b + ", favoritePin=" + this.c + ", favoriteBadgeM=" + this.d + ", favoriteBadgeL=" + this.e + ", mediaOverlay=" + this.f + ", homeSelected=" + this.g + ", workSelected=" + this.h + Extension.C_BRAKE;
    }
}
