package defpackage;

import androidx.compose.ui.semantics.f;

/* loaded from: classes11.dex */
public final /* synthetic */ class kp1 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ sls c;

    public /* synthetic */ kp1(String str, sls slsVar, int i) {
        this.a = i;
        this.b = str;
        this.c = slsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.c;
        String str = this.b;
        mnq0 mnq0Var = (mnq0) obj;
        switch (i) {
            case 0:
                f.l(mnq0Var, str);
                f.p(mnq0Var, 0);
                f.f(mnq0Var, null, new jc0(8, slsVar));
                break;
            case 1:
                f.w(mnq0Var, 1.0f);
                f.l(mnq0Var, str);
                f.f(mnq0Var, null, new zvr(8, slsVar));
                break;
            case 2:
                f.l(mnq0Var, str);
                f.f(mnq0Var, str, new zvr(15, slsVar));
                break;
            default:
                f.p(mnq0Var, 0);
                f.l(mnq0Var, str);
                f.f(mnq0Var, null, new n7l0(19, slsVar));
                break;
        }
        return zy11Var;
    }
}
