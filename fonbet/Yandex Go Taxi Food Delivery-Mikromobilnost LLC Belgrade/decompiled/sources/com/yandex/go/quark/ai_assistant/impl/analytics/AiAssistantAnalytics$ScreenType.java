package com.yandex.go.quark.ai_assistant.impl.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/quark/ai_assistant/impl/analytics/AiAssistantAnalytics$ScreenType", "", "Lcom/yandex/go/quark/ai_assistant/impl/analytics/AiAssistantAnalytics$ScreenType;", "Chat", "History", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AiAssistantAnalytics$ScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AiAssistantAnalytics$ScreenType[] $VALUES;
    public static final AiAssistantAnalytics$ScreenType Chat;
    public static final AiAssistantAnalytics$ScreenType History;

    static {
        AiAssistantAnalytics$ScreenType aiAssistantAnalytics$ScreenType = new AiAssistantAnalytics$ScreenType("Chat", 0);
        Chat = aiAssistantAnalytics$ScreenType;
        AiAssistantAnalytics$ScreenType aiAssistantAnalytics$ScreenType2 = new AiAssistantAnalytics$ScreenType("History", 1);
        History = aiAssistantAnalytics$ScreenType2;
        AiAssistantAnalytics$ScreenType[] aiAssistantAnalytics$ScreenTypeArr = {aiAssistantAnalytics$ScreenType, aiAssistantAnalytics$ScreenType2};
        $VALUES = aiAssistantAnalytics$ScreenTypeArr;
        $ENTRIES = a.a(aiAssistantAnalytics$ScreenTypeArr);
    }

    public static AiAssistantAnalytics$ScreenType valueOf(String str) {
        return (AiAssistantAnalytics$ScreenType) Enum.valueOf(AiAssistantAnalytics$ScreenType.class, str);
    }

    public static AiAssistantAnalytics$ScreenType[] values() {
        return (AiAssistantAnalytics$ScreenType[]) $VALUES.clone();
    }
}
