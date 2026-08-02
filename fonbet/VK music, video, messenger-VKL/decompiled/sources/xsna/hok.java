package xsna;

import android.os.Bundle;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes11.dex */
public final class hok implements Runnable {
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ kok c;

    public hok(kok kokVar, Bundle bundle) {
        this.c = kokVar;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.onMessageChannelReady(this.b);
    }
}
