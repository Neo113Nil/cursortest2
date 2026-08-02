package com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.b;
import com.yandex.go.places.complaint.impl.ui.ComplaintNotification;
import defpackage.a740;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awh0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyh0;
import defpackage.cyk0;
import defpackage.d740;
import defpackage.did;
import defpackage.dmw0;
import defpackage.ety0;
import defpackage.exw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.hpm;
import defpackage.hua1;
import defpackage.jeb1;
import defpackage.khl0;
import defpackage.l8v;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lzr;
import defpackage.m4m0;
import defpackage.n;
import defpackage.n740;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.qeb1;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rzo;
import defpackage.sa6;
import defpackage.sic;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.u92;
import defpackage.uh6;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wti0;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.y6i0;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class b {
    public static final void a(wti0 wti0Var, fid fidVar, int i) {
        wti0 wti0Var2;
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1786048674);
        int i3 = i | (btsVar.k(wti0Var) ? 4 : 2);
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            lhl0 a = khl0.a(lr20.e, x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c530.a);
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
            int i4 = wti0Var.a;
            i2 = 1;
            g(i4, ohb1.c(awh0.mt_sdk_format_days, i4, btsVar), null, null, null, null, false, 0.0f, 0.0f, 0.0f, null, btsVar, 0, 2044);
            h(null, btsVar, 0, 1);
            int i5 = wti0Var.b;
            g(i5, ohb1.c(awh0.mt_sdk_format_hours, i5, btsVar), null, null, null, null, false, 0.0f, 0.0f, 0.0f, null, btsVar, 0, 2044);
            h(null, btsVar, 0, 1);
            g(wti0Var.c, ohb1.e(btsVar, cyh0.mt_sdk_format_min), null, null, null, null, false, 0.0f, 0.0f, 0.0f, null, btsVar, 0, 2044);
            btsVar.t(true);
            wti0Var2 = wti0Var;
        } else {
            wti0Var2 = wti0Var;
            i2 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d740(wti0Var2, i, i2);
        }
    }

    public static final void b(wti0 wti0Var, fid fidVar, int i) {
        int i2;
        wti0 wti0Var2 = wti0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(181687858);
        int i3 = i | (btsVar.k(wti0Var2) ? 4 : 2);
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            lhl0 a = khl0.a(lr20.e, x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c530.a);
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
            int i4 = wti0Var2.b;
            g(i4, ohb1.c(awh0.mt_sdk_format_hours, i4, btsVar), null, null, null, null, false, 0.0f, 0.0f, 0.0f, null, btsVar, 0, 2044);
            h(null, btsVar, 0, 1);
            g(wti0Var.c, ohb1.e(btsVar, cyh0.mt_sdk_format_min), null, null, null, null, false, 0.0f, 0.0f, 0.0f, null, btsVar, 0, 2044);
            h(null, btsVar, 0, 1);
            i2 = 0;
            g(wti0Var.d, ohb1.e(btsVar, cyh0.mt_sdk_format_sec), null, null, null, null, false, 0.0f, 0.0f, 0.0f, null, btsVar, 0, 2044);
            btsVar.t(true);
            wti0Var2 = wti0Var;
        } else {
            i2 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d740(wti0Var2, i, i2);
        }
    }

    public static final void c(wti0 wti0Var, fid fidVar, int i) {
        wti0 wti0Var2 = wti0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1280586317);
        int i2 = i | (btsVar.k(wti0Var2) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            lhl0 a = khl0.a(lr20.e, x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c530.a);
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
            g(wti0Var2.c, ohb1.e(btsVar, cyh0.mt_sdk_format_min), null, null, null, null, false, 0.0f, 0.0f, 0.0f, null, btsVar, 0, 2044);
            h(null, btsVar, 0, 1);
            g(wti0Var.d, ohb1.e(btsVar, cyh0.mt_sdk_format_sec), null, null, null, null, false, 0.0f, 0.0f, 0.0f, null, btsVar, 0, 2044);
            h(null, btsVar, 0, 1);
            g(wti0Var.e, ohb1.e(btsVar, cyh0.mt_sdk_format_ms), null, null, null, null, true, 0.0f, 0.0f, 0.0f, null, btsVar, 1572864, 1980);
            btsVar.t(true);
            wti0Var2 = wti0Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d740(wti0Var2, i, 2);
        }
    }

    public static final void d(int i, long j, fid fidVar, f530 f530Var) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-532702713);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.d(j) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = j <= 0 ? new wti0(0, 0, 0, 0, 0) : new wti0((int) (j / 86400000), (int) ((j % 86400000) / 3600000), (int) ((j % 3600000) / 60000), (int) ((j % 60000) / 1000), (int) (j % 1000));
                btsVar.o0(Q);
            }
            wti0 wti0Var = (wti0) Q;
            boolean k = btsVar.k(wti0Var);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = wti0Var.a > 0 ? TimerFormat.DAYS_HOURS_MINUTES : wti0Var.b > 0 ? TimerFormat.HOURS_MINUTES_SECONDS : TimerFormat.MINUTES_SECONDS_MILLISECONDS;
                btsVar.o0(Q2);
            }
            TimerFormat timerFormat = (TimerFormat) Q2;
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            z910 d = pi6.d(x4c.y, false);
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
            int i4 = a.a[timerFormat.ordinal()];
            if (i4 == 1) {
                btsVar.e0(130005195);
                a(wti0Var, btsVar, 0);
                btsVar.t(false);
            } else if (i4 == 2) {
                btsVar.e0(130103496);
                b(wti0Var, btsVar, 0);
                btsVar.t(false);
            } else {
                if (i4 != 3) {
                    throw unr0.y(-965639276, btsVar, false);
                }
                btsVar.e0(130211841);
                c(wti0Var, btsVar, 0);
                btsVar.t(false);
            }
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hpm(j, f530Var2, i, 1);
        }
    }

    public static final void e(final String str, final wp2 wp2Var, final ety0 ety0Var, final wp2 wp2Var2, final float f, final float f2, final float f3, fid fidVar, final int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(387694374);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(wp2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(ety0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.k(wp2Var2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.b(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.b(f2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar2.b(f3) ? 1048576 : 524288;
        }
        if (btsVar2.V(i2 & 1, (599187 & i2) != 599186)) {
            f530 b = m4m0.b(ljs0.n(c530.a, f, f2), tje.n(wp2Var2, btsVar2), cyk0.c(f3));
            z910 d = pi6.d(x4c.y, false);
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
            jeb1.f(str, null, wp2Var, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar2, (i2 & 14) | ((i2 << 3) & 896), (i2 << 6) & HProv.ALG_CLASS_ALL, 16378);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: c740
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    b.e(str, wp2Var, ety0Var, wp2Var2, f, f2, f3, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void f(final l8v l8vVar, final long j, final long j2, final f530 f530Var, int i, long j3, fid fidVar, final int i2) {
        int i3;
        int i4;
        bts btsVar;
        final long j4;
        int i5;
        SnapshotStateList snapshotStateList;
        zy11 zy11Var;
        int i6;
        long j5;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-408983046);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? btsVar2.k(l8vVar) : btsVar2.e(l8vVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar2.d(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar2.d(j2) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.k(f530Var) ? 2048 : 1024;
        }
        int i7 = i3 | 221184;
        if (btsVar2.V(i7 & 1, (74899 & i7) != 74898)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new SnapshotStateList();
                btsVar2.o0(Q);
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) Q;
            int i8 = i7 & 14;
            boolean z = i8 == 4 || ((i7 & 8) != 0 && btsVar2.k(l8vVar));
            Object Q2 = btsVar2.Q();
            if (z || Q2 == o430Var) {
                Bitmap a = hua1.a(l8vVar);
                int width = a.getWidth();
                int height = a.getHeight();
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                int i9 = width * height;
                int[] iArr = new int[i9];
                a.getPixels(iArr, 0, width, 0, 0, width, height);
                ArrayList arrayList = new ArrayList(i9);
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = iArr[i10];
                    int i12 = i9;
                    Bitmap bitmap = createBitmap;
                    int i13 = i10;
                    arrayList.add(Integer.valueOf((Color.red(i11) >= 48 || Color.green(i11) >= 48 || Color.blue(i11) >= 48) ? 0 : -1));
                    i10 = i13 + 1;
                    i9 = i12;
                    createBitmap = bitmap;
                }
                Bitmap bitmap2 = createBitmap;
                bitmap2.setPixels(iArr, 0, width, 0, 0, width, height);
                Q2 = new u92(bitmap2);
                btsVar2.o0(Q2);
            }
            l8v l8vVar2 = (l8v) Q2;
            int i14 = 458752 & i7;
            boolean z2 = i14 == 131072;
            Object Q3 = btsVar2.Q();
            if (z2 || Q3 == o430Var) {
                i5 = i8;
                Q3 = new MtTicketQrTouchRecolorWithMaskingKt$MtTicketQrTouchRecolorWithMasking$1$1(snapshotStateList2, ComplaintNotification.DURATION, null);
                btsVar2.o0(Q3);
            } else {
                i5 = i8;
            }
            zy11 zy11Var2 = zy11.a;
            zpn.e(btsVar2, (wls) Q3, zy11Var2);
            f530 k = f530Var.k(ljs0.c);
            boolean z3 = ((i7 & 896) == 256) | ((i7 & 112) == 32);
            Object Q4 = btsVar2.Q();
            if (z3 || Q4 == o430Var) {
                snapshotStateList = snapshotStateList2;
                zy11Var = zy11Var2;
                i6 = i5;
                n740 n740Var = new n740(j, j2, snapshotStateList);
                btsVar2.o0(n740Var);
                Q4 = n740Var;
            } else {
                i6 = i5;
                snapshotStateList = snapshotStateList2;
                zy11Var = zy11Var2;
            }
            f530 a2 = exw0.a(k, zy11Var, (PointerInputEventHandler) Q4);
            boolean e = (i6 == 4 || ((i7 & 8) != 0 && btsVar2.e(l8vVar))) | (i14 == 131072) | ((i7 & HProv.ALG_CLASS_ALL) == 16384) | btsVar2.e(l8vVar2);
            Object Q5 = btsVar2.Q();
            if (e || Q5 == o430Var) {
                sa6 sa6Var = new sa6(l8vVar, snapshotStateList, l8vVar2, ComplaintNotification.DURATION, 3);
                j5 = 2500;
                btsVar2.o0(sa6Var);
                Q5 = sa6Var;
            } else {
                j5 = ComplaintNotification.DURATION;
            }
            qeb1.a(0, btsVar2, (tls) Q5, a2);
            i4 = 150;
            btsVar = btsVar2;
            j4 = j5;
        } else {
            btsVar2.Y();
            i4 = i;
            btsVar = btsVar2;
            j4 = j3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final int i15 = i4;
            v.d = new wls() { // from class: m740
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b.f(l8v.this, j, j2, f530Var, i15, j4, (fid) obj, vng.O(i2 | 1));
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final int i, final String str, wp2 wp2Var, wp2 wp2Var2, ety0 ety0Var, wp2 wp2Var3, boolean z, float f, float f2, float f3, ety0 ety0Var2, fid fidVar, final int i2, final int i3) {
        int i4;
        wp2 wp2Var4;
        int i5;
        wp2 wp2Var5;
        int i6;
        ety0 ety0Var3;
        int i7;
        int i8;
        int i9;
        int i10;
        final boolean z2;
        int i11;
        int i12;
        float f4;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        final wp2 wp2Var6;
        final float f5;
        final wp2 wp2Var7;
        final ety0 ety0Var4;
        final ety0 ety0Var5;
        final float f6;
        final wp2 wp2Var8;
        final float f7;
        aii0 v;
        wp2 wp2Var9;
        float f8;
        float f9;
        float f10;
        ety0 ety0Var6;
        wp2 wp2Var10;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1272825301);
        dmw0 dmw0Var = btsVar.a;
        if ((i2 & 6) == 0) {
            i4 = i2 | (btsVar.c(i) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i21 = i4 | (btsVar.k(str) ? 32 : 16);
        int i22 = i3 & 4;
        if (i22 != 0) {
            i5 = i21 | 384;
            wp2Var4 = wp2Var;
        } else {
            wp2Var4 = wp2Var;
            i5 = i21 | (btsVar.k(wp2Var4) ? 256 : 128);
        }
        int i23 = i3 & 8;
        if (i23 != 0) {
            i6 = i5 | HProv.ALG_TYPE_SECURECHANNEL;
            wp2Var5 = wp2Var2;
        } else {
            wp2Var5 = wp2Var2;
            i6 = i5 | (btsVar.k(wp2Var5) ? 2048 : 1024);
        }
        if ((i3 & 16) == 0) {
            ety0Var3 = ety0Var;
            if (btsVar.k(ety0Var3)) {
                i7 = 16384;
                int i24 = i6 | i7;
                i8 = i3 & 32;
                if (i8 == 0) {
                    i9 = i24 | ImageMetadata.EDGE_MODE;
                } else {
                    i9 = i24 | (btsVar.k(wp2Var3) ? 131072 : 65536);
                }
                i10 = i3 & 64;
                if (i10 == 0) {
                    i9 |= 1572864;
                    z2 = z;
                    i11 = 32;
                } else {
                    z2 = z;
                    i11 = 32;
                    if ((i2 & 1572864) == 0) {
                        i9 |= btsVar.a(z2) ? 1048576 : 524288;
                    }
                }
                i12 = i3 & 128;
                if (i12 == 0) {
                    i13 = i9 | 12582912;
                    f4 = f;
                } else {
                    f4 = f;
                    i13 = i9 | (btsVar.b(f4) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
                }
                i14 = i3 & 256;
                if (i14 == 0) {
                    i16 = i13 | 100663296;
                    i15 = i14;
                } else {
                    i15 = i14;
                    i16 = i13 | (btsVar.b(f2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB);
                }
                i17 = i3 & 512;
                if (i17 == 0) {
                    i19 = i16 | 805306368;
                    i18 = i17;
                } else {
                    i18 = i17;
                    i19 = i16 | (btsVar.b(f3) ? 536870912 : SelfTester_JCP.IMITA);
                }
                if ((i3 & 1024) == 0 && btsVar.k(ety0Var2)) {
                    i20 = 4;
                    if (btsVar.V(i19 & 1, (i19 & 306783379) == 306783378 || (i20 & 3) != 2)) {
                        btsVar.Y();
                        wp2Var6 = wp2Var3;
                        f5 = f2;
                        wp2Var7 = wp2Var4;
                        ety0Var4 = ety0Var3;
                        ety0Var5 = ety0Var2;
                        f6 = f4;
                        wp2Var8 = wp2Var5;
                        f7 = f3;
                    } else {
                        btsVar.a0();
                        if ((i2 & 1) == 0 || btsVar.C()) {
                            if (i22 != 0) {
                                wp2Var4 = AppColor$Palette.Text;
                            }
                            if (i23 != 0) {
                                wp2Var5 = AppColor$Palette.Text;
                            }
                            if ((i3 & 16) != 0) {
                                i19 &= -57345;
                                ety0Var3 = ety0.a(xya1.b(btsVar).i, 0L, uh6.E(i11), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213);
                            }
                            wp2Var9 = i8 != 0 ? AppColor$Palette.Background : wp2Var3;
                            if (i10 != 0) {
                                z2 = false;
                            }
                            f8 = i12 != 0 ? 38.0f : f4;
                            f9 = i15 != 0 ? 53.0f : f2;
                            f10 = i18 != 0 ? 10.0f : f3;
                            if ((i3 & 1024) != 0) {
                                ety0Var6 = xya1.d(btsVar).h.a;
                                wp2Var10 = wp2Var4;
                                i20 = 0;
                            } else {
                                ety0Var6 = ety0Var2;
                                wp2Var10 = wp2Var4;
                            }
                        } else {
                            btsVar.Y();
                            if ((i3 & 16) != 0) {
                                i19 &= -57345;
                            }
                            if ((i3 & 1024) != 0) {
                                wp2Var9 = wp2Var3;
                                f10 = f3;
                                ety0Var6 = ety0Var2;
                                f8 = f4;
                                wp2Var10 = wp2Var4;
                                i20 = 0;
                            } else {
                                wp2Var9 = wp2Var3;
                                f10 = f3;
                                ety0Var6 = ety0Var2;
                                f8 = f4;
                                wp2Var10 = wp2Var4;
                            }
                            f9 = f2;
                        }
                        btsVar.u();
                        int i25 = i19 & 14;
                        boolean z3 = i25 == 4;
                        Object Q = btsVar.Q();
                        o430 o430Var = did.a;
                        if (z3 || Q == o430Var) {
                            Q = String.valueOf(z2 ? 0 : i / 10);
                            btsVar.o0(Q);
                        }
                        String str2 = (String) Q;
                        boolean z4 = i25 == 4;
                        Object Q2 = btsVar.Q();
                        if (z4 || Q2 == o430Var) {
                            Q2 = String.valueOf(i % 10);
                            btsVar.o0(Q2);
                        }
                        String str3 = (String) Q2;
                        sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
                        wp2 wp2Var11 = wp2Var9;
                        float f11 = f8;
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
                        float f12 = f9;
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
                        float f13 = f10;
                        wls wlsVar3 = d.g;
                        qje.W(btsVar, wlsVar3, valueOf);
                        tls tlsVar = d.h;
                        qje.M(btsVar, tlsVar);
                        boolean z5 = z2;
                        wls wlsVar4 = d.d;
                        qje.W(btsVar, wlsVar4, d);
                        lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
                        wp2 wp2Var12 = wp2Var5;
                        int hashCode2 = Long.hashCode(btsVar.T);
                        r1b0 o2 = btsVar.o();
                        f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
                        if (dmw0Var == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar.i0();
                        ety0 ety0Var7 = ety0Var3;
                        if (btsVar.S) {
                            btsVar.n(slsVar);
                        } else {
                            btsVar.r0();
                        }
                        qje.W(btsVar, wlsVar, a2);
                        qje.W(btsVar, wlsVar2, o2);
                        vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
                        qje.W(btsVar, wlsVar4, d2);
                        int i26 = i19 >> 9;
                        int i27 = ((i19 >> 6) & 8176) | (i26 & HProv.ALG_CLASS_ALL) | (458752 & i26) | (i26 & 3670016);
                        e(str2, wp2Var12, ety0Var7, wp2Var11, f11, f12, f13, btsVar, i27);
                        oeb1.c(btsVar, ljs0.q(c530Var, 5.0f));
                        e(str3, wp2Var12, ety0Var7, wp2Var11, f11, f12, f13, btsVar, i27);
                        n.y(btsVar, true, c530Var, 4.0f, btsVar);
                        jeb1.f(str, null, wp2Var10, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var6, btsVar, ((i19 >> 3) & 14) | (i19 & 896), (i20 << 12) & HProv.ALG_CLASS_ALL, 16378);
                        btsVar.t(true);
                        f6 = f11;
                        f5 = f12;
                        wp2Var8 = wp2Var12;
                        ety0Var4 = ety0Var7;
                        wp2Var7 = wp2Var10;
                        ety0Var5 = ety0Var6;
                        z2 = z5;
                        f7 = f13;
                        wp2Var6 = wp2Var11;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: b740
                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int O = vng.O(i2 | 1);
                                b.g(i, str, wp2Var7, wp2Var8, ety0Var4, wp2Var6, z2, f6, f5, f7, ety0Var5, (fid) obj, O, i3);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i20 = 2;
                if (btsVar.V(i19 & 1, (i19 & 306783379) == 306783378 || (i20 & 3) != 2)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
        } else {
            ety0Var3 = ety0Var;
        }
        i7 = 8192;
        int i242 = i6 | i7;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i10 = i3 & 64;
        if (i10 == 0) {
        }
        i12 = i3 & 128;
        if (i12 == 0) {
        }
        i14 = i3 & 256;
        if (i14 == 0) {
        }
        i17 = i3 & 512;
        if (i17 == 0) {
        }
        if ((i3 & 1024) == 0) {
            i20 = 4;
            if (btsVar.V(i19 & 1, (i19 & 306783379) == 306783378 || (i20 & 3) != 2)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        i20 = 2;
        if (btsVar.V(i19 & 1, (i19 & 306783379) == 306783378 || (i20 & 3) != 2)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void h(wp2 wp2Var, fid fidVar, int i, int i2) {
        wp2 wp2Var2;
        int i3;
        bts btsVar;
        wp2 wp2Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-960477918);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            wp2Var2 = wp2Var;
        } else {
            wp2Var2 = wp2Var;
            i3 = (btsVar2.k(wp2Var2) ? 4 : 2) | i;
        }
        if (btsVar2.V(i3 & 1, (i3 & 3) != 2)) {
            btsVar = btsVar2;
            wp2Var3 = i4 != 0 ? AppColor$Palette.Text : wp2Var2;
            jeb1.f(":", an91.o(an91.m(c530.a, 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4.0f, 7), wp2Var3, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0.a(xya1.b(btsVar2).g, 0L, 0L, lzr.b, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211), btsVar, ((i3 << 6) & 896) | 54, 0, 16376);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            wp2Var3 = wp2Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a740(wp2Var3, i, i2);
        }
    }

    public static final long i(long j, long j2, long j3, long j4) {
        return rzo.L(j3, y6i0.c(((Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / ((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) + (Float.intBitsToFloat((int) (j >> 32)) / ((int) (j2 >> 32)))) / 2.0f, 0.0f, 1.0f), j4);
    }
}
