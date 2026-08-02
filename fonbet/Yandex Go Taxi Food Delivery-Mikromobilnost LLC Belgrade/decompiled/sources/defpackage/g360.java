package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class g360 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d360 b;
    public final /* synthetic */ wls c;

    public /* synthetic */ g360(d360 d360Var, wls wlsVar, int i) {
        this.a = i;
        this.b = d360Var;
        this.c = wlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wls wlsVar = this.c;
        d360 d360Var = this.b;
        switch (i) {
            case 0:
                y260 y260Var = d360Var.e;
                if (y260Var != null) {
                    wlsVar.invoke(y260Var, d360Var.f);
                    break;
                }
                break;
            case 1:
                y260 y260Var2 = d360Var.e;
                if (y260Var2 != null) {
                    wlsVar.invoke(y260Var2, d360Var.f);
                    break;
                }
                break;
            default:
                y260 y260Var3 = d360Var.e;
                if (y260Var3 != null) {
                    wlsVar.invoke(y260Var3, d360Var.f);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
