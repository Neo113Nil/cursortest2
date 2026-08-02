package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class i5j0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ if2 c;

    public /* synthetic */ i5j0(if2 if2Var, int i) {
        this.b = i;
        this.c = if2Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        tdu tduVar = (tdu) obj;
        switch (this.b) {
            case 0:
                if2 if2Var = this.c;
                tduVar.g(((Number) if2Var.d()).floatValue());
                tduVar.h(((Number) if2Var.d()).floatValue());
                break;
            default:
                if2 if2Var2 = this.c;
                tduVar.A(((Number) if2Var2.d()).floatValue());
                tduVar.B(((Number) if2Var2.d()).floatValue());
                tduVar.Y0(f370.i(0.5f, 1.0f));
                break;
        }
        return s3q0.a;
    }
}
