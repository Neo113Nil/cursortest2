package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.Locale;

/* loaded from: classes14.dex */
public final /* synthetic */ class lj5 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ h611 b;

    public /* synthetic */ lj5(h611 h611Var, int i) {
        this.a = i;
        this.b = h611Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        h611 h611Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    h6u0.e(h611Var, btsVar, 0);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    f530 m = an91.m(ljs0.m(c530.a, SlotSize.L.getSize()), 0.0f, 4.0f, 1);
                    z910 d = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d2 = b.d(btsVar2, m);
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
                    qje.W(btsVar2, d.f, d);
                    qje.W(btsVar2, d.e, o);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d2);
                    xtb1.a(h611Var.c, h611Var.d, Integer.valueOf(rzo.X(tje.n(AppColor$Palette.Text, btsVar2))), null, btsVar2, 0, 8);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    f530 o2 = an91.o(c530.a, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                    String str = h611Var.a;
                    if (str.length() > 0) {
                        str = ((Object) String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT)) + str.substring(1);
                    }
                    p9b1.c(ebp0Var, str, o2, null, xya1.e(btsVar3).g.b, 0, 0, null, null, null, 0, 0, null, btsVar3, (intValue3 & 14) | 384, 0, 8180);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            default:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(1 & intValue4, (intValue4 & 17) != 16)) {
                    ytb1.a(0, btsVar4, null, h611Var.b);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
        }
    }
}
