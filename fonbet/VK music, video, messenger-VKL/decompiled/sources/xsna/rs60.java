package xsna;

import com.vk.dto.common.id.UserId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.nx6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rs60 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ rs60(Object obj, Serializable serializable, int i) {
        this.b = i;
        this.c = obj;
        this.d = serializable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                ss60 ss60Var = (ss60) this.c;
                Boolean bool = (Boolean) this.d;
                ce60 ce60Var = ss60Var.b;
                ce60Var.getClass();
                if (!Boolean.valueOf(ce60.m()).equals(bool)) {
                    ce60.h.remove(0);
                    ce60.n(bool);
                    ce60Var.b(true);
                }
                return s3q0.a;
            default:
                exd0 exd0Var = (exd0) this.c;
                ArrayList<nx6.a> arrayList = (ArrayList) this.d;
                List<UserId> list = exd0Var.f;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(String.valueOf(((UserId) it.next()).b));
                }
                HashSet hashSet = new HashSet(arrayList2);
                List<Integer> list2 = exd0Var.g;
                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    kq.d((Number) it2.next(), arrayList3);
                }
                HashSet hashSet2 = new HashSet(arrayList3);
                if (exd0Var.j) {
                    hashSet.clear();
                }
                for (nx6.a aVar : arrayList) {
                    if (aVar instanceof nx6.a.C3421a) {
                        hashSet.add(String.valueOf(aVar.a.b));
                    } else {
                        if (!(aVar instanceof nx6.a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!exd0Var.j) {
                            hashSet.remove(String.valueOf(aVar.a.b));
                        }
                    }
                }
                Set<Integer> set = exd0Var.l.b;
                ArrayList arrayList4 = new ArrayList(c5g.u(set, 10));
                Iterator<T> it3 = set.iterator();
                while (it3.hasNext()) {
                    kq.d((Number) it3.next(), arrayList4);
                }
                hashSet2.addAll(arrayList4);
                Set<Integer> set2 = exd0Var.l.c;
                ArrayList arrayList5 = new ArrayList(c5g.u(set2, 10));
                Iterator<T> it4 = set2.iterator();
                while (it4.hasNext()) {
                    kq.d((Number) it4.next(), arrayList5);
                }
                hashSet2.removeAll(j5g.S0(arrayList5));
                return new Pair(hashSet, hashSet2);
        }
    }
}
