package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class di80 implements fi80 {
    public final String a;
    public final lqb b;
    public final zpb c;
    public final boolean d;
    public final String e;
    public final String f;

    public di80(String str, lqb lqbVar, zpb zpbVar, boolean z, String str2, String str3) {
        this.a = str;
        this.b = lqbVar;
        this.c = zpbVar;
        this.d = z;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di80)) {
            return false;
        }
        di80 di80Var = (di80) obj;
        return jl40.l(this.a, di80Var.a) && this.b.equals(di80Var.b) && this.c.equals(di80Var.c) && this.d == di80Var.d && jl40.l(this.e, di80Var.e) && jl40.l(this.f, di80Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectableChip(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", chipColors=");
        sb.append(this.c);
        sb.append(", isSelected=");
        sb.append(this.d);
        sb.append(", optionId=");
        return g8e.r(sb, this.e, ", selectedImageUrl=", this.f, Extension.C_BRAKE);
    }
}
