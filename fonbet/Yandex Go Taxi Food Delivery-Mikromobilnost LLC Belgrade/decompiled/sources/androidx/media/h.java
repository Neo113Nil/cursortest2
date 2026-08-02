package androidx.media;

import android.os.Bundle;
import androidx.media.MediaBrowserServiceCompat;
import defpackage.hf10;
import defpackage.w53;

/* loaded from: classes10.dex */
public final class h implements Runnable {
    public final /* synthetic */ hf10 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ i w;

    public h(i iVar, hf10 hf10Var, String str, Bundle bundle) {
        this.w = iVar;
        this.a = hf10Var;
        this.b = str;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            i iVar = this.w;
            w53 w53Var = iVar.d.mConnections;
            if (i >= w53Var.c) {
                return;
            }
            MediaBrowserServiceCompat.ConnectionRecord connectionRecord = (MediaBrowserServiceCompat.ConnectionRecord) w53Var.j(i);
            if (connectionRecord.browserInfo.equals(this.a)) {
                iVar.a(connectionRecord, this.b, this.c);
            }
            i++;
        }
    }
}
