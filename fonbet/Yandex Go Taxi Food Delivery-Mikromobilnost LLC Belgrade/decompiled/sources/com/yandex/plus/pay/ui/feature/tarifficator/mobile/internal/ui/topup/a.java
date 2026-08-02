package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.SuccessFlowScreen;
import defpackage.bvf0;
import defpackage.dio;
import defpackage.ds31;
import defpackage.eu90;
import defpackage.hxz0;
import defpackage.ind0;
import defpackage.ixz0;
import defpackage.jnd0;
import defpackage.k3v0;
import defpackage.lpd0;
import defpackage.m3v0;
import defpackage.mdd0;
import defpackage.myz0;
import defpackage.tje;
import defpackage.xvz;
import defpackage.yr31;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class a extends yr31 {
    public final r0 A;
    public final ixz0 b;
    public final k3v0 c;
    public final lpd0 w;
    public final mdd0 x;
    public hxz0 y;
    public final r0 z;

    public a(jnd0 jnd0Var, ixz0 ixz0Var, k3v0 k3v0Var, lpd0 lpd0Var, mdd0 mdd0Var) {
        this.b = ixz0Var;
        this.c = k3v0Var;
        this.w = lpd0Var;
        this.x = mdd0Var;
        r0 c = bvf0.c(myz0.a);
        this.z = c;
        this.A = c;
        tje.N(ds31.a(this), null, null, new TopupViewModel$setContentState$1(this, jnd0Var.a.a(), null), 3);
    }

    public final void W() {
        ((m3v0) this.c).b(SuccessFlowScreen.TOPUP);
    }

    public final void X() {
        hxz0 hxz0Var = this.y;
        if (hxz0Var != null) {
            String str = hxz0Var.a;
            String str2 = hxz0Var.b;
            if (str2 == null) {
                str2 = "no_value";
            }
            lpd0 lpd0Var = this.w;
            ind0 a = lpd0Var.a.a();
            eu90 eu90Var = lpd0Var.b;
            LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", dio.d(a.a), "action_scenario", str);
            t.put("url", str2);
            t.put("_meta", eu90.c(new HashMap()));
            eu90Var.f("PostPaymentYB.Result.Cancelled", t);
        }
        W();
    }
}
