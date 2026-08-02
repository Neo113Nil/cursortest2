package xsna;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: FoldersShowViewState.kt */
/* loaded from: classes18.dex */
public final class t2s implements ao50 {
    public final List<hfz> a;
    public final boolean b;
    public final Map<Integer, yyr> c;
    public final List<xzr> d;
    public final boolean e;
    public final Set<Integer> f;
    public final Set<Integer> g;
    public final boolean h;
    public final int i;

    /* JADX WARN: Multi-variable type inference failed */
    public t2s(List<? extends hfz> list, boolean z, Map<Integer, ? extends yyr> map, List<? extends xzr> list2, boolean z2, Set<Integer> set, Set<Integer> set2, boolean z3, int i) {
        this.a = list;
        this.b = z;
        this.c = map;
        this.d = list2;
        this.e = z2;
        this.f = set;
        this.g = set2;
        this.h = z3;
        this.i = i;
    }

    public static t2s a(t2s t2sVar, List list, boolean z, Map map, List list2, boolean z2, Set set, Set set2, boolean z3, int i, int i2) {
        if ((i2 & 1) != 0) {
            list = t2sVar.a;
        }
        List list3 = list;
        if ((i2 & 2) != 0) {
            z = t2sVar.b;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            map = t2sVar.c;
        }
        Map map2 = map;
        if ((i2 & 8) != 0) {
            list2 = t2sVar.d;
        }
        List list4 = list2;
        if ((i2 & 16) != 0) {
            z2 = t2sVar.e;
        }
        boolean z5 = z2;
        Set set3 = (i2 & 32) != 0 ? t2sVar.f : set;
        Set set4 = (i2 & 64) != 0 ? t2sVar.g : set2;
        boolean z6 = (i2 & 128) != 0 ? t2sVar.h : z3;
        int i3 = (i2 & 256) != 0 ? t2sVar.i : i;
        t2sVar.getClass();
        return new t2s(list3, z4, map2, list4, z5, set3, set4, z6, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2s)) {
            return false;
        }
        t2s t2sVar = (t2s) obj;
        return epx.f(this.a, t2sVar.a) && this.b == t2sVar.b && epx.f(this.c, t2sVar.c) && epx.f(this.d, t2sVar.d) && this.e == t2sVar.e && epx.f(this.f, t2sVar.f) && epx.f(this.g, t2sVar.g) && this.h == t2sVar.h && this.i == t2sVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + qoy.b(fw3.b(fw3.b(qoy.b(fw3.a(v11.a(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FoldersShowViewState(items=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", folders=");
        sb.append(this.c);
        sb.append(", recommendedFolders=");
        sb.append(this.d);
        sb.append(", isCreatingFolder=");
        sb.append(this.e);
        sb.append(", editingFoldersIds=");
        sb.append(this.f);
        sb.append(", deletingFoldersIds=");
        sb.append(this.g);
        sb.append(", isLoadingFolders=");
        sb.append(this.h);
        sb.append(", localReorderingFoldersQueriesCount=");
        return vu5.b(sb, this.i, ')');
    }
}
