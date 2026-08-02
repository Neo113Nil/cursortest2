package xsna;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.a;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes12.dex */
public final class bqn0 implements j380, e3q {
    public static final String k = m100.d("SystemFgDispatcher");
    public final dwx0 b;
    public final r5o0 c;
    public final Object d = new Object();
    public svx0 e;
    public final LinkedHashMap f;
    public final HashMap g;
    public final HashMap h;
    public final WorkConstraintsTracker i;

    @Nullable
    public SystemForegroundService j;

    public bqn0(@NonNull Context context) {
        dwx0 h = dwx0.h(context);
        this.b = h;
        this.c = h.d;
        this.e = null;
        this.f = new LinkedHashMap();
        this.h = new HashMap();
        this.g = new HashMap();
        this.i = new WorkConstraintsTracker(h.j);
        h.f.a(this);
    }

    @NonNull
    public static Intent c(@NonNull Context context, @NonNull svx0 svx0Var, @NonNull n7s n7sVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", svx0Var.a);
        intent.putExtra("KEY_GENERATION", svx0Var.b);
        intent.putExtra("KEY_NOTIFICATION_ID", n7sVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", n7sVar.b);
        intent.putExtra("KEY_NOTIFICATION", n7sVar.c);
        return intent;
    }

    @NonNull
    public static Intent d(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // xsna.j380
    public final void a(@NonNull fxx0 fxx0Var, @NonNull androidx.work.impl.constraints.a aVar) {
        if (aVar instanceof a.b) {
            String str = fxx0Var.a;
            m100.c().getClass();
            svx0 c = bdl.c(fxx0Var);
            int i = ((a.b) aVar).a;
            dwx0 dwx0Var = this.b;
            dwx0Var.d.b(new ggl0(dwx0Var.f, new tqk0(c), true, i));
        }
    }

    @Override // xsna.e3q
    public final void b(@NonNull svx0 svx0Var, boolean z) {
        Map.Entry entry;
        synchronized (this.d) {
            try {
                eyx eyxVar = ((fxx0) this.g.remove(svx0Var)) != null ? (eyx) this.h.remove(svx0Var) : null;
                if (eyxVar != null) {
                    eyxVar.b(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        n7s n7sVar = (n7s) this.f.remove(svx0Var);
        if (svx0Var.equals(this.e)) {
            if (this.f.size() > 0) {
                Iterator it = this.f.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.e = (svx0) entry.getKey();
                if (this.j != null) {
                    n7s n7sVar2 = (n7s) entry.getValue();
                    SystemForegroundService systemForegroundService = this.j;
                    int i = n7sVar2.a;
                    int i2 = n7sVar2.b;
                    Notification notification = n7sVar2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        SystemForegroundService.b.a(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        SystemForegroundService.a.a(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.j.e.cancel(n7sVar2.a);
                }
            } else {
                this.e = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.j;
        if (n7sVar == null || systemForegroundService2 == null) {
            return;
        }
        m100 c = m100.c();
        svx0Var.toString();
        c.getClass();
        systemForegroundService2.e.cancel(n7sVar.a);
    }

    public final void e(@NonNull Intent intent) {
        if (this.j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        svx0 svx0Var = new svx0(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        m100.c().getClass();
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        n7s n7sVar = new n7s(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f;
        linkedHashMap.put(svx0Var, n7sVar);
        n7s n7sVar2 = (n7s) linkedHashMap.get(this.e);
        if (n7sVar2 == null) {
            this.e = svx0Var;
        } else {
            this.j.e.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((n7s) ((Map.Entry) it.next()).getValue()).b;
                }
                n7sVar = new n7s(n7sVar2.a, n7sVar2.c, i);
            } else {
                n7sVar = n7sVar2;
            }
        }
        SystemForegroundService systemForegroundService = this.j;
        int i2 = n7sVar.a;
        int i3 = n7sVar.b;
        Notification notification2 = n7sVar.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            SystemForegroundService.b.a(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            SystemForegroundService.a.a(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    public final void f() {
        this.j = null;
        synchronized (this.d) {
            try {
                Iterator it = this.h.values().iterator();
                while (it.hasNext()) {
                    ((eyx) it.next()).b(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.f.f(this);
    }

    public final void g(int i) {
        m100.c().getClass();
        for (Map.Entry entry : this.f.entrySet()) {
            if (((n7s) entry.getValue()).b == i) {
                svx0 svx0Var = (svx0) entry.getKey();
                dwx0 dwx0Var = this.b;
                dwx0Var.d.b(new ggl0(dwx0Var.f, new tqk0(svx0Var), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.j;
        if (systemForegroundService != null) {
            systemForegroundService.c = true;
            m100.c().getClass();
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
        }
    }
}
