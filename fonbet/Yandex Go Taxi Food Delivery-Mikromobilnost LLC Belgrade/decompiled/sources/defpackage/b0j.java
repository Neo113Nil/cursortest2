package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.ReqDestinationRules;
import com.yandex.go.zone.model.Zone;
import java.util.Calendar;

/* loaded from: classes6.dex */
public final class b0j {
    public final dqe0 a;
    public final wiq0 b;
    public final h3y c;
    public final nf7 d;

    public b0j(dqe0 dqe0Var, wiq0 wiq0Var, h3y h3yVar, nf7 nf7Var) {
        this.a = dqe0Var;
        this.b = wiq0Var;
        this.c = h3yVar;
        this.d = nf7Var;
    }

    public final boolean a() {
        if (this.a.a.G.b() != null) {
            return false;
        }
        return b(((k) this.b).m());
    }

    public final boolean b(pex0 pex0Var) {
        Zone c = this.a.c();
        boolean z = false;
        if (c == null) {
            jst.e.getClass();
            return false;
        }
        ReqDestinationRules reqDestinationRules = c.d;
        if (c.c) {
            jst.e.getClass();
            return true;
        }
        if (pex0Var != null && pex0Var.w) {
            jst.e.getClass();
            return true;
        }
        h3y h3yVar = this.c;
        if (((axm) h3yVar.get()).c() && reqDestinationRules.a != null) {
            Calendar b = ((axm) h3yVar.get()).b();
            if (b == null) {
                ny61.g("Required value was null.");
                return false;
            }
            int timeInMillis = (int) ((b.getTimeInMillis() - this.d.a.a(b.getTimeZone()).getTimeInMillis()) / 1000);
            Integer num = reqDestinationRules.a;
            if (timeInMillis > (num != null ? num.intValue() : Integer.MAX_VALUE)) {
                z = true;
            }
        }
        unr0.C(new Object[]{Boolean.valueOf(z)}, 1, "Destination required by specified order due: %s", jst.e);
        return z;
    }
}
