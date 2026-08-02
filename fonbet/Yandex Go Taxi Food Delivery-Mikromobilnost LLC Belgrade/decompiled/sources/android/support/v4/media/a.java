package android.support.v4.media;

import android.content.Intent;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase.MediaServiceConnection;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.dy31;

/* loaded from: classes10.dex */
public final class a implements Runnable {
    public final /* synthetic */ MediaBrowserCompat$MediaBrowserImplBase a;

    public a(MediaBrowserCompat$MediaBrowserImplBase mediaBrowserCompat$MediaBrowserImplBase) {
        this.a = mediaBrowserCompat$MediaBrowserImplBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        MediaBrowserCompat$MediaBrowserImplBase mediaBrowserCompat$MediaBrowserImplBase = this.a;
        if (mediaBrowserCompat$MediaBrowserImplBase.mState == 0) {
            return;
        }
        mediaBrowserCompat$MediaBrowserImplBase.mState = 2;
        if (e.b && mediaBrowserCompat$MediaBrowserImplBase.mServiceConnection != null) {
            dy31.l(mediaBrowserCompat$MediaBrowserImplBase.mServiceConnection, "mServiceConnection should be null. Instead it is ");
            return;
        }
        if (mediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper != null) {
            dy31.l(mediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper, "mServiceBinderWrapper should be null. Instead it is ");
            return;
        }
        if (mediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger != null) {
            dy31.l(mediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger, "mCallbacksMessenger should be null. Instead it is ");
            return;
        }
        Intent intent = new Intent(MediaBrowserServiceCompat.SERVICE_INTERFACE);
        intent.setComponent(mediaBrowserCompat$MediaBrowserImplBase.mServiceComponent);
        MediaBrowserCompat$MediaBrowserImplBase.MediaServiceConnection mediaServiceConnection = mediaBrowserCompat$MediaBrowserImplBase.new MediaServiceConnection();
        mediaBrowserCompat$MediaBrowserImplBase.mServiceConnection = mediaServiceConnection;
        try {
            z = mediaBrowserCompat$MediaBrowserImplBase.mContext.bindService(intent, mediaServiceConnection, 1);
        } catch (Exception unused) {
            Log.e("MediaBrowserCompat", "Failed binding to service " + mediaBrowserCompat$MediaBrowserImplBase.mServiceComponent);
            z = false;
        }
        if (!z) {
            mediaBrowserCompat$MediaBrowserImplBase.forceCloseConnection();
            mediaBrowserCompat$MediaBrowserImplBase.mCallback.onConnectionFailed();
        }
        if (e.b) {
            mediaBrowserCompat$MediaBrowserImplBase.dump();
        }
    }
}
