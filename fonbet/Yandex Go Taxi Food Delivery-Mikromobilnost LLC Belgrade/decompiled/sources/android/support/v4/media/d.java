package android.support.v4.media;

import android.content.ComponentName;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class d implements Runnable {
    public final /* synthetic */ ComponentName a;
    public final /* synthetic */ MediaBrowserCompat$MediaBrowserImplBase.MediaServiceConnection b;

    public d(MediaBrowserCompat$MediaBrowserImplBase.MediaServiceConnection mediaServiceConnection, ComponentName componentName) {
        this.b = mediaServiceConnection;
        this.a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = e.b;
        MediaBrowserCompat$MediaBrowserImplBase.MediaServiceConnection mediaServiceConnection = this.b;
        if (z) {
            Objects.toString(this.a);
            Objects.toString(MediaBrowserCompat$MediaBrowserImplBase.this.mServiceConnection);
            MediaBrowserCompat$MediaBrowserImplBase.this.dump();
        }
        if (mediaServiceConnection.isCurrent("onServiceDisconnected")) {
            MediaBrowserCompat$MediaBrowserImplBase mediaBrowserCompat$MediaBrowserImplBase = MediaBrowserCompat$MediaBrowserImplBase.this;
            mediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper = null;
            mediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger = null;
            mediaBrowserCompat$MediaBrowserImplBase.mHandler.setCallbacksMessenger(null);
            MediaBrowserCompat$MediaBrowserImplBase mediaBrowserCompat$MediaBrowserImplBase2 = MediaBrowserCompat$MediaBrowserImplBase.this;
            mediaBrowserCompat$MediaBrowserImplBase2.mState = 4;
            mediaBrowserCompat$MediaBrowserImplBase2.mCallback.onConnectionSuspended();
        }
    }
}
