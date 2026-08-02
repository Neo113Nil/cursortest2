package xsna;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class skz0 extends mpz0 {
    public final el3 f;
    public final d9u g;

    public skz0(t4z t4zVar, d9u d9uVar, GoogleApiAvailability googleApiAvailability) {
        super(t4zVar, googleApiAvailability);
        this.f = new el3();
        this.g = d9uVar;
        this.mLifecycleFragment.Hm("ConnectionlessLifecycleHelper", this);
    }

    public static void e(Activity activity, d9u d9uVar, ty2 ty2Var) {
        t4z fragment = c4z.getFragment(activity);
        skz0 skz0Var = (skz0) fragment.Y3(skz0.class, "ConnectionlessLifecycleHelper");
        if (skz0Var == null) {
            skz0Var = new skz0(fragment, d9uVar, GoogleApiAvailability.getInstance());
        }
        skz0Var.f.add(ty2Var);
        d9uVar.f(skz0Var);
    }

    @Override // xsna.mpz0
    public final void b(ConnectionResult connectionResult, int i) {
        this.g.j(connectionResult, i);
    }

    @Override // xsna.mpz0
    public final void c() {
        com.google.android.gms.internal.base.zar zarVar = this.g.o;
        zarVar.sendMessage(zarVar.obtainMessage(3));
    }

    public final el3 f() {
        return this.f;
    }

    @Override // xsna.c4z
    public final void onResume() {
        super.onResume();
        if (this.f.isEmpty()) {
            return;
        }
        this.g.f(this);
    }

    @Override // xsna.mpz0, xsna.c4z
    public final void onStart() {
        super.onStart();
        if (this.f.isEmpty()) {
            return;
        }
        this.g.f(this);
    }

    @Override // xsna.mpz0, xsna.c4z
    public final void onStop() {
        super.onStop();
        d9u d9uVar = this.g;
        d9uVar.getClass();
        synchronized (d9u.s) {
            try {
                if (d9uVar.l == this) {
                    d9uVar.l = null;
                    d9uVar.m.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
