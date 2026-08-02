package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.R;
import com.yandex.passport.api.AccountListBranding;
import defpackage.a1z0;
import defpackage.agc;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bq11;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.dgc;
import defpackage.did;
import defpackage.eq11;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.i9a1;
import defpackage.jl40;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.mt71;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.oeb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.uo5;
import defpackage.vfc;
import defpackage.vi91;
import defpackage.vqy0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.ym1;
import defpackage.z910;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public abstract class h {
    public static final void a(sls slsVar, boolean z, AccountListBranding accountListBranding, Locale locale, f530 f530Var, fid fidVar, int i) {
        int i2;
        boolean z2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1655385641);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= btsVar.a(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(accountListBranding) : btsVar.e(accountListBranding) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(locale) ? 2048 : 1024;
        }
        int i3 = i2 | HProv.ALG_CLASS_DATA_ENCRYPT;
        if ((i3 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            z910 d = pi6.d(x4c.b, false);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            uo5 uo5Var = x4c.x;
            cj6 cj6Var = cj6.a;
            f530 a = cj6Var.a(c530Var, uo5Var);
            e0.a.getClass();
            vi91.a(slsVar, a, false, null, null, null, e0.b, btsVar, (i3 & 14) | 1572864, 60);
            c(z2, accountListBranding, locale, cj6Var.a(c530Var, x4c.y), btsVar, (i3 >> 3) & 1022);
            btsVar.t(true);
            f530Var2 = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(slsVar, z, accountListBranding, locale, f530Var2, i);
        }
    }

    public static final void b(b bVar, List list, sls slsVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(551438349);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(bVar) : btsVar.e(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            slsVar2 = slsVar;
            i2 |= btsVar.e(slsVar2) ? 256 : 128;
        } else {
            slsVar2 = slsVar;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            String e = ohb1.e(btsVar, R.string.passport_choose_master_title);
            f530 g = i9a1.g(m4m0.b(ljs0.c, ((agc) btsVar.m(dgc.a)).n, qke.q));
            btsVar.e0(-1267445369);
            boolean k = btsVar.k(e);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new f(e, 0);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            f530 b = fnq0.b(g, false, (tls) Q);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar3 = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            a(slsVar2, bVar.isWhiteLabel(), bVar.getBranding(), ((com.yandex.passport.internal.ui.lang.a) bVar.getUiLanguageProvider()).b(), null, btsVar, (i2 >> 6) & 14);
            c530 c530Var = c530.a;
            oeb1.c(btsVar, ljs0.e(c530Var, 32.0f));
            btsVar.e0(-804516880);
            boolean z = (i2 & 7168) == 2048;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new com.yandex.passport.internal.flags.presentation.n(3, tlsVar);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            e.a((i2 >> 3) & 14, btsVar, (tls) Q2, vfc.j(x4c.H, ljs0.s(c530Var, 0.0f, 400.0f, 1)), list);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g(bVar, list, slsVar, tlsVar, i, 0);
        }
    }

    public static final void c(boolean z, AccountListBranding accountListBranding, Locale locale, f530 f530Var, fid fidVar, int i) {
        int i2;
        Locale locale2;
        f530 f530Var2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-191299172);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(accountListBranding) : btsVar.e(accountListBranding) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            locale2 = locale;
            i2 |= btsVar.e(locale2) ? 256 : 128;
        } else {
            locale2 = locale;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i2 |= btsVar.k(f530Var2) ? 2048 : 1024;
        } else {
            f530Var2 = f530Var;
        }
        if ((i2 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(-1763988903);
            f530 f530Var3 = f530Var2;
            vqy0.c(ohb1.e(btsVar, R.string.passport_accounts), f530Var3, ((agc) btsVar.m(dgc.a)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((bq11) btsVar.m(eq11.a)).d, btsVar, (i2 >> 6) & 112, 0, 131064);
            btsVar = btsVar;
            btsVar.t(false);
        } else {
            btsVar.e0(-1763737369);
            if (accountListBranding instanceof AccountListBranding.Custom) {
                i3 = ((AccountListBranding.Custom) accountListBranding).m230getResourcelwcMDYM();
            } else if (!(accountListBranding instanceof AccountListBranding.Yandex)) {
                w511.b();
                return;
            } else {
                int i4 = com.yandex.passport.common.ui.lang.a.a;
                String lowerCase = locale2.getLanguage().toLowerCase(Locale.ROOT);
                i3 = (lowerCase.equals(new Locale(ClearCryptoProPrefs.COUNTRY).getLanguage()) || lowerCase.equals(new Locale("az").getLanguage()) || lowerCase.equals(new Locale("uk").getLanguage()) || lowerCase.equals(new Locale("kk").getLanguage()) || lowerCase.equals(new Locale("ky").getLanguage()) || lowerCase.equals(new Locale("be").getLanguage()) || lowerCase.equals(new Locale("bg").getLanguage())) ? R.drawable.passport_logo_ya_id_ru : R.drawable.passport_logo_ya_id_en;
            }
            o4b1.b(mt71.m(i3, 0, btsVar), null, f530Var, null, null, 0.0f, null, btsVar, ((i2 >> 3) & 896) | 48, 120);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a1z0(z, accountListBranding, locale2, f530Var, i, 5);
        }
    }
}
