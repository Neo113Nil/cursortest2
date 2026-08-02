package ru.mail.libverify.g0;

import ru.mail.libverify.u.w;
import ru.mail.verify.core.api.ApplicationModule;
import xsna.d9e0;
import xsna.rtl;

/* loaded from: classes9.dex */
public final class h implements d9e0 {
    private final ApplicationModule a;
    private final rtl b;

    private h(ApplicationModule applicationModule, rtl rtlVar) {
        this.a = applicationModule;
        this.b = rtlVar;
    }

    public static h a(ApplicationModule applicationModule, rtl rtlVar) {
        return new h(applicationModule, rtlVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        ApplicationModule applicationModule = this.a;
        w wVar = (w) this.b.get();
        applicationModule.getClass();
        return new ru.mail.libverify.q.d(wVar);
    }
}
