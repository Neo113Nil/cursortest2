package androidx.media;

import android.os.Messenger;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.h2t;

/* loaded from: classes10.dex */
public final class f implements Runnable {
    public final /* synthetic */ MediaBrowserServiceCompat.ConnectionRecord a;

    public f(MediaBrowserServiceCompat.ConnectionRecord connectionRecord) {
        this.a = connectionRecord;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.ConnectionRecord connectionRecord = this.a;
        MediaBrowserServiceCompat.this.mConnections.remove(((Messenger) ((h2t) connectionRecord.callbacks).a).getBinder());
    }
}
