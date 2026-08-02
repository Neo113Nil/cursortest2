package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.common.base.Optional;
import defpackage.aaa1;
import defpackage.bh91;
import defpackage.cna1;
import defpackage.cvw;
import defpackage.d6z;
import defpackage.fz91;
import defpackage.hr91;
import defpackage.hva1;
import defpackage.i0a1;
import defpackage.ieb1;
import defpackage.j5b1;
import defpackage.j691;
import defpackage.jya1;
import defpackage.kl40;
import defpackage.lja1;
import defpackage.m8b1;
import defpackage.mha1;
import defpackage.nb51;
import defpackage.ny61;
import defpackage.o5a1;
import defpackage.opa1;
import defpackage.q891;
import defpackage.qka1;
import defpackage.r8;
import defpackage.rhw0;
import defpackage.rms;
import defpackage.sms;
import defpackage.t3c;
import defpackage.tha1;
import defpackage.tva1;
import defpackage.vw91;
import defpackage.y1a1;
import defpackage.yo40;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g implements tha1 {
    public static volatile g Z;
    public final m8b1 A;
    public final ieb1 B;
    public final i0a1 C;
    public final kl40 D;
    public final jya1 E;
    public final j F;
    public final bh91 G;
    public final hva1 H;
    public final String I;
    public c J;
    public j5b1 K;
    public q891 L;
    public fz91 M;
    public tva1 N;
    public Boolean P;
    public long Q;
    public volatile Boolean R;
    public volatile boolean S;
    public int T;
    public int U;
    public final long W;
    public final Context a;
    public final boolean b;
    public final rms c;
    public final j691 w;
    public final o5a1 x;
    public final y1a1 y;
    public final aaa1 z;
    public boolean O = false;
    public final AtomicInteger V = new AtomicInteger(0);

    public g(qka1 qka1Var) {
        Context context = qka1Var.a;
        rms rmsVar = new rms(15);
        this.c = rmsVar;
        d6z.e = rmsVar;
        this.a = context;
        this.b = qka1Var.e;
        this.R = qka1Var.b;
        this.I = qka1Var.g;
        int i = 1;
        this.S = true;
        if (cna1.h == null && context != null) {
            Object obj = cna1.g;
            synchronized (obj) {
                try {
                    if (cna1.h == null) {
                        synchronized (obj) {
                            lja1 lja1Var = cna1.h;
                            final Context applicationContext = context.getApplicationContext();
                            if (applicationContext == null) {
                                applicationContext = context;
                            }
                            if (lja1Var != null) {
                                if (lja1Var.a != applicationContext) {
                                }
                            }
                            if (lja1Var != null) {
                                t0.c();
                                opa1.a();
                                v0.c();
                            }
                            cna1.h = new lja1(applicationContext, com.google.common.base.c.a(new rhw0() { // from class: xoa1
                                /* JADX WARN: Can't wrap try/catch for region: R(19:8|(5:10|(1:12)|13|14|15)|16|(5:18|(1:20)|13|14|15)|21|(1:23)|24|25|26|27|28|29|30|(1:32)(1:79)|33|(9:35|36|37|38|39|(2:40|(3:42|(3:57|58|59)(7:44|45|(2:47|(1:50))|51|(1:53)|54|55)|56)(1:60))|61|62|63)(1:78)|64|14|15) */
                                /* JADX WARN: Code restructure failed: missing block: B:81:0x0073, code lost:
                                
                                    r3 = move-exception;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:82:0x0074, code lost:
                                
                                    android.util.Log.e("HermeticFileOverrides", "no data dir", r3);
                                    r3 = com.google.common.base.Optional.a();
                                 */
                                @Override // defpackage.rhw0
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object get() {
                                    Optional optional;
                                    StrictMode.ThreadPolicy allowThreadDiskReads;
                                    Optional a;
                                    Object obj2 = cna1.g;
                                    Context context2 = applicationContext;
                                    Optional optional2 = cma1.a;
                                    if (optional2 != null) {
                                        return optional2;
                                    }
                                    synchronized (cma1.class) {
                                        try {
                                            optional = cma1.a;
                                            if (optional == null) {
                                                String str = Build.TYPE;
                                                String str2 = Build.TAGS;
                                                w53 w53Var = wma1.a;
                                                if (!str.equals("eng")) {
                                                    if (str.equals("userdebug")) {
                                                    }
                                                    a = Optional.a();
                                                    optional = a;
                                                    cma1.a = optional;
                                                }
                                                if (!str2.contains("dev-keys")) {
                                                    if (str2.contains("test-keys")) {
                                                    }
                                                    a = Optional.a();
                                                    optional = a;
                                                    cma1.a = optional;
                                                }
                                                if (!context2.isDeviceProtectedStorage()) {
                                                    context2 = context2.createDeviceProtectedStorageContext();
                                                }
                                                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                                StrictMode.allowThreadDiskWrites();
                                                File file = new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                                                Optional a2 = file.exists() ? Optional.f(file) : Optional.a();
                                                if (a2.c()) {
                                                    File file2 = (File) a2.b();
                                                    try {
                                                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                                        try {
                                                            ycs0 ycs0Var = new ycs0();
                                                            HashMap hashMap = new HashMap();
                                                            while (true) {
                                                                String readLine = bufferedReader.readLine();
                                                                if (readLine == null) {
                                                                    break;
                                                                }
                                                                String[] split = readLine.split(" ", 3);
                                                                if (split.length != 3) {
                                                                    StringBuilder sb = new StringBuilder(readLine.length() + 9);
                                                                    sb.append("Invalid: ");
                                                                    sb.append(readLine);
                                                                    Log.e("HermeticFileOverrides", sb.toString());
                                                                } else {
                                                                    String str3 = new String(split[0]);
                                                                    String decode = Uri.decode(new String(split[1]));
                                                                    String str4 = (String) hashMap.get(split[2]);
                                                                    if (str4 == null) {
                                                                        String str5 = new String(split[2]);
                                                                        str4 = Uri.decode(str5);
                                                                        if (str4.length() < 1024 || str4 == str5) {
                                                                            hashMap.put(str5, str4);
                                                                        }
                                                                    }
                                                                    ycs0 ycs0Var2 = (ycs0) ycs0Var.get(str3);
                                                                    if (ycs0Var2 == null) {
                                                                        ycs0Var2 = new ycs0();
                                                                        ycs0Var.put(str3, ycs0Var2);
                                                                    }
                                                                    ycs0Var2.put(decode, str4);
                                                                }
                                                            }
                                                            new StringBuilder(file2.toString().length() + 28 + String.valueOf(context2.getPackageName()).length());
                                                            yka1 yka1Var = new yka1(ycs0Var);
                                                            bufferedReader.close();
                                                            a = Optional.f(yka1Var);
                                                        } finally {
                                                            try {
                                                                bufferedReader.close();
                                                            } catch (Throwable th) {
                                                                th.addSuppressed(th);
                                                            }
                                                        }
                                                    } catch (IOException e) {
                                                        throw new RuntimeException(e);
                                                    }
                                                } else {
                                                    a = Optional.a();
                                                }
                                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                                optional = a;
                                                cma1.a = optional;
                                            }
                                        } catch (Throwable th2) {
                                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                                            throw th2;
                                        } finally {
                                        }
                                    }
                                    return optional;
                                }
                            }));
                            cna1.i.incrementAndGet();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        this.D = kl40.w;
        Long l = qka1Var.f;
        this.W = l != null ? l.longValue() : System.currentTimeMillis();
        j691 j691Var = new j691(this);
        j691Var.x = sms.b;
        this.w = j691Var;
        o5a1 o5a1Var = new o5a1(this);
        o5a1Var.Jg();
        this.x = o5a1Var;
        y1a1 y1a1Var = new y1a1(this);
        y1a1Var.Jg();
        this.y = y1a1Var;
        ieb1 ieb1Var = new ieb1(this);
        ieb1Var.Jg();
        this.B = ieb1Var;
        this.C = new i0a1(new yo40(qka1Var, this));
        this.G = new bh91(this);
        jya1 jya1Var = new jya1(this);
        jya1Var.Ig();
        this.E = jya1Var;
        j jVar = new j(this);
        jVar.Ig();
        this.F = jVar;
        m8b1 m8b1Var = new m8b1(this);
        m8b1Var.Ig();
        this.A = m8b1Var;
        hva1 hva1Var = new hva1(this);
        hva1Var.Jg();
        this.H = hva1Var;
        aaa1 aaa1Var = new aaa1(this);
        aaa1Var.Jg();
        this.z = aaa1Var;
        zzdd zzddVar = qka1Var.d;
        boolean z = zzddVar == null || zzddVar.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            f(jVar);
            if (((g) jVar.b).a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((g) jVar.b).a.getApplicationContext();
                if (jVar.w == null) {
                    jVar.w = new zzky(jVar);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(jVar.w);
                    application.registerActivityLifecycleCallbacks(jVar.w);
                    y1a1 y1a1Var2 = ((g) jVar.b).y;
                    g(y1a1Var2);
                    y1a1Var2.H.a("Registered activity lifecycle callback");
                }
            }
        } else {
            g(y1a1Var);
            y1a1Var.C.a("Application context is not an Application");
        }
        aaa1Var.Pg(new f(i, this, qka1Var));
    }

    public static final void d(hr91 hr91Var) {
        if (hr91Var != null) {
            return;
        }
        ny61.r("Component not created");
    }

    public static final void e(r8 r8Var) {
        if (r8Var != null) {
            return;
        }
        ny61.r("Component not created");
    }

    public static final void f(vw91 vw91Var) {
        if (vw91Var == null) {
            ny61.r("Component not created");
        } else {
            if (vw91Var.c) {
                return;
            }
            ny61.r("Component not initialized: ".concat(String.valueOf(vw91Var.getClass())));
        }
    }

    public static final void g(mha1 mha1Var) {
        if (mha1Var == null) {
            ny61.r("Component not created");
        } else {
            if (mha1Var.c) {
                return;
            }
            ny61.r("Component not initialized: ".concat(String.valueOf(mha1Var.getClass())));
        }
    }

    public static g m(Context context, zzdd zzddVar, Long l) {
        Bundle bundle;
        if (zzddVar != null) {
            Bundle bundle2 = zzddVar.zzd;
            zzddVar = new zzdd(zzddVar.zza, zzddVar.zzb, zzddVar.zzc, bundle2, null);
        }
        cvw.l(context);
        cvw.l(context.getApplicationContext());
        if (Z == null) {
            synchronized (g.class) {
                try {
                    if (Z == null) {
                        Z = new g(new qka1(context, zzddVar, l));
                    }
                } finally {
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.zzd) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            cvw.l(Z);
            Z.R = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        cvw.l(Z);
        return Z;
    }

    @Override // defpackage.tha1
    public final y1a1 B0() {
        y1a1 y1a1Var = this.y;
        g(y1a1Var);
        return y1a1Var;
    }

    @Override // defpackage.tha1
    public final aaa1 M1() {
        aaa1 aaa1Var = this.z;
        g(aaa1Var);
        return aaa1Var;
    }

    @Override // defpackage.tha1
    public final Context N3() {
        return this.a;
    }

    @Override // defpackage.tha1
    public final rms Q2() {
        return this.c;
    }

    public final boolean a() {
        return b() == 0;
    }

    public final int b() {
        aaa1 aaa1Var = this.z;
        g(aaa1Var);
        aaa1Var.Gg();
        j691 j691Var = this.w;
        if (j691Var.Tg()) {
            return 1;
        }
        g(aaa1Var);
        aaa1Var.Gg();
        if (!this.S) {
            return 8;
        }
        o5a1 o5a1Var = this.x;
        e(o5a1Var);
        o5a1Var.Gg();
        Boolean valueOf = o5a1Var.Kg().contains("measurement_enabled") ? Boolean.valueOf(o5a1Var.Kg().getBoolean("measurement_enabled", true)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue() ? 0 : 3;
        }
        rms rmsVar = ((g) j691Var.b).c;
        Boolean Sg = j691Var.Sg("firebase_analytics_collection_enabled");
        return Sg != null ? Sg.booleanValue() ? 0 : 4 : (this.R == null || this.R.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r7.Q) > 1000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        boolean z = false;
        if (!this.O) {
            ny61.r("AppMeasurement is not initialized");
            return false;
        }
        aaa1 aaa1Var = this.z;
        g(aaa1Var);
        aaa1Var.Gg();
        Boolean bool = this.P;
        kl40 kl40Var = this.D;
        if (bool != null && this.Q != 0) {
            if (!bool.booleanValue()) {
                kl40Var.getClass();
            }
            return this.P.booleanValue();
        }
        kl40Var.getClass();
        this.Q = SystemClock.elapsedRealtime();
        ieb1 ieb1Var = this.B;
        e(ieb1Var);
        if (ieb1Var.ch("android.permission.INTERNET") && ieb1Var.ch("android.permission.ACCESS_NETWORK_STATE")) {
            Context context = this.a;
            if (nb51.a(context).e() || this.w.Jg() || (ieb1.vh(context) && ieb1.Zg(context))) {
                z = true;
            }
        }
        this.P = Boolean.valueOf(z);
        if (z) {
            this.P = Boolean.valueOf(ieb1Var.Kg(l().Ng()));
        }
        return this.P.booleanValue();
    }

    public final i0a1 h() {
        return this.C;
    }

    public final c i() {
        f(this.J);
        return this.J;
    }

    public final j5b1 j() {
        f(this.K);
        return this.K;
    }

    public final q891 k() {
        g(this.L);
        return this.L;
    }

    public final fz91 l() {
        f(this.M);
        return this.M;
    }

    @Override // defpackage.tha1
    public final t3c q4() {
        return this.D;
    }
}
