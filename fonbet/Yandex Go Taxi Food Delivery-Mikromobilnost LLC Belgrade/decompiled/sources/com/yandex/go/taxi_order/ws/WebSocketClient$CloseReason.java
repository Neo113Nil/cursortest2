package com.yandex.go.taxi_order.ws;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/taxi_order/ws/WebSocketClient$CloseReason", "", "Lcom/yandex/go/taxi_order/ws/WebSocketClient$CloseReason;", "CLIENT_DISCONNECTED", "CONNECTION_ERROR", "SERVER_ERROR", "UNAUTHORIZED", "BAD_REQUEST", "ws"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WebSocketClient$CloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebSocketClient$CloseReason[] $VALUES;
    public static final WebSocketClient$CloseReason BAD_REQUEST;
    public static final WebSocketClient$CloseReason CLIENT_DISCONNECTED;
    public static final WebSocketClient$CloseReason CONNECTION_ERROR;
    public static final WebSocketClient$CloseReason SERVER_ERROR;
    public static final WebSocketClient$CloseReason UNAUTHORIZED;

    static {
        WebSocketClient$CloseReason webSocketClient$CloseReason = new WebSocketClient$CloseReason("CLIENT_DISCONNECTED", 0);
        CLIENT_DISCONNECTED = webSocketClient$CloseReason;
        WebSocketClient$CloseReason webSocketClient$CloseReason2 = new WebSocketClient$CloseReason("CONNECTION_ERROR", 1);
        CONNECTION_ERROR = webSocketClient$CloseReason2;
        WebSocketClient$CloseReason webSocketClient$CloseReason3 = new WebSocketClient$CloseReason("SERVER_ERROR", 2);
        SERVER_ERROR = webSocketClient$CloseReason3;
        WebSocketClient$CloseReason webSocketClient$CloseReason4 = new WebSocketClient$CloseReason("UNAUTHORIZED", 3);
        UNAUTHORIZED = webSocketClient$CloseReason4;
        WebSocketClient$CloseReason webSocketClient$CloseReason5 = new WebSocketClient$CloseReason("BAD_REQUEST", 4);
        BAD_REQUEST = webSocketClient$CloseReason5;
        WebSocketClient$CloseReason[] webSocketClient$CloseReasonArr = {webSocketClient$CloseReason, webSocketClient$CloseReason2, webSocketClient$CloseReason3, webSocketClient$CloseReason4, webSocketClient$CloseReason5};
        $VALUES = webSocketClient$CloseReasonArr;
        $ENTRIES = kotlin.enums.a.a(webSocketClient$CloseReasonArr);
    }

    public static WebSocketClient$CloseReason valueOf(String str) {
        return (WebSocketClient$CloseReason) Enum.valueOf(WebSocketClient$CloseReason.class, str);
    }

    public static WebSocketClient$CloseReason[] values() {
        return (WebSocketClient$CloseReason[]) $VALUES.clone();
    }
}
