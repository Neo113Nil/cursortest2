package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* loaded from: classes10.dex */
public final /* synthetic */ class kre implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ mre b;

    public /* synthetic */ kre(mre mreVar, int i) {
        this.a = i;
        this.b = mreVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        u5t0 u5t0Var;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        mre mreVar = this.b;
        switch (i) {
            case 0:
                LayoutNode P = qje.P(mreVar);
                if (!P.M) {
                    d1y.a(P).requestAutofill(P);
                }
                return zy11Var;
            case 1:
                mreVar.C.h(true);
                break;
            case 2:
                mreVar.C.d(true);
                break;
            case 3:
                mreVar.C.f();
                break;
            case 4:
                LayoutNode P2 = qje.P(mreVar);
                if (!P2.M) {
                    d1y.a(P2).requestAutofill(P2);
                }
                return zy11Var;
            case 5:
                mreVar.C.q();
                break;
            case 6:
                mreVar.x.w.b.r.a(mreVar.D.e);
                break;
            default:
                oay oayVar = mreVar.x;
                yur yurVar = mreVar.E;
                boolean z = mreVar.y;
                if (!oayVar.b()) {
                    yur.b(yurVar);
                } else if (!z && (u5t0Var = oayVar.c) != null) {
                    ((wqh) u5t0Var).b();
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
