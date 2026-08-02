package ru.mail.libverify.g0;

import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.verify.core.api.ApplicationModule;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class g implements d9e0 {
    private final ApplicationModule a;
    private final d9e0<KeyValueStorage> b;

    private g(ApplicationModule applicationModule, d9e0<KeyValueStorage> d9e0Var) {
        this.a = applicationModule;
        this.b = d9e0Var;
    }

    public static g a(ApplicationModule applicationModule, d9e0<KeyValueStorage> d9e0Var) {
        return new g(applicationModule, d9e0Var);
    }

    @Override // xsna.e9e0
    public final Object get() {
        ApplicationModule applicationModule = this.a;
        KeyValueStorage keyValueStorage = this.b.get();
        applicationModule.getClass();
        return new ru.mail.libverify.i0.b(keyValueStorage);
    }
}
