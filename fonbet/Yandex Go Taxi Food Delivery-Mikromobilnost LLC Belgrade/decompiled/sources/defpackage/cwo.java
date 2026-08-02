package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes11.dex */
public final /* synthetic */ class cwo implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ CharSequence w;

    public /* synthetic */ cwo(int i, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.a = i;
        this.b = z;
        this.c = charSequence;
        this.w = charSequence2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g43 g43Var = lr20.c;
        boolean z = this.b;
        c530 c530Var = c530.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    sic a = qic.a(g43Var, x4c.H, btsVar, 48);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
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
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar);
                    }
                    qje.W(btsVar, d.d, d);
                    zgb1.a(this.c, null, 0, false, null, null, false, null, btsVar, 0, 254);
                    CharSequence charSequence = this.w;
                    if (charSequence == null) {
                        btsVar.e0(-1668415118);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1668415117);
                        zgb1.a(charSequence, null, 0, false, null, null, false, null, btsVar, 0, 254);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                    if (z) {
                        btsVar.e0(1418291919);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(1418016112);
                        ocb1.c(ljs0.c(ljs0.e(c530Var, 56.0f), 1.0f), 0.0f, 0L, ldc.l, ((YandexShapes) btsVar.m(qm51.a)).b(), 0, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 102);
                        btsVar.t(false);
                    }
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    pi6.a(ljs0.b(ljs0.c(c530Var, 1.0f), 0.0f, 56.0f, 1), btsVar2, 6);
                    f530 c = ljs0.c(c530Var, 1.0f);
                    uo5 uo5Var = x4c.y;
                    ebp0Var.getClass();
                    cj6 cj6Var = cj6.a;
                    f530 a2 = cj6Var.a(c, uo5Var);
                    sic a3 = qic.a(g43Var, x4c.G, btsVar2, 0);
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o2 = btsVar2.o();
                    f530 d2 = b.d(btsVar2, a2);
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
                    qje.W(btsVar2, d.f, a3);
                    qje.W(btsVar2, d.e, o2);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d2);
                    qgy.b(this.c, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 2, 2, 0, xya1.e(btsVar2).g.a, null, btsVar2, 805309440, 6, 10742);
                    CharSequence charSequence2 = this.w;
                    if (charSequence2 == null || charSequence2.length() == 0) {
                        btsVar2.e0(490746654);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(490522431);
                        qgy.b(charSequence2, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 2, 2, 0, xya1.e(btsVar2).h.a, null, btsVar2, 805309440, 6, 10742);
                        btsVar2.t(false);
                    }
                    btsVar2.t(true);
                    if (z) {
                        btsVar2.e0(-1609470633);
                        yrl.b(0, 6, btsVar2, cj6Var.a(c530Var, x4c.B));
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-1609392792);
                        btsVar2.t(false);
                    }
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }
}
