package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import java.util.AbstractList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: FolderConfigurationViewState.kt */
/* loaded from: classes18.dex */
public final class ayr implements ao50 {
    public final List<hfz> a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final Map<Long, wt90> e;
    public final Map<Long, wt90> f;
    public final List<b0s> g;
    public final Set<Long> h;
    public final Set<Long> i;
    public final ProfilesInfo j;
    public final boolean k;
    public final boolean l;

    public ayr(List list, boolean z, boolean z2, String str, Map map, Map map2, List list2, Set set, Set set2, ProfilesInfo profilesInfo, boolean z3, boolean z4) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = map;
        this.f = map2;
        this.g = list2;
        this.h = set;
        this.i = set2;
        this.j = profilesInfo;
        this.k = z3;
        this.l = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ayr a(ayr ayrVar, AbstractList abstractList, boolean z, boolean z2, String str, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, List list, Set set, Set set2, ProfilesInfo profilesInfo, boolean z3, int i) {
        List list2 = abstractList;
        if ((i & 1) != 0) {
            list2 = ayrVar.a;
        }
        List list3 = list2;
        if ((i & 2) != 0) {
            z = ayrVar.b;
        }
        boolean z4 = z;
        boolean z5 = (i & 4) != 0 ? ayrVar.c : z2;
        String str2 = (i & 8) != 0 ? ayrVar.d : str;
        Map map = (i & 16) != 0 ? ayrVar.e : linkedHashMap;
        Map map2 = (i & 32) != 0 ? ayrVar.f : linkedHashMap2;
        List list4 = (i & 64) != 0 ? ayrVar.g : list;
        Set set3 = (i & 128) != 0 ? ayrVar.h : set;
        Set set4 = (i & 256) != 0 ? ayrVar.i : set2;
        ProfilesInfo profilesInfo2 = (i & 512) != 0 ? ayrVar.j : profilesInfo;
        boolean z6 = (i & 1024) != 0 ? ayrVar.k : z3;
        boolean z7 = ayrVar.l;
        ayrVar.getClass();
        ayrVar.getClass();
        ayrVar.getClass();
        return new ayr(list3, z4, z5, str2, map, map2, list4, set3, set4, profilesInfo2, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayr)) {
            return false;
        }
        ayr ayrVar = (ayr) obj;
        return epx.f(this.a, ayrVar.a) && this.b == ayrVar.b && this.c == ayrVar.c && epx.f(this.d, ayrVar.d) && epx.f(this.e, ayrVar.e) && epx.f(this.f, ayrVar.f) && epx.f(this.g, ayrVar.g) && epx.f(this.h, ayrVar.h) && epx.f(this.i, ayrVar.i) && epx.f(this.j, ayrVar.j) && this.k == ayrVar.k && this.l == ayrVar.l;
    }

    public final int hashCode() {
        return qoy.b(qoy.b(ur.b(this.j, fw3.b(fw3.b(fw3.a(v11.a(v11.a(urd0.a(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31, this.k), 961, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderConfigurationViewState(items=");
        sb.append(this.a);
        sb.append(", allowedToConfirm=");
        sb.append(this.b);
        sb.append(", isNameInputOverflow=");
        sb.append(this.c);
        sb.append(", selectedName=");
        sb.append(this.d);
        sb.append(", peersGoingToBeIncluded=");
        sb.append(this.e);
        sb.append(", folderPeers=");
        sb.append(this.f);
        sb.append(", folderSublists=");
        sb.append(this.g);
        sb.append(", selectedInThisConfigurationSession=");
        sb.append(this.h);
        sb.append(", unselectedInThisConfigurationSession=");
        sb.append(this.i);
        sb.append(", profiles=");
        sb.append(this.j);
        sb.append(", isLoading=");
        sb.append(this.k);
        sb.append(", isConfirmButtonVisible=");
        return n23.b(sb, this.l, ", isLoadingFromTop=null, isLoadingFromBottom=null)");
    }
}
