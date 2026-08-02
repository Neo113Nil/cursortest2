package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ManageCommunitiesNotificationsState.kt */
/* loaded from: classes5.dex */
public final class dh00 implements km50 {
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List<pg00> e;

    public dh00() {
        this(15);
    }

    public static dh00 a(dh00 dh00Var, boolean z, boolean z2, List list, int i) {
        if ((i & 1) != 0) {
            z = dh00Var.b;
        }
        boolean z3 = (i & 2) != 0 ? dh00Var.c : true;
        if ((i & 4) != 0) {
            z2 = dh00Var.d;
        }
        if ((i & 8) != 0) {
            list = dh00Var.e;
        }
        dh00Var.getClass();
        return new dh00(list, z, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh00)) {
            return false;
        }
        dh00 dh00Var = (dh00) obj;
        return this.b == dh00Var.b && this.c == dh00Var.c && this.d == dh00Var.d && epx.f(this.e, dh00Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManageCommunitiesNotificationsState(isLoading=");
        sb.append(this.b);
        sb.append(", isRefreshing=");
        sb.append(this.c);
        sb.append(", isError=");
        sb.append(this.d);
        sb.append(", items=");
        return ms9.a(')', sb, this.e);
    }

    public dh00(List list, boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = list;
    }

    public dh00(int i) {
        this(EmptyList.b, (i & 1) == 0, false, false);
    }
}
