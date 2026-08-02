package com.yandex.go.safety.center.safetycenter_web.ui.error;

import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$SafetyCenterNavigationSource;
import com.yandex.go.safety.center.safetycenter_web.b;
import defpackage.eul0;
import defpackage.nul0;
import defpackage.ppl0;
import defpackage.sls;
import defpackage.sul0;
import defpackage.tse0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class SafetyCenterWebErrorView$initViews$1$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        com.yandex.go.safety.center.safetycenter_web.a aVar = ((nul0) this.receiver).y;
        b bVar = aVar.b;
        eul0 eul0Var = bVar.N;
        sul0 sul0Var = aVar.a;
        ppl0 ppl0Var = eul0Var.d;
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
        ppl0Var.a.a("SafetyCenter.WebErrorScreen.EmergencyButton.Clicked", o, 1, new HashMap());
        b.P(bVar, sul0Var);
        return zy11.a;
    }
}
