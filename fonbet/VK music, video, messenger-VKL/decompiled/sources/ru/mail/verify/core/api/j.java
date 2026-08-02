package ru.mail.verify.core.api;

import androidx.annotation.Nullable;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class j implements d9e0 {
    private final ApplicationModule a;

    private j(ApplicationModule applicationModule) {
        this.a = applicationModule;
    }

    public static j a(ApplicationModule applicationModule) {
        return new j(applicationModule);
    }

    @Override // xsna.e9e0
    @Nullable
    public final Object get() {
        return this.a.d();
    }
}
