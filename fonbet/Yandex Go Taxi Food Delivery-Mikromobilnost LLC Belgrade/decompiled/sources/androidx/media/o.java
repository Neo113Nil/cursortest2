package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.h2t;

/* loaded from: classes10.dex */
public final class o implements Runnable {
    public final /* synthetic */ h2t a;
    public final /* synthetic */ String b;
    public final /* synthetic */ IBinder c;
    public final /* synthetic */ Bundle w;
    public final /* synthetic */ v x;

    public o(v vVar, h2t h2tVar, String str, IBinder iBinder, Bundle bundle) {
        this.x = vVar;
        this.a = h2tVar;
        this.b = str;
        this.c = iBinder;
        this.w = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = ((Messenger) this.a.a).getBinder();
        v vVar = this.x;
        MediaBrowserServiceCompat.ConnectionRecord connectionRecord = (MediaBrowserServiceCompat.ConnectionRecord) vVar.a.mConnections.get(binder);
        if (connectionRecord == null) {
            return;
        }
        vVar.a.addSubscription(this.b, connectionRecord, this.c, this.w);
    }
}
