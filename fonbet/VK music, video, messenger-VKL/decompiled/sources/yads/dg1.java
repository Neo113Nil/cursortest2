package yads;

import kotlin.coroutines.EmptyCoroutineContext;
import xsna.fl40;
import xsna.myc0;

/* loaded from: classes10.dex */
public final class dg1 {
    public final gf1 a;
    public final sf1 b;

    public dg1(gf1 gf1Var, sf1 sf1Var) {
        this.a = gf1Var;
        this.b = sf1Var;
    }

    public static final String b(dg1 dg1Var) {
        return (String) myc0.i(EmptyCoroutineContext.b, new bg1(dg1Var, null));
    }

    public final void a(ix1 ix1Var) {
        n11 n11Var = new n11(ix1Var, dt2.b());
        n11Var.c = new vt2("lightBundle.js", new fl40(this, 13));
        ix1Var.setWebViewClient(n11Var);
        ix1Var.setHtmlWebViewListener(new cg1(this, ix1Var));
    }
}
