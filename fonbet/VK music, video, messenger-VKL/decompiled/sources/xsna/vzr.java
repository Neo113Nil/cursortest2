package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: FolderPeersSelectViewState.kt */
/* loaded from: classes18.dex */
public final class vzr implements ao50 {
    public final Map<Long, wt90> a;
    public final List<hfz> b;
    public final Map<Long, wt90> c;
    public final List<hfz> d;
    public final ProfilesInfo e;
    public final boolean f;
    public final Set<Long> g;
    public final Set<Long> h;
    public final Set<Long> i;
    public final Set<Long> j;
    public final Set<Long> k;
    public final List<b0s> l;

    public vzr(Map map, List list, Map map2, List list2, ProfilesInfo profilesInfo, boolean z, Set set, Set set2, Set set3, Set set4, Set set5, List list3) {
        this.a = map;
        this.b = list;
        this.c = map2;
        this.d = list2;
        this.e = profilesInfo;
        this.f = z;
        this.g = set;
        this.h = set2;
        this.i = set3;
        this.j = set4;
        this.k = set5;
        this.l = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vzr a(vzr vzrVar, LinkedHashMap linkedHashMap, ArrayList arrayList, LinkedHashMap linkedHashMap2, ArrayList arrayList2, ProfilesInfo profilesInfo, boolean z, Set set, Set set2, Set set3, List list, int i) {
        Map map = (i & 1) != 0 ? vzrVar.a : linkedHashMap;
        List list2 = (i & 2) != 0 ? vzrVar.b : arrayList;
        Map map2 = (i & 4) != 0 ? vzrVar.c : linkedHashMap2;
        List list3 = (i & 8) != 0 ? vzrVar.d : arrayList2;
        ProfilesInfo profilesInfo2 = (i & 16) != 0 ? vzrVar.e : profilesInfo;
        boolean z2 = (i & 32) != 0 ? vzrVar.f : z;
        vzrVar.getClass();
        Set<Long> set4 = vzrVar.g;
        Set<Long> set5 = vzrVar.h;
        Set set6 = (i & 512) != 0 ? vzrVar.i : set;
        Set set7 = (i & 1024) != 0 ? vzrVar.j : set2;
        Set set8 = (i & 2048) != 0 ? vzrVar.k : set3;
        List list4 = (i & 4096) != 0 ? vzrVar.l : list;
        vzrVar.getClass();
        return new vzr(map, list2, map2, list3, profilesInfo2, z2, set4, set5, set6, set7, set8, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzr)) {
            return false;
        }
        vzr vzrVar = (vzr) obj;
        return epx.f(this.a, vzrVar.a) && epx.f(this.b, vzrVar.b) && epx.f(this.c, vzrVar.c) && epx.f(this.d, vzrVar.d) && epx.f(this.e, vzrVar.e) && this.f == vzrVar.f && epx.f(this.g, vzrVar.g) && epx.f(this.h, vzrVar.h) && epx.f(this.i, vzrVar.i) && epx.f(this.j, vzrVar.j) && epx.f(this.k, vzrVar.k) && epx.f(this.l, vzrVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + fw3.b(fw3.b(fw3.b(fw3.b(fw3.b(qoy.b(qoy.b(ur.b(this.e, fw3.a(v11.a(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, true), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderPeersSelectViewState(statusPeers=");
        sb.append(this.a);
        sb.append(", statusItems=");
        sb.append(this.b);
        sb.append(", searchPeers=");
        sb.append(this.c);
        sb.append(", searchItems=");
        sb.append(this.d);
        sb.append(", profiles=");
        sb.append(this.e);
        sb.append(", isSearch=");
        sb.append(this.f);
        sb.append(", allowedToConfirm=true, selectedBeforeScreenOpened=");
        sb.append(this.g);
        sb.append(", unselectedBeforeScreenOpened=");
        sb.append(this.h);
        sb.append(", selectedInSelectSession=");
        sb.append(this.i);
        sb.append(", unselectedInSelectSession=");
        sb.append(this.j);
        sb.append(", folderPeers=");
        sb.append(this.k);
        sb.append(", sublists=");
        return ms9.a(')', sb, this.l);
    }
}
