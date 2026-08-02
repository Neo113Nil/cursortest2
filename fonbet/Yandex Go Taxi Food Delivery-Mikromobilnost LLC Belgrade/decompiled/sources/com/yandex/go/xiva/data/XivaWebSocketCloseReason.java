package com.yandex.go.xiva.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/xiva/data/XivaWebSocketCloseReason;", "", "ClientDisconnected", "ConnectionError", "ServerError", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class XivaWebSocketCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ XivaWebSocketCloseReason[] $VALUES;
    public static final XivaWebSocketCloseReason ClientDisconnected;
    public static final XivaWebSocketCloseReason ConnectionError;
    public static final XivaWebSocketCloseReason ServerError;

    static {
        XivaWebSocketCloseReason xivaWebSocketCloseReason = new XivaWebSocketCloseReason("ClientDisconnected", 0);
        ClientDisconnected = xivaWebSocketCloseReason;
        XivaWebSocketCloseReason xivaWebSocketCloseReason2 = new XivaWebSocketCloseReason("ConnectionError", 1);
        ConnectionError = xivaWebSocketCloseReason2;
        XivaWebSocketCloseReason xivaWebSocketCloseReason3 = new XivaWebSocketCloseReason("ServerError", 2);
        ServerError = xivaWebSocketCloseReason3;
        XivaWebSocketCloseReason[] xivaWebSocketCloseReasonArr = {xivaWebSocketCloseReason, xivaWebSocketCloseReason2, xivaWebSocketCloseReason3};
        $VALUES = xivaWebSocketCloseReasonArr;
        $ENTRIES = kotlin.enums.a.a(xivaWebSocketCloseReasonArr);
    }

    public static XivaWebSocketCloseReason valueOf(String str) {
        return (XivaWebSocketCloseReason) Enum.valueOf(XivaWebSocketCloseReason.class, str);
    }

    public static XivaWebSocketCloseReason[] values() {
        return (XivaWebSocketCloseReason[]) $VALUES.clone();
    }
}
