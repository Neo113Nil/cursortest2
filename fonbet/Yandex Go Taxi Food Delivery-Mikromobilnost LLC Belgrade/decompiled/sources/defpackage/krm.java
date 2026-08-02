package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.List;

/* loaded from: classes11.dex */
public final class krm implements zls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public krm(int i, oz40 oz40Var) {
        this.b = i;
        this.c = oz40Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c530 c530Var = c530.a;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                dj6 dj6Var = (dj6) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(dj6Var) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        return zy11Var;
                    }
                }
                float d = dj6Var.d();
                f530 c = ljs0.c(c530Var, 1.0f);
                kk2 kk2Var = (kk2) obj4;
                lhl0 a = khl0.a(lr20.a, x4c.E, fidVar, 48);
                bts btsVar2 = (bts) fidVar;
                int hashCode = Long.hashCode(btsVar2.T);
                r1b0 o = btsVar2.o();
                f530 d2 = b.d(fidVar, c);
                ohd.G1.getClass();
                sls slsVar = d.b;
                bts btsVar3 = (bts) fidVar;
                if (btsVar3.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar);
                } else {
                    btsVar3.r0();
                }
                qje.W(fidVar, d.f, a);
                qje.W(fidVar, d.e, o);
                wls wlsVar = d.g;
                if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar3, hashCode, wlsVar);
                }
                qje.W(fidVar, d.d, d2);
                qnm qnmVar = qnm.a;
                mrm.i(kk2Var, ltm.b(fidVar).i(fidVar), qnm.c(fidVar).h0(), this.b, ljs0.s(c530Var, 0.0f, d, 1), new y7m(d), fidVar, 0, 0);
                btsVar3.e0(-721089806);
                btsVar3.t(false);
                btsVar3.t(true);
                return zy11Var;
            default:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar4 = (bts) fidVar2;
                if (btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    int f = scc.f((List) ((oz40) obj4).getValue());
                    int i2 = this.b;
                    if (i2 == f) {
                        btsVar4.e0(1991801700);
                        udb1.c(ibp0Var, xna1.a(), null, null, btsVar4, intValue2 & 14, 14);
                        btsVar4.t(false);
                    } else {
                        btsVar4.e0(1991946718);
                        jeb1.f(String.valueOf(i2 + 1), bzk0.c(ljs0.m(an91.k(c530Var, 20.0f), 16.0f), AppColor$Palette.BgInvert, cyk0.c(24.0f)), AppColor$Palette.TextInvert, 0L, 0L, null, new sjy0(3), 0L, 0, false, 1, 0, null, xya1.e(btsVar4).h.c, btsVar4, 384, 48, 14200);
                        btsVar4.t(false);
                    }
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
        }
    }

    public krm(kk2 kk2Var, int i) {
        this.c = kk2Var;
        this.b = i;
    }
}
