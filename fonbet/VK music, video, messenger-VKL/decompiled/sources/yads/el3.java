package yads;

import android.content.Context;
import java.util.List;

/* loaded from: classes10.dex */
public final class el3 {
    public final xv3 a;
    public final q13 b;

    public /* synthetic */ el3(xv3 xv3Var) {
        this(xv3Var, new q13());
    }

    public final dl3 a(Context context, nf3 nf3Var, qg3 qg3Var) {
        wv3 wv3Var;
        al3 al3Var = new al3(context);
        qi3 qi3Var = new qi3(context);
        uy uyVar = new uy();
        uyVar.a.add(new j20(nf3Var.a, al3Var, qi3Var));
        uyVar.a.add(new ph3(nf3Var.b, al3Var));
        kh3 a = this.b.a(nf3Var.a);
        List list = nf3Var.b.n;
        if (this.a.a.a(context)) {
            al3 al3Var2 = new al3(context);
            db2 db2Var = new db2();
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            tv3 tv3Var = tv3.a;
            wv3Var = new wv3(context, qg3Var, a, list, al3Var2, db2Var, cf.a(applicationContext, new gr3(applicationContext)));
        } else {
            wv3Var = null;
        }
        if (wv3Var != null) {
            uyVar.a.add(wv3Var);
        }
        return new dl3(uyVar);
    }

    public el3(xv3 xv3Var, q13 q13Var) {
        this.a = xv3Var;
        this.b = q13Var;
    }
}
