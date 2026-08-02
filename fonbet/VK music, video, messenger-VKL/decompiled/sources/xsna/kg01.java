package xsna;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class kg01 extends fa01 {
    public volatile dg01 f;
    public volatile dg01 g;

    @VisibleForTesting
    public dg01 h;
    public final ConcurrentHashMap i;
    public Activity j;
    public volatile boolean k;
    public volatile dg01 l;
    public dg01 m;
    public boolean n;
    public final Object o;

    public kg01(mb01 mb01Var) {
        super(mb01Var);
        this.o = new Object();
        this.i = new ConcurrentHashMap();
    }

    @Override // xsna.fa01
    public final boolean n() {
        return false;
    }

    public final void o(dg01 dg01Var, dg01 dg01Var2, long j, boolean z, Bundle bundle) {
        boolean z2 = dg01Var.e;
        mb01 mb01Var = (mb01) this.b;
        k();
        boolean z3 = false;
        boolean z4 = (dg01Var2 != null && dg01Var2.c == dg01Var.c && c2f0.f(dg01Var2.b, dg01Var.b) && c2f0.f(dg01Var2.a, dg01Var.a)) ? false : true;
        if (z && this.h != null) {
            z3 = true;
        }
        if (z4) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            sk01.w(dg01Var, bundle2, true);
            if (dg01Var2 != null) {
                String str = dg01Var2.a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = dg01Var2.b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", dg01Var2.c);
            }
            if (z3) {
                fj01 fj01Var = mb01Var.l;
                mb01.j(fj01Var);
                dj01 dj01Var = fj01Var.h;
                long j2 = j - dj01Var.b;
                dj01Var.b = j;
                if (j2 > 0) {
                    sk01 sk01Var = mb01Var.m;
                    mb01.i(sk01Var);
                    sk01Var.u(bundle2, j2);
                }
            }
            if (!mb01Var.h.v()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != z2 ? "auto" : MBridgeConstans.DYNAMIC_VIEW_WX_APP;
            mb01Var.o.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (z2) {
                long j3 = dg01Var.f;
                if (j3 != 0) {
                    currentTimeMillis = j3;
                }
            }
            bf01 bf01Var = mb01Var.q;
            mb01.j(bf01Var);
            bf01Var.s(str3, "_vs", bundle2, currentTimeMillis);
        }
        if (z3) {
            p(this.h, true, j);
        }
        this.h = dg01Var;
        if (z2) {
            this.m = dg01Var;
        }
        yh01 s = mb01Var.s();
        s.k();
        s.l();
        s.w(new ng01(s, dg01Var));
    }

    public final void p(dg01 dg01Var, boolean z, long j) {
        mb01 mb01Var = (mb01) this.b;
        w601 m = mb01Var.m();
        mb01Var.o.getClass();
        m.n(SystemClock.elapsedRealtime());
        boolean z2 = dg01Var != null && dg01Var.d;
        fj01 fj01Var = mb01Var.l;
        mb01.j(fj01Var);
        if (!fj01Var.h.a(j, z2, z) || dg01Var == null) {
            return;
        }
        dg01Var.d = false;
    }

    public final dg01 q(boolean z) {
        l();
        k();
        if (!z) {
            return this.h;
        }
        dg01 dg01Var = this.h;
        return dg01Var != null ? dg01Var : this.m;
    }

    @VisibleForTesting
    public final String r(Class cls) {
        mb01 mb01Var = (mb01) this.b;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str = length > 0 ? split[length - 1] : "";
        int length2 = str.length();
        mb01Var.getClass();
        return length2 > 100 ? str.substring(0, 100) : str;
    }

    public final void s(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((mb01) this.b).h.v() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.i.put(activity, new dg01(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final dg01 t(@NonNull Activity activity) {
        exc0.i(activity);
        dg01 dg01Var = (dg01) this.i.get(activity);
        if (dg01Var == null) {
            String r = r(activity.getClass());
            sk01 sk01Var = ((mb01) this.b).m;
            mb01.i(sk01Var);
            dg01 dg01Var2 = new dg01(null, r, sk01Var.j0());
            this.i.put(activity, dg01Var2);
            dg01Var = dg01Var2;
        }
        return this.l != null ? this.l : dg01Var;
    }

    public final void u(Activity activity, dg01 dg01Var, boolean z) {
        dg01 dg01Var2;
        dg01 dg01Var3 = this.f == null ? this.g : this.f;
        if (dg01Var.b == null) {
            dg01Var2 = new dg01(dg01Var.a, dg01Var.c, dg01Var.f, activity != null ? r(activity.getClass()) : null, dg01Var.e);
        } else {
            dg01Var2 = dg01Var;
        }
        this.g = this.f;
        this.f = dg01Var2;
        ((mb01) this.b).o.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kb01 kb01Var = ((mb01) this.b).k;
        mb01.k(kb01Var);
        kb01Var.s(new fg01(this, dg01Var2, dg01Var3, elapsedRealtime, z));
    }
}
