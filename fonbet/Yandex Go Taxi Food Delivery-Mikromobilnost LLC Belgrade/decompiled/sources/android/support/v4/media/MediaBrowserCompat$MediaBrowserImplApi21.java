package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import defpackage.ab10;
import defpackage.ny61;
import defpackage.qir;
import defpackage.ta10;
import defpackage.ua10;
import defpackage.uj;
import defpackage.va10;
import defpackage.w53;
import defpackage.wa10;
import defpackage.xa10;
import defpackage.ya10;
import defpackage.za10;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
class MediaBrowserCompat$MediaBrowserImplApi21 implements va10, xa10, ta10 {
    protected final MediaBrowser mBrowserFwk;
    protected Messenger mCallbacksMessenger;
    final Context mContext;
    private MediaSessionCompat$Token mMediaSessionToken;
    private Bundle mNotifyChildrenChangedOptions;
    protected final Bundle mRootHints;
    protected za10 mServiceBinderWrapper;
    protected int mServiceVersion;
    protected final MediaBrowserCompat$CallbackHandler mHandler = new MediaBrowserCompat$CallbackHandler(this);
    private final w53 mSubscriptions = new w53();

    public MediaBrowserCompat$MediaBrowserImplApi21(Context context, ComponentName componentName, MediaBrowserCompat$ConnectionCallback mediaBrowserCompat$ConnectionCallback, Bundle bundle) {
        this.mContext = context;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.mRootHints = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", Process.myPid());
        mediaBrowserCompat$ConnectionCallback.setInternalConnectionCallback(this);
        this.mBrowserFwk = new MediaBrowser(context, componentName, mediaBrowserCompat$ConnectionCallback.mConnectionCallbackFwk, bundle2);
    }

    @Override // defpackage.va10
    public void connect() {
        this.mBrowserFwk.connect();
    }

    @Override // defpackage.va10
    public void disconnect() {
        Messenger messenger;
        za10 za10Var = this.mServiceBinderWrapper;
        if (za10Var != null && (messenger = this.mCallbacksMessenger) != null) {
            try {
                za10Var.c(7, null, messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        this.mBrowserFwk.disconnect();
    }

    public Bundle getExtras() {
        return this.mBrowserFwk.getExtras();
    }

    public void getItem(String str, MediaBrowserCompat$ItemCallback mediaBrowserCompat$ItemCallback) {
        if (TextUtils.isEmpty(str)) {
            ny61.g("mediaId is empty");
            return;
        }
        if (mediaBrowserCompat$ItemCallback == null) {
            ny61.g("cb is null");
            return;
        }
        if (!this.mBrowserFwk.isConnected()) {
            Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
            this.mHandler.post(new uj(mediaBrowserCompat$ItemCallback, str, 19));
            return;
        }
        if (this.mServiceBinderWrapper == null) {
            this.mHandler.post(new uj(mediaBrowserCompat$ItemCallback, str, 20));
            return;
        }
        MediaBrowserCompat$ItemReceiver mediaBrowserCompat$ItemReceiver = new MediaBrowserCompat$ItemReceiver(str, mediaBrowserCompat$ItemCallback, this.mHandler);
        try {
            za10 za10Var = this.mServiceBinderWrapper;
            Messenger messenger = this.mCallbacksMessenger;
            za10Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", str);
            bundle.putParcelable("data_result_receiver", mediaBrowserCompat$ItemReceiver);
            za10Var.c(5, bundle, messenger);
        } catch (RemoteException unused) {
            Log.i("MediaBrowserCompat", "Remote error getting media item: " + str);
            this.mHandler.post(new uj(mediaBrowserCompat$ItemCallback, str, 21));
        }
    }

    public Bundle getNotifyChildrenChangedOptions() {
        return this.mNotifyChildrenChangedOptions;
    }

    public String getRoot() {
        return this.mBrowserFwk.getRoot();
    }

    public ComponentName getServiceComponent() {
        return this.mBrowserFwk.getServiceComponent();
    }

    @Override // defpackage.va10
    public MediaSessionCompat$Token getSessionToken() {
        if (this.mMediaSessionToken == null) {
            this.mMediaSessionToken = MediaSessionCompat$Token.fromToken(this.mBrowserFwk.getSessionToken());
        }
        return this.mMediaSessionToken;
    }

    public boolean isConnected() {
        return this.mBrowserFwk.isConnected();
    }

    @Override // defpackage.ta10
    public void onConnected() {
        try {
            Bundle extras = this.mBrowserFwk.getExtras();
            if (extras == null) {
                return;
            }
            this.mServiceVersion = extras.getInt("extra_service_version", 0);
            IBinder binder = extras.getBinder("extra_messenger");
            if (binder != null) {
                this.mServiceBinderWrapper = new za10(binder, this.mRootHints);
                Messenger messenger = new Messenger(this.mHandler);
                this.mCallbacksMessenger = messenger;
                this.mHandler.setCallbacksMessenger(messenger);
                try {
                    za10 za10Var = this.mServiceBinderWrapper;
                    Context context = this.mContext;
                    Messenger messenger2 = this.mCallbacksMessenger;
                    za10Var.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("data_package_name", context.getPackageName());
                    bundle.putInt("data_calling_pid", Process.myPid());
                    bundle.putBundle("data_root_hints", za10Var.b);
                    za10Var.c(6, bundle, messenger2);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                }
            }
            IMediaSession asInterface = IMediaSession.Stub.asInterface(extras.getBinder("extra_session_binder"));
            if (asInterface != null) {
                this.mMediaSessionToken = MediaSessionCompat$Token.fromToken(this.mBrowserFwk.getSessionToken(), asInterface);
            }
        } catch (IllegalStateException e) {
            Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
        }
    }

    @Override // defpackage.ta10
    public void onConnectionFailed() {
    }

    @Override // defpackage.xa10
    public void onConnectionFailed(Messenger messenger) {
    }

    @Override // defpackage.ta10
    public void onConnectionSuspended() {
        this.mServiceBinderWrapper = null;
        this.mCallbacksMessenger = null;
        this.mMediaSessionToken = null;
        this.mHandler.setCallbacksMessenger(null);
    }

    @Override // defpackage.xa10
    public void onLoadChildren(Messenger messenger, String str, List<MediaBrowserCompat$MediaItem> list, Bundle bundle, Bundle bundle2) {
        if (this.mCallbacksMessenger != messenger) {
            return;
        }
        ab10 ab10Var = (ab10) this.mSubscriptions.get(str);
        if (ab10Var == null) {
            boolean z = e.b;
            return;
        }
        if (ab10Var.a(bundle) != null) {
            if (bundle == null) {
                if (list == null) {
                    return;
                }
                this.mNotifyChildrenChangedOptions = null;
            } else {
                if (list == null) {
                    return;
                }
                this.mNotifyChildrenChangedOptions = null;
            }
        }
    }

    @Override // defpackage.xa10
    public void onServiceConnected(Messenger messenger, String str, MediaSessionCompat$Token mediaSessionCompat$Token, Bundle bundle) {
    }

    public void search(String str, Bundle bundle, ya10 ya10Var) {
        if (!isConnected()) {
            ny61.r("search() called while not connected");
            return;
        }
        if (this.mServiceBinderWrapper == null) {
            Log.i("MediaBrowserCompat", "The connected service doesn't support search.");
            this.mHandler.post(new wa10(ya10Var, str, bundle, 0));
            return;
        }
        MediaBrowserCompat$SearchResultReceiver mediaBrowserCompat$SearchResultReceiver = new MediaBrowserCompat$SearchResultReceiver(str, bundle, ya10Var, this.mHandler);
        try {
            za10 za10Var = this.mServiceBinderWrapper;
            Messenger messenger = this.mCallbacksMessenger;
            za10Var.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_search_query", str);
            bundle2.putBundle("data_search_extras", bundle);
            bundle2.putParcelable("data_result_receiver", mediaBrowserCompat$SearchResultReceiver);
            za10Var.c(8, bundle2, messenger);
        } catch (RemoteException e) {
            Log.i("MediaBrowserCompat", "Remote error searching items with query: " + str, e);
            this.mHandler.post(new wa10(ya10Var, str, bundle, 1));
        }
    }

    public void sendCustomAction(String str, Bundle bundle, ua10 ua10Var) {
        if (!isConnected()) {
            qir.q("Cannot send a custom action (", str, ") with extras ", bundle, " because the browser is not connected to the service.");
            return;
        }
        if (this.mServiceBinderWrapper == null) {
            Log.i("MediaBrowserCompat", "The connected service doesn't support sendCustomAction.");
            if (ua10Var != null) {
                this.mHandler.post(new uj(ua10Var, str, bundle, 22));
            }
        }
        MediaBrowserCompat$CustomActionResultReceiver mediaBrowserCompat$CustomActionResultReceiver = new MediaBrowserCompat$CustomActionResultReceiver(str, bundle, ua10Var, this.mHandler);
        try {
            za10 za10Var = this.mServiceBinderWrapper;
            Messenger messenger = this.mCallbacksMessenger;
            za10Var.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_custom_action", str);
            bundle2.putBundle("data_custom_action_extras", bundle);
            bundle2.putParcelable("data_result_receiver", mediaBrowserCompat$CustomActionResultReceiver);
            za10Var.c(9, bundle2, messenger);
        } catch (RemoteException e) {
            Log.i("MediaBrowserCompat", "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e);
            if (ua10Var != null) {
                this.mHandler.post(new uj(ua10Var, str, bundle, 23));
            }
        }
    }

    public void subscribe(String str, Bundle bundle, MediaBrowserCompat$SubscriptionCallback mediaBrowserCompat$SubscriptionCallback) {
        ab10 ab10Var = (ab10) this.mSubscriptions.get(str);
        if (ab10Var == null) {
            ab10Var = new ab10();
            this.mSubscriptions.put(str, ab10Var);
        }
        mediaBrowserCompat$SubscriptionCallback.getClass();
        mediaBrowserCompat$SubscriptionCallback.c = new WeakReference(ab10Var);
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        ab10Var.b(bundle2, mediaBrowserCompat$SubscriptionCallback);
        za10 za10Var = this.mServiceBinderWrapper;
        if (za10Var == null) {
            this.mBrowserFwk.subscribe(str, mediaBrowserCompat$SubscriptionCallback.a);
            return;
        }
        try {
            za10Var.a(str, mediaBrowserCompat$SubscriptionCallback.b, bundle2, this.mCallbacksMessenger);
        } catch (RemoteException unused) {
            Log.i("MediaBrowserCompat", "Remote error subscribing media item: " + str);
        }
    }

    public void unsubscribe(String str, MediaBrowserCompat$SubscriptionCallback mediaBrowserCompat$SubscriptionCallback) {
        ab10 ab10Var = (ab10) this.mSubscriptions.get(str);
        if (ab10Var == null) {
            return;
        }
        ArrayList arrayList = ab10Var.a;
        ArrayList arrayList2 = ab10Var.b;
        za10 za10Var = this.mServiceBinderWrapper;
        if (za10Var != null) {
            try {
                if (mediaBrowserCompat$SubscriptionCallback == null) {
                    za10Var.b(str, null, this.mCallbacksMessenger);
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == mediaBrowserCompat$SubscriptionCallback) {
                            this.mServiceBinderWrapper.b(str, mediaBrowserCompat$SubscriptionCallback.b, this.mCallbacksMessenger);
                            arrayList.remove(size);
                            arrayList2.remove(size);
                        }
                    }
                }
            } catch (RemoteException unused) {
            }
        } else if (mediaBrowserCompat$SubscriptionCallback == null) {
            this.mBrowserFwk.unsubscribe(str);
        } else {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                if (arrayList.get(size2) == mediaBrowserCompat$SubscriptionCallback) {
                    arrayList.remove(size2);
                    arrayList2.remove(size2);
                }
            }
            if (arrayList.size() == 0) {
                this.mBrowserFwk.unsubscribe(str);
            }
        }
        if (arrayList.isEmpty() || mediaBrowserCompat$SubscriptionCallback == null) {
            this.mSubscriptions.remove(str);
        }
    }
}
