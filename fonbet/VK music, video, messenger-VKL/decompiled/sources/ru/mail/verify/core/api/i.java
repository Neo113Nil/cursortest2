package ru.mail.verify.core.api;

import java.util.concurrent.RejectedExecutionHandler;
import xsna.d9e0;
import xsna.k7b0;

/* loaded from: classes9.dex */
public final class i implements d9e0 {
    private final ApplicationModule a;

    private i(ApplicationModule applicationModule) {
        this.a = applicationModule;
    }

    public static i a(ApplicationModule applicationModule) {
        return new i(applicationModule);
    }

    @Override // xsna.e9e0
    public final Object get() {
        RejectedExecutionHandler c = this.a.c();
        k7b0.b(c);
        return c;
    }
}
