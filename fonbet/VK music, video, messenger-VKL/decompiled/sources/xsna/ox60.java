package xsna;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import xsna.qr60;
import xsna.yo60;

/* compiled from: NewsfeedSearchMiddleware.kt */
/* loaded from: classes4.dex */
public final class ox60 implements h7f0<xx60, px60, on50, ey60, vx60, sx60> {
    public final sl50<xx60, px60, on50, ey60, vx60, sx60> b;
    public final gq60 c;
    public final ArrayList d = new ArrayList();
    public final Lazy e;

    public ox60(sl50<xx60, px60, on50, ey60, vx60, sx60> sl50Var, Lazy<fq60> lazy, gq60 gq60Var) {
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
        vx60 vx60Var = (vx60) yl50Var;
        if (vx60Var instanceof ux60) {
            qr60.a aVar = ((ux60) vx60Var).a;
            boolean z = aVar instanceof qr60.a.g;
            ArrayList arrayList = this.d;
            if (z) {
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.a(new x550(this, 7));
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
            com.vk.mvi.core.internal.executors.a.a(new pk(16, this, jVar));
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
