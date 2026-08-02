package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class nuz {
    public static final Executor e;
    public final LinkedHashSet a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile euz d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            e = new b43(1);
        } else {
            e = Executors.newCachedThreadPool(new ouz());
        }
    }

    public nuz(Callable callable, boolean z) {
        if (z) {
            try {
                e((euz) callable.call());
                return;
            } catch (Throwable th) {
                e(new euz(th));
                return;
            }
        }
        Executor executor = e;
        muz muzVar = new muz(callable);
        muzVar.a = this;
        executor.execute(muzVar);
    }

    public final synchronized void a(xtz xtzVar) {
        Throwable th;
        try {
            euz euzVar = this.d;
            if (euzVar != null && (th = euzVar.b) != null) {
                xtzVar.onResult(th);
            }
            this.b.add(xtzVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(xtz xtzVar) {
        nsz nszVar;
        try {
            euz euzVar = this.d;
            if (euzVar != null && (nszVar = euzVar.a) != null) {
                xtzVar.onResult(nszVar);
            }
            this.a.add(xtzVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        euz euzVar = this.d;
        if (euzVar == null) {
            return;
        }
        nsz nszVar = euzVar.a;
        if (nszVar != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.a).iterator();
                while (it.hasNext()) {
                    ((xtz) it.next()).onResult(nszVar);
                }
            }
            return;
        }
        Throwable th = euzVar.b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.b);
            if (arrayList.isEmpty()) {
                lgz.c("Lottie encountered an error but no failure listener was added:");
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((xtz) it2.next()).onResult(th);
            }
        }
    }

    public final synchronized void d(xtz xtzVar) {
        this.a.remove(xtzVar);
    }

    public final void e(euz euzVar) {
        if (this.d != null) {
            ny61.r("A task may only be set once.");
            return;
        }
        this.d = euzVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.c.post(new ssu(7, this));
        }
    }

    public nuz(nsz nszVar) {
        e(new euz(nszVar));
    }
}
