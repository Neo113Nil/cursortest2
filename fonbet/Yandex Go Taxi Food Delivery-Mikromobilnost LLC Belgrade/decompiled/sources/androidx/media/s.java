package androidx.media;

import android.os.IBinder;
import android.os.Messenger;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.h2t;

/* loaded from: classes10.dex */
public final class s implements Runnable {
    public final /* synthetic */ h2t a;
    public final /* synthetic */ v b;

    public s(v vVar, h2t h2tVar) {
        this.b = vVar;
        this.a = h2tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = ((Messenger) this.a.a).getBinder();
        MediaBrowserServiceCompat.ConnectionRecord connectionRecord = (MediaBrowserServiceCompat.ConnectionRecord) this.b.a.mConnections.remove(binder);
        if (connectionRecord != null) {
            binder.unlinkToDeath(connectionRecord, 0);
        }
    }
}
