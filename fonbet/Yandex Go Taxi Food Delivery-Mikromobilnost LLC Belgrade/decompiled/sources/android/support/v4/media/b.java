package android.support.v4.media;

import android.os.Messenger;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class b implements Runnable {
    public final /* synthetic */ MediaBrowserCompat$MediaBrowserImplBase a;

    public b(MediaBrowserCompat$MediaBrowserImplBase mediaBrowserCompat$MediaBrowserImplBase) {
        this.a = mediaBrowserCompat$MediaBrowserImplBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserCompat$MediaBrowserImplBase mediaBrowserCompat$MediaBrowserImplBase = this.a;
        Messenger messenger = mediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger;
        if (messenger != null) {
            try {
                mediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper.c(2, null, messenger);
            } catch (RemoteException unused) {
                Objects.toString(mediaBrowserCompat$MediaBrowserImplBase.mServiceComponent);
            }
        }
        int i = mediaBrowserCompat$MediaBrowserImplBase.mState;
        mediaBrowserCompat$MediaBrowserImplBase.forceCloseConnection();
        if (i != 0) {
            mediaBrowserCompat$MediaBrowserImplBase.mState = i;
        }
        if (e.b) {
            mediaBrowserCompat$MediaBrowserImplBase.dump();
        }
    }
}
