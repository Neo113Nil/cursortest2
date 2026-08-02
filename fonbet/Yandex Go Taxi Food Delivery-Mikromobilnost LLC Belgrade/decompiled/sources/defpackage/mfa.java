package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class mfa implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ CharSequence c;

    public /* synthetic */ mfa(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.a = i;
        this.b = charSequence;
        this.c = charSequence2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        g43 g43Var = lr20.c;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    sic a = qic.a(g43Var, x4c.G, btsVar, 0);
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
                    qgy.b(this.b, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar).g.c, null, btsVar, 805309440, 6, 10742);
                    qgy.b(this.c, null, an91.o(c530Var, 0.0f, 1.0f, 0.0f, 0.0f, 13), AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar).h.a, null, btsVar, 805309824, 6, 10738);
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
                    sic a2 = qic.a(g43Var, x4c.H, btsVar2, 48);
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o2 = btsVar2.o();
                    f530 d2 = b.d(btsVar2, c530.a);
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
                    qje.W(btsVar2, d.f, a2);
                    qje.W(btsVar2, d.e, o2);
                    wls wlsVar = d.g;
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                        b64.z(hashCode2, btsVar2, hashCode2, wlsVar);
                    }
                    qje.W(btsVar2, d.d, d2);
                    zgb1.a(this.b, null, 0, false, null, null, false, null, btsVar2, 0, 254);
                    CharSequence charSequence = this.c;
                    if (charSequence == null) {
                        btsVar2.e0(-1573035698);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-1573035697);
                        zgb1.a(charSequence, null, 0, false, null, null, false, null, btsVar2, 0, 254);
                        btsVar2.t(false);
                    }
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
                    m9b1.b(ebp0Var, this.b, null, null, null, 0, 0, this.c, null, null, 0, 0, null, btsVar3, intValue3 & 14, 0, 32638);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            default:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    zgb1.b(this.b, this.c, null, x4c.H, 0, false, null, null, null, null, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 1012);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
        }
    }
}
