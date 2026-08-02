package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class gd90 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gd90(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                xvy xvyVar = (xvy) this.d;
                xuy xuyVar = (xuy) j5g.k0(xvyVar.j().f());
                return Boolean.valueOf((xuyVar != null ? xuyVar.getIndex() : Integer.MIN_VALUE) >= xvyVar.j().d() - this.c);
            default:
                ((opl0) this.d).notifyItemChanged(this.c);
                return s3q0.a;
        }
    }
}
