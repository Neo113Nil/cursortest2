package xsna;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes12.dex */
public final class mfy0 implements Runnable {
    public final /* synthetic */ fuy0 b;

    public mfy0(fuy0 fuy0Var) {
        this.b = fuy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.m) {
            try {
                Intent intent = new Intent();
                intent.setClassName(this.b.i, "com.digitalturbine.ignite.cl.IgniteRemoteService");
                fuy0 fuy0Var = this.b;
                Context context = fuy0Var.f;
                if (context != null) {
                    context.bindService(intent, fuy0Var, 1);
                }
            } catch (Throwable th) {
                Object[] objArr = {th};
                lnv lnvVar = (lnv) vay0.c.b;
                if (lnvVar != null) {
                    lnvVar.e("Failed to bind IgniteRemoteService", objArr);
                }
                if (th.getMessage() != null && th.getMessage().contains("Too many bind requests")) {
                } else {
                    ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, be.J(th, com.digitalturbine.ignite.authenticator.events.c.IGNITE_SERVICE_UNAVAILABLE));
                }
            } finally {
            }
        }
    }
}
