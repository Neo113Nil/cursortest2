package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import ru.yandex.taxi.masstransit.geopayment.purchase.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class hu30 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ sls c;

    public /* synthetic */ hu30(tls tlsVar, sls slsVar, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = slsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    c530 c530Var = c530.a;
                    f530 o = an91.o(ljs0.c(c530Var, 1.0f), 8.0f, 0.0f, 8.0f, 8.0f, 2);
                    lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    f530 d = b.d(btsVar, o);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar2);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o2);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d);
                    boolean k = btsVar.k(tlsVar) | btsVar.k(slsVar);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new ssm(tlsVar, slsVar, 1);
                        btsVar.o0(Q);
                    }
                    vpa1.a(c530Var, false, ButtonSize.M, (sls) Q, wwg.S(367939781, false, ju30.a, btsVar), btsVar, 24960, 2);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                ku30 ku30Var = (ku30) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ku30Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    a.a(ku30Var, tlsVar, slsVar, btsVar2, (intValue2 << 3) & 112);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }
}
