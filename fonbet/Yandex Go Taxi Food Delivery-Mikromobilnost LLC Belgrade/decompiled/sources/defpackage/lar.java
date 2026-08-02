package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class lar implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ n611 b;

    public /* synthetic */ lar(n611 n611Var, int i) {
        this.a = i;
        this.b = n611Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        n611 n611Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    f530 m = an91.m(ljs0.m(c530Var, SlotSize.L.getSize()), 0.0f, 4.0f, 1);
                    z910 d = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, m);
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
                    qje.W(btsVar, d.f, d);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d2);
                    xtb1.a(n611Var.c, n611Var.d, Integer.valueOf(rzo.X(tje.n(AppColor$Palette.Text, btsVar))), null, btsVar, 0, 8);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    p9b1.c(ebp0Var, n611Var.a, null, null, xya1.e(btsVar2).g.b, 0, 0, null, null, null, 0, 0, null, btsVar2, intValue2 & 14, 0, 8182);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    ytb1.a(0, btsVar3, null, n611Var.b);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            default:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    f530 b = m4m0.b(ymb1.l(ljs0.m(c530Var, 24.0f), cyk0.a), tje.n(AppColor$Palette.ControlMinor, btsVar4), qke.q);
                    z910 d3 = pi6.d(x4c.y, false);
                    int hashCode2 = Long.hashCode(btsVar4.T);
                    r1b0 o2 = btsVar4.o();
                    f530 d4 = b.d(btsVar4, b);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar4.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar2);
                    } else {
                        btsVar4.r0();
                    }
                    qje.W(btsVar4, d.f, d3);
                    qje.W(btsVar4, d.e, o2);
                    qje.W(btsVar4, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar4, d.h);
                    qje.W(btsVar4, d.d, d4);
                    xtb1.a(n611Var.c, n611Var.d, Integer.valueOf(rzo.X(tje.n(AppColor$Palette.TextMinor, btsVar4))), ljs0.m(c530Var, 16.0f), btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 0);
                    btsVar4.t(true);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
        }
    }
}
