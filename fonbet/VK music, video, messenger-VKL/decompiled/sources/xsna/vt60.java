package xsna;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import xsna.jv60;
import xsna.qr60;
import xsna.qz60;
import xsna.xh60;
import xsna.yo60;

/* compiled from: NewsfeedMiddleware.kt */
/* loaded from: classes4.dex */
public final class vt60 implements h7f0<qz60, vs60, on50, r070, jv60, xh60> {
    public final sl50<qz60, vs60, on50, r070, jv60, xh60> b;
    public final xk2 c;
    public final ArrayList d = new ArrayList();
    public final Lazy e;

    public vt60(sl50<qz60, vs60, on50, r070, jv60, xh60> sl50Var, Lazy<it60> lazy, xk2 xk2Var) {
        this.b = sl50Var;
        this.c = xk2Var;
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
        jv60 jv60Var = (jv60) yl50Var;
        if ((jv60Var instanceof jv60.c.b) || (jv60Var instanceof jv60.a.d) || (jv60Var instanceof jv60.a.c)) {
            qz60 qz60Var = (qz60) getCurrentState();
            int i = qz60Var.c;
            qz60.a aVar = qz60Var.h;
            boolean z = aVar.a.indexOfKey(i) >= 0;
            lu60 lu60Var = aVar.a.get(i);
            xh60.b.c cVar = new xh60.b.c(z, lu60Var != null ? lu60Var.b() : null);
            ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new com.vk.movika.sdk.base.presenter.c(19, this, cVar));
            return;
        }
        if (jv60Var instanceof kv60) {
            qr60.a aVar2 = ((kv60) jv60Var).a;
            boolean z2 = aVar2 instanceof qr60.a.g;
            ArrayList arrayList = this.d;
            if (z2) {
                ExecutorService executorService2 = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.a(new rkt(this, 15));
                arrayList.add(new yo60.j.b(((qr60.a.g) aVar2).c));
            } else if (aVar2 instanceof qr60.a.f) {
                arrayList.add(new yo60.j.b(((qr60.a.f) aVar2).c));
            } else if (aVar2 instanceof qr60.a.e) {
                arrayList.add(new yo60.j.d(((qr60.a.e) aVar2).a));
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
            com.vk.mvi.core.internal.executors.a.a(new p5(18, this, jVar));
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
