package yads;

/* loaded from: classes10.dex */
public final class de0 implements al1 {
    public final n43 b;
    public final ce0 c;
    public ro d;
    public al1 e;
    public boolean f = true;
    public boolean g;

    public de0(ce0 ce0Var, j63 j63Var) {
        this.c = ce0Var;
        this.b = new n43(j63Var);
    }

    @Override // yads.al1
    public final long a() {
        if (this.f) {
            return this.b.a();
        }
        al1 al1Var = this.e;
        al1Var.getClass();
        return al1Var.a();
    }

    @Override // yads.al1
    public final ff2 getPlaybackParameters() {
        al1 al1Var = this.e;
        return al1Var != null ? al1Var.getPlaybackParameters() : this.b.f;
    }

    @Override // yads.al1
    public final void a(ff2 ff2Var) {
        al1 al1Var = this.e;
        if (al1Var != null) {
            al1Var.a(ff2Var);
            ff2Var = this.e.getPlaybackParameters();
        }
        this.b.a(ff2Var);
    }
}
