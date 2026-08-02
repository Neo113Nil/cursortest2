package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes10.dex */
class CustomTabsClient$1 extends CustomTabsServiceConnection {
    final /* synthetic */ Context val$applicationContext;

    public CustomTabsClient$1(Context context) {
        this.val$applicationContext = context;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, g gVar) {
        gVar.getClass();
        try {
            gVar.a.warmup(0L);
        } catch (RemoteException unused) {
        }
        this.val$applicationContext.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
