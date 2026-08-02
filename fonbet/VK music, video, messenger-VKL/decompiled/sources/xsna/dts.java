package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PagedFriendsSearchDataProvider.kt */
/* loaded from: classes15.dex */
public final class dts {
    public final List<nqs> a;
    public final int b;
    public final boolean c;

    public dts() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dts)) {
            return false;
        }
        dts dtsVar = (dts) obj;
        return epx.f(this.a, dtsVar.a) && this.b == dtsVar.b && this.c == dtsVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsSearchResultPage(items=");
        sb.append(this.a);
        sb.append(", total=");
        sb.append(this.b);
        sb.append(", hasMore=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public dts(int i) {
        this(EmptyList.b, 0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dts(List<? extends nqs> list, int i, boolean z) {
        this.a = list;
        this.b = i;
        this.c = z;
    }
}
