package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.a;
import java.util.Objects;
import java.util.concurrent.Executor;
import xsna.gyx0;
import xsna.kpn0;

/* compiled from: DelayMetCommandHandler.java */
/* loaded from: classes12.dex */
public final class rsl implements j380, gyx0.a {
    public final Context b;
    public final int c;
    public final svx0 d;
    public final kpn0 e;
    public final WorkConstraintsTracker f;
    public final Object g;
    public int h;
    public final dmi0 i;
    public final Executor j;

    @Nullable
    public PowerManager.WakeLock k;
    public boolean l;
    public final tqk0 m;
    public final ovj n;
    public volatile yok0 o;

    static {
        m100.d("DelayMetCommandHandler");
    }

    public rsl(@NonNull Context context, int i, @NonNull kpn0 kpn0Var, @NonNull tqk0 tqk0Var) {
        this.b = context;
        this.c = i;
        this.e = kpn0Var;
        this.d = tqk0Var.a;
        this.m = tqk0Var;
        uhp0 uhp0Var = kpn0Var.f.j;
        r5o0 r5o0Var = kpn0Var.c;
        this.i = r5o0Var.d();
        this.j = r5o0Var.c();
        this.n = r5o0Var.a();
        this.f = new WorkConstraintsTracker(uhp0Var);
        this.l = false;
        this.h = 0;
        this.g = new Object();
    }

    public static void c(rsl rslVar) {
        int i = rslVar.c;
        Executor executor = rslVar.j;
        Context context = rslVar.b;
        kpn0 kpn0Var = rslVar.e;
        svx0 svx0Var = rslVar.d;
        String str = svx0Var.a;
        if (rslVar.h >= 2) {
            m100.c().getClass();
            return;
        }
        rslVar.h = 2;
        m100.c().getClass();
        String str2 = dag.g;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        dag.d(intent, svx0Var);
        executor.execute(new kpn0.b(i, intent, kpn0Var));
        if (!kpn0Var.e.e(svx0Var.a)) {
            m100.c().getClass();
            return;
        }
        m100.c().getClass();
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        dag.d(intent2, svx0Var);
        executor.execute(new kpn0.b(i, intent2, kpn0Var));
    }

    public static void d(rsl rslVar) {
        if (rslVar.h != 0) {
            m100 c = m100.c();
            Objects.toString(rslVar.d);
            c.getClass();
            return;
        }
        rslVar.h = 1;
        m100 c2 = m100.c();
        Objects.toString(rslVar.d);
        c2.getClass();
        if (!rslVar.e.e.g(rslVar.m, null)) {
            rslVar.e();
            return;
        }
        gyx0 gyx0Var = rslVar.e.d;
        svx0 svx0Var = rslVar.d;
        synchronized (gyx0Var.d) {
            m100 c3 = m100.c();
            Objects.toString(svx0Var);
            c3.getClass();
            gyx0Var.a(svx0Var);
            gyx0.b bVar = new gyx0.b(gyx0Var, svx0Var);
            gyx0Var.b.put(svx0Var, bVar);
            gyx0Var.c.put(svx0Var, rslVar);
            gyx0Var.a.b(600000L, bVar);
        }
    }

    @Override // xsna.j380
    public final void a(@NonNull fxx0 fxx0Var, @NonNull androidx.work.impl.constraints.a aVar) {
        boolean z = aVar instanceof a.C0094a;
        dmi0 dmi0Var = this.i;
        if (z) {
            ((emi0) dmi0Var).execute(new ov(this, 3));
        } else {
            ((emi0) dmi0Var).execute(new qd0(this, 6));
        }
    }

    @Override // xsna.gyx0.a
    public final void b(@NonNull svx0 svx0Var) {
        m100 c = m100.c();
        Objects.toString(svx0Var);
        c.getClass();
        ((emi0) this.i).execute(new qd0(this, 6));
    }

    public final void e() {
        synchronized (this.g) {
            try {
                if (this.o != null) {
                    this.o.b(null);
                }
                this.e.d.a(this.d);
                PowerManager.WakeLock wakeLock = this.k;
                if (wakeLock != null && wakeLock.isHeld()) {
                    m100 c = m100.c();
                    Objects.toString(this.k);
                    Objects.toString(this.d);
                    c.getClass();
                    this.k.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        String str = this.d.a;
        Context context = this.b;
        StringBuilder b = ho8.b(str, " (");
        b.append(this.c);
        b.append(")");
        this.k = z8x0.a(context, b.toString());
        m100 c = m100.c();
        Objects.toString(this.k);
        c.getClass();
        this.k.acquire();
        fxx0 j = this.e.f.c.D().j(str);
        if (j == null) {
            ((emi0) this.i).execute(new qd0(this, 6));
            return;
        }
        boolean c2 = j.c();
        this.l = c2;
        if (c2) {
            this.o = wux0.a(this.f, j, this.n, this);
            return;
        }
        m100.c().getClass();
        ((emi0) this.i).execute(new ov(this, 3));
    }

    public final void g(boolean z) {
        m100 c = m100.c();
        svx0 svx0Var = this.d;
        Objects.toString(svx0Var);
        c.getClass();
        e();
        int i = this.c;
        kpn0 kpn0Var = this.e;
        Executor executor = this.j;
        Context context = this.b;
        if (z) {
            String str = dag.g;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            dag.d(intent, svx0Var);
            executor.execute(new kpn0.b(i, intent, kpn0Var));
        }
        if (this.l) {
            String str2 = dag.g;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executor.execute(new kpn0.b(i, intent2, kpn0Var));
        }
    }
}
