package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class as01 {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final tk01 b;
    public boolean g;
    public final Intent h;

    @Nullable
    public ur01 l;

    @Nullable
    public ia01 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final an01 j = new IBinder.DeathRecipient() { // from class: xsna.an01
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            as01 as01Var = as01.this;
            as01Var.b.c("reportBinderDeath", new Object[0]);
            bp01 bp01Var = (bp01) as01Var.i.get();
            if (bp01Var != null) {
                as01Var.b.c("calling onBinderDied", new Object[0]);
                bp01Var.zza();
            } else {
                as01Var.b.c("%s : Binder has died.", as01Var.c);
                Iterator it = as01Var.d.iterator();
                while (it.hasNext()) {
                    sl01 sl01Var = (sl01) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(as01Var.c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = sl01Var.b;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                as01Var.d.clear();
            }
            synchronized (as01Var.f) {
                as01Var.d();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [xsna.an01] */
    public as01(Context context, tk01 tk01Var, Intent intent) {
        this.a = context;
        this.b = tk01Var;
        this.h = intent;
    }

    public static void b(as01 as01Var, sl01 sl01Var) {
        ia01 ia01Var = as01Var.m;
        tk01 tk01Var = as01Var.b;
        ArrayList arrayList = as01Var.d;
        if (ia01Var != null || as01Var.g) {
            if (!as01Var.g) {
                sl01Var.run();
                return;
            } else {
                tk01Var.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(sl01Var);
                return;
            }
        }
        tk01Var.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(sl01Var);
        ur01 ur01Var = new ur01(as01Var);
        as01Var.l = ur01Var;
        as01Var.g = true;
        if (as01Var.a.bindService(as01Var.h, ur01Var, 1)) {
            return;
        }
        tk01Var.c("Failed to bind to the service.", new Object[0]);
        as01Var.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sl01 sl01Var2 = (sl01) it.next();
            com.google.android.play.core.appupdate.internal.zzy zzyVar = new com.google.android.play.core.appupdate.internal.zzy();
            TaskCompletionSource taskCompletionSource = sl01Var2.b;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(zzyVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    hashMap.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new lo01(this));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
