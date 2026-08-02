package defpackage;

import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class a0p0 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final xzo0 d;
    public final String e;
    public final yzo0 f;
    public final yzo0 g;
    public final zzo0 h;
    public final c i;

    public a0p0(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, xzo0 xzo0Var, String str, yzo0 yzo0Var, yzo0 yzo0Var2, zzo0 zzo0Var, c cVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = xzo0Var;
        this.e = str;
        this.f = yzo0Var;
        this.g = yzo0Var2;
        this.h = zzo0Var;
        this.i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0p0)) {
            return false;
        }
        a0p0 a0p0Var = (a0p0) obj;
        return jl40.l(this.a, a0p0Var.a) && jl40.l(this.b, a0p0Var.b) && jl40.l(this.c, a0p0Var.c) && jl40.l(this.d, a0p0Var.d) && jl40.l(this.e, a0p0Var.e) && jl40.l(this.f, a0p0Var.f) && jl40.l(this.g, a0p0Var.g) && jl40.l(this.h, a0p0Var.h) && jl40.l(this.i, a0p0Var.i);
    }

    public final int hashCode() {
        int b = smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        xzo0 xzo0Var = this.d;
        int hashCode = (b + (xzo0Var == null ? 0 : xzo0Var.hashCode())) * 31;
        String str = this.e;
        int hashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        zzo0 zzo0Var = this.h;
        int hashCode3 = (hashCode2 + (zzo0Var == null ? 0 : zzo0Var.hashCode())) * 31;
        c cVar = this.i;
        return hashCode3 + (cVar != null ? cVar.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "ScootersSubscriptionUpsaleWindow(title=", ", subtitle=", ", priceTitle=");
        r.append((Object) this.c);
        r.append(", badge=");
        r.append(this.d);
        r.append(", imageTag=");
        r.append(this.e);
        r.append(", confirmButton=");
        r.append(this.f);
        r.append(", rejectButton=");
        r.append(this.g);
        r.append(", legalInfo=");
        r.append(this.h);
        r.append(", purchaseInfo=");
        r.append(this.i);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
