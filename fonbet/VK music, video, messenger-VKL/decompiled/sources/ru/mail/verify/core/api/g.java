package ru.mail.verify.core.api;

import android.content.Context;
import xsna.d9e0;
import xsna.k7b0;

/* loaded from: classes9.dex */
public final class g implements d9e0 {
    private final ApplicationModule a;

    private g(ApplicationModule applicationModule) {
        this.a = applicationModule;
    }

    public static g a(ApplicationModule applicationModule) {
        return new g(applicationModule);
    }

    @Override // xsna.e9e0
    public final Object get() {
        Context a = this.a.a();
        k7b0.b(a);
        return a;
    }
}
