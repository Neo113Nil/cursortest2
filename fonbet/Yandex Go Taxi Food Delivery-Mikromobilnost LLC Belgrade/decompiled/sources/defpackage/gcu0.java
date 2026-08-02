package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class gcu0 {
    public final Long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public gcu0(Long l, String str, String str2, String str3, String str4, boolean z) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcu0)) {
            return false;
        }
        gcu0 gcu0Var = (gcu0) obj;
        return jl40.l(this.a, gcu0Var.a) && jl40.l(this.b, gcu0Var.b) && jl40.l(this.c, gcu0Var.c) && jl40.l(this.d, gcu0Var.d) && jl40.l(this.e, gcu0Var.e) && this.f == gcu0Var.f;
    }

    public final int hashCode() {
        Long l = this.a;
        int b = unr0.b((l == null ? 0 : l.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int b2 = unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((b2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerPackEntity(rowId=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", coverId=");
        g8e.D(sb, this.c, ", title=", this.d, ", description=");
        return nnm.i(this.e, ", isLocal=", Extension.C_BRAKE, sb, this.f);
    }
}
