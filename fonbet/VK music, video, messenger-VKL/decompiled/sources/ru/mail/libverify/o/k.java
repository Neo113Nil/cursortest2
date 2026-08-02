package ru.mail.libverify.o;

import ru.mail.libverify.u.w;
import ru.mail.verify.core.api.ApplicationModule;
import ru.ok.tracer.lite.TracerLite;
import xsna.c6o;
import xsna.d9e0;
import xsna.rtl;

/* loaded from: classes9.dex */
public final class k implements d9e0 {
    private final d9e0<TracerLite> a;
    private final rtl b;
    private final ru.mail.verify.core.api.k c;

    private k(d9e0 d9e0Var, rtl rtlVar, ru.mail.verify.core.api.k kVar) {
        this.a = d9e0Var;
        this.b = rtlVar;
        this.c = kVar;
    }

    public static k a(d9e0 d9e0Var, rtl rtlVar, ru.mail.verify.core.api.k kVar) {
        return new k(d9e0Var, rtlVar, kVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new j(c6o.a(this.a), (w) this.b.get(), (ApplicationModule.c) this.c.get());
    }
}
