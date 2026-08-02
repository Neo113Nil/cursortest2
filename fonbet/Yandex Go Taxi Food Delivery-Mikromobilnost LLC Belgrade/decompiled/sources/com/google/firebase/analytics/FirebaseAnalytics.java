package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.firebase.installations.a;
import defpackage.cvw;
import defpackage.hcr;
import defpackage.kua1;
import defpackage.m391;
import defpackage.ny61;
import defpackage.qg91;
import defpackage.udq0;
import defpackage.yi91;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics c;
    public final e a;
    public m391 b;

    public FirebaseAnalytics(e eVar) {
        cvw.l(eVar);
        this.a = eVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (c == null) {
                        c = new FirebaseAnalytics(e.c(context, null));
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public static kua1 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        e c2 = e.c(context, bundle);
        if (c2 == null) {
            return null;
        }
        return new qg91(c2);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = a.m;
            return (String) udq0.g(((a) com.google.firebase.a.d().b(hcr.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            ny61.o(e);
            return null;
        } catch (ExecutionException e2) {
            ny61.o(e2.getCause());
            return null;
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        zzdf zza = zzdf.zza(activity);
        e eVar = this.a;
        eVar.getClass();
        eVar.a(new yi91(eVar, zza, str, str2));
    }
}
