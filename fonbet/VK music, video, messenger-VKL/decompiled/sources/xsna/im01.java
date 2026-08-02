package xsna;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public class im01 extends ec01 {
    public final tk01 a;
    public final TaskCompletionSource b;
    public final /* synthetic */ ko01 e;

    public im01(ko01 ko01Var, tk01 tk01Var, TaskCompletionSource taskCompletionSource) {
        this.e = ko01Var;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.a = tk01Var;
        this.b = taskCompletionSource;
    }

    @Override // xsna.ud01
    public void Q0(Bundle bundle) throws RemoteException {
        this.e.a.c(this.b);
        this.a.c("onRequestInfo", new Object[0]);
    }

    @Override // xsna.ud01
    public void j(Bundle bundle) throws RemoteException {
        this.e.a.c(this.b);
        this.a.c("onCompleteUpdate", new Object[0]);
    }
}
