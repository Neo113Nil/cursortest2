package xsna;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import xsna.ub9;
import xsna.uyx0;

/* compiled from: Processor.java */
/* loaded from: classes.dex */
public final class ohd0 {
    public static final String l = m100.d("Processor");
    public final Context b;
    public final androidx.work.a c;
    public final hwx0 d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();

    @Nullable
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public ohd0(@NonNull Context context, @NonNull androidx.work.a aVar, @NonNull hwx0 hwx0Var, @NonNull WorkDatabase workDatabase) {
        this.b = context;
        this.c = aVar;
        this.d = hwx0Var;
        this.e = workDatabase;
    }

    public static boolean d(@Nullable uyx0 uyx0Var, int i) {
        if (uyx0Var == null) {
            m100.c().getClass();
            return false;
        }
        uyx0Var.n.P(new WorkerStoppedException(i));
        m100.c().getClass();
        return true;
    }

    public final void a(@NonNull e3q e3qVar) {
        synchronized (this.k) {
            this.j.add(e3qVar);
        }
    }

    @Nullable
    public final uyx0 b(@NonNull String str) {
        uyx0 uyx0Var = (uyx0) this.f.remove(str);
        boolean z = uyx0Var != null;
        if (!z) {
            uyx0Var = (uyx0) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        try {
                            this.b.startService(bqn0.d(this.b));
                        } catch (Throwable th) {
                            m100.c().b(l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return uyx0Var;
    }

    @Nullable
    public final uyx0 c(@NonNull String str) {
        uyx0 uyx0Var = (uyx0) this.f.get(str);
        return uyx0Var == null ? (uyx0) this.g.get(str) : uyx0Var;
    }

    public final boolean e(@NonNull String str) {
        boolean z;
        synchronized (this.k) {
            z = c(str) != null;
        }
        return z;
    }

    public final void f(@NonNull e3q e3qVar) {
        synchronized (this.k) {
            this.j.remove(e3qVar);
        }
    }

    public final boolean g(@NonNull tqk0 tqk0Var, @Nullable WorkerParameters.a aVar) {
        Throwable th;
        svx0 svx0Var = tqk0Var.a;
        final String str = svx0Var.a;
        final ArrayList arrayList = new ArrayList();
        fxx0 fxx0Var = (fxx0) this.e.t(new Callable() { // from class: xsna.lhd0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = ohd0.this.e;
                cyx0 E = workDatabase.E();
                String str2 = str;
                arrayList.addAll(E.c(str2));
                return workDatabase.D().j(str2);
            }
        });
        if (fxx0Var == null) {
            m100 c = m100.c();
            svx0Var.toString();
            c.getClass();
            this.d.d.execute(new i73(5, this, svx0Var));
            return false;
        }
        synchronized (this.k) {
            try {
                try {
                    try {
                        if (e(str)) {
                            Set set = (Set) this.h.get(str);
                            if (((tqk0) set.iterator().next()).a.b == svx0Var.b) {
                                set.add(tqk0Var);
                                m100 c2 = m100.c();
                                svx0Var.toString();
                                c2.getClass();
                            } else {
                                this.d.d.execute(new i73(5, this, svx0Var));
                            }
                            return false;
                        }
                        if (fxx0Var.t != svx0Var.b) {
                            this.d.d.execute(new i73(5, this, svx0Var));
                            return false;
                        }
                        uyx0.a aVar2 = new uyx0.a(this.b, this.c, this.d, this, this.e, fxx0Var, arrayList);
                        if (aVar != null) {
                            aVar2.h = aVar;
                        }
                        final uyx0 uyx0Var = new uyx0(aVar2);
                        final ub9.d a = ahz.a(uyx0Var.e.b.plus(iyx.a()), new wyx0(uyx0Var, null));
                        a.c.addListener(new Runnable() { // from class: xsna.nhd0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z;
                                ohd0 ohd0Var = ohd0.this;
                                ub9.d dVar = a;
                                uyx0 uyx0Var2 = uyx0Var;
                                try {
                                    z = ((Boolean) dVar.c.get()).booleanValue();
                                } catch (InterruptedException | ExecutionException unused) {
                                    z = true;
                                }
                                synchronized (ohd0Var.k) {
                                    try {
                                        svx0 c3 = bdl.c(uyx0Var2.a);
                                        String str2 = c3.a;
                                        if (ohd0Var.c(str2) == uyx0Var2) {
                                            ohd0Var.b(str2);
                                        }
                                        m100.c().getClass();
                                        Iterator it = ohd0Var.j.iterator();
                                        while (it.hasNext()) {
                                            ((e3q) it.next()).b(c3, z);
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        }, this.d.d);
                        this.g.put(str, uyx0Var);
                        HashSet hashSet = new HashSet();
                        hashSet.add(tqk0Var);
                        this.h.put(str, hashSet);
                        m100 c3 = m100.c();
                        svx0Var.toString();
                        c3.getClass();
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }
}
