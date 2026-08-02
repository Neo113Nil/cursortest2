package defpackage;

import android.content.SharedPreferences;
import androidx.lifecycle.Lifecycle;
import com.ybsdk.rconfig.configs.YbFullscreenLimitationsConfig;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ng51 implements mg51 {
    public final c4u0 a;
    public final nh51 b;

    public ng51(pg51 pg51Var, c4u0 c4u0Var, tvv tvvVar) {
        this.a = c4u0Var;
        this.b = new nh51(pg51Var, tvvVar);
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        e4u0 e4u0Var = (e4u0) this.a;
        e4u0Var.getClass();
        int i = d4u0.a[event.ordinal()];
        if (i == 1) {
            if (e4u0Var.x && ((Boolean) e4u0Var.w.getValue()).booleanValue()) {
                e4u0Var.a.o.a.a("host.deactivated", null);
                y1r0 y1r0Var = e4u0Var.c;
                synchronized (y1r0Var.f) {
                    long currentTimeMillis = System.currentTimeMillis();
                    a6w a6wVar = y1r0Var.d;
                    kgx kgxVar = y1r0.g[1];
                    a6wVar.c(Long.valueOf(currentTimeMillis));
                }
            }
            e4u0Var.x = false;
            return;
        }
        if (i != 2) {
            if (i == 3 && ((Boolean) e4u0Var.w.getValue()).booleanValue()) {
                e4u0Var.a.o.a.a("quit", null);
                return;
            }
            return;
        }
        e4u0Var.x = true;
        if (((Boolean) e4u0Var.w.getValue()).booleanValue()) {
            e4u0Var.a.o.a.a("host.activated", null);
            y1r0 y1r0Var2 = e4u0Var.c;
            long currentTimeMillis2 = System.currentTimeMillis();
            long millis = TimeUnit.MINUTES.toMillis(((YbFullscreenLimitationsConfig) y1r0Var2.a.d(es51.a).getData()).getSessionDurationMinutes());
            synchronized (y1r0Var2.f) {
                a6w a6wVar2 = y1r0Var2.d;
                kgx[] kgxVarArr = y1r0.g;
                kgx kgxVar2 = kgxVarArr[1];
                if (currentTimeMillis2 - a6wVar2.a().longValue() >= millis) {
                    String uuid = UUID.randomUUID().toString();
                    a6w a6wVar3 = y1r0Var2.e;
                    kgx kgxVar3 = kgxVarArr[2];
                    SharedPreferences.Editor edit = a6wVar3.b.edit();
                    edit.putString("prefs_session_id", uuid);
                    edit.apply();
                    a6w a6wVar4 = y1r0Var2.c;
                    kgx kgxVar4 = kgxVarArr[0];
                    int i2 = a6wVar4.b.getInt(a6wVar4.c, 0) + 1;
                    a6w a6wVar5 = y1r0Var2.c;
                    kgx kgxVar5 = kgxVarArr[0];
                    a6wVar5.b(Integer.valueOf(i2));
                }
            }
        }
    }

    public final nh51 a() {
        return this.b;
    }
}
