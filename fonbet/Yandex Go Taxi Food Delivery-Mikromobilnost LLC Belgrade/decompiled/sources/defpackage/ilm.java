package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.navigator.alt_select.new_summary.a;
import com.yandex.go.navigator.main_screen.o;

/* loaded from: classes12.dex */
public final class ilm implements pf50 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ ilm(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    private final void p1() {
    }

    @Override // defpackage.pf50
    public final void V() {
        int i = this.a;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((mlm) h55Var).R(new fkm(false));
                break;
            case 1:
                ((o) h55Var).R(false);
                break;
            default:
                a aVar = (a) h55Var;
                aVar.S((dg50) aVar.n(), false);
                break;
        }
    }

    @Override // defpackage.pf50
    public final void p0(pv0 pv0Var) {
        int i = this.a;
        wgu0 wgu0Var = wgu0.a;
        int i2 = 1;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ti80 b = dpa1.b(pv0Var);
                Address address = pv0Var.a;
                mlm mlmVar = (mlm) h55Var;
                if (b == null) {
                    mlmVar.S(new gfl0(new o8g0(new b8l0(new uhu0(wgu0Var)), address)));
                    break;
                } else {
                    ((hcc0) ((gcc0) mlmVar.J.get())).b(new xl80(suj.b, b, gg80.b, null, null, false, null, null, null, null, null, null, null, 8152), new llm(mlmVar, address, 0));
                    break;
                }
            case 1:
                ti80 b2 = dpa1.b(pv0Var);
                Address address2 = pv0Var.a;
                o oVar = (o) h55Var;
                if (b2 == null) {
                    oVar.P.e = true;
                    oVar.S(new gfl0(new o8g0(new b8l0(new uhu0(wgu0Var)), address2)));
                    break;
                } else {
                    ((hcc0) ((gcc0) oVar.R.get())).b(new xl80(vuj.b, b2, gg80.b, null, null, false, null, null, null, null, null, null, null, 8152), new llm(oVar, address2, i2));
                    break;
                }
            default:
                a aVar = (a) h55Var;
                aVar.I.p(pv0Var.a);
                aVar.S((dg50) aVar.n(), true);
                break;
        }
    }
}
