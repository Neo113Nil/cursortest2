package ru.mail.libverify.i;

import android.content.Context;
import ru.mail.verify.core.utils.components.MessageBus;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class d implements d9e0 {
    private final ru.mail.verify.core.api.g a;
    private final d9e0<MessageBus> b;
    private final d9e0<ru.mail.libverify.g0.d> c;
    private final n d;
    private final d9e0<f> e;
    private final d9e0<ru.mail.libverify.w.f> f;

    private d(ru.mail.verify.core.api.g gVar, d9e0 d9e0Var, d9e0 d9e0Var2, n nVar, d9e0 d9e0Var3, d9e0 d9e0Var4) {
        this.a = gVar;
        this.b = d9e0Var;
        this.c = d9e0Var2;
        this.d = nVar;
        this.e = d9e0Var3;
        this.f = d9e0Var4;
    }

    public static d a(ru.mail.verify.core.api.g gVar, d9e0 d9e0Var, d9e0 d9e0Var2, n nVar, d9e0 d9e0Var3, d9e0 d9e0Var4) {
        return new d(gVar, d9e0Var, d9e0Var2, nVar, d9e0Var3, d9e0Var4);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new ru.mail.libverify.notifications.a((Context) this.a.get(), this.b.get(), this.c.get(), (m) this.d.get(), this.e.get(), this.f.get());
    }
}
