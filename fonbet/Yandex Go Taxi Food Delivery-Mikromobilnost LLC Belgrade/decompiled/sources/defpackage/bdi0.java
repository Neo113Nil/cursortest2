package defpackage;

import coil.memory.MemoryCache$Key;

/* loaded from: classes10.dex */
public final class bdi0 {
    public final mvu0 a;
    public final w941 b;

    public bdi0(mvu0 mvu0Var, w941 w941Var) {
        this.a = mvu0Var;
        this.b = w941Var;
    }

    public final ki10 a(MemoryCache$Key memoryCache$Key) {
        ki10 b = this.a.b(memoryCache$Key);
        return b == null ? this.b.b(memoryCache$Key) : b;
    }

    public final void b(int i) {
        this.a.a(i);
        this.b.a(i);
    }
}
