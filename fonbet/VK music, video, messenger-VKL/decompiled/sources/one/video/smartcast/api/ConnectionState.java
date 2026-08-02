package one.video.smartcast.api;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConnectionState.kt */
/* loaded from: classes8.dex */
public final class ConnectionState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ConnectionState[] $VALUES;
    public static final ConnectionState CONNECTED;
    public static final ConnectionState CONNECTING;
    public static final ConnectionState DISCONNECTED;
    public static final ConnectionState FAILED;
    public static final ConnectionState RECONNECTING;
    public static final ConnectionState SELECTED;

    static {
        ConnectionState connectionState = new ConnectionState("SELECTED", 0);
        SELECTED = connectionState;
        ConnectionState connectionState2 = new ConnectionState("CONNECTING", 1);
        CONNECTING = connectionState2;
        ConnectionState connectionState3 = new ConnectionState("CONNECTED", 2);
        CONNECTED = connectionState3;
        ConnectionState connectionState4 = new ConnectionState("RECONNECTING", 3);
        RECONNECTING = connectionState4;
        ConnectionState connectionState5 = new ConnectionState("DISCONNECTED", 4);
        DISCONNECTED = connectionState5;
        ConnectionState connectionState6 = new ConnectionState(SignalingProtocol.HUNGUP_REASON_FAILED, 5);
        FAILED = connectionState6;
        ConnectionState[] connectionStateArr = {connectionState, connectionState2, connectionState3, connectionState4, connectionState5, connectionState6};
        $VALUES = connectionStateArr;
        $ENTRIES = new asp(connectionStateArr);
    }

    public ConnectionState() {
        throw null;
    }

    public static ConnectionState valueOf(String str) {
        return (ConnectionState) Enum.valueOf(ConnectionState.class, str);
    }

    public static ConnectionState[] values() {
        return (ConnectionState[]) $VALUES.clone();
    }
}
