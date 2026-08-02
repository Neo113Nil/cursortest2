package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ez8 {
    public final String a;
    public final ye8 b;
    public final List c;
    public final List d;
    public final aso e;
    public final v860 f;
    public final aso g;

    public ez8(String str, ye8 ye8Var, List list, List list2, aso asoVar, v860 v860Var, aso asoVar2) {
        this.a = str;
        this.b = ye8Var;
        this.c = list;
        this.d = list2;
        this.e = asoVar;
        this.f = v860Var;
        this.g = asoVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez8)) {
            return false;
        }
        ez8 ez8Var = (ez8) obj;
        return jl40.l(this.a, ez8Var.a) && jl40.l(this.b, ez8Var.b) && jl40.l(this.c, ez8Var.c) && jl40.l(this.d, ez8Var.d) && jl40.l(this.e, ez8Var.e) && jl40.l(this.f, ez8Var.f) && jl40.l(this.g, ez8Var.g);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        aso asoVar = this.e;
        int hashCode = (this.f.hashCode() + ((c + (asoVar == null ? 0 : asoVar.hashCode())) * 31)) * 31;
        aso asoVar2 = this.g;
        return hashCode + (asoVar2 != null ? asoVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarouselProductEntity(productType=");
        sb.append(this.a);
        sb.append(", card=");
        sb.append(this.b);
        sb.append(", headerTopButtons=");
        nnm.w(sb, this.c, ", screenItems=", this.d, ", fullscreenNotifications=");
        sb.append(this.e);
        sb.append(", nfcPayloadEntity=");
        sb.append(this.f);
        sb.append(", educationsV2=");
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
