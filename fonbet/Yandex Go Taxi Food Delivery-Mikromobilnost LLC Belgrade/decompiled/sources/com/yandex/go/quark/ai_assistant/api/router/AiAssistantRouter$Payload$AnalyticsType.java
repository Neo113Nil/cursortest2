package com.yandex.go.quark.ai_assistant.api.router;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/quark/ai_assistant/api/router/AiAssistantRouter$Payload$AnalyticsType", "", "Lcom/yandex/go/quark/ai_assistant/api/router/AiAssistantRouter$Payload$AnalyticsType;", "Empty", "Soul", "go-client-android.features.quark.ai_assistant:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AiAssistantRouter$Payload$AnalyticsType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AiAssistantRouter$Payload$AnalyticsType[] $VALUES;
    public static final AiAssistantRouter$Payload$AnalyticsType Empty;
    public static final AiAssistantRouter$Payload$AnalyticsType Soul;

    static {
        AiAssistantRouter$Payload$AnalyticsType aiAssistantRouter$Payload$AnalyticsType = new AiAssistantRouter$Payload$AnalyticsType("Empty", 0);
        Empty = aiAssistantRouter$Payload$AnalyticsType;
        AiAssistantRouter$Payload$AnalyticsType aiAssistantRouter$Payload$AnalyticsType2 = new AiAssistantRouter$Payload$AnalyticsType("Soul", 1);
        Soul = aiAssistantRouter$Payload$AnalyticsType2;
        AiAssistantRouter$Payload$AnalyticsType[] aiAssistantRouter$Payload$AnalyticsTypeArr = {aiAssistantRouter$Payload$AnalyticsType, aiAssistantRouter$Payload$AnalyticsType2};
        $VALUES = aiAssistantRouter$Payload$AnalyticsTypeArr;
        $ENTRIES = a.a(aiAssistantRouter$Payload$AnalyticsTypeArr);
    }

    public static AiAssistantRouter$Payload$AnalyticsType valueOf(String str) {
        return (AiAssistantRouter$Payload$AnalyticsType) Enum.valueOf(AiAssistantRouter$Payload$AnalyticsType.class, str);
    }

    public static AiAssistantRouter$Payload$AnalyticsType[] values() {
        return (AiAssistantRouter$Payload$AnalyticsType[]) $VALUES.clone();
    }
}
