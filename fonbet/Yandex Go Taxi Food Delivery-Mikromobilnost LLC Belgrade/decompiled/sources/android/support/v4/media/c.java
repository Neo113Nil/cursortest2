package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase;
import defpackage.za10;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class c implements Runnable {
    public final /* synthetic */ ComponentName a;
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ MediaBrowserCompat$MediaBrowserImplBase.MediaServiceConnection c;

    public c(MediaBrowserCompat$MediaBrowserImplBase.MediaServiceConnection mediaServiceConnection, ComponentName componentName, IBinder iBinder) {
        this.c = mediaServiceConnection;
        this.a = componentName;
        this.b = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = e.b;
        IBinder iBinder = this.b;
        MediaBrowserCompat$MediaBrowserImplBase.MediaServiceConnection mediaServiceConnection = this.c;
        if (z) {
            Objects.toString(this.a);
            Objects.toString(iBinder);
            MediaBrowserCompat$MediaBrowserImplBase.this.dump();
        }
        if (mediaServiceConnection.isCurrent("onServiceConnected")) {
            MediaBrowserCompat$MediaBrowserImplBase mediaBrowserCompat$MediaBrowserImplBase = MediaBrowserCompat$MediaBrowserImplBase.this;
            mediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper = new za10(iBinder, mediaBrowserCompat$MediaBrowserImplBase.mRootHints);
            MediaBrowserCompat$MediaBrowserImplBase.this.mCallbacksMessenger = new Messenger(MediaBrowserCompat$MediaBrowserImplBase.this.mHandler);
            MediaBrowserCompat$MediaBrowserImplBase mediaBrowserCompat$MediaBrowserImplBase2 = MediaBrowserCompat$MediaBrowserImplBase.this;
            mediaBrowserCompat$MediaBrowserImplBase2.mHandler.setCallbacksMessenger(mediaBrowserCompat$MediaBrowserImplBase2.mCallbacksMessenger);
            MediaBrowserCompat$MediaBrowserImplBase mediaBrowserCompat$MediaBrowserImplBase3 = MediaBrowserCompat$MediaBrowserImplBase.this;
            mediaBrowserCompat$MediaBrowserImplBase3.mState = 2;
            if (z) {
                try {
                    mediaBrowserCompat$MediaBrowserImplBase3.dump();
                } catch (RemoteException unused) {
                    Objects.toString(MediaBrowserCompat$MediaBrowserImplBase.this.mServiceComponent);
                    if (e.b) {
                        MediaBrowserCompat$MediaBrowserImplBase.this.dump();
                        return;
                    }
                    return;
                }
            }
            MediaBrowserCompat$MediaBrowserImplBase mediaBrowserCompat$MediaBrowserImplBase4 = MediaBrowserCompat$MediaBrowserImplBase.this;
            za10 za10Var = mediaBrowserCompat$MediaBrowserImplBase4.mServiceBinderWrapper;
            Context context = mediaBrowserCompat$MediaBrowserImplBase4.mContext;
            Messenger messenger = mediaBrowserCompat$MediaBrowserImplBase4.mCallbacksMessenger;
            za10Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", za10Var.b);
            za10Var.c(1, bundle, messenger);
        }
    }
}
