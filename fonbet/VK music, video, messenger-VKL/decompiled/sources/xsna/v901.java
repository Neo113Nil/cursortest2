package xsna;

import android.content.SharedPreferences;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class v901 {

    @VisibleForTesting
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final /* synthetic */ x901 e;

    public /* synthetic */ v901(x901 x901Var, long j) {
        this.e = x901Var;
        exc0.f("health_monitor");
        exc0.b(j > 0);
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = j;
    }

    public final void a() {
        x901 x901Var = this.e;
        x901Var.k();
        ((mb01) x901Var.b).o.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = x901Var.o().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, currentTimeMillis);
        edit.apply();
    }
}
