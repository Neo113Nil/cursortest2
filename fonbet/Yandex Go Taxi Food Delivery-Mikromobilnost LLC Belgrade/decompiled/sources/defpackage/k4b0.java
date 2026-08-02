package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes13.dex */
public final /* synthetic */ class k4b0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4b0 b;

    public /* synthetic */ k4b0(v4b0 v4b0Var, int i) {
        this.a = i;
        this.b = v4b0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c530 c530Var = c530.a;
        v4b0 v4b0Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    jeb1.f(v4b0Var.d, pfb1.b(c530Var, v4b0Var.f, 14), AppColor$Palette.TextOnControl, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.b, btsVar, 384, 0, 16376);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
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
                    oeb1.c(btsVar2, ljs0.e(c530Var, 20.0f));
                    jeb1.f(v4b0Var.a, an91.m(c530Var, 16.0f, 0.0f, 2), null, uh6.E(30), 0L, null, null, 0L, 0, false, 0, 0, null, xya1.b(btsVar2).e, btsVar2, 3120, 0, 16372);
                    oeb1.c(btsVar2, ljs0.e(c530Var, 12.0f));
                    jeb1.f(v4b0Var.b, an91.m(c530Var, 16.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).g.a, btsVar2, 48, 0, 16380);
                    ly3.B(c530Var, 16.0f, btsVar2, true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }
}
