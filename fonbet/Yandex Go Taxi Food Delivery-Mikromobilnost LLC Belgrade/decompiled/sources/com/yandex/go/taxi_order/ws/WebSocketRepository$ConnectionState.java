package com.yandex.go.taxi_order.ws;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi_order/ws/WebSocketRepository$ConnectionState", "", "Lcom/yandex/go/taxi_order/ws/WebSocketRepository$ConnectionState;", "CONNECTED", "CONNECTING", "DISCONNECTED", "ws"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WebSocketRepository$ConnectionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebSocketRepository$ConnectionState[] $VALUES;
    public static final WebSocketRepository$ConnectionState CONNECTED;
    public static final WebSocketRepository$ConnectionState CONNECTING;
    public static final WebSocketRepository$ConnectionState DISCONNECTED;

    static {
        WebSocketRepository$ConnectionState webSocketRepository$ConnectionState = new WebSocketRepository$ConnectionState("CONNECTED", 0);
        CONNECTED = webSocketRepository$ConnectionState;
        WebSocketRepository$ConnectionState webSocketRepository$ConnectionState2 = new WebSocketRepository$ConnectionState("CONNECTING", 1);
        CONNECTING = webSocketRepository$ConnectionState2;
        WebSocketRepository$ConnectionState webSocketRepository$ConnectionState3 = new WebSocketRepository$ConnectionState("DISCONNECTED", 2);
        DISCONNECTED = webSocketRepository$ConnectionState3;
        WebSocketRepository$ConnectionState[] webSocketRepository$ConnectionStateArr = {webSocketRepository$ConnectionState, webSocketRepository$ConnectionState2, webSocketRepository$ConnectionState3};
        $VALUES = webSocketRepository$ConnectionStateArr;
        $ENTRIES = kotlin.enums.a.a(webSocketRepository$ConnectionStateArr);
    }

    public static WebSocketRepository$ConnectionState valueOf(String str) {
        return (WebSocketRepository$ConnectionState) Enum.valueOf(WebSocketRepository$ConnectionState.class, str);
    }

    public static WebSocketRepository$ConnectionState[] values() {
        return (WebSocketRepository$ConnectionState[]) $VALUES.clone();
    }
}
