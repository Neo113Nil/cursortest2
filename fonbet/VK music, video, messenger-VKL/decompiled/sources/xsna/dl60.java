package xsna;

import java.util.List;
import xsna.ll60;

/* compiled from: NewsfeedHintHelper.kt */
/* loaded from: classes4.dex */
public final class dl60 {
    public final String a;
    public final List<Integer> b;
    public final nhi c;
    public final kl60 d;
    public final sux e;
    public final ll60.a f;
    public final ll60.b g;

    public dl60(String str, List list, nhi nhiVar, kl60 kl60Var, sux suxVar, ll60.a aVar, ll60.b bVar) {
        this.a = str;
        this.b = list;
        this.c = nhiVar;
        this.d = kl60Var;
        this.e = suxVar;
        this.f = aVar;
        this.g = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl60)) {
            return false;
        }
        dl60 dl60Var = (dl60) obj;
        return epx.f(this.a, dl60Var.a) && epx.f(this.b, dl60Var.b) && this.c.equals(dl60Var.c) && this.d.equals(dl60Var.d) && this.e.equals(dl60Var.e) && this.f.equals(dl60Var.f) && this.g.equals(dl60Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + qoy.b((this.d.hashCode() + ((this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, true)) * 31)) * 31);
    }

    public final String toString() {
        return "NewsfeedHint(id=" + this.a + ", itemViewTypes=" + this.b + ", getAnchorView=" + this.c + ", viewConfig=" + this.d + ", canTouchOuterViews=true, needToShow=" + this.e + ", listener=" + this.f + ", targetClickListener=" + this.g + ')';
    }
}
