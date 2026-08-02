package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.masstransit.design.compose.route.Ellipse$Size;

/* loaded from: classes11.dex */
public final /* synthetic */ class lt01 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d711 b;

    public /* synthetic */ lt01(d711 d711Var, int i) {
        this.a = i;
        this.b = d711Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        d711 d711Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    f530 q = ljs0.q(c530Var, SlotSize.L.getSize());
                    z910 d = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, q);
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
                    d711Var.getClass();
                    xtb1.a(null, d711Var.d, null, null, btsVar, 0, 12);
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
                    sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o2 = btsVar2.o();
                    c530 c530Var2 = c530.a;
                    f530 d3 = b.d(btsVar2, c530Var2);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar2);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, a);
                    qje.W(btsVar2, d.e, o2);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d3);
                    String str = d711Var.a;
                    ety0 ety0Var = xya1.e(btsVar2).g.b;
                    AppColor$Palette appColor$Palette = AppColor$Palette.Text;
                    jeb1.f(str, null, appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar2, 384, 0, 16378);
                    qgy.b(d711Var.b, null, an91.m(c530Var2, 0.0f, 2.0f, 1), appColor$Palette, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).h.b, null, btsVar2, 3456, 0, 12274);
                    CharSequence charSequence = d711Var.e;
                    if (charSequence == null) {
                        btsVar2.e0(1379965508);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(1379965509);
                        qgy.b(charSequence, null, an91.o(c530Var2, 0.0f, 6.0f, 0.0f, 2.0f, 5), null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).h.b, null, btsVar2, 0, 0, 12282);
                        btsVar2.t(false);
                    }
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    ytb1.a(0, btsVar3, null, d711Var.c);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            default:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    f530 b = ljs0.b(c530Var, 0.0f, SlotSize.XS.getSize(), 1);
                    Ellipse$Size ellipse$Size = Ellipse$Size.BIG;
                    d711Var.getClass();
                    qb91.a(b, new zrm(6, ellipse$Size, qb91.b(f911.a)), 0.0f, Float.valueOf(4.0f), new ldc(ldc.f), btsVar4, 221248, 76);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
        }
    }
}
