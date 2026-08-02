package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat.ConnectionRecord;
import defpackage.h2t;
import defpackage.unr0;

/* loaded from: classes10.dex */
public final class m implements Runnable {
    public final /* synthetic */ h2t a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Bundle x;
    public final /* synthetic */ v y;

    public m(int i, int i2, h2t h2tVar, Bundle bundle, v vVar, String str) {
        this.y = vVar;
        this.a = h2tVar;
        this.b = str;
        this.c = i;
        this.w = i2;
        this.x = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h2t h2tVar = this.a;
        IBinder binder = ((Messenger) h2tVar.a).getBinder();
        v vVar = this.y;
        vVar.a.mConnections.remove(binder);
        MediaBrowserServiceCompat mediaBrowserServiceCompat = vVar.a;
        MediaBrowserServiceCompat.ConnectionRecord connectionRecord = mediaBrowserServiceCompat.new ConnectionRecord(this.b, this.c, this.w, this.x, h2tVar);
        mediaBrowserServiceCompat.mCurConnection = connectionRecord;
        int i = this.w;
        Bundle bundle = this.x;
        String str = this.b;
        connectionRecord.root = mediaBrowserServiceCompat.onGetRoot(str, i, bundle);
        mediaBrowserServiceCompat.mCurConnection = null;
        StringBuilder x = unr0.x("No root for client ", str, " from service ");
        x.append(m.class.getName());
        Log.i("MBServiceCompat", x.toString());
        try {
            h2tVar.k(2, null);
        } catch (RemoteException unused) {
        }
    }
}
