package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.atx0;
import defpackage.cub1;
import defpackage.dwb1;
import defpackage.il0;
import defpackage.ny61;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public final class c {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final il0 b;
    public boolean g;
    public final Intent h;
    public ServiceConnection l;
    public zzbo m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final zzx j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.splitinstall.internal.zzx
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            c cVar = c.this;
            cVar.b.d("reportBinderDeath", new Object[0]);
            if (cVar.i.get() != null) {
                ny61.u();
                return;
            }
            cVar.b.d("%s : Binder has died.", cVar.c);
            Iterator it = cVar.d.iterator();
            while (it.hasNext()) {
                cub1 cub1Var = (cub1) it.next();
                RemoteException remoteException = new RemoteException(String.valueOf(cVar.c).concat(" : Binder has died."));
                atx0 atx0Var = cub1Var.a;
                if (atx0Var != null) {
                    atx0Var.b(remoteException);
                }
            }
            cVar.d.clear();
            synchronized (cVar.f) {
                cVar.d();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "SplitInstallService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.splitinstall.internal.zzx] */
    public c(Context context, il0 il0Var, Intent intent) {
        this.a = context;
        this.b = il0Var;
        this.h = intent;
    }

    public static void b(c cVar, cub1 cub1Var) {
        zzbo zzboVar = cVar.m;
        il0 il0Var = cVar.b;
        ArrayList arrayList = cVar.d;
        if (zzboVar != null || cVar.g) {
            if (!cVar.g) {
                cub1Var.run();
                return;
            } else {
                il0Var.d("Waiting to bind to the service.", new Object[0]);
                arrayList.add(cub1Var);
                return;
            }
        }
        il0Var.d("Initiate binding to the service.", new Object[0]);
        arrayList.add(cub1Var);
        zzae zzaeVar = new zzae(cVar, null);
        cVar.l = zzaeVar;
        cVar.g = true;
        if (cVar.a.bindService(cVar.h, zzaeVar, 1)) {
            return;
        }
        il0Var.d("Failed to bind to the service.", new Object[0]);
        cVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cub1 cub1Var2 = (cub1) it.next();
            zzag zzagVar = new zzag();
            atx0 atx0Var = cub1Var2.a;
            if (atx0Var != null) {
                atx0Var.b(zzagVar);
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

    public final void c(atx0 atx0Var) {
        synchronized (this.f) {
            this.e.remove(atx0Var);
        }
        a().post(new dwb1(this));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((atx0) it.next()).b(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
