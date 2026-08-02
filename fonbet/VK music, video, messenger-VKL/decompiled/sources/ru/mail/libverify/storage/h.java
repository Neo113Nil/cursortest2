package ru.mail.libverify.storage;

import android.content.Context;
import ru.mail.libverify.g0.q;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import xsna.c6o;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class h implements d9e0 {
    private final ru.mail.verify.core.api.g a;
    private final d9e0<ru.mail.libverify.c.g> b;
    private final d9e0<ru.mail.libverify.g0.a> c;
    private final d9e0<ru.mail.libverify.h0.a> d;
    private final d9e0<q> e;
    private final d9e0<KeyValueStorage> f;
    private final d9e0<ru.mail.libverify.f0.c> g;
    private final ru.mail.libverify.g0.i h;
    private final d9e0<ru.mail.libverify.o.e> i;

    private h(ru.mail.verify.core.api.g gVar, d9e0 d9e0Var, d9e0 d9e0Var2, d9e0 d9e0Var3, d9e0 d9e0Var4, d9e0 d9e0Var5, d9e0 d9e0Var6, ru.mail.libverify.g0.i iVar, d9e0 d9e0Var7) {
        this.a = gVar;
        this.b = d9e0Var;
        this.c = d9e0Var2;
        this.d = d9e0Var3;
        this.e = d9e0Var4;
        this.f = d9e0Var5;
        this.g = d9e0Var6;
        this.h = iVar;
        this.i = d9e0Var7;
    }

    public static h a(ru.mail.verify.core.api.g gVar, d9e0 d9e0Var, d9e0 d9e0Var2, d9e0 d9e0Var3, d9e0 d9e0Var4, d9e0 d9e0Var5, d9e0 d9e0Var6, ru.mail.libverify.g0.i iVar, d9e0 d9e0Var7) {
        return new h(gVar, d9e0Var, d9e0Var2, d9e0Var3, d9e0Var4, d9e0Var5, d9e0Var6, iVar, d9e0Var7);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new g((Context) this.a.get(), this.b.get(), c6o.a(this.c), c6o.a(this.d), c6o.a(this.e), c6o.a(this.f), c6o.a(this.g), c6o.a(this.h), c6o.a(this.i));
    }
}
