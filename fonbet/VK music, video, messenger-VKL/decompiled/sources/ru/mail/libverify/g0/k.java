package ru.mail.libverify.g0;

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
        ru.mail.libverify.m0.a aVar;
        ru.mail.libverify.m0.a aVar2;
        this.a.getClass();
        aVar = ru.mail.libverify.m0.c.b;
        if (aVar != null) {
            aVar2 = ru.mail.libverify.m0.c.b;
        } else {
            ru.mail.libverify.m0.c.b = new ru.mail.libverify.m0.c();
            aVar2 = ru.mail.libverify.m0.c.b;
        }
        k7b0.b(aVar2);
        return aVar2;
    }
}
