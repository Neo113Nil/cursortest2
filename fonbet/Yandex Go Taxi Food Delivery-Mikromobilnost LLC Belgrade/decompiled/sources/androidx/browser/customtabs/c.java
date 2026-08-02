package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ CustomTabsClient$3 w;

    public /* synthetic */ c(CustomTabsClient$3 customTabsClient$3, String str, Bundle bundle, int i) {
        this.a = i;
        this.w = customTabsClient$3;
        this.b = str;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Bundle bundle = this.c;
        String str = this.b;
        CustomTabsClient$3 customTabsClient$3 = this.w;
        switch (i) {
            case 0:
                customTabsClient$3.val$callback.extraCallback(str, bundle);
                break;
            default:
                customTabsClient$3.val$callback.onPostMessage(str, bundle);
                break;
        }
    }
}
