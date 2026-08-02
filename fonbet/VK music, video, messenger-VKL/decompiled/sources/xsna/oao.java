package xsna;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.BiFunction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import one.video.exo.offline.e;
import one.video.player.tracks.Track;

/* compiled from: DownloadTracksSelectionExt.kt */
/* loaded from: classes3.dex */
public final class oao {
    public static final <T extends Track> whs0 a(one.video.exo.offline.e<T> eVar, List<kbq<T>> list) {
        Long l;
        Long l2;
        Long l3;
        kao<T> kaoVar;
        Long l4;
        kao<T> kaoVar2;
        Object obj = null;
        long j = 0;
        if (!(eVar instanceof e.a)) {
            if (eVar instanceof e.b) {
                return new whs0(0L, 0L);
            }
            if (!(eVar instanceof e.c)) {
                throw new NoWhenBranchMatchedException();
            }
            kao kaoVar3 = (kao) j5g.a0(((e.c) eVar).a);
            long longValue = (kaoVar3 == null || (l2 = kaoVar3.b) == null) ? 0L : l2.longValue();
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((kbq) next).a, kaoVar3)) {
                    obj = next;
                    break;
                }
            }
            kbq kbqVar = (kbq) obj;
            if (kbqVar != null && (l = kbqVar.b) != null) {
                j = l.longValue();
            }
            return new whs0(longValue, j);
        }
        kbq kbqVar2 = (kbq) j5g.a0(list);
        if (kbqVar2 != null && (kaoVar2 = kbqVar2.a) != null) {
            obj = kaoVar2.a;
        }
        if (!(obj instanceof one.video.player.tracks.a)) {
            long longValue2 = (kbqVar2 == null || (kaoVar = kbqVar2.a) == null || (l4 = kaoVar.b) == null) ? 0L : l4.longValue();
            if (kbqVar2 != null && (l3 = kbqVar2.b) != null) {
                j = l3.longValue();
            }
            return new whs0(longValue2, j);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            kbq kbqVar3 = (kbq) it2.next();
            so4 so4Var = (so4) ((one.video.player.tracks.a) kbqVar3.a.a).c;
            Pair pair = new Pair(so4Var.h, so4Var.g);
            final bt3 bt3Var = new bt3(kbqVar3, 5);
            linkedHashMap.compute(pair, new BiFunction() { // from class: xsna.nao
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj2, Object obj3) {
                    return (kbq) bt3.this.invoke(obj2, obj3);
                }
            });
        }
        Iterator it3 = linkedHashMap.values().iterator();
        long j2 = 0;
        while (it3.hasNext()) {
            Long l5 = ((kbq) it3.next()).a.b;
            j2 += l5 != null ? l5.longValue() : 0L;
        }
        Iterator it4 = linkedHashMap.values().iterator();
        long j3 = 0;
        while (it4.hasNext()) {
            Long l6 = ((kbq) it4.next()).b;
            j3 += l6 != null ? l6.longValue() : 0L;
        }
        return new whs0(j2, j3);
    }

    public static final whs0 b(one.video.exo.offline.f fVar, tdm tdmVar) {
        one.video.exo.offline.e<one.video.player.tracks.c> eVar = fVar.a;
        whs0 a = a(eVar, (List) tdmVar.b);
        whs0 a2 = a(fVar.b, (List) tdmVar.c);
        long j = a2.b;
        long j2 = a.a + a2.a;
        long j3 = a.b;
        long j4 = 0;
        if ((j3 > 0 && j > 0) || ((eVar instanceof e.b) && j > 0)) {
            j4 = j3 + j;
        }
        return new whs0(j2, j4);
    }
}
