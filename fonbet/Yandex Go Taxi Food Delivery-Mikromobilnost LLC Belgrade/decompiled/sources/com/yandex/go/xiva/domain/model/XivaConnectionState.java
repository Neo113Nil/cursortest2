package com.yandex.go.xiva.domain.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/xiva/domain/model/XivaConnectionState;", "", "Connected", "Connecting", "Disconnected", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class XivaConnectionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ XivaConnectionState[] $VALUES;
    public static final XivaConnectionState Connected;
    public static final XivaConnectionState Connecting;
    public static final XivaConnectionState Disconnected;

    static {
        XivaConnectionState xivaConnectionState = new XivaConnectionState("Connected", 0);
        Connected = xivaConnectionState;
        XivaConnectionState xivaConnectionState2 = new XivaConnectionState("Connecting", 1);
        Connecting = xivaConnectionState2;
        XivaConnectionState xivaConnectionState3 = new XivaConnectionState("Disconnected", 2);
        Disconnected = xivaConnectionState3;
        XivaConnectionState[] xivaConnectionStateArr = {xivaConnectionState, xivaConnectionState2, xivaConnectionState3};
        $VALUES = xivaConnectionStateArr;
        $ENTRIES = kotlin.enums.a.a(xivaConnectionStateArr);
    }

    public static XivaConnectionState valueOf(String str) {
        return (XivaConnectionState) Enum.valueOf(XivaConnectionState.class, str);
    }

    public static XivaConnectionState[] values() {
        return (XivaConnectionState[]) $VALUES.clone();
    }
}
