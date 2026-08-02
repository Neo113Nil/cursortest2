package androidx.browser.customtabs;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import defpackage.e1o;

/* loaded from: classes10.dex */
public final class k {
    public final Object a = new Object();
    public final ICustomTabsService b;
    public final ICustomTabsCallback c;
    public final ComponentName d;

    public k(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName) {
        this.b = iCustomTabsService;
        this.c = iCustomTabsCallback;
        this.d = componentName;
    }

    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return bundle2;
    }

    public final void b(e1o e1oVar, Bundle bundle) {
        try {
            this.b.setEngagementSignalsCallback(this.c, new CustomTabsSession$1(this, e1oVar).asBinder(), a(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }
}
