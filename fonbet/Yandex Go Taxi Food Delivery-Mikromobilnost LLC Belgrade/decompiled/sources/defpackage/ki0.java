package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.text.Regex;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class ki0 {
    public static final void a(rh0 rh0Var, String str, String str2, tls tlsVar, fid fidVar, int i) {
        long n;
        Object obj;
        Object failure;
        int i2;
        final String str3;
        int i3;
        Object hi0Var;
        int i4;
        c530 c530Var;
        boolean z;
        f530 f530Var;
        a6t0 a6t0Var;
        final oz40 oz40Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-360442);
        int i5 = (btsVar.e(tlsVar) ? 2048 : 1024) | i | (btsVar.k(rh0Var) ? 4 : 2) | (btsVar.k(str) ? 32 : 16) | (btsVar.k(str2) ? 256 : 128);
        if (btsVar.V(i5 & 1, (i5 & 1171) != 1170)) {
            c530 c530Var2 = c530.a;
            f530 m = an91.m(ljs0.c(c530Var2, 1.0f), 16.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
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
            AddPaymentHomeResponse.FieldType fieldType = rh0Var.b;
            List list = rh0Var.i;
            if (ji0.a[fieldType.ordinal()] != 1) {
                w511.b();
                return;
            }
            if (str2 != null) {
                btsVar.e0(-1903989030);
                n = tje.n(AppColor$Palette.Error, btsVar);
                btsVar.t(false);
            } else {
                btsVar.e0(-1903939461);
                n = tje.n(AppColor$Palette.Text, btsVar);
                btsVar.t(false);
            }
            String str4 = rh0Var.f;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = str4;
            boolean k = btsVar.k(list);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = Integer.valueOf(vi91.k(list));
                btsVar.o0(Q);
            }
            int intValue = ((Number) Q).intValue();
            boolean k2 = ((i5 & 112) == 32) | btsVar.k(list);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = "+###############";
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        try {
                            failure = Boolean.valueOf(new Regex(((th0) obj).a).h(str));
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        Boolean bool = Boolean.FALSE;
                        boolean z2 = failure instanceof Result.Failure;
                        Object obj2 = failure;
                        if (z2) {
                            obj2 = bool;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            break;
                        }
                    }
                    th0 th0Var = (th0) obj;
                    if (th0Var != null) {
                        String str6 = th0Var.b;
                        String str7 = evu0.J(str6) ? null : str6;
                        if (str7 != null) {
                            Q2 = str7;
                        }
                    }
                }
                btsVar.o0(Q2);
            }
            String str8 = (String) Q2;
            boolean k3 = btsVar.k(str8);
            Object Q3 = btsVar.Q();
            if (k3 || Q3 == o430Var) {
                Q3 = Integer.valueOf((evu0.z(str8, '+') ? 1 : 0) + vi91.m(str8));
                btsVar.o0(Q3);
            }
            final int intValue2 = ((Number) Q3).intValue();
            boolean k4 = btsVar.k(str8);
            Object Q4 = btsVar.Q();
            if (k4 || Q4 == o430Var) {
                Q4 = new ffb0(str8);
                btsVar.o0(Q4);
            }
            ffb0 ffb0Var = (ffb0) Q4;
            final long n2 = tje.n(AppColor$Palette.TextMinor, btsVar);
            int length = str5.length();
            Object Q5 = btsVar.Q();
            if (Q5 == o430Var) {
                int length2 = str.length();
                i2 = i5;
                str3 = str8;
                Q5 = f.j(new hoy0(str, eja1.c(length2, length2), 4));
                btsVar.o0(Q5);
            } else {
                i2 = i5;
                str3 = str8;
            }
            oz40 oz40Var2 = (oz40) Q5;
            if (jl40.l(((hoy0) oz40Var2.getValue()).a.b, str)) {
                i3 = length;
            } else {
                int length3 = str.length();
                i3 = length;
                oz40Var2.setValue(new hoy0(str, eja1.c(length3, length3), 4));
            }
            hoy0 hoy0Var = (hoy0) oz40Var2.getValue();
            f530 m2 = an91.m(aab1.a(2.0f, n, ljs0.e(ljs0.c(c530Var2, 1.0f), 56.0f), cyk0.c(16.0f)), 16.0f, 0.0f, 2);
            lkx lkxVar = new lkx(0, 4, 0, HProv.PP_PASSWD_TERM);
            ety0 a2 = ety0.a(xya1.e(btsVar).f.a, tje.n(AppColor$Palette.Text, btsVar), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
            a6t0 a6t0Var2 = new a6t0(tje.n(new up2(aq2.a), btsVar));
            boolean k5 = btsVar.k(str5) | btsVar.c(intValue) | btsVar.c(i3);
            int i6 = i2;
            boolean z3 = k5 | ((i6 & 7168) == 2048);
            Object Q6 = btsVar.Q();
            if (z3 || Q6 == o430Var) {
                i4 = i6;
                c530Var = c530Var2;
                z = false;
                f530Var = m2;
                a6t0Var = a6t0Var2;
                hi0Var = new hi0(str5, intValue, i3, tlsVar, oz40Var2);
                oz40Var = oz40Var2;
                btsVar.o0(hi0Var);
            } else {
                hi0Var = Q6;
                oz40Var = oz40Var2;
                c530Var = c530Var2;
                i4 = i6;
                f530Var = m2;
                z = false;
                a6t0Var = a6t0Var2;
            }
            int i7 = i4;
            boolean z4 = z;
            ne5.a(hoy0Var, (tls) hi0Var, f530Var, false, false, a2, lkxVar, null, true, 0, 0, ffb0Var, null, null, a6t0Var, wwg.S(394506617, true, new zls() { // from class: ii0
                @Override // defpackage.zls
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    wls wlsVar = (wls) obj3;
                    fid fidVar2 = (fid) obj4;
                    int intValue3 = ((Integer) obj5).intValue();
                    if ((intValue3 & 6) == 0) {
                        intValue3 |= fidVar2.e(wlsVar) ? 4 : 2;
                    }
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                        k3r k3rVar = ljs0.c;
                        z910 d2 = pi6.d(x4c.x, false);
                        int hashCode2 = Long.hashCode(btsVar2.T);
                        r1b0 o2 = btsVar2.o();
                        f530 d3 = b.d(btsVar2, k3rVar);
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
                        qje.W(btsVar2, d.f, d2);
                        qje.W(btsVar2, d.e, o2);
                        qje.W(btsVar2, d.g, Integer.valueOf(hashCode2));
                        qje.M(btsVar2, d.h);
                        qje.W(btsVar2, d.d, d3);
                        oz40 oz40Var3 = oz40Var;
                        if (((hoy0) oz40Var3.getValue()).a.b.length() < intValue2) {
                            btsVar2.e0(-774685387);
                            String str9 = ((hoy0) oz40Var3.getValue()).a.b;
                            String str10 = str3;
                            String h = vi91.h(str9, str10);
                            String replace = gvu0.r0(h.length(), str10).replace('#', MoneyInputEditView.DEFAULT_VALUE);
                            hk2 hk2Var = new hk2(0);
                            int h2 = hk2Var.h(new bmt0(ldc.l, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65534));
                            try {
                                hk2Var.d(h);
                                hk2Var.g(h2);
                                h2 = hk2Var.h(new bmt0(n2, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65534));
                                try {
                                    hk2Var.d(replace);
                                    hk2Var.g(h2);
                                    jeb1.d(hk2Var.i(), null, null, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, xya1.e(btsVar2).f.a, btsVar2, 0, 0, 32766);
                                    btsVar2.t(false);
                                } finally {
                                }
                            } finally {
                            }
                        } else {
                            btsVar2.e0(-774118397);
                            btsVar2.t(false);
                        }
                        xvz.u(intValue3 & 14, wlsVar, btsVar2, true);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 100663296, ImageMetadata.EDGE_MODE, 13976);
            btsVar = btsVar;
            if (str2 != null) {
                tse0.s(btsVar, -1901051687, c530Var, 4.0f, btsVar);
                jeb1.f(str2, an91.o(c530Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), AppColor$Palette.Error, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, ((i7 >> 6) & 14) | 432, 0, 16376);
                btsVar = btsVar;
                btsVar.t(z4);
            } else {
                btsVar.e0(-1900823930);
                btsVar.t(z4);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0((Object) rh0Var, (Object) str, (Object) str2, tlsVar, i, 1);
        }
    }
}
