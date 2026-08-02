package com.yandex.passport.common.coroutine;

import defpackage.g6u;
import defpackage.mdh;
import defpackage.o400;
import defpackage.sjh;
import defpackage.uyj;
import defpackage.zko;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class b implements a {
    public final g6u a;
    public final g6u b;
    public final sjh c;
    public final mdh d;
    public final zko e;
    public final zko f;

    public b() {
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        this.a = g6uVar;
        this.b = g6uVar.x;
        this.c = uyj.a;
        this.d = mdh.b;
        this.e = new zko(Executors.newCachedThreadPool(new h("cached", new AtomicInteger(1))));
        this.f = new zko(Executors.newSingleThreadExecutor(new h("db", new AtomicInteger(1))));
    }
}
