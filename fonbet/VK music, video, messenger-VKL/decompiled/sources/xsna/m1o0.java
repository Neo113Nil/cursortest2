package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: TaggedItemsState.kt */
/* loaded from: classes18.dex */
public final class m1o0 implements km50 {
    public final List<a210> b;
    public final boolean c;
    public final boolean d;
    public final g1o0 e;
    public final Throwable f;

    public m1o0() {
        this(0);
    }

    public static m1o0 a(m1o0 m1o0Var, List list, boolean z, boolean z2, g1o0 g1o0Var, int i) {
        if ((i & 1) != 0) {
            list = m1o0Var.b;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            z = m1o0Var.c;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = m1o0Var.d;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            g1o0Var = m1o0Var.e;
        }
        g1o0 g1o0Var2 = g1o0Var;
        Throwable th = (i & 16) != 0 ? m1o0Var.f : null;
        m1o0Var.getClass();
        return new m1o0(list2, z3, z4, g1o0Var2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1o0)) {
            return false;
        }
        m1o0 m1o0Var = (m1o0) obj;
        return epx.f(this.b, m1o0Var.b) && this.c == m1o0Var.c && this.d == m1o0Var.d && epx.f(this.e, m1o0Var.e) && epx.f(this.f, m1o0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d)) * 31;
        Throwable th = this.f;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaggedItemsState(items=");
        sb.append(this.b);
        sb.append(", isLoading=");
        sb.append(this.c);
        sb.append(", isFooterLoading=");
        sb.append(this.d);
        sb.append(", pageState=");
        sb.append(this.e);
        sb.append(", throwable=");
        return oq.c(sb, this.f, ')');
    }

    public m1o0(List<a210> list, boolean z, boolean z2, g1o0 g1o0Var, Throwable th) {
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = g1o0Var;
        this.f = th;
    }

    public m1o0(int i) {
        this(EmptyList.b, false, false, new g1o0(0), null);
    }
}
