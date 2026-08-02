package com.yandex.go.messenger_native.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/messenger_native/analytics/NativeMessengerAnalytics$Reason", "", "Lcom/yandex/go/messenger_native/analytics/NativeMessengerAnalytics$Reason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CloseTapped", "StatusChanged", "OtherChatOpened", "BackPressed", "Unknown", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NativeMessengerAnalytics$Reason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NativeMessengerAnalytics$Reason[] $VALUES;
    public static final NativeMessengerAnalytics$Reason BackPressed;
    public static final NativeMessengerAnalytics$Reason CloseTapped;
    public static final NativeMessengerAnalytics$Reason OtherChatOpened;
    public static final NativeMessengerAnalytics$Reason StatusChanged;
    public static final NativeMessengerAnalytics$Reason Unknown;
    private final String eventValue;

    static {
        NativeMessengerAnalytics$Reason nativeMessengerAnalytics$Reason = new NativeMessengerAnalytics$Reason("CloseTapped", 0, "close_tapped");
        CloseTapped = nativeMessengerAnalytics$Reason;
        NativeMessengerAnalytics$Reason nativeMessengerAnalytics$Reason2 = new NativeMessengerAnalytics$Reason("StatusChanged", 1, "status_changed");
        StatusChanged = nativeMessengerAnalytics$Reason2;
        NativeMessengerAnalytics$Reason nativeMessengerAnalytics$Reason3 = new NativeMessengerAnalytics$Reason("OtherChatOpened", 2, "other_chat_opened");
        OtherChatOpened = nativeMessengerAnalytics$Reason3;
        NativeMessengerAnalytics$Reason nativeMessengerAnalytics$Reason4 = new NativeMessengerAnalytics$Reason("BackPressed", 3, "back_pressed");
        BackPressed = nativeMessengerAnalytics$Reason4;
        NativeMessengerAnalytics$Reason nativeMessengerAnalytics$Reason5 = new NativeMessengerAnalytics$Reason("Unknown", 4, "unknown");
        Unknown = nativeMessengerAnalytics$Reason5;
        NativeMessengerAnalytics$Reason[] nativeMessengerAnalytics$ReasonArr = {nativeMessengerAnalytics$Reason, nativeMessengerAnalytics$Reason2, nativeMessengerAnalytics$Reason3, nativeMessengerAnalytics$Reason4, nativeMessengerAnalytics$Reason5};
        $VALUES = nativeMessengerAnalytics$ReasonArr;
        $ENTRIES = a.a(nativeMessengerAnalytics$ReasonArr);
    }

    public NativeMessengerAnalytics$Reason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static NativeMessengerAnalytics$Reason valueOf(String str) {
        return (NativeMessengerAnalytics$Reason) Enum.valueOf(NativeMessengerAnalytics$Reason.class, str);
    }

    public static NativeMessengerAnalytics$Reason[] values() {
        return (NativeMessengerAnalytics$Reason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
