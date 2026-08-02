package xsna;

import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;

/* compiled from: SuccessRateGenericReporterImpl.kt */
/* loaded from: classes5.dex */
public final class g2n0<T> implements f2n0<T> {
    public final VkmSuccessRateEventBuilder.EventName a;
    public Long c;
    public final bpn0 b = new bpn0(new kr6(this));
    public final ArrayList d = new ArrayList();

    public g2n0(VkmSuccessRateEventBuilder.EventName eventName) {
        this.a = eventName;
    }

    @Override // xsna.f2n0
    public final void a(String str, Throwable th) {
        String str2;
        if (this.d.remove(str)) {
            Long l = this.c;
            long a = l != null ? qni0.a() - l.longValue() : 0L;
            this.c = null;
            VkmSuccessRateEventBuilder.EventType eventType = VkmSuccessRateEventBuilder.EventType.ERROR;
            String c = com.vk.core.utils.newtork.b.c().c();
            Long valueOf = Long.valueOf(a);
            if (th == null || (str2 = th.toString()) == null) {
                str2 = "Error was null";
            }
            new VkmSuccessRateEventBuilder(this.a, eventType, c, valueOf, str2).q();
            L l2 = L.a;
            l2.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l2, L.LogType.d, new Object[]{"SuccessRateReporter " + this.a.h() + " finished. Duration: " + a});
        }
    }

    @Override // xsna.f2n0
    public final void b(String str) {
        long j;
        if (this.d.remove(str)) {
            Long l = this.c;
            if (l != null) {
                j = qni0.a() - l.longValue();
            } else {
                j = 0;
            }
            this.c = null;
            new VkmSuccessRateEventBuilder(this.a, VkmSuccessRateEventBuilder.EventType.END, com.vk.core.utils.newtork.b.c().c(), Long.valueOf(j), null, 16).q();
            L l2 = L.a;
            l2.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l2, L.LogType.d, new Object[]{"SuccessRateReporter " + this.a.h() + " finished. Duration: " + j});
        }
    }

    @Override // xsna.f2n0
    public final void onStarted(String str) {
        if (((Boolean) this.b.getValue()).booleanValue()) {
            this.d.add(str);
            this.c = Long.valueOf(qni0.a());
            new VkmSuccessRateEventBuilder(this.a, VkmSuccessRateEventBuilder.EventType.START, com.vk.core.utils.newtork.b.c().c(), null, null, 24).q();
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"SuccessRateReporter " + this.a.h() + " started"});
        }
    }
}
