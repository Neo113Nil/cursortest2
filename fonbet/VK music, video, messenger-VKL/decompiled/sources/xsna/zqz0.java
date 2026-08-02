package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public final class zqz0 extends erz0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final void doExecute(a.b bVar) throws RemoteException {
        uqz0 uqz0Var = (uqz0) bVar;
        nrz0 nrz0Var = (nrz0) uqz0Var.getService();
        xqz0 xqz0Var = new xqz0(this);
        GoogleSignInOptions googleSignInOptions = uqz0Var.b;
        Parcel zba = nrz0Var.zba();
        com.google.android.gms.internal.p000authapi.zbc.zbd(zba, xqz0Var);
        com.google.android.gms.internal.p000authapi.zbc.zbc(zba, googleSignInOptions);
        nrz0Var.zbb(102, zba);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qdg0 createFailedResult(Status status) {
        return status;
    }
}
