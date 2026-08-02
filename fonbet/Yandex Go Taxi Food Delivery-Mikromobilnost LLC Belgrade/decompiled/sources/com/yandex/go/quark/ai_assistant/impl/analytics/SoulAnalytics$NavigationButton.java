package com.yandex.go.quark.ai_assistant.impl.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/quark/ai_assistant/impl/analytics/SoulAnalytics$NavigationButton", "", "Lcom/yandex/go/quark/ai_assistant/impl/analytics/SoulAnalytics$NavigationButton;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "HistoryChats", "NewChat", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SoulAnalytics$NavigationButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SoulAnalytics$NavigationButton[] $VALUES;
    public static final SoulAnalytics$NavigationButton Back;
    public static final SoulAnalytics$NavigationButton HistoryChats;
    public static final SoulAnalytics$NavigationButton NewChat;
    private final String eventValue;

    static {
        SoulAnalytics$NavigationButton soulAnalytics$NavigationButton = new SoulAnalytics$NavigationButton("Back", 0, "back");
        Back = soulAnalytics$NavigationButton;
        SoulAnalytics$NavigationButton soulAnalytics$NavigationButton2 = new SoulAnalytics$NavigationButton("HistoryChats", 1, "history_chats");
        HistoryChats = soulAnalytics$NavigationButton2;
        SoulAnalytics$NavigationButton soulAnalytics$NavigationButton3 = new SoulAnalytics$NavigationButton("NewChat", 2, "new_chat");
        NewChat = soulAnalytics$NavigationButton3;
        SoulAnalytics$NavigationButton[] soulAnalytics$NavigationButtonArr = {soulAnalytics$NavigationButton, soulAnalytics$NavigationButton2, soulAnalytics$NavigationButton3};
        $VALUES = soulAnalytics$NavigationButtonArr;
        $ENTRIES = a.a(soulAnalytics$NavigationButtonArr);
    }

    public SoulAnalytics$NavigationButton(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SoulAnalytics$NavigationButton valueOf(String str) {
        return (SoulAnalytics$NavigationButton) Enum.valueOf(SoulAnalytics$NavigationButton.class, str);
    }

    public static SoulAnalytics$NavigationButton[] values() {
        return (SoulAnalytics$NavigationButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
