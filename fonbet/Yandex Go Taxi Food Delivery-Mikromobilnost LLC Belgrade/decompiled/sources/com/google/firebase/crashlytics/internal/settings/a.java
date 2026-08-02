package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import defpackage.atx0;
import defpackage.cjx;
import defpackage.gp50;
import defpackage.kl40;
import defpackage.m6r0;
import defpackage.q5z;
import defpackage.qc20;
import defpackage.t2x0;
import defpackage.tig0;
import defpackage.udq0;
import defpackage.uo2;
import defpackage.ycr0;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    public final Context a;
    public final ycr0 b;
    public final qc20 c;
    public final t2x0 d;
    public final gp50 e;
    public final cjx f;
    public final uo2 g;
    public final AtomicReference h;
    public final AtomicReference i;

    public a(Context context, ycr0 ycr0Var, t2x0 t2x0Var, qc20 qc20Var, gp50 gp50Var, cjx cjxVar, uo2 uo2Var) {
        AtomicReference atomicReference = new AtomicReference();
        this.h = atomicReference;
        this.i = new AtomicReference(new atx0());
        this.a = context;
        this.b = ycr0Var;
        this.d = t2x0Var;
        this.c = qc20Var;
        this.e = gp50Var;
        this.f = cjxVar;
        this.g = uo2Var;
        atomicReference.set(kl40.p(t2x0Var));
    }

    public final m6r0 a(SettingsCacheBehavior settingsCacheBehavior) {
        m6r0 m6r0Var = null;
        try {
            if (!SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                JSONObject L = this.e.L();
                if (L != null) {
                    m6r0 B = this.c.B(L);
                    L.toString();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    this.d.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) && B.c < currentTimeMillis) {
                        Log.isLoggable("FirebaseCrashlytics", 2);
                        return null;
                    }
                    try {
                        Log.isLoggable("FirebaseCrashlytics", 2);
                        return B;
                    } catch (Exception e) {
                        e = e;
                        m6r0Var = B;
                        Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                        return m6r0Var;
                    }
                }
                Log.isLoggable("FirebaseCrashlytics", 3);
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final m6r0 b() {
        return (m6r0) this.h.get();
    }

    public final Task c(com.google.firebase.crashlytics.internal.concurrency.a aVar) {
        zzw zzwVar;
        m6r0 a;
        SettingsCacheBehavior settingsCacheBehavior = SettingsCacheBehavior.USE_CACHE;
        AtomicReference atomicReference = this.i;
        AtomicReference atomicReference2 = this.h;
        if (this.a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(this.b.f) && (a = a(settingsCacheBehavior)) != null) {
            atomicReference2.set(a);
            ((atx0) atomicReference.get()).c(a);
            return udq0.p(null);
        }
        m6r0 a2 = a(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
        if (a2 != null) {
            atomicReference2.set(a2);
            ((atx0) atomicReference.get()).c(a2);
        }
        uo2 uo2Var = this.g;
        zzw zzwVar2 = ((atx0) uo2Var.z).a;
        synchronized (uo2Var.w) {
            zzwVar = ((atx0) uo2Var.x).a;
        }
        return q5z.V(zzwVar2, zzwVar).q(aVar.a, new tig0(this, aVar));
    }
}
