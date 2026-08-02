package xsna;

import java.util.Objects;
import xsna.jms0;
import xsna.o0u;

/* compiled from: ChainingGlShaderProgramListener.java */
/* loaded from: classes12.dex */
public final class nra implements o0u.b, o0u.c {
    public final o0u a;
    public final yes b;
    public final jms0 c;

    public nra(k0u k0uVar, o0u o0uVar, o0u o0uVar2, jms0 jms0Var) {
        fxc0.o(o0uVar, "Creating a self loop in the chain: %s", o0uVar != o0uVar2);
        this.a = o0uVar;
        this.b = new yes(k0uVar, o0uVar2, jms0Var);
        this.c = jms0Var;
    }

    @Override // xsna.o0u.b
    public final synchronized void a() {
        this.b.a();
        jms0 jms0Var = this.c;
        final o0u o0uVar = this.a;
        Objects.requireNonNull(o0uVar);
        jms0Var.f(new jms0.b() { // from class: xsna.mra
            @Override // xsna.jms0.b
            public final void run() {
                o0u.this.flush();
            }
        }, true);
    }

    @Override // xsna.o0u.b
    public final void b(final r0u r0uVar) {
        this.c.f(new jms0.b() { // from class: xsna.lra
            @Override // xsna.jms0.b
            public final void run() {
                nra.this.a.e(r0uVar);
            }
        }, true);
    }

    @Override // xsna.o0u.c
    public final synchronized void c() {
        this.b.d();
    }

    @Override // xsna.o0u.c
    public final synchronized void d(r0u r0uVar, long j) {
        this.b.c(r0uVar, j);
    }

    @Override // xsna.o0u.b
    public final synchronized void e() {
        this.b.e();
    }
}
