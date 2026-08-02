package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;

/* loaded from: classes10.dex */
class CustomTabsSessionToken$MockCallback extends ICustomTabsCallback.Stub {
    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void extraCallback(String str, Bundle bundle) {
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public Bundle extraCallbackWithResult(String str, Bundle bundle) {
        return null;
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onActivityResized(int i, int i2, Bundle bundle) {
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onMessageChannelReady(Bundle bundle) {
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onMinimized(Bundle bundle) {
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onNavigationEvent(int i, Bundle bundle) {
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onPostMessage(String str, Bundle bundle) {
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onUnminimized(Bundle bundle) {
    }

    @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.support.customtabs.ICustomTabsCallback
    public void onWarmupCompleted(Bundle bundle) {
    }
}
