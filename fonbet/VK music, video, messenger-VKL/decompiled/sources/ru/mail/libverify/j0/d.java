package ru.mail.libverify.j0;

import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.verify.core.utils.components.MessageBus;
import xsna.c6o;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class d implements d9e0 {
    private final d9e0<ru.mail.libverify.g0.d> a;
    private final d9e0<ru.mail.libverify.g0.q> b;
    private final d9e0<KeyValueStorage> c;
    private final d9e0<MessageBus> d;
    private final d9e0<ru.mail.libverify.l0.e> e;
    private final d9e0<e> f;
    private final ru.mail.libverify.g0.g g;

    private d(d9e0 d9e0Var, d9e0 d9e0Var2, d9e0 d9e0Var3, d9e0 d9e0Var4, d9e0 d9e0Var5, d9e0 d9e0Var6, ru.mail.libverify.g0.g gVar) {
        this.a = d9e0Var;
        this.b = d9e0Var2;
        this.c = d9e0Var3;
        this.d = d9e0Var4;
        this.e = d9e0Var5;
        this.f = d9e0Var6;
        this.g = gVar;
    }

    public static d a(d9e0 d9e0Var, d9e0 d9e0Var2, d9e0 d9e0Var3, d9e0 d9e0Var4, d9e0 d9e0Var5, d9e0 d9e0Var6, ru.mail.libverify.g0.g gVar) {
        return new d(d9e0Var, d9e0Var2, d9e0Var3, d9e0Var4, d9e0Var5, d9e0Var6, gVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), c6o.a(this.f), (ru.mail.libverify.i0.a) this.g.get());
    }
}
