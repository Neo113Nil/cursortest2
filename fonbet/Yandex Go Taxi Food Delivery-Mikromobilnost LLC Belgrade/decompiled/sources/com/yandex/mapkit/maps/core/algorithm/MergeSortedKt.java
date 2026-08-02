package com.yandex.mapkit.maps.core.algorithm;

import defpackage.j73;
import defpackage.rcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a;\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0007\u001a-\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "T", "", "other", "", "mergeSorted", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", "(Ljava/lang/Iterable;)Ljava/util/List;", "", "", "iterator", "Lzy11;", "drain", "(Ljava/util/List;Ljava/util/Iterator;)V", "", "nextOrNull", "(Ljava/util/Iterator;)Ljava/lang/Object;", "exported-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MergeSortedKt {
    private static final <T> void drain(List<T> list, Iterator<? extends T> it) {
        while (it.hasNext()) {
            list.add(it.next());
        }
    }

    public static final <T extends Comparable<? super T>> List<T> mergeSorted(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends T> it2 = iterable2.iterator();
        ListBuilder a = rcc.a();
        Pair pair = new Pair(nextOrNull(it), nextOrNull(it2));
        Comparable comparable = (Comparable) pair.getFirst();
        Comparable comparable2 = (Comparable) pair.getSecond();
        while (comparable != null && comparable2 != null) {
            if (comparable.compareTo(comparable2) < 0) {
                a.add(comparable);
                comparable = (Comparable) nextOrNull(it);
            } else {
                a.add(comparable2);
                comparable2 = (Comparable) nextOrNull(it2);
            }
        }
        a.addAll(j73.A(new Comparable[]{comparable, comparable2}));
        drain(a, it);
        drain(a, it2);
        return a.j();
    }

    private static final <T> T nextOrNull(Iterator<? extends T> it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T extends Comparable<? super T>> List<T> mergeSorted(Iterable<? extends Iterable<? extends T>> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList = new ArrayList(mergeSorted(arrayList, it.next()));
        }
        return arrayList;
    }
}
