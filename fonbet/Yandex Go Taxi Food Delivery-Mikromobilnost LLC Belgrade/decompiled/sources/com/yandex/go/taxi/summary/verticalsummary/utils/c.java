package com.yandex.go.taxi.summary.verticalsummary.utils;

import androidx.compose.runtime.f;
import defpackage.aii0;
import defpackage.bts;
import defpackage.ck11;
import defpackage.did;
import defpackage.fid;
import defpackage.id00;
import defpackage.m3u0;
import defpackage.mqu;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.wzr;
import defpackage.zpn;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes14.dex */
public abstract class c {
    public static final void a(androidx.compose.foundation.lazy.b bVar, wls wlsVar, Object obj, wls wlsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-318467482);
        int i2 = (btsVar.k(bVar) ? 4 : 2) | i | (btsVar.e(obj) ? 256 : 128) | (btsVar.k(wlsVar2) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = {bVar, wlsVar, wlsVar2, obj};
            boolean z = ((i2 & 14) == 4) | ((i2 & 7168) == 2048);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new LazyListStateUtilsKt$OnVisibleItemsMaxSizeChangedEffect$1$1(bVar, wlsVar, wlsVar2, null);
                btsVar.o0(Q);
            }
            zpn.h(objArr, (wls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(bVar, wlsVar, obj, wlsVar2, i, 11);
        }
    }

    public static final androidx.compose.animation.core.a b(m3u0 m3u0Var, ck11 ck11Var, fid fidVar, int i) {
        m3u0 m3u0Var2;
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        Object obj = did.a;
        if (Q == obj) {
            Q = id00.a(((Number) m3u0Var.getValue()).floatValue());
            btsVar.o0(Q);
        }
        androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) Q;
        Object Q2 = btsVar.Q();
        if (Q2 == obj) {
            Q2 = zpn.j(EmptyCoroutineContext.a, btsVar);
            btsVar.o0(Q2);
        }
        tse tseVar = (tse) Q2;
        boolean e = ((((i & 14) ^ 6) > 4 && btsVar.k(m3u0Var)) || (i & 6) == 4) | btsVar.e(tseVar) | btsVar.e(aVar) | ((((i & 112) ^ 48) > 32 && btsVar.e(ck11Var)) || (i & 48) == 32);
        Object Q3 = btsVar.Q();
        if (e || Q3 == obj) {
            m3u0Var2 = m3u0Var;
            Object stateUtilsKt$asAnimatable$1$1 = new StateUtilsKt$asAnimatable$1$1(m3u0Var2, tseVar, aVar, ck11Var, null);
            btsVar.o0(stateUtilsKt$asAnimatable$1$1);
            Q3 = stateUtilsKt$asAnimatable$1$1;
        } else {
            m3u0Var2 = m3u0Var;
        }
        zpn.e(btsVar, (wls) Q3, m3u0Var2);
        return aVar;
    }

    public static final m3u0 c(androidx.compose.foundation.lazy.b bVar, Object obj, tls tlsVar, fid fidVar, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((bts) fidVar).k(bVar)) || (i & 6) == 4;
        bts btsVar = (bts) fidVar;
        boolean k = btsVar.k(obj) | z;
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = f.d(new mqu(19, bVar, tlsVar));
            btsVar.o0(Q);
        }
        return (m3u0) Q;
    }
}
