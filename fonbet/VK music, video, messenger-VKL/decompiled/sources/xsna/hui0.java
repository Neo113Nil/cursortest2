package xsna;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class hui0 {
    public static final o100 c = new o100("SessionManager", null);
    public final g001 a;
    public final Context b;

    public hui0(g001 g001Var, Context context) {
        this.a = g001Var;
        this.b = context;
    }

    public final void a(@NonNull iui0 iui0Var) throws NullPointerException {
        if (iui0Var == null) {
            throw new NullPointerException("SessionManagerListener can't be null");
        }
        exc0.e("Must be called from the main thread.");
        try {
            this.a.C0(new m301(iui0Var));
        } catch (RemoteException unused) {
            c.b("Unable to call %s on %s.", "addSessionManagerListener", g001.class.getSimpleName());
        }
    }

    public final void b(boolean z) {
        o100 o100Var = c;
        exc0.e("Must be called from the main thread.");
        try {
            o100Var.c("End session for %s", this.b.getPackageName());
            this.a.E1(z);
        } catch (RemoteException unused) {
            o100Var.b("Unable to call %s on %s.", "endCurrentSession", g001.class.getSimpleName());
        }
    }

    @Nullable
    public final g0a c() {
        exc0.e("Must be called from the main thread.");
        ssi0 d = d();
        if (d == null || !(d instanceof g0a)) {
            return null;
        }
        return (g0a) d;
    }

    @Nullable
    public final ssi0 d() {
        exc0.e("Must be called from the main thread.");
        try {
            return (ssi0) bq70.g(this.a.zze());
        } catch (RemoteException unused) {
            c.b("Unable to call %s on %s.", "getWrappedCurrentSession", g001.class.getSimpleName());
            return null;
        }
    }

    public final void e(@NonNull iui0 iui0Var) {
        exc0.e("Must be called from the main thread.");
        if (iui0Var == null) {
            return;
        }
        try {
            this.a.D0(new m301(iui0Var));
        } catch (RemoteException unused) {
            c.b("Unable to call %s on %s.", "removeSessionManagerListener", g001.class.getSimpleName());
        }
    }
}
