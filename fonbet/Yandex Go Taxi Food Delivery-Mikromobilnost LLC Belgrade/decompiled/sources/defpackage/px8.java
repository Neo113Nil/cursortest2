package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class px8 implements rx8 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final cdc e;
    public final cdc f;
    public final gmw0 g;
    public final int h;
    public final boolean i;
    public final String j;

    public px8(String str, String str2, String str3, boolean z, cdc cdcVar, cdc cdcVar2, gmw0 gmw0Var, int i, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = cdcVar;
        this.f = cdcVar2;
        this.g = gmw0Var;
        this.h = i;
        this.i = z2;
        this.j = qv10.h(i, str, "_");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px8)) {
            return false;
        }
        px8 px8Var = (px8) obj;
        return jl40.l(this.a, px8Var.a) && jl40.l(this.b, px8Var.b) && jl40.l(this.c, px8Var.c) && this.d == px8Var.d && this.e.equals(px8Var.e) && this.f.equals(px8Var.f) && jl40.l(this.g, px8Var.g) && this.h == px8Var.h && this.i == px8Var.i;
    }

    @Override // defpackage.ux8, defpackage.e6v
    public final String getId() {
        return this.j;
    }

    @Override // defpackage.rx8
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.i) + oyr.b(this.h, (this.g.hashCode() + oyr.b(this.f.a, oyr.b(this.e.a, unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31), 31)) * 31, 31);
    }

    @Override // defpackage.rx8
    public final boolean isSelected() {
        return this.d;
    }

    @Override // defpackage.ux8
    public final String k() {
        return this.a;
    }

    @Override // defpackage.rx8
    public final cdc p() {
        return this.e;
    }

    @Override // defpackage.rx8
    public final String s() {
        return this.c;
    }

    public final String toString() {
        StringBuilder v = b64.v("Compound(requirementName=", this.a, ", title=", this.b, ", bigImageUrl=");
        tse0.y(this.c, ", isSelected=", ", buttonBgColor=", v, this.d);
        v.append(this.e);
        v.append(", buttonIconColor=");
        v.append(this.f);
        v.append(", supportedRequirement=");
        v.append(this.g);
        v.append(", optionIndex=");
        v.append(this.h);
        v.append(", isGlued=");
        return x4e.i(v, this.i, Extension.C_BRAKE);
    }

    @Override // defpackage.rx8
    public final cdc u() {
        return this.f;
    }
}
