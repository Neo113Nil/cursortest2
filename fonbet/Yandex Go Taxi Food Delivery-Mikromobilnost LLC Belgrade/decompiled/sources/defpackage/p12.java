package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes11.dex */
public final /* synthetic */ class p12 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ p12(int i, String str, int i2) {
        this.a = i2;
        this.b = i;
        this.c = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    lhl0 a = khl0.a(new i43(3.0f, true, new quz(11)), x4c.E, btsVar, 54);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    c530 c530Var = c530.a;
                    f530 d = b.d(btsVar, c530Var);
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
                    o4b1.b(vfc.k(i2, 0, -1411607277, btsVar, false), null, c530Var, null, null, 0.0f, null, btsVar, 8, 56);
                    jeb1.f(this.c, null, null, uh6.E(13), 0L, null, null, uh6.E(14), 0, false, 0, 0, null, null, btsVar, 100666368, 0, 32502);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(1 & intValue2, (intValue2 & 17) != 16)) {
                    o4b1.b(mt71.m(i2, 0, btsVar2), this.c, null, null, null, 0.0f, new c36(tje.n(AppColor$Palette.Text, btsVar2), 5), btsVar2, 8, 60);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }
}
