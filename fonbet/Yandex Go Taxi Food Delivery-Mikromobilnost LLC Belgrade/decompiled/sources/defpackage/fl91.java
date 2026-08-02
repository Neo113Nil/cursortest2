package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes11.dex */
public final class fl91 extends yta1 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public fl91(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.yta1
    public final el91 f(ql91 ql91Var) {
        return (el91) this.d.getAndSet(ql91Var, el91.d);
    }

    @Override // defpackage.yta1
    public final ll91 g(ql91 ql91Var) {
        return (ll91) this.c.getAndSet(ql91Var, ll91.c);
    }

    @Override // defpackage.yta1
    public final void h(ll91 ll91Var, ll91 ll91Var2) {
        this.b.lazySet(ll91Var, ll91Var2);
    }

    @Override // defpackage.yta1
    public final void i(ll91 ll91Var, Thread thread) {
        this.a.lazySet(ll91Var, thread);
    }

    @Override // defpackage.yta1
    public final boolean j(ql91 ql91Var, el91 el91Var, el91 el91Var2) {
        return cua1.f(this.d, ql91Var, el91Var, el91Var2);
    }

    @Override // defpackage.yta1
    public final boolean k(ql91 ql91Var, Object obj, Object obj2) {
        return cua1.f(this.e, ql91Var, obj, obj2);
    }

    @Override // defpackage.yta1
    public final boolean l(ql91 ql91Var, ll91 ll91Var, ll91 ll91Var2) {
        return cua1.f(this.c, ql91Var, ll91Var, ll91Var2);
    }
}
