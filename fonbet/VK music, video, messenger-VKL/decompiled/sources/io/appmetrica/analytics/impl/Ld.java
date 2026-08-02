package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes8.dex */
public abstract class Ld implements InterfaceC5076oo, InterfaceC5209u2 {
    public final String a;
    public final int b;
    public final Co c;
    public final V2 d;
    public PublicLogger e = PublicLogger.getAnonymousInstance();

    public Ld(int i, String str, Co co, V2 v2) {
        this.b = i;
        this.a = str;
        this.c = co;
        this.d = v2;
    }

    @NonNull
    public final C5102po a() {
        C5102po c5102po = new C5102po();
        c5102po.b = this.b;
        c5102po.a = this.a.getBytes();
        c5102po.d = new C5153ro();
        c5102po.c = new C5128qo();
        return c5102po;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5076oo
    public abstract /* synthetic */ void a(@NonNull C5050no c5050no);

    @NonNull
    public final V2 b() {
        return this.d;
    }

    @NonNull
    public final String c() {
        return this.a;
    }

    @NonNull
    public final Co d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final boolean f() {
        Ao a = this.c.a(this.a);
        if (a.a) {
            return true;
        }
        this.e.warning("Attribute " + this.a + " of type " + ((String) Yn.a.get(this.b)) + " is skipped because " + a.b, new Object[0]);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5076oo
    public final void a(@NonNull PublicLogger publicLogger) {
        this.e = publicLogger;
    }
}
