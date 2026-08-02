package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Bundle y;
    public final /* synthetic */ CustomTabsClient$3 z;

    public f(CustomTabsClient$3 customTabsClient$3, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        this.z = customTabsClient$3;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.w = i4;
        this.x = i5;
        this.y = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.z.val$callback.onActivityLayout(this.a, this.b, this.c, this.w, this.x, this.y);
    }
}
