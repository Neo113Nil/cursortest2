package xsna;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import xsna.qr60;
import xsna.yo60;

/* compiled from: Middleware.kt */
/* loaded from: classes4.dex */
public final class dm20 implements h7f0<Object, Object, Object, Object, Object, Object> {
    public final sl50<Object, Object, Object, Object, Object, Object> b;
    public final ArrayList c = new ArrayList();
    public final Object d;
    public final gq60 e;

    public dm20(sl50<Object, Object, Object, Object, Object, Object> sl50Var, mo60 mo60Var) {
        this.b = sl50Var;
        this.d = mo60Var.v;
        this.e = mo60Var.i0;
    }

    @Override // xsna.rl50
    public final Object getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.h7f0
    public final void o(yl50 yl50Var) {
        if (yl50Var instanceof zl50) {
            qr60.a b = ((zl50) yl50Var).b();
            boolean z = b instanceof qr60.a.g;
            ArrayList arrayList = this.c;
            if (z) {
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.a(new n7w(this, 7));
                arrayList.add(new yo60.j.b(((qr60.a.g) b).c));
            } else if (b instanceof qr60.a.f) {
                arrayList.add(new yo60.j.b(((qr60.a.f) b).c));
            } else if (b instanceof qr60.a.e) {
                arrayList.add(new yo60.j.d(((qr60.a.e) b).a));
            }
        }
    }

    @Override // xsna.h7f0
    public final void u(lm50 lm50Var) {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yo60.j jVar = (yo60.j) arrayList.get(i);
            ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new com.vk.movika.sdk.base.flow.binding.j(15, this, jVar));
        }
        arrayList.clear();
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
    }

    @Override // xsna.h7f0
    public final void T(pk50 pk50Var) {
    }

    @Override // xsna.h7f0
    public final void l(hn50 hn50Var) {
    }
}
