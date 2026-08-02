package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import defpackage.ab10;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.q53;
import defpackage.qir;
import defpackage.t53;
import defpackage.ua10;
import defpackage.uj;
import defpackage.va10;
import defpackage.w53;
import defpackage.wa10;
import defpackage.xa10;
import defpackage.ya10;
import defpackage.za10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
class MediaBrowserCompat$MediaBrowserImplBase implements va10, xa10 {
    static final int CONNECT_STATE_CONNECTED = 3;
    static final int CONNECT_STATE_CONNECTING = 2;
    static final int CONNECT_STATE_DISCONNECTED = 1;
    static final int CONNECT_STATE_DISCONNECTING = 0;
    static final int CONNECT_STATE_SUSPENDED = 4;
    final MediaBrowserCompat$ConnectionCallback mCallback;
    Messenger mCallbacksMessenger;
    final Context mContext;
    private Bundle mExtras;
    private MediaSessionCompat$Token mMediaSessionToken;
    private Bundle mNotifyChildrenChangedOptions;
    final Bundle mRootHints;
    private String mRootId;
    za10 mServiceBinderWrapper;
    final ComponentName mServiceComponent;
    MediaServiceConnection mServiceConnection;
    final MediaBrowserCompat$CallbackHandler mHandler = new MediaBrowserCompat$CallbackHandler(this);
    private final w53 mSubscriptions = new w53();
    int mState = 1;

    public class MediaServiceConnection implements ServiceConnection {
        public MediaServiceConnection() {
        }

        private void postOrRun(Runnable runnable) {
            if (Thread.currentThread() == MediaBrowserCompat$MediaBrowserImplBase.this.mHandler.getLooper().getThread()) {
                runnable.run();
            } else {
                MediaBrowserCompat$MediaBrowserImplBase.this.mHandler.post(runnable);
            }
        }

        public boolean isCurrent(String str) {
            int i;
            MediaBrowserCompat$MediaBrowserImplBase mediaBrowserCompat$MediaBrowserImplBase = MediaBrowserCompat$MediaBrowserImplBase.this;
            if (mediaBrowserCompat$MediaBrowserImplBase.mServiceConnection == this && (i = mediaBrowserCompat$MediaBrowserImplBase.mState) != 0 && i != 1) {
                return true;
            }
            int i2 = mediaBrowserCompat$MediaBrowserImplBase.mState;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            StringBuilder v = oyr.v(str, " for ");
            v.append(MediaBrowserCompat$MediaBrowserImplBase.this.mServiceComponent);
            v.append(" with mServiceConnection=");
            v.append(MediaBrowserCompat$MediaBrowserImplBase.this.mServiceConnection);
            v.append(" this=");
            v.append(this);
            Log.i("MediaBrowserCompat", v.toString());
            return false;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            postOrRun(new c(this, componentName, iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            postOrRun(new d(this, componentName));
        }
    }

    public MediaBrowserCompat$MediaBrowserImplBase(Context context, ComponentName componentName, MediaBrowserCompat$ConnectionCallback mediaBrowserCompat$ConnectionCallback, Bundle bundle) {
        if (context == null) {
            ny61.g("context must not be null");
            throw null;
        }
        if (componentName == null) {
            ny61.g("service component must not be null");
            throw null;
        }
        if (mediaBrowserCompat$ConnectionCallback == null) {
            ny61.g("connection callback must not be null");
            throw null;
        }
        this.mContext = context;
        this.mServiceComponent = componentName;
        this.mCallback = mediaBrowserCompat$ConnectionCallback;
        this.mRootHints = bundle != null ? new Bundle(bundle) : null;
    }

    private static String getStateLabel(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? oyr.i(i, "UNKNOWN/") : "CONNECT_STATE_SUSPENDED" : "CONNECT_STATE_CONNECTED" : "CONNECT_STATE_CONNECTING" : "CONNECT_STATE_DISCONNECTED" : "CONNECT_STATE_DISCONNECTING";
    }

    private boolean isCurrent(Messenger messenger, String str) {
        int i;
        if (this.mCallbacksMessenger == messenger && (i = this.mState) != 0 && i != 1) {
            return true;
        }
        int i2 = this.mState;
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        StringBuilder v = oyr.v(str, " for ");
        v.append(this.mServiceComponent);
        v.append(" with mCallbacksMessenger=");
        v.append(this.mCallbacksMessenger);
        v.append(" this=");
        v.append(this);
        Log.i("MediaBrowserCompat", v.toString());
        return false;
    }

    @Override // defpackage.va10
    public void connect() {
        int i = this.mState;
        if (i != 0 && i != 1) {
            ny61.r(oyr.t(new StringBuilder("connect() called while neigther disconnecting nor disconnected (state="), getStateLabel(this.mState), Extension.C_BRAKE));
        } else {
            this.mState = 2;
            this.mHandler.post(new a(this));
        }
    }

    @Override // defpackage.va10
    public void disconnect() {
        this.mState = 0;
        this.mHandler.post(new b(this));
    }

    public void dump() {
        Objects.toString(this.mServiceComponent);
        Objects.toString(this.mCallback);
        Objects.toString(this.mRootHints);
        getStateLabel(this.mState);
        Objects.toString(this.mServiceConnection);
        Objects.toString(this.mServiceBinderWrapper);
        Objects.toString(this.mCallbacksMessenger);
        Objects.toString(this.mMediaSessionToken);
    }

    public void forceCloseConnection() {
        MediaServiceConnection mediaServiceConnection = this.mServiceConnection;
        if (mediaServiceConnection != null) {
            this.mContext.unbindService(mediaServiceConnection);
        }
        this.mState = 1;
        this.mServiceConnection = null;
        this.mServiceBinderWrapper = null;
        this.mCallbacksMessenger = null;
        this.mHandler.setCallbacksMessenger(null);
        this.mRootId = null;
        this.mMediaSessionToken = null;
    }

    public Bundle getExtras() {
        if (isConnected()) {
            return this.mExtras;
        }
        ny61.r(oyr.t(new StringBuilder("getExtras() called while not connected (state="), getStateLabel(this.mState), Extension.C_BRAKE));
        return null;
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
        if (!isConnected()) {
            Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
            this.mHandler.post(new uj(mediaBrowserCompat$ItemCallback, str, 24));
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
            this.mHandler.post(new uj(mediaBrowserCompat$ItemCallback, str, 25));
        }
    }

    public Bundle getNotifyChildrenChangedOptions() {
        return this.mNotifyChildrenChangedOptions;
    }

    public String getRoot() {
        if (isConnected()) {
            return this.mRootId;
        }
        ny61.r(oyr.t(new StringBuilder("getRoot() called while not connected(state="), getStateLabel(this.mState), Extension.C_BRAKE));
        return null;
    }

    public ComponentName getServiceComponent() {
        if (isConnected()) {
            return this.mServiceComponent;
        }
        ny61.r(oyr.m(this.mState, Extension.C_BRAKE, new StringBuilder("getServiceComponent() called while not connected (state=")));
        return null;
    }

    @Override // defpackage.va10
    public MediaSessionCompat$Token getSessionToken() {
        if (isConnected()) {
            return this.mMediaSessionToken;
        }
        ny61.r(oyr.m(this.mState, Extension.C_BRAKE, new StringBuilder("getSessionToken() called while not connected(state=")));
        return null;
    }

    public boolean isConnected() {
        return this.mState == 3;
    }

    @Override // defpackage.xa10
    public void onConnectionFailed(Messenger messenger) {
        Log.e("MediaBrowserCompat", "onConnectFailed for " + this.mServiceComponent);
        if (isCurrent(messenger, "onConnectFailed")) {
            int i = this.mState;
            if (i != 2) {
                getStateLabel(i);
            } else {
                forceCloseConnection();
                this.mCallback.onConnectionFailed();
            }
        }
    }

    @Override // defpackage.xa10
    public void onLoadChildren(Messenger messenger, String str, List<MediaBrowserCompat$MediaItem> list, Bundle bundle, Bundle bundle2) {
        if (isCurrent(messenger, "onLoadChildren")) {
            if (e.b) {
                Objects.toString(this.mServiceComponent);
            }
            ab10 ab10Var = (ab10) this.mSubscriptions.get(str);
            if (ab10Var == null || ab10Var.a(bundle) == null) {
                return;
            }
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
        if (!isCurrent(messenger, "onConnect")) {
            return;
        }
        int i = this.mState;
        if (i != 2) {
            getStateLabel(i);
            return;
        }
        this.mRootId = str;
        this.mMediaSessionToken = mediaSessionCompat$Token;
        this.mExtras = bundle;
        this.mState = 3;
        if (e.b) {
            dump();
        }
        this.mCallback.onConnected();
        try {
            Iterator it = ((q53) this.mSubscriptions.entrySet()).iterator();
            while (true) {
                t53 t53Var = (t53) it;
                if (!t53Var.hasNext()) {
                    return;
                }
                t53Var.next();
                t53 t53Var2 = t53Var;
                String str2 = (String) t53Var2.getKey();
                ab10 ab10Var = (ab10) t53Var2.getValue();
                ArrayList arrayList = ab10Var.a;
                ArrayList arrayList2 = ab10Var.b;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    this.mServiceBinderWrapper.a(str2, ((MediaBrowserCompat$SubscriptionCallback) arrayList.get(i2)).b, (Bundle) arrayList2.get(i2), this.mCallbacksMessenger);
                }
            }
        } catch (RemoteException unused) {
        }
    }

    public void search(String str, Bundle bundle, ya10 ya10Var) {
        if (!isConnected()) {
            ny61.r(oyr.t(new StringBuilder("search() called while not connected (state="), getStateLabel(this.mState), Extension.C_BRAKE));
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
            this.mHandler.post(new wa10(ya10Var, str, bundle, 2));
        }
    }

    public void sendCustomAction(String str, Bundle bundle, ua10 ua10Var) {
        if (!isConnected()) {
            qir.q("Cannot send a custom action (", str, ") with extras ", bundle, " because the browser is not connected to the service.");
            return;
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
                this.mHandler.post(new uj(ua10Var, str, bundle, 26));
            }
        }
    }

    public void subscribe(String str, Bundle bundle, MediaBrowserCompat$SubscriptionCallback mediaBrowserCompat$SubscriptionCallback) {
        ab10 ab10Var = (ab10) this.mSubscriptions.get(str);
        if (ab10Var == null) {
            ab10Var = new ab10();
            this.mSubscriptions.put(str, ab10Var);
        }
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        ab10Var.b(bundle2, mediaBrowserCompat$SubscriptionCallback);
        if (isConnected()) {
            try {
                this.mServiceBinderWrapper.a(str, mediaBrowserCompat$SubscriptionCallback.b, bundle2, this.mCallbacksMessenger);
            } catch (RemoteException unused) {
            }
        }
    }

    public void unsubscribe(String str, MediaBrowserCompat$SubscriptionCallback mediaBrowserCompat$SubscriptionCallback) {
        ab10 ab10Var = (ab10) this.mSubscriptions.get(str);
        if (ab10Var == null) {
            return;
        }
        ArrayList arrayList = ab10Var.a;
        try {
            if (mediaBrowserCompat$SubscriptionCallback != null) {
                ArrayList arrayList2 = ab10Var.b;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == mediaBrowserCompat$SubscriptionCallback) {
                        if (isConnected()) {
                            this.mServiceBinderWrapper.b(str, mediaBrowserCompat$SubscriptionCallback.b, this.mCallbacksMessenger);
                        }
                        arrayList.remove(size);
                        arrayList2.remove(size);
                    }
                }
            } else if (isConnected()) {
                this.mServiceBinderWrapper.b(str, null, this.mCallbacksMessenger);
            }
        } catch (RemoteException unused) {
        }
        if (arrayList.isEmpty() || mediaBrowserCompat$SubscriptionCallback == null) {
            this.mSubscriptions.remove(str);
        }
    }
}
