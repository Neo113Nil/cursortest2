package xsna;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class ne01 implements Runnable {
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ bf01 c;

    public ne01(bf01 bf01Var, Bundle bundle) {
        this.c = bf01Var;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bf01 bf01Var = this.c;
        bf01Var.k();
        bf01Var.l();
        Bundle bundle = this.b;
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        exc0.f(string);
        exc0.f(string2);
        exc0.i(bundle.get("value"));
        mb01 mb01Var = (mb01) bf01Var.b;
        boolean b = mb01Var.b();
        sk01 sk01Var = mb01Var.m;
        if (!b) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.q.a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkw zzkwVar = new zzkw(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
        try {
            mb01.i(sk01Var);
            bundle.getString("app_id");
            zzaw n0 = sk01Var.n0(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true);
            mb01.i(sk01Var);
            bundle.getString("app_id");
            zzaw n02 = sk01Var.n0(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true);
            mb01.i(sk01Var);
            bundle.getString("app_id");
            mb01Var.s().p(new zzac(bundle.getString("app_id"), string2, zzkwVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), n02, bundle.getLong("trigger_timeout"), n0, bundle.getLong("time_to_live"), sk01Var.n0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
