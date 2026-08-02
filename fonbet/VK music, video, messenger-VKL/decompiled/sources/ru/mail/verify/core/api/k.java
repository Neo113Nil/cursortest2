package ru.mail.verify.core.api;

import ru.mail.verify.core.api.ApplicationModule;
import xsna.d9e0;
import xsna.k7b0;

/* loaded from: classes9.dex */
public final class k implements d9e0 {
    private final ApplicationModule a;

    private k(ApplicationModule applicationModule) {
        this.a = applicationModule;
    }

    public static k a(ApplicationModule applicationModule) {
        return new k(applicationModule);
    }

    @Override // xsna.e9e0
    public final Object get() {
        ApplicationModule.c e = this.a.e();
        k7b0.b(e);
        return e;
    }
}
