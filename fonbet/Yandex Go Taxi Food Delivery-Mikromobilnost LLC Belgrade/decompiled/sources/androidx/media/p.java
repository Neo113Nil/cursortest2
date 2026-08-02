package androidx.media;

import android.os.IBinder;
import android.os.Messenger;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.h2t;

/* loaded from: classes10.dex */
public final class p implements Runnable {
    public final /* synthetic */ h2t a;
    public final /* synthetic */ String b;
    public final /* synthetic */ IBinder c;
    public final /* synthetic */ v w;

    public p(v vVar, h2t h2tVar, String str, IBinder iBinder) {
        this.w = vVar;
        this.a = h2tVar;
        this.b = str;
        this.c = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = ((Messenger) this.a.a).getBinder();
        v vVar = this.w;
        MediaBrowserServiceCompat.ConnectionRecord connectionRecord = (MediaBrowserServiceCompat.ConnectionRecord) vVar.a.mConnections.get(binder);
        if (connectionRecord == null) {
            return;
        }
        vVar.a.removeSubscription(this.b, connectionRecord, this.c);
    }
}
