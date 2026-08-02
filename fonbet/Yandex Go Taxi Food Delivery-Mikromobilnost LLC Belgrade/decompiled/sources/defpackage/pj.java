package defpackage;

import com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.analytics.evgen.MainScreenOnboardingAnalytics$ClickTarget;
import com.yandex.go.taxi.order.chat.analytics.evgen.ChatAnalytics$CloseReasonV2;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class pj {
    public final pho a;

    public /* synthetic */ pj(pho phoVar) {
        this.a = phoVar;
    }

    public static void b(pj pjVar, ChatAnalytics$CloseReasonV2 chatAnalytics$CloseReasonV2, ChatAnalytics$CloseReasonV2 chatAnalytics$CloseReasonV22, int i) {
        if ((i & 1) != 0) {
            chatAnalytics$CloseReasonV2 = null;
        }
        if ((i & 2) != 0) {
            chatAnalytics$CloseReasonV22 = null;
        }
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        if (chatAnalytics$CloseReasonV2 != null) {
            hashMap.put("back", chatAnalytics$CloseReasonV2.getEventValue());
        }
        if (chatAnalytics$CloseReasonV22 != null) {
            hashMap.put("button", chatAnalytics$CloseReasonV22.getEventValue());
        }
        pjVar.a.a("Chat.Close", hashMap, 2, new HashMap());
    }

    public void a() {
        this.a.a("Account.PhonishUpgrade.Failed", new HashMap(), 1, new HashMap());
    }

    public void c(String str, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("is_selected", Boolean.valueOf(z));
        hashMap.put("tariff_class", str);
        this.a.a("DeliverySummary.DoorToDoor.Tapped", hashMap, 1, new HashMap());
    }

    public void d(String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("id", str);
        }
        this.a.a("DynamicFeature.Download.Error", hashMap, 1, new HashMap());
    }

    public void e(String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("id", str);
        }
        this.a.a("DynamicFeature.UserConfirmation.Canceled", hashMap, 1, new HashMap());
    }

    public void f(String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("id", str);
        }
        this.a.a("DynamicFeature.UserConfirmation.Success", hashMap, 1, new HashMap());
    }

    public void g(int i, String str, String str2) {
        HashMap u = g8e.u("tariff_class", str, "action", str2);
        this.a.a("IntercityMain.SeatsSelector.Tapped", u, 1, x4e.n(i, u, "seats_count"));
    }

    public void h(String str, String str2, MainScreenOnboardingAnalytics$ClickTarget mainScreenOnboardingAnalytics$ClickTarget) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("onboarding_id", str);
        }
        if (str2 != null) {
            hashMap.put("shortcut_id", str2);
        }
        if (mainScreenOnboardingAnalytics$ClickTarget != null) {
            hashMap.put("target", mainScreenOnboardingAnalytics$ClickTarget.getEventValue());
        }
        this.a.a("MainScreenOnboarding.Clicked", hashMap, 1, new HashMap());
    }

    public void i(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("onboarding_id", str);
        }
        this.a.a("MainScreenOnboarding.Dismissed", hashMap, 1, tse0.r("shortcut_id", hashMap, str2));
    }

    public void j(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("onboarding_id", str);
        }
        if (str2 != null) {
            hashMap.put("shortcut_id", str2);
        }
        this.a.a("MainScreenOnboarding.Opened", hashMap, 1, new HashMap());
    }
}
