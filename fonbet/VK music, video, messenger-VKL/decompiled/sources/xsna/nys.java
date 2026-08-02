package xsna;

/* compiled from: FullscreenOnboardingStepScope.kt */
/* loaded from: classes17.dex */
public final class nys implements lds0 {
    public final /* synthetic */ wh50<Boolean> a;
    public final /* synthetic */ wh50<Boolean> b;
    public final /* synthetic */ oys c;
    public final /* synthetic */ wh50<Boolean> d;

    public nys(wh50<Boolean> wh50Var, wh50<Boolean> wh50Var2, oys oysVar, wh50<Boolean> wh50Var3) {
        this.a = wh50Var;
        this.b = wh50Var2;
        this.c = oysVar;
        this.d = wh50Var3;
    }

    @Override // xsna.lds0
    public final void E() {
        this.a.setValue(Boolean.FALSE);
        this.b.setValue(Boolean.TRUE);
    }

    @Override // xsna.lds0
    public final void g() {
        this.b.setValue(Boolean.TRUE);
    }

    @Override // xsna.lds0
    public final void onComplete() {
        ((zak0) this.c.c).setValue(Boolean.TRUE);
    }

    @Override // xsna.lds0
    public final void onError() {
        this.a.setValue(Boolean.TRUE);
        this.b.setValue(Boolean.FALSE);
    }

    @Override // xsna.lds0
    public final void onFirstFrameRendered() {
        Boolean bool = Boolean.FALSE;
        this.a.setValue(bool);
        this.b.setValue(bool);
    }

    @Override // xsna.lds0
    public final void onIsPlayingChanged(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }
}
