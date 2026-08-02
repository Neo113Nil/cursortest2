package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.e;

/* loaded from: classes11.dex */
public final class h091 implements wst, xst {
    public final zm2 a;
    public final boolean b;
    public e c;

    public h091(zm2 zm2Var, boolean z) {
        this.a = zm2Var;
        this.b = z;
    }

    @Override // defpackage.t4e
    public final void onConnected(Bundle bundle) {
        cvw.m(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnected(bundle);
    }

    @Override // defpackage.yx60
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zm2 zm2Var = this.a;
        boolean z = this.b;
        cvw.m(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        e eVar = this.c;
        eVar.a.lock();
        try {
            eVar.D.s(connectionResult, zm2Var, z);
        } finally {
            eVar.a.unlock();
        }
    }

    @Override // defpackage.t4e
    public final void onConnectionSuspended(int i) {
        cvw.m(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnectionSuspended(i);
    }
}
