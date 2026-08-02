package xsna;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public final class xqz0 extends lqz0 {
    public final /* synthetic */ zqz0 a;

    public xqz0(zqz0 zqz0Var) {
        this.a = zqz0Var;
    }

    @Override // xsna.lqz0, xsna.lrz0
    public final void R0(Status status) throws RemoteException {
        this.a.setResult((zqz0) status);
    }
}
