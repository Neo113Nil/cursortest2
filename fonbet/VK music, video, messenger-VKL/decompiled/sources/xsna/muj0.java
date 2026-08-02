package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class muj0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ muj0(int i, int i2, int i3, Object obj) {
        this.b = i3;
        this.e = obj;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ouj0.this.d.c(this.c, this.d);
                break;
            default:
                ((vxq0) this.e).n().a.n.j(this.c, this.d, null);
                break;
        }
    }
}
