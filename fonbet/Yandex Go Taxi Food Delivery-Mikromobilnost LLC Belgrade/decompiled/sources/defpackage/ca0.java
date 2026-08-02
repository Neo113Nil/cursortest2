package defpackage;

import com.yandex.go.payments.cards.navigation.a;

/* loaded from: classes13.dex */
public final /* synthetic */ class ca0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ erw b;

    public /* synthetic */ ca0(erw erwVar, int i) {
        this.a = i;
        this.b = erwVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        erw erwVar = this.b;
        switch (i) {
            case 0:
                hj8 hj8Var = (hj8) obj;
                hj8Var.a.P(erwVar, true, hj8Var.b);
                break;
            case 1:
                ij8 ij8Var = (ij8) obj;
                ij8Var.a.P(erwVar, false, ij8Var.b);
                break;
            default:
                a aVar = (a) obj;
                lj8 lj8Var = aVar.a;
                m2v m2vVar = ((b90) erwVar).g;
                m2vVar.getClass();
                a90 a90Var = new a90(m2vVar);
                gj8 gj8Var = aVar.b;
                lj8Var.A((m950) lj8Var.D.get(), new ma0(a90Var, gj8Var.b), new hj8(lj8Var, gj8Var));
                break;
        }
        return zy11Var;
    }
}
