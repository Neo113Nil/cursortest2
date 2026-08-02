package xsna;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import java.util.Set;

/* loaded from: classes13.dex */
public final class cvy0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cvy0(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                synchronized (((mvy0) this.d).c) {
                    ((mvy0) this.d).a.onFailure(((szy0) this.c).d());
                }
                return;
            default:
                hnz0 hnz0Var = (hnz0) this.d;
                com.google.android.gms.signin.internal.zak zakVar = (com.google.android.gms.signin.internal.zak) this.c;
                hnz0Var.getClass();
                ConnectionResult connectionResult = zakVar.c;
                if (connectionResult.j()) {
                    zaaa zaaaVar = zakVar.d;
                    exc0.i(zaaaVar);
                    ConnectionResult connectionResult2 = zaaaVar.d;
                    if (!connectionResult2.j()) {
                        String valueOf = String.valueOf(connectionResult2);
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                        hnz0Var.i.b(connectionResult2);
                        hnz0Var.h.disconnect();
                        return;
                    }
                    kmz0 kmz0Var = hnz0Var.i;
                    com.google.android.gms.common.internal.b i = zaaaVar.i();
                    Set<Scope> set = hnz0Var.f;
                    kmz0Var.getClass();
                    if (i == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        kmz0Var.b(new ConnectionResult(4));
                    } else {
                        kmz0Var.c = i;
                        kmz0Var.d = set;
                        if (kmz0Var.e) {
                            kmz0Var.a.getRemoteService(i, set);
                        }
                    }
                } else {
                    hnz0Var.i.b(connectionResult);
                }
                hnz0Var.h.disconnect();
                return;
        }
    }
}
