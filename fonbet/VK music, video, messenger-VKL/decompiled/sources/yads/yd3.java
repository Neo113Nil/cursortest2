package yads;

/* loaded from: classes10.dex */
public final class yd3 implements ug3 {
    public final cl3 a;
    public final lg3 b;
    public final jl3 c;
    public boolean d;

    public yd3(dl3 dl3Var, lg3 lg3Var, jl3 jl3Var) {
        this.a = dl3Var;
        this.b = lg3Var;
        this.c = jl3Var;
    }

    @Override // yads.ug3
    public final void a(long j, long j2) {
        if (this.d || j2 <= 0 || !this.c.a()) {
            return;
        }
        this.d = true;
        this.a.a(this.b.getVolume(), j);
    }

    public /* synthetic */ yd3(il3 il3Var, dl3 dl3Var, lg3 lg3Var) {
        this(dl3Var, lg3Var, new jl3(il3Var));
    }
}
