package ru.mail.verify.core.api;

import java.lang.Thread;
import java.util.concurrent.RejectedExecutionHandler;
import ru.mail.verify.core.api.ApplicationModule;
import ru.mail.verify.core.utils.components.MessageBus;
import xsna.c6o;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class d implements d9e0 {
    private final d9e0<MessageBus> a;
    private final l b;
    private final k c;
    private final i d;
    private final d9e0<ru.mail.libverify.l0.e> e;

    private d(d9e0 d9e0Var, l lVar, k kVar, i iVar, d9e0 d9e0Var2) {
        this.a = d9e0Var;
        this.b = lVar;
        this.c = kVar;
        this.d = iVar;
        this.e = d9e0Var2;
    }

    public static d a(d9e0 d9e0Var, l lVar, k kVar, i iVar, d9e0 d9e0Var2) {
        return new d(d9e0Var, lVar, kVar, iVar, d9e0Var2);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new c(this.a.get(), (Thread.UncaughtExceptionHandler) this.b.get(), (ApplicationModule.c) this.c.get(), (RejectedExecutionHandler) this.d.get(), c6o.a(this.e));
    }
}
