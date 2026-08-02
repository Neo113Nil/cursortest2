package com.yx360.design.compose.atoms.snackbar;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.wls;
import defpackage.ysm;
import defpackage.zpn;
import defpackage.zyd;

/* loaded from: classes11.dex */
public abstract class b {
    public static final void a(String str, ysm ysmVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1834534920);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= btsVar.k(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(ysmVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
            Object value = ysmVar.a.getValue();
            btsVar.e0(-1224400529);
            boolean e = ((i2 & 112) == 32) | ((i2 & 896) == 256) | btsVar.e(view) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                DsSnackbar_androidKt$SnackbarAccessibilityEffect$1$1 dsSnackbar_androidKt$SnackbarAccessibilityEffect$1$1 = new DsSnackbar_androidKt$SnackbarAccessibilityEffect$1$1(ysmVar, null, view, str, null);
                btsVar.o0(dsSnackbar_androidKt$SnackbarAccessibilityEffect$1$1);
                Q = dsSnackbar_androidKt$SnackbarAccessibilityEffect$1$1;
            }
            btsVar.t(false);
            zpn.e(btsVar, (wls) Q, value);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(str, ysmVar, i, i3);
        }
    }
}
