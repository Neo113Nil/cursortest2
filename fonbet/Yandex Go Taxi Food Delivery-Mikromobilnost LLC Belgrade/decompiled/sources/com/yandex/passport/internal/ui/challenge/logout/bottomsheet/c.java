package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.passport.R;
import defpackage.aii0;
import defpackage.bev;
import defpackage.bts;
import defpackage.d930;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;

/* loaded from: classes2.dex */
public abstract class c {
    public static final void a(String str, f530 f530Var, boolean z, fid fidVar, int i, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2083712643);
        int i3 = (btsVar.k(str) ? 4 : 2) | i2 | (btsVar.c(i) ? 32 : 16) | (btsVar.a(z) ? 256 : 128) | (btsVar.k(f530Var) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            btsVar.e0(1627511286);
            boolean k = ((i3 & 14) == 4) | btsVar.k(context);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                String str2 = str == null ? "" : str;
                Q = com.yandex.passport.internal.properties.u.z(context) + str2;
                btsVar.o0(Q);
            }
            String str3 = (String) Q;
            btsVar.t(false);
            bev bevVar = new bev(context);
            bevVar.c = str;
            bevVar.g = str3;
            bevVar.i(str3);
            bevVar.e();
            bevVar.j(R.drawable.passport_icon_user_unknown);
            bevVar.p(new com.yandex.passport.internal.ui.bouncer.roundabout.avatar.c(z, i));
            coil.compose.b.c(bevVar.d(), f530Var, btsVar, ((i3 >> 3) & 896) | 48);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d930(str, i, z, f530Var, i2);
        }
    }
}
