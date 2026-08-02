package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class h3u0 {
    public final boolean a;
    public final boolean b;
    public final wsu c;
    public final List d;
    public final List e;

    public h3u0(boolean z, boolean z2, wsu wsuVar, List list, List list2) {
        this.a = z;
        this.b = z2;
        this.c = wsuVar;
        this.d = list;
        this.e = list2;
    }

    public static h3u0 a(h3u0 h3u0Var, boolean z, boolean z2, wsu wsuVar, List list, List list2, int i) {
        if ((i & 1) != 0) {
            z = h3u0Var.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = h3u0Var.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            wsuVar = h3u0Var.c;
        }
        wsu wsuVar2 = wsuVar;
        if ((i & 8) != 0) {
            list = h3u0Var.d;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = h3u0Var.e;
        }
        h3u0Var.getClass();
        return new h3u0(z3, z4, wsuVar2, list3, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3u0)) {
            return false;
        }
        h3u0 h3u0Var = (h3u0) obj;
        return this.a == h3u0Var.a && this.b == h3u0Var.b && jl40.l(this.c, h3u0Var.c) && jl40.l(this.d, h3u0Var.d) && jl40.l(this.e, h3u0Var.e);
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        wsu wsuVar = this.c;
        return this.e.hashCode() + unr0.c((e + (wsuVar == null ? 0 : wsuVar.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(showDetails=");
        sb.append(this.a);
        sb.append(", hotReloadActive=");
        sb.append(this.b);
        sb.append(", hotReloadStatus=");
        sb.append(this.c);
        sb.append(", errors=");
        sb.append(this.d);
        sb.append(", warnings=");
        return unr0.t(sb, this.e, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ h3u0(int i) {
        this(false, false, null, r4, r4);
        EmptyList emptyList = EmptyList.a;
    }

    public h3u0() {
        this(0);
    }
}
