package com.yandex.quark.webchat;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/quark/webchat/WebViewInsetsController$LastPageState", "", "Lcom/yandex/quark/webchat/WebViewInsetsController$LastPageState;", "Started", "Initial", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final class WebViewInsetsController$LastPageState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebViewInsetsController$LastPageState[] $VALUES;
    public static final WebViewInsetsController$LastPageState Initial;
    public static final WebViewInsetsController$LastPageState Started;

    static {
        WebViewInsetsController$LastPageState webViewInsetsController$LastPageState = new WebViewInsetsController$LastPageState("Started", 0);
        Started = webViewInsetsController$LastPageState;
        WebViewInsetsController$LastPageState webViewInsetsController$LastPageState2 = new WebViewInsetsController$LastPageState("Initial", 1);
        Initial = webViewInsetsController$LastPageState2;
        WebViewInsetsController$LastPageState[] webViewInsetsController$LastPageStateArr = {webViewInsetsController$LastPageState, webViewInsetsController$LastPageState2};
        $VALUES = webViewInsetsController$LastPageStateArr;
        $ENTRIES = kotlin.enums.a.a(webViewInsetsController$LastPageStateArr);
    }

    public static WebViewInsetsController$LastPageState valueOf(String str) {
        return (WebViewInsetsController$LastPageState) Enum.valueOf(WebViewInsetsController$LastPageState.class, str);
    }

    public static WebViewInsetsController$LastPageState[] values() {
        return (WebViewInsetsController$LastPageState[]) $VALUES.clone();
    }
}
