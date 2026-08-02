package androidx.browser.auth;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.IAuthTabCallback;

/* loaded from: classes10.dex */
class AuthTabSessionToken$MockCallback extends IAuthTabCallback.Stub {
    @Override // android.support.customtabs.IAuthTabCallback.Stub, android.support.customtabs.IAuthTabCallback
    public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
    }

    @Override // android.support.customtabs.IAuthTabCallback.Stub, android.support.customtabs.IAuthTabCallback
    public Bundle onExtraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
        return Bundle.EMPTY;
    }

    @Override // android.support.customtabs.IAuthTabCallback.Stub, android.support.customtabs.IAuthTabCallback
    public void onNavigationEvent(int i, Bundle bundle) throws RemoteException {
    }

    @Override // android.support.customtabs.IAuthTabCallback.Stub, android.support.customtabs.IAuthTabCallback
    public void onWarmupCompleted(Bundle bundle) throws RemoteException {
    }
}
