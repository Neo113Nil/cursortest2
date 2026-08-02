package ru.mail.libverify.g0;

import ru.mail.verify.core.api.ApplicationModule;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class l implements d9e0 {
    private final ApplicationModule a;
    private final d9e0<TracerLite> b;

    private l(ApplicationModule applicationModule, d9e0<TracerLite> d9e0Var) {
        this.a = applicationModule;
        this.b = d9e0Var;
    }

    public static l a(ApplicationModule applicationModule, d9e0<TracerLite> d9e0Var) {
        return new l(applicationModule, d9e0Var);
    }

    @Override // xsna.e9e0
    public final Object get() {
        ApplicationModule applicationModule = this.a;
        TracerLite tracerLite = this.b.get();
        applicationModule.getClass();
        return new TracerCrashReportLite(tracerLite);
    }
}
