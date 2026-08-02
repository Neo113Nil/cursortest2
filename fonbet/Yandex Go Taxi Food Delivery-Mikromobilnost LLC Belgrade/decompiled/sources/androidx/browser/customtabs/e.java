package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ CustomTabsClient$3 w;

    public e(CustomTabsClient$3 customTabsClient$3, int i, int i2, Bundle bundle) {
        this.w = customTabsClient$3;
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.val$callback.onActivityResized(this.a, this.b, this.c);
    }
}
