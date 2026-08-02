package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.internal.zzag;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class uvz0 {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final lq01 b;
    public boolean g;
    public final Intent h;

    @Nullable
    public rvz0 l;

    @Nullable
    public c401 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final cs01 j = new IBinder.DeathRecipient() { // from class: xsna.cs01
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            uvz0 uvz0Var = uvz0.this;
            uvz0Var.b.d("reportBinderDeath", new Object[0]);
            xtz0 xtz0Var = (xtz0) uvz0Var.i.get();
            if (xtz0Var != null) {
                uvz0Var.b.d("calling onBinderDied", new Object[0]);
                xtz0Var.zza();
            } else {
                uvz0Var.b.d("%s : Binder has died.", uvz0Var.c);
                Iterator it = uvz0Var.d.iterator();
                while (it.hasNext()) {
                    ((xq01) it.next()).b(new RemoteException(String.valueOf(uvz0Var.c).concat(" : Binder has died.")));
                }
                uvz0Var.d.clear();
            }
            synchronized (uvz0Var.f) {
                uvz0Var.d();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "SplitInstallService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [xsna.cs01] */
    public uvz0(Context context, lq01 lq01Var, Intent intent) {
        this.a = context;
        this.b = lq01Var;
        this.h = intent;
    }

    public static /* bridge */ /* synthetic */ void b(uvz0 uvz0Var, xq01 xq01Var) {
        c401 c401Var = uvz0Var.m;
        lq01 lq01Var = uvz0Var.b;
        ArrayList arrayList = uvz0Var.d;
        if (c401Var != null || uvz0Var.g) {
            if (!uvz0Var.g) {
                xq01Var.run();
                return;
            } else {
                lq01Var.d("Waiting to bind to the service.", new Object[0]);
                arrayList.add(xq01Var);
                return;
            }
        }
        lq01Var.d("Initiate binding to the service.", new Object[0]);
        arrayList.add(xq01Var);
        rvz0 rvz0Var = new rvz0(uvz0Var);
        uvz0Var.l = rvz0Var;
        uvz0Var.g = true;
        if (uvz0Var.a.bindService(uvz0Var.h, rvz0Var, 1)) {
            return;
        }
        lq01Var.d("Failed to bind to the service.", new Object[0]);
        uvz0Var.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((xq01) it.next()).b(new zzag());
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
        a().post(new vs01(this));
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
