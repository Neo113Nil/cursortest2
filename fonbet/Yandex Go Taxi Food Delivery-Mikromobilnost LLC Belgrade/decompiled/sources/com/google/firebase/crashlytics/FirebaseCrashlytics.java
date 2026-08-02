package com.google.firebase.crashlytics;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.a;
import defpackage.d1;
import defpackage.dkf;
import defpackage.iy2;
import defpackage.ny61;
import defpackage.t2f;
import defpackage.udq0;
import defpackage.v2f;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class FirebaseCrashlytics {
    public final v2f a;

    public FirebaseCrashlytics(v2f v2fVar) {
        this.a = v2fVar;
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) a.d().b(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        ny61.t("FirebaseCrashlytics component is not present.");
        return null;
    }

    public Task checkForUnsentReports() {
        com.google.firebase.crashlytics.internal.common.a aVar = this.a.h;
        return !aVar.r.compareAndSet(false, true) ? udq0.p(Boolean.FALSE) : aVar.o.a;
    }

    public void deleteUnsentReports() {
        com.google.firebase.crashlytics.internal.common.a aVar = this.a.h;
        aVar.p.c(Boolean.FALSE);
        zzw zzwVar = aVar.q.a;
    }

    public boolean didCrashOnPreviousExecution() {
        return this.a.g;
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.a.b.c();
    }

    public void log(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        v2f v2fVar = this.a;
        v2fVar.p.a.a(new t2f(v2fVar, currentTimeMillis - v2fVar.d, str));
    }

    public void recordException(Throwable th) {
        if (th == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        v2f v2fVar = this.a;
        v2fVar.p.a.a(new d1(v2fVar, th));
    }

    public void sendUnsentReports() {
        com.google.firebase.crashlytics.internal.common.a aVar = this.a.h;
        aVar.p.c(Boolean.TRUE);
        zzw zzwVar = aVar.q.a;
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.a.d(Boolean.valueOf(z));
    }

    public void setCustomKey(String str, boolean z) {
        this.a.e(str, Boolean.toString(z));
    }

    public void setCustomKeys(dkf dkfVar) {
        throw null;
    }

    public void setUserId(String str) {
        v2f v2fVar = this.a;
        v2fVar.p.a.a(new iy2(10, v2fVar, str));
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.a.d(bool);
    }

    public void setCustomKey(String str, double d) {
        this.a.e(str, Double.toString(d));
    }

    public void setCustomKey(String str, float f) {
        this.a.e(str, Float.toString(f));
    }

    public void setCustomKey(String str, int i) {
        this.a.e(str, Integer.toString(i));
    }

    public void setCustomKey(String str, long j) {
        this.a.e(str, Long.toString(j));
    }

    public void setCustomKey(String str, String str2) {
        this.a.e(str, str2);
    }

    public void recordException(Throwable th, dkf dkfVar) {
        if (th != null) {
            throw null;
        }
    }
}
