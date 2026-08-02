package xsna;

import xsna.wl80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class pl80 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pl80(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                wl80.a aVar = (wl80.a) this.d;
                return "LivePlayerImpl.handleBuffering() - closure state= " + wl80.this.G + " buffering= " + this.c;
            case 1:
                ((izs) this.d).invoke(Boolean.valueOf(!this.c));
                return s3q0.a;
            default:
                xvy xvyVar = (xvy) this.d;
                boolean z = this.c;
                xuy xuyVar = (xuy) j5g.k0(xvyVar.j().f());
                return Boolean.valueOf(xuyVar != null && z && xuyVar.getIndex() >= xvyVar.j().d() + (-5));
        }
    }
}
