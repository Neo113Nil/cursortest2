package com.yandex.go.taxi.summary.verticalsummary.ui;

import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.b9a1;
import defpackage.bts;
import defpackage.c530;
import defpackage.caf0;
import defpackage.cjb1;
import defpackage.did;
import defpackage.fid;
import defpackage.id00;
import defpackage.jj2;
import defpackage.ke31;
import defpackage.ki31;
import defpackage.m3u0;
import defpackage.o430;
import defpackage.oz40;
import defpackage.r2z0;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vuz;
import defpackage.wg6;
import defpackage.wls;
import defpackage.xg0;
import defpackage.yn91;
import defpackage.yt40;
import defpackage.zpn;
import defpackage.zy11;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public abstract class d {
    public static final void a(androidx.compose.foundation.lazy.b bVar, wg6 wg6Var, Integer num, List list, int i, jj2 jj2Var, fid fidVar, int i2) {
        int i3;
        int i4;
        List list2;
        o430 o430Var;
        int i5;
        int i6;
        m3u0 m3u0Var;
        oz40 oz40Var;
        oz40 oz40Var2;
        androidx.compose.animation.core.a aVar;
        tse tseVar;
        Integer num2 = num;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1749911668);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.k(bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.k(wg6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.k(num2) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.k(list) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 = i;
            i3 |= btsVar.c(i4) ? 16384 : 8192;
        } else {
            i4 = i;
        }
        if ((196608 & i2) == 0) {
            i3 |= (i2 & 262144) == 0 ? btsVar.k(jj2Var) : btsVar.e(jj2Var) ? 131072 : 65536;
        }
        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (Q == o430Var2) {
                Q = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q);
            }
            tse tseVar2 = (tse) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var2) {
                Q2 = androidx.compose.runtime.f.j(Boolean.TRUE);
                btsVar.o0(Q2);
            }
            oz40 oz40Var3 = (oz40) Q2;
            int i7 = i3 & 896;
            boolean z = i7 == 256;
            Object Q3 = btsVar.Q();
            if (z || Q3 == o430Var2) {
                Q3 = new caf0(1, num2);
                btsVar.o0(Q3);
            }
            int i8 = i3 & 14;
            m3u0 c = com.yandex.go.taxi.summary.verticalsummary.utils.c.c(bVar, num2, (tls) Q3, btsVar, i8 | ((i3 >> 3) & 112));
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var2) {
                Q4 = id00.a(0.0f);
                btsVar.o0(Q4);
            }
            androidx.compose.animation.core.a aVar2 = (androidx.compose.animation.core.a) Q4;
            oz40 a = androidx.compose.foundation.interaction.a.a(bVar.g, btsVar);
            int i9 = i3;
            int i10 = i9 & 112;
            boolean k = ((i3 & 7168) == 2048) | ((i9 & HProv.ALG_CLASS_ALL) == 16384) | (i10 == 32) | btsVar.k(a) | btsVar.e(aVar2) | (i8 == 4) | btsVar.k(c) | btsVar.e(tseVar2) | ((i9 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072 || ((i9 & 262144) != 0 && btsVar.e(jj2Var)));
            Object Q5 = btsVar.Q();
            if (k || Q5 == o430Var2) {
                o430Var = o430Var2;
                i5 = i7;
                i6 = 256;
                int i11 = i4;
                m3u0Var = c;
                oz40Var = oz40Var3;
                StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1 stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1 = new StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1(list, i11, wg6Var, a, oz40Var, aVar2, bVar, m3u0Var, tseVar2, jj2Var, null);
                oz40Var2 = a;
                aVar = aVar2;
                tseVar = tseVar2;
                list2 = list;
                btsVar.o0(stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1);
                Q5 = stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1;
            } else {
                oz40Var = oz40Var3;
                i5 = i7;
                tseVar = tseVar2;
                o430Var = o430Var2;
                i6 = 256;
                list2 = list;
                m3u0Var = c;
                aVar = aVar2;
                oz40Var2 = a;
            }
            zpn.f(m3u0Var, list2, (wls) Q5, btsVar);
            boolean e = (i5 == i6) | (i8 == 4) | btsVar.e(tseVar) | btsVar.e(aVar) | (i10 == 32) | btsVar.k(oz40Var2);
            Object Q6 = btsVar.Q();
            if (e || Q6 == o430Var) {
                StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$2$1 stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$2$1 = new StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$2$1(num, bVar, tseVar, aVar, wg6Var, oz40Var2, oz40Var, null);
                num2 = num;
                btsVar.o0(stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$2$1);
                Q6 = stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$2$1;
            } else {
                num2 = num;
            }
            zpn.f(num2, list2, (wls) Q6, btsVar);
        } else {
            list2 = list;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xg0(bVar, wg6Var, num2, list2, i, jj2Var, i2);
        }
    }

    public static final void b(tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-761237823);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(tlsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new VerticalSummaryScreenKt$TrackScreenScopeEffect$1$1(tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yt40(i, 4, tlsVar);
        }
    }

    public static final void c(tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(43934055);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(tlsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
            int i3 = vuz.o(btsVar).g.e().b;
            Integer valueOf = Integer.valueOf(i3);
            boolean c = btsVar.c(i3) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (c || Q == did.a) {
                Q = new VerticalSummaryScreenKt$TrackTopInsetEffect$1$1(tlsVar, i3, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, valueOf);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yt40(i, 5, tlsVar);
        }
    }

    public static final void d(ki31 ki31Var, boolean z, tls tlsVar, tpr tprVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-313377980);
        int i2 = i | (btsVar.k(ki31Var) ? 4 : 2) | (btsVar.a(z) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.k(tprVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, z, null, null, null, null, btsVar, ((i2 << 21) & 234881024) | 438, 0, 7928);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new ke31(7);
                btsVar.o0(Q);
            }
            int i3 = (i2 >> 6) & 14;
            tls g = yn91.g(tlsVar, (tls) Q, btsVar, i3 | 48);
            WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
            cjb1.b(ki31Var.i, b9a1.e(c530.a, vuz.o(btsVar).g), null, g, btsVar, 0, 4);
            i.c(ki31Var, a, tlsVar, tprVar, btsVar, i2 & 8078);
            b(tlsVar, btsVar, i3);
            c(tlsVar, btsVar, i3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(ki31Var, z, tlsVar, tprVar, i, 23);
        }
    }
}
