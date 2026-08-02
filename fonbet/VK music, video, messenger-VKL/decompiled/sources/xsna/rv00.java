package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MarketCategoriesFilterState.kt */
/* loaded from: classes18.dex */
public final class rv00 implements km50 {
    public final List<vv00> b;
    public final vv00 c;
    public final boolean d;

    public rv00() {
        this(0);
    }

    public static rv00 a(rv00 rv00Var, List list, vv00 vv00Var, boolean z, int i) {
        if ((i & 1) != 0) {
            list = rv00Var.b;
        }
        if ((i & 2) != 0) {
            vv00Var = rv00Var.c;
        }
        if ((i & 4) != 0) {
            z = rv00Var.d;
        }
        rv00Var.getClass();
        return new rv00(list, vv00Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv00)) {
            return false;
        }
        rv00 rv00Var = (rv00) obj;
        return epx.f(this.b, rv00Var.b) && epx.f(this.c, rv00Var.c) && this.d == rv00Var.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        vv00 vv00Var = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (vv00Var == null ? 0 : vv00Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCategoriesFilterState(categories=");
        sb.append(this.b);
        sb.append(", pickedCategory=");
        sb.append(this.c);
        sb.append(", isCategorySame=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public rv00(List<vv00> list, vv00 vv00Var, boolean z) {
        this.b = list;
        this.c = vv00Var;
        this.d = z;
    }

    public rv00(int i) {
        this(EmptyList.b, null, true);
    }
}
