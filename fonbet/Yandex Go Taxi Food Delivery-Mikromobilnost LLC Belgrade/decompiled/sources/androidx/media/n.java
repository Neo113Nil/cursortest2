package androidx.media;

import android.os.Messenger;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.h2t;

/* loaded from: classes10.dex */
public final class n implements Runnable {
    public final /* synthetic */ h2t a;
    public final /* synthetic */ v b;

    public n(v vVar, h2t h2tVar) {
        this.b = vVar;
        this.a = h2tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.ConnectionRecord connectionRecord = (MediaBrowserServiceCompat.ConnectionRecord) this.b.a.mConnections.remove(((Messenger) this.a.a).getBinder());
        if (connectionRecord != null) {
            ((Messenger) ((h2t) connectionRecord.callbacks).a).getBinder().unlinkToDeath(connectionRecord, 0);
        }
    }
}
