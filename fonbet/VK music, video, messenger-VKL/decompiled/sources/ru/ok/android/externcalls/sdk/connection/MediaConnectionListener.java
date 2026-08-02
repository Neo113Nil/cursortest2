package ru.ok.android.externcalls.sdk.connection;

import com.vk.movika.sdk.android.defaultplayer.interactive.c;

/* compiled from: MediaConnectionListener.kt */
/* loaded from: classes9.dex */
public interface MediaConnectionListener {

    /* compiled from: MediaConnectionListener.kt */
    public static final class ConnectedInfo {
        private final boolean isFirstConnection;

        public ConnectedInfo(boolean z) {
            this.isFirstConnection = z;
        }

        public static /* synthetic */ ConnectedInfo copy$default(ConnectedInfo connectedInfo, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = connectedInfo.isFirstConnection;
            }
            return connectedInfo.copy(z);
        }

        public final boolean component1() {
            return this.isFirstConnection;
        }

        public final ConnectedInfo copy(boolean z) {
            return new ConnectedInfo(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConnectedInfo) && this.isFirstConnection == ((ConnectedInfo) obj).isFirstConnection;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFirstConnection);
        }

        public final boolean isFirstConnection() {
            return this.isFirstConnection;
        }

        public String toString() {
            return c.a("ConnectedInfo(isFirstConnection=", ")", this.isFirstConnection);
        }
    }

    /* compiled from: MediaConnectionListener.kt */
    public static final class DisconnectedInfo {
        public static final DisconnectedInfo INSTANCE = new DisconnectedInfo();

        private DisconnectedInfo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DisconnectedInfo);
        }

        public int hashCode() {
            return -793385314;
        }

        public String toString() {
            return "DisconnectedInfo";
        }
    }

    void onMediaConnected(ConnectedInfo connectedInfo);

    void onMediaDisconnected(DisconnectedInfo disconnectedInfo);
}
