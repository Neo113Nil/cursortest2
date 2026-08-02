package defpackage;

/* loaded from: classes13.dex */
public final class pxf0 implements gnp0 {
    public final String a;
    public final tse b;
    public final gnp0 c;
    public final fwf0 d;

    public pxf0(String str, tse tseVar, gnp0 gnp0Var, gnp0 gnp0Var2) {
        this.a = str;
        this.b = tseVar;
        this.c = gnp0Var;
        this.d = new fwf0(gnp0Var, gnp0Var2);
    }

    @Override // defpackage.gnp0
    public final hnp0 a(inp0 inp0Var) {
        fwf0 fwf0Var = this.d;
        hnp0 a = fwf0Var.a(inp0Var);
        if (inp0Var == kop0.a && (a instanceof qxf0)) {
            return new qxf0();
        }
        if (inp0Var == lop0.a && (a instanceof rxf0)) {
            return new rxf0();
        }
        if (inp0Var != qsp0.a || !(a instanceof sxf0)) {
            return a;
        }
        return new sxf0();
    }
}
