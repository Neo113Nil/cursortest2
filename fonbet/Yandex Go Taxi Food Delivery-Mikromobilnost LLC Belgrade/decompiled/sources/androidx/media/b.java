package androidx.media;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.eb10;
import defpackage.h2t;
import defpackage.w53;

/* loaded from: classes10.dex */
public final class b extends eb10 {
    public final /* synthetic */ MediaBrowserServiceCompat.ConnectionRecord e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Bundle g;
    public final /* synthetic */ Bundle h;
    public final /* synthetic */ MediaBrowserServiceCompat i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, MediaBrowserServiceCompat.ConnectionRecord connectionRecord, String str2, Bundle bundle, Bundle bundle2) {
        super(str);
        this.i = mediaBrowserServiceCompat;
        this.e = connectionRecord;
        this.f = str2;
        this.g = bundle;
        this.h = bundle2;
    }

    @Override // defpackage.eb10
    public final void c() {
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.i;
        w53 w53Var = mediaBrowserServiceCompat.mConnections;
        MediaBrowserServiceCompat.ConnectionRecord connectionRecord = this.e;
        if (w53Var.get(((Messenger) ((h2t) connectionRecord.callbacks).a).getBinder()) != connectionRecord) {
            String str = MediaBrowserServiceCompat.SERVICE_INTERFACE;
            return;
        }
        int i = this.d & 1;
        Bundle bundle = this.g;
        try {
            ((h2t) connectionRecord.callbacks).h(this.f, i != 0 ? mediaBrowserServiceCompat.applyOptions(null, bundle) : null, bundle, this.h);
        } catch (RemoteException unused) {
        }
    }
}
