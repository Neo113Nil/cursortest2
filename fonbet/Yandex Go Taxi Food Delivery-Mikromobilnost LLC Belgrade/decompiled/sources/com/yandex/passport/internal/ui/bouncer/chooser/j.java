package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.internal.ui.bouncer.model.q2;
import defpackage.agc;
import defpackage.aii0;
import defpackage.b3b1;
import defpackage.bts;
import defpackage.c530;
import defpackage.dgc;
import defpackage.did;
import defpackage.f530;
import defpackage.f5z;
import defpackage.fid;
import defpackage.gji0;
import defpackage.ljs0;
import defpackage.m4m0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.q7u;
import defpackage.qke;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.vng;
import defpackage.w8f;
import defpackage.wls;
import defpackage.yr31;
import defpackage.zpn;
import defpackage.zy11;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public abstract class j {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if ((r28 & 8) != 0) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final b bVar, final sls slsVar, final tls tlsVar, String str, fid fidVar, final int i, final int i2) {
        int i3;
        String str2;
        bts btsVar;
        boolean z;
        final String str3;
        int i4;
        gji0 gji0Var = qke.q;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(500217520);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? btsVar2.k(bVar) : btsVar2.e(bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar2.e(slsVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            if ((i2 & 8) == 0) {
                str2 = str;
                if (btsVar2.k(str2)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                str2 = str;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            str2 = str;
        }
        if ((i3 & 1171) == 1170 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
            str3 = str2;
        } else {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                if ((i2 & 8) != 0) {
                    str2 = qoi0.a(c0.class).c();
                    if (str2 == null) {
                        str2 = "BouncerMasterChooserScreen";
                    }
                    i3 &= -7169;
                }
                int i5 = i3;
                final String str4 = str2;
                btsVar2.u();
                w viewModelFactory = bVar.getViewModelFactory();
                rs31 a = f5z.a(btsVar2);
                if (a == null) {
                    ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                yr31 G = ooc.G(qoi0.a(c0.class), a, str4, viewModelFactory, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar2);
                btsVar = btsVar2;
                c0 c0Var = (c0) G;
                btsVar.e0(1016319935);
                boolean z2 = (i5 & 112) == 32;
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (z2 || Q == o430Var) {
                    Q = new com.yandex.passport.internal.flags.presentation.k(10, slsVar);
                    btsVar.o0(Q);
                }
                btsVar.t(false);
                b3b1.a(false, (sls) Q, btsVar, 0, 1);
                oz40 b = androidx.compose.runtime.f.b(c0Var.c, btsVar);
                q2 q2Var = ((a0) b.getValue()).c;
                btsVar.e0(1016323647);
                if (q2Var != null) {
                    btsVar.e0(1857901045);
                    boolean e = ((i5 & 896) == 256) | btsVar.e(q2Var);
                    Object Q2 = btsVar.Q();
                    if (e || Q2 == o430Var) {
                        Q2 = new BouncerMasterChooserScreenKt$BouncerMasterChooserScreen$2$1$1(tlsVar, q2Var, null);
                        btsVar.o0(Q2);
                    }
                    btsVar.t(false);
                    zpn.e(btsVar, (wls) Q2, zy11.a);
                }
                btsVar.t(false);
                Throwable th = ((a0) b.getValue()).d;
                btsVar.e0(1016327221);
                if (th != null) {
                    com.yandex.passport.internal.ui.common.screen.f.a(th, true, !bVar.isWhiteLabel(), slsVar, btsVar, ((i5 << 6) & 7168) | 48, 0);
                    btsVar.t(false);
                    aii0 v = btsVar.v();
                    if (v != null) {
                        final int i6 = 0;
                        v.d = new wls() { // from class: com.yandex.passport.internal.ui.bouncer.chooser.i
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i7 = i6;
                                zy11 zy11Var = zy11.a;
                                int i8 = i;
                                switch (i7) {
                                    case 0:
                                        ((Integer) obj2).intValue();
                                        int O = vng.O(i8 | 1);
                                        j.a(bVar, slsVar, tlsVar, str4, (fid) obj, O, i2);
                                        break;
                                    case 1:
                                        ((Integer) obj2).intValue();
                                        int O2 = vng.O(i8 | 1);
                                        j.a(bVar, slsVar, tlsVar, str4, (fid) obj, O2, i2);
                                        break;
                                    case 2:
                                        ((Integer) obj2).intValue();
                                        int O3 = vng.O(i8 | 1);
                                        j.a(bVar, slsVar, tlsVar, str4, (fid) obj, O3, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).intValue();
                                        int O4 = vng.O(i8 | 1);
                                        j.a(bVar, slsVar, tlsVar, str4, (fid) obj, O4, i2);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        return;
                    }
                    return;
                }
                btsVar.t(false);
                btsVar.e0(1016335029);
                if (((a0) b.getValue()).b != null) {
                    com.yandex.passport.common.ui.progress.g progressProperties = bVar.getProgressProperties();
                    f530 b2 = m4m0.b(c530.a, ((agc) btsVar.m(dgc.a)).n, gji0Var);
                    com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
                    com.yandex.passport.common.ui.progress.p.d(b2, progressProperties, false, btsVar, 0, 4);
                    btsVar.t(false);
                    aii0 v2 = btsVar.v();
                    if (v2 != null) {
                        final int i7 = 1;
                        v2.d = new wls() { // from class: com.yandex.passport.internal.ui.bouncer.chooser.i
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i72 = i7;
                                zy11 zy11Var = zy11.a;
                                int i8 = i;
                                switch (i72) {
                                    case 0:
                                        ((Integer) obj2).intValue();
                                        int O = vng.O(i8 | 1);
                                        j.a(bVar, slsVar, tlsVar, str4, (fid) obj, O, i2);
                                        break;
                                    case 1:
                                        ((Integer) obj2).intValue();
                                        int O2 = vng.O(i8 | 1);
                                        j.a(bVar, slsVar, tlsVar, str4, (fid) obj, O2, i2);
                                        break;
                                    case 2:
                                        ((Integer) obj2).intValue();
                                        int O3 = vng.O(i8 | 1);
                                        j.a(bVar, slsVar, tlsVar, str4, (fid) obj, O3, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).intValue();
                                        int O4 = vng.O(i8 | 1);
                                        j.a(bVar, slsVar, tlsVar, str4, (fid) obj, O4, i2);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        return;
                    }
                    return;
                }
                btsVar.t(false);
                List list = ((a0) b.getValue()).a;
                btsVar.e0(1016343651);
                if (list != null) {
                    btsVar.e0(1857925239);
                    boolean e2 = btsVar.e(c0Var);
                    Object Q3 = btsVar.Q();
                    if (e2 || Q3 == o430Var) {
                        z = false;
                        BouncerMasterChooserScreenKt$BouncerMasterChooserScreen$5$1$1 bouncerMasterChooserScreenKt$BouncerMasterChooserScreen$5$1$1 = new BouncerMasterChooserScreenKt$BouncerMasterChooserScreen$5$1$1(1, c0Var, c0.class, "onWish", "onWish(Lcom/yandex/passport/internal/ui/bouncer/chooser/BouncerMasterChooserViewModel$Wish;)V", 0);
                        btsVar.o0(bouncerMasterChooserScreenKt$BouncerMasterChooserScreen$5$1$1);
                        Q3 = bouncerMasterChooserScreenKt$BouncerMasterChooserScreen$5$1$1;
                    } else {
                        z = false;
                    }
                    btsVar.t(z);
                    h.b(bVar, list, slsVar, (tls) ((tfx) Q3), btsVar, (i5 & 14) | ((i5 << 3) & 896));
                    btsVar.t(z);
                    aii0 v3 = btsVar.v();
                    if (v3 != null) {
                        final int i8 = 2;
                        v3.d = new wls() { // from class: com.yandex.passport.internal.ui.bouncer.chooser.i
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i72 = i8;
                                zy11 zy11Var = zy11.a;
                                int i82 = i;
                                switch (i72) {
                                    case 0:
                                        ((Integer) obj2).intValue();
                                        int O = vng.O(i82 | 1);
                                        j.a(bVar, slsVar, tlsVar, str4, (fid) obj, O, i2);
                                        break;
                                    case 1:
                                        ((Integer) obj2).intValue();
                                        int O2 = vng.O(i82 | 1);
                                        j.a(bVar, slsVar, tlsVar, str4, (fid) obj, O2, i2);
                                        break;
                                    case 2:
                                        ((Integer) obj2).intValue();
                                        int O3 = vng.O(i82 | 1);
                                        j.a(bVar, slsVar, tlsVar, str4, (fid) obj, O3, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).intValue();
                                        int O4 = vng.O(i82 | 1);
                                        j.a(bVar, slsVar, tlsVar, str4, (fid) obj, O4, i2);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        return;
                    }
                    return;
                }
                btsVar.t(false);
                pi6.a(m4m0.b(ljs0.c, ((agc) btsVar.m(dgc.a)).n, gji0Var), btsVar, 0);
                str3 = str4;
            } else {
                btsVar2.Y();
            }
        }
        aii0 v4 = btsVar.v();
        if (v4 != null) {
            final int i9 = 3;
            v4.d = new wls() { // from class: com.yandex.passport.internal.ui.bouncer.chooser.i
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i72 = i9;
                    zy11 zy11Var = zy11.a;
                    int i82 = i;
                    switch (i72) {
                        case 0:
                            ((Integer) obj2).intValue();
                            int O = vng.O(i82 | 1);
                            j.a(bVar, slsVar, tlsVar, str3, (fid) obj, O, i2);
                            break;
                        case 1:
                            ((Integer) obj2).intValue();
                            int O2 = vng.O(i82 | 1);
                            j.a(bVar, slsVar, tlsVar, str3, (fid) obj, O2, i2);
                            break;
                        case 2:
                            ((Integer) obj2).intValue();
                            int O3 = vng.O(i82 | 1);
                            j.a(bVar, slsVar, tlsVar, str3, (fid) obj, O3, i2);
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            int O4 = vng.O(i82 | 1);
                            j.a(bVar, slsVar, tlsVar, str3, (fid) obj, O4, i2);
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }
}
