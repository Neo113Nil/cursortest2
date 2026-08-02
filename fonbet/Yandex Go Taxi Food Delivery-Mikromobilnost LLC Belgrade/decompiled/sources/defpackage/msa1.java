package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.input.nestedscroll.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.plus.home.common.utils.RoundedDrawable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class msa1 {
    public static final void a(final vo70 vo70Var, final tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2123192617);
        int i2 = (btsVar.k(vo70Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        final int i3 = 1;
        final int i4 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            gjz0 gjz0Var = vo70Var.a;
            String str = gjz0Var != null ? gjz0Var.a : null;
            gjz0 gjz0Var2 = vo70Var.b;
            String str2 = gjz0Var2 != null ? gjz0Var2.a : null;
            int i5 = i2 & 14;
            int i6 = i2 & 112;
            boolean z = (i5 == 4) | (i6 == 32);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new sls() { // from class: r12
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i7 = i4;
                        zy11 zy11Var = zy11.a;
                        tls tlsVar2 = tlsVar;
                        vo70 vo70Var2 = vo70Var;
                        switch (i7) {
                            case 0:
                                gjz0 gjz0Var3 = vo70Var2.a;
                                if (gjz0Var3 != null) {
                                    tlsVar2.invoke(new u12(gjz0Var3.b));
                                    break;
                                }
                                break;
                            default:
                                gjz0 gjz0Var4 = vo70Var2.b;
                                if (gjz0Var4 != null) {
                                    tlsVar2.invoke(new v12(gjz0Var4.b));
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q);
            }
            sls slsVar = (sls) Q;
            boolean z2 = (i6 == 32) | (i5 == 4);
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new sls() { // from class: r12
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i7 = i3;
                        zy11 zy11Var = zy11.a;
                        tls tlsVar2 = tlsVar;
                        vo70 vo70Var2 = vo70Var;
                        switch (i7) {
                            case 0:
                                gjz0 gjz0Var3 = vo70Var2.a;
                                if (gjz0Var3 != null) {
                                    tlsVar2.invoke(new u12(gjz0Var3.b));
                                    break;
                                }
                                break;
                            default:
                                gjz0 gjz0Var4 = vo70Var2.b;
                                if (gjz0Var4 != null) {
                                    tlsVar2.invoke(new v12(gjz0Var4.b));
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q2);
            }
            i(0, btsVar, slsVar, (sls) Q2, str, str2);
            uj91.b(null, null, btsVar, 0, 3);
            b(vo70Var.c, btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0v(vo70Var, tlsVar, i, 11);
        }
    }

    public static final void b(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-137297120);
        int i2 = (btsVar.k(str) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            q2d.a.getClass();
            ydb1.a(null, q2d.c, wwg.S(1505805743, true, new le(str, 7), btsVar), null, null, null, null, false, btsVar, 432, 249);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 5);
        }
    }

    public static final void c(z12 z12Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1756932777);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(z12Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 18;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            cz20 e = tnb1.e(new up2(ldc.l), null, btsVar, 4);
            q2d.a.getClass();
            cx20.a(null, null, e, null, null, false, false, q2d.b, wwg.S(-972579365, true, new u5(tlsVar, 24, z12Var), btsVar), btsVar, 113246208, HProv.PP_PASSWD_TERM);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(z12Var, tlsVar, i, i3);
        }
    }

    public static final void d(l5f l5fVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-431022191);
        if ((((btsVar.k(l5fVar) ? 4 : 2) | i) & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else if (l5fVar instanceof p5f) {
            btsVar.e0(-1048047177);
            l(null, btsVar, 0);
            btsVar.t(false);
        } else if (l5fVar instanceof o5f) {
            btsVar.e0(-1047944071);
            k((o5f) l5fVar, null, btsVar, 0);
            btsVar.t(false);
        } else {
            if (!(l5fVar instanceof n5f)) {
                throw unr0.y(520379686, btsVar, false);
            }
            btsVar.e0(-1047833866);
            mrm.d(new crm(ohb1.e(btsVar, oyh0.unavailable_chat), null, 14, 1), new sqm(g1b1.a(btsVar), null, 12), null, oqm.a, false, null, null, null, null, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 4084);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new loj(l5fVar, i, 27);
        }
    }

    public static final void e(wo70 wo70Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1606750373);
        int i2 = (btsVar.k(wo70Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            dta1.a(null, false, null, false, false, wwg.S(-1948949719, true, new u5(tlsVar, 25, wo70Var), btsVar), btsVar, ImageMetadata.EDGE_MODE, 31);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0v(wo70Var, tlsVar, i, 12);
        }
    }

    public static final void f(m5f m5fVar, pa90 pa90Var, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1643118077);
        if (((i | (btsVar.k(m5fVar) ? 4 : 2) | (btsVar.e(pa90Var) ? 32 : 16) | 384) & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            qnm.e.getClass();
            zqm zqmVar = new zqm(wwg.S(1433517052, true, new vc0(m5fVar, pa90Var, 1), btsVar));
            crm crmVar = new crm(m5fVar.b, null, 14, 1);
            c530 c530Var = c530.a;
            mrm.f(crmVar, zqmVar, c530Var, oqm.a, false, null, null, null, btsVar, 3456, 496);
            f530Var2 = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm(m5fVar, pa90Var, f530Var2, i, 10);
        }
    }

    public static final void g(int i, fid fidVar, f530 f530Var, List list) {
        f530 f530Var2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(2026995128);
        int i2 = 2;
        int i3 = (btsVar2.k(list) ? 4 : 2) | i | 48;
        if ((i3 & 19) == 18 && btsVar2.E()) {
            btsVar2.Y();
            f530Var2 = f530Var;
            btsVar = btsVar2;
        } else {
            qnm qnmVar = qnm.a;
            aui0 d = gja1.d(qza1.e(), 0L, 0L, 0.0f, btsVar2, 0, 30);
            btsVar2.e0(828218456);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            Object obj = Q;
            if (z || Q == o430Var) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof m5f) {
                        arrayList.add(obj2);
                    }
                }
                btsVar2.o0(arrayList);
                obj = arrayList;
            }
            List list2 = (List) obj;
            btsVar2.t(false);
            btsVar2.e0(828222234);
            boolean z2 = i4 == 4;
            Object Q2 = btsVar2.Q();
            if (z2 || Q2 == o430Var) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof l5f) {
                        arrayList2.add(obj3);
                    }
                }
                btsVar2.o0(arrayList2);
                Q2 = arrayList2;
            }
            List list3 = (List) Q2;
            btsVar2.t(false);
            y8e y8eVar = y8e.a;
            f530Var2 = c530.a;
            f530 a = b.a(f530Var2, y8eVar, null);
            btsVar2.e0(828228841);
            boolean k = btsVar2.k(list2) | btsVar2.e(d) | btsVar2.k(list3);
            Object Q3 = btsVar2.Q();
            if (k || Q3 == o430Var) {
                Q3 = new ynn(i2, list2, list3, d);
                btsVar2.o0(Q3);
            }
            btsVar2.t(false);
            adb1.a(a, null, null, null, null, null, false, null, (tls) Q3, btsVar2, 0, 510);
            btsVar = btsVar2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lga(list, f530Var2, i, i2);
        }
    }

    public static final void h(String str, String str2, String str3, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-947194197);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(str2) ? 32 : 16) | (btsVar.k(str3) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            f530 o2 = an91.o(n.d(btsVar, d, wlsVar4, 1.0f, true), 16.0f, 18.0f, 0.0f, 0.0f, 12);
            sic a2 = qic.a(new i43(2.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, o2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            jeb1.f(str, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).f.c, btsVar, i2 & 14, 0, 16382);
            jeb1.f(str2, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, (i2 >> 3) & 14, 0, 16382);
            btsVar = btsVar;
            btsVar.t(true);
            v0b1.a(mja1.a(str3, null, 6), ljs0.e(an91.o(c530Var, 0.0f, 8.0f, 16.0f, 16.0f, 1), 52.0f), null, null, null, null, null, mhe.c, 0.0f, 0, btsVar, 12582960, 892);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(str, str2, str3, i, 10);
        }
    }

    public static final void i(int i, fid fidVar, sls slsVar, sls slsVar2, String str, String str2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1256114118);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(str2) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.e(slsVar2) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 o = an91.o(c530.a, 8.0f, 0.0f, 8.0f, 8.0f, 2);
            lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.D, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            if (str != null) {
                btsVar.e0(-747705428);
                int i3 = i2 << 3;
                j(str, f1h0.ic_call_and_chat_24, slsVar, btsVar, (i3 & 7168) | (i3 & 112) | 6);
                btsVar.t(false);
            } else {
                btsVar.e0(-747540136);
                btsVar.t(false);
            }
            if (str2 != null) {
                btsVar.e0(-747500456);
                j(str2, f1h0.ic_share_24, slsVar2, btsVar, (i2 & 7168) | (i2 & 112) | 6);
                btsVar.t(false);
            } else {
                btsVar.e0(-747346696);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new o12(str, str2, slsVar, slsVar2, i);
        }
    }

    public static final void j(String str, int i, sls slsVar, fid fidVar, int i2) {
        int i3;
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1818869193);
        int i4 = i2 & 6;
        nhl0 nhl0Var = nhl0.a;
        if (i4 == 0) {
            i3 = (btsVar.k(nhl0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.c(i) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        int i5 = 0;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            slsVar2 = slsVar;
            ulb1.a(nhl0Var.a(c530.a, 1.0f, true), false, ButtonSize.M, slsVar2, wwg.S(561828440, true, new p12(i, str, i5), btsVar), btsVar, (i3 & 7168) | 24960, 2);
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q12(i, i2, slsVar2, str);
        }
    }

    public static final void k(o5f o5fVar, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(54427358);
        int i2 = 2;
        if ((((btsVar.k(o5fVar) ? 4 : 2) | i | 48) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            vqm vqmVar = new vqm(wwg.S(1763286679, true, new wc0(o5fVar, i2), btsVar));
            String str = o5fVar.b;
            if (str == null) {
                str = "";
            }
            crm crmVar = new crm(str, null, 14, 1);
            f530Var2 = c530.a;
            mrm.d(crmVar, vqmVar, f530Var2, oqm.a, false, null, null, null, null, null, btsVar, 3456, 0, 4080);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a6n(o5fVar, f530Var2, i, 14);
        }
    }

    public static final void l(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-607222342);
        if (((i | 6) & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            sqm sqmVar = new sqm(new aom(kbm.a(vqb1.e(wwg0.msg_ic_saved_messages, (Context) btsVar.m(AndroidCompositionLocals_androidKt.b)), btsVar)), null, 12);
            crm crmVar = new crm(ohb1.e(btsVar, oyh0.messaging_saved_messages_chat), null, 14, 1);
            c530 c530Var = c530.a;
            mrm.d(crmVar, sqmVar, c530Var, oqm.a, false, null, null, null, null, null, btsVar, 3456, 0, 4080);
            f530Var = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new os(f530Var, i, 18);
        }
    }

    public static final void m(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-27943325);
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, c);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            uo5 uo5Var = x4c.A;
            cj6 cj6Var = cj6.a;
            vpa1.a(an91.o(cj6Var.a(c530Var, uo5Var), 8.0f, 8.0f, 0.0f, 8.0f, 4), false, ButtonSize.M, (sls) btsVar.m(c3z.a), wwg.S(367939781, false, s12.a, btsVar), btsVar, 24960, 2);
            yyf0.a(cj6Var.a(c530Var, x4c.B), btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zbd(i, 16);
        }
    }

    public static final boolean n(float... fArr) {
        boolean z;
        boolean z2;
        int length = fArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (fArr[i] < 0.0f) {
                z = false;
                break;
            }
            i++;
        }
        int length2 = fArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                z2 = false;
                break;
            }
            if (fArr[i2] > 0.0f) {
                z2 = true;
                break;
            }
            i2++;
        }
        return z && z2;
    }

    public static final Drawable o(Drawable drawable, float f) {
        return f > 0.0f ? new RoundedDrawable(drawable, f, f, f, f) : drawable;
    }

    public static boolean p(s4r0 s4r0Var, Collection collection) {
        collection.getClass();
        if (collection instanceof s991) {
            collection = ((s991) collection).zza();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= s4r0Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= s4r0Var.remove(it.next());
            }
            return z;
        }
        Iterator<E> it2 = s4r0Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }
}
