package defpackage;

/* loaded from: classes.dex */
public final class hwk0 implements dse, ese {
    public static final hwk0 b = new hwk0(0);
    public static final hwk0 c = new hwk0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ hwk0(int i) {
        this.a = i;
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        switch (this.a) {
        }
        return wlsVar.invoke(obj, this);
    }

    @Override // defpackage.fse
    public final dse get(ese eseVar) {
        switch (this.a) {
        }
        return ffx.H(this, eseVar);
    }

    @Override // defpackage.dse
    public final ese getKey() {
        switch (this.a) {
            case 0:
                return b;
            default:
                return this;
        }
    }

    @Override // defpackage.fse
    public final fse minusKey(ese eseVar) {
        switch (this.a) {
        }
        return ffx.Y(this, eseVar);
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        switch (this.a) {
        }
        return cvw.U(this, fseVar);
    }
}
