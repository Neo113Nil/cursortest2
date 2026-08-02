package xsna;

import com.vk.voip.ui.sessionrooms.e;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.p9i0;
import xsna.t9i0;
import xsna.v9i0;

/* compiled from: SelectSessionRoomFeature.kt */
/* loaded from: classes7.dex */
public final class s9i0 extends wk50<w9i0, v9i0, p9i0, t9i0> {
    public final jwi0 f;

    public s9i0(jwi0 jwi0Var) {
        super(p9i0.b.b, new u9i0(v9i0.b.b));
        this.f = jwi0Var;
    }

    @Override // xsna.wk50
    public final void N(v9i0 v9i0Var, p9i0 p9i0Var) {
        Object obj;
        v9i0 v9i0Var2 = v9i0Var;
        p9i0 p9i0Var2 = p9i0Var;
        boolean z = p9i0Var2 instanceof p9i0.b;
        int i = 1;
        jwi0 jwi0Var = this.f;
        if (z) {
            if (epx.f(v9i0Var2, v9i0.b.b)) {
                T(new t9i0.b(jwi0Var.a(), jwi0Var.b()));
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.sessionrooms.d dVar = com.vk.voip.ui.c.B0;
                a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.y(jwi0Var.d().U(new wd10(11)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), null, new q8i0(this, i), new e420(21), null, 9);
                a7f0.a.e(this, dVar.a().a0(asu0.a.d()).b0(e.b.a.class), null, new l850(this, 9), new s6x(27), null, 9);
                return;
            }
            return;
        }
        if (p9i0Var2 instanceof p9i0.e) {
            T(new t9i0.d(((p9i0.e) p9i0Var2).b));
            return;
        }
        if (p9i0Var2 instanceof p9i0.a) {
            T(t9i0.a.b);
            return;
        }
        if (p9i0Var2 instanceof p9i0.d) {
            T(new t9i0.c(((p9i0.d) p9i0Var2).b));
            return;
        }
        if (!(p9i0Var2 instanceof p9i0.c)) {
            throw new NoWhenBranchMatchedException();
        }
        if (v9i0Var2 instanceof v9i0.d) {
            v9i0.d dVar2 = (v9i0.d) v9i0Var2;
            Iterator<T> it = dVar2.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((lvi0) obj).a.a, dVar2.e)) {
                        break;
                    }
                }
            }
            lvi0 lvi0Var = (lvi0) obj;
            if (lvi0Var != null) {
                jwi0Var.c(lvi0Var);
                C(p9i0.a.b);
            }
        }
    }
}
