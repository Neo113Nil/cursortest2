package com.ybsdk.feature.about.internal.presentation;

import android.content.Context;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ybsdk.core.utils.text.Text;
import defpackage.a7u0;
import defpackage.adb1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.ay51;
import defpackage.az91;
import defpackage.b64;
import defpackage.b9a1;
import defpackage.bts;
import defpackage.by51;
import defpackage.c0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cr51;
import defpackage.did;
import defpackage.dr51;
import defpackage.dzh0;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.g5z;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k3r;
import defpackage.khl0;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m0;
import defpackage.m5;
import defpackage.mt71;
import defpackage.n4u0;
import defpackage.n6;
import defpackage.n751;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.p7b1;
import defpackage.q4v;
import defpackage.q791;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rbv;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.tn1;
import defpackage.u1w;
import defpackage.u3a1;
import defpackage.v5;
import defpackage.w5;
import defpackage.w8a1;
import defpackage.wls;
import defpackage.wqy0;
import defpackage.wxg0;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.xx8;
import defpackage.zpn;
import java.util.Calendar;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(n6 n6Var, tls tlsVar, fid fidVar, int i) {
        Context context;
        o430 o430Var;
        boolean z;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(838985228);
        int i2 = i | (btsVar.e(n6Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            c530 c530Var2 = c530.a;
            f530 d = u3a1.d(ljs0.c(c530Var2, 1.0f), "about_screen.bottom_section");
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, d);
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
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            Context context2 = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            btsVar.e0(1298296459);
            rbv rbvVar = n6Var.b;
            o430 o430Var2 = did.a;
            if (rbvVar != null) {
                btsVar.e0(5004770);
                boolean k = btsVar.k(rbvVar);
                Object Q = btsVar.Q();
                if (k || Q == o430Var2) {
                    Q = f.j(null);
                    btsVar.o0(Q);
                }
                oz40 oz40Var = (oz40) Q;
                btsVar.t(false);
                int i3 = i2;
                rbv rbvVar2 = n6Var.b;
                f530 m = ljs0.m(c530Var2, 60.0f);
                btsVar.e0(-1633490746);
                boolean k2 = ((i3 & 112) == 32) | btsVar.k(oz40Var);
                Object Q2 = btsVar.Q();
                if (k2 || Q2 == o430Var2) {
                    Q2 = new c0(tlsVar, oz40Var, 1);
                    btsVar.o0(Q2);
                }
                btsVar.t(false);
                f530 c = q791.c(m, (sls) Q2);
                btsVar.e0(5004770);
                boolean k3 = btsVar.k(oz40Var);
                Object Q3 = btsVar.Q();
                if (k3 || Q3 == o430Var2) {
                    Q3 = new w5(0, oz40Var);
                    btsVar.o0(Q3);
                }
                btsVar.t(false);
                context = context2;
                z = false;
                o430Var = o430Var2;
                az91.d(rbvVar2, c, null, null, 0.0f, 0, null, (tls) Q3, null, btsVar, 48);
                oeb1.c(btsVar, ljs0.e(c530Var2, 16.0f));
            } else {
                context = context2;
                o430Var = o430Var2;
                z = false;
            }
            btsVar.t(z);
            Text text = n6Var.c;
            btsVar.e0(1298315126);
            if (text != null) {
                c530Var = c530Var2;
                wqy0.b(com.ybsdk.core.utils.text.d.a(context, text).toString(), an91.o(c530Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), ((cr51) btsVar.m(dr51.a)).a.f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ay51) btsVar.m(by51.a)).B, btsVar, 48, 0, 65528);
                btsVar = btsVar;
            } else {
                c530Var = c530Var2;
            }
            Object k4 = g8e.k(1849434622, btsVar, z);
            if (k4 == o430Var) {
                k4 = String.valueOf(Calendar.getInstance().get(1));
                btsVar.o0(k4);
            }
            btsVar.t(z);
            String d3 = ohb1.d(dzh0.ybsdk_settings_organization_title, new Object[]{(String) k4}, btsVar);
            a7u0 a7u0Var = by51.a;
            ety0 ety0Var = ((ay51) btsVar.m(a7u0Var)).C;
            a7u0 a7u0Var2 = dr51.a;
            c530 c530Var3 = c530Var;
            bts btsVar2 = btsVar;
            wqy0.b(d3, an91.o(an91.m(ljs0.c(c530Var3, 1.0f), 24.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), ((cr51) btsVar.m(a7u0Var2)).a.m, 0L, null, null, null, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, ety0Var, btsVar2, 48, 0, 65016);
            wqy0.b(ohb1.e(btsVar2, dzh0.ybsdk_about_yandex_project), u3a1.d(an91.o(c530Var3, 0.0f, 0.0f, 0.0f, 42.0f, 7), "about_screen.yandex_project"), ((cr51) btsVar2.m(a7u0Var2)).a.f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ay51) btsVar2.m(a7u0Var)).C, btsVar2, 48, 0, 65528);
            btsVar = btsVar2;
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(n6Var, tlsVar, i, 2);
        }
    }

    public static final void b(m5 m5Var, String str, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-142405976);
        if (((i | (btsVar.e(m5Var) ? 4 : 2) | (btsVar.k(str) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128)) & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            f530 k = an91.k(q791.c(u3a1.d(ljs0.c(c530.a, 1.0f), str), slsVar), 24.0f);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, k);
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
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            String obj = com.ybsdk.core.utils.text.d.a(context, m5Var.a).toString();
            ety0 ety0Var = ((ay51) btsVar.m(by51.a)).A;
            a7u0 a7u0Var = dr51.a;
            wqy0.b(obj, an91.o(new x2y(1.0f, true), 0.0f, 0.0f, 56.0f, 0.0f, 11), ((cr51) btsVar.m(a7u0Var)).a.f, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ety0Var, btsVar, 0, 3120, 55288);
            btsVar = btsVar;
            q4v.b(mt71.m(wxg0.ybsdk_about_ic_forward, 0, btsVar), null, null, ((cr51) btsVar.m(a7u0Var)).a.f, btsVar, 48, 4);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(m5Var, str, slsVar, i, 3);
        }
    }

    public static final void c(b bVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-938996687);
        if ((((btsVar.e(bVar) ? 4 : 2) | i) & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            oz40 c = androidx.lifecycle.compose.a.c((n4u0) bVar.z.getValue(), null, btsVar, 0, 7);
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            btsVar.e0(-1633490746);
            boolean e = btsVar.e(bVar) | btsVar.e(context);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new AboutScreenKt$AboutScreen$1$1(bVar, context, null);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            zpn.e(btsVar, (wls) Q, bVar);
            n6 n6Var = (n6) c.getValue();
            btsVar.e0(5004770);
            boolean e2 = btsVar.e(bVar);
            Object Q2 = btsVar.Q();
            if (e2 || Q2 == o430Var) {
                AboutScreenKt$AboutScreen$2$1 aboutScreenKt$AboutScreen$2$1 = new AboutScreenKt$AboutScreen$2$1(1, bVar, b.class, "onAboutItemClicked", "onAboutItemClicked(Lcom/ybsdk/feature/about/internal/domain/AboutItemEntity;)V", 0);
                btsVar.o0(aboutScreenKt$AboutScreen$2$1);
                Q2 = aboutScreenKt$AboutScreen$2$1;
            }
            btsVar.t(false);
            tls tlsVar = (tls) ((tfx) Q2);
            btsVar.e0(5004770);
            boolean e3 = btsVar.e(bVar);
            Object Q3 = btsVar.Q();
            if (e3 || Q3 == o430Var) {
                AboutScreenKt$AboutScreen$3$1 aboutScreenKt$AboutScreen$3$1 = new AboutScreenKt$AboutScreen$3$1(1, bVar, b.class, "onImageCoinClick", "onImageCoinClick(Landroid/graphics/drawable/Drawable;)V", 0);
                btsVar.o0(aboutScreenKt$AboutScreen$3$1);
                Q3 = aboutScreenKt$AboutScreen$3$1;
            }
            btsVar.t(false);
            d(n6Var, tlsVar, (tls) ((tfx) Q3), btsVar, 0);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tn1(bVar, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(n6 n6Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1125175698);
        int i2 = i | (btsVar.e(n6Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(tlsVar2) ? 256 : 128);
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            k3r k3rVar = ljs0.c;
            btsVar.e0(-1753973156);
            u1w f = p7b1.f((n751) btsVar.m(g5z.a));
            f530 e = b9a1.e(k3rVar, w8a1.b(f.b, f.d, 5));
            btsVar.t(false);
            f530 d = u3a1.d(e, "about_screen.root");
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, d);
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
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            c530 c530Var = c530.a;
            oeb1.c(btsVar, ljs0.e(c530Var, 76.0f));
            wqy0.b(ohb1.e(btsVar, dzh0.ybsdk_about_screen_title), u3a1.d(an91.o(c530Var, 24.0f, 0.0f, 24.0f, 0.0f, 10), "about_screen.title"), ((cr51) btsVar.m(dr51.a)).a.f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ay51) btsVar.m(by51.a)).t, btsVar, 48, 0, 65528);
            btsVar = btsVar;
            oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
            f530 d3 = u3a1.d(new x2y(1.0f, true), "about_screen.menu_list");
            btsVar.e0(-1633490746);
            boolean e2 = btsVar.e(n6Var) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (e2 || Q == did.a) {
                z = false;
                Q = new v5(0 == true ? 1 : 0, n6Var, tlsVar);
                btsVar.o0(Q);
            } else {
                z = false;
            }
            btsVar.t(z);
            adb1.a(d3, null, null, null, null, null, false, null, (tls) Q, btsVar, 0, 510);
            a(n6Var, tlsVar2, btsVar, (i2 & 14) | ((i2 >> 3) & 112));
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(n6Var, tlsVar, tlsVar2, i);
        }
    }
}
