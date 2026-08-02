package yads;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class je0 implements di3 {
    public final w5 a;
    public final i72 b;
    public final z30 c;
    public final AtomicInteger d;

    public je0(w5 w5Var, int i, i72 i72Var, z30 z30Var) {
        this.a = w5Var;
        this.b = i72Var;
        this.c = z30Var;
        this.d = new AtomicInteger(i);
    }

    @Override // yads.di3
    public final void a() {
        if (this.d.decrementAndGet() == 0) {
            this.a.a(v5.p);
            this.b.a();
        }
    }

    @Override // yads.di3
    public final void b() {
        if (this.d.getAndSet(0) > 0) {
            this.a.a(v5.p);
            this.c.a(y30.f);
            this.b.a();
        }
    }

    @Override // yads.di3
    public final void c() {
    }
}
