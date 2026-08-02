package defpackage;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.ScheduledOrder;
import java.util.Calendar;
import java.util.TimeZone;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.scheduleride.deeplink.ScheduleRideNext;

/* loaded from: classes.dex */
public final class axm {
    public final dqe0 a;
    public final jtq0 b;
    public final n0 c;
    public final n0 d;
    public volatile ScheduleRideNext e;
    public final zwm f;

    public axm(dqe0 dqe0Var, jtq0 jtq0Var) {
        this.a = dqe0Var;
        this.b = jtq0Var;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.c = ffx.b(0, 1, bufferOverflow);
        this.d = ffx.b(0, 1, bufferOverflow);
        this.e = ScheduleRideNext.UNKNOWN;
        this.f = new zwm(this);
    }

    public final void a(ywm ywmVar) {
        Calendar calendar = null;
        if (ywmVar.equals(msb1.F)) {
            ScheduledOrder scheduledOrder = this.a.a.S;
            scheduledOrder.a = null;
            scheduledOrder.c = null;
            scheduledOrder.d = 0;
        } else if (ywmVar.equals(qtb1.D)) {
            ScheduledOrder scheduledOrder2 = this.a.a.S;
            scheduledOrder2.a = null;
            scheduledOrder2.c = null;
            scheduledOrder2.d = 0;
            this.a.a.R = null;
        } else {
            if (!(ywmVar instanceof xwm)) {
                w511.b();
                return;
            }
            Preorder preorder = this.a.a;
            xwm xwmVar = (xwm) ywmVar;
            Calendar a = xwmVar.a();
            Integer b = xwmVar.b();
            String c = xwmVar.c();
            ScheduledOrder scheduledOrder3 = preorder.S;
            if (a != null) {
                scheduledOrder3.getClass();
                calendar = (Calendar) a.clone();
            }
            scheduledOrder3.a = calendar;
            scheduledOrder3.b = calendar;
            scheduledOrder3.c = c;
            scheduledOrder3.d = 0;
            scheduledOrder3.e = b;
            this.d.g(this.e);
        }
        this.c.g(zy11.a);
    }

    public final Calendar b() {
        return this.a.a.g();
    }

    public final boolean c() {
        return this.a.a.S.a != null;
    }

    public final void d(int i, TimeZone timeZone) {
        Calendar a = this.b.a(timeZone);
        ScheduledOrder scheduledOrder = this.a.a.S;
        scheduledOrder.c = null;
        if (i != 0) {
            scheduledOrder.d = i;
            a.add(12, i);
            scheduledOrder.a = a;
            scheduledOrder.b = a;
        } else {
            scheduledOrder.a = null;
            scheduledOrder.d = 0;
        }
        this.c.g(zy11.a);
    }
}
