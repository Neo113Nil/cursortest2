package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class ff6 extends t46 {
    public final Context e;
    public hjz0 f;
    public final boolean g;
    public a h;
    public s3z0 i;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static abstract class a {
        public abstract void a();
    }

    public ff6(@NonNull Context context, int i, @NonNull String str) {
        super(context, i, str);
        this.g = true;
        this.e = context;
    }

    public abstract void c(ikz0 ikz0Var, xla xlaVar);

    public void d() {
        hjz0 hjz0Var = this.f;
        if (hjz0Var != null) {
            hjz0Var.destroy();
            this.f = null;
        }
    }

    public final void e() {
        boolean compareAndSet = this.c.compareAndSet(false, true);
        u6z0 u6z0Var = this.a;
        if (!compareAndSet) {
            gu8.c(null, "BaseInterstitialAd: Interstitial/Rewarded doesn't support multiple load");
            u6z0Var.j.a(0, 0, 1, null, null);
            c(null, xla.a(iaz0.t));
            return;
        }
        int i = u6z0Var.g;
        z5z0 z5z0Var = v5z0.a;
        udz0 udz0Var = new udz0(this.d, null, Integer.valueOf(i), 3, 0, z5z0Var);
        u6z0Var.b(udz0Var);
        udz0Var.c(0);
        s3z0.a aVar = this.b;
        s3z0 a2 = aVar.a();
        awy0 awy0Var = new awy0(u6z0Var, aVar, null);
        awy0Var.d = new o7(this, 4);
        awy0Var.e(a2, this.e);
    }

    public final void f() {
        hjz0 hjz0Var = this.f;
        if (hjz0Var == null) {
            gu8.d("Base interstitial ad show - no ad");
        } else {
            hjz0Var.a(this.e);
        }
    }
}
