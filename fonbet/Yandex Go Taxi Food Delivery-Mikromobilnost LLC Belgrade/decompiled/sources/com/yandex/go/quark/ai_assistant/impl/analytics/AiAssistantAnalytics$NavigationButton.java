package com.yandex.go.quark.ai_assistant.impl.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/quark/ai_assistant/impl/analytics/AiAssistantAnalytics$NavigationButton", "", "Lcom/yandex/go/quark/ai_assistant/impl/analytics/AiAssistantAnalytics$NavigationButton;", "Back", "HistoryChats", "NewChat", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AiAssistantAnalytics$NavigationButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AiAssistantAnalytics$NavigationButton[] $VALUES;
    public static final AiAssistantAnalytics$NavigationButton Back;
    public static final AiAssistantAnalytics$NavigationButton HistoryChats;
    public static final AiAssistantAnalytics$NavigationButton NewChat;

    static {
        AiAssistantAnalytics$NavigationButton aiAssistantAnalytics$NavigationButton = new AiAssistantAnalytics$NavigationButton("Back", 0);
        Back = aiAssistantAnalytics$NavigationButton;
        AiAssistantAnalytics$NavigationButton aiAssistantAnalytics$NavigationButton2 = new AiAssistantAnalytics$NavigationButton("HistoryChats", 1);
        HistoryChats = aiAssistantAnalytics$NavigationButton2;
        AiAssistantAnalytics$NavigationButton aiAssistantAnalytics$NavigationButton3 = new AiAssistantAnalytics$NavigationButton("NewChat", 2);
        NewChat = aiAssistantAnalytics$NavigationButton3;
        AiAssistantAnalytics$NavigationButton[] aiAssistantAnalytics$NavigationButtonArr = {aiAssistantAnalytics$NavigationButton, aiAssistantAnalytics$NavigationButton2, aiAssistantAnalytics$NavigationButton3};
        $VALUES = aiAssistantAnalytics$NavigationButtonArr;
        $ENTRIES = a.a(aiAssistantAnalytics$NavigationButtonArr);
    }

    public static AiAssistantAnalytics$NavigationButton valueOf(String str) {
        return (AiAssistantAnalytics$NavigationButton) Enum.valueOf(AiAssistantAnalytics$NavigationButton.class, str);
    }

    public static AiAssistantAnalytics$NavigationButton[] values() {
        return (AiAssistantAnalytics$NavigationButton[]) $VALUES.clone();
    }
}
