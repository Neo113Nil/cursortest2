package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ShopConditionParams.kt */
/* loaded from: classes18.dex */
public final class hej0 {
    public static final hej0 c = new hej0(EmptyList.b, null);
    public final List<iej0> a;
    public final gej0 b;

    public hej0(List list, gej0 gej0Var) {
        this.a = list;
        this.b = gej0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hej0)) {
            return false;
        }
        hej0 hej0Var = (hej0) obj;
        hej0Var.getClass();
        return epx.f(this.a, hej0Var.a) && epx.f(this.b, hej0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gej0 gej0Var = this.b;
        return hashCode + (gej0Var == null ? 0 : gej0Var.hashCode());
    }

    public final String toString() {
        return "ShopConditionParams(title=, sections=" + this.a + ", button=" + this.b + ')';
    }
}
