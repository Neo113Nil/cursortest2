package one.video.upload.impl.io;

import java.nio.channels.SocketChannel;
import xsna.asp;
import xsna.zrp;

/* compiled from: AsyncSocket.kt */
/* loaded from: classes8.dex */
public final class AsyncSocket {
    public final SocketChannel a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AsyncSocket.kt */
    public static final class ConnectionState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ConnectionState[] $VALUES;
        public static final ConnectionState CONNECTED;
        public static final ConnectionState CONNECTING;
        public static final ConnectionState DISCONNECTED;

        static {
            ConnectionState connectionState = new ConnectionState("DISCONNECTED", 0);
            DISCONNECTED = connectionState;
            ConnectionState connectionState2 = new ConnectionState("CONNECTING", 1);
            CONNECTING = connectionState2;
            ConnectionState connectionState3 = new ConnectionState("CONNECTED", 2);
            CONNECTED = connectionState3;
            ConnectionState[] connectionStateArr = {connectionState, connectionState2, connectionState3};
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

    public AsyncSocket() {
        ConnectionState connectionState = ConnectionState.DISCONNECTED;
        SocketChannel open = SocketChannel.open();
        try {
            open.configureBlocking(false);
            this.a = open;
        } catch (Throwable th) {
            open.close();
            throw th;
        }
    }
}
