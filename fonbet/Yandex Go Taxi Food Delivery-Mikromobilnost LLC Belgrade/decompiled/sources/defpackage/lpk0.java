package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lpk0 implements zjk0 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final hg4 e;
    public final int f;
    public final kpk0 g;
    public final xss0 h;
    public final List i;
    public final akk0 j;

    public lpk0(String str, String str2, CharSequence charSequence, CharSequence charSequence2, hg4 hg4Var, int i, kpk0 kpk0Var, xss0 xss0Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = hg4Var;
        this.f = i;
        this.g = kpk0Var;
        this.h = xss0Var;
        this.i = list;
        this.j = qpa1.e(str2, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpk0)) {
            return false;
        }
        lpk0 lpk0Var = (lpk0) obj;
        return jl40.l(this.a, lpk0Var.a) && jl40.l(this.b, lpk0Var.b) && jl40.l(this.c, lpk0Var.c) && jl40.l(this.d, lpk0Var.d) && jl40.l(this.e, lpk0Var.e) && this.f == lpk0Var.f && jl40.l(this.g, lpk0Var.g) && jl40.l(this.h, lpk0Var.h) && jl40.l(this.i, lpk0Var.i);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.j;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        int hashCode4 = (this.g.hashCode() + oyr.b(this.f, (this.e.hashCode() + ((hashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31)) * 31, 31)) * 31;
        xss0 xss0Var = this.h;
        return this.i.hashCode() + ((hashCode4 + (xss0Var != null ? xss0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardTipsWishSelectorItemUiState(id=", this.a, ", analyticsId=", this.b, ", title=");
        vfc.A(v, this.c, ", subtitle=", this.d, ", background=");
        v.append(this.e);
        v.append(", backgroundCornerRadius=");
        v.append(this.f);
        v.append(", mediaContent=");
        v.append(this.g);
        v.append(", preferredTipsSubscription=");
        v.append(this.h);
        v.append(", elements=");
        return ly3.s(v, this.i, Extension.C_BRAKE);
    }
}
