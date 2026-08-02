package yads;

import java.util.NoSuchElementException;

/* loaded from: classes10.dex */
public final class mc0 extends ko {
    public final lc0 e;

    public mc0(lc0 lc0Var, long j, long j2) {
        super(j, j2);
        this.e = lc0Var;
    }

    @Override // yads.zk1
    public final long a() {
        long j = this.d;
        if (j < this.b || j > this.c) {
            throw new NoSuchElementException();
        }
        return this.e.a(j);
    }

    @Override // yads.zk1
    public final long b() {
        long j = this.d;
        if (j < this.b || j > this.c) {
            throw new NoSuchElementException();
        }
        lc0 lc0Var = this.e;
        return lc0Var.d.a(j - lc0Var.f);
    }
}
