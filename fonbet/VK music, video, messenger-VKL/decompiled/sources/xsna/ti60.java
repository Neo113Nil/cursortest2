package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: NewsfeedFilterListState.kt */
/* loaded from: classes18.dex */
public final class ti60 implements km50 {
    public static final ti60 f = new ti60(0, true, EmptyList.b, false);
    public final int b;
    public final List<t230> c;
    public final boolean d;
    public final boolean e;

    public ti60(int i, boolean z, List list, boolean z2) {
        this.b = i;
        this.c = list;
        this.d = z;
        this.e = z2;
    }

    public static ti60 a(ti60 ti60Var, boolean z, boolean z2) {
        int i = ti60Var.b;
        List<t230> list = ti60Var.c;
        ti60Var.getClass();
        return new ti60(i, z, list, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti60)) {
            return false;
        }
        ti60 ti60Var = (ti60) obj;
        return this.b == ti60Var.b && epx.f(this.c, ti60Var.c) && this.d == ti60Var.d && this.e == ti60Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(fw3.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedFilterListState(total=");
        sb.append(this.b);
        sb.append(", items=");
        sb.append(this.c);
        sb.append(", isLoading=");
        sb.append(this.d);
        sb.append(", hasError=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
