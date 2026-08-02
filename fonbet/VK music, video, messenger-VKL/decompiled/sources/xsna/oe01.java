package xsna;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzkw;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class oe01 implements Runnable {
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ bf01 c;

    public oe01(bf01 bf01Var, Bundle bundle) {
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
        exc0.f(string);
        mb01 mb01Var = (mb01) bf01Var.b;
        if (!mb01Var.b()) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.q.a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzkw zzkwVar = new zzkw(0L, null, string, "");
        try {
            sk01 sk01Var = mb01Var.m;
            mb01.i(sk01Var);
            bundle.getString("app_id");
            mb01Var.s().p(new zzac(bundle.getString("app_id"), "", zzkwVar, bundle.getLong("creation_timestamp"), bundle.getBoolean(SignalingProtocol.KEY_ACTIVE), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), sk01Var.n0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
