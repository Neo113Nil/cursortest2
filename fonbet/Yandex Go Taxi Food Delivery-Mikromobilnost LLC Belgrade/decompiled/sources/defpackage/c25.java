package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.a;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class c25 implements b25 {
    public final /* synthetic */ a a;

    public c25(a aVar) {
        Objects.requireNonNull(aVar);
        this.a = aVar;
    }

    @Override // defpackage.b25
    public final void a(ConnectionResult connectionResult) {
        boolean isSuccess = connectionResult.isSuccess();
        a aVar = this.a;
        if (isSuccess) {
            aVar.getRemoteService(null, aVar.h());
            return;
        }
        a25 a25Var = aVar.N;
        if (a25Var != null) {
            a25Var.onConnectionFailed(connectionResult);
        }
    }
}
