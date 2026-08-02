package xsna;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.measurement.internal.zzaw;
import java.util.HashMap;
import xsna.dz9;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final /* synthetic */ class v301 implements Runnable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public v301(rob robVar, String str, Bundle bundle) {
        this.e = robVar;
        this.c = str;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz9.d dVar;
        switch (this.b) {
            case 0:
                y301 y301Var = (y301) this.d;
                HashMap hashMap = y301Var.a.s;
                String str = this.c;
                synchronized (hashMap) {
                    dVar = (dz9.d) hashMap.get(str);
                }
                if (dVar == null) {
                    a401.w.a("Discarded message for unknown namespace '%s'", str);
                    return;
                } else {
                    String str2 = (String) this.e;
                    CastDevice castDevice = y301Var.a.q;
                    dVar.a(str2);
                    return;
                }
            default:
                qj01 qj01Var = (qj01) ((rob) this.e).b;
                sk01 Q = qj01Var.Q();
                Bundle bundle = (Bundle) this.d;
                ((jcl) qj01Var.f()).getClass();
                zzaw n0 = Q.n0("_err", bundle, "auto", System.currentTimeMillis(), false);
                exc0.i(n0);
                qj01Var.k(n0, this.c);
                return;
        }
    }

    public /* synthetic */ v301(y301 y301Var, String str, String str2) {
        this.d = y301Var;
        this.c = str;
        this.e = str2;
    }
}
