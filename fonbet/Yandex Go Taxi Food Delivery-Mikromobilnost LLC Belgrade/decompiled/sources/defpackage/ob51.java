package defpackage;

/* loaded from: classes10.dex */
public abstract class ob51 extends ekd {
    public final uf10 D;

    public ob51(uf10 uf10Var) {
        this.D = uf10Var;
    }

    @Override // defpackage.c45
    public final void e(cj01 cj01Var) {
        this.C = cj01Var;
        this.B = tw21.n(null);
        s();
    }

    @Override // defpackage.uf10
    public final a9z0 getInitialTimeline() {
        return this.D.getInitialTimeline();
    }

    @Override // defpackage.uf10
    public final fe10 getMediaItem() {
        return this.D.getMediaItem();
    }

    @Override // defpackage.ekd
    public final sf10 h(Object obj, sf10 sf10Var) {
        return n(sf10Var);
    }

    @Override // defpackage.ekd
    public final long i(long j, Object obj) {
        return j;
    }

    @Override // defpackage.uf10
    public final boolean isSingleWindow() {
        return this.D.isSingleWindow();
    }

    @Override // defpackage.ekd
    public final int j(int i, Object obj) {
        return i;
    }

    @Override // defpackage.ekd
    public final void k(Object obj, uf10 uf10Var, a9z0 a9z0Var) {
        q(a9z0Var);
    }

    public sf10 n(sf10 sf10Var) {
        return sf10Var;
    }

    public abstract void q(a9z0 a9z0Var);

    public final void r() {
        l(null, this.D);
    }

    public void s() {
        r();
    }

    @Override // defpackage.uf10
    public void updateMediaItem(fe10 fe10Var) {
        this.D.updateMediaItem(fe10Var);
    }
}
