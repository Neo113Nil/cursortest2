package ru.mail.verify.core.api;

import java.lang.Thread;
import xsna.d9e0;
import xsna.k7b0;

/* loaded from: classes9.dex */
public final class l implements d9e0 {
    private final ApplicationModule a;

    private l(ApplicationModule applicationModule) {
        this.a = applicationModule;
    }

    public static l a(ApplicationModule applicationModule) {
        return new l(applicationModule);
    }

    @Override // xsna.e9e0
    public final Object get() {
        Thread.UncaughtExceptionHandler f = this.a.f();
        k7b0.b(f);
        return f;
    }
}
