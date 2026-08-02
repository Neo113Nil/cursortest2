package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import defpackage.qlf;

/* loaded from: classes10.dex */
class CustomTabsClient$3 extends ICustomTabsCallback.Stub {
    private Handler mHandler = new Handler(Looper.getMainLooper());
    final /* synthetic */ g this$0;
    final /* synthetic */ qlf val$callback;

    public CustomTabsClient$3(g gVar, qlf qlfVar) {
        this.this$0 = gVar;
        this.val$callback = qlfVar;
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void extraCallback(String str, Bundle bundle) throws RemoteException {
        if (this.val$callback == null) {
            return;
        }
        this.mHandler.post(new c(this, str, bundle, 0));
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
        qlf qlfVar = this.val$callback;
        if (qlfVar == null) {
            return null;
        }
        return qlfVar.extraCallbackWithResult(str, bundle);
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException {
        if (this.val$callback == null) {
            return;
        }
        this.mHandler.post(new f(this, i, i2, i3, i4, i5, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onActivityResized(int i, int i2, Bundle bundle) throws RemoteException {
        if (this.val$callback == null) {
            return;
        }
        this.mHandler.post(new e(this, i, i2, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onMessageChannelReady(Bundle bundle) throws RemoteException {
        if (this.val$callback == null) {
            return;
        }
        this.mHandler.post(new a(1, bundle, this));
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onMinimized(Bundle bundle) throws RemoteException {
        if (this.val$callback == null) {
            return;
        }
        this.mHandler.post(new a(3, bundle, this));
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onNavigationEvent(int i, Bundle bundle) {
        if (this.val$callback == null) {
            return;
        }
        this.mHandler.post(new b(i, bundle, this));
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onPostMessage(String str, Bundle bundle) throws RemoteException {
        if (this.val$callback == null) {
            return;
        }
        this.mHandler.post(new c(this, str, bundle, 1));
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
        if (this.val$callback == null) {
            return;
        }
        this.mHandler.post(new d(this, i, uri, z, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onUnminimized(Bundle bundle) throws RemoteException {
        if (this.val$callback == null) {
            return;
        }
        this.mHandler.post(new a(0, bundle, this));
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onWarmupCompleted(Bundle bundle) throws RemoteException {
        if (this.val$callback == null) {
            return;
        }
        this.mHandler.post(new a(2, bundle, this));
    }
}
