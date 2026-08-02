package xsna;

/* compiled from: FrameLoaderStrategy.kt */
/* loaded from: classes12.dex */
public final class lfs implements tqo {
    public final int a;
    public final /* synthetic */ mfs b;

    public lfs(mfs mfsVar) {
        this.b = mfsVar;
        this.a = mfsVar.i;
    }

    @Override // xsna.tqo
    public final int a() {
        return this.b.j;
    }

    @Override // xsna.tqo
    public final int b() {
        return this.a;
    }

    @Override // xsna.tqo
    public final void c(int i) {
        mfs mfsVar = this.b;
        if (i != mfsVar.j) {
            mfsVar.j = swe0.g(i, 1, mfsVar.i);
            jfs f = mfsVar.f();
            if (f != null) {
                f.a(mfsVar.j);
            }
        }
    }
}
