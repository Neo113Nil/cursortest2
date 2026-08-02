package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class am50 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;
    public final /* synthetic */ yd00 c;

    public /* synthetic */ am50(sls slsVar, yd00 yd00Var, int i) {
        this.a = i;
        this.b = slsVar;
        this.c = yd00Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        yd00 yd00Var = this.c;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                em50 em50Var = (em50) obj;
                if (!em50Var.equals(cm50.a)) {
                    if (!(em50Var instanceof dm50)) {
                        w511.b();
                        break;
                    } else if (yd00Var != null) {
                        yd00Var.a(((dm50) em50Var).a);
                    }
                } else {
                    slsVar.invoke();
                }
                break;
            default:
                sm50 sm50Var = (sm50) obj;
                if (!sm50Var.equals(qm50.a)) {
                    if (!(sm50Var instanceof rm50)) {
                        w511.b();
                        break;
                    } else if (yd00Var != null) {
                        yd00Var.a(((rm50) sm50Var).a);
                    }
                } else {
                    slsVar.invoke();
                }
                break;
        }
        return null;
    }
}
