package xsna;

import java.util.ArrayDeque;
import java.util.Objects;
import xsna.jms0;
import xsna.o0u;

/* compiled from: FrameConsumptionManager.java */
/* loaded from: classes12.dex */
public final class yes implements o0u.b {
    public final k0u a;
    public final o0u b;
    public final jms0 c;
    public final ArrayDeque d = new ArrayDeque();
    public int e;

    public yes(k0u k0uVar, o0u o0uVar, jms0 jms0Var) {
        this.a = k0uVar;
        this.b = o0uVar;
        this.c = jms0Var;
    }

    @Override // xsna.o0u.b
    public final synchronized void a() {
        this.e = 0;
        this.d.clear();
    }

    public final synchronized void c(final r0u r0uVar, final long j) {
        try {
            if (this.e > 0) {
                this.c.f(new jms0.b() { // from class: xsna.xes
                    @Override // xsna.jms0.b
                    public final void run() {
                        yes yesVar = yes.this;
                        yesVar.b.c(yesVar.a, r0uVar, j);
                    }
                }, true);
                this.e--;
            } else {
                this.d.add(new bwo0(r0uVar, j));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            if (this.d.isEmpty()) {
                jms0 jms0Var = this.c;
                o0u o0uVar = this.b;
                Objects.requireNonNull(o0uVar);
                jms0Var.f(new ves(o0uVar), true);
            } else {
                this.d.add(new bwo0(r0u.e, Long.MIN_VALUE));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.o0u.b
    public final synchronized void e() {
        final bwo0 bwo0Var = (bwo0) this.d.poll();
        if (bwo0Var == null) {
            this.e++;
            return;
        }
        this.c.f(new jms0.b() { // from class: xsna.wes
            @Override // xsna.jms0.b
            public final void run() {
                yes yesVar = yes.this;
                o0u o0uVar = yesVar.b;
                k0u k0uVar = yesVar.a;
                bwo0 bwo0Var2 = bwo0Var;
                o0uVar.c(k0uVar, bwo0Var2.a, bwo0Var2.b);
            }
        }, true);
        bwo0 bwo0Var2 = (bwo0) this.d.peek();
        if (bwo0Var2 != null && bwo0Var2.b == Long.MIN_VALUE) {
            jms0 jms0Var = this.c;
            o0u o0uVar = this.b;
            Objects.requireNonNull(o0uVar);
            jms0Var.f(new ves(o0uVar), true);
            this.d.remove();
        }
    }
}
