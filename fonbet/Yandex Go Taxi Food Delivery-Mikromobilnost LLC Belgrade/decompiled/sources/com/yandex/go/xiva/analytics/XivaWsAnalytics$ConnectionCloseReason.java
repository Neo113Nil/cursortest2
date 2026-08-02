package com.yandex.go.xiva.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/xiva/analytics/XivaWsAnalytics$ConnectionCloseReason", "", "Lcom/yandex/go/xiva/analytics/XivaWsAnalytics$ConnectionCloseReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ClientDisconnected", "ConnectionError", "ServerError", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class XivaWsAnalytics$ConnectionCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ XivaWsAnalytics$ConnectionCloseReason[] $VALUES;
    public static final XivaWsAnalytics$ConnectionCloseReason ClientDisconnected;
    public static final XivaWsAnalytics$ConnectionCloseReason ConnectionError;
    public static final XivaWsAnalytics$ConnectionCloseReason ServerError;
    private final String eventValue;

    static {
        XivaWsAnalytics$ConnectionCloseReason xivaWsAnalytics$ConnectionCloseReason = new XivaWsAnalytics$ConnectionCloseReason("ClientDisconnected", 0, "client_disconnected");
        ClientDisconnected = xivaWsAnalytics$ConnectionCloseReason;
        XivaWsAnalytics$ConnectionCloseReason xivaWsAnalytics$ConnectionCloseReason2 = new XivaWsAnalytics$ConnectionCloseReason("ConnectionError", 1, "connection_error");
        ConnectionError = xivaWsAnalytics$ConnectionCloseReason2;
        XivaWsAnalytics$ConnectionCloseReason xivaWsAnalytics$ConnectionCloseReason3 = new XivaWsAnalytics$ConnectionCloseReason("ServerError", 2, "server_error");
        ServerError = xivaWsAnalytics$ConnectionCloseReason3;
        XivaWsAnalytics$ConnectionCloseReason[] xivaWsAnalytics$ConnectionCloseReasonArr = {xivaWsAnalytics$ConnectionCloseReason, xivaWsAnalytics$ConnectionCloseReason2, xivaWsAnalytics$ConnectionCloseReason3};
        $VALUES = xivaWsAnalytics$ConnectionCloseReasonArr;
        $ENTRIES = a.a(xivaWsAnalytics$ConnectionCloseReasonArr);
    }

    public XivaWsAnalytics$ConnectionCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static XivaWsAnalytics$ConnectionCloseReason valueOf(String str) {
        return (XivaWsAnalytics$ConnectionCloseReason) Enum.valueOf(XivaWsAnalytics$ConnectionCloseReason.class, str);
    }

    public static XivaWsAnalytics$ConnectionCloseReason[] values() {
        return (XivaWsAnalytics$ConnectionCloseReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
