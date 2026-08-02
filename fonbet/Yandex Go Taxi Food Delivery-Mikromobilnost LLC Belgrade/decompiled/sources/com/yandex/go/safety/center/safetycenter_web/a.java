package com.yandex.go.safety.center.safetycenter_web;

import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$SafetyCenterNavigationSource;
import defpackage.eul0;
import defpackage.ppl0;
import defpackage.sul0;
import defpackage.tje;
import defpackage.tse0;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class a {
    public final sul0 a;
    public final /* synthetic */ b b;

    public a(b bVar, sul0 sul0Var) {
        this.b = bVar;
        this.a = sul0Var;
    }

    public final void a() {
        b bVar = this.b;
        eul0 eul0Var = bVar.N;
        ppl0 ppl0Var = eul0Var.d;
        sul0 sul0Var = this.a;
        SafetyCenterAnalytics$SafetyCenterNavigationSource e = eul0.e(sul0Var.d);
        boolean c = eul0Var.c();
        boolean z = sul0Var.b;
        String b = eul0Var.b();
        String d = eul0Var.d();
        String str = sul0Var.a;
        HashMap o = tse0.o(ppl0Var);
        o.put("source", e.getEventValue());
        o.put("has_account", Boolean.valueOf(c));
        o.put("is_checklist", Boolean.valueOf(z));
        if (b != null) {
            o.put("country", b);
        }
        if (d != null) {
            o.put("zone_name", d);
        }
        if (str != null) {
            o.put("source_order_id", str);
        }
        ppl0Var.a.a("SafetyCenter.WebErrorScreen.ShareRouteButton.Clicked", o, 1, new HashMap());
        tje.N(bVar.o(), null, null, new SafetyCenterWebFeatureRouter$FailureScreenCallbacks$shareUrl$1(bVar, this, null), 3);
    }
}
