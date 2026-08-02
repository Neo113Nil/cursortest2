package xsna;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.h4n;
import xsna.qr60;
import xsna.yo60;

/* compiled from: DiscoverMediaMiddleware.kt */
/* loaded from: classes4.dex */
public final class w3n implements h7f0<t4n, m2n, on50, l5n, h4n, e3n> {
    public final sl50<t4n, m2n, on50, l5n, h4n, e3n> b;
    public final pn0 c;
    public final ArrayList d = new ArrayList();
    public final Lazy e;

    public w3n(sl50<t4n, m2n, on50, l5n, h4n, e3n> sl50Var, Lazy<i3n> lazy, pn0 pn0Var) {
        this.b = sl50Var;
        this.c = pn0Var;
        this.e = lazy;
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void K(lj50 lj50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void T(pk50 pk50Var) {
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final void o(yl50 yl50Var) {
        h4n h4nVar = (h4n) yl50Var;
        if (!(h4nVar instanceof i4n)) {
            if (!(h4nVar instanceof h4n.b) && !(h4nVar instanceof h4n.a)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        qr60.a aVar = ((i4n) h4nVar).a;
        boolean z = aVar instanceof qr60.a.g;
        ArrayList arrayList = this.d;
        if (z) {
            ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new v3n(this, 0));
            arrayList.add(new yo60.j.b(((qr60.a.g) aVar).c));
        } else if (aVar instanceof qr60.a.f) {
            arrayList.add(new yo60.j.b(((qr60.a.f) aVar).c));
        } else if (aVar instanceof qr60.a.e) {
            arrayList.add(new yo60.j.d(((qr60.a.e) aVar).a));
        }
    }

    @Override // xsna.h7f0
    public final void u(lm50 lm50Var) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yo60.j jVar = (yo60.j) arrayList.get(i);
            ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new xq1(5, this, jVar));
        }
        arrayList.clear();
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
