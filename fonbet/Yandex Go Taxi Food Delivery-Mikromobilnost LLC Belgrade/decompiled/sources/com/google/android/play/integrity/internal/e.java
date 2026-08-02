package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.atx0;
import defpackage.gly0;
import defpackage.ny61;
import defpackage.sa81;
import defpackage.ue81;
import defpackage.vr81;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final sa81 b;
    public final String c;
    public final ArrayList d;
    public final HashSet e;
    public final Object f;
    public boolean g;
    public final Intent h;
    public final gly0 i;
    public final WeakReference j;
    public final u k;
    public final AtomicInteger l;
    public ServiceConnection m;
    public n n;

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.play.integrity.internal.u] */
    public e(Context context, sa81 sa81Var, Intent intent) {
        gly0 gly0Var = gly0.x;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = new Object();
        this.k = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.u
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                e eVar = e.this;
                eVar.b.a("reportBinderDeath", new Object[0]);
                if (eVar.j.get() != null) {
                    ny61.u();
                    return;
                }
                eVar.b.a("%s : Binder has died.", eVar.c);
                Iterator it = eVar.d.iterator();
                while (it.hasNext()) {
                    ((ue81) it.next()).a(new RemoteException(String.valueOf(eVar.c).concat(" : Binder has died.")));
                }
                eVar.d.clear();
                synchronized (eVar.f) {
                    eVar.d();
                }
            }
        };
        this.l = new AtomicInteger(0);
        this.a = context;
        this.b = sa81Var;
        this.c = "IntegrityService";
        this.h = intent;
        this.i = gly0Var;
        this.j = new WeakReference(null);
    }

    public static /* bridge */ /* synthetic */ void b(e eVar, com.google.android.play.core.integrity.a aVar) {
        n nVar = eVar.n;
        sa81 sa81Var = eVar.b;
        ArrayList arrayList = eVar.d;
        if (nVar != null || eVar.g) {
            if (!eVar.g) {
                aVar.run();
                return;
            } else {
                sa81Var.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(aVar);
                return;
            }
        }
        sa81Var.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(aVar);
        ad adVar = new ad(eVar, null);
        eVar.m = adVar;
        eVar.g = true;
        if (eVar.a.bindService(eVar.h, adVar, 1)) {
            return;
        }
        sa81Var.a("Failed to bind to the service.", new Object[0]);
        eVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ue81) it.next()).a(new af());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = o;
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
        a().post(new vr81(this));
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
