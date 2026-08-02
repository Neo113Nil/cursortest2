package xsna;

import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;

/* compiled from: SuccessRatePageLoadingReporterImpl.kt */
/* loaded from: classes5.dex */
public final class l2n0 implements k2n0 {
    public final t2n0 a;
    public final t2n0 b;
    public String c;
    public String d;

    public l2n0(VkmSuccessRateEventBuilder.EventName eventName) {
        this.a = new t2n0(eventName);
        this.b = new t2n0(eventName);
    }

    @Override // xsna.k2n0
    public final void a(String str) {
        if (epx.f(this.d, str)) {
            return;
        }
        this.d = str;
        this.b.b();
    }

    @Override // xsna.k2n0
    public final void b(String str, String str2) {
        if (!epx.f(this.c, str)) {
            this.c = null;
            this.a.a();
        }
        if (epx.f(this.d, str2)) {
            return;
        }
        this.d = null;
        this.b.a();
    }

    @Override // xsna.k2n0
    public final void c(String str) {
        if (epx.f(this.c, str)) {
            return;
        }
        this.c = str;
        this.a.b();
    }

    @Override // xsna.k2n0
    public final void onDestroy() {
        if (this.c != null) {
            this.c = null;
            this.a.onError("cancelled");
        }
        if (this.d != null) {
            this.d = null;
            this.b.onError("cancelled");
        }
    }
}
