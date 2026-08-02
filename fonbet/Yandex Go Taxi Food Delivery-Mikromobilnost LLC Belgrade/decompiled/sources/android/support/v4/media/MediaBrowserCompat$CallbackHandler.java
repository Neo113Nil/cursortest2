package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import defpackage.xa10;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
class MediaBrowserCompat$CallbackHandler extends Handler {
    private final WeakReference<xa10> mCallbackImplRef;
    private WeakReference<Messenger> mCallbacksMessengerRef;

    public MediaBrowserCompat$CallbackHandler(xa10 xa10Var) {
        this.mCallbackImplRef = new WeakReference<>(xa10Var);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        WeakReference<Messenger> weakReference = this.mCallbacksMessengerRef;
        if (weakReference == null || weakReference.get() == null || this.mCallbackImplRef.get() == null) {
            return;
        }
        Bundle data = message.getData();
        android.support.v4.media.session.c.a(data);
        xa10 xa10Var = this.mCallbackImplRef.get();
        Messenger messenger = this.mCallbacksMessengerRef.get();
        try {
            int i = message.what;
            if (i == 1) {
                Bundle bundle = data.getBundle("data_root_hints");
                android.support.v4.media.session.c.a(bundle);
                xa10Var.onServiceConnected(messenger, data.getString("data_media_item_id"), (MediaSessionCompat$Token) data.getParcelable("data_media_session_token"), bundle);
            } else {
                if (i == 2) {
                    xa10Var.onConnectionFailed(messenger);
                    return;
                }
                if (i != 3) {
                    message.toString();
                    return;
                }
                Bundle bundle2 = data.getBundle("data_options");
                android.support.v4.media.session.c.a(bundle2);
                Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                android.support.v4.media.session.c.a(bundle3);
                xa10Var.onLoadChildren(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            if (message.what == 1) {
                xa10Var.onConnectionFailed(messenger);
            }
        }
    }

    public void setCallbacksMessenger(Messenger messenger) {
        this.mCallbacksMessengerRef = new WeakReference<>(messenger);
    }
}
