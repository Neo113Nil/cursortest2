package defpackage;

import ru.yandex.taxi.analytics.j;

/* loaded from: classes12.dex */
public final class dm9 implements u2a {
    public final lx4 a;
    public final ma1 b;
    public final cne0 c;
    public final cm9 d = new cm9(0, this);

    public dm9(ma1 ma1Var, lx4 lx4Var, dne0 dne0Var) {
        this.a = lx4Var;
        this.b = ma1Var;
        this.c = dne0Var.a("chargers_adjust_events_tracker_preferences");
    }

    @Override // defpackage.u2a
    public final void a() {
        ((j) this.a).m.o.add(this.d);
    }

    public final void b(String str, String str2) {
        if (str2.length() == 0) {
            return;
        }
        String j = b64.j(str, "_last_tracked_event_time");
        cne0 cne0Var = this.c;
        long j2 = cne0Var.j(j, 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < j2 + 1800000) {
            return;
        }
        ((j) this.a).v(str2);
        cne0Var.q(currentTimeMillis, j);
    }

    @Override // defpackage.u2a
    public final void onDetach() {
        ((j) this.a).m.o.remove(this.d);
    }
}
