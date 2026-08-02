package defpackage;

import androidx.compose.animation.g;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class i0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ i0(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        tic ticVar;
        boolean z;
        boolean z2;
        int i = this.a;
        String str = this.b;
        f43 f43Var = lr20.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    c530 c530Var = c530.a;
                    f530 m = an91.m(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 2);
                    lhl0 a = khl0.a(f43Var, x4c.E, btsVar, 48);
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
                    if (str != null) {
                        btsVar.e0(-1447429656);
                        v0b1.a(mja1.a(str, null, 6), ljs0.m(an91.o(c530Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), 24.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 48, 1020);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1447196660);
                        btsVar.t(false);
                    }
                    jeb1.f(this.c, an91.m(ljs0.c(c530Var, 1.0f), 0.0f, 11.0f, 1), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar, 48, 0, 16380);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                tic ticVar2 = (tic) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ticVar2) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (str.length() > 0) {
                        ticVar = ticVar2;
                        z = true;
                    } else {
                        ticVar = ticVar2;
                        z = false;
                    }
                    g.b(ticVar, z, null, null, null, null, wwg.S(-1553636974, true, new i0(this.c, str, 0), btsVar2), btsVar2, (intValue2 & 14) | 1572864, 30);
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
                    p9b1.c(ebp0Var, this.b, null, null, null, 0, 0, this.c, null, null, 0, 0, null, btsVar3, intValue3 & 14, 0, 8126);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                boolean V = btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16);
                dmw0 dmw0Var = btsVar4.a;
                if (V) {
                    c530 c530Var2 = c530.a;
                    f530 o2 = an91.o(c530Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    sic a2 = qic.a(lr20.c, x4c.G, btsVar4, 0);
                    int hashCode2 = Long.hashCode(btsVar4.T);
                    r1b0 o3 = btsVar4.o();
                    f530 d2 = b.d(btsVar4, o2);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar2);
                    } else {
                        btsVar4.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar4, wlsVar, a2);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar4, wlsVar2, o3);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar4, wlsVar3, valueOf);
                    tls tlsVar = d.h;
                    qje.M(btsVar4, tlsVar);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar4, wlsVar4, d2);
                    oeb1.b(null, this.b, null, null, null, 0, 0, ety0.a(xya1.e(btsVar4).d.a, 0L, 0L, null, null, (eyr) btsVar4.m(q3z.a), 0L, null, null, null, 0, 0L, null, null, 16777183), btsVar4, 0, HProv.PP_DELETE_KEYSET);
                    String str2 = this.c;
                    if (str2 == null) {
                        btsVar4.e0(1053779835);
                        btsVar4.t(false);
                        z2 = true;
                    } else {
                        btsVar4.e0(1053779836);
                        lhl0 a3 = khl0.a(f43Var, x4c.D, btsVar4, 0);
                        int hashCode3 = Long.hashCode(btsVar4.T);
                        r1b0 o4 = btsVar4.o();
                        f530 d3 = b.d(btsVar4, c530Var2);
                        btsVar4.i0();
                        if (btsVar4.S) {
                            btsVar4.n(slsVar2);
                        } else {
                            btsVar4.r0();
                        }
                        qje.W(btsVar4, wlsVar, a3);
                        qje.W(btsVar4, wlsVar2, o4);
                        vfc.v(hashCode3, btsVar4, wlsVar3, btsVar4, tlsVar);
                        oeb1.b(n.d(btsVar4, d3, wlsVar4, 1.0f, false), str2, null, null, null, 1, 5, xya1.e(btsVar4).i.a, btsVar4, 1769472, 28);
                        sya1.a(qlb1.b(), ljs0.m(c530Var2, 10.0f).k(new pa31(x4c.E)), null, AppColor$Palette.Text, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 4);
                        btsVar4 = btsVar4;
                        z2 = true;
                        btsVar4.t(true);
                        btsVar4.t(false);
                    }
                    btsVar4.t(z2);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar5 = (fid) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((bts) fidVar5).k(ebp0Var2) ? 4 : 2;
                }
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                    p9b1.c(ebp0Var2, this.b, c530.a, tp2.a, xya1.e(btsVar5).f.c, 2, Integer.MAX_VALUE, this.c, AppColor$Palette.TextMinor, xya1.e(btsVar5).h.a, 2, Integer.MAX_VALUE, null, btsVar5, intValue5 & 14, 0, 0);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            default:
                fid fidVar6 = (fid) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 17) != 16)) {
                    lhl0 a4 = khl0.a(f43Var, x4c.E, btsVar6, 48);
                    int hashCode4 = Long.hashCode(btsVar6.T);
                    r1b0 o5 = btsVar6.o();
                    f530 d4 = b.d(btsVar6, c530.a);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar3);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, d.f, a4);
                    qje.W(btsVar6, d.e, o5);
                    qje.W(btsVar6, d.g, Integer.valueOf(hashCode4));
                    qje.M(btsVar6, d.h);
                    qje.W(btsVar6, d.d, d4);
                    if (1.0f <= 0.0d) {
                        gxv.a("invalid weight; must be greater than zero");
                    }
                    jeb1.f(this.b, an91.m(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8.0f, 0.0f, 2), null, 0L, 0L, null, new sjy0(3), 0L, 2, false, 1, 0, null, xya1.e(btsVar6).g.b, btsVar6, 805306368, 48, 13692);
                    sya1.a(wza1.i(), null, null, null, btsVar6, 0, 14);
                    if (1.0f <= 0.0d) {
                        gxv.a("invalid weight; must be greater than zero");
                    }
                    jeb1.f(this.c, an91.m(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8.0f, 0.0f, 2), null, 0L, 0L, null, new sjy0(3), 0L, 2, false, 1, 0, null, xya1.e(btsVar6).g.b, btsVar6, 805306368, 48, 13692);
                    btsVar6.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
        }
    }
}
