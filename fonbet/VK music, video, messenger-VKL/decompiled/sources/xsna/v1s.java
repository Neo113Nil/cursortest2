package xsna;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: FoldersPagerViewState.kt */
/* loaded from: classes18.dex */
public final class v1s implements ao50 {
    public final Map<Integer, xyr> a;
    public final LinkedHashMap b;
    public final List<xyr> c;
    public final xyr d;
    public final Map<Integer, spm> e;
    public final boolean f;
    public final boolean g;

    public v1s(Map map, LinkedHashMap linkedHashMap, List list, xyr xyrVar, Map map2, boolean z, boolean z2) {
        this.a = map;
        this.b = linkedHashMap;
        this.c = list;
        this.d = xyrVar;
        this.e = map2;
        this.f = z;
        this.g = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static v1s a(v1s v1sVar, LinkedHashMap linkedHashMap, ArrayList arrayList, xyr xyrVar, Map map, boolean z, boolean z2, int i) {
        Map map2 = linkedHashMap;
        if ((i & 1) != 0) {
            map2 = v1sVar.a;
        }
        Map map3 = map2;
        LinkedHashMap linkedHashMap2 = v1sVar.b;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = v1sVar.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            xyrVar = v1sVar.d;
        }
        xyr xyrVar2 = xyrVar;
        if ((i & 16) != 0) {
            map = v1sVar.e;
        }
        Map map4 = map;
        if ((i & 32) != 0) {
            z = v1sVar.f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = v1sVar.g;
        }
        v1sVar.getClass();
        return new v1s(map3, linkedHashMap2, list2, xyrVar2, map4, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1s)) {
            return false;
        }
        v1s v1sVar = (v1s) obj;
        return epx.f(this.a, v1sVar.a) && this.b.equals(v1sVar.b) && epx.f(this.c, v1sVar.c) && epx.f(this.d, v1sVar.d) && epx.f(this.e, v1sVar.e) && this.f == v1sVar.f && this.g == v1sVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b(v11.a((this.d.hashCode() + fw3.a(uf3.b(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FoldersPagerViewState(folders=");
        sb.append(this.a);
        sb.append(", predefinedFolders=");
        sb.append(this.b);
        sb.append(", items=");
        sb.append(this.c);
        sb.append(", selected=");
        sb.append(this.d);
        sb.append(", counters=");
        sb.append(this.e);
        sb.append(", showCarousel=");
        sb.append(this.f);
        sb.append(", skipUpdatesWhileOnboarding=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
