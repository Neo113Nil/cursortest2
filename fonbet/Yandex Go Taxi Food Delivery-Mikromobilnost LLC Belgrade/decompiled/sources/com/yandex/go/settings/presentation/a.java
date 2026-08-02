package com.yandex.go.settings.presentation;

import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.j;
import com.yandex.go.settings.presentation.models.AppSettingsTransitionMode;
import defpackage.aii0;
import defpackage.bts;
import defpackage.bx2;
import defpackage.cvw;
import defpackage.cx2;
import defpackage.did;
import defpackage.ex2;
import defpackage.f22;
import defpackage.fid;
import defpackage.fwi;
import defpackage.lx2;
import defpackage.ly1;
import defpackage.ly3;
import defpackage.m0;
import defpackage.m3u0;
import defpackage.mx2;
import defpackage.o430;
import defpackage.oip0;
import defpackage.pw91;
import defpackage.qy20;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tls;
import defpackage.ur70;
import defpackage.v2o;
import defpackage.vuz;
import defpackage.w2o;
import defpackage.w511;
import defpackage.w8a1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.y7m;
import defpackage.ymo;
import defpackage.yx40;
import defpackage.zmo;
import defpackage.zpn;
import java.util.WeakHashMap;

/* loaded from: classes13.dex */
public abstract class a {
    public static final w2o a;
    public static final w2o b = k.n(sb2.K(300, 0, null, 6), new f22(19));
    public static final zmo c = k.s(sb2.K(300, 0, null, 6), new f22(20));
    public static final zmo d;

    static {
        int i = 29;
        a = k.n(sb2.K(300, 0, null, 6), new ur70(i));
        d = k.s(sb2.K(300, 0, null, 6), new ur70(i));
    }

    public static final void a(mx2 mx2Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        tls tlsVar2;
        mx2 mx2Var2;
        bts btsVar;
        w2o w2oVar;
        zmo zmoVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-940116924);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(mx2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            fwi fwiVar = (fwi) btsVar2.m(j.h);
            oip0 o = pw91.o(btsVar2);
            Object[] objArr = new Object[0];
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new ly1(20);
                btsVar2.o0(Q);
            }
            yx40 yx40Var = (yx40) cvw.V(objArr, (sls) Q, btsVar2, 48);
            boolean c2 = btsVar2.c(yx40Var.getIntValue());
            Object Q2 = btsVar2.Q();
            if (c2 || Q2 == o430Var) {
                Q2 = ly3.h(fwiVar.H(yx40Var.getIntValue()), btsVar2);
            }
            float f = ((y7m) Q2).a;
            WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
            float a2 = w8a1.f(vuz.o(btsVar2).e, btsVar2).a();
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
                Q3 = f.d(new bx2(o, yx40Var, 0));
                btsVar2.o0(Q3);
            }
            m3u0 m3u0Var = (m3u0) Q3;
            lx2 lx2Var = mx2Var.c;
            AppSettingsTransitionMode appSettingsTransitionMode = mx2Var.a;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object Q4 = btsVar2.Q();
            if (z || Q4 == o430Var) {
                Q4 = new AppSettingsScreenKt$SettingsScreen$1$1(tlsVar, mx2Var, null);
                btsVar2.o0(Q4);
            }
            zpn.e(btsVar2, (wls) Q4, lx2Var);
            int[] iArr = ex2.a;
            int i3 = iArr[appSettingsTransitionMode.ordinal()];
            if (i3 == 1) {
                w2oVar = a;
            } else if (i3 == 2) {
                w2oVar = b;
            } else {
                if (i3 != 3) {
                    w511.b();
                    return;
                }
                w2oVar = v2o.a;
            }
            w2o w2oVar2 = w2oVar;
            int i4 = iArr[appSettingsTransitionMode.ordinal()];
            if (i4 == 1) {
                zmoVar = c;
            } else if (i4 == 2) {
                zmoVar = d;
            } else {
                if (i4 != 3) {
                    w511.b();
                    return;
                }
                zmoVar = ymo.a;
            }
            zmo zmoVar2 = zmoVar;
            cx2 cx2Var = new cx2(o, f, a2, tlsVar, yx40Var, m3u0Var, mx2Var);
            tlsVar2 = tlsVar;
            mx2Var2 = mx2Var;
            btsVar = btsVar2;
            qy20.a(null, w2oVar2, zmoVar2, false, wwg.S(-764735134, true, cx2Var, btsVar2), btsVar, 27648, 1);
        } else {
            tlsVar2 = tlsVar;
            mx2Var2 = mx2Var;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(mx2Var2, tlsVar2, i, 20);
        }
    }
}
