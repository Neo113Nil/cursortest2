package defpackage;

import androidx.compose.ui.semantics.a;
import androidx.compose.ui.semantics.f;

/* loaded from: classes3.dex */
public final /* synthetic */ class j4j implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ sls b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ j4j(sls slsVar, boolean z) {
        this.b = slsVar;
        this.c = z;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = this.c;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                mnq0 mnq0Var = (mnq0) obj;
                if (!z) {
                    jc0 jc0Var = new jc0(21, slsVar);
                    kgx[] kgxVarArr = f.a;
                    mnq0Var.a(a.t, new ag(null, jc0Var));
                    break;
                } else {
                    jc0 jc0Var2 = new jc0(23, slsVar);
                    kgx[] kgxVarArr2 = f.a;
                    mnq0Var.a(a.u, new ag(null, jc0Var2));
                    break;
                }
            default:
                n70 n70Var = (n70) obj;
                n70Var.W(new q70(n70Var, slsVar, 1));
                n70Var.a0(new zo1(z, n70Var, 13));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ j4j(boolean z, sls slsVar) {
        this.c = z;
        this.b = slsVar;
    }
}
