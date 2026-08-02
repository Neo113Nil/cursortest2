package defpackage;

import androidx.compose.ui.semantics.f;

/* loaded from: classes6.dex */
public final /* synthetic */ class niu0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ s611 b;
    public final /* synthetic */ sls c;

    public /* synthetic */ niu0(s611 s611Var, sls slsVar, int i) {
        this.a = i;
        this.b = s611Var;
        this.c = slsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.c;
        s611 s611Var = this.b;
        mnq0 mnq0Var = (mnq0) obj;
        switch (i) {
            case 0:
                f.l(mnq0Var, s611Var.e);
                String str = s611Var.f;
                if (str != null) {
                    f.p(mnq0Var, 0);
                    f.f(mnq0Var, str, new n7l0(11, slsVar));
                    break;
                }
                break;
            default:
                String str2 = s611Var.f;
                if (str2 != null) {
                    f.f(mnq0Var, str2, new n7l0(10, slsVar));
                }
                f.l(mnq0Var, s611Var.e);
                break;
        }
        return zy11Var;
    }
}
