package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;

/* compiled from: SidecarWindowBackend.kt */
/* loaded from: classes12.dex */
public final class plj0 implements opx0 {
    public static volatile plj0 c;
    public static final ReentrantLock d = new ReentrantLock();
    public final tcq a;
    public final CopyOnWriteArrayList<b> b = new CopyOnWriteArrayList<>();

    /* compiled from: SidecarWindowBackend.kt */
    public final class a {
        public a() {
        }
    }

    /* compiled from: SidecarWindowBackend.kt */
    public static final class b {
        public final Activity a;
        public final Executor b;
        public final o7j<erx0> c;
        public erx0 d;

        public b(Activity activity, Executor executor, o7j<erx0> o7jVar) {
            this.a = activity;
            this.b = executor;
            this.c = o7jVar;
        }
    }

    public plj0(SidecarCompat sidecarCompat) {
        this.a = sidecarCompat;
        if (sidecarCompat != null) {
            sidecarCompat.e(new a());
        }
    }

    @Override // xsna.opx0
    public final void a(Context context, Executor executor, o7j<erx0> o7jVar) {
        b bVar;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            o7jVar.accept(new erx0(EmptyList.b));
            return;
        }
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            tcq tcqVar = this.a;
            if (tcqVar == null) {
                o7jVar.accept(new erx0(EmptyList.b));
                return;
            }
            CopyOnWriteArrayList<b> copyOnWriteArrayList = this.b;
            boolean z = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator<b> it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().a.equals(activity)) {
                        z = true;
                        break;
                    }
                }
            }
            b bVar2 = new b(activity, executor, o7jVar);
            copyOnWriteArrayList.add(bVar2);
            if (z) {
                Iterator<b> it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        bVar = null;
                        break;
                    } else {
                        bVar = it2.next();
                        if (activity.equals(bVar.a)) {
                            break;
                        }
                    }
                }
                b bVar3 = bVar;
                erx0 erx0Var = bVar3 != null ? bVar3.d : null;
                if (erx0Var != null) {
                    bVar2.d = erx0Var;
                    bVar2.b.execute(new yy4(10, bVar2, erx0Var));
                }
            } else {
                tcqVar.b(activity);
            }
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // xsna.opx0
    public final void b(o7j<erx0> o7jVar) {
        synchronized (d) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<b> it = this.b.iterator();
                while (it.hasNext()) {
                    b next = it.next();
                    if (next.c == o7jVar) {
                        arrayList.add(next);
                    }
                }
                this.b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((b) it2.next()).a;
                    CopyOnWriteArrayList<b> copyOnWriteArrayList = this.b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator<b> it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (it3.next().a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    tcq tcqVar = this.a;
                    if (tcqVar != null) {
                        tcqVar.a(activity);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
