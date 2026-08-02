package ru.mail.verify.core.api;

import ru.mail.verify.core.api.ApplicationModule;
import xsna.d9e0;
import xsna.k7b0;

/* loaded from: classes9.dex */
public final class h implements d9e0 {
    private final ApplicationModule a;

    private h(ApplicationModule applicationModule) {
        this.a = applicationModule;
    }

    public static h a(ApplicationModule applicationModule) {
        return new h(applicationModule);
    }

    @Override // xsna.e9e0
    public final Object get() {
        ApplicationModule.NetworkPolicyConfig b = this.a.b();
        k7b0.b(b);
        return b;
    }
}
