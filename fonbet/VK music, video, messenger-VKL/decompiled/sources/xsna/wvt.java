package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;

/* compiled from: GetStoriesInfoCmd.kt */
/* loaded from: classes2.dex */
public final class wvt extends xl6<Map<Peer, ? extends ImStoryState>> {
    public final Set<Peer> b;
    public final boolean c;

    public wvt() {
        throw null;
    }

    public wvt(Set set) {
        this.b = set;
        this.c = true;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-stories-info-cmd";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Object failure;
        Set<Peer> set = this.b;
        boolean isEmpty = set.isEmpty();
        Map map = jgp.b;
        if (isEmpty) {
            return map;
        }
        vsl0 p = w2wVar.I0().p();
        Set<Peer> set2 = set;
        Map<Peer, z4m0> b = p.b(set2);
        long f1 = w2wVar.f1();
        Collection<z4m0> values = b.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (f1 - ((z4m0) obj).c < 600000) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((z4m0) it.next()).a);
        }
        Set g = izi0.g(set, j5g.S0(arrayList2));
        if (g.isEmpty()) {
            int e = on00.e(c5g.u(arrayList, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(e >= 16 ? e : 16);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                z4m0 z4m0Var = (z4m0) it2.next();
                Pair pair = new Pair(z4m0Var.a, z4m0Var.b);
                linkedHashMap.put(pair.i(), pair.j());
            }
            return linkedHashMap;
        }
        Set set3 = g;
        try {
            failure = (Map) bz2.c(new hwt(set3, this.c), "GetUnseenStoriesStatusApiCmd");
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            L.i(a);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Map map2 = (Map) failure;
        if (map2 != null) {
            map = map2;
        }
        Set<Peer> set4 = set3;
        ArrayList arrayList3 = new ArrayList(c5g.u(set4, 10));
        for (Peer peer : set4) {
            Boolean bool = (Boolean) map.get(peer);
            arrayList3.add(new z4m0(peer, epx.f(bool, Boolean.TRUE) ? ImStoryState.NEW : epx.f(bool, Boolean.FALSE) ? ImStoryState.SEEN : ImStoryState.NONE, w2wVar.f1()));
        }
        p.a(arrayList3);
        Collection<z4m0> values2 = p.b(set2).values();
        int e2 = on00.e(c5g.u(values2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
        for (z4m0 z4m0Var2 : values2) {
            Pair pair2 = new Pair(z4m0Var2.a, z4m0Var2.b);
            linkedHashMap2.put(pair2.i(), pair2.j());
        }
        return linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvt)) {
            return false;
        }
        wvt wvtVar = (wvt) obj;
        return epx.f(this.b, wvtVar.b) && this.c == wvtVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("GetStoriesInfoCmd(owners=");
        sb.append(this.b);
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
