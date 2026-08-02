package ru.mail.libverify.e0;

import android.content.Context;
import ru.mail.libverify.g0.d;
import ru.mail.libverify.l0.e;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.verify.core.api.g;
import ru.mail.verify.core.utils.components.MessageBus;
import xsna.c6o;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class b implements d9e0 {
    private final g a;
    private final d9e0<e> b;
    private final d9e0<d> c;
    private final d9e0<MessageBus> d;
    private final d9e0<ru.mail.libverify.c.g> e;
    private final d9e0<KeyValueStorage> f;

    private b(g gVar, d9e0 d9e0Var, d9e0 d9e0Var2, d9e0 d9e0Var3, d9e0 d9e0Var4, d9e0 d9e0Var5) {
        this.a = gVar;
        this.b = d9e0Var;
        this.c = d9e0Var2;
        this.d = d9e0Var3;
        this.e = d9e0Var4;
        this.f = d9e0Var5;
    }

    public static b a(g gVar, d9e0 d9e0Var, d9e0 d9e0Var2, d9e0 d9e0Var3, d9e0 d9e0Var4, d9e0 d9e0Var5) {
        return new b(gVar, d9e0Var, d9e0Var2, d9e0Var3, d9e0Var4, d9e0Var5);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new a((Context) this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), c6o.a(this.f));
    }
}
