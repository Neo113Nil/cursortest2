package com.yandex.plus.pay.ui.yb.web.internal.ui;

import com.yandex.plus.pay.ui.yb.api.PlusPayYbCardScenario;
import com.yandex.plus.pay.ui.yb.web.internal.YbWebResult;
import defpackage.PayUIEvgenAnalytics$YbCardActionScenario;
import defpackage.bvf0;
import defpackage.dio;
import defpackage.ds31;
import defpackage.eu90;
import defpackage.ffx;
import defpackage.ind0;
import defpackage.mz51;
import defpackage.tje;
import defpackage.up51;
import defpackage.xvz;
import defpackage.yr31;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class b extends yr31 {
    public final r0 A;
    public final String b;
    public final up51 c;
    public final PlusPayYbCardScenario w;
    public YbWebResult x = YbWebResult.Cancel.INSTANCE;
    public final n0 y;
    public final n0 z;

    public b(String str, long j, long j2, up51 up51Var, PlusPayYbCardScenario plusPayYbCardScenario) {
        this.b = str;
        this.c = up51Var;
        this.w = plusPayYbCardScenario;
        n0 c = ffx.c(0, 0, null, 7);
        this.y = c;
        this.z = c;
        this.A = bvf0.c(new mz51(str, j, j2));
        ind0 a = up51Var.a.a.a();
        eu90 eu90Var = up51Var.b;
        String d = dio.d(a.a);
        PayUIEvgenAnalytics$YbCardActionScenario a2 = up51.a(plusPayYbCardScenario);
        LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "url", str);
        t.put("action_scenario", a2.getEventValue());
        t.put("_meta", eu90.c(new HashMap()));
        eu90Var.f("OpeningYbCard.Screen.Shown", t);
    }

    public final void W() {
        tje.N(ds31.a(this), null, null, new YbWebViewModel$closeScreen$1(this, null), 3);
    }

    public final void X() {
        this.x = YbWebResult.Cancel.INSTANCE;
        up51 up51Var = this.c;
        ind0 a = up51Var.a.a.a();
        eu90 eu90Var = up51Var.b;
        String d = dio.d(a.a);
        PayUIEvgenAnalytics$YbCardActionScenario a2 = up51.a(this.w);
        LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "url", this.b);
        t.put("action_scenario", a2.getEventValue());
        t.put("_meta", eu90.c(new HashMap()));
        eu90Var.f("OpeningYbCard.Result.Cancelled", t);
        W();
    }

    public final void Y(String str) {
        this.x = YbWebResult.Error.INSTANCE;
        up51 up51Var = this.c;
        ind0 a = up51Var.a.a.a();
        eu90 eu90Var = up51Var.b;
        String d = dio.d(a.a);
        PayUIEvgenAnalytics$YbCardActionScenario a2 = up51.a(this.w);
        LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "url", this.b);
        t.put("action_scenario", a2.getEventValue());
        t.put("fail_reason", str);
        t.put("_meta", eu90.c(new HashMap()));
        eu90Var.f("OpeningYbCard.Result.Failed", t);
        W();
    }
}
