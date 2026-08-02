package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;
import defpackage.ny61;
import defpackage.ulf;

/* loaded from: classes10.dex */
public abstract class CustomTabsServiceConnection implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, g gVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext != null) {
            onCustomTabsServiceConnected(componentName, new ulf(ICustomTabsService.Stub.asInterface(iBinder), componentName));
        } else {
            ny61.r("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
