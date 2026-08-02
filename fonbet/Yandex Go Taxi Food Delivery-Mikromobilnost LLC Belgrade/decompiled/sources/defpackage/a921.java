package defpackage;

import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.yandex.messaging.domain.statuses.j;
import java.util.Calendar;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class a921 extends xx4 {
    public final kg9 w;
    public final sls x;
    public x08 y = wfz.z;

    public a921(kg9 kg9Var, sls slsVar) {
        this.w = kg9Var;
        this.x = slsVar;
    }

    @Override // defpackage.xx4, defpackage.hr
    public final void b() {
        i(null);
        this.y.cancel();
        this.y = wfz.z;
    }

    @Override // defpackage.hr
    public final boolean f(hr hrVar) {
        return hrVar instanceof a921;
    }

    @Override // defpackage.hr
    public final boolean g(hr hrVar) {
        kg9 kg9Var;
        boolean z = hrVar instanceof a921;
        e3n e3nVar = null;
        a921 a921Var = z ? (a921) hrVar : null;
        if (((a921Var == null || (kg9Var = a921Var.w) == null) ? null : kg9Var.a) == this.w.a) {
            a921 a921Var2 = z ? (a921) hrVar : null;
            if (a921Var2 != null && a921Var2.w != null) {
                e3nVar = new e3n(0L);
            }
            if (e3nVar == null ? false : e3n.d(e3nVar.a, 0L)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xx4
    public final void j(cl21 cl21Var) {
        j jVar = (j) ((d9g) cl21Var).t0.get();
        wx11 wx11Var = new wx11(6, this);
        x08 x08Var = wfz.z;
        if (((u9u0) jVar.e.get()).w) {
            boolean z = ((hlf) jVar.f.get()).w;
            yt21 yt21Var = jVar.b;
            r0 r0Var = yt21Var.j;
            kg9 kg9Var = this.w;
            StatusAvailability statusAvailability = kg9Var.a;
            long time = Calendar.getInstance().getTime().getTime();
            StatusAvailability statusAvailability2 = kg9Var.a;
            it21 it21Var = new it21(time, statusAvailability, m791.h(statusAvailability2) == 1, 17);
            r0Var.getClass();
            r0Var.m(null, it21Var);
            x22 x22Var = yt21Var.e.a;
            Pair pair = new Pair("availability", Integer.valueOf(statusAvailability2.getType()));
            o430 o430Var = e3n.b;
            x22Var.reportEvent("status_update_started", b.i(pair, new Pair("duration", Long.valueOf(e3n.o(0L, DurationUnit.SECONDS)))));
            x08Var = yt21Var.a.f(new t6b(2, kg9Var, yt21Var, wx11Var));
        }
        this.y = x08Var;
    }
}
