package yads;

/* loaded from: classes10.dex */
public final class uy0 implements qy0 {
    public final af1 a;
    public final kz b;

    public uy0(af1 af1Var, kz kzVar) {
        this.a = af1Var;
        this.b = kzVar;
    }

    @Override // yads.qy0
    public final void c() {
        if (this.a.a()) {
            return;
        }
        this.b.e();
    }

    @Override // yads.qy0
    public final void invalidate() {
        this.a.b();
    }
}
