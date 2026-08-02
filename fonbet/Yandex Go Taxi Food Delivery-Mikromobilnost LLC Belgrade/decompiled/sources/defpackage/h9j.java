package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.List;

/* loaded from: classes5.dex */
public final class h9j implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ h9j(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4 = this.a;
        zy11 zy11Var = zy11.a;
        List list = this.b;
        switch (i4) {
            case 0:
                u4y u4yVar = (u4y) obj;
                int intValue = ((Number) obj2).intValue();
                fid fidVar = (fid) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((bts) fidVar).k(u4yVar) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= fidVar.c(intValue) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(i & 1, (i & 147) != 146)) {
                    m9j m9jVar = (m9j) list.get(intValue);
                    btsVar.e0(-859227691);
                    AppColor$Palette appColor$Palette = AppColor$Palette.BgMinor;
                    byk0 byk0Var = cyk0.a;
                    c530 c530Var = c530.a;
                    f530 l = an91.l(ymb1.l(bzk0.c(c530Var, appColor$Palette, byk0Var), byk0Var), 8.0f, 4.0f);
                    lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.E, btsVar, 54);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, l);
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
                    v0b1.a(mja1.a(m9jVar.c, null, 6), ljs0.m(c530Var, 24.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 48, 1020);
                    jeb1.f(m9jVar.b, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 0, 0, 16382);
                    btsVar.t(true);
                    btsVar.t(false);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                u4y u4yVar2 = (u4y) obj;
                int intValue3 = ((Number) obj2).intValue();
                fid fidVar2 = (fid) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((bts) fidVar2).k(u4yVar2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= fidVar2.c(intValue3) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
                    l5f l5fVar = (l5f) list.get(intValue3);
                    btsVar2.e0(-1266272650);
                    msa1.d(l5fVar, btsVar2, 0);
                    btsVar2.t(false);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            default:
                u4y u4yVar3 = (u4y) obj;
                int intValue5 = ((Number) obj2).intValue();
                fid fidVar3 = (fid) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((bts) fidVar3).k(u4yVar3) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= fidVar3.c(intValue5) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(i3 & 1, (i3 & 147) != 146)) {
                    lxd lxdVar = (lxd) list.get(intValue5);
                    btsVar3.e0(1935344985);
                    spb1.b(lxdVar, btsVar3, 0);
                    btsVar3.t(false);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
        }
    }
}
