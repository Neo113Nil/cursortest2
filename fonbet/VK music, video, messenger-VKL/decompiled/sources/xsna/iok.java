package xsna;

import android.os.Bundle;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes11.dex */
public final class iok implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ kok d;

    public iok(kok kokVar, String str, Bundle bundle) {
        this.d = kokVar;
        this.b = str;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.b.onPostMessage(this.b, this.c);
    }
}
