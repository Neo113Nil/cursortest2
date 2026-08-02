package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mr4 {
    public final tpr a;
    public final tpr b;
    public final tpr c;
    public final Integer d;
    public final Integer e;

    public mr4(tpr tprVar, tpr tprVar2, tpr tprVar3, Integer num, Integer num2) {
        this.a = tprVar;
        this.b = tprVar2;
        this.c = tprVar3;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr4)) {
            return false;
        }
        mr4 mr4Var = (mr4) obj;
        return jl40.l(this.a, mr4Var.a) && jl40.l(this.b, mr4Var.b) && jl40.l(this.c, mr4Var.c) && jl40.l(this.d, mr4Var.d) && jl40.l(this.e, mr4Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerCarouselArgs(coordinatesFlow=");
        sb.append(this.a);
        sb.append(", screenFlow=");
        sb.append(this.b);
        sb.append(", displayIdsFlow=");
        sb.append(this.c);
        sb.append(", topPadding=");
        sb.append(this.d);
        sb.append(", bottomPadding=");
        return oo31.j(sb, this.e, Extension.C_BRAKE);
    }
}
