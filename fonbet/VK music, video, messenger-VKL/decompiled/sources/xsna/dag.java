package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.work.NetworkType;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xsna.kpn0;

/* compiled from: CommandHandler.java */
/* loaded from: classes12.dex */
public final class dag implements e3q {
    public static final String g = m100.d("CommandHandler");
    public final Context b;
    public final HashMap c = new HashMap();
    public final Object d = new Object();
    public final i7o0 e;
    public final dpn0 f;

    public dag(@NonNull Context context, i7o0 i7o0Var, @NonNull dpn0 dpn0Var) {
        this.b = context;
        this.e = i7o0Var;
        this.f = dpn0Var;
    }

    public static svx0 c(@NonNull Intent intent) {
        return new svx0(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(@NonNull Intent intent, @NonNull svx0 svx0Var) {
        intent.putExtra("KEY_WORKSPEC_ID", svx0Var.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", svx0Var.b);
    }

    public final void a(int i, @NonNull Intent intent, @NonNull kpn0 kpn0Var) {
        List<tqk0> list;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m100 c = m100.c();
            Objects.toString(intent);
            c.getClass();
            Context context = this.b;
            r6j r6jVar = new r6j(context, this.e, i, kpn0Var);
            ArrayList x = kpn0Var.f.c.D().x();
            int i2 = ConstraintProxy.a;
            Iterator it = x.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                p6j p6jVar = ((fxx0) it.next()).j;
                z |= p6jVar.e;
                z2 |= p6jVar.c;
                z3 |= p6jVar.f;
                z4 |= p6jVar.a != NetworkType.NOT_REQUIRED;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            int i3 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(x.size());
            long d = r6jVar.a.d();
            Iterator it2 = x.iterator();
            while (it2.hasNext()) {
                fxx0 fxx0Var = (fxx0) it2.next();
                if (d >= fxx0Var.a()) {
                    if (fxx0Var.c()) {
                        List<v5j> list2 = r6jVar.c.a;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list2) {
                            if (((v5j) obj).c(fxx0Var)) {
                                arrayList2.add(obj);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            m100 c2 = m100.c();
                            int i4 = wux0.a;
                            j5g.g0(arrayList2, null, null, null, 0, WorkConstraintsTracker.a.i, 31);
                            c2.getClass();
                        }
                        if (arrayList2.isEmpty()) {
                        }
                    }
                    arrayList.add(fxx0Var);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                fxx0 fxx0Var2 = (fxx0) it3.next();
                String str = fxx0Var2.a;
                svx0 c3 = bdl.c(fxx0Var2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, c3);
                m100.c().getClass();
                kpn0Var.c.c().execute(new kpn0.b(r6jVar.b, intent3, kpn0Var));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m100 c4 = m100.c();
            Objects.toString(intent);
            c4.getClass();
            kpn0Var.f.k();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            m100.c().a(g, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.b;
            svx0 c5 = c(intent);
            m100 c6 = m100.c();
            c5.toString();
            c6.getClass();
            WorkDatabase workDatabase = kpn0Var.f.c;
            workDatabase.c();
            try {
                fxx0 j = workDatabase.D().j(c5.a);
                if (j == null) {
                    m100 c7 = m100.c();
                    c5.toString();
                    c7.getClass();
                    return;
                }
                if (j.b.h()) {
                    m100 c8 = m100.c();
                    c5.toString();
                    c8.getClass();
                    return;
                }
                long a = j.a();
                if (j.c()) {
                    m100 c9 = m100.c();
                    c5.toString();
                    c9.getClass();
                    vc1.b(context2, workDatabase, c5, a);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    kpn0Var.c.c().execute(new kpn0.b(i, intent4, kpn0Var));
                } else {
                    m100 c10 = m100.c();
                    c5.toString();
                    c10.getClass();
                    vc1.b(context2, workDatabase, c5, a);
                }
                workDatabase.w();
                return;
            } finally {
                workDatabase.q();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.d) {
                try {
                    svx0 c11 = c(intent);
                    m100 c12 = m100.c();
                    c11.toString();
                    c12.getClass();
                    if (this.c.containsKey(c11)) {
                        m100 c13 = m100.c();
                        c11.toString();
                        c13.getClass();
                    } else {
                        rsl rslVar = new rsl(this.b, i, kpn0Var, this.f.d(c11));
                        this.c.put(c11, rslVar);
                        rslVar.f();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                m100 c14 = m100.c();
                intent.toString();
                c14.getClass();
                return;
            } else {
                svx0 c15 = c(intent);
                boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                m100 c16 = m100.c();
                intent.toString();
                c16.getClass();
                b(c15, z5);
                return;
            }
        }
        dpn0 dpn0Var = this.f;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i5 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList3 = new ArrayList(1);
            tqk0 c17 = dpn0Var.c(new svx0(string, i5));
            list = arrayList3;
            if (c17 != null) {
                arrayList3.add(c17);
                list = arrayList3;
            }
        } else {
            list = dpn0Var.b(string);
        }
        for (tqk0 tqk0Var : list) {
            m100.c().getClass();
            kpn0Var.k.a(tqk0Var);
            Context context3 = this.b;
            WorkDatabase workDatabase2 = kpn0Var.f.c;
            svx0 svx0Var = tqk0Var.a;
            int i6 = vc1.a;
            hqn0 A = workDatabase2.A();
            gqn0 c18 = A.c(svx0Var);
            if (c18 != null) {
                vc1.a(context3, svx0Var, c18.c);
                m100 c19 = m100.c();
                svx0Var.toString();
                c19.getClass();
                A.a(svx0Var);
            }
            kpn0Var.b(tqk0Var.a, false);
        }
    }

    @Override // xsna.e3q
    public final void b(@NonNull svx0 svx0Var, boolean z) {
        synchronized (this.d) {
            try {
                rsl rslVar = (rsl) this.c.remove(svx0Var);
                this.f.c(svx0Var);
                if (rslVar != null) {
                    rslVar.g(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
