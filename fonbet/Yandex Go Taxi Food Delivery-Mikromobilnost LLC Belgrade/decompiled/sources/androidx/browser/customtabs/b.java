package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ CustomTabsClient$3 c;

    public b(int i, Bundle bundle, CustomTabsClient$3 customTabsClient$3) {
        this.c = customTabsClient$3;
        this.a = i;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.val$callback.onNavigationEvent(this.a, this.b);
    }
}
