package yads;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import xsna.xhb0;

/* loaded from: classes10.dex */
public abstract class pt implements w53 {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public nt d;
    public long e;
    public long f;

    public pt() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new nt());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new ot(new xhb0(this, 23)));
        }
        this.c = new PriorityQueue();
    }

    public abstract void a(nt ntVar);

    @Override // yads.oa0
    public final Object b() {
        if (this.d != null) {
            throw new IllegalStateException();
        }
        if (this.a.isEmpty()) {
            return null;
        }
        nt ntVar = (nt) this.a.pollFirst();
        this.d = ntVar;
        return ntVar;
    }

    public abstract qt c();

    @Override // yads.oa0
    /* renamed from: d */
    public b63 a() {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty()) {
            nt ntVar = (nt) this.c.peek();
            int i = mc3.a;
            if (ntVar.f > this.e) {
                break;
            }
            nt ntVar2 = (nt) this.c.poll();
            if (ntVar2.b(4)) {
                b63 b63Var = (b63) this.b.pollFirst();
                b63Var.b = 4 | b63Var.b;
                ntVar2.b();
                this.a.add(ntVar2);
                return b63Var;
            }
            a(ntVar2);
            if (f()) {
                qt c = c();
                b63 b63Var2 = (b63) this.b.pollFirst();
                long j = ntVar2.f;
                b63Var2.c = j;
                b63Var2.d = c;
                b63Var2.e = j;
                ntVar2.b();
                this.a.add(ntVar2);
                return b63Var2;
            }
            ntVar2.b();
            this.a.add(ntVar2);
        }
        return null;
    }

    public final b63 e() {
        return (b63) this.b.pollFirst();
    }

    public abstract boolean f();

    @Override // yads.oa0
    public void flush() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            nt ntVar = (nt) this.c.poll();
            int i = mc3.a;
            ntVar.b();
            this.a.add(ntVar);
        }
        nt ntVar2 = this.d;
        if (ntVar2 != null) {
            ntVar2.b();
            this.a.add(ntVar2);
            this.d = null;
        }
    }

    @Override // yads.oa0
    public final void a(a63 a63Var) {
        if (a63Var != this.d) {
            throw new IllegalArgumentException();
        }
        nt ntVar = (nt) a63Var;
        if (ntVar.b(Integer.MIN_VALUE)) {
            ntVar.b();
            this.a.add(ntVar);
        } else {
            long j = this.f;
            this.f = 1 + j;
            ntVar.k = j;
            this.c.add(ntVar);
        }
        this.d = null;
    }

    public final void a(b63 b63Var) {
        b63Var.b = 0;
        b63Var.d = null;
        this.b.add(b63Var);
    }

    @Override // yads.w53
    public final void a(long j) {
        this.e = j;
    }

    @Override // yads.oa0
    public void release() {
    }
}
