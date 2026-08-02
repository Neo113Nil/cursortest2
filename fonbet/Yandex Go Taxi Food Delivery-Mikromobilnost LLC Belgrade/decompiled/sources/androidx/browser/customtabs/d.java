package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes10.dex */
public final class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Bundle w;
    public final /* synthetic */ CustomTabsClient$3 x;

    public d(CustomTabsClient$3 customTabsClient$3, int i, Uri uri, boolean z, Bundle bundle) {
        this.x = customTabsClient$3;
        this.a = i;
        this.b = uri;
        this.c = z;
        this.w = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.x.val$callback.onRelationshipValidationResult(this.a, this.b, this.c, this.w);
    }
}
