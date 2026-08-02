package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ CustomTabsClient$3 c;

    public /* synthetic */ a(int i, Bundle bundle, CustomTabsClient$3 customTabsClient$3) {
        this.a = i;
        this.c = customTabsClient$3;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Bundle bundle = this.b;
        CustomTabsClient$3 customTabsClient$3 = this.c;
        switch (i) {
            case 0:
                customTabsClient$3.val$callback.onUnminimized(bundle);
                break;
            case 1:
                customTabsClient$3.val$callback.onMessageChannelReady(bundle);
                break;
            case 2:
                customTabsClient$3.val$callback.onWarmupCompleted(bundle);
                break;
            default:
                customTabsClient$3.val$callback.onMinimized(bundle);
                break;
        }
    }
}
