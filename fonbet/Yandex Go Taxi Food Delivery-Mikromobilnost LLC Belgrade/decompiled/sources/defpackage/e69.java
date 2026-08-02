package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes10.dex */
public abstract class e69 implements g2v0 {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public c69 d;
    public long e;
    public long f;
    public long g;

    public e69() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new c69());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            e48 e48Var = new e48(14, this);
            d69 d69Var = new d69();
            d69Var.z = e48Var;
            arrayDeque.add(d69Var);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.g2v0
    public final void a(long j) {
        this.e = j;
    }

    public abstract f69 b();

    public abstract void c(c69 c69Var);

    @Override // defpackage.jyg
    public final Object d() {
        d6z.x(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        c69 c69Var = (c69) arrayDeque.pollFirst();
        this.d = c69Var;
        return c69Var;
    }

    @Override // defpackage.jyg
    public final void e(k2v0 k2v0Var) {
        d6z.l(k2v0Var == this.d);
        c69 c69Var = (c69) k2v0Var;
        if (!c69Var.b(4)) {
            long j = c69Var.y;
            if (j != Long.MIN_VALUE) {
                long j2 = this.g;
                if (j2 != -9223372036854775807L && j < j2) {
                    c69Var.d();
                    this.a.add(c69Var);
                    this.d = null;
                }
            }
        }
        long j3 = this.f;
        this.f = 1 + j3;
        c69Var.C = j3;
        this.c.add(c69Var);
        this.d = null;
    }

    @Override // defpackage.jyg
    public final void f(long j) {
        this.g = j;
    }

    @Override // defpackage.jyg
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            c69 c69Var = (c69) arrayDeque2.poll();
            int i = tw21.a;
            c69Var.d();
            arrayDeque.add(c69Var);
        }
        c69 c69Var2 = this.d;
        if (c69Var2 != null) {
            c69Var2.d();
            arrayDeque.add(c69Var2);
            this.d = null;
        }
    }

    @Override // defpackage.jyg
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public l2v0 g() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            c69 c69Var = (c69) arrayDeque2.peek();
            int i = tw21.a;
            if (c69Var.y > this.e) {
                return null;
            }
            c69 c69Var2 = (c69) arrayDeque2.poll();
            boolean b = c69Var2.b(4);
            ArrayDeque arrayDeque3 = this.a;
            if (b) {
                l2v0 l2v0Var = (l2v0) arrayDeque.pollFirst();
                l2v0Var.a(4);
                c69Var2.d();
                arrayDeque3.add(c69Var2);
                return l2v0Var;
            }
            c(c69Var2);
            if (i()) {
                f69 b2 = b();
                l2v0 l2v0Var2 = (l2v0) arrayDeque.pollFirst();
                long j = c69Var2.y;
                l2v0Var2.b = j;
                l2v0Var2.w = b2;
                l2v0Var2.x = j;
                c69Var2.d();
                arrayDeque3.add(c69Var2);
                return l2v0Var2;
            }
            c69Var2.d();
            arrayDeque3.add(c69Var2);
        }
    }

    public abstract boolean i();

    @Override // defpackage.jyg
    public void release() {
    }
}
