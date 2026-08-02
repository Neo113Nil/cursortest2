package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes8.dex */
public final class Ee implements InterfaceC4802e9, Fe {
    public final X6 a;
    public final AtomicLong b;

    public Ee(X6 x6) {
        this.a = x6;
        this.b = new AtomicLong(x6.a());
        x6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4802e9
    public final void a(List<Integer> list) {
        this.b.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4802e9
    public final void b(List<Integer> list) {
        this.b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4802e9
    public final void a() {
        this.b.set(this.a.a());
    }

    public final long b() {
        return this.b.get();
    }
}
