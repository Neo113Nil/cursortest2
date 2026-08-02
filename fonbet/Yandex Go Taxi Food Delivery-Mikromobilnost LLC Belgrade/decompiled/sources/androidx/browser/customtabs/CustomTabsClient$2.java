package androidx.browser.customtabs;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.IAuthTabCallback;
import defpackage.ml3;
import defpackage.rlf;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
class CustomTabsClient$2 extends IAuthTabCallback.Stub {
    private final Executor mExecutor;
    final /* synthetic */ g this$0;
    final /* synthetic */ ml3 val$callback;
    final /* synthetic */ Executor val$executor;

    public CustomTabsClient$2(g gVar, Executor executor, ml3 ml3Var) {
        this.this$0 = gVar;
        this.val$executor = executor;
        this.mExecutor = executor == null ? new rlf(0, new Handler(Looper.getMainLooper())) : executor;
    }

    private static /* synthetic */ void lambda$onExtraCallback$1(ml3 ml3Var, String str, Bundle bundle) {
        ml3Var.c();
        throw null;
    }

    private static /* synthetic */ void lambda$onNavigationEvent$0(ml3 ml3Var, int i, Bundle bundle) {
        ml3Var.a();
        throw null;
    }

    private static /* synthetic */ void lambda$onWarmupCompleted$2(ml3 ml3Var, Bundle bundle) {
        ml3Var.b();
        throw null;
    }

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
