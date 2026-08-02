package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.h2t;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class u implements Runnable {
    public final /* synthetic */ h2t a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ ResultReceiver w;
    public final /* synthetic */ v x;

    public u(v vVar, h2t h2tVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.x = vVar;
        this.a = h2tVar;
        this.b = str;
        this.c = bundle;
        this.w = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = ((Messenger) this.a.a).getBinder();
        v vVar = this.x;
        MediaBrowserServiceCompat.ConnectionRecord connectionRecord = (MediaBrowserServiceCompat.ConnectionRecord) vVar.a.mConnections.get(binder);
        Bundle bundle = this.c;
        if (connectionRecord == null) {
            Objects.toString(bundle);
        } else {
            vVar.a.performCustomAction(this.b, bundle, connectionRecord, this.w);
        }
    }
}
