package defpackage;

import android.app.Activity;
import android.os.Looper;

/* loaded from: classes15.dex */
public final /* synthetic */ class co3 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ do3 b;

    public /* synthetic */ co3(do3 do3Var, int i) {
        this.a = i;
        this.b = do3Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        do3 do3Var = this.b;
        switch (i) {
            case 0:
                ccg ccgVar = (ccg) ((kt11) obj);
                ccg ccgVar2 = ccgVar.b;
                Activity activity = do3Var.b;
                activity.getClass();
                do3Var.H = new vbb(ccgVar2, activity, false);
                jn3 x = ccgVar.a.x();
                q5z.h(x);
                e1k d = x.d(do3Var);
                qp3 qp3Var = do3Var.D;
                kgx[] kgxVarArr = do3.I;
                kgx kgxVar = kgxVarArr[1];
                qp3Var.b(d);
                p8g p8gVar = (p8g) ccgVar.a.b;
                uti0 uti0Var = new uti0(new tig0(i5m.a(p8gVar.l0), (Looper) p8gVar.b.d.get()), new quz(16));
                qp3 qp3Var2 = do3Var.E;
                kgx kgxVar2 = kgxVarArr[2];
                qp3Var2.b(uti0Var);
                dzj0 dzj0Var = do3Var.G;
                if (dzj0Var != null) {
                    do3Var.G = null;
                    if (do3Var.B) {
                        do3Var.onActivityResult(dzj0Var.a, dzj0Var.b, dzj0Var.c);
                        break;
                    }
                }
                break;
            default:
                un90 un90Var = (un90) obj;
                if (un90Var == null) {
                    do3Var.s();
                    break;
                } else {
                    do3Var.B = true;
                    do3Var.w.a(new v5(20, un90Var, do3Var));
                    break;
                }
        }
        return zy11Var;
    }
}
