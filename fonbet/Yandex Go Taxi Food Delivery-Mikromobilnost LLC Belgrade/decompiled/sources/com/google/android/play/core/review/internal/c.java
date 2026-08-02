package com.google.android.play.core.review.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.atx0;
import defpackage.gaa1;
import defpackage.ny61;
import defpackage.zfa1;
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
    public final gaa1 b;
    public boolean g;
    public final Intent h;
    public ServiceConnection l;
    public zzf m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final zzk j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.review.internal.zzk
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            c cVar = c.this;
            cVar.b.a("reportBinderDeath", new Object[0]);
            if (cVar.i.get() != null) {
                ny61.u();
                return;
            }
            cVar.b.a("%s : Binder has died.", cVar.c);
            Iterator it = cVar.d.iterator();
            while (it.hasNext()) {
                zfa1 zfa1Var = (zfa1) it.next();
                RemoteException remoteException = new RemoteException(String.valueOf(cVar.c).concat(" : Binder has died."));
                atx0 atx0Var = zfa1Var.a;
                if (atx0Var != null) {
                    atx0Var.b(remoteException);
                }
            }
            cVar.d.clear();
            synchronized (cVar.f) {
                cVar.c();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.review.internal.zzk] */
    public c(Context context, gaa1 gaa1Var, Intent intent) {
        this.a = context;
        this.b = gaa1Var;
        this.h = intent;
    }

    public static void b(c cVar, com.google.android.play.core.review.b bVar) {
        zzf zzfVar = cVar.m;
        gaa1 gaa1Var = cVar.b;
        ArrayList arrayList = cVar.d;
        if (zzfVar != null || cVar.g) {
            if (!cVar.g) {
                bVar.run();
                return;
            } else {
                gaa1Var.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(bVar);
                return;
            }
        }
        gaa1Var.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(bVar);
        zzr zzrVar = new zzr(cVar, null);
        cVar.l = zzrVar;
        cVar.g = true;
        if (cVar.a.bindService(cVar.h, zzrVar, 1)) {
            return;
        }
        gaa1Var.a("Failed to bind to the service.", new Object[0]);
        cVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zfa1 zfa1Var = (zfa1) it.next();
            zzu zzuVar = new zzu();
            atx0 atx0Var = zfa1Var.a;
            if (atx0Var != null) {
                atx0Var.b(zzuVar);
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

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((atx0) it.next()).b(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
