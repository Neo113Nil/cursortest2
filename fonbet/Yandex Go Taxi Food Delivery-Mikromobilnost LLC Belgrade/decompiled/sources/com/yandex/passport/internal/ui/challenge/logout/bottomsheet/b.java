package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.adb1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bts;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.i43;
import defpackage.kyv0;
import defpackage.l690;
import defpackage.ljs0;
import defpackage.m6;
import defpackage.o430;
import defpackage.tls;
import defpackage.x4c;
import java.util.List;

/* loaded from: classes14.dex */
public abstract class b {
    public static final void a(int i, fid fidVar, f530 f530Var, List list) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-879676741);
        if ((((btsVar.e(list) ? 4 : 2) | i) & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            float f = list.size() > 2 ? 72.0f : 96.0f;
            int f0 = ((fwi) btsVar.m(androidx.compose.ui.platform.j.h)).f0(f);
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            l690 b = an91.b(24.0f, 0.0f, 2);
            i43 i43Var = new i43(8.0f, true, new m6(9, x4c.H));
            f530 c = ljs0.c(f530Var, 1.0f);
            btsVar.e0(288782766);
            boolean e = btsVar.e(context) | btsVar.e(list);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new com.yandex.passport.internal.flags.presentation.s0(17, context, list);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            f530 a = fnq0.a(c, (tls) Q);
            btsVar.e0(288790616);
            boolean e2 = btsVar.e(list) | btsVar.b(f) | btsVar.c(f0);
            Object Q2 = btsVar.Q();
            if (e2 || Q2 == o430Var) {
                Q2 = new kyv0(list, f, f0, 1);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            adb1.b(a, null, b, i43Var, null, null, false, null, (tls) Q2, btsVar, 24960, 490);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.common.ui.compose.a(list, f530Var, i, 12);
        }
    }
}
