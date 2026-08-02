package ru.mail.libverify.api;

import android.content.Context;
import ru.mail.libverify.api.i;
import ru.mail.verify.core.api.ApplicationModule;
import ru.mail.verify.core.utils.SocketFactoryProvider;
import ru.mail.verify.core.utils.components.MessageBus;
import xsna.d9e0;
import xsna.rtl;

/* loaded from: classes9.dex */
public final class v implements d9e0 {
    private final ru.mail.verify.core.api.g a;
    private final rtl b;
    private final d9e0<MessageBus> c;
    private final ru.mail.verify.core.api.h d;
    private final ru.mail.verify.core.api.j e;

    private v(ru.mail.verify.core.api.g gVar, rtl rtlVar, d9e0 d9e0Var, ru.mail.verify.core.api.h hVar, ru.mail.verify.core.api.j jVar) {
        this.a = gVar;
        this.b = rtlVar;
        this.c = d9e0Var;
        this.d = hVar;
        this.e = jVar;
    }

    public static v a(ru.mail.verify.core.api.g gVar, rtl rtlVar, d9e0 d9e0Var, ru.mail.verify.core.api.h hVar, ru.mail.verify.core.api.j jVar) {
        return new v(gVar, rtlVar, d9e0Var, hVar, jVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new u((Context) this.a.get(), (ru.mail.libverify.u.w) this.b.get(), (MessageBus) ((i.b.C2190b) this.c).get(), (ApplicationModule.NetworkPolicyConfig) this.d.get(), (SocketFactoryProvider) this.e.get());
    }
}
