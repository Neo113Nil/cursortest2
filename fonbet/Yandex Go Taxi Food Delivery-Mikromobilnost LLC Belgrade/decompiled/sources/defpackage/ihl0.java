package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.slot.body.BodyAlign;

/* loaded from: classes11.dex */
public final /* synthetic */ class ihl0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ dme b;

    public /* synthetic */ ihl0(dme dmeVar, int i) {
        this.a = i;
        this.b = dmeVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        dme dmeVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    so5 so5Var = x4c.H;
                    f530 m = an91.m(c530Var, 0.0f, 12.0f, 1);
                    sic a = qic.a(lr20.c, so5Var, btsVar, 48);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, m);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d);
                    jrb1.a(vfc.j(so5Var, ljs0.m(c530Var, 20.0f)), dmeVar.d, dmeVar.e, btsVar, 0);
                    jeb1.f(krb1.b(dmeVar.b, btsVar), an91.m(new ypu(so5Var), 6.0f, 0.0f, 2), null, uh6.K(16.0f, 4294967296L), 0L, null, new sjy0(3), 0L, 2, false, 1, 0, null, xya1.e(btsVar).g.b, btsVar, 805306368, 48, 13684);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    jrb1.a(an91.k(ljs0.m(c530Var, 56.0f), 18.0f), dmeVar.d, dmeVar.e, btsVar2, 6);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            default:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    p9b1.c(ebp0Var, krb1.b(dmeVar.b, btsVar3), null, null, ety0.a(xya1.e(btsVar3).g.b, 0L, uh6.K(16.0f, 4294967296L), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), 0, 0, null, null, null, 0, 0, BodyAlign.Start, btsVar3, intValue3 & 14, 384, 6134);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
        }
    }
}
