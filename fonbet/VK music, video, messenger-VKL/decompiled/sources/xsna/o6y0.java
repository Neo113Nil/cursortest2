package xsna;

import xsna.exy0;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class o6y0 implements ub9.c, exy0.a, yads.ng1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o6y0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        p6y0 p6y0Var = (p6y0) this.b;
        p6y0Var.b.execute(new mxz(p6y0Var, aVar, (vm5) this.c, 2));
        return "setZoomRatio";
    }

    @Override // xsna.exy0.a
    public void b() {
        huy0 huy0Var = (huy0) this.b;
        huy0Var.h.e((xey0) this.c);
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }
}
