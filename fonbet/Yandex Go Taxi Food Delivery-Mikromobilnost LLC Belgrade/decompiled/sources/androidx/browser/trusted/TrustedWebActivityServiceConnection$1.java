package androidx.browser.trusted;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import defpackage.gi11;

/* loaded from: classes10.dex */
class TrustedWebActivityServiceConnection$1 extends ITrustedWebActivityCallback.Stub {
    final /* synthetic */ gi11 val$callback;

    public TrustedWebActivityServiceConnection$1(gi11 gi11Var) {
        this.val$callback = gi11Var;
    }

    @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback.Stub, android.support.customtabs.trusted.ITrustedWebActivityCallback
    public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
        this.val$callback.a();
    }
}
