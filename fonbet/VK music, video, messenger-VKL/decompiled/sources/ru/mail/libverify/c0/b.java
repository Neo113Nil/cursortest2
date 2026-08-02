package ru.mail.libverify.c0;

import ru.mail.verify.core.api.ApplicationModule;
import ru.mail.verify.core.api.k;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;
import xsna.c6o;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class b implements d9e0 {
    private final k a;
    private final d9e0<TracerCrashReportLite> b;

    private b(k kVar, d9e0 d9e0Var) {
        this.a = kVar;
        this.b = d9e0Var;
    }

    public static b a(k kVar, d9e0 d9e0Var) {
        return new b(kVar, d9e0Var);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new a((ApplicationModule.c) this.a.get(), c6o.a(this.b));
    }
}
