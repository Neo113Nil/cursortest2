package androidx.media;

import android.os.IBinder;
import android.os.Messenger;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.h2t;

/* loaded from: classes10.dex */
public final class q implements Runnable {
    public final /* synthetic */ h2t a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ResultReceiver c;
    public final /* synthetic */ v w;

    public q(v vVar, h2t h2tVar, String str, ResultReceiver resultReceiver) {
        this.w = vVar;
        this.a = h2tVar;
        this.b = str;
        this.c = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = ((Messenger) this.a.a).getBinder();
        v vVar = this.w;
        MediaBrowserServiceCompat.ConnectionRecord connectionRecord = (MediaBrowserServiceCompat.ConnectionRecord) vVar.a.mConnections.get(binder);
        if (connectionRecord == null) {
            return;
        }
        vVar.a.performLoadItem(this.b, connectionRecord, this.c);
    }
}
