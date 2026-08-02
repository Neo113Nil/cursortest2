package defpackage;

import android.app.Activity;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.lifecycle.compose.a;
import com.yandex.messaging.ui.settings.inviteLinkInfo.InviteLinkType;
import com.yandex.messaging.ui.settings.inviteLinkInfo.c;
import com.yx360.design.compose.atoms.DsButton$Size;
import com.yx360.design.compose.atoms.DsButton$Style;
import com.yx360.design.compose.atoms.DsButtonClose$Type;
import com.yx360.design.compose.atoms.DsHeading$Align;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import skeletor.render.SkeletonContentView;

/* loaded from: classes15.dex */
public abstract class kww {
    public static final void a(int i, fid fidVar, sls slsVar, f530 f530Var, boolean z) {
        int i2;
        sls slsVar2;
        f530 f530Var2;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1607401098);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            slsVar2 = slsVar;
            f530Var2 = f530Var;
            z2 = z;
        } else {
            slsVar2 = slsVar;
            f530Var2 = f530Var;
            z2 = z;
            mo91.g(ohb1.e(btsVar, oyh0.telemost_invite_link_share_button), slsVar2, DsButton$Style.Brand, f530Var2, DsButton$Size.Lg, z2, false, btsVar, (i2 & 112) | 24960 | ((i2 << 3) & 7168) | ((i2 << 18) & 3670016), NetworkRequestException.INVALID_RANGE);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gc2(z2, slsVar2, f530Var2, i);
        }
    }

    public static final void b(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(51656337);
        if ((i & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            hq91.a(ohb1.e(btsVar, oyh0.telemost_invite_link_info_title), f530Var, ohb1.e(btsVar, oyh0.telemost_invite_link_info_subtitle), null, DsHeading$Align.Center, 0L, 0, 0L, 0, 0, null, btsVar, 24624, 0, 2024);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 22);
        }
    }

    public static final void c(Activity activity, f530 f530Var, sls slsVar, c cVar, fid fidVar, int i) {
        int i2;
        c cVar2;
        f530 f530Var2;
        f530 f530Var3;
        c cVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(707410717);
        int i3 = i | (btsVar.e(activity) ? 4 : 2) | 48 | (btsVar.e(slsVar) ? 256 : 128) | 1024;
        if ((i3 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
            f530Var3 = f530Var;
            cVar3 = cVar;
        } else {
            btsVar.a0();
            int i4 = i & 1;
            o430 o430Var = did.a;
            boolean z = false;
            if (i4 == 0 || btsVar.C()) {
                btsVar.e0(-897180073);
                rs31 b = jjo.b(btsVar);
                hs31 a = jjo.a(btsVar);
                btsVar.e0(544794079);
                boolean e = btsVar.e(a);
                Object Q = btsVar.Q();
                if (e || Q == o430Var) {
                    Q = new w4(a, 13);
                    btsVar.o0(Q);
                }
                btsVar.t(false);
                yr31 G = ooc.G(qoi0.a(c.class), b, null, vfc.h(c.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
                btsVar.t(false);
                i2 = i3 & (-7169);
                cVar2 = (c) G;
                f530Var2 = c530.a;
            } else {
                btsVar.Y();
                cVar2 = cVar;
                i2 = i3 & (-7169);
                f530Var2 = f530Var;
            }
            btsVar.u();
            oz40 c = a.c(cVar2.D, null, btsVar, 0, 7);
            j50 j50Var = new j50();
            btsVar.e0(-818812464);
            boolean e2 = ((i2 & 896) == 256) | btsVar.e(activity);
            Object Q2 = btsVar.Q();
            if (e2 || Q2 == o430Var) {
                Q2 = new mgu(20, slsVar, activity);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            yd00 e3 = kla1.e(j50Var, (tls) Q2, btsVar, 0);
            di9 di9Var = cVar2.c;
            btsVar.e0(-818804721);
            boolean e4 = btsVar.e(e3) | btsVar.e(activity);
            Object Q3 = btsVar.Q();
            if (e4 || Q3 == o430Var) {
                Q3 = new mgu(21, e3, activity);
                btsVar.o0(Q3);
            }
            btsVar.t(false);
            com.yandex.messaging.core.ui.a.a(di9Var, (tls) Q3, btsVar, 0);
            com.yx360.design.compose.atoms.modal.a.a(slsVar, f530Var2, srm.a, null, null, null, new xjg(DsButtonClose$Type.Close, slsVar, z, 26), null, wwg.S(887720145, true, new com.yandex.messaging.ui.settings.inviteLinkInfo.a(cVar2, c), btsVar), btsVar, ((i2 >> 6) & 14) | 805306416, 376);
            btsVar = btsVar;
            f530Var3 = f530Var2;
            cVar3 = cVar2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr((Object) activity, f530Var3, (Object) slsVar, (Object) cVar3, i, 7);
        }
    }

    public static final void d(lww lwwVar, sls slsVar, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-450649820);
        int i2 = i | (btsVar.k(lwwVar) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.k(f530Var) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            f530 u = pw91.u(ljs0.u(f530Var, null, 3), pw91.o(btsVar), 14);
            int i3 = 6;
            sic a = qic.a(lr20.e, x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, u);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
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
            qnm.d.getClass();
            c530 c530Var = c530.a;
            oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
            q9b1.b(ljs0.e(ljs0.c(c530Var, 1.0f), 218.0f), mt71.m(wwg0.tm_invite_link, 0, btsVar), btsVar, 6, 0);
            b(n.e(c530Var, 24.0f, btsVar, c530Var, 1.0f), btsVar, 6);
            oeb1.c(btsVar, ljs0.e(c530Var, 40.0f));
            a(i2 & 112, btsVar, slsVar, an91.m(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 2), lwwVar.b);
            oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
            boolean z = lwwVar.a == InviteLinkType.TEMPORARY;
            btsVar.e0(2063887566);
            boolean z2 = (i2 & 896) == 256;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new adp(i3, tlsVar);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            e(z, (tls) Q, null, btsVar, 0);
            ly3.B(c530Var, 8.0f, btsVar, true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(lwwVar, slsVar, tlsVar, f530Var, i);
        }
    }

    public static final void e(boolean z, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1172029395);
        if (((i | (btsVar.a(z) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | 384) & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            crm crmVar = new crm(ohb1.e(btsVar, oyh0.telemost_invite_link_temporary_label), null, 14, 1);
            crm crmVar2 = new crm(ohb1.e(btsVar, oyh0.telemost_invite_link_temporary_description), null, 14, 0);
            qnm qnmVar = qnm.a;
            mgv mgvVar = icb1.a;
            if (mgvVar == null) {
                lgv lgvVar = new lgv("ShieldOutlineMd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
                uq90 e = nnm.e(21.0f, 7.0f);
                e.d(20.779f, 10.906f, 20.389f, 14.263f, 19.0f, 17.0f);
                e.d(17.701f, 19.56f, 15.521f, 21.579f, 12.0f, 23.0f);
                e.d(8.481f, 21.579f, 6.299f, 19.56f, 5.0f, 17.0f);
                e.d(3.611f, 14.263f, 3.221f, 10.906f, 3.0f, 7.0f);
                tse0.u(e, 12.0f, 2.0f, 21.0f, 7.0f);
                e.j(5.076f, 8.135f);
                e.d(5.312f, 11.44f, 5.732f, 14.024f, 6.783f, 16.095f);
                e.d(7.747f, 17.993f, 9.323f, 19.594f, 12.0f, 20.823f);
                e.d(14.678f, 19.594f, 16.254f, 17.993f, 17.217f, 16.095f);
                e.d(18.267f, 14.023f, 18.688f, 11.44f, 18.924f, 8.135f);
                tse0.u(e, 12.0f, 4.288f, 5.076f, 8.135f);
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                mgvVar = lgvVar.d();
                icb1.a = mgvVar;
            }
            btsVar.e0(38903447);
            tqm tqmVar = new tqm(ba91.c(mgvVar, btsVar), null);
            btsVar.t(false);
            qqm qqmVar = new qqm(tlsVar, z, true);
            c530 c530Var = c530.a;
            mrm.d(crmVar, tqmVar, u3a1.d(c530Var, "temporary_link_toggle"), qqmVar, false, crmVar2, null, null, null, null, btsVar, 0, 0, 4048);
            f530Var2 = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(z, tlsVar, f530Var2, i, 11);
        }
    }
}
