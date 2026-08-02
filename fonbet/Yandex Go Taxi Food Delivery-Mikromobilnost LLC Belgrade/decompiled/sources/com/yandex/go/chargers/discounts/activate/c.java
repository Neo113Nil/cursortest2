package com.yandex.go.chargers.discounts.activate;

import defpackage.aii0;
import defpackage.an91;
import defpackage.bts;
import defpackage.c0;
import defpackage.c530;
import defpackage.cvw;
import defpackage.did;
import defpackage.du9;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fi91;
import defpackage.fid;
import defpackage.hoy0;
import defpackage.i6b1;
import defpackage.jeb1;
import defpackage.ju8;
import defpackage.jv8;
import defpackage.ky7;
import defpackage.kyh0;
import defpackage.l0;
import defpackage.ljs0;
import defpackage.lkx;
import defpackage.lt9;
import defpackage.my8;
import defpackage.n;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ohb1;
import defpackage.oz40;
import defpackage.pfb1;
import defpackage.rx3;
import defpackage.s0;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.tls;
import defpackage.v4b1;
import defpackage.wg0;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.xya1;
import defpackage.zpn;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class c {
    public static final void a(du9 du9Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1014930920);
        int i2 = (btsVar.k(du9Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 0, 0, 8191);
            androidx.compose.runtime.internal.a S = wwg.S(1050472203, true, new wg0(8, tlsVar), btsVar);
            androidx.compose.runtime.internal.a S2 = wwg.S(1328064184, true, new l0(6, du9Var, tlsVar), btsVar);
            btsVar = btsVar;
            com.yandex.go.design.compose.modal.bottomsheet.c.a(null, a, null, false, false, null, null, null, S, null, null, S2, btsVar, 100663296, 48, 1789);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(du9Var, tlsVar, i, 22);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(lt9 lt9Var, tls tlsVar, boolean z, boolean z2, fid fidVar, int i) {
        lt9 lt9Var2;
        tls tlsVar2;
        String e;
        o430 o430Var;
        wp2 wp2Var;
        o430 o430Var2;
        Object Q;
        boolean k;
        Object Q2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(600227985);
        int i2 = i | (btsVar.k(lt9Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.a(z) ? 2048 : 1024) | (btsVar.a(z2) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9361) != 9360)) {
            Object[] objArr = new Object[0];
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object Q3 = btsVar.Q();
            o430 o430Var3 = did.a;
            if (z3 || Q3 == o430Var3) {
                Q3 = new ju8(22, lt9Var);
                btsVar.o0(Q3);
            }
            oz40 oz40Var = (oz40) cvw.V(objArr, (sls) Q3, btsVar, 0);
            String str = lt9Var.d;
            boolean k2 = btsVar.k(oz40Var) | (i3 == 32);
            Object Q4 = btsVar.Q();
            if (k2 || Q4 == o430Var3) {
                Q4 = new ChargersDiscountsActivateScreenKt$Content$1$1(lt9Var, oz40Var, null);
                btsVar.o0(Q4);
            }
            zpn.e(btsVar, (wls) Q4, str);
            boolean z4 = i3 == 32;
            Object Q5 = btsVar.Q();
            if (z4 || Q5 == o430Var3) {
                Q5 = n.f(z2, btsVar);
            }
            oz40 oz40Var2 = (oz40) Q5;
            c530 c530Var = c530.a;
            f530 b = i6b1.b(an91.k(ljs0.c(c530Var, 1.0f), 16.0f));
            f530 o = an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 16.0f, 16.0f, 0.0f, 8);
            if (((Boolean) oz40Var2.getValue()).booleanValue()) {
                btsVar.e0(1444074733);
                btsVar.t(false);
                e = lt9Var.a;
            } else {
                btsVar.e0(1444117699);
                e = ohb1.e(btsVar, kyh0.chargers_discounts_activate_promocode_title);
                btsVar.t(false);
            }
            jeb1.f(e, o, ((Boolean) oz40Var2.getValue()).booleanValue() ? lt9Var.c : lt9Var.b, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.b, btsVar, 0, 0, 16248);
            oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
            f530 b2 = z ? pfb1.b(b, false, 31) : b;
            hoy0 hoy0Var = (hoy0) oz40Var.getValue();
            ety0 ety0Var = xya1.d(btsVar).d.d;
            wp2 wp2Var2 = ((Boolean) oz40Var2.getValue()).booleanValue() ? lt9Var.f : lt9Var.e;
            String e2 = ohb1.e(btsVar, kyh0.chargers_discounts_activate_promocode_hint);
            ety0 a = ety0.a(xya1.e(btsVar).d.d, 0L, 0L, null, null, null, 0L, null, null, null, 3, 0L, null, null, 16744447);
            lkx lkxVar = new lkx(1, 7, 0, 88);
            boolean k3 = btsVar.k(oz40Var) | ((i2 & 7168) == 2048) | btsVar.k(oz40Var2);
            Object Q6 = btsVar.Q();
            if (k3) {
                o430Var = o430Var3;
            } else {
                o430Var = o430Var3;
                if (Q6 != o430Var) {
                    wp2Var = wp2Var2;
                    o430Var2 = o430Var;
                    v4b1.a(b2, e2, hoy0Var, (tls) Q6, ety0Var, wp2Var, 0, a, null, lkxVar, btsVar, 0);
                    btsVar = btsVar;
                    oeb1.c(btsVar, ljs0.e(c530Var, 4.0f));
                    Q = btsVar.Q();
                    if (Q == o430Var2) {
                        Q = new jv8(26);
                        btsVar.o0(Q);
                    }
                    f530 e3 = ljs0.e(an91.k(fi91.e(c530Var, (tls) Q), 16.0f), 56.0f);
                    boolean z5 = z && ((hoy0) oz40Var.getValue()).a.b.length() > 0;
                    k = btsVar.k(oz40Var) | ((i2 & 896) != 256);
                    Q2 = btsVar.Q();
                    if (!k || Q2 == o430Var2) {
                        tlsVar2 = tlsVar;
                        Q2 = new c0(tlsVar2, oz40Var, 5);
                        btsVar.o0(Q2);
                    } else {
                        tlsVar2 = tlsVar;
                    }
                    lt9Var2 = lt9Var;
                    ohb1.b(e3, z5, null, (sls) Q2, wwg.S(-1215581820, true, new my8(z, lt9Var2, 4), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 4);
                }
            }
            wp2Var = wp2Var2;
            Q6 = new rx3(z, oz40Var, oz40Var2, 3);
            btsVar.o0(Q6);
            o430Var2 = o430Var;
            v4b1.a(b2, e2, hoy0Var, (tls) Q6, ety0Var, wp2Var, 0, a, null, lkxVar, btsVar, 0);
            btsVar = btsVar;
            oeb1.c(btsVar, ljs0.e(c530Var, 4.0f));
            Q = btsVar.Q();
            if (Q == o430Var2) {
            }
            f530 e32 = ljs0.e(an91.k(fi91.e(c530Var, (tls) Q), 16.0f), 56.0f);
            if (z) {
            }
            k = btsVar.k(oz40Var) | ((i2 & 896) != 256);
            Q2 = btsVar.Q();
            if (k) {
            }
            tlsVar2 = tlsVar;
            Q2 = new c0(tlsVar2, oz40Var, 5);
            btsVar.o0(Q2);
            lt9Var2 = lt9Var;
            ohb1.b(e32, z5, null, (sls) Q2, wwg.S(-1215581820, true, new my8(z, lt9Var2, 4), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 4);
        } else {
            lt9Var2 = lt9Var;
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0(lt9Var2, tlsVar2, z, z2, i);
        }
    }
}
