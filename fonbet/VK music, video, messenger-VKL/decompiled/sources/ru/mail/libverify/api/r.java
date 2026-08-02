package ru.mail.libverify.api;

import java.lang.Thread;
import java.util.concurrent.RejectedExecutionHandler;
import ru.mail.libverify.api.i;
import ru.mail.verify.core.utils.components.MessageBus;
import xsna.c6o;
import xsna.d9e0;
import xsna.rtl;

/* loaded from: classes9.dex */
public final class r implements d9e0 {
    private final d9e0<ru.mail.libverify.g0.d> a;
    private final rtl b;
    private final d9e0<MessageBus> c;
    private final d9e0<ru.mail.libverify.c.g> d;
    private final d9e0<ru.mail.libverify.g0.a> e;
    private final d9e0<ru.mail.libverify.h0.a> f;
    private final d9e0<ru.mail.libverify.j0.b> g;
    private final d9e0<ru.mail.libverify.o.d> h;
    private final d9e0<ru.mail.libverify.i.c> i;
    private final ru.mail.verify.core.api.l j;
    private final ru.mail.verify.core.api.i k;
    private final ru.mail.libverify.g0.k l;
    private final ru.mail.libverify.y.b m;
    private final ru.mail.libverify.g0.g n;
    private final ru.mail.libverify.g0.j o;
    private final d9e0<ru.mail.libverify.o.e> p;

    private r(d9e0 d9e0Var, rtl rtlVar, d9e0 d9e0Var2, d9e0 d9e0Var3, d9e0 d9e0Var4, d9e0 d9e0Var5, d9e0 d9e0Var6, d9e0 d9e0Var7, d9e0 d9e0Var8, ru.mail.verify.core.api.l lVar, ru.mail.verify.core.api.i iVar, ru.mail.libverify.g0.k kVar, ru.mail.libverify.y.b bVar, ru.mail.libverify.g0.g gVar, ru.mail.libverify.g0.j jVar, d9e0 d9e0Var9) {
        this.a = d9e0Var;
        this.b = rtlVar;
        this.c = d9e0Var2;
        this.d = d9e0Var3;
        this.e = d9e0Var4;
        this.f = d9e0Var5;
        this.g = d9e0Var6;
        this.h = d9e0Var7;
        this.i = d9e0Var8;
        this.j = lVar;
        this.k = iVar;
        this.l = kVar;
        this.m = bVar;
        this.n = gVar;
        this.o = jVar;
        this.p = d9e0Var9;
    }

    public static r a(d9e0 d9e0Var, rtl rtlVar, d9e0 d9e0Var2, d9e0 d9e0Var3, d9e0 d9e0Var4, d9e0 d9e0Var5, d9e0 d9e0Var6, d9e0 d9e0Var7, d9e0 d9e0Var8, ru.mail.verify.core.api.l lVar, ru.mail.verify.core.api.i iVar, ru.mail.libverify.g0.k kVar, ru.mail.libverify.y.b bVar, ru.mail.libverify.g0.g gVar, ru.mail.libverify.g0.j jVar, d9e0 d9e0Var9) {
        return new r(d9e0Var, rtlVar, d9e0Var2, d9e0Var3, d9e0Var4, d9e0Var5, d9e0Var6, d9e0Var7, d9e0Var8, lVar, iVar, kVar, bVar, gVar, jVar, d9e0Var9);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new q((ru.mail.libverify.g0.d) ((i.b.d) this.a).get(), (ru.mail.libverify.u.w) this.b.get(), (MessageBus) ((i.b.C2190b) this.c).get(), this.d.get(), c6o.a(this.e), c6o.a(this.f), c6o.a(this.g), c6o.a(this.h), c6o.a(this.i), (Thread.UncaughtExceptionHandler) this.j.get(), (RejectedExecutionHandler) this.k.get(), (ru.mail.libverify.m0.a) this.l.get(), (ru.mail.libverify.y.a) this.m.get(), (ru.mail.libverify.i0.a) this.n.get(), (ru.mail.libverify.b.b) this.o.get(), this.p.get());
    }
}
