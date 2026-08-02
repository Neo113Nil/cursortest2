package defpackage;

/* loaded from: classes9.dex */
public final class ens0 implements ese, dse {
    public static final ens0 a = new ens0();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ens0);
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this);
    }

    @Override // defpackage.fse
    public final /* bridge */ dse get(ese eseVar) {
        return ffx.H(this, eseVar);
    }

    @Override // defpackage.dse
    public final ese getKey() {
        return this;
    }

    public final int hashCode() {
        return 1581170831;
    }

    @Override // defpackage.fse
    public final /* bridge */ fse minusKey(ese eseVar) {
        return ffx.Y(this, eseVar);
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        return cvw.U(this, fseVar);
    }

    public final String toString() {
        return "SkipThreadSwitch";
    }
}
