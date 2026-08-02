package defpackage;

import io.appmetrica.analytics.IReporter;

/* loaded from: classes8.dex */
public final class la20 implements w8o {
    public final IReporter a;

    public la20(IReporter iReporter) {
        this.a = iReporter;
    }

    @Override // defpackage.w8o
    public final void a() {
        this.a.sendEventsBuffer();
    }

    @Override // defpackage.w8o
    public final void reportError(String str, String str2, Throwable th) {
        this.a.reportError(str, str2, th);
    }

    @Override // defpackage.w8o
    public final void reportUnhandledException(Throwable th) {
        this.a.reportUnhandledException(th);
    }
}
