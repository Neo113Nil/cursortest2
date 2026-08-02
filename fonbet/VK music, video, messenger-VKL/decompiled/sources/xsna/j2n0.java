package xsna;

import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.random.Random;

/* compiled from: SuccessRateHistoryReporterImpl.kt */
/* loaded from: classes5.dex */
public final class j2n0 implements i2n0 {
    public final VkmSuccessRateEventBuilder.EventName b;
    public boolean c;
    public boolean e;
    public Long f;
    public boolean d = true;
    public boolean g = true;

    public j2n0(VkmSuccessRateEventBuilder.EventName eventName) {
        this.b = eventName;
    }

    public final void a() {
        long j;
        this.c = false;
        this.e = false;
        Long l = this.f;
        if (l != null) {
            j = System.currentTimeMillis() - l.longValue();
        } else {
            j = 0;
        }
        this.f = null;
        new VkmSuccessRateEventBuilder(this.b, VkmSuccessRateEventBuilder.EventType.END, com.vk.core.utils.newtork.b.c().c(), Long.valueOf(j), null, 16).q();
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{"SuccessRateReporter " + this.b.h() + " finished. Duration: " + j});
        }
        this.g = false;
    }

    @Override // xsna.i2n0
    public final boolean b() {
        return this.g;
    }

    @Override // xsna.i2n0
    public final void e(boolean z) {
        if (this.e && !z) {
            a();
        }
        if (this.c) {
            return;
        }
        if (this.d || z) {
            Random.b.getClass();
            if (Random.c.i() < 0.01f) {
                this.c = true;
                this.d = false;
                this.e = true;
                this.f = Long.valueOf(System.currentTimeMillis());
                new VkmSuccessRateEventBuilder(this.b, VkmSuccessRateEventBuilder.EventType.START, com.vk.core.utils.newtork.b.c().c(), null, null, 24).q();
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"SuccessRateReporter " + this.b.h() + " started"});
                }
                if (z) {
                    return;
                }
                a();
            }
        }
    }

    @Override // xsna.i2n0
    public final void onError(Throwable th) {
        if (this.e) {
            this.c = false;
            this.e = false;
            this.f = null;
            new VkmSuccessRateEventBuilder(this.b, VkmSuccessRateEventBuilder.EventType.ERROR, com.vk.core.utils.newtork.b.c().c(), null, th.getMessage(), 8).q();
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"SuccessRateReporter " + this.b.h() + " finished with error. Error: " + th.getMessage()});
            }
            this.g = false;
        }
    }
}
