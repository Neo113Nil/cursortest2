package com.yandex.passport.internal.ui.sloth.screen;

import com.google.ar.core.ImageMetadata;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.ui.w;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ooc;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.tls;
import defpackage.tq0;
import defpackage.w8f;
import defpackage.wls;
import defpackage.zpn;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class g {
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0127, code lost:
    
        if (r6 == r1) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(SlothParams slothParams, e eVar, tls tlsVar, tls tlsVar2, tls tlsVar3, Map map, fid fidVar, int i, int i2) {
        Map map2;
        int i3;
        o430 o430Var;
        Map map3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2024605599);
        int i4 = (btsVar.e(slothParams) ? 4 : 2) | i | (btsVar.k(eVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i4 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i5 = i4 | (btsVar.e(tlsVar2) ? 2048 : 1024) | (btsVar.e(tlsVar3) ? 16384 : 8192);
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 = i5 | ImageMetadata.EDGE_MODE;
            map2 = map;
        } else {
            map2 = map;
            i3 = i5 | (btsVar.e(map2) ? 131072 : 65536);
        }
        if ((74899 & i3) == 74898 && btsVar.E()) {
            btsVar.Y();
            map3 = map2;
        } else {
            Map f = i6 != 0 ? kotlin.collections.b.f() : map2;
            btsVar.e0(-2064979064);
            boolean k = ((i3 & 112) == 32) | btsVar.k(slothParams) | btsVar.k(f) | ((57344 & i3) == 16384);
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (k || Q == o430Var2) {
                Q = eVar.setSlothParams(slothParams).setSlothHeaders(f).setOnSlothUiWish(tlsVar3).build();
                btsVar.o0(Q);
            }
            f fVar = (f) Q;
            btsVar.t(false);
            h viewModelFactory = fVar.getViewModelFactory();
            rs31 a = f5z.a(btsVar);
            if (a == null) {
                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            i iVar = (i) ooc.G(qoi0.a(i.class), a, null, viewModelFactory, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            w.b(fVar, null, btsVar, 0, 2);
            btsVar.e0(-2064966115);
            boolean e = btsVar.e(iVar) | ((i3 & 896) == 256);
            Object Q2 = btsVar.Q();
            if (e) {
                o430Var = o430Var2;
            } else {
                o430Var = o430Var2;
            }
            Q2 = new SlothScreenKt$SlothScreen$1$1(iVar, tlsVar, null);
            btsVar.o0(Q2);
            btsVar.t(false);
            zpn.e(btsVar, (wls) Q2, iVar);
            btsVar.e0(-2064960470);
            boolean e2 = btsVar.e(iVar) | ((i3 & 7168) == 2048);
            Object Q3 = btsVar.Q();
            if (e2 || Q3 == o430Var) {
                Q3 = new SlothScreenKt$SlothScreen$2$1(iVar, tlsVar2, null);
                btsVar.o0(Q3);
            }
            btsVar.t(false);
            zpn.e(btsVar, (wls) Q3, iVar);
            map3 = f;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tq0(slothParams, eVar, tlsVar, tlsVar2, tlsVar3, map3, i, i2);
        }
    }
}
