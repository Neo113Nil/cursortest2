package defpackage;

/* loaded from: classes.dex */
public final class c3t0 extends j5u0 {
    public Object c;

    public c3t0(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.j5u0
    public final void a(j5u0 j5u0Var) {
        this.c = ((c3t0) j5u0Var).c;
    }

    @Override // defpackage.j5u0
    public final j5u0 b() {
        return new c3t0(q2t0.j().g(), this.c);
    }

    @Override // defpackage.j5u0
    public final j5u0 c(long j) {
        return new c3t0(q2t0.j().g(), this.c);
    }
}
