package xsna;

/* compiled from: ClipsOwnerSwipeReducer.kt */
/* loaded from: classes17.dex */
public final class ape extends dm50<fpe, epe, voe> {
    public final woe d;
    public final gpe e;

    public ape(voe voeVar, woe woeVar, gpe gpeVar) {
        super(voeVar);
        this.d = woeVar;
        this.e = gpeVar;
    }

    @Override // xsna.dm50
    public final voe c(voe voeVar, epe epeVar) {
        return this.d.a(voeVar, epeVar);
    }

    @Override // xsna.dm50
    public final fpe d() {
        return new fpe(e(new iz(this, 26)));
    }

    @Override // xsna.dm50
    public final void h(voe voeVar, fpe fpeVar) {
        f(fpeVar.a, voeVar);
    }
}
