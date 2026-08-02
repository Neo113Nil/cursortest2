package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.ui.common.api.log.PlusPayLogNetworkListener$NetworkCallback;
import kotlin.Result;

/* loaded from: classes2.dex */
public final class ldd0 implements DefaultLifecycleObserver {
    public final /* synthetic */ kdd0 a;

    public ldd0(kdd0 kdd0Var) {
        this.a = kdd0Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(pey peyVar) {
        Object failure;
        kdd0 kdd0Var = this.a;
        try {
            ((ConnectivityManager) ((i3y) kdd0Var.c).getValue()).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), (PlusPayLogNetworkListener$NetworkCallback) ((i3y) kdd0Var.d).getValue());
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            mdd0 mdd0Var = (mdd0) kdd0Var.a;
            LogPriority logPriority = LogPriority.ERROR;
            ndd0 ndd0Var = (ndd0) mdd0Var;
            ndd0Var.getClass();
            ndd0Var.b(logPriority, "Tarifficator", "Failed to register network callback", a);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        Object failure;
        kdd0 kdd0Var = this.a;
        try {
            ((ConnectivityManager) ((i3y) kdd0Var.c).getValue()).unregisterNetworkCallback((PlusPayLogNetworkListener$NetworkCallback) ((i3y) kdd0Var.d).getValue());
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            mdd0 mdd0Var = (mdd0) kdd0Var.a;
            LogPriority logPriority = LogPriority.ERROR;
            ndd0 ndd0Var = (ndd0) mdd0Var;
            ndd0Var.getClass();
            ndd0Var.b(logPriority, "Tarifficator", "Failed to unregister network callback", a);
        }
    }
}
