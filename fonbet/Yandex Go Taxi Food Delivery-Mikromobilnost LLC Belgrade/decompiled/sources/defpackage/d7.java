package defpackage;

/* loaded from: classes9.dex */
public abstract class d7 implements dse {
    private final ese key;

    public d7(ese eseVar) {
        this.key = eseVar;
    }

    @Override // defpackage.fse
    public <R> R fold(R r, wls wlsVar) {
        return (R) wlsVar.invoke(r, this);
    }

    @Override // defpackage.fse
    public /* bridge */ <E extends dse> E get(ese eseVar) {
        return (E) ffx.H(this, eseVar);
    }

    @Override // defpackage.dse
    public ese getKey() {
        return this.key;
    }

    @Override // defpackage.fse
    public /* bridge */ fse minusKey(ese eseVar) {
        return ffx.Y(this, eseVar);
    }

    @Override // defpackage.fse
    public fse plus(fse fseVar) {
        return cvw.U(this, fseVar);
    }
}
