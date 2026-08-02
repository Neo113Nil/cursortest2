package xsna;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public class t201 extends d401 {
    public final TaskCompletionSource a;
    public final /* synthetic */ x201 b;

    public t201(x201 x201Var, TaskCompletionSource taskCompletionSource) {
        this.b = x201Var;
        attachInterface(this, "com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
        this.a = taskCompletionSource;
    }

    public void B(int i, Bundle bundle) throws RemoteException {
        this.b.b.c(this.a);
        x201.c.d("onCancelInstall(%d)", Integer.valueOf(i));
    }

    public void Z(int i, Bundle bundle) throws RemoteException {
        this.b.b.c(this.a);
        x201.c.d("onStartInstall(%d)", Integer.valueOf(i));
    }
}
