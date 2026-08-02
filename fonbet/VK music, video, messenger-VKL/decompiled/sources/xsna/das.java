package xsna;

import xsna.ewo0;

/* compiled from: ForwardingTimeline.java */
/* loaded from: classes12.dex */
public abstract class das extends ewo0 {
    public final ewo0 b;

    public das(ewo0 ewo0Var) {
        this.b = ewo0Var;
    }

    @Override // xsna.ewo0
    public final int a(boolean z) {
        return this.b.a(z);
    }

    @Override // xsna.ewo0
    public int b(Object obj) {
        return this.b.b(obj);
    }

    @Override // xsna.ewo0
    public final int c(boolean z) {
        return this.b.c(z);
    }

    @Override // xsna.ewo0
    public final int e(int i, int i2, boolean z) {
        return this.b.e(i, i2, z);
    }

    @Override // xsna.ewo0
    public ewo0.b f(int i, ewo0.b bVar, boolean z) {
        return this.b.f(i, bVar, z);
    }

    @Override // xsna.ewo0
    public final int h() {
        return this.b.h();
    }

    @Override // xsna.ewo0
    public final int k(int i, int i2, boolean z) {
        return this.b.k(i, i2, z);
    }

    @Override // xsna.ewo0
    public Object l(int i) {
        return this.b.l(i);
    }

    @Override // xsna.ewo0
    public ewo0.c m(int i, ewo0.c cVar, long j) {
        return this.b.m(i, cVar, j);
    }

    @Override // xsna.ewo0
    public final int o() {
        return this.b.o();
    }
}
