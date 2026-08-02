package xsna;

/* compiled from: StoryEditorStateStoreImpl.kt */
/* loaded from: classes16.dex */
public final class z1m0 implements x1m0, y1m0 {
    public tam0 a;

    @Override // xsna.y1m0
    public final Boolean a() {
        tam0 tam0Var = this.a;
        if (tam0Var != null) {
            return Boolean.valueOf(tam0Var.m);
        }
        return null;
    }

    @Override // xsna.y1m0
    public final Boolean b() {
        tam0 tam0Var = this.a;
        if (tam0Var != null) {
            return Boolean.valueOf(tam0Var.g);
        }
        return null;
    }

    @Override // xsna.x1m0
    public final void c(tam0 tam0Var) {
        this.a = tam0Var;
    }

    @Override // xsna.y1m0
    public final void clear() {
        this.a = null;
    }
}
