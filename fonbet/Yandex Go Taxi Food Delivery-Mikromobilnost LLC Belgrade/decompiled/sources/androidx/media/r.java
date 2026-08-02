package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat.ConnectionRecord;
import defpackage.h2t;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class r implements Runnable {
    public final /* synthetic */ h2t a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Bundle x;
    public final /* synthetic */ v y;

    public r(int i, int i2, h2t h2tVar, Bundle bundle, v vVar, String str) {
        this.y = vVar;
        this.a = h2tVar;
        this.b = i;
        this.c = str;
        this.w = i2;
        this.x = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.ConnectionRecord connectionRecord;
        h2t h2tVar = this.a;
        IBinder binder = ((Messenger) h2tVar.a).getBinder();
        v vVar = this.y;
        vVar.a.mConnections.remove(binder);
        MediaBrowserServiceCompat mediaBrowserServiceCompat = vVar.a;
        Iterator<MediaBrowserServiceCompat.ConnectionRecord> it = mediaBrowserServiceCompat.mPendingConnections.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MediaBrowserServiceCompat.ConnectionRecord next = it.next();
            if (next.uid == this.b) {
                connectionRecord = (TextUtils.isEmpty(this.c) || this.w <= 0) ? mediaBrowserServiceCompat.new ConnectionRecord(next.pkg, next.pid, next.uid, this.x, h2tVar) : null;
                it.remove();
            }
        }
        if (connectionRecord == null) {
            connectionRecord = mediaBrowserServiceCompat.new ConnectionRecord(this.c, this.w, this.b, this.x, h2tVar);
        }
        mediaBrowserServiceCompat.mConnections.put(binder, connectionRecord);
        try {
            binder.linkToDeath(connectionRecord, 0);
        } catch (RemoteException unused) {
        }
    }
}
