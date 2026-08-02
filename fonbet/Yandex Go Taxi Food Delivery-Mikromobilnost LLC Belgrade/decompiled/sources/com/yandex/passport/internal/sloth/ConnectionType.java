package com.yandex.passport.internal.sloth;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/passport/internal/sloth/ConnectionType;", "", "", AuthSdkActivity.RESPONSE_TYPE_CODE, CA20Status.STATUS_USER_I, "a", "()I", "CONNECTION_CELL", "CONNECTION_WIFI", "CONNECTION_UNDEFINED", "CONNECTION_BLUETOOTH", "CONNECTION_ETHERNET", "CONNECTION_VPN", "CONNECTION_LOWPAN", "CONNECTION_WIFI_AWARE", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConnectionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ConnectionType[] $VALUES;
    public static final ConnectionType CONNECTION_BLUETOOTH;
    public static final ConnectionType CONNECTION_CELL;
    public static final ConnectionType CONNECTION_ETHERNET;
    public static final ConnectionType CONNECTION_LOWPAN;
    public static final ConnectionType CONNECTION_UNDEFINED;
    public static final ConnectionType CONNECTION_VPN;
    public static final ConnectionType CONNECTION_WIFI;
    public static final ConnectionType CONNECTION_WIFI_AWARE;
    private final int code;

    static {
        ConnectionType connectionType = new ConnectionType("CONNECTION_CELL", 0, 0);
        CONNECTION_CELL = connectionType;
        ConnectionType connectionType2 = new ConnectionType("CONNECTION_WIFI", 1, 1);
        CONNECTION_WIFI = connectionType2;
        ConnectionType connectionType3 = new ConnectionType("CONNECTION_UNDEFINED", 2, 2);
        CONNECTION_UNDEFINED = connectionType3;
        ConnectionType connectionType4 = new ConnectionType("CONNECTION_BLUETOOTH", 3, 3);
        CONNECTION_BLUETOOTH = connectionType4;
        ConnectionType connectionType5 = new ConnectionType("CONNECTION_ETHERNET", 4, 4);
        CONNECTION_ETHERNET = connectionType5;
        ConnectionType connectionType6 = new ConnectionType("CONNECTION_VPN", 5, 9);
        CONNECTION_VPN = connectionType6;
        ConnectionType connectionType7 = new ConnectionType("CONNECTION_LOWPAN", 6, 11);
        CONNECTION_LOWPAN = connectionType7;
        ConnectionType connectionType8 = new ConnectionType("CONNECTION_WIFI_AWARE", 7, 12);
        CONNECTION_WIFI_AWARE = connectionType8;
        ConnectionType[] connectionTypeArr = {connectionType, connectionType2, connectionType3, connectionType4, connectionType5, connectionType6, connectionType7, connectionType8};
        $VALUES = connectionTypeArr;
        $ENTRIES = kotlin.enums.a.a(connectionTypeArr);
    }

    public ConnectionType(String str, int i, int i2) {
        this.code = i2;
    }

    public static ConnectionType valueOf(String str) {
        return (ConnectionType) Enum.valueOf(ConnectionType.class, str);
    }

    public static ConnectionType[] values() {
        return (ConnectionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }
}
