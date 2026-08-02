package xsna;

import android.os.Bundle;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes11.dex */
public final class fok implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ kok d;

    public fok(kok kokVar, int i, Bundle bundle) {
        this.d = kokVar;
        this.b = i;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.b.onNavigationEvent(this.b, this.c);
    }
}
