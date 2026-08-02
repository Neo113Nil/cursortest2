package defpackage;

import com.yandex.go.quark.ai_assistant.impl.analytics.AiAssistantAnalytics$NavigationButton;
import com.yandex.go.quark.ai_assistant.impl.analytics.AiAssistantAnalytics$ScreenType;
import com.yandex.go.quark.ai_assistant.impl.analytics.SoulAnalytics$NavigationButton;
import com.yandex.go.quark.ai_assistant.impl.analytics.SoulAnalytics$ScreenType;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class d9t0 implements kl1 {
    public final x770 a;

    public d9t0(x770 x770Var) {
        this.a = x770Var;
    }

    @Override // defpackage.kl1
    public final void a(String str, AiAssistantAnalytics$NavigationButton aiAssistantAnalytics$NavigationButton, AiAssistantAnalytics$ScreenType aiAssistantAnalytics$ScreenType) {
        SoulAnalytics$NavigationButton soulAnalytics$NavigationButton;
        SoulAnalytics$ScreenType soulAnalytics$ScreenType;
        int i = e9t0.a[aiAssistantAnalytics$NavigationButton.ordinal()];
        if (i == 1) {
            soulAnalytics$NavigationButton = SoulAnalytics$NavigationButton.Back;
        } else if (i == 2) {
            soulAnalytics$NavigationButton = SoulAnalytics$NavigationButton.HistoryChats;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            soulAnalytics$NavigationButton = SoulAnalytics$NavigationButton.NewChat;
        }
        if (aiAssistantAnalytics$ScreenType != null) {
            int i2 = e9t0.b[aiAssistantAnalytics$ScreenType.ordinal()];
            if (i2 == 1) {
                soulAnalytics$ScreenType = SoulAnalytics$ScreenType.Chat;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return;
                }
                soulAnalytics$ScreenType = SoulAnalytics$ScreenType.History;
            }
        } else {
            soulAnalytics$ScreenType = null;
        }
        x770 x770Var = this.a;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(CommonUrlParts.APP_ID, str);
        hashMap.put("button_name", soulAnalytics$NavigationButton.getEventValue());
        if (soulAnalytics$ScreenType != null) {
            hashMap.put("screen_type", soulAnalytics$ScreenType.getEventValue());
        }
        x770Var.a.a("Soul.ChatNavigation.Tapped", hashMap, 2, new HashMap());
    }

    @Override // defpackage.kl1
    public final void b(String str) {
        x770 x770Var = this.a;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(CommonUrlParts.APP_ID, str);
        x770Var.a.a("Soul.ChatErrorRetry.Tapped", hashMap, 2, new HashMap());
    }

    @Override // defpackage.kl1
    public final void c(String str) {
        x770 x770Var = this.a;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(CommonUrlParts.APP_ID, str);
        x770Var.a.a("Soul.ChatError.Shown", hashMap, 2, new HashMap());
    }
}
