package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.yandex.passport.R;
import com.yandex.passport.common.core.Uid;
import defpackage.agc;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bq11;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.dgc;
import defpackage.did;
import defpackage.dmw0;
import defpackage.eq11;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.g43;
import defpackage.jl40;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.o430;
import defpackage.o7b1;
import defpackage.oeb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.so5;
import defpackage.tcc;
import defpackage.tls;
import defpackage.vqy0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.ypu;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class c1 {
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
    
        if (defpackage.jl40.l(r11.Q(), java.lang.Integer.valueOf(r13)) == false) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final o0 o0Var, com.yandex.passport.internal.report.reporters.f0 f0Var, final tls tlsVar, f530 f530Var, fid fidVar, int i) {
        wls wlsVar;
        String e;
        Object obj;
        final com.yandex.passport.internal.report.reporters.f0 f0Var2;
        so5 so5Var;
        boolean z;
        int i2;
        ?? r6;
        final ?? r15;
        final oz40 oz40Var;
        c530 c530Var;
        so5 so5Var2;
        boolean z2;
        boolean z3;
        Object obj2;
        Object obj3;
        bts btsVar;
        boolean z4 = o0Var.e;
        List list = o0Var.f;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-919531927);
        dmw0 dmw0Var = btsVar2.a;
        int i3 = i | (btsVar2.e(o0Var) ? 4 : 2) | (btsVar2.k(f0Var) ? 32 : 16) | (btsVar2.e(tlsVar) ? 256 : 128) | (btsVar2.k(f530Var) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && btsVar2.E()) {
            btsVar2.Y();
            f0Var2 = f0Var;
            btsVar = btsVar2;
        } else {
            btsVar2.e0(186553075);
            int i4 = i3 & 112;
            boolean e2 = (i4 == 32) | btsVar2.e(o0Var);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            Object obj4 = Q;
            if (e2 || Q == o430Var) {
                LogoutComposeUiKt$LogoutComposeUI$1$1 logoutComposeUiKt$LogoutComposeUI$1$1 = new LogoutComposeUiKt$LogoutComposeUI$1$1(f0Var, o0Var, null);
                btsVar2.o0(logoutComposeUiKt$LogoutComposeUI$1$1);
                obj4 = logoutComposeUiKt$LogoutComposeUI$1$1;
            }
            btsVar2.t(false);
            zpn.e(btsVar2, (wls) obj4, zy11.a);
            so5 so5Var3 = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var3, btsVar2, 0);
            int S = cma1.S(btsVar2);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, f530Var);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            wls wlsVar2 = androidx.compose.ui.node.d.f;
            qje.W(btsVar2, wlsVar2, a);
            wls wlsVar3 = androidx.compose.ui.node.d.e;
            qje.W(btsVar2, wlsVar3, o);
            wls wlsVar4 = androidx.compose.ui.node.d.g;
            if (btsVar2.S) {
                wlsVar = wlsVar2;
            } else {
                wlsVar = wlsVar2;
            }
            b64.z(S, btsVar2, S, wlsVar4);
            wls wlsVar5 = androidx.compose.ui.node.d.d;
            qje.W(btsVar2, wlsVar5, d);
            if (list.size() < 2) {
                btsVar2.e0(-1613117652);
                e = ohb1.e(btsVar2, R.string.passport_logout_sheet_title);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-1613023133);
                e = ohb1.e(btsVar2, R.string.passport_logout_sheet_title_profiles);
                btsVar2.t(false);
            }
            String str = e;
            ety0 ety0Var = ((bq11) btsVar2.m(eq11.a)).d;
            long j = ((agc) btsVar2.m(dgc.a)).a;
            so5 so5Var4 = x4c.H;
            f530 o2 = an91.o(an91.m(an91.o(new ypu(so5Var4), 0.0f, 44.0f, 0.0f, 0.0f, 13), 24.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            btsVar2.e0(-744754006);
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                u0 u0Var = new u0(1);
                btsVar2.o0(u0Var);
                obj = u0Var;
            } else {
                obj = Q2;
            }
            btsVar2.t(false);
            wls wlsVar6 = wlsVar;
            vqy0.c(str, fnq0.b(o2, false, (tls) obj), j, 0L, null, 0L, new sjy0(3), 0L, 0, false, 0, 0, ety0Var, btsVar2, 0, 0, 130040);
            btsVar2.e0(-744752584);
            if (o0Var.d) {
                String e3 = ohb1.e(btsVar2, R.string.passport_logout_delete_account);
                btsVar2.e0(-744747628);
                boolean e4 = (i4 == 32) | ((i3 & 896) == 256) | btsVar2.e(o0Var);
                Object Q3 = btsVar2.Q();
                if (e4 || Q3 == o430Var) {
                    f0Var2 = f0Var;
                    i2 = 2;
                    com.yandex.passport.internal.ui.bouncer.chooser.d dVar = new com.yandex.passport.internal.ui.bouncer.chooser.d(2, tlsVar, f0Var2, o0Var);
                    btsVar2.o0(dVar);
                    obj3 = dVar;
                } else {
                    f0Var2 = f0Var;
                    i2 = 2;
                    obj3 = Q3;
                }
                z = false;
                btsVar2.t(false);
                so5Var = so5Var4;
                d1.a(0, btsVar2, (sls) obj3, new ypu(so5Var), e3);
            } else {
                f0Var2 = f0Var;
                so5Var = so5Var4;
                z = false;
                i2 = 2;
            }
            btsVar2.t(z);
            int size = list.size();
            c530 c530Var2 = c530.a;
            if (size < i2) {
                btsVar2.e0(-1612047408);
                oeb1.c(btsVar2, ljs0.m(c530Var2, z4 ? 32.0f : 44.0f).k(new ypu(so5Var)));
                r6 = 0;
                btsVar2.t(false);
                r15 = 1;
            } else {
                r6 = 0;
                btsVar2.e0(-1611832113);
                r15 = 1;
                b.a(48, btsVar2, an91.m(c530Var2, 0.0f, 32.0f, 1), list);
                btsVar2.t(false);
            }
            Object[] objArr = {Boolean.valueOf(z4)};
            btsVar2.e0(-744723687);
            Object Q4 = btsVar2.Q();
            Object obj5 = Q4;
            if (Q4 == o430Var) {
                y0 y0Var = new y0(r6);
                btsVar2.o0(y0Var);
                obj5 = y0Var;
            }
            btsVar2.t(r6);
            final oz40 oz40Var2 = (oz40) cvw.V(objArr, (sls) obj5, btsVar2, 48);
            btsVar2.e0(-744720274);
            if (z4) {
                f530 d2 = o7b1.d(an91.o(c530Var2, 12.0f, 0.0f, 24.0f, 24.0f, 2));
                sic a2 = qic.a(g43Var, so5Var3, btsVar2, 0);
                int S2 = cma1.S(btsVar2);
                r1b0 o3 = btsVar2.o();
                f530 d3 = androidx.compose.ui.b.d(btsVar2, d2);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, wlsVar6, a2);
                qje.W(btsVar2, wlsVar3, o3);
                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S2))) {
                    b64.z(S2, btsVar2, S2, wlsVar4);
                }
                qje.W(btsVar2, wlsVar5, d3);
                boolean z5 = ((LogoutOption) oz40Var2.getValue()) == LogoutOption.ThisApp ? r15 : false;
                String e5 = ohb1.e(btsVar2, R.string.passport_logout_current_app_option);
                String e6 = ohb1.e(btsVar2, R.string.passport_logout_current_app_hint);
                btsVar2.e0(1765219908);
                boolean k = btsVar2.k(oz40Var2);
                Object Q5 = btsVar2.Q();
                if (k || Q5 == o430Var) {
                    z3 = false;
                    final boolean z6 = false ? 1 : 0;
                    sls slsVar2 = new sls() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.z0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i5 = z6;
                            zy11 zy11Var = zy11.a;
                            oz40 oz40Var3 = oz40Var2;
                            switch (i5) {
                                case 0:
                                    oz40Var3.setValue(LogoutOption.ThisApp);
                                    break;
                                default:
                                    oz40Var3.setValue(LogoutOption.AllAps);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar2.o0(slsVar2);
                    obj2 = slsVar2;
                } else {
                    z3 = false;
                    obj2 = Q5;
                }
                btsVar2.t(z3);
                so5 so5Var5 = so5Var;
                c530Var = c530Var2;
                com.yandex.passport.internal.properties.u.d(z5, e5, e6, (sls) obj2, null, btsVar2, 0);
                boolean z7 = ((LogoutOption) oz40Var2.getValue()) == LogoutOption.AllAps ? r15 : false;
                String e7 = ohb1.e(btsVar2, R.string.passport_logout_all_apps_option);
                String e8 = ohb1.e(btsVar2, o0Var.c ? R.string.passport_logout_all_apps_hint : R.string.passport_logout_all_apps_hint_whitelabel);
                btsVar2.e0(1765232195);
                boolean k2 = btsVar2.k(oz40Var2);
                Object Q6 = btsVar2.Q();
                Object obj6 = Q6;
                if (k2 || Q6 == o430Var) {
                    sls slsVar3 = new sls() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.z0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i5 = r15;
                            zy11 zy11Var = zy11.a;
                            oz40 oz40Var3 = oz40Var2;
                            switch (i5) {
                                case 0:
                                    oz40Var3.setValue(LogoutOption.ThisApp);
                                    break;
                                default:
                                    oz40Var3.setValue(LogoutOption.AllAps);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar2.o0(slsVar3);
                    obj6 = slsVar3;
                }
                btsVar2.t(false);
                so5Var2 = so5Var5;
                oz40Var = oz40Var2;
                z2 = false;
                com.yandex.passport.internal.properties.u.d(z7, e7, e8, (sls) obj6, null, btsVar2, 0);
                btsVar2.t(r15);
            } else {
                oz40Var = oz40Var2;
                c530Var = c530Var2;
                so5Var2 = so5Var;
                z2 = false;
            }
            btsVar2.t(z2);
            String e9 = ohb1.e(btsVar2, R.string.passport_logout_exit);
            btsVar2.e0(-744677650);
            int i5 = i3 & 896;
            boolean k3 = (i4 != 32 ? false : r15) | btsVar2.k(oz40Var) | btsVar2.e(o0Var) | (i5 == 256 ? r15 : false);
            Object Q7 = btsVar2.Q();
            Object obj7 = Q7;
            if (k3 || Q7 == o430Var) {
                sls slsVar4 = new sls() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.a1
                    @Override // defpackage.sls
                    public final Object invoke() {
                        oz40 oz40Var3 = oz40Var;
                        LogoutOption logoutOption = (LogoutOption) oz40Var3.getValue();
                        LogoutOption logoutOption2 = LogoutOption.AllAps;
                        o0 o0Var2 = o0.this;
                        tls tlsVar2 = tlsVar;
                        com.yandex.passport.internal.report.reporters.f0 f0Var3 = f0Var2;
                        if (logoutOption == logoutOption2 || !o0Var2.e) {
                            tlsVar2.invoke(LogoutBottomsheetWish.LOGOUT_ALL_APPS);
                            Uid uid = o0Var2.a;
                            Uid uid2 = o0Var2.b;
                            List list2 = o0Var2.f;
                            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((com.yandex.passport.internal.entities.k) it.next()).a);
                            }
                            ((com.yandex.passport.internal.report.reporters.g0) f0Var3).j(uid, uid2, arrayList);
                        } else if (((LogoutOption) oz40Var3.getValue()) == LogoutOption.ThisApp) {
                            tlsVar2.invoke(LogoutBottomsheetWish.LOGOUT_THIS_APP);
                            Uid uid3 = o0Var2.a;
                            Uid uid4 = o0Var2.b;
                            List list3 = o0Var2.f;
                            ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((com.yandex.passport.internal.entities.k) it2.next()).a);
                            }
                            ((com.yandex.passport.internal.report.reporters.g0) f0Var3).k(uid3, uid4, arrayList2);
                        }
                        return zy11.a;
                    }
                };
                btsVar2.o0(slsVar4);
                obj7 = slsVar4;
            }
            btsVar2.t(false);
            c530 c530Var3 = c530Var;
            com.yandex.passport.internal.properties.u.g(384, 8, btsVar2, (sls) obj7, an91.m(ljs0.c(c530Var3, 1.0f), 24.0f, 0.0f, 2), e9, false);
            oeb1.c(btsVar2, ljs0.m(c530Var3, 8.0f));
            String e10 = ohb1.e(btsVar2, R.string.passport_reg_cancel);
            btsVar2.e0(-744651195);
            boolean z8 = i5 == 256;
            Object Q8 = btsVar2.Q();
            Object obj8 = Q8;
            if (z8 || Q8 == o430Var) {
                p pVar = new p(3, tlsVar);
                btsVar2.o0(pVar);
                obj8 = pVar;
            }
            btsVar2.t(false);
            com.yandex.passport.internal.properties.u.h(384, btsVar2, (sls) obj8, an91.m(ljs0.c(c530Var3, 1.0f), 24.0f, 0.0f, 2), e10, false);
            bts btsVar3 = btsVar2;
            oeb1.c(btsVar3, ljs0.m(c530Var3, 24.0f).k(new ypu(so5Var2)));
            btsVar3.t(true);
            btsVar = btsVar3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b1(o0Var, f0Var2, tlsVar, f530Var, i);
        }
    }
}
