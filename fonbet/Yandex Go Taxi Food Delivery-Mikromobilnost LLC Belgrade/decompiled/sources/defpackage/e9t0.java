package defpackage;

import com.yandex.go.quark.ai_assistant.impl.analytics.AiAssistantAnalytics$NavigationButton;
import com.yandex.go.quark.ai_assistant.impl.analytics.AiAssistantAnalytics$ScreenType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class e9t0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[AiAssistantAnalytics$NavigationButton.values().length];
        try {
            iArr[AiAssistantAnalytics$NavigationButton.Back.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AiAssistantAnalytics$NavigationButton.HistoryChats.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AiAssistantAnalytics$NavigationButton.NewChat.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[AiAssistantAnalytics$ScreenType.values().length];
        try {
            iArr2[AiAssistantAnalytics$ScreenType.Chat.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[AiAssistantAnalytics$ScreenType.History.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
