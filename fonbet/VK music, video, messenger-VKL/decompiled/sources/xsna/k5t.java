package xsna;

import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: GalleryState.kt */
/* loaded from: classes4.dex */
public final class k5t {
    public static final k5t d = new k5t(0);
    public final List<? extends wc1> a;
    public final HashMap<wc1, md90> b;
    public wc1 c;

    public k5t() {
        this(0);
    }

    public final k5t a() {
        return new k5t(this.a, new HashMap(this.b), this.c);
    }

    public final wc1 b() {
        wc1 wc1Var = this.c;
        return wc1Var == null ? new wc1("", 0) : wc1Var;
    }

    public final md90 c() {
        md90 md90Var = this.b.get(b());
        if (md90Var != null) {
            return md90Var;
        }
        md90 md90Var2 = md90.d;
        return md90.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5t)) {
            return false;
        }
        k5t k5tVar = (k5t) obj;
        return epx.f(this.a, k5tVar.a) && epx.f(this.b, k5tVar.b) && epx.f(this.c, k5tVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        wc1 wc1Var = this.c;
        return Integer.hashCode(0) + ((hashCode + (wc1Var == null ? 0 : wc1Var.hashCode())) * 31);
    }

    public final String toString() {
        return "GalleryState(albums=" + this.a + ", media=" + this.b + ", album=" + this.c + ", providerId=0)";
    }

    public k5t(List list, HashMap hashMap, wc1 wc1Var) {
        this.a = list;
        this.b = hashMap;
        this.c = wc1Var;
    }

    public k5t(int i) {
        this(EmptyList.b, new HashMap(), null);
    }
}
