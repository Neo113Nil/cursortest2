package android.support.v4.media;

import android.media.browse.MediaBrowser;
import defpackage.ta10;

/* loaded from: classes10.dex */
public class MediaBrowserCompat$ConnectionCallback {
    final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new ConnectionCallbackApi21();
    ta10 mConnectionCallbackInternal;

    public class ConnectionCallbackApi21 extends MediaBrowser.ConnectionCallback {
        public ConnectionCallbackApi21() {
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnected() {
            ta10 ta10Var = MediaBrowserCompat$ConnectionCallback.this.mConnectionCallbackInternal;
            if (ta10Var != null) {
                ta10Var.onConnected();
            }
            MediaBrowserCompat$ConnectionCallback.this.onConnected();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionFailed() {
            ta10 ta10Var = MediaBrowserCompat$ConnectionCallback.this.mConnectionCallbackInternal;
            if (ta10Var != null) {
                ta10Var.onConnectionFailed();
            }
            MediaBrowserCompat$ConnectionCallback.this.onConnectionFailed();
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionSuspended() {
            ta10 ta10Var = MediaBrowserCompat$ConnectionCallback.this.mConnectionCallbackInternal;
            if (ta10Var != null) {
                ta10Var.onConnectionSuspended();
            }
            MediaBrowserCompat$ConnectionCallback.this.onConnectionSuspended();
        }
    }

    public void onConnected() {
    }

    public void onConnectionFailed() {
    }

    public void onConnectionSuspended() {
    }

    public void setInternalConnectionCallback(ta10 ta10Var) {
        this.mConnectionCallbackInternal = ta10Var;
    }
}
