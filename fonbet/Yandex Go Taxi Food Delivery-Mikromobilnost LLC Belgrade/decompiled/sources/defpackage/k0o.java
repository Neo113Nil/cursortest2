package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.masstransit.design.compose.route.Ellipse$Size;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class k0o implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ m611 b;

    public /* synthetic */ k0o(m611 m611Var, int i) {
        this.a = i;
        this.b = m611Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        m611 m611Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    qb91.a(ljs0.b(ljs0.q(c530Var, SlotSize.L.getSize()), 0.0f, SlotSize.XS.getSize(), 1), new zrm(6, Ellipse$Size.BIG, qb91.b(m611Var.g)), 0.0f, null, null, btsVar, 64, HProv.PP_SAME_MEDIA);
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
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d = b.d(btsVar2, c530Var);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, a);
                    qje.W(btsVar2, d.e, o);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d);
                    qgy.b(m611Var.a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).g.b, null, btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                    CharSequence charSequence = m611Var.b;
                    if (charSequence == null) {
                        btsVar2.e0(678094722);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(678094723);
                        peb1.b(charSequence, an91.m(c530Var, 0.0f, 2.0f, 1), 3, 0, btsVar2, 3504, 16);
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
                    ytb1.a(0, btsVar3, null, m611Var.c);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            default:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    qb91.a(ljs0.b(c530Var, 0.0f, SlotSize.XS.getSize(), 1), new zrm(6, Ellipse$Size.BIG, qb91.b(m611Var.g)), 0.0f, Float.valueOf(4.0f), new ldc(ldc.f), btsVar4, 221248, 76);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
        }
    }
}
