package ru.mail.libverify.g0;

import android.content.Context;
import ru.mail.libverify.u.w;
import ru.mail.verify.core.api.ApplicationModule;
import ru.ok.tracer.lite.TracerLite;
import xsna.d9e0;
import xsna.k7b0;
import xsna.rtl;

/* loaded from: classes9.dex */
public final class m implements d9e0 {
    private final ApplicationModule a;
    private final ru.mail.verify.core.api.g b;
    private final rtl c;

    private m(ApplicationModule applicationModule, ru.mail.verify.core.api.g gVar, rtl rtlVar) {
        this.a = applicationModule;
        this.b = gVar;
        this.c = rtlVar;
    }

    public static m a(ApplicationModule applicationModule, ru.mail.verify.core.api.g gVar, rtl rtlVar) {
        return new m(applicationModule, gVar, rtlVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        ApplicationModule applicationModule = this.a;
        Context context = (Context) this.b.get();
        w wVar = (w) this.c.get();
        applicationModule.getClass();
        TracerLite a = ApplicationModule.a(context, wVar);
        k7b0.b(a);
        return a;
    }
}
