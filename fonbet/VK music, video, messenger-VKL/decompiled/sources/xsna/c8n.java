package xsna;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import xsna.qr60;
import xsna.yo60;

/* compiled from: DiscoverSimilarFeedMviMiddleware.kt */
/* loaded from: classes4.dex */
public final class c8n implements h7f0<l8n, q7n, on50, z8n, j8n, t7n> {
    public final sl50<l8n, q7n, on50, z8n, j8n, t7n> b;
    public final gq60 c;
    public final ArrayList d = new ArrayList();
    public final Lazy e;

    public c8n(sl50<l8n, q7n, on50, z8n, j8n, t7n> sl50Var, Lazy<fq60> lazy, gq60 gq60Var) {
        this.b = sl50Var;
        this.c = gq60Var;
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
        j8n j8nVar = (j8n) yl50Var;
        if (j8nVar instanceof i8n) {
            qr60.a aVar = ((i8n) j8nVar).a;
            boolean z = aVar instanceof qr60.a.g;
            ArrayList arrayList = this.d;
            if (z) {
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.a(new dnh(this, 14));
                arrayList.add(new yo60.j.b(((qr60.a.g) aVar).c));
            } else if (aVar instanceof qr60.a.f) {
                arrayList.add(new yo60.j.b(((qr60.a.f) aVar).c));
            } else if (aVar instanceof qr60.a.e) {
                arrayList.add(new yo60.j.d(((qr60.a.e) aVar).a));
            }
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
            com.vk.mvi.core.internal.executors.a.a(new com.vk.movika.sdk.base.flow.binding.g(13, this, jVar));
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
