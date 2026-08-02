package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC4844g {
    public final C4927j5 a;
    public final C4711al b;
    public final C4814el c;
    public final Zk d;
    public final InterfaceC4779db e;
    public final SystemTimeProvider f;

    public AbstractC4844g(@NonNull C4927j5 c4927j5, @NonNull C4711al c4711al, @NonNull C4814el c4814el, @NonNull Zk zk, @NonNull InterfaceC4779db interfaceC4779db, @NonNull SystemTimeProvider systemTimeProvider) {
        this.a = c4927j5;
        this.b = c4711al;
        this.c = c4814el;
        this.d = zk;
        this.e = interfaceC4779db;
        this.f = systemTimeProvider;
    }

    @NonNull
    public final /* bridge */ Nk a(@NonNull Object obj) {
        return a((Ok) obj);
    }

    @Nullable
    public final Nk b() {
        if (this.c.h()) {
            return new Nk(this.a, this.c, a(), this.f);
        }
        return null;
    }

    @NonNull
    public final Nk a(@NonNull Ok ok) {
        if (this.c.h()) {
            this.e.reportEvent("create session with non-empty storage");
        }
        C4927j5 c4927j5 = this.a;
        C4814el c4814el = this.c;
        long a = this.b.a();
        C4814el c4814el2 = this.c;
        c4814el2.a(C4814el.f, Long.valueOf(a));
        c4814el2.a(C4814el.d, Long.valueOf(ok.a));
        c4814el2.a(C4814el.h, Long.valueOf(ok.a));
        c4814el2.a(C4814el.g, 0L);
        c4814el2.a(C4814el.i, Boolean.TRUE);
        c4814el2.b();
        this.a.e.a(a, this.d.a, TimeUnit.MILLISECONDS.toSeconds(ok.b));
        return new Nk(c4927j5, c4814el, a(), new SystemTimeProvider());
    }

    public final Qk a() {
        Pk pk = new Pk(this.d);
        pk.g = this.c.i();
        pk.f = this.c.c.a(C4814el.g);
        pk.d = this.c.c.a(C4814el.h);
        pk.c = this.c.c.a(C4814el.f);
        pk.h = this.c.c.a(C4814el.d);
        pk.a = this.c.c.a(C4814el.e);
        return new Qk(pk);
    }
}
