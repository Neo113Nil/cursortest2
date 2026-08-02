package com.yandex.go.messenger_native.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/messenger_native/api/NativeMessengerAnalyticsFacade$Reason", "", "Lcom/yandex/go/messenger_native/api/NativeMessengerAnalyticsFacade$Reason;", "CLOSE_TAPPED", "STATUS_CHANGED", "OTHER_CHAT_OPENED", "BACK_PRESSED", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NativeMessengerAnalyticsFacade$Reason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NativeMessengerAnalyticsFacade$Reason[] $VALUES;
    public static final NativeMessengerAnalyticsFacade$Reason BACK_PRESSED;
    public static final NativeMessengerAnalyticsFacade$Reason CLOSE_TAPPED;
    public static final NativeMessengerAnalyticsFacade$Reason OTHER_CHAT_OPENED;
    public static final NativeMessengerAnalyticsFacade$Reason STATUS_CHANGED;
    public static final NativeMessengerAnalyticsFacade$Reason UNKNOWN;

    static {
        NativeMessengerAnalyticsFacade$Reason nativeMessengerAnalyticsFacade$Reason = new NativeMessengerAnalyticsFacade$Reason("CLOSE_TAPPED", 0);
        CLOSE_TAPPED = nativeMessengerAnalyticsFacade$Reason;
        NativeMessengerAnalyticsFacade$Reason nativeMessengerAnalyticsFacade$Reason2 = new NativeMessengerAnalyticsFacade$Reason("STATUS_CHANGED", 1);
        STATUS_CHANGED = nativeMessengerAnalyticsFacade$Reason2;
        NativeMessengerAnalyticsFacade$Reason nativeMessengerAnalyticsFacade$Reason3 = new NativeMessengerAnalyticsFacade$Reason("OTHER_CHAT_OPENED", 2);
        OTHER_CHAT_OPENED = nativeMessengerAnalyticsFacade$Reason3;
        NativeMessengerAnalyticsFacade$Reason nativeMessengerAnalyticsFacade$Reason4 = new NativeMessengerAnalyticsFacade$Reason("BACK_PRESSED", 3);
        BACK_PRESSED = nativeMessengerAnalyticsFacade$Reason4;
        NativeMessengerAnalyticsFacade$Reason nativeMessengerAnalyticsFacade$Reason5 = new NativeMessengerAnalyticsFacade$Reason("UNKNOWN", 4);
        UNKNOWN = nativeMessengerAnalyticsFacade$Reason5;
        NativeMessengerAnalyticsFacade$Reason[] nativeMessengerAnalyticsFacade$ReasonArr = {nativeMessengerAnalyticsFacade$Reason, nativeMessengerAnalyticsFacade$Reason2, nativeMessengerAnalyticsFacade$Reason3, nativeMessengerAnalyticsFacade$Reason4, nativeMessengerAnalyticsFacade$Reason5};
        $VALUES = nativeMessengerAnalyticsFacade$ReasonArr;
        $ENTRIES = a.a(nativeMessengerAnalyticsFacade$ReasonArr);
    }

    public static NativeMessengerAnalyticsFacade$Reason valueOf(String str) {
        return (NativeMessengerAnalyticsFacade$Reason) Enum.valueOf(NativeMessengerAnalyticsFacade$Reason.class, str);
    }

    public static NativeMessengerAnalyticsFacade$Reason[] values() {
        return (NativeMessengerAnalyticsFacade$Reason[]) $VALUES.clone();
    }
}
