package xsna;

import android.content.Context;
import com.vk.toggle.internal.a;
import com.vkontakte.android.VKActivity;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.concurrent.TimeUnit;
import xsna.hg1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class gej implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ gej(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                b25 b25Var = com.vk.contacts.e.l;
                if (b25Var == null) {
                    b25Var = null;
                }
                io.reactivex.rxjava3.internal.operators.observable.l2 m = b25Var.m(true);
                a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
                b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
                io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(m, qVar, aVar);
                Context context = com.vk.contacts.e.j;
                if (context == null) {
                    context = null;
                }
                g5u0 g5u0Var = new g5u0(context);
                io.reactivex.rxjava3.core.q s = io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(Boolean.valueOf(g5u0Var.b())), new io.reactivex.rxjava3.internal.operators.observable.q(new dej(g5u0Var)));
                s.getClass();
                io.reactivex.rxjava3.internal.operators.observable.y yVar2 = new io.reactivex.rxjava3.internal.operators.observable.y(s, qVar, aVar);
                com.vk.contacts.c cVar = com.vk.contacts.e.k;
                if (cVar == null) {
                    cVar = null;
                }
                io.reactivex.rxjava3.core.q o0 = new io.reactivex.rxjava3.internal.operators.observable.i0(cVar.a(), new hg1.z0(lej.b)).U(new hg1.y0(mej.b)).U(new odj(new da4(1))).o0(new io.reactivex.rxjava3.internal.operators.single.v(new pdj()));
                o0.getClass();
                io.reactivex.rxjava3.core.q l = io.reactivex.rxjava3.core.q.l(yVar, yVar2, new io.reactivex.rxjava3.internal.operators.observable.y(o0, qVar, aVar), new x15(new qdj(0)));
                l.getClass();
                io.reactivex.rxjava3.internal.operators.observable.y yVar3 = new io.reactivex.rxjava3.internal.operators.observable.y(l, qVar, aVar);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(yVar3.y(5L, timeUnit), new rdj(new yqd(1), 0));
                io.reactivex.rxjava3.internal.operators.observable.s y = com.vk.toggle.b.A.k().a.b0(a.c.class).y(5L, timeUnit);
                com.vk.contacts.c cVar2 = com.vk.contacts.e.k;
                if (cVar2 == null) {
                    cVar2 = null;
                }
                io.reactivex.rxjava3.core.q o02 = new io.reactivex.rxjava3.internal.operators.observable.i0(cVar2.a(), new hg1.z0(nej.b)).U(new hg1.y0(oej.b)).U(new tdj()).o0(new io.reactivex.rxjava3.internal.operators.single.v(new udj()));
                o02.getClass();
                io.reactivex.rxjava3.internal.operators.observable.h b = new io.reactivex.rxjava3.internal.operators.observable.y(o02, qVar, aVar).b(2, 1);
                final iej iejVar = new iej(0);
                io.reactivex.rxjava3.core.q V = io.reactivex.rxjava3.core.q.V(i0Var, y, new io.reactivex.rxjava3.internal.operators.observable.i0(b, new io.reactivex.rxjava3.functions.m() { // from class: xsna.mdj
                    @Override // io.reactivex.rxjava3.functions.m
                    public final boolean test(Object obj) {
                        return ((Boolean) iej.this.invoke(obj)).booleanValue();
                    }
                }));
                asu0 asu0Var = asu0.a;
                V.r0(asu0Var.c()).a0(asu0.p()).subscribe(new ndj());
                ((u9w) com.vk.contacts.e.c.getValue()).getClass();
                b25 b25Var2 = com.vk.contacts.e.l;
                if (b25Var2 == null) {
                    b25Var2 = null;
                }
                io.reactivex.rxjava3.internal.operators.observable.i0 i0Var2 = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.y(b25Var2.m(true), qVar, aVar).b(2, 1), new wdj(new vdj(0)));
                com.vk.contacts.c cVar3 = com.vk.contacts.e.k;
                io.reactivex.rxjava3.core.q o03 = new io.reactivex.rxjava3.internal.operators.observable.i0((cVar3 != null ? cVar3 : null).a(), new hg1.z0(jej.b)).U(new hg1.y0(kej.b)).U(new ydj(new xdj(0))).o0(new io.reactivex.rxjava3.internal.operators.single.v(new zdj()));
                o03.getClass();
                io.reactivex.rxjava3.core.q.X(i0Var2, new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.y(o03, qVar, aVar).b(2, 1), new bej(new aej(0), 0))).r0(asu0Var.c()).a0(asu0.p()).subscribe(new cej());
                break;
            default:
                boolean z = VKActivity.u;
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().load();
                break;
        }
    }
}
