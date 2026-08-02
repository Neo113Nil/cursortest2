package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import defpackage.dbs0;
import defpackage.e9e;
import defpackage.ebs0;
import defpackage.epo0;
import defpackage.gyo;
import defpackage.v751;
import defpackage.wor0;
import defpackage.z551;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class a implements z551 {
    public static volatile a c;
    public static final ReentrantLock d = new ReentrantLock();
    public final gyo a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public a(dbs0 dbs0Var) {
        this.a = dbs0Var;
        if (dbs0Var != null) {
            dbs0Var.d(new wor0(this));
        }
    }

    @Override // defpackage.z551
    public final void a(Context context, Executor executor, e9e e9eVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        r1 = null;
        IBinder iBinder = null;
        final Activity activity = context instanceof Activity ? (Activity) context : null;
        EmptyList emptyList = EmptyList.a;
        if (activity == null) {
            e9eVar.accept(new v751(emptyList));
            return;
        }
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            gyo gyoVar = this.a;
            if (gyoVar == null) {
                e9eVar.accept(new v751(emptyList));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.b;
            boolean z = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((ebs0) it.next()).a.equals(activity)) {
                        z = true;
                        break;
                    }
                }
            }
            ebs0 ebs0Var = new ebs0(activity, executor, e9eVar);
            copyOnWriteArrayList.add(ebs0Var);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (activity.equals(((ebs0) obj).a)) {
                            break;
                        }
                    }
                }
                ebs0 ebs0Var2 = (ebs0) obj;
                v751 v751Var = ebs0Var2 != null ? ebs0Var2.d : null;
                if (v751Var != null) {
                    ebs0Var.d = v751Var;
                    ebs0Var.b.execute(new epo0(23, ebs0Var, v751Var));
                }
            } else {
                final dbs0 dbs0Var = (dbs0) gyoVar;
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    dbs0Var.c(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(dbs0Var, activity) { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$FirstAttachAdapter
                        private final WeakReference<Activity> activityWeakReference;
                        private final dbs0 sidecarCompat;

                        {
                            this.sidecarCompat = dbs0Var;
                            this.activityWeakReference = new WeakReference<>(activity);
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) {
                            Window window2;
                            WindowManager.LayoutParams attributes2;
                            view.removeOnAttachStateChangeListener(this);
                            Activity activity2 = this.activityWeakReference.get();
                            IBinder iBinder2 = (activity2 == null || (window2 = activity2.getWindow()) == null || (attributes2 = window2.getAttributes()) == null) ? null : attributes2.token;
                            if (activity2 == null || iBinder2 == null) {
                                return;
                            }
                            this.sidecarCompat.c(iBinder2, activity2);
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) {
                        }
                    });
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.z551
    public final void b(e9e e9eVar) {
        synchronized (d) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ebs0 ebs0Var = (ebs0) it.next();
                    if (ebs0Var.c == e9eVar) {
                        arrayList.add(ebs0Var);
                    }
                }
                this.b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((ebs0) it2.next()).a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((ebs0) it3.next()).a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    gyo gyoVar = this.a;
                    if (gyoVar != null) {
                        ((dbs0) gyoVar).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
