package xsna;

import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: ParallelTaskTopSort.kt */
/* loaded from: classes.dex */
public final class oh90 implements izs<List<? extends ParallelTaskRunner.f>, List<? extends ParallelTaskRunner.f>> {

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((ParallelTaskRunner.f) t2).getPriority()), Integer.valueOf(((ParallelTaskRunner.f) t).getPriority()));
        }
    }

    @Override // xsna.izs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<ParallelTaskRunner.f> invoke(List<? extends ParallelTaskRunner.f> list) {
        Integer num;
        int intValue;
        List<? extends ParallelTaskRunner.f> list2 = list;
        for (ParallelTaskRunner.f fVar : list2) {
            if (fVar.s7().isEmpty()) {
                sk3 sk3Var = new sk3();
                sk3Var.addLast(fVar);
                sk3 sk3Var2 = new sk3();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (!sk3Var.isEmpty()) {
                    ParallelTaskRunner.f fVar2 = (ParallelTaskRunner.f) sk3Var.removeFirst();
                    List<ParallelTaskRunner.f> O2 = fVar2.O2();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : O2) {
                        ParallelTaskRunner.f fVar3 = (ParallelTaskRunner.f) obj;
                        if (fVar3.s7().size() >= 2 && ((Number) linkedHashMap.getOrDefault(fVar3.getName(), Integer.valueOf(fVar3.s7().size()))).intValue() - 1 != 0) {
                            linkedHashMap.put(fVar3.getName(), Integer.valueOf(intValue));
                        } else {
                            arrayList.add(obj);
                        }
                    }
                    sk3Var.addAll(arrayList);
                    sk3Var2.addLast(fVar2);
                }
                while (!sk3Var2.isEmpty()) {
                    ParallelTaskRunner.f fVar4 = (ParallelTaskRunner.f) sk3Var2.removeLast();
                    int priority = fVar4.getPriority();
                    Iterator<T> it = fVar4.O2().iterator();
                    if (it.hasNext()) {
                        Integer valueOf = Integer.valueOf(((ParallelTaskRunner.f) it.next()).getPriority());
                        while (it.hasNext()) {
                            Integer valueOf2 = Integer.valueOf(((ParallelTaskRunner.f) it.next()).getPriority());
                            if (valueOf.compareTo(valueOf2) < 0) {
                                valueOf = valueOf2;
                            }
                        }
                        num = valueOf;
                    } else {
                        num = null;
                    }
                    fVar4.setPriority(priority + (num != null ? num.intValue() : 0));
                }
            }
        }
        return j5g.D0(new a(), list2);
    }
}
