package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import xsna.acc;

/* compiled from: DefaultQueueApiManager.kt */
/* loaded from: classes.dex */
public final class hll implements zqe0 {
    public final gzs<UserId> a;
    public final gzs<l7r0> b;
    public final ExecutorService c;
    public final gzs<mui0> d;

    /* JADX WARN: Multi-variable type inference failed */
    public hll(gzs<UserId> gzsVar, gzs<? extends l7r0> gzsVar2, ExecutorService executorService, gzs<? extends mui0> gzsVar3) {
        this.a = gzsVar;
        this.b = gzsVar2;
        this.c = executorService;
        this.d = gzsVar3;
    }

    @Override // xsna.zqe0
    public final tre0 a(HashSet hashSet) {
        gzs<UserId> gzsVar = this.a;
        if (fkq0.c(gzsVar.invoke())) {
            return (tre0) rte0.B(this.b.invoke(), new sre0(hashSet, gzsVar.invoke(), this.d.invoke()), this.c);
        }
        throw new IllegalArgumentException("UserId is 0");
    }

    @Override // xsna.zqe0
    public final cre0 b(long j, String str, Collection collection) {
        l7r0 invoke = this.b.invoke();
        UserId invoke2 = this.a.invoke();
        if (fkq0.c(invoke2)) {
            return (cre0) rte0.B(invoke, new bre0(invoke2, str, collection, j), this.c);
        }
        throw new IllegalArgumentException("UserId is 0");
    }

    @Override // xsna.zqe0
    public final void c(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        l7r0 invoke = this.b.invoke();
        UserId invoke2 = this.a.invoke();
        if (!fkq0.c(invoke2)) {
            throw new IllegalArgumentException("UserId is 0");
        }
        ArrayList a = acc.a.a(collection);
        b1y b1yVar = new b1y(a.size());
        ArrayList arrayList = new ArrayList(c5g.u(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            acc accVar = (acc) it.next();
            arrayList.add(rte0.A(invoke, new pre0(invoke2, accVar.b(), accVar.a()), this.c));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b1yVar.g((Future) it2.next());
        }
        b1yVar.f();
    }

    @Override // xsna.zqe0
    public final Map d(HashSet hashSet) {
        gzs<UserId> gzsVar = this.a;
        if (fkq0.c(gzsVar.invoke())) {
            return (Map) rte0.B(this.b.invoke(), new rre0(hashSet, gzsVar.invoke(), this.d.invoke()), this.c);
        }
        throw new IllegalArgumentException("UserId is 0");
    }
}
