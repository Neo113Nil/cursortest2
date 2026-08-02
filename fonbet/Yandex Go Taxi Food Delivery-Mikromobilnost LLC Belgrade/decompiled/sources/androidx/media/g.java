package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.s53;
import defpackage.yqv;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class g implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ i c;

    public g(i iVar, String str, Bundle bundle) {
        this.c = iVar;
        this.a = str;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.c;
        MediaBrowserServiceCompat mediaBrowserServiceCompat = iVar.d;
        Iterator it = ((s53) mediaBrowserServiceCompat.mConnections.keySet()).iterator();
        while (true) {
            yqv yqvVar = (yqv) it;
            if (!yqvVar.hasNext()) {
                return;
            }
            iVar.a((MediaBrowserServiceCompat.ConnectionRecord) mediaBrowserServiceCompat.mConnections.get((IBinder) yqvVar.next()), this.a, this.b);
        }
    }
}
