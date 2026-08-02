package com.yandex.go.summary.ui.compose.expanded.content.tariffcard;

import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import defpackage.a7y;
import defpackage.adb1;
import defpackage.aii0;
import defpackage.akj0;
import defpackage.amj0;
import defpackage.apn0;
import defpackage.bkj0;
import defpackage.bli0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cex0;
import defpackage.cj6;
import defpackage.ckj0;
import defpackage.cma1;
import defpackage.cpo;
import defpackage.cvu0;
import defpackage.did;
import defpackage.dkj0;
import defpackage.drb1;
import defpackage.f530;
import defpackage.ffx;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.gr5;
import defpackage.hhp0;
import defpackage.htz0;
import defpackage.hx8;
import defpackage.hz8;
import defpackage.id00;
import defpackage.jeb1;
import defpackage.kj2;
import defpackage.ljs0;
import defpackage.lz40;
import defpackage.m3u0;
import defpackage.mfe0;
import defpackage.o430;
import defpackage.ob5;
import defpackage.ocx0;
import defpackage.ogo0;
import defpackage.ohd;
import defpackage.oxv0;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qje;
import defpackage.qor;
import defpackage.r1b0;
import defpackage.rcx0;
import defpackage.rs5;
import defpackage.s1a1;
import defpackage.s5w0;
import defpackage.sd2;
import defpackage.sls;
import defpackage.tls;
import defpackage.tpr;
import defpackage.vs9;
import defpackage.vuz;
import defpackage.vv8;
import defpackage.wls;
import defpackage.x4c;
import defpackage.yn91;
import defpackage.yur;
import defpackage.z910;
import defpackage.zhb0;
import defpackage.zpn;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class c {
    public static final void a(cex0 cex0Var, androidx.compose.foundation.lazy.b bVar, tls tlsVar, tpr tprVar, lz40 lz40Var, fid fidVar, int i) {
        int i2;
        androidx.compose.foundation.lazy.b bVar2;
        Object[] objArr;
        bts btsVar = (bts) fidVar;
        btsVar.g0(224021448);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(cex0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            bVar2 = bVar;
            i2 |= btsVar.k(bVar2) ? 32 : 16;
        } else {
            bVar2 = bVar;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar.k(tprVar) : btsVar.e(tprVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= (i & 32768) == 0 ? btsVar.k(lz40Var) : btsVar.e(lz40Var) ? 16384 : 8192;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            oz40 n = f.n(cex0Var, btsVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new oxv0(20);
                btsVar.o0(Q);
            }
            int i4 = ((i3 >> 6) & 14) | 48;
            tls g = yn91.g(tlsVar, (tls) Q, btsVar, i4);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new oxv0(21);
                btsVar.o0(Q2);
            }
            tls g2 = yn91.g(tlsVar, (tls) Q2, btsVar, i4);
            WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
            sd2 sd2Var = vuz.o(btsVar).g;
            fwi fwiVar = (fwi) btsVar.m(j.h);
            Object[] objArr2 = {tprVar, bVar2, tlsVar, lz40Var, sd2Var, fwiVar};
            boolean k = ((i3 & 7168) == 2048 || ((i3 & 4096) != 0 && btsVar.e(tprVar))) | btsVar.k(n) | ((i3 & 112) == 32) | btsVar.k(sd2Var) | btsVar.k(fwiVar) | ((57344 & i3) == 16384 || ((i3 & 32768) != 0 && btsVar.e(lz40Var))) | btsVar.k(g) | btsVar.k(g2);
            Object Q3 = btsVar.Q();
            if (k || Q3 == o430Var) {
                objArr = objArr2;
                TariffCardItemKt$CollectTariffCardComposeActionEffect$1$1 tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1 = new TariffCardItemKt$CollectTariffCardComposeActionEffect$1$1(tprVar, n, bVar, sd2Var, fwiVar, lz40Var, g, g2, null);
                btsVar.o0(tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1);
                Q3 = tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1;
            } else {
                objArr = objArr2;
            }
            zpn.h(objArr, (wls) Q3, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mfe0(cex0Var, bVar, tlsVar, tprVar, lz40Var, i, 7);
        }
    }

    public static final void b(ob5 ob5Var, ob5 ob5Var2, androidx.compose.foundation.lazy.b bVar, lz40 lz40Var, fid fidVar, int i) {
        ob5 ob5Var3;
        ob5 ob5Var4;
        androidx.compose.foundation.lazy.b bVar2;
        lz40 lz40Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-110397161);
        int i2 = (btsVar.k(ob5Var) ? 4 : 2) | i | (btsVar.k(ob5Var2) ? 32 : 16) | (btsVar.k(bVar) ? 256 : 128) | (btsVar.k(lz40Var) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                ob5Var3 = ob5Var;
                ob5Var4 = ob5Var2;
                bVar2 = bVar;
                lz40Var2 = lz40Var;
                TariffCardItemKt$ScrollCardAndCarouselToFirstElementUiActionEffect$1$1 tariffCardItemKt$ScrollCardAndCarouselToFirstElementUiActionEffect$1$1 = new TariffCardItemKt$ScrollCardAndCarouselToFirstElementUiActionEffect$1$1(ob5Var3, ob5Var4, bVar2, lz40Var2, null);
                btsVar.o0(tariffCardItemKt$ScrollCardAndCarouselToFirstElementUiActionEffect$1$1);
                Q = tariffCardItemKt$ScrollCardAndCarouselToFirstElementUiActionEffect$1$1;
            } else {
                ob5Var3 = ob5Var;
                ob5Var4 = ob5Var2;
                bVar2 = bVar;
                lz40Var2 = lz40Var;
            }
            zpn.f(ob5Var3, ob5Var4, (wls) Q, btsVar);
        } else {
            ob5Var3 = ob5Var;
            ob5Var4 = ob5Var2;
            bVar2 = bVar;
            lz40Var2 = lz40Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            lz40 lz40Var3 = lz40Var2;
            v.d = new zhb0(ob5Var3, ob5Var4, bVar2, lz40Var3, i, 19);
        }
    }

    public static final void c(ob5 ob5Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1223862416);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ob5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new TariffCardItemKt$SendBaseTariffInfoChangedUiActionEffect$1$1(tlsVar, ob5Var, null);
                btsVar.o0(Q);
            }
            zpn.f(ob5Var, tlsVar, (wls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(ob5Var, tlsVar, i, 29);
        }
    }

    public static final void d(androidx.compose.foundation.lazy.b bVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(618639425);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new oxv0(19);
                btsVar.o0(Q);
            }
            tls g = yn91.g(tlsVar, (tls) Q, btsVar, ((i2 >> 3) & 14) | 48);
            boolean k = btsVar.k(g) | ((i2 & 14) == 4);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new TariffCardItemKt$SendHeaderVisibleChangedUiActionEffect$1$1(bVar, g, null);
                btsVar.o0(Q2);
            }
            zpn.f(bVar, g, (wls) Q2, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ocx0(bVar, tlsVar, i, i3);
        }
    }

    public static final void e(androidx.compose.foundation.lazy.b bVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(770717957);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = f.d(new vs9(bVar, 19));
                btsVar.o0(Q);
            }
            m3u0 m3u0Var = (m3u0) Q;
            boolean k = btsVar.k(m3u0Var) | ((i2 & 112) == 32);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new TariffCardItemKt$SendLastItemVisibleChangedUiActionEffect$1$1(tlsVar, m3u0Var, null);
                btsVar.o0(Q2);
            }
            zpn.f(bVar, tlsVar, (wls) Q2, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ocx0(bVar, tlsVar, i, i3);
        }
    }

    public static final void f(androidx.compose.foundation.lazy.b bVar, ob5 ob5Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-838770691);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(ob5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = f.d(new vs9(bVar, 18));
                btsVar.o0(Q);
            }
            m3u0 m3u0Var = (m3u0) Q;
            boolean k = btsVar.k(m3u0Var) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new TariffCardItemKt$SendLastVisibleItemIndexChangedUiActionEffect$1$1(m3u0Var, tlsVar, ob5Var, null);
                btsVar.o0(Q2);
            }
            zpn.g(bVar, tlsVar, ob5Var, (wls) Q2, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(bVar, ob5Var, tlsVar, i, 23);
        }
    }

    public static final void g(cex0 cex0Var, f530 f530Var, tls tlsVar, tpr tprVar, yur yurVar, yur yurVar2, m3u0 m3u0Var, fid fidVar, int i) {
        int i2;
        tls tlsVar2;
        m3u0 m3u0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1505846880);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(cex0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            tlsVar2 = tlsVar;
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        } else {
            tlsVar2 = tlsVar;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar.k(tprVar) : btsVar.e(tprVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(yurVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.k(yurVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            m3u0Var2 = m3u0Var;
            i2 |= btsVar.k(m3u0Var2) ? 1048576 : 524288;
        } else {
            m3u0Var2 = m3u0Var;
        }
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(cex0Var);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(cex0Var);
                btsVar.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = id00.a(0.0f);
                btsVar.o0(Q3);
            }
            androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) Q3;
            int i3 = i2 & 8;
            zpn.e(btsVar, new TariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1(f.n(cex0Var, btsVar), oz40Var, oz40Var2, aVar, null, m3u0Var2), zy11.a);
            Object value = oz40Var.getValue();
            Object value2 = oz40Var2.getValue();
            kj2 kj2Var = aVar.d;
            int i4 = ((i3 | (i3 << 3)) & HProv.PP_DELETE_SAVED_PASSWD) | ((i2 << 3) & 896);
            int i5 = i2 << 6;
            h((cex0) value, (cex0) value2, f530Var, kj2Var, tlsVar2, tprVar, yurVar, yurVar2, btsVar, (i5 & 29360128) | i4 | (57344 & i5) | (458752 & i5) | (3670016 & i5));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cpo(cex0Var, f530Var, tlsVar, tprVar, yurVar, yurVar2, m3u0Var, i, 1);
        }
    }

    public static final void h(cex0 cex0Var, cex0 cex0Var2, f530 f530Var, m3u0 m3u0Var, tls tlsVar, tpr tprVar, yur yurVar, yur yurVar2, fid fidVar, int i) {
        int i2;
        bts btsVar;
        f530 f530Var2;
        boolean z;
        tls tlsVar2 = tlsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(876596906);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(cex0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(cex0Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.k(m3u0Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.e(tlsVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? btsVar2.k(tprVar) : btsVar2.e(tprVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar2.k(yurVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar2.k(yurVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if (btsVar2.V(i2 & 1, (i2 & 4793491) != 4793490)) {
            androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar2);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ffx.c(0, 0, null, 7);
                btsVar2.o0(Q);
            }
            lz40 lz40Var = (lz40) Q;
            int i3 = i2 >> 6;
            c530 c530Var = c530.a;
            f530 a2 = bli0.a(c530Var, m3u0Var, btsVar2, (i3 & 112) | 390, 0);
            int i4 = i2 & 7168;
            boolean z2 = i4 == 2048;
            Object Q2 = btsVar2.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = jeb1.g(f.d(new gr5(m3u0Var, 16)));
                btsVar2.o0(Q2);
            }
            qor qorVar = (qor) Q2;
            int i5 = i3 & 896;
            int i6 = ((i2 >> 3) & 14) | i5 | (i3 & 7168);
            int i7 = i2;
            a(cex0Var2, a, tlsVar2, tprVar, lz40Var, btsVar2, i6);
            ob5 ob5Var = cex0Var.b;
            ob5 ob5Var2 = cex0Var2.b;
            b(ob5Var, ob5Var2, a, lz40Var, btsVar2, 0);
            int i8 = (i7 >> 9) & 112;
            d(a, tlsVar, btsVar2, i8);
            e(a, tlsVar, btsVar2, i8);
            f(a, ob5Var2, tlsVar, btsVar2, i5);
            c(ob5Var2, tlsVar, btsVar2, i8);
            f530 k = f530Var.k(ljs0.c);
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
                Q3 = new oxv0(22);
                btsVar2.o0(Q3);
            }
            f530 b = fnq0.b(k, false, (tls) Q3);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar2, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, d);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d2);
            f530 g = s1a1.g(c530Var, 1.0f);
            Object Q4 = btsVar2.Q();
            if (Q4 == o430Var) {
                Q4 = new oxv0(23);
                btsVar2.o0(Q4);
            }
            f530 b2 = fnq0.b(g, false, (tls) Q4);
            htz0 htz0Var = cex0Var.c;
            Object Q5 = btsVar2.Q();
            if (Q5 == o430Var) {
                Q5 = new oxv0(24);
                btsVar2.o0(Q5);
            }
            int i9 = i7 >> 12;
            int i10 = (i9 & 14) | 48;
            drb1.b(htz0Var, b2, yurVar, yn91.g(tlsVar, (tls) Q5, btsVar2, i10), btsVar2, i9 & 896);
            int i11 = i7 & 14;
            boolean z3 = i11 == 4;
            Object Q6 = btsVar2.Q();
            if (z3 || Q6 == o430Var) {
                Q6 = new s5w0(10, cex0Var);
                btsVar2.o0(Q6);
            }
            f530 b3 = fnq0.b(c530Var, false, (tls) Q6);
            boolean k2 = (i11 == 4) | btsVar2.k(a2) | btsVar2.k(qorVar) | ((57344 & i7) == 16384) | (i4 == 2048) | ((29360128 & i7) == 8388608) | btsVar2.e(lz40Var);
            Object Q7 = btsVar2.Q();
            if (k2 || Q7 == o430Var) {
                btsVar = btsVar2;
                f530Var2 = a2;
                z = false;
                tlsVar2 = tlsVar;
                rs5 rs5Var = new rs5(cex0Var, f530Var2, qorVar, tlsVar2, m3u0Var, yurVar2, lz40Var, 12);
                btsVar.o0(rs5Var);
                Q7 = rs5Var;
            } else {
                btsVar = btsVar2;
                f530Var2 = a2;
                z = false;
                tlsVar2 = tlsVar;
            }
            boolean z4 = z;
            bts btsVar3 = btsVar;
            adb1.a(b3, a, null, null, null, null, false, null, (tls) Q7, btsVar3, 0, 508);
            btsVar2 = btsVar3;
            f530 a3 = cj6.a.a(c530Var, x4c.B);
            Object Q8 = btsVar2.Q();
            if (Q8 == o430Var) {
                Q8 = new oxv0(25);
                btsVar2.o0(Q8);
            }
            f530 k3 = fnq0.b(a3, z4, (tls) Q8).k(f530Var2);
            hhp0 hhp0Var = cex0Var.e;
            Object Q9 = btsVar2.Q();
            if (Q9 == o430Var) {
                Q9 = new oxv0(26);
                btsVar2.o0(Q9);
            }
            com.yandex.go.summary.ui.compose.expanded.content.tariffcard.scrollbutton.a.b(hhp0Var, k3, yn91.g(tlsVar2, (tls) Q9, btsVar2, i10), btsVar2, z4 ? 1 : 0);
            btsVar2.t(true);
        } else {
            btsVar2.Y();
        }
        aii0 v = btsVar2.v();
        if (v != null) {
            v.d = new vv8(cex0Var, cex0Var2, f530Var, m3u0Var, tlsVar2, tprVar, yurVar, yurVar2, i, 2);
        }
    }

    public static final dkj0 i(String str, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            rcx0 rcx0Var = (rcx0) it.next();
            if (cvu0.x(rcx0Var.getId(), str, false) && (rcx0Var instanceof amj0)) {
                break;
            }
            i++;
        }
        if (i != -1) {
            Object obj = list.get(i);
            amj0 amj0Var = obj instanceof amj0 ? (amj0) obj : null;
            if (amj0Var != null) {
                return new bkj0(i, amj0Var);
            }
        } else {
            Iterator it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (((rcx0) it2.next()) instanceof hz8) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                Object obj2 = list.get(i2);
                hz8 hz8Var = obj2 instanceof hz8 ? (hz8) obj2 : null;
                if (hz8Var != null) {
                    List list2 = hz8Var.a.a;
                    Iterator it3 = list2.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        if (cvu0.x(((hx8) it3.next()).c, str, false)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 != -1) {
                        return new akj0(i2, i3, (hx8) list2.get(i3));
                    }
                }
            }
        }
        return ckj0.a;
    }
}
