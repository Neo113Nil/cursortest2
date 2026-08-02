package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class a65 implements k65, e6v {
    public final String a;
    public final CharSequence b;
    public final List c;
    public final kwd d;
    public final kwd e;
    public final nj4 f;
    public final fr g;
    public final boolean h;

    public a65(String str, CharSequence charSequence, List list, kwd kwdVar, kwd kwdVar2, nj4 nj4Var, fr frVar, boolean z) {
        this.a = str;
        this.b = charSequence;
        this.c = list;
        this.d = kwdVar;
        this.e = kwdVar2;
        this.f = nj4Var;
        this.g = frVar;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a65)) {
            return false;
        }
        a65 a65Var = (a65) obj;
        return jl40.l(this.a, a65Var.a) && jl40.l(this.b, a65Var.b) && jl40.l(this.c, a65Var.c) && jl40.l(this.d, a65Var.d) && jl40.l(this.e, a65Var.e) && jl40.l(this.f, a65Var.f) && jl40.l(this.g, a65Var.g) && this.h == a65Var.h;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int c = unr0.c(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        kwd kwdVar = this.d;
        int hashCode = (c + (kwdVar == null ? 0 : kwdVar.a.hashCode())) * 31;
        kwd kwdVar2 = this.e;
        int hashCode2 = (hashCode + (kwdVar2 == null ? 0 : kwdVar2.a.hashCode())) * 31;
        nj4 nj4Var = this.f;
        int hashCode3 = (hashCode2 + (nj4Var == null ? 0 : nj4Var.hashCode())) * 31;
        fr frVar = this.g;
        return Boolean.hashCode(this.h) + ((hashCode3 + (frVar != null ? frVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "OrganizationPreviewItem(id=", this.a, ", title=", ", images=");
        t.append(this.c);
        t.append(", subtitle=");
        t.append(this.d);
        t.append(", characteristics=");
        t.append(this.e);
        t.append(", badge=");
        t.append(this.f);
        t.append(", action=");
        t.append(this.g);
        t.append(", isShimmering=");
        t.append(this.h);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }

    public /* synthetic */ a65() {
        this("", "", EmptyList.a, null, null, null, null, true);
    }
}
