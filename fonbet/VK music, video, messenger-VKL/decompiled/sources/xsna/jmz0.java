package xsna;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class jmz0 implements Runnable {
    public final /* synthetic */ ConnectionResult b;
    public final /* synthetic */ kmz0 c;

    public jmz0(kmz0 kmz0Var, ConnectionResult connectionResult) {
        this.b = connectionResult;
        this.c = kmz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.b bVar;
        kmz0 kmz0Var = this.c;
        d9u d9uVar = kmz0Var.f;
        a.f fVar = kmz0Var.a;
        hmz0 hmz0Var = (hmz0) d9uVar.k.get(kmz0Var.b);
        if (hmz0Var == null) {
            return;
        }
        ConnectionResult connectionResult = this.b;
        if (!connectionResult.j()) {
            hmz0Var.o(connectionResult, null);
            return;
        }
        kmz0Var.e = true;
        if (fVar.requiresSignIn()) {
            if (!kmz0Var.e || (bVar = kmz0Var.c) == null) {
                return;
            }
            fVar.getRemoteService(bVar, kmz0Var.d);
            return;
        }
        try {
            fVar.getRemoteService(null, fVar.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            fVar.disconnect("Failed to get service from broker.");
            hmz0Var.o(new ConnectionResult(10), null);
        }
    }
}
