package defpackage;

import android.content.Context;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersLiveActivityTappedButtonName;
import com.yandex.go.scooters.live.domain.model.ScootersLiveAction;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.TransportCubeIconBackgroundType;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class o2b1 {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(c911 c911Var, fid fidVar, int i) {
        byk0 c;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-145759700);
        int i2 = (btsVar.k(c911Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            TransportCubeIconBackgroundType transportCubeIconBackgroundType = c911Var.d;
            int i3 = transportCubeIconBackgroundType == null ? -1 : u0v.a[transportCubeIconBackgroundType.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    c = cyk0.a;
                    f530 l = an91.l(m4m0.b(ymb1.l(ljs0.u(c530.a, null, 3), c), rzo.d(s8o.m(c911Var.c, (Context) btsVar.m(AndroidCompositionLocals_androidKt.b))), qke.q), 6.0f, 3.0f);
                    z910 d = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, l);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a != null) {
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
                    jeb1.f(c911Var.a, null, c911Var.b, uh6.E(12), 0L, null, new sjy0(3), 0L, 1, false, 1, 0, null, new ety0(0L, 0L, lzr.E, null, null, null, 0L, 0, 0L, null, null, 16777211), btsVar, 805309440, 24624, 13682);
                    btsVar = btsVar;
                    btsVar.t(true);
                } else if (i3 != 2) {
                    w511.b();
                    return;
                }
            }
            c = cyk0.c(6.0f);
            f530 l2 = an91.l(m4m0.b(ymb1.l(ljs0.u(c530.a, null, 3), c), rzo.d(s8o.m(c911Var.c, (Context) btsVar.m(AndroidCompositionLocals_androidKt.b))), qke.q), 6.0f, 3.0f);
            z910 d3 = pi6.d(x4c.y, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d22 = b.d(btsVar, l2);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a != null) {
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new bns(c911Var, i, 11);
        }
    }

    public static final void b(f530 f530Var, a0v a0vVar, sls slsVar, sls slsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1930053904);
        int i2 = 2;
        int i3 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(a0vVar) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.e(slsVar2) ? 2048 : 1024);
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            hub1.b(f530Var, a0vVar.b, a0vVar.h, a0vVar.i, slsVar, wwg.S(315497337, true, new q0v(i2, a0vVar, slsVar2 == null ? slsVar : slsVar2), btsVar), btsVar, (i3 & 14) | ImageMetadata.EDGE_MODE | ((i3 << 6) & HProv.ALG_CLASS_ALL));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(f530Var, (Object) a0vVar, (Object) slsVar, slsVar2, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void c(b911 b911Var, kxu kxuVar, fid fidVar, int i) {
        kxu kxuVar2;
        ?? r14;
        bts btsVar;
        Integer num;
        ?? r3;
        ?? r4;
        bts btsVar2;
        boolean z;
        boolean z2;
        bts btsVar3;
        boolean z3;
        boolean z4;
        bts btsVar4 = (bts) fidVar;
        btsVar4.g0(-1001757813);
        int i2 = (btsVar4.k(b911Var) ? 4 : 2) | i | (btsVar4.k(kxuVar) ? 32 : 16);
        if (btsVar4.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 u = ljs0.u(c530Var, null, 3);
            lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.E, btsVar4, 54);
            int hashCode = Long.hashCode(btsVar4.T);
            r1b0 o = btsVar4.o();
            f530 d = b.d(btsVar4, u);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar4.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar4.i0();
            if (btsVar4.S) {
                btsVar4.n(slsVar);
            } else {
                btsVar4.r0();
            }
            qje.W(btsVar4, d.f, a);
            qje.W(btsVar4, d.e, o);
            qje.W(btsVar4, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar4, d.h);
            qje.W(btsVar4, d.d, d);
            mf1 mf1Var = b911Var.a;
            Integer num2 = b911Var.c;
            if (mf1Var == null) {
                btsVar4.e0(-290638031);
                btsVar4.t(false);
                r3 = 1;
                num = num2;
                btsVar2 = btsVar4;
                r4 = 0;
            } else {
                btsVar4.e0(-290638030);
                pvi0 b = mja1.b(mf1Var.b, null, 6);
                u7d.a.getClass();
                num = num2;
                r3 = 1;
                r4 = 0;
                v0b1.a(b, null, null, u7d.b, null, null, null, null, 0.0f, 0, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 1014);
                btsVar2 = btsVar4;
                btsVar2.t(false);
            }
            if (num == null || kxuVar == null) {
                kxuVar2 = kxuVar;
                z = r3;
                boolean z5 = r4;
                bts btsVar5 = btsVar2;
                btsVar5.e0(-288902061);
                btsVar5.t(z5);
                btsVar3 = btsVar5;
                z2 = z5;
            } else {
                btsVar2.e0(-290254188);
                int d2 = y6i0.d(num.intValue(), r4, 100);
                long n = tje.n(AppColor$Palette.Text, btsVar2);
                f530 e = ljs0.e(ljs0.q(c530Var, 42.0f), 20.0f);
                int i3 = i2 & 112;
                boolean z6 = (i3 == 32 ? r3 : r4) | (btsVar2.c(d2) ? 1 : 0);
                Object Q = btsVar2.Q();
                o430 o430Var = did.a;
                if (z6 != 0 || Q == o430Var) {
                    Q = new lxu(kxuVar, d2, r3);
                    btsVar2.o0(Q);
                }
                tls tlsVar = (tls) Q;
                boolean z7 = (i3 == 32 ? r3 : r4) | (btsVar2.c(d2) ? 1 : 0) | (btsVar2.d(n) ? 1 : 0);
                Object Q2 = btsVar2.Q();
                if (z7 != 0 || Q2 == o430Var) {
                    z3 = r3;
                    z4 = r4;
                    mxu mxuVar = new mxu(kxuVar, d2, n, 1);
                    kxuVar2 = kxuVar;
                    btsVar2.o0(mxuVar);
                    Q2 = mxuVar;
                } else {
                    kxuVar2 = kxuVar;
                    z3 = r3;
                    z4 = r4;
                }
                bts btsVar6 = btsVar2;
                androidx.compose.ui.viewinterop.b.a(tlsVar, e, (tls) Q2, btsVar6, 48, 0);
                btsVar6.t(z4);
                btsVar3 = btsVar6;
                z = z3;
                z2 = z4;
            }
            btsVar3.e0(406323237);
            Iterator it = b911Var.b.iterator();
            while (it.hasNext()) {
                a((c911) it.next(), btsVar3, z2 ? 1 : 0);
            }
            btsVar3.t(z2);
            btsVar3.t(z);
            btsVar = btsVar3;
            r14 = z2;
        } else {
            kxuVar2 = kxuVar;
            r14 = 0;
            btsVar4.Y();
            btsVar = btsVar4;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(b911Var, kxuVar2, i, r14);
        }
    }

    public static final void d(k811 k811Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-984096752);
        int i2 = (btsVar.k(k811Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            pvi0 b = mja1.b(k811Var.a, null, 6);
            u7d.a.getClass();
            v0b1.a(b, null, null, u7d.c, wwg.S(679078112, true, new t0v(k811Var), btsVar), null, null, null, 0.0f, 0, btsVar, 27648, 998);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t0v(k811Var, i);
        }
    }

    public static final m24 e(jxz0 jxz0Var) {
        return new m24(jxz0Var.getTitle(), jxz0Var.h(), jxz0Var.getDescription(), jxz0Var.getEnabled(), jxz0Var.g());
    }

    public static final ScootersAnalytics$ScootersLiveActivityTappedButtonName f(ScootersLiveAction scootersLiveAction) {
        switch (scootersLiveAction == null ? -1 : swn0.a[scootersLiveAction.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
                return ScootersAnalytics$ScootersLiveActivityTappedButtonName.StartRiding;
            case 2:
                return ScootersAnalytics$ScootersLiveActivityTappedButtonName.StartRiding;
            case 3:
                return ScootersAnalytics$ScootersLiveActivityTappedButtonName.WhereIsScooter;
            case 4:
                return ScootersAnalytics$ScootersLiveActivityTappedButtonName.StopRiding;
            case 5:
                return ScootersAnalytics$ScootersLiveActivityTappedButtonName.CancelRiding;
            case 6:
                return ScootersAnalytics$ScootersLiveActivityTappedButtonName.FinishRiding;
            case 7:
                return ScootersAnalytics$ScootersLiveActivityTappedButtonName.ScootersRouteNavigation;
        }
    }
}
