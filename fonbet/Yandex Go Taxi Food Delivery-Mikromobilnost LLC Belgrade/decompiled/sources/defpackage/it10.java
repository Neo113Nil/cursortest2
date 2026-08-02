package defpackage;

import com.yandex.messaging.internal.view.custom.ProgressIndicator$Companion$State;

/* loaded from: classes15.dex */
public final /* synthetic */ class it10 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ mt10 b;

    public /* synthetic */ it10(mt10 mt10Var, int i) {
        this.a = i;
        this.b = mt10Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        mt10 mt10Var = this.b;
        switch (i) {
            case 0:
                mt10Var.u = (mav) obj;
                mt10Var.c();
                break;
            case 1:
                mt10Var.r = true;
                mt10Var.c();
                break;
            case 2:
                int i2 = lt10.a[((ProgressIndicator$Companion$State) obj).ordinal()];
                if (i2 == 1) {
                    mt10Var.a.callOnClick();
                    break;
                } else if (i2 == 2) {
                    kt10 kt10Var = mt10Var.m;
                    if (kt10Var != null) {
                        mt10Var.c.f(kt10Var.a);
                    }
                    pzt0 pzt0Var = mt10Var.n;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    mt10Var.n = null;
                    pzt0 pzt0Var2 = mt10Var.p;
                    if (pzt0Var2 != null) {
                        pzt0Var2.a(null);
                    }
                    mt10Var.p = null;
                    if (!((Boolean) mt10Var.e.invoke()).booleanValue()) {
                        mt10Var.c();
                        break;
                    }
                } else if (i2 == 3) {
                    kt10 kt10Var2 = mt10Var.m;
                    if (kt10Var2 != null) {
                        mt10Var.d(kt10Var2, true);
                        break;
                    }
                } else if (i2 == 4) {
                    kt10 kt10Var3 = mt10Var.m;
                    if (kt10Var3 != null) {
                        mt10Var.d(kt10Var3, true);
                        break;
                    }
                } else if (i2 != 5) {
                    w511.b();
                    break;
                }
                break;
            default:
                mt10Var.u = (mav) obj;
                mt10Var.c();
                break;
        }
        return zy11Var;
    }
}
