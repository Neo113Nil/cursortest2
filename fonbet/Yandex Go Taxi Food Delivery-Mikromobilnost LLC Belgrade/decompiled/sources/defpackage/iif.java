package defpackage;

import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.ModeratedOutMessageData;
import com.yandex.messaging.internal.entities.ReplyData;
import com.yandex.messaging.internal.view.timeline.b0;
import com.yandex.messaging.internal.view.timeline.d0;
import com.yandex.messaging.internal.view.timeline.e;
import com.yandex.messaging.internal.view.timeline.e0;
import com.yandex.messaging.internal.view.timeline.f0;
import com.yandex.messaging.internal.view.timeline.h0;
import com.yandex.messaging.internal.view.timeline.j;
import com.yandex.messaging.internal.view.timeline.k;
import com.yandex.messaging.internal.view.timeline.n;
import com.yandex.messaging.internal.view.timeline.p;
import com.yandex.messaging.internal.view.timeline.q;
import com.yandex.messaging.internal.view.timeline.r;
import com.yandex.messaging.internal.view.timeline.s;
import com.yandex.messaging.internal.view.timeline.t;
import com.yandex.messaging.internal.view.timeline.u;
import com.yandex.messaging.internal.view.timeline.v;
import com.yandex.messaging.internal.view.timeline.w;
import com.yandex.messaging.internal.view.timeline.x;
import com.yandex.messaging.internal.view.timeline.y;
import java.util.HashMap;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class iif {
    public final ocz0 a;
    public final uu10 b;
    public final ui20 c;
    public final s320 d;
    public final lqo e;
    public final wk31 f;
    public yab g;
    public final HashMap h = new HashMap();

    public iif(ocz0 ocz0Var, uu10 uu10Var, ui20 ui20Var, s320 s320Var, lqo lqoVar, wk31 wk31Var) {
        this.a = ocz0Var;
        this.b = uu10Var;
        this.c = ui20Var;
        this.d = s320Var;
        this.e = lqoVar;
        this.f = wk31Var;
    }

    public static int d(yab yabVar, Pair pair) {
        return ((Number) (yabVar.a1() ? pair.c() : pair.f())).intValue();
    }

    public final int a() {
        yab yabVar = this.g;
        if (yabVar != null) {
            return yabVar.getCount();
        }
        return 0;
    }

    public final int b(int i) {
        Integer a0;
        Integer a02;
        yab yabVar = this.g;
        if (yabVar == null) {
            ny61.r("cursor is not ready");
            return 0;
        }
        yabVar.moveToPosition(i);
        if (wkb1.k(yabVar.a.getLong(2), 16L)) {
            return b0.C0;
        }
        if (yabVar.c1() && (a02 = yabVar.a0()) != null && a02.intValue() == 109) {
            return yabVar.a1() ? f0.H0 : d0.H0;
        }
        if (yabVar.c1() && (a0 = yabVar.a0()) != null && a0.intValue() == 113) {
            return yabVar.a1() ? dx80.M0 : eqv.M0;
        }
        if (yabVar.c1()) {
            e0.J0.getClass();
            return e0.L0;
        }
        if (yabVar.R() instanceof ModeratedOutMessageData) {
            return n.B0;
        }
        MessageData R = yabVar.R();
        yabVar.a1();
        this.b.getClass();
        if (!uu10.a(R)) {
            return k.E0;
        }
        ReplyData n0 = yabVar.n0();
        lqo lqoVar = this.e;
        if (n0 != null && n0.getIsPoll() && !lqoVar.a(tz10.h)) {
            return h0.F0;
        }
        int i2 = yabVar.R().type;
        if (i2 == 0) {
            return d(yabVar, new Pair(Integer.valueOf(x.T2), Integer.valueOf(s.V2)));
        }
        if (i2 == 1) {
            return d(yabVar, new Pair(Integer.valueOf(v.H3), Integer.valueOf(q.H3)));
        }
        if (i2 == 4) {
            return d(yabVar, new Pair(Integer.valueOf(w.V2), Integer.valueOf(r.V2)));
        }
        s320 s320Var = this.d;
        if (i2 == 1001) {
            if (this.f.c) {
                s320Var.getClass();
                try {
                    j320.d().a().newInstance();
                    return d(yabVar, new Pair(Integer.valueOf(y.V3), Integer.valueOf(t.V3)));
                } catch (Exception | NoClassDefFoundError unused) {
                }
            }
            return d(yabVar, new Pair(Integer.valueOf(f390.v3), Integer.valueOf(dr80.v3)));
        }
        if (i2 == 6) {
            return d(yabVar, new Pair(Integer.valueOf(f390.v3), Integer.valueOf(dr80.v3)));
        }
        if (i2 == 7) {
            return j.H0;
        }
        if (i2 == 8) {
            return h0.F0;
        }
        switch (i2) {
            case 10:
                return d(yabVar, new Pair(Integer.valueOf(u.T3), Integer.valueOf(p.T3)));
            case 11:
                s320Var.getClass();
                try {
                    e320.d().a().newInstance();
                    return d(yabVar, new Pair(Integer.valueOf(i390.v3), Integer.valueOf(rr80.v3)));
                } catch (Exception | NoClassDefFoundError unused2) {
                    return d(yabVar, new Pair(Integer.valueOf(h390.T2), Integer.valueOf(pr80.T2)));
                }
            case 12:
                return (!yabVar.R0() || lqoVar.a(tz10.h)) ? d(yabVar, new Pair(Integer.valueOf(g390.C3), Integer.valueOf(ir80.C3))) : h0.F0;
            default:
                return d(yabVar, new Pair(Integer.valueOf(x.T2), Integer.valueOf(s.V2)));
        }
    }

    public final void c(e eVar, int i) {
        vb5 vb5Var;
        b(i);
        z83.i();
        yab yabVar = this.g;
        if (yabVar != null) {
            yabVar.moveToPosition(i);
            ServerMessageRef x0 = yabVar.x0();
            if (x0 == null || (vb5Var = (vb5) this.h.get(x0)) == null) {
                vb5Var = new vb5();
            }
            eVar.X(yabVar, vb5Var);
            eVar.u0(yabVar, yabVar.R());
            if (!yabVar.moveToPrevious()) {
                eVar.Q = lbz0.a;
            } else {
                eVar.Q = yabVar.o();
                yabVar.moveToNext();
            }
        }
    }
}
