package yads;

/* loaded from: classes10.dex */
public final class nd3 implements ug3 {
    public final nf3 a;
    public final cl3 b;
    public final eg3 c;
    public final jl3 d;
    public boolean e;

    public nd3(nf3 nf3Var, dl3 dl3Var, eg3 eg3Var, jl3 jl3Var) {
        this.a = nf3Var;
        this.b = dl3Var;
        this.c = eg3Var;
        this.d = jl3Var;
    }

    @Override // yads.ug3
    public final void a(long j, long j2) {
        if (this.e || j2 <= 0 || !this.d.a()) {
            return;
        }
        this.e = true;
        this.b.h();
        this.c.f(this.a);
    }

    public /* synthetic */ nd3(nf3 nf3Var, il3 il3Var, dl3 dl3Var, eg3 eg3Var) {
        this(nf3Var, dl3Var, eg3Var, new jl3(il3Var));
    }
}
