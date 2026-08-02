package xsna;

import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: SuccessRateSimpleReporterImpl.kt */
/* loaded from: classes11.dex */
public final class t2n0 implements s2n0 {
    public final VkmSuccessRateEventBuilder.EventName a;
    public final bpn0 b = new bpn0(new g58(this, 9));
    public boolean c;
    public Long d;

    public t2n0(VkmSuccessRateEventBuilder.EventName eventName) {
        this.a = eventName;
    }

    @Override // xsna.s2n0
    public final void a() {
        long j;
        if (this.c) {
            this.c = false;
            Long l = this.d;
            if (l != null) {
                j = System.currentTimeMillis() - l.longValue();
            } else {
                j = 0;
            }
            this.d = null;
            new VkmSuccessRateEventBuilder(this.a, VkmSuccessRateEventBuilder.EventType.END, com.vk.core.utils.newtork.b.c().c(), Long.valueOf(j), null, 16).q();
            L l2 = L.a;
            l2.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l2, L.LogType.d, new Object[]{"SuccessRateReporter " + this.a.h() + " finished. Duration: " + j});
        }
    }

    @Override // xsna.s2n0
    public final void b() {
        if (this.c || !((Boolean) this.b.getValue()).booleanValue()) {
            return;
        }
        this.c = true;
        this.d = Long.valueOf(System.currentTimeMillis());
        new VkmSuccessRateEventBuilder(this.a, VkmSuccessRateEventBuilder.EventType.START, com.vk.core.utils.newtork.b.c().c(), null, null, 24).q();
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"SuccessRateReporter " + this.a.h() + " started"});
    }

    @Override // xsna.s2n0
    public final void onError(String str) {
        long j;
        if (this.c) {
            this.c = false;
            Long l = this.d;
            if (l != null) {
                j = System.currentTimeMillis() - l.longValue();
            } else {
                j = 0;
            }
            this.d = null;
            new VkmSuccessRateEventBuilder(this.a, VkmSuccessRateEventBuilder.EventType.ERROR, com.vk.core.utils.newtork.b.c().c(), Long.valueOf(j), str).q();
            L l2 = L.a;
            l2.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l2, L.LogType.d, new Object[]{"SuccessRateReporter " + this.a.h() + " finished with error: " + str + ". Duration: " + j});
        }
    }
}
