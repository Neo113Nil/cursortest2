package defpackage;

import android.os.SystemClock;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionTimelineTracker$Session$State;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class i6y0 implements g6y0 {
    public volatile cfs b;
    public final a3y0 a = new a3y0(TaxiOrderLogGroup.PERF.getTag(), "SessionTimelineTracker");
    public WeakReference c = new WeakReference(null);
    public final r0 d = bvf0.c(null);

    public final boolean a() {
        bei beiVar = bei.R;
        h6y0 h6y0Var = (h6y0) this.d.getValue();
        if (h6y0Var == null || h6y0Var.c()) {
            return false;
        }
        f6y0 b = h6y0Var.b();
        return jl40.l(b != null ? b.a() : null, beiVar);
    }

    public final void b(c6y0 c6y0Var) {
        r0 r0Var;
        Object value;
        h6y0 h6y0Var;
        do {
            r0Var = this.d;
            value = r0Var.getValue();
            h6y0Var = (h6y0) value;
            if (h6y0Var == null) {
                h6y0Var = null;
            }
            if (h6y0Var == null) {
                h6y0Var = jzz.i(null, c6y0Var.getTimestamp(), TaxiOrderSessionTimelineTracker$Session$State.WAITING_SCENARIO, 1);
            }
            boolean c = h6y0Var.c();
            a3y0 a3y0Var = this.a;
            if (c) {
                a3y0Var.getClass();
                a3y0.h(new String[]{"offer"});
                hst hstVar = jst.e;
            } else {
                h6y0 d = h6y0Var.d(c6y0Var);
                if (d == h6y0Var) {
                    a3y0Var.getClass();
                    a3y0.h(new String[]{"offer"});
                    hst hstVar2 = jst.e;
                } else {
                    h6y0Var = d;
                }
            }
        } while (!r0Var.k(value, h6y0Var));
    }

    public final void c(zxx0 zxx0Var) {
        cfs cfsVar;
        Object value;
        h6y0 h6y0Var;
        cfs cfsVar2 = this.b;
        if (cfsVar2 != null) {
            cfsVar2.a();
        }
        mua0 mua0Var = (mua0) this.c.get();
        if (mua0Var == null || (cfsVar = mua0Var.a()) == null) {
            cfsVar = null;
        } else {
            cfsVar.c.post(new afs(cfsVar, 0));
        }
        this.b = cfsVar;
        r0 r0Var = this.d;
        do {
            value = r0Var.getValue();
            h6y0Var = (h6y0) value;
            if (h6y0Var == null) {
                h6y0Var = null;
            }
        } while (!r0Var.k(value, (h6y0Var == null || h6y0Var.b() != null || h6y0Var.c()) ? jzz.i(zxx0Var, 0L, TaxiOrderSessionTimelineTracker$Session$State.STARTED, 2) : h6y0.a(h6y0Var, new f6y0(SystemClock.elapsedRealtime(), zxx0Var), null, TaxiOrderSessionTimelineTracker$Session$State.STARTED, 14)));
    }
}
