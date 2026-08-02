package com.yandex.go.summary.ui.compose.common.bottomsheet;

import android.view.View;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.m;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.summary.ui.compose.common.bottomsheet.i;
import defpackage.a72;
import defpackage.aii0;
import defpackage.aiv0;
import defpackage.bms;
import defpackage.bts;
import defpackage.but0;
import defpackage.c530;
import defpackage.c6a1;
import defpackage.cex0;
import defpackage.cgb1;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.did;
import defpackage.dtr0;
import defpackage.e4b1;
import defpackage.erb1;
import defpackage.es60;
import defpackage.f0;
import defpackage.f530;
import defpackage.fid;
import defpackage.gp5;
import defpackage.gpo;
import defpackage.gyt0;
import defpackage.jeb1;
import defpackage.jtz0;
import defpackage.k3r;
import defpackage.lg6;
import defpackage.ljs0;
import defpackage.ls40;
import defpackage.lx40;
import defpackage.m3u0;
import defpackage.m8u0;
import defpackage.mi91;
import defpackage.mta1;
import defpackage.nga1;
import defpackage.nvs0;
import defpackage.o430;
import defpackage.ogo0;
import defpackage.ohd;
import defpackage.omu0;
import defpackage.pi6;
import defpackage.q62;
import defpackage.qje;
import defpackage.qor;
import defpackage.r1b0;
import defpackage.s1a1;
import defpackage.sls;
import defpackage.t0;
import defpackage.tls;
import defpackage.tpr;
import defpackage.vg0;
import defpackage.w0s;
import defpackage.wg6;
import defpackage.whv0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xlp0;
import defpackage.yn91;
import defpackage.ytk0;
import defpackage.yur;
import defpackage.z910;
import defpackage.ze6;
import defpackage.zpn;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class i {
    public static final void a(w0s w0sVar, w0s w0sVar2, qor qorVar, m3u0 m3u0Var, tls tlsVar, tls tlsVar2, yur yurVar, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1502405969);
        int i2 = i | (btsVar.k(w0sVar) ? 4 : 2) | (btsVar.k(w0sVar2) ? 32 : 16) | (btsVar.k(qorVar) ? 256 : 128) | (btsVar.k(m3u0Var) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192) | (btsVar.e(tlsVar2) ? 131072 : 65536) | (btsVar.k(yurVar) ? 1048576 : 524288) | 12582912;
        if (btsVar.V(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = androidx.compose.runtime.f.d(new xlp0(16, m3u0Var, w0sVar2, w0sVar));
                btsVar.o0(Q);
            }
            m3u0 m3u0Var2 = (m3u0) Q;
            boolean z2 = (w0sVar2 != null ? w0sVar2.b : null) != null;
            boolean a = btsVar.a(z2) | ((i2 & 896) == 256);
            Object Q2 = btsVar.Q();
            if (a || Q2 == o430Var) {
                Q2 = z2 ? androidx.compose.runtime.f.f(1.0f) : qorVar;
                btsVar.o0(Q2);
            }
            w0s w0sVar3 = (w0s) m3u0Var2.getValue();
            int i3 = i2 >> 6;
            int i4 = ((i2 >> 3) & ImageMetadata.JPEG_GPS_COORDINATES) | (i3 & 7168) | (i3 & 896) | 48;
            c530 c530Var = c530.a;
            mi91.d(w0sVar3, c530Var, tlsVar, tlsVar2, (qor) Q2, yurVar, btsVar, i4, 0);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ze6(w0sVar, w0sVar2, qorVar, m3u0Var, tlsVar, tlsVar2, yurVar, f530Var2, i);
        }
    }

    public static final void b(final q62 q62Var, final cex0 cex0Var, final qor qorVar, final qor qorVar2, final m3u0 m3u0Var, final m3u0 m3u0Var2, final wg6 wg6Var, final lx40 lx40Var, final yur yurVar, final yur yurVar2, final tls tlsVar, final tls tlsVar2, final tls tlsVar3, final tpr tprVar, final f530 f530Var, fid fidVar, final int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1855430238);
        int i3 = i | (btsVar.k(q62Var) ? 4 : 2) | (btsVar.k(cex0Var) ? 32 : 16) | (btsVar.k(qorVar) ? 256 : 128) | (btsVar.k(qorVar2) ? 2048 : 1024) | (btsVar.k(m3u0Var) ? 16384 : 8192) | (btsVar.k(m3u0Var2) ? 131072 : 65536) | (btsVar.k(wg6Var) ? 1048576 : 524288) | (btsVar.k(lx40Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar.k(yurVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | (btsVar.k(yurVar2) ? 536870912 : SelfTester_JCP.IMITA);
        int i4 = (btsVar.e(tlsVar) ? 4 : 2) | (btsVar.e(tlsVar2) ? 32 : 16) | (btsVar.e(tlsVar3) ? 256 : 128) | (btsVar.k(tprVar) ? 2048 : 1024) | (btsVar.k(f530Var) ? 16384 : 8192);
        if (btsVar.V(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 9363) == 9362) ? false : true)) {
            int i5 = i4 >> 9;
            boolean z = (((i5 & 14) ^ 6) > 4 && btsVar.k(tprVar)) || (i5 & 6) == 4;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new b(tprVar);
                btsVar.o0(Q);
            }
            tpr tprVar2 = (tpr) Q;
            k3r k3rVar = ljs0.c;
            f530 k = f530Var.k(k3rVar);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, k);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            f530 g = s1a1.g(c6a1.p(wg6Var, lx40Var), ((Boolean) m3u0Var.getValue()).booleanValue() ? 1.0f : 0.0f);
            boolean z2 = (i3 & 896) == 256;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new f0(qorVar, 8);
                btsVar.o0(Q2);
            }
            f530 a = androidx.compose.ui.graphics.d.a(g, (tls) Q2);
            int i6 = i4 << 3;
            mta1.a(q62Var, a, tlsVar, tlsVar3, qorVar, btsVar, ((i3 << 6) & HProv.ALG_CLASS_ALL) | (i3 & 14) | ((i4 << 6) & 896) | (i6 & 7168));
            if (cex0Var != null) {
                btsVar.e0(2136435926);
                f530 g2 = s1a1.g(k3rVar, !((Boolean) m3u0Var.getValue()).booleanValue() ? 1.0f : 0.0f);
                boolean z3 = (i3 & 7168) == 2048;
                Object Q3 = btsVar.Q();
                if (z3 || Q3 == o430Var) {
                    Q3 = new f0(qorVar2, 9);
                    btsVar.o0(Q3);
                }
                int i7 = i3 >> 12;
                nga1.a(cex0Var, androidx.compose.ui.graphics.d.a(g2, (tls) Q3), tlsVar2, tprVar2, yurVar, yurVar2, m3u0Var2, btsVar, ((i3 >> 3) & 14) | (i6 & 896) | (i7 & HProv.ALG_CLASS_ALL) | (i7 & ImageMetadata.JPEG_GPS_COORDINATES) | ((i3 << 3) & 3670016));
                btsVar = btsVar;
                i2 = 0;
                btsVar.t(false);
            } else {
                i2 = 0;
                btsVar.e0(2137183770);
                btsVar.t(false);
            }
            e4b1.b(cj6.a.b(c530.a), btsVar, i2);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(cex0Var, qorVar, qorVar2, m3u0Var, m3u0Var2, wg6Var, lx40Var, yurVar, yurVar2, tlsVar, tlsVar2, tlsVar3, tprVar, f530Var, i) { // from class: xhv0
                public final /* synthetic */ lx40 A;
                public final /* synthetic */ yur B;
                public final /* synthetic */ yur C;
                public final /* synthetic */ tls D;
                public final /* synthetic */ tls E;
                public final /* synthetic */ tls F;
                public final /* synthetic */ tpr G;
                public final /* synthetic */ f530 H;
                public final /* synthetic */ cex0 b;
                public final /* synthetic */ qor c;
                public final /* synthetic */ qor w;
                public final /* synthetic */ m3u0 x;
                public final /* synthetic */ m3u0 y;
                public final /* synthetic */ wg6 z;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(1);
                    i.b(q62.this, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void c(tpr tprVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1818251677);
        int i2 = (btsVar.k(tprVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
            boolean e = btsVar.e(view) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new SummaryModalBottomSheetKt$CollectAccessibilityComposeActionEffect$1$1(tprVar, view, null);
                btsVar.o0(Q);
            }
            zpn.f(tprVar, view, (wls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new but0(tprVar, i, 6);
        }
    }

    public static final void d(tpr tprVar, wg6 wg6Var, lx40 lx40Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1885960897);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(tprVar) : btsVar.e(tprVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(wg6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(lx40Var) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && btsVar.e(tprVar))) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new SummaryModalBottomSheetKt$CollectSummaryBottomSheetComposeActionEffect$1$1(tprVar, wg6Var, lx40Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, tprVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(tprVar, wg6Var, lx40Var, i, 21);
        }
    }

    public static final void e(jtz0 jtz0Var, qor qorVar, wg6 wg6Var, yur yurVar, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-444848334);
        int i2 = i | (btsVar.k(jtz0Var) ? 4 : 2) | (btsVar.k(qorVar) ? 32 : 16) | (btsVar.k(wg6Var) ? 256 : 128) | (btsVar.k(yurVar) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192) | ImageMetadata.EDGE_MODE;
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new f0(qorVar, 7);
                btsVar.o0(Q);
            }
            c530 c530Var = c530.a;
            f530 a = androidx.compose.ui.graphics.d.a(c530Var, (tls) Q);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new omu0(20);
                btsVar.o0(Q2);
            }
            erb1.e(jtz0Var, wg6Var, a, yurVar, yn91.g(tlsVar, (tls) Q2, btsVar, ((i2 >> 12) & 14) | 48), btsVar, (i2 & 14) | ((i2 >> 3) & 112) | (i2 & 7168), 0);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t0(jtz0Var, qorVar, wg6Var, yurVar, tlsVar, f530Var2, i);
        }
    }

    public static final void f(wg6 wg6Var, int i, tls tlsVar, fid fidVar, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-412118214);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.k(wg6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.c(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            dtr0 dtr0Var = new dtr0(i);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new SummaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1(i, wg6Var, tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.g(wg6Var, dtr0Var, tlsVar, (wls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new whv0(wg6Var, i, tlsVar, i2, 0);
        }
    }

    public static final void g(wg6 wg6Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1269112318);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(wg6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new SummaryModalBottomSheetKt$SendSummaryBottomSheetStateChangedUiActionEffect$1$1(wg6Var, tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.f(wg6Var, tlsVar, (wls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ytk0(wg6Var, tlsVar, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final aiv0 aiv0Var, f530 f530Var, final wg6 wg6Var, final yur yurVar, final yur yurVar2, final yur yurVar3, final yur yurVar4, final tls tlsVar, final tls tlsVar2, final tpr tprVar, fid fidVar, final int i) {
        int i2;
        bts btsVar;
        final f530 f530Var2;
        f530 f530Var3;
        qor qorVar;
        boolean z;
        Object Q;
        boolean z2;
        Object Q2;
        boolean z3;
        Object Q3;
        boolean k;
        Object Q4;
        boolean z4;
        Object Q5;
        boolean z5;
        Object Q6;
        Object Q7;
        Object Q8;
        Object Q9;
        tls tlsVar3;
        Object Q10;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-703712623);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(aiv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar2.k(wg6Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.k(yurVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.k(yurVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= btsVar2.k(yurVar3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= btsVar2.k(yurVar4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= btsVar2.e(tlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i3 |= btsVar2.e(tlsVar2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((805306368 & i) == 0) {
            i3 |= (1073741824 & i) == 0 ? btsVar2.k(tprVar) : btsVar2.e(tprVar) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if (btsVar2.V(i3 & 1, (306783379 & i3) != 306783378)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                f530Var3 = c530.a;
            } else {
                btsVar2.Y();
                f530Var3 = f530Var;
            }
            btsVar2.u();
            int i4 = i3 >> 6;
            int i5 = i4 & 14;
            int i6 = i3;
            final lx40 f = erb1.f(wg6Var, true, 0, btsVar2, i5 | 48, 6);
            int i7 = (i6 & 896) ^ 384;
            boolean z6 = (i7 > 256 && btsVar2.k(wg6Var)) || (i6 & 384) == 256;
            Object Q11 = btsVar2.Q();
            Object obj = did.a;
            if (z6 || Q11 == obj) {
                Q11 = jeb1.g(androidx.compose.runtime.f.d(new gp5(wg6Var, 22)));
                btsVar2.o0(Q11);
            }
            final qor qorVar2 = (qor) Q11;
            boolean z7 = (i7 > 256 && btsVar2.k(wg6Var)) || (i6 & 384) == 256;
            Object Q12 = btsVar2.Q();
            if (z7 || Q12 == obj) {
                Q12 = jeb1.g(androidx.compose.runtime.f.d(new gp5(wg6Var, 23)));
                btsVar2.o0(Q12);
            }
            qor qorVar3 = (qor) Q12;
            if (i7 <= 256 || !btsVar2.k(wg6Var)) {
                qorVar = qorVar3;
                if ((i6 & 384) != 256) {
                    z = false;
                    Q = btsVar2.Q();
                    if (!z || Q == obj) {
                        Q = androidx.compose.runtime.f.d(new gp5(wg6Var, 24));
                        btsVar2.o0(Q);
                    }
                    final m3u0 m3u0Var = (m3u0) Q;
                    z2 = (i7 <= 256 && btsVar2.k(wg6Var)) || (i6 & 384) == 256;
                    Q2 = btsVar2.Q();
                    if (!z2 || Q2 == obj) {
                        Q2 = androidx.compose.runtime.f.d(new gyt0(8, wg6Var, f));
                        btsVar2.o0(Q2);
                    }
                    final m3u0 m3u0Var2 = (m3u0) Q2;
                    z3 = ((i5 ^ 6) <= 4 && btsVar2.k(wg6Var)) || (i4 & 6) == 4;
                    Q3 = btsVar2.Q();
                    if (!z3 || Q3 == obj) {
                        Q3 = jeb1.g(androidx.compose.runtime.f.e(new gp5(wg6Var, 21), x4c.Q));
                        btsVar2.o0(Q3);
                    }
                    qor qorVar4 = (qor) Q3;
                    k = btsVar2.k(qorVar4);
                    Q4 = btsVar2.Q();
                    if (!k || Q4 == obj) {
                        Q4 = new lg6(AppColor$Palette.Fog, qorVar4, null);
                        btsVar2.o0(Q4);
                    }
                    lg6 lg6Var = (lg6) Q4;
                    int i8 = i6 >> 27;
                    int i9 = (i8 & 14) ^ 6;
                    z4 = (i9 <= 4 && btsVar2.k(tprVar)) || (i8 & 6) == 4;
                    Q5 = btsVar2.Q();
                    if (!z4 || Q5 == obj) {
                        Q5 = new f(tprVar);
                        btsVar2.o0(Q5);
                    }
                    tpr tprVar2 = (tpr) Q5;
                    z5 = (i9 <= 4 && btsVar2.k(tprVar)) || (i8 & 6) == 4;
                    Q6 = btsVar2.Q();
                    if (!z5 || Q6 == obj) {
                        Q6 = new h(tprVar);
                        btsVar2.o0(Q6);
                    }
                    tpr tprVar3 = (tpr) Q6;
                    Q7 = btsVar2.Q();
                    if (Q7 == obj) {
                        Q7 = new omu0(21);
                        btsVar2.o0(Q7);
                    }
                    int i10 = ((i6 >> 21) & 14) | 48;
                    final tls g = yn91.g(tlsVar, (tls) Q7, btsVar2, i10);
                    Q8 = btsVar2.Q();
                    if (Q8 == obj) {
                        Q8 = new omu0(17);
                        btsVar2.o0(Q8);
                    }
                    tls g2 = yn91.g(tlsVar, (tls) Q8, btsVar2, i10);
                    Q9 = btsVar2.Q();
                    if (Q9 != obj) {
                        tlsVar3 = g2;
                        Q9 = new omu0(18);
                        btsVar2.o0(Q9);
                    } else {
                        tlsVar3 = g2;
                    }
                    tls g3 = yn91.g(tlsVar, (tls) Q9, btsVar2, i10);
                    Q10 = btsVar2.Q();
                    if (Q10 == obj) {
                        Q10 = new omu0(19);
                        btsVar2.o0(Q10);
                    }
                    tls g4 = yn91.g(tlsVar, (tls) Q10, btsVar2, i10);
                    int i11 = i6 >> 3;
                    int i12 = i11 & 112;
                    d(tprVar2, wg6Var, f, btsVar2, i12);
                    c(tprVar3, btsVar2, 0);
                    g(wg6Var, g4, btsVar2, i5);
                    f(wg6Var, f.b, g4, btsVar2, i5);
                    a72 a72Var = aiv0Var.a;
                    m8u0 m8u0Var = a72Var.a;
                    jtz0 jtz0Var = a72Var.b;
                    final q62 q62Var = a72Var.c;
                    w0s w0sVar = a72Var.d;
                    gpo gpoVar = aiv0Var.b;
                    m8u0 m8u0Var2 = gpoVar == null ? gpoVar.c : null;
                    cex0 cex0Var = gpoVar == null ? gpoVar.a : null;
                    w0s w0sVar2 = gpoVar == null ? gpoVar.b : null;
                    final cex0 cex0Var2 = cex0Var;
                    final qor qorVar5 = qorVar;
                    final tls tlsVar4 = tlsVar3;
                    f530Var2 = f530Var3;
                    com.yandex.go.design.compose.modal.bottomsheet.c.a(f530Var2, wg6Var, lg6Var, false, false, null, null, wwg.S(17062623, true, new ls40(23, m8u0Var, m8u0Var2, m3u0Var), btsVar2), wwg.S(-58775938, true, new vg0((Object) jtz0Var, (Object) qorVar5, (Object) wg6Var, (Object) yurVar, g, 14), btsVar2), null, wwg.S(-668309091, true, new es60(w0sVar, w0sVar2, qorVar5, m3u0Var, g3, tlsVar2, yurVar4), btsVar2), wwg.S(-1113738767, true, new bms() { // from class: yhv0
                        @Override // defpackage.bms
                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            f530 a;
                            j690 j690Var = (j690) obj3;
                            fid fidVar2 = (fid) obj4;
                            int intValue = ((Integer) obj5).intValue();
                            if ((intValue & 48) == 0) {
                                intValue |= ((bts) fidVar2).k(j690Var) ? 32 : 16;
                            }
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.V(intValue & 1, (intValue & 145) != 144)) {
                                qor qorVar6 = qor.this;
                                boolean k2 = btsVar3.k(qorVar6);
                                Object Q13 = btsVar3.Q();
                                if (k2 || Q13 == did.a) {
                                    Q13 = jeb1.g(f.d(new fr5(qorVar6, 2)));
                                    btsVar3.o0(Q13);
                                }
                                ((nx2) btsVar3.m(uy2.c)).getClass();
                                a = b.a(c530.a, m.a(), new u5(26, AppColor$Palette.Background, (qor) Q13));
                                i.b(q62Var, cex0Var2, qorVar5, qorVar6, m3u0Var, m3u0Var2, wg6Var, f, yurVar2, yurVar3, g, tlsVar4, tlsVar2, tprVar, an91.j(a, j690Var), btsVar3, 0);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar2), btsVar2, 113273856 | (i11 & 14) | i12, 54, 608);
                    btsVar = btsVar2;
                }
            } else {
                qorVar = qorVar3;
            }
            z = true;
            Q = btsVar2.Q();
            if (!z) {
            }
            Q = androidx.compose.runtime.f.d(new gp5(wg6Var, 24));
            btsVar2.o0(Q);
            final m3u0 m3u0Var3 = (m3u0) Q;
            if (i7 <= 256) {
            }
            Q2 = btsVar2.Q();
            if (!z2) {
            }
            Q2 = androidx.compose.runtime.f.d(new gyt0(8, wg6Var, f));
            btsVar2.o0(Q2);
            final m3u0 m3u0Var22 = (m3u0) Q2;
            if ((i5 ^ 6) <= 4) {
            }
            Q3 = btsVar2.Q();
            if (!z3) {
            }
            Q3 = jeb1.g(androidx.compose.runtime.f.e(new gp5(wg6Var, 21), x4c.Q));
            btsVar2.o0(Q3);
            qor qorVar42 = (qor) Q3;
            k = btsVar2.k(qorVar42);
            Q4 = btsVar2.Q();
            if (!k) {
            }
            Q4 = new lg6(AppColor$Palette.Fog, qorVar42, null);
            btsVar2.o0(Q4);
            lg6 lg6Var2 = (lg6) Q4;
            int i82 = i6 >> 27;
            int i92 = (i82 & 14) ^ 6;
            if (i92 <= 4) {
            }
            Q5 = btsVar2.Q();
            if (!z4) {
            }
            Q5 = new f(tprVar);
            btsVar2.o0(Q5);
            tpr tprVar22 = (tpr) Q5;
            if (i92 <= 4) {
            }
            Q6 = btsVar2.Q();
            if (!z5) {
            }
            Q6 = new h(tprVar);
            btsVar2.o0(Q6);
            tpr tprVar32 = (tpr) Q6;
            Q7 = btsVar2.Q();
            if (Q7 == obj) {
            }
            int i102 = ((i6 >> 21) & 14) | 48;
            final tls g5 = yn91.g(tlsVar, (tls) Q7, btsVar2, i102);
            Q8 = btsVar2.Q();
            if (Q8 == obj) {
            }
            tls g22 = yn91.g(tlsVar, (tls) Q8, btsVar2, i102);
            Q9 = btsVar2.Q();
            if (Q9 != obj) {
            }
            tls g32 = yn91.g(tlsVar, (tls) Q9, btsVar2, i102);
            Q10 = btsVar2.Q();
            if (Q10 == obj) {
            }
            tls g42 = yn91.g(tlsVar, (tls) Q10, btsVar2, i102);
            int i112 = i6 >> 3;
            int i122 = i112 & 112;
            d(tprVar22, wg6Var, f, btsVar2, i122);
            c(tprVar32, btsVar2, 0);
            g(wg6Var, g42, btsVar2, i5);
            f(wg6Var, f.b, g42, btsVar2, i5);
            a72 a72Var2 = aiv0Var.a;
            m8u0 m8u0Var3 = a72Var2.a;
            jtz0 jtz0Var2 = a72Var2.b;
            final q62 q62Var2 = a72Var2.c;
            w0s w0sVar3 = a72Var2.d;
            gpo gpoVar2 = aiv0Var.b;
            if (gpoVar2 == null) {
            }
            if (gpoVar2 == null) {
            }
            if (gpoVar2 == null) {
            }
            final cex0 cex0Var22 = cex0Var;
            final qor qorVar52 = qorVar;
            final tls tlsVar42 = tlsVar3;
            f530Var2 = f530Var3;
            com.yandex.go.design.compose.modal.bottomsheet.c.a(f530Var2, wg6Var, lg6Var2, false, false, null, null, wwg.S(17062623, true, new ls40(23, m8u0Var3, m8u0Var2, m3u0Var3), btsVar2), wwg.S(-58775938, true, new vg0((Object) jtz0Var2, (Object) qorVar52, (Object) wg6Var, (Object) yurVar, g5, 14), btsVar2), null, wwg.S(-668309091, true, new es60(w0sVar3, w0sVar2, qorVar52, m3u0Var3, g32, tlsVar2, yurVar4), btsVar2), wwg.S(-1113738767, true, new bms() { // from class: yhv0
                @Override // defpackage.bms
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    f530 a;
                    j690 j690Var = (j690) obj3;
                    fid fidVar2 = (fid) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 48) == 0) {
                        intValue |= ((bts) fidVar2).k(j690Var) ? 32 : 16;
                    }
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.V(intValue & 1, (intValue & 145) != 144)) {
                        qor qorVar6 = qor.this;
                        boolean k2 = btsVar3.k(qorVar6);
                        Object Q13 = btsVar3.Q();
                        if (k2 || Q13 == did.a) {
                            Q13 = jeb1.g(f.d(new fr5(qorVar6, 2)));
                            btsVar3.o0(Q13);
                        }
                        ((nx2) btsVar3.m(uy2.c)).getClass();
                        a = b.a(c530.a, m.a(), new u5(26, AppColor$Palette.Background, (qor) Q13));
                        i.b(q62Var2, cex0Var22, qorVar52, qorVar6, m3u0Var3, m3u0Var22, wg6Var, f, yurVar2, yurVar3, g5, tlsVar42, tlsVar2, tprVar, an91.j(a, j690Var), btsVar3, 0);
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            }, btsVar2), btsVar2, 113273856 | (i112 & 14) | i122, 54, 608);
            btsVar = btsVar2;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: zhv0
                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    i.h(aiv0.this, f530Var2, wg6Var, yurVar, yurVar2, yurVar3, yurVar4, tlsVar, tlsVar2, tprVar, (fid) obj2, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void i(m8u0 m8u0Var, m8u0 m8u0Var2, m3u0 m3u0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2136111849);
        int i2 = (btsVar.k(m8u0Var) ? 4 : 2) | i | (btsVar.k(m8u0Var2) ? 32 : 16) | (btsVar.k(m3u0Var) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean a = ((i2 & 14) == 4) | btsVar.a(((Boolean) m3u0Var.getValue()).booleanValue()) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (a || Q == did.a) {
                Q = (((Boolean) m3u0Var.getValue()).booleanValue() || m8u0Var2 == null) ? m8u0Var : m8u0Var2;
                btsVar.o0(Q);
            }
            cgb1.a((m8u0) Q, btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0(m8u0Var, m8u0Var2, m3u0Var, i, 3);
        }
    }
}
