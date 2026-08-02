package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ilq0;

/* compiled from: UserPlacesEntityRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class jlq0<T> {
    public final a<T> a;
    public final ilq0.a<T> b;
    public final ilq0<T> c;
    public final ConcurrentHashMap<Integer, T> d = new ConcurrentHashMap<>();
    public final ExecutorService e;

    /* compiled from: UserPlacesEntityRepositoryImpl.kt */
    public interface a<T> {
        List<T> a(Collection<Integer> collection);
    }

    public jlq0(a<T> aVar, ilq0.a<T> aVar2) {
        this.a = aVar;
        this.b = aVar2;
        this.c = new ilq0<>(aVar2);
        asu0.a.getClass();
        this.e = asu0.n();
    }

    public static spp c(Collection collection, izs izsVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Object invoke = izsVar.invoke(Integer.valueOf(intValue));
            if (invoke == null) {
                arrayList2.add(Integer.valueOf(intValue));
            } else {
                arrayList.add(invoke);
            }
        }
        return new spp(arrayList, arrayList2);
    }

    public final void a(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return;
        }
        Collection<? extends T> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        for (T t : collection2) {
            arrayList.add(new Pair(Integer.valueOf(this.b.a(t)), t));
        }
        pn00.p(this.d, arrayList);
    }

    public final List b(HashSet hashSet) {
        spp c = c(hashSet, new uw4(1, this.d, ConcurrentHashMap.class, "get", "get(Ljava/lang/Object;)Ljava/lang/Object;", 0, 15));
        Collection<T> collection = c.a;
        Collection<Integer> collection2 = c.b;
        if (collection2.isEmpty()) {
            return j5g.O0(collection);
        }
        spp c2 = c(collection2, new vw4(this.c, 14));
        Collection<Integer> collection3 = c2.b;
        Collection<T> collection4 = c2.a;
        boolean isEmpty = collection3.isEmpty();
        ExecutorService executorService = this.e;
        if (isEmpty) {
            executorService.execute(new nek(5, this, c2));
            return j5g.O0(j5g.u0(collection4, collection));
        }
        List<T> a2 = this.a.a(collection3);
        spp sppVar = new spp(a2, EmptyList.b);
        List<T> list = a2;
        a(j5g.u0(list, collection4));
        executorService.execute(new qo2(10, this, sppVar));
        return j5g.O0(j5g.u0(list, j5g.u0(collection4, collection)));
    }
}
