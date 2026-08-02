package com.yandex.go.personal_goals_v2.ui;

import android.text.Spanned;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import defpackage.a7y;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bms;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.d17;
import defpackage.d4b0;
import defpackage.did;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.gv40;
import defpackage.j4b0;
import defpackage.jad;
import defpackage.k4b0;
import defpackage.lg6;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.n;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pca0;
import defpackage.qab1;
import defpackage.qeb1;
import defpackage.qgy;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sd2;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.squ;
import defpackage.tcc;
import defpackage.tls;
import defpackage.v4b0;
import defpackage.vfc;
import defpackage.vg0;
import defpackage.vuz;
import defpackage.w7b0;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public abstract class a {
    public static final void a(v4b0 v4b0Var, w7b0 w7b0Var, tls tlsVar, f530 f530Var, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        tls tlsVar2;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2030475882);
        int i4 = i | (btsVar.k(v4b0Var) ? 4 : 2) | (btsVar.k(w7b0Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | HProv.ALG_TYPE_SECURECHANNEL;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = i4 | (btsVar.k(f530Var2) ? 2048 : 1024);
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            f530 f530Var4 = i5 != 0 ? c530Var : f530Var2;
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var4);
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
            oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
            f530 j = vfc.j(x4c.H, an91.m(c530Var, 12.0f, 0.0f, 2));
            Spanned c = qeb1.c(v4b0Var.e);
            ety0 ety0Var = xya1.e(btsVar).i.a;
            AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
            sjy0 sjy0Var = new sjy0(3);
            int i6 = i3 & 896;
            boolean z = i6 == 256;
            Object Q = btsVar.Q();
            f530 f530Var5 = f530Var4;
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new gv40(8, tlsVar);
                btsVar.o0(Q);
            }
            int i7 = i3;
            qgy.b(c, null, j, appColor$Palette, 0L, 0L, sjy0Var, 0L, 0, 0, 0, ety0Var, (tls) Q, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 3954);
            btsVar = btsVar;
            f530 m = an91.m(n.e(c530Var, 14.0f, btsVar, c530Var, 1.0f), 8.0f, 0.0f, 2);
            boolean z2 = (w7b0Var == null || v4b0Var.f) ? false : true;
            boolean z3 = (i6 == 256) | ((i7 & 112) == 32);
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                tlsVar2 = tlsVar;
                Q2 = new d4b0(w7b0Var, tlsVar2);
                btsVar.o0(Q2);
            } else {
                tlsVar2 = tlsVar;
            }
            d17.d(m, z2, null, null, null, (sls) Q2, wwg.S(-1145551885, true, new k4b0(v4b0Var, 0), btsVar), btsVar, 1572870, 28);
            ly3.B(c530Var, 8.0f, btsVar, true);
            f530Var3 = f530Var5;
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
            f530Var3 = f530Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(v4b0Var, w7b0Var, tlsVar2, f530Var3, i, i2);
        }
    }

    public static final void b(v4b0 v4b0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        int i3;
        bts btsVar;
        final v4b0 v4b0Var2 = v4b0Var;
        final tls tlsVar2 = tlsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2018929255);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(v4b0Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar2) ? 32 : 16;
        }
        int i4 = 1;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar2.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = f.j(Boolean.FALSE);
                btsVar2.o0(Q);
            }
            final oz40 oz40Var = (oz40) Q;
            List list = v4b0Var2.c;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((w7b0) it.next()).a);
            }
            boolean k = btsVar2.k(arrayList);
            Object Q2 = btsVar2.Q();
            if (k || Q2 == obj) {
                Q2 = f.j(kotlin.collections.a.u0(v4b0Var2.c));
                btsVar2.o0(Q2);
            }
            final oz40 oz40Var2 = (oz40) Q2;
            final androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar2);
            wg6 a2 = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar2, 48, 0, 8189);
            WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
            sd2 sd2Var = vuz.o(btsVar2).g;
            lg6 c = qab1.c(a2, null, null, btsVar2, 0, 6);
            androidx.compose.runtime.internal.a S = wwg.S(-263509749, true, new pca0(tlsVar2, oz40Var2, i4), btsVar2);
            jad.a.getClass();
            androidx.compose.runtime.internal.a aVar = jad.c;
            androidx.compose.runtime.internal.a S2 = wwg.S(-2069154803, true, new vg0((Object) a, (Object) oz40Var, (Object) v4b0Var2, tlsVar2, (Object) oz40Var2, 11), btsVar2);
            v4b0Var2 = v4b0Var;
            tlsVar2 = tlsVar;
            androidx.compose.runtime.internal.a S3 = wwg.S(-830823879, true, new bms() { // from class: l4b0
                @Override // defpackage.bms
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    j690 j690Var = (j690) obj3;
                    fid fidVar2 = (fid) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 48) == 0) {
                        intValue |= ((bts) fidVar2).k(j690Var) ? 32 : 16;
                    }
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.V(intValue & 1, (intValue & 145) != 144)) {
                        f530 c2 = ljs0.c(c530.a, 1.0f);
                        androidx.compose.foundation.lazy.b bVar = androidx.compose.foundation.lazy.b.this;
                        boolean k2 = btsVar3.k(bVar);
                        Object Q3 = btsVar3.Q();
                        oz40 oz40Var3 = oz40Var;
                        o430 o430Var = did.a;
                        if (k2 || Q3 == o430Var) {
                            Q3 = new m4b0(bVar, oz40Var3, 0);
                            btsVar3.o0(Q3);
                        }
                        f530 y = eja1.y(c2, (tls) Q3);
                        v4b0 v4b0Var3 = v4b0Var2;
                        boolean k3 = btsVar3.k(v4b0Var3);
                        oz40 oz40Var4 = oz40Var2;
                        boolean k4 = k3 | btsVar3.k(oz40Var4);
                        tls tlsVar3 = tlsVar2;
                        boolean k5 = btsVar3.k(tlsVar3) | k4;
                        Object Q4 = btsVar3.Q();
                        if (k5 || Q4 == o430Var) {
                            vqy vqyVar = new vqy(v4b0Var3, tlsVar3, oz40Var4, oz40Var3, 14);
                            btsVar3.o0(vqyVar);
                            Q4 = vqyVar;
                        }
                        adb1.a(y, bVar, j690Var, null, null, null, false, null, (tls) Q4, btsVar3, (intValue << 3) & 896, 504);
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            }, btsVar2);
            i3 = 1;
            c.a(null, a2, c, false, false, null, sd2Var, S, null, aVar, S2, S3, btsVar2, 817889280, 54, 313);
            btsVar = btsVar2;
        } else {
            i3 = 1;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j4b0(v4b0Var2, tlsVar2, i, i3);
        }
    }

    public static final void c(v4b0 v4b0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-536698910);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(v4b0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new PersonalGoalsScreenKt$PersonalGoalsScreen$1$1(tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            b(v4b0Var, tlsVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j4b0(v4b0Var, tlsVar, i, 0);
        }
    }
}
