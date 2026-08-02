package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public final class htx0 {
    public final mtx0 a;
    public final String b;
    public boolean c;
    public wsx0 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public htx0(mtx0 mtx0Var, String str) {
        this.a = mtx0Var;
        this.b = str;
    }

    public static void c(htx0 htx0Var, String str, long j, sls slsVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z = (i & 4) != 0;
        htx0Var.getClass();
        htx0Var.d(new xxj(str, z, slsVar), j);
    }

    public final void a() {
        mtx0 mtx0Var = this.a;
        TimeZone timeZone = bg61.a;
        synchronized (mtx0Var) {
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final boolean b() {
        wsx0 wsx0Var = this.d;
        if (wsx0Var != null && wsx0Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((wsx0) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                wsx0 wsx0Var2 = (wsx0) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    vkb1.a(logger, wsx0Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void d(wsx0 wsx0Var, long j) {
        synchronized (this.a) {
            if (!this.c) {
                if (f(wsx0Var, j, false)) {
                    this.a.c(this);
                }
                return;
            }
            boolean z = wsx0Var.b;
            Logger logger = this.a.b;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    vkb1.a(logger, wsx0Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    vkb1.a(logger, wsx0Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean f(wsx0 wsx0Var, long j, boolean z) {
        Logger logger = this.a.b;
        htx0 htx0Var = wsx0Var.c;
        if (htx0Var != this) {
            if (htx0Var != null) {
                ny61.r("task is in multiple queues");
                return false;
            }
            wsx0Var.c = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(wsx0Var);
        if (indexOf != -1) {
            if (wsx0Var.d <= j2) {
                if (logger.isLoggable(Level.FINE)) {
                    vkb1.a(logger, wsx0Var, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        wsx0Var.d = j2;
        if (logger.isLoggable(Level.FINE)) {
            vkb1.a(logger, wsx0Var, this, z ? "run again after ".concat(vkb1.b(j2 - nanoTime)) : "scheduled after ".concat(vkb1.b(j2 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((wsx0) it.next()).d - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, wsx0Var);
        return i == 0;
    }

    public final void g() {
        mtx0 mtx0Var = this.a;
        TimeZone timeZone = bg61.a;
        synchronized (mtx0Var) {
            this.c = true;
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
