package com.yandex.go.quark.ai_assistant.impl.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/quark/ai_assistant/impl/analytics/SoulAnalytics$ScreenType", "", "Lcom/yandex/go/quark/ai_assistant/impl/analytics/SoulAnalytics$ScreenType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Chat", "History", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SoulAnalytics$ScreenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SoulAnalytics$ScreenType[] $VALUES;
    public static final SoulAnalytics$ScreenType Chat;
    public static final SoulAnalytics$ScreenType History;
    private final String eventValue;

    static {
        SoulAnalytics$ScreenType soulAnalytics$ScreenType = new SoulAnalytics$ScreenType("Chat", 0, "chat");
        Chat = soulAnalytics$ScreenType;
        SoulAnalytics$ScreenType soulAnalytics$ScreenType2 = new SoulAnalytics$ScreenType("History", 1, "history");
        History = soulAnalytics$ScreenType2;
        SoulAnalytics$ScreenType[] soulAnalytics$ScreenTypeArr = {soulAnalytics$ScreenType, soulAnalytics$ScreenType2};
        $VALUES = soulAnalytics$ScreenTypeArr;
        $ENTRIES = a.a(soulAnalytics$ScreenTypeArr);
    }

    public SoulAnalytics$ScreenType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SoulAnalytics$ScreenType valueOf(String str) {
        return (SoulAnalytics$ScreenType) Enum.valueOf(SoulAnalytics$ScreenType.class, str);
    }

    public static SoulAnalytics$ScreenType[] values() {
        return (SoulAnalytics$ScreenType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
