package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzdf;
import defpackage.aaa1;
import defpackage.bh91;
import defpackage.gra1;
import defpackage.h3s0;
import defpackage.jya1;
import defpackage.m8b1;
import defpackage.mbs;
import defpackage.obp0;
import defpackage.qwa1;
import defpackage.xsr;
import defpackage.y1a1;
import defpackage.z6b1;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzky implements Application.ActivityLifecycleCallbacks, gra1 {
    final /* synthetic */ j zza;

    public zzky(j jVar) {
        Objects.requireNonNull(jVar);
        this.zza = jVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(zzdf.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzb(zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzc(zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzd(zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zze(zzdf.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(13:24|25|26|(1:28)(1:54)|29|30|31|32|33|34|35|36|37)|33|34|35|36|37) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
    
        r7 = ((com.google.android.gms.measurement.internal.g) r2.zza.b).y;
        com.google.android.gms.measurement.internal.g.g(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        r7.z.b(r0, "Throwable caught in onActivityCreated");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0084  */
    @Override // defpackage.gra1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzdf zzdfVar, Bundle bundle) {
        zzky zzkyVar;
        g gVar;
        j jVar;
        g gVar2;
        Intent intent;
        Uri uri;
        String stringExtra;
        String str;
        try {
            jVar = this.zza;
        } catch (RuntimeException e) {
            e = e;
            zzkyVar = this;
        } catch (Throwable th) {
            th = th;
            zzkyVar = this;
            jya1 jya1Var = ((g) zzkyVar.zza.b).E;
            g.f(jya1Var);
            jya1Var.Og(zzdfVar, bundle);
            throw th;
        }
        try {
            gVar2 = (g) jVar.b;
            y1a1 y1a1Var = gVar2.y;
            g.g(y1a1Var);
            y1a1Var.H.a("onActivityCreated");
            intent = zzdfVar.zzc;
        } catch (RuntimeException e2) {
            e = e2;
            zzkyVar = this;
        } catch (Throwable th2) {
            th = th2;
            zzkyVar = this;
            jya1 jya1Var2 = ((g) zzkyVar.zza.b).E;
            g.f(jya1Var2);
            jya1Var2.Og(zzdfVar, bundle);
            throw th;
        }
        if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                if (!data.isHierarchical()) {
                }
                uri = data;
                if (uri != null && uri.isHierarchical()) {
                    g.e(gVar2.B);
                    stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    try {
                        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                            str = "auto";
                            String str2 = str;
                            String queryParameter = uri.getQueryParameter("referrer");
                            boolean z = bundle != null;
                            aaa1 aaa1Var = gVar2.z;
                            g.g(aaa1Var);
                            zzkyVar = this;
                            aaa1Var.Pg(new i(zzkyVar, z, uri, str2, queryParameter));
                            gVar = (g) zzkyVar.zza.b;
                            jya1 jya1Var3 = gVar.E;
                            g.f(jya1Var3);
                            jya1Var3.Og(zzdfVar, bundle);
                        }
                        aaa1Var.Pg(new i(zzkyVar, z, uri, str2, queryParameter));
                        gVar = (g) zzkyVar.zza.b;
                        jya1 jya1Var32 = gVar.E;
                        g.f(jya1Var32);
                        jya1Var32.Og(zzdfVar, bundle);
                    } catch (Throwable th3) {
                        th = th3;
                        jya1 jya1Var22 = ((g) zzkyVar.zza.b).E;
                        g.f(jya1Var22);
                        jya1Var22.Og(zzdfVar, bundle);
                        throw th;
                    }
                    str = "gs";
                    String str22 = str;
                    String queryParameter2 = uri.getQueryParameter("referrer");
                    boolean z2 = bundle != null;
                    aaa1 aaa1Var2 = gVar2.z;
                    g.g(aaa1Var2);
                    zzkyVar = this;
                }
            }
            Bundle extras = intent.getExtras();
            uri = null;
            if (extras != null) {
                String string = extras.getString("com.android.vending.referral_url");
                if (!TextUtils.isEmpty(string)) {
                    data = Uri.parse(string);
                    uri = data;
                }
            }
            if (uri != null) {
                g.e(gVar2.B);
                stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra)) {
                    str = "auto";
                    String str222 = str;
                    String queryParameter22 = uri.getQueryParameter("referrer");
                    boolean z22 = bundle != null;
                    aaa1 aaa1Var22 = gVar2.z;
                    g.g(aaa1Var22);
                    zzkyVar = this;
                    aaa1Var22.Pg(new i(zzkyVar, z22, uri, str222, queryParameter22));
                    gVar = (g) zzkyVar.zza.b;
                    jya1 jya1Var322 = gVar.E;
                    g.f(jya1Var322);
                    jya1Var322.Og(zzdfVar, bundle);
                }
                str = "gs";
                String str2222 = str;
                String queryParameter222 = uri.getQueryParameter("referrer");
                boolean z222 = bundle != null;
                aaa1 aaa1Var222 = gVar2.z;
                g.g(aaa1Var222);
                zzkyVar = this;
                aaa1Var222.Pg(new i(zzkyVar, z222, uri, str2222, queryParameter222));
                gVar = (g) zzkyVar.zza.b;
                jya1 jya1Var3222 = gVar.E;
                g.f(jya1Var3222);
                jya1Var3222.Og(zzdfVar, bundle);
            }
        }
        gVar = (g) jVar.b;
        jya1 jya1Var32222 = gVar.E;
        g.f(jya1Var32222);
        jya1Var32222.Og(zzdfVar, bundle);
    }

    @Override // defpackage.gra1
    public final void zzb(zzdf zzdfVar) {
        jya1 jya1Var = ((g) this.zza.b).E;
        g.f(jya1Var);
        synchronized (jya1Var.F) {
            try {
                if (Objects.equals(jya1Var.A, zzdfVar)) {
                    jya1Var.A = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((g) jya1Var.b).w.Ug()) {
            jya1Var.z.remove(Integer.valueOf(zzdfVar.zza));
        }
    }

    @Override // defpackage.gra1
    public final void zzc(zzdf zzdfVar) {
        g gVar = (g) this.zza.b;
        jya1 jya1Var = gVar.E;
        g.f(jya1Var);
        synchronized (jya1Var.F) {
            jya1Var.E = false;
            jya1Var.B = true;
        }
        g gVar2 = (g) jya1Var.b;
        gVar2.D.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (gVar2.w.Ug()) {
            qwa1 Lg = jya1Var.Lg(zzdfVar);
            jya1Var.x = jya1Var.w;
            jya1Var.w = null;
            aaa1 aaa1Var = gVar2.z;
            g.g(aaa1Var);
            aaa1Var.Pg(new obp0(jya1Var, Lg, elapsedRealtime));
        } else {
            jya1Var.w = null;
            aaa1 aaa1Var2 = gVar2.z;
            g.g(aaa1Var2);
            aaa1Var2.Pg(new xsr(jya1Var, elapsedRealtime));
        }
        m8b1 m8b1Var = gVar.A;
        g.f(m8b1Var);
        g gVar3 = (g) m8b1Var.b;
        gVar3.D.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        aaa1 aaa1Var3 = gVar3.z;
        g.g(aaa1Var3);
        aaa1Var3.Pg(new z6b1(m8b1Var, elapsedRealtime2, 1));
    }

    @Override // defpackage.gra1
    public final void zzd(zzdf zzdfVar) {
        g gVar = (g) this.zza.b;
        m8b1 m8b1Var = gVar.A;
        g.f(m8b1Var);
        g gVar2 = (g) m8b1Var.b;
        gVar2.D.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aaa1 aaa1Var = gVar2.z;
        g.g(aaa1Var);
        aaa1Var.Pg(new z6b1(m8b1Var, elapsedRealtime, 0));
        jya1 jya1Var = gVar.E;
        g.f(jya1Var);
        Object obj = jya1Var.F;
        synchronized (obj) {
            jya1Var.E = true;
            if (!Objects.equals(zzdfVar, jya1Var.A)) {
                synchronized (obj) {
                    jya1Var.A = zzdfVar;
                    jya1Var.B = false;
                    g gVar3 = (g) jya1Var.b;
                    if (gVar3.w.Ug()) {
                        jya1Var.C = null;
                        aaa1 aaa1Var2 = gVar3.z;
                        g.g(aaa1Var2);
                        aaa1Var2.Pg(new mbs(jya1Var));
                    }
                }
            }
        }
        g gVar4 = (g) jya1Var.b;
        if (!gVar4.w.Ug()) {
            jya1Var.w = jya1Var.C;
            aaa1 aaa1Var3 = gVar4.z;
            g.g(aaa1Var3);
            aaa1Var3.Pg(new h3s0(jya1Var));
            return;
        }
        jya1Var.Pg(zzdfVar.zzb, jya1Var.Lg(zzdfVar), false);
        bh91 bh91Var = ((g) jya1Var.b).G;
        g.d(bh91Var);
        g gVar5 = (g) bh91Var.b;
        gVar5.D.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        aaa1 aaa1Var4 = gVar5.z;
        g.g(aaa1Var4);
        aaa1Var4.Pg(new z6b1(bh91Var, elapsedRealtime2));
    }

    @Override // defpackage.gra1
    public final void zze(zzdf zzdfVar, Bundle bundle) {
        qwa1 qwa1Var;
        jya1 jya1Var = ((g) this.zza.b).E;
        g.f(jya1Var);
        if (!((g) jya1Var.b).w.Ug() || bundle == null || (qwa1Var = (qwa1) jya1Var.z.get(Integer.valueOf(zzdfVar.zza))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", qwa1Var.c);
        bundle2.putString("name", qwa1Var.a);
        bundle2.putString("referrer_name", qwa1Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }
}
