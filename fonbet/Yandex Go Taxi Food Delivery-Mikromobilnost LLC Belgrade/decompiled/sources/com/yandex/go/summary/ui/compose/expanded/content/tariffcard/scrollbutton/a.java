package com.yandex.go.summary.ui.compose.expanded.content.tariffcard.scrollbutton;

import androidx.compose.animation.k;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.bts;
import defpackage.byk0;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.cyk0;
import defpackage.did;
import defpackage.f530;
import defpackage.fhp0;
import defpackage.fid;
import defpackage.fj91;
import defpackage.fnq0;
import defpackage.fsk0;
import defpackage.fwi;
import defpackage.hhp0;
import defpackage.id00;
import defpackage.isk0;
import defpackage.ldc;
import defpackage.ly3;
import defpackage.nao0;
import defpackage.o430;
import defpackage.o91;
import defpackage.ogo0;
import defpackage.q791;
import defpackage.qeg0;
import defpackage.qwd;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.ttb1;
import defpackage.uyo0;
import defpackage.w7o0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x1c;
import defpackage.xfc;
import defpackage.ydb1;
import defpackage.ymb1;
import defpackage.zpn;
import defpackage.zx40;

/* loaded from: classes14.dex */
public abstract class a {
    public static final void a(hhp0 hhp0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        int i3;
        Object obj;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1185464090);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(hhp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            hhp0Var.getClass();
            float w0 = ((fwi) btsVar.m(j.h)).w0(20.0f);
            long n = tje.n(AppColor$Palette.TextInvert, btsVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            Object obj2 = Q;
            if (Q == o430Var) {
                androidx.compose.animation.core.a a = id00.a(0.0f);
                btsVar.o0(a);
                obj2 = a;
            }
            androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) obj2;
            Integer valueOf = Integer.valueOf(hhp0Var.b);
            Integer valueOf2 = Integer.valueOf(hhp0Var.c);
            int i5 = i4 & 14;
            boolean e = (i5 == 4) | btsVar.e(aVar) | btsVar.b(w0);
            Object Q2 = btsVar.Q();
            Object obj3 = Q2;
            if (e || Q2 == o430Var) {
                ScrollButtonItemKt$ScrollButtonContentItem$2$1 scrollButtonItemKt$ScrollButtonContentItem$2$1 = new ScrollButtonItemKt$ScrollButtonContentItem$2$1(hhp0Var, aVar, w0, null);
                btsVar.o0(scrollButtonItemKt$ScrollButtonContentItem$2$1);
                obj3 = scrollButtonItemKt$ScrollButtonContentItem$2$1;
            }
            zpn.f(valueOf, valueOf2, (wls) obj3, btsVar);
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 0.0f, 20.0f, 0.0f, 8.0f, 5);
            boolean e2 = btsVar.e(aVar);
            Object Q3 = btsVar.Q();
            Object obj4 = Q3;
            if (e2 || Q3 == o430Var) {
                x1c x1cVar = new x1c(aVar, 4);
                btsVar.o0(x1cVar);
                obj4 = x1cVar;
            }
            f530 a2 = d.a(o, (tls) obj4);
            AppColor$Palette appColor$Palette = AppColor$Palette.BgInvert;
            byk0 byk0Var = cyk0.a;
            f530 d = fj91.d(ymb1.l(bzk0.c(a2, appColor$Palette, byk0Var), byk0Var), IntrinsicSize.Max);
            Object Q4 = btsVar.Q();
            Object obj5 = Q4;
            if (Q4 == o430Var) {
                obj5 = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) obj5;
            boolean d2 = btsVar.d(n);
            Object Q5 = btsVar.Q();
            if (d2 || Q5 == o430Var) {
                i3 = 0;
                fhp0 fhp0Var = new fhp0(n, 0);
                btsVar.o0(fhp0Var);
                obj = fhp0Var;
            } else {
                i3 = 0;
                obj = Q5;
            }
            qwd qwdVar = fsk0.a;
            isk0 isk0Var = new isk0(true, (xfc) obj, ldc.m);
            awk0 awk0Var = new awk0(i3);
            int i6 = (btsVar.a(true) ? 1 : 0) | ((i4 & 896) == 256 ? 1 : i3) | (i5 == 4 ? 1 : i3);
            Object Q6 = btsVar.Q();
            Object obj6 = Q6;
            if (i6 != 0 || Q6 == o430Var) {
                nao0 nao0Var = new nao0(14, tlsVar, hhp0Var);
                btsVar.o0(nao0Var);
                obj6 = nao0Var;
            }
            f530 b = q791.b(d, zx40Var, isk0Var, true, null, awk0Var, (sls) obj6, 8);
            int i7 = i5 == 4 ? 1 : i3;
            Object Q7 = btsVar.Q();
            Object obj7 = Q7;
            if (i7 != 0 || Q7 == o430Var) {
                uyo0 uyo0Var = new uyo0(6, hhp0Var);
                btsVar.o0(uyo0Var);
                obj7 = uyo0Var;
            }
            ydb1.a(fnq0.a(b, (tls) obj7), null, wwg.S(930908585, true, new w7o0(5, hhp0Var), btsVar), null, null, null, SlotSize.M, false, btsVar, 1573248, 186);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0((Object) hhp0Var, f530Var2, (Object) tlsVar, i, 2);
        }
    }

    public static final void b(hhp0 hhp0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-532067943);
        int i2 = i | (btsVar.k(hhp0Var) ? 4 : 2) | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ttb1.a(hhp0Var, f530Var, k.e(null, 3), k.f(null, 3), "ScrollButtonItem", wwg.S(1099780584, true, new o91(9, tlsVar), btsVar), btsVar, (i2 & 14) | 224640 | (i2 & 112), 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0((Object) hhp0Var, (Object) f530Var, tlsVar, i, 20);
        }
    }
}
