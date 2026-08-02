package com.yandex.go.taxi.order.chat.analytics.evgen;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/taxi/order/chat/analytics/evgen/ChatAnalytics$CloseReasonV2", "", "Lcom/yandex/go/taxi/order/chat/analytics/evgen/ChatAnalytics$CloseReasonV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", PlusPayUiKitInflaterFactory.NAME_BUTTON, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChatAnalytics$CloseReasonV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChatAnalytics$CloseReasonV2[] $VALUES;
    public static final ChatAnalytics$CloseReasonV2 Back;
    public static final ChatAnalytics$CloseReasonV2 Button;
    private final String eventValue;

    static {
        ChatAnalytics$CloseReasonV2 chatAnalytics$CloseReasonV2 = new ChatAnalytics$CloseReasonV2("Back", 0, "Back");
        Back = chatAnalytics$CloseReasonV2;
        ChatAnalytics$CloseReasonV2 chatAnalytics$CloseReasonV22 = new ChatAnalytics$CloseReasonV2(PlusPayUiKitInflaterFactory.NAME_BUTTON, 1, PlusPayUiKitInflaterFactory.NAME_BUTTON);
        Button = chatAnalytics$CloseReasonV22;
        ChatAnalytics$CloseReasonV2[] chatAnalytics$CloseReasonV2Arr = {chatAnalytics$CloseReasonV2, chatAnalytics$CloseReasonV22};
        $VALUES = chatAnalytics$CloseReasonV2Arr;
        $ENTRIES = a.a(chatAnalytics$CloseReasonV2Arr);
    }

    public ChatAnalytics$CloseReasonV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ChatAnalytics$CloseReasonV2 valueOf(String str) {
        return (ChatAnalytics$CloseReasonV2) Enum.valueOf(ChatAnalytics$CloseReasonV2.class, str);
    }

    public static ChatAnalytics$CloseReasonV2[] values() {
        return (ChatAnalytics$CloseReasonV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
