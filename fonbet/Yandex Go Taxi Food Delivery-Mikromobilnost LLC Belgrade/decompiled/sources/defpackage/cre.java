package defpackage;

import androidx.compose.foundation.text.HandleState;

/* loaded from: classes10.dex */
public final /* synthetic */ class cre implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ oay b;

    public /* synthetic */ cre(oay oayVar, int i) {
        this.a = i;
        this.b = oayVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oay oayVar = this.b;
        switch (i) {
            case 0:
                rzx rzxVar = (rzx) obj;
                ery0 d = oayVar.d();
                if (d != null) {
                    d.c = rzxVar;
                }
                return zy11Var;
            case 1:
                oz40 oz40Var = oayVar.t;
                hoy0 hoy0Var = (hoy0) obj;
                String str = hoy0Var.a.b;
                kk2 kk2Var = oayVar.j;
                if (!jl40.l(str, kk2Var != null ? kk2Var.b : null)) {
                    oayVar.k.setValue(HandleState.None);
                    if (((Boolean) oz40Var.getValue()).booleanValue()) {
                        oz40Var.setValue(Boolean.FALSE);
                    } else {
                        oayVar.s.setValue(Boolean.FALSE);
                    }
                }
                long j = asy0.b;
                oayVar.A.setValue(new asy0(j));
                oayVar.B.setValue(new asy0(j));
                oayVar.u.invoke(hoy0Var);
                aii0 aii0Var = oayVar.b;
                bii0 bii0Var = aii0Var.a;
                if (bii0Var != null) {
                    bii0Var.a(aii0Var, null);
                }
                return zy11Var;
            case 2:
                oayVar.r.a(((div) obj).a);
                return zy11Var;
            case 3:
                return Boolean.valueOf(oayVar.r.a(((div) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                oayVar.q.setValue(bool);
                return zy11Var;
        }
    }
}
