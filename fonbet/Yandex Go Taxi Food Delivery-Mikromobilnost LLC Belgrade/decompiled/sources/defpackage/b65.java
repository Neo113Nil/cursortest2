package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class b65 implements k65, e6v {
    public final String a;
    public final List b;
    public final CharSequence c;
    public final List d;
    public final List e;
    public final gk80 f;
    public final List g;
    public final fr h;
    public final fr i;
    public final boolean j;

    public b65(String str, List list, CharSequence charSequence, List list2, List list3, gk80 gk80Var, List list4, fr frVar, fr frVar2, boolean z) {
        this.a = str;
        this.b = list;
        this.c = charSequence;
        this.d = list2;
        this.e = list3;
        this.f = gk80Var;
        this.g = list4;
        this.h = frVar;
        this.i = frVar2;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b65)) {
            return false;
        }
        b65 b65Var = (b65) obj;
        return jl40.l(this.a, b65Var.a) && jl40.l(this.b, b65Var.b) && jl40.l(this.c, b65Var.c) && jl40.l(this.d, b65Var.d) && jl40.l(this.e, b65Var.e) && jl40.l(this.f, b65Var.f) && jl40.l(this.g, b65Var.g) && jl40.l(this.h, b65Var.h) && jl40.l(this.i, b65Var.i) && this.j == b65Var.j;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (c + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        List list = this.d;
        int c2 = unr0.c((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.e);
        gk80 gk80Var = this.f;
        int hashCode2 = (c2 + (gk80Var == null ? 0 : gk80Var.hashCode())) * 31;
        List list2 = this.g;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        fr frVar = this.h;
        int hashCode4 = (hashCode3 + (frVar == null ? 0 : frVar.hashCode())) * 31;
        fr frVar2 = this.i;
        return Boolean.hashCode(this.j) + ((hashCode4 + (frVar2 != null ? frVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = xvz.r("OrganizationPreviewItemV2(id=", this.a, ", images=", this.b, ", title=");
        r.append((Object) this.c);
        r.append(", subtitle=");
        r.append(this.d);
        r.append(", tags=");
        r.append(this.e);
        r.append(", rating=");
        r.append(this.f);
        r.append(", buttons=");
        r.append(this.g);
        r.append(", showAction=");
        r.append(this.h);
        r.append(", tapAction=");
        r.append(this.i);
        r.append(", isShimmering=");
        r.append(this.j);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ b65() {
        this("", r2, null, null, r2, null, null, null, null, true);
        EmptyList emptyList = EmptyList.a;
    }
}
