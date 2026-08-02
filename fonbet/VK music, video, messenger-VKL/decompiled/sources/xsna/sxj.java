package xsna;

/* compiled from: CounterPresenter.java */
/* loaded from: classes3.dex */
public final class sxj implements jxj {
    public liz b;

    @Override // xsna.jxj
    public final void cancel() {
        liz lizVar = this.b;
        if (lizVar != null) {
            lizVar.F();
        }
    }

    @Override // xsna.pk6
    public final void release() {
        this.b = null;
    }

    @Override // xsna.pk6
    public final void pause() {
    }

    @Override // xsna.pk6
    public final void resume() {
    }

    @Override // xsna.pk6
    public final void start() {
    }
}
