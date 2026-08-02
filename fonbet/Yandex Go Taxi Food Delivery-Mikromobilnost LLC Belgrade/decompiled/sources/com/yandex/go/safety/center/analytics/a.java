package com.yandex.go.safety.center.analytics;

import com.yandex.go.safety.center.SafetyCenterApi;
import com.yandex.go.safety.center.SafetyCenterParams$Source;
import defpackage.g8e;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.irl0;
import defpackage.n20;
import defpackage.oo31;
import defpackage.pho;
import defpackage.ppl0;
import defpackage.tse0;
import defpackage.tt2;
import defpackage.w511;
import defpackage.x4e;
import java.util.HashMap;
import ru.yandex.taxi.am.k;

/* loaded from: classes13.dex */
public final class a {
    public final ppl0 a;
    public final SafetyCenterApi b;
    public final k c;
    public final h3y d;
    public final hbp0 e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(ppl0 ppl0Var, SafetyCenterApi safetyCenterApi, k kVar, h3y h3yVar, tt2 tt2Var) {
        this.a = ppl0Var;
        this.b = safetyCenterApi;
        this.c = kVar;
        this.d = h3yVar;
        hbp0 hbp0Var = new hbp0(new SafetyCenterEventsReporter$scopeDelegate$1(0, tt2Var, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
        hbp0Var.a();
        this.e = hbp0Var;
    }

    public static SafetyCenterAnalytics$SafetyCenterNavigationSource h(SafetyCenterParams$Source safetyCenterParams$Source) {
        int i = irl0.d[safetyCenterParams$Source.ordinal()];
        if (i == 1) {
            return SafetyCenterAnalytics$SafetyCenterNavigationSource.Menu;
        }
        if (i == 2) {
            return SafetyCenterAnalytics$SafetyCenterNavigationSource.RideCard;
        }
        if (i != 3 && i != 4) {
            w511.b();
            return null;
        }
        return SafetyCenterAnalytics$SafetyCenterNavigationSource.Deeplink;
    }

    public final void a(int i, boolean z) {
        ppl0 ppl0Var = this.a;
        HashMap o = tse0.o(ppl0Var);
        o.put("success_contacts_response", Boolean.valueOf(z));
        o.put("contacts_count", Integer.valueOf(i));
        ppl0Var.a.a("SafetyCenter.TrustedContacts.Shown", o, 2, new HashMap());
    }

    public final void b() {
        ppl0 ppl0Var = this.a;
        ppl0Var.a.a("SafetyCenter.AddTrustedContacts.Contact.Saved", tse0.o(ppl0Var), 1, new HashMap());
        i(SafetyCenterEventsReporter$AntifraudEvent.TrustedContactsShareTapped);
    }

    public final void c(boolean z) {
        ppl0 ppl0Var = this.a;
        HashMap o = tse0.o(ppl0Var);
        ppl0Var.a.a("SafetyCenter.EmergencyAlertContactsSwitch.Tapped", o, 1, x4e.r(z, o, "should_notify_contacts"));
        i(SafetyCenterEventsReporter$AntifraudEvent.EmergencyAlertContactsSwitch);
    }

    public final void d(SafetyCenterAnalytics$EmergencyCallStatus safetyCenterAnalytics$EmergencyCallStatus, SafetyCenterAnalytics$EmergencyCallScenario safetyCenterAnalytics$EmergencyCallScenario) {
        ppl0 ppl0Var = this.a;
        HashMap o = tse0.o(ppl0Var);
        o.put("call_status", safetyCenterAnalytics$EmergencyCallStatus.getEventValue());
        o.put("scenario", safetyCenterAnalytics$EmergencyCallScenario.getEventValue());
        ppl0Var.a.a("SafetyCenter.EmergencyCall.StatusChanged", o, 1, new HashMap());
    }

    public final void e(int i) {
        ppl0 ppl0Var = this.a;
        ppl0Var.a.a("SafetyCenter.Emergency.CallTapped", tse0.o(ppl0Var), 1, new HashMap());
        ppl0Var.a(SafetyCenterAnalytics$EmergencyButtonType.Call, Integer.valueOf(i));
        i(SafetyCenterEventsReporter$AntifraudEvent.EmergencyCallTapped);
    }

    public final void f(boolean z, boolean z2, boolean z3) {
        ppl0 ppl0Var = this.a;
        HashMap o = tse0.o(ppl0Var);
        oo31.q(z, o, "location_known", z2, "frauder");
        ppl0Var.a.a("SafetyCenter.Emergency.Shown", o, 1, x4e.r(z3, o, "alert_contacts"));
        i(SafetyCenterEventsReporter$AntifraudEvent.EmergencyShown);
    }

    public final void g(SafetyCenterParams$Source safetyCenterParams$Source, boolean z, boolean z2, boolean z3, String str) {
        boolean z4 = this.c.Lg() != 0;
        SafetyCenterAnalytics$SafetyCenterLaunchResult safetyCenterAnalytics$SafetyCenterLaunchResult = z2 ? SafetyCenterAnalytics$SafetyCenterLaunchResult.Success : SafetyCenterAnalytics$SafetyCenterLaunchResult.Failure;
        SafetyCenterAnalytics$SafetyCenterNavigationSource h = h(safetyCenterParams$Source);
        Boolean valueOf = Boolean.valueOf(z3);
        ppl0 ppl0Var = this.a;
        ppl0Var.getClass();
        pho phoVar = ppl0Var.a;
        HashMap hashMap = new HashMap();
        hashMap.put("source", h.getEventValue());
        hashMap.put("has_active_order", Boolean.valueOf(z));
        hashMap.put("has_account", Boolean.valueOf(z4));
        hashMap.put("launch_response", safetyCenterAnalytics$SafetyCenterLaunchResult.getEventValue());
        if (str != null) {
            hashMap.put("country", str);
        }
        phoVar.a("SafetyCenter.Shown", hashMap, 1, g8e.v(hashMap, "frauder", valueOf));
        Boolean valueOf2 = Boolean.valueOf(z3);
        Boolean valueOf3 = Boolean.valueOf(safetyCenterParams$Source == SafetyCenterParams$Source.MENU);
        Boolean valueOf4 = Boolean.valueOf(z4);
        Boolean valueOf5 = Boolean.valueOf(z);
        Boolean valueOf6 = Boolean.valueOf(z2);
        HashMap hashMap2 = new HashMap();
        if (str != null) {
            hashMap2.put("country", str);
        }
        hashMap2.put("frauder", valueOf2);
        hashMap2.put("from_menu", valueOf3);
        hashMap2.put("has_account", valueOf4);
        hashMap2.put("has_active_order", valueOf5);
        hashMap2.put("success_launch_response", valueOf6);
        phoVar.a("SafetyCenter.Main.Shown", hashMap2, 1, new HashMap());
    }

    public final void i(SafetyCenterEventsReporter$AntifraudEvent safetyCenterEventsReporter$AntifraudEvent) {
        hbp0.e(this.e, null, null, new SafetyCenterEventsReporter$reportToAntifraud$1((n20) this.d.get(), safetyCenterEventsReporter$AntifraudEvent, String.valueOf(this.c.Lg()), this, null), 3);
    }
}
