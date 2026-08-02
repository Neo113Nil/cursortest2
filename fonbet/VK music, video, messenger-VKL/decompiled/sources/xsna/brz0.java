package xsna;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public final class brz0 extends lqz0 {
    public final /* synthetic */ crz0 a;

    public brz0(crz0 crz0Var) {
        this.a = crz0Var;
    }

    @Override // xsna.lqz0, xsna.lrz0
    public final void P0(Status status) throws RemoteException {
        this.a.setResult((crz0) status);
    }
}
