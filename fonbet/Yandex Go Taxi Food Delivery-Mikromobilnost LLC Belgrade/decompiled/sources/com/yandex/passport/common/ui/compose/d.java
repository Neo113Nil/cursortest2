package com.yandex.passport.common.ui.compose;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import com.yandex.passport.common.ui.AppTheme;
import defpackage.aii0;
import defpackage.b2x0;
import defpackage.bts;
import defpackage.ceu0;
import defpackage.cma1;
import defpackage.did;
import defpackage.fid;
import defpackage.oz40;
import defpackage.pey;
import defpackage.tls;
import defpackage.tpr;
import defpackage.wls;
import defpackage.zpn;
import kotlin.Result;

/* loaded from: classes8.dex */
public abstract class d {
    public static final void a(tpr tprVar, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1549519712);
        int i2 = 0;
        if ((((btsVar.e(tprVar) ? 4 : 2) | i | (btsVar.e(wlsVar) ? 32 : 16)) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            Lifecycle lifecycle = ((pey) btsVar.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
            oz40 n = f.n(wlsVar, btsVar);
            btsVar.e0(-1592161222);
            boolean e = btsVar.e(lifecycle) | btsVar.e(tprVar) | btsVar.k(n);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new UtilKt$CollectEffects$1$1(lifecycle, tprVar, n, null);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            zpn.f(tprVar, lifecycle, (wls) Q, btsVar);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a(tprVar, wlsVar, i, i2);
        }
    }

    public static final Object b(ComponentActivity componentActivity, String str, tls tlsVar) {
        try {
            Bundle extras = componentActivity.getIntent().getExtras();
            if (extras != null) {
                return tlsVar.invoke(extras);
            }
            throw new IllegalArgumentException(str.concat(" is missing in Intent"));
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public static final boolean c(AppTheme appTheme, fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-999201971);
        boolean f0 = appTheme == AppTheme.LIGHT ? false : appTheme == AppTheme.DARK ? true : cma1.f0(btsVar);
        btsVar.t(false);
        return f0;
    }

    public static final b2x0 d(AppTheme appTheme) {
        int i = c.a[appTheme.ordinal()];
        return i != 1 ? i != 2 ? new b2x0(0, 0, 0, new ceu0(8)) : new b2x0(0, 0, 0, new ceu0(7)) : new b2x0(0, 0, 0, new ceu0(6));
    }
}
