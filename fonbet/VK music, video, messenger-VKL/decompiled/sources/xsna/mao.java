package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import one.video.exo.offline.e;
import ru.ok.proto.PublisherConfiguration;
import xsna.it80;

/* compiled from: DownloadTracksHelper.kt */
/* loaded from: classes3.dex */
public final class mao {
    public static one.video.exo.offline.f a(tdm tdmVar) {
        List list = (List) tdmVar.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((kbq) it.next()).a);
        }
        kao d = d(arrayList, swe0.q(360, PublisherConfiguration.DEFAULT_MAX_RES));
        if (d == null) {
            return null;
        }
        e.c cVar = new e.c(Collections.singletonList(d));
        List list2 = (List) tdmVar.d;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((kbq) it2.next()).a);
        }
        return new one.video.exo.offline.f(cVar, new e.c(arrayList2), 2);
    }

    public static one.video.exo.offline.f b(tdm tdmVar) {
        Object next;
        List list = (List) tdmVar.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((kbq) it.next()).a);
        }
        kao d = d(arrayList, new k9x(PublisherConfiguration.DEFAULT_MAX_RES, iah0.v(), 1));
        if (d == null) {
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((kbq) it2.next()).a);
            }
            k9x k9xVar = new k9x(Math.max(PublisherConfiguration.DEFAULT_MAX_RES, iah0.v()), 2160, 1);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                int e = e((kao) next2);
                if (k9xVar.b <= e && e <= k9xVar.c) {
                    arrayList3.add(next2);
                }
            }
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                next = it4.next();
                if (it4.hasNext()) {
                    int e2 = e((kao) next);
                    do {
                        Object next3 = it4.next();
                        int e3 = e((kao) next3);
                        if (e2 > e3) {
                            next = next3;
                            e2 = e3;
                        }
                    } while (it4.hasNext());
                }
            } else {
                next = null;
            }
            d = (kao) next;
        }
        if (d == null) {
            return null;
        }
        e.c cVar = new e.c(Collections.singletonList(d));
        List list2 = (List) tdmVar.d;
        ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
        Iterator it5 = list2.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((kbq) it5.next()).a);
        }
        return new one.video.exo.offline.f(cVar, new e.c(arrayList4), 2);
    }

    public static one.video.exo.offline.f c(tdm tdmVar) {
        List list = (List) tdmVar.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((kbq) it.next()).a);
        }
        kao d = d(arrayList, swe0.q(0, 360));
        if (d == null) {
            return null;
        }
        e.c cVar = new e.c(Collections.singletonList(d));
        List list2 = (List) tdmVar.d;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((kbq) it2.next()).a);
        }
        return new one.video.exo.offline.f(cVar, new e.c(arrayList2), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kao d(ArrayList arrayList, k9x k9xVar) {
        it80.b.getClass();
        it80 a = it80.a.a();
        Iterator it = arrayList.iterator();
        while (true) {
            T t = a.a;
            if (!it.hasNext()) {
                return (kao) t;
            }
            kao kaoVar = (kao) it.next();
            kao kaoVar2 = (kao) t;
            int i = k9xVar.b;
            int i2 = k9xVar.c;
            int e = e(kaoVar);
            if (i <= e && e <= i2 && (kaoVar2 == null || e(kaoVar2) < e(kaoVar))) {
                it80.b.getClass();
                a = new it80(kaoVar);
            }
        }
    }

    public static int e(kao kaoVar) {
        er10 er10Var = ((one.video.player.tracks.c) kaoVar.a).c;
        return Math.min(((cms0) er10Var).f, ((cms0) er10Var).e);
    }
}
