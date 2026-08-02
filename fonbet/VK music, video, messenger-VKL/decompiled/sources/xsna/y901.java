package xsna;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class y901 implements ServiceConnection {
    public final String b;
    public final /* synthetic */ z901 c;

    public y901(z901 z901Var, String str) {
        this.c = z901Var;
        this.b = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        z901 z901Var = this.c;
        if (iBinder == null) {
            k901 k901Var = z901Var.a.j;
            mb01.k(k901Var);
            k901Var.l.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzbr zzb = zzbq.zzb(iBinder);
            if (zzb == null) {
                k901 k901Var2 = z901Var.a.j;
                mb01.k(k901Var2);
                k901Var2.l.a("Install Referrer Service implementation was not found");
            } else {
                k901 k901Var3 = z901Var.a.j;
                mb01.k(k901Var3);
                k901Var3.q.a("Install Referrer Service connected");
                kb01 kb01Var = z901Var.a.k;
                mb01.k(kb01Var);
                kb01Var.s(new dyu(this, zzb, this));
            }
        } catch (RuntimeException e) {
            k901 k901Var4 = z901Var.a.j;
            mb01.k(k901Var4);
            k901Var4.l.b(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k901 k901Var = this.c.a.j;
        mb01.k(k901Var);
        k901Var.q.a("Install Referrer Service disconnected");
    }
}
