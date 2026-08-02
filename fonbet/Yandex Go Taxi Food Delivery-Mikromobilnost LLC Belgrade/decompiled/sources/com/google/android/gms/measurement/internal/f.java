package com.google.android.gms.measurement.internal;

import android.app.job.JobScheduler;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzin;
import defpackage.aaa1;
import defpackage.cla1;
import defpackage.cvw;
import defpackage.eib1;
import defpackage.fz91;
import defpackage.ieb1;
import defpackage.j5b1;
import defpackage.j691;
import defpackage.jcp;
import defpackage.l1a1;
import defpackage.lxj;
import defpackage.m8b1;
import defpackage.nb51;
import defpackage.nw91;
import defpackage.ny61;
import defpackage.o5a1;
import defpackage.oo31;
import defpackage.q3w;
import defpackage.q891;
import defpackage.qka1;
import defpackage.qke;
import defpackage.svb1;
import defpackage.tva1;
import defpackage.u4a1;
import defpackage.udq0;
import defpackage.vma1;
import defpackage.w1l;
import defpackage.wia1;
import defpackage.x791;
import defpackage.y1a1;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0434, code lost:
    
        if (r13.ah() == 1) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0573 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0597 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x028c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0292 A[Catch: IllegalStateException -> 0x02a2, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x02a2, blocks: (B:54:0x0280, B:57:0x028e, B:59:0x0292), top: B:53:0x0280 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0363  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        fz91 fz91Var;
        String str;
        PackageManager packageManager;
        String str2;
        String str3;
        int i;
        String str4;
        int b;
        Bundle Rg;
        Integer valueOf;
        String[] stringArray;
        List<String> asList;
        tva1 tva1Var;
        g gVar;
        zzji Vg;
        zzji zzjiVar;
        g gVar2;
        l1a1 l1a1Var;
        wia1 wia1Var;
        g gVar3;
        zzji Vg2;
        zzji Vg3;
        Bundle bundle;
        Iterator it;
        Boolean Sg;
        u4a1 u4a1Var;
        svb1 svb1Var;
        g gVar4;
        lxj lxjVar;
        y1a1 y1a1Var;
        l1a1 l1a1Var2;
        String Y;
        switch (this.a) {
            case 0:
                j5b1 j = ((AppMeasurementDynamiteService) this.c).zza.j();
                zzcu zzcuVar = (zzcu) this.b;
                j.Gg();
                j.Hg();
                j.Ug(new w1l(5, j, j.Wg(false), zzcuVar));
                return;
            case 1:
                g gVar5 = (g) this.c;
                qka1 qka1Var = (qka1) this.b;
                aaa1 aaa1Var = gVar5.z;
                y1a1 y1a1Var2 = gVar5.y;
                o5a1 o5a1Var = gVar5.x;
                ieb1 ieb1Var = gVar5.B;
                g.g(aaa1Var);
                aaa1Var.Gg();
                j691 j691Var = gVar5.w;
                ((g) j691Var.b).getClass();
                q891 q891Var = new q891(gVar5);
                q891Var.Jg();
                gVar5.L = q891Var;
                zzdd zzddVar = qka1Var.d;
                fz91 fz91Var2 = new fz91(gVar5, qka1Var.c, zzddVar == null ? 0L : zzddVar.zza);
                fz91Var2.Ig();
                gVar5.M = fz91Var2;
                c cVar = new c(gVar5);
                cVar.Ig();
                gVar5.J = cVar;
                j5b1 j5b1Var = new j5b1(gVar5);
                j5b1Var.Ig();
                gVar5.K = j5b1Var;
                boolean z = ieb1Var.c;
                g gVar6 = (g) ieb1Var.b;
                if (z) {
                    ny61.r("Can't initialize twice");
                    return;
                }
                ieb1Var.Gg();
                SecureRandom secureRandom = new SecureRandom();
                long nextLong = secureRandom.nextLong();
                if (nextLong == 0) {
                    nextLong = secureRandom.nextLong();
                    if (nextLong == 0) {
                        y1a1 y1a1Var3 = ((g) ieb1Var.b).y;
                        g.g(y1a1Var3);
                        y1a1Var3.C.a("Utils falling back to Random for random id");
                    }
                }
                ieb1Var.x.set(nextLong);
                gVar6.V.incrementAndGet();
                ieb1Var.c = true;
                if (o5a1Var.c) {
                    ny61.r("Can't initialize twice");
                    return;
                }
                SharedPreferences sharedPreferences = ((g) o5a1Var.b).a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                o5a1Var.w = sharedPreferences;
                boolean z2 = sharedPreferences.getBoolean("has_been_opened", false);
                o5a1Var.L = z2;
                if (!z2) {
                    oo31.n(o5a1Var.w, "has_been_opened", true);
                }
                o5a1Var.y = new jcp(o5a1Var, Math.max(0L, ((Long) nw91.d.a(null)).longValue()));
                ((g) o5a1Var.b).V.incrementAndGet();
                o5a1Var.c = true;
                fz91 fz91Var3 = gVar5.M;
                if (fz91Var3.c) {
                    ny61.r("Can't initialize twice");
                    return;
                }
                String str5 = "";
                g gVar7 = (g) fz91Var3.b;
                y1a1 y1a1Var4 = gVar7.y;
                y1a1 y1a1Var5 = gVar7.y;
                g.g(y1a1Var4);
                y1a1Var4.H.c("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(fz91Var3.D), Long.valueOf(fz91Var3.C));
                Context context = gVar7.a;
                String packageName = context.getPackageName();
                PackageManager packageManager2 = context.getPackageManager();
                if (packageManager2 == null) {
                    g.g(y1a1Var5);
                    fz91Var = fz91Var2;
                    y1a1Var5.z.b(y1a1.Og(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
                    str3 = "Unknown";
                    str4 = str3;
                    str = "unknown";
                    packageManager = packageManager2;
                    i = Integer.MIN_VALUE;
                } else {
                    fz91Var = fz91Var2;
                    String str6 = "Unknown";
                    try {
                        str = packageManager2.getInstallerPackageName(packageName);
                    } catch (IllegalArgumentException unused) {
                        g.g(y1a1Var5);
                        y1a1Var5.z.b(y1a1.Og(packageName), "Error retrieving app installer package name. appId");
                        str = "unknown";
                    }
                    if (str == null) {
                        str = "manual_install";
                    } else if ("com.android.vending".equals(str)) {
                        str = "";
                    }
                    try {
                        PackageInfo packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager2.getApplicationLabel(packageInfo.applicationInfo);
                            str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : str6;
                            packageManager = packageManager2;
                            try {
                                String str7 = packageInfo.versionName;
                                try {
                                    i = packageInfo.versionCode;
                                    str3 = str2;
                                    str4 = str7;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    str6 = str7;
                                    g.g(y1a1Var5);
                                    y1a1Var5.z.c("Error retrieving package info. appId, appName", y1a1.Og(packageName), str2);
                                    str3 = str2;
                                    i = Integer.MIN_VALUE;
                                    str4 = str6;
                                    str = str;
                                    fz91Var3.w = packageName;
                                    fz91Var3.z = str;
                                    fz91Var3.x = str4;
                                    fz91Var3.y = i;
                                    fz91Var3.A = str3;
                                    fz91Var3.B = 0L;
                                    b = gVar7.b();
                                    if (b != 0) {
                                    }
                                    fz91Var3.H = "";
                                    Y = udq0.Y(context, gVar7.I);
                                    if (TextUtils.isEmpty(Y)) {
                                    }
                                    fz91Var3.H = str5;
                                    if (b == 0) {
                                    }
                                    fz91Var3.E = null;
                                    j691 j691Var2 = gVar7.w;
                                    g gVar8 = (g) j691Var2.b;
                                    cvw.i("analytics.safelisted_events");
                                    Rg = j691Var2.Rg();
                                    if (Rg != null) {
                                    }
                                    valueOf = null;
                                    if (valueOf != null) {
                                    }
                                    asList = null;
                                    if (asList != null) {
                                    }
                                    fz91Var3.E = asList;
                                    if (packageManager != null) {
                                    }
                                    ((g) fz91Var3.b).V.incrementAndGet();
                                    fz91Var3.c = true;
                                    tva1Var = new tva1(gVar5);
                                    tva1Var.Ig();
                                    gVar5.N = tva1Var;
                                    if (tva1Var.c) {
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        } else {
                            packageManager = packageManager2;
                            i = Integer.MIN_VALUE;
                            str3 = str6;
                            str4 = str3;
                        }
                    } catch (PackageManager.NameNotFoundException unused4) {
                        packageManager = packageManager2;
                        str2 = str6;
                    }
                }
                fz91Var3.w = packageName;
                fz91Var3.z = str;
                fz91Var3.x = str4;
                fz91Var3.y = i;
                fz91Var3.A = str3;
                fz91Var3.B = 0L;
                b = gVar7.b();
                if (b != 0) {
                    g.g(y1a1Var5);
                    y1a1Var5.H.a("App measurement collection enabled");
                } else if (b == 1) {
                    g.g(y1a1Var5);
                    y1a1Var5.F.a("App measurement deactivated via the manifest");
                } else if (b == 3) {
                    g.g(y1a1Var5);
                    y1a1Var5.F.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (b == 4) {
                    g.g(y1a1Var5);
                    y1a1Var5.F.a("App measurement disabled via the manifest");
                } else if (b == 6) {
                    g.g(y1a1Var5);
                    y1a1Var5.E.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (b == 7) {
                    g.g(y1a1Var5);
                    y1a1Var5.F.a("App measurement disabled via the global data collection setting");
                } else if (b != 8) {
                    g.g(y1a1Var5);
                    y1a1Var5.F.a("App measurement disabled");
                    g.g(y1a1Var5);
                    y1a1Var5.A.a("Invalid scion state in identity");
                } else {
                    g.g(y1a1Var5);
                    y1a1Var5.F.a("App measurement disabled due to denied storage consent");
                }
                fz91Var3.H = "";
                try {
                    Y = udq0.Y(context, gVar7.I);
                    if (TextUtils.isEmpty(Y)) {
                        str5 = Y;
                    }
                    fz91Var3.H = str5;
                    if (b == 0) {
                        g.g(y1a1Var5);
                        y1a1Var5.H.c("App measurement enabled for app package, google app id", fz91Var3.w, fz91Var3.H);
                    }
                } catch (IllegalStateException e) {
                    g.g(y1a1Var5);
                    y1a1Var5.z.c("Fetching Google App Id failed with exception. appId", y1a1.Og(packageName), e);
                }
                fz91Var3.E = null;
                j691 j691Var22 = gVar7.w;
                g gVar82 = (g) j691Var22.b;
                cvw.i("analytics.safelisted_events");
                Rg = j691Var22.Rg();
                if (Rg != null) {
                    y1a1 y1a1Var6 = gVar82.y;
                    g.g(y1a1Var6);
                    y1a1Var6.z.a("Failed to load metadata: Metadata bundle is null");
                } else if (Rg.containsKey("analytics.safelisted_events")) {
                    valueOf = Integer.valueOf(Rg.getInt("analytics.safelisted_events"));
                    if (valueOf != null) {
                        try {
                            stringArray = gVar82.a.getResources().getStringArray(valueOf.intValue());
                        } catch (Resources.NotFoundException e2) {
                            y1a1 y1a1Var7 = gVar82.y;
                            g.g(y1a1Var7);
                            y1a1Var7.z.b(e2, "Failed to load string array from metadata: resource not found");
                        }
                        if (stringArray != null) {
                            asList = Arrays.asList(stringArray);
                            if (asList != null) {
                                if (asList.isEmpty()) {
                                    g.g(y1a1Var5);
                                    y1a1Var5.E.a("Safelisted event list is empty. Ignoring");
                                } else {
                                    for (String str8 : asList) {
                                        ieb1 ieb1Var2 = gVar7.B;
                                        g.e(ieb1Var2);
                                        if (!ieb1Var2.Gh("safelisted event", str8)) {
                                        }
                                    }
                                }
                                if (packageManager != null) {
                                    fz91Var3.G = q3w.a(context) ? 1 : 0;
                                } else {
                                    fz91Var3.G = 0;
                                }
                                ((g) fz91Var3.b).V.incrementAndGet();
                                fz91Var3.c = true;
                                tva1Var = new tva1(gVar5);
                                tva1Var.Ig();
                                gVar5.N = tva1Var;
                                if (tva1Var.c) {
                                    ny61.r("Can't initialize twice");
                                    return;
                                }
                                tva1Var.w = (JobScheduler) ((g) tva1Var.b).a.getSystemService("jobscheduler");
                                ((g) tva1Var.b).V.incrementAndGet();
                                tva1Var.c = true;
                                g.g(y1a1Var2);
                                l1a1 l1a1Var3 = y1a1Var2.G;
                                l1a1 l1a1Var4 = y1a1Var2.F;
                                l1a1 l1a1Var5 = y1a1Var2.H;
                                l1a1 l1a1Var6 = y1a1Var2.z;
                                j691Var.Lg();
                                l1a1Var4.b(133005L, "App measurement initialized, version");
                                g.g(y1a1Var2);
                                l1a1Var4.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                String Mg = fz91Var.Mg();
                                if (ieb1Var.fh(Mg, j691Var.w)) {
                                    g.g(y1a1Var2);
                                    l1a1Var4.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                } else {
                                    g.g(y1a1Var2);
                                    l1a1Var4.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(Mg)));
                                }
                                g.g(y1a1Var2);
                                l1a1Var3.a("Debug-level message logging enabled");
                                int i2 = gVar5.T;
                                AtomicInteger atomicInteger = gVar5.V;
                                if (i2 != atomicInteger.get()) {
                                    g.g(y1a1Var2);
                                    l1a1Var6.c("Not all components initialized", Integer.valueOf(gVar5.T), Integer.valueOf(atomicInteger.get()));
                                }
                                gVar5.O = true;
                                long j2 = gVar5.W;
                                final j jVar = gVar5.F;
                                aaa1 aaa1Var2 = gVar5.z;
                                g.g(aaa1Var2);
                                aaa1Var2.Gg();
                                g.d(gVar5.N);
                                zzin Lg = gVar5.N.Lg();
                                zzin zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
                                eib1.a();
                                boolean Qg = j691Var.Qg(null, nw91.Q0);
                                boolean z3 = Lg == zzinVar;
                                if (Qg) {
                                    ieb1Var.Gg();
                                    break;
                                }
                                if (z3) {
                                    z3 = true;
                                    ieb1Var.Gg();
                                    IntentFilter intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    boolean z4 = z3;
                                    qke.z(gVar6.a, new zzw(gVar6), intentFilter, 2);
                                    y1a1 y1a1Var8 = gVar6.y;
                                    g.g(y1a1Var8);
                                    y1a1Var8.G.a("Registered app receiver");
                                    if (z4) {
                                        g.d(gVar5.N);
                                        gVar = gVar6;
                                        gVar5.N.Kg(((Long) nw91.C.a(null)).longValue());
                                        lxj lxjVar2 = o5a1Var.A;
                                        wia1 Ng = o5a1Var.Ng();
                                        int i3 = Ng.b;
                                        Vg = j691Var.Vg("google_analytics_default_allow_ad_storage", false);
                                        g gVar9 = gVar;
                                        zzji Vg4 = j691Var.Vg("google_analytics_default_allow_analytics_storage", false);
                                        zzjiVar = zzji.UNINITIALIZED;
                                        if (Vg == zzjiVar || Vg4 != zzjiVar) {
                                            gVar2 = gVar5;
                                            l1a1Var = l1a1Var6;
                                            if (wia1.l(-10, o5a1Var.Kg().getInt("consent_source", 100))) {
                                                EnumMap enumMap = new EnumMap(zzjk.class);
                                                enumMap.put((EnumMap) zzjk.AD_STORAGE, (zzjk) Vg);
                                                enumMap.put((EnumMap) zzjk.ANALYTICS_STORAGE, (zzjk) Vg4);
                                                wia1Var = new wia1(enumMap, -10);
                                                if (wia1Var != null) {
                                                    g.f(jVar);
                                                    jVar.ch(wia1Var, true);
                                                } else {
                                                    wia1Var = Ng;
                                                }
                                                g.f(jVar);
                                                gVar3 = (g) jVar.b;
                                                jVar.Kg(wia1Var);
                                                o5a1Var.Gg();
                                                int i4 = x791.b(o5a1Var.Kg().getString("dma_consent_settings", null)).a;
                                                Vg2 = j691Var.Vg("google_analytics_default_allow_ad_personalization_signals", true);
                                                if (Vg2 != zzjiVar) {
                                                    g.g(y1a1Var2);
                                                    l1a1Var5.b(Vg2, "Default ad personalization consent from Manifest");
                                                }
                                                Vg3 = j691Var.Vg("google_analytics_default_allow_ad_user_data", true);
                                                if (Vg3 == zzjiVar && wia1.l(-10, i4)) {
                                                    g.f(jVar);
                                                    EnumMap enumMap2 = new EnumMap(zzjk.class);
                                                    enumMap2.put((EnumMap) zzjk.AD_USER_DATA, (zzjk) Vg3);
                                                    jVar.bh(new x791(enumMap2, -10, (Boolean) null, (String) null), true);
                                                } else if (TextUtils.isEmpty(gVar2.l().Ng()) && (i4 == 0 || i4 == 30)) {
                                                    g.f(jVar);
                                                    jVar.bh(new x791((Boolean) null, -10, (Boolean) null, (String) null), true);
                                                } else if (TextUtils.isEmpty(gVar2.l().Ng()) && zzddVar != null && (bundle = zzddVar.zzd) != null && wia1.l(30, i4)) {
                                                    x791 c = x791.c(30, bundle);
                                                    it = c.e.values().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            if (((zzji) it.next()) != zzji.UNINITIALIZED) {
                                                                g.f(jVar);
                                                                jVar.bh(c, true);
                                                            }
                                                        }
                                                    }
                                                }
                                                Sg = j691Var.Sg("google_analytics_tcf_data_enabled");
                                                if (Sg != null || Sg.booleanValue()) {
                                                    g.g(y1a1Var2);
                                                    l1a1Var3.a("TCF client enabled.");
                                                    g.f(jVar);
                                                    jVar.Gg();
                                                    y1a1 y1a1Var9 = gVar3.y;
                                                    g.g(y1a1Var9);
                                                    y1a1Var9.G.a("Register tcfPrefChangeListener.");
                                                    if (jVar.O == null) {
                                                        jVar.P = new vma1(jVar, gVar3, 0);
                                                        jVar.O = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str9) {
                                                                j jVar2 = j.this;
                                                                g gVar10 = (g) jVar2.b;
                                                                j691 j691Var3 = gVar10.w;
                                                                y1a1 y1a1Var10 = gVar10.y;
                                                                if (!j691Var3.Qg(null, nw91.Z0)) {
                                                                    if (Objects.equals(str9, "IABTCF_TCString")) {
                                                                        g.g(y1a1Var10);
                                                                        y1a1Var10.H.a("IABTCF_TCString change picked up in listener.");
                                                                        vma1 vma1Var = jVar2.P;
                                                                        cvw.l(vma1Var);
                                                                        vma1Var.b(500L);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                                    g.g(y1a1Var10);
                                                                    y1a1Var10.H.a("IABTCF_TCString change picked up in listener.");
                                                                    vma1 vma1Var2 = jVar2.P;
                                                                    cvw.l(vma1Var2);
                                                                    vma1Var2.b(500L);
                                                                }
                                                            }
                                                        };
                                                    }
                                                    o5a1 o5a1Var2 = gVar3.x;
                                                    g.e(o5a1Var2);
                                                    o5a1Var2.Lg().registerOnSharedPreferenceChangeListener(jVar.O);
                                                    g.f(jVar);
                                                    jVar.Mg();
                                                }
                                                u4a1Var = o5a1Var.z;
                                                if (u4a1Var.a() == 0) {
                                                    g.g(y1a1Var2);
                                                    l1a1Var5.b(Long.valueOf(j2), "Persisting first open");
                                                    u4a1Var.b(j2);
                                                }
                                                g.f(jVar);
                                                svb1Var = jVar.L;
                                                if (svb1Var.d() && svb1Var.c()) {
                                                    o5a1 o5a1Var3 = ((g) svb1Var.a).x;
                                                    g.e(o5a1Var3);
                                                    o5a1Var3.Q.p(null);
                                                }
                                                if (gVar2.c()) {
                                                    gVar4 = gVar2;
                                                    if (TextUtils.isEmpty(gVar4.l().Ng())) {
                                                        lxjVar = lxjVar2;
                                                    } else {
                                                        String Ng2 = gVar4.l().Ng();
                                                        o5a1Var.Gg();
                                                        String string = o5a1Var.Kg().getString("gmp_app_id", null);
                                                        boolean isEmpty = TextUtils.isEmpty(Ng2);
                                                        boolean isEmpty2 = TextUtils.isEmpty(string);
                                                        if (!isEmpty && !isEmpty2) {
                                                            cvw.l(Ng2);
                                                            if (!Ng2.equals(string)) {
                                                                g.g(y1a1Var2);
                                                                l1a1Var4.a("Rechecking which service to use due to a GMP App Id change");
                                                                o5a1Var.Gg();
                                                                o5a1Var.Gg();
                                                                Boolean valueOf2 = o5a1Var.Kg().contains("measurement_enabled") ? Boolean.valueOf(o5a1Var.Kg().getBoolean("measurement_enabled", true)) : null;
                                                                SharedPreferences.Editor edit = o5a1Var.Kg().edit();
                                                                edit.clear();
                                                                edit.apply();
                                                                if (valueOf2 != null) {
                                                                    o5a1Var.Gg();
                                                                    SharedPreferences.Editor edit2 = o5a1Var.Kg().edit();
                                                                    edit2.putBoolean("measurement_enabled", valueOf2.booleanValue());
                                                                    edit2.apply();
                                                                }
                                                                gVar4.i().Kg();
                                                                gVar4.K.Og();
                                                                gVar4.K.Mg();
                                                                u4a1Var.b(j2);
                                                                lxjVar = lxjVar2;
                                                                lxjVar.p(null);
                                                                String Ng3 = gVar4.l().Ng();
                                                                o5a1Var.Gg();
                                                                SharedPreferences.Editor edit3 = o5a1Var.Kg().edit();
                                                                edit3.putString("gmp_app_id", Ng3);
                                                                edit3.apply();
                                                            }
                                                        }
                                                        lxjVar = lxjVar2;
                                                        String Ng32 = gVar4.l().Ng();
                                                        o5a1Var.Gg();
                                                        SharedPreferences.Editor edit32 = o5a1Var.Kg().edit();
                                                        edit32.putString("gmp_app_id", Ng32);
                                                        edit32.apply();
                                                    }
                                                    if (!o5a1Var.Ng().i(zzjk.ANALYTICS_STORAGE)) {
                                                        lxjVar.p(null);
                                                    }
                                                    g.f(jVar);
                                                    jVar.A.set(lxjVar.o());
                                                    try {
                                                        gVar9.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                                    } catch (ClassNotFoundException unused5) {
                                                        lxj lxjVar3 = o5a1Var.P;
                                                        if (!TextUtils.isEmpty(lxjVar3.o())) {
                                                            g.g(y1a1Var2);
                                                            y1a1Var = y1a1Var2;
                                                            y1a1Var.C.a("Remote config removed with active feature rollouts");
                                                            lxjVar3.p(null);
                                                        }
                                                    }
                                                    y1a1Var = y1a1Var2;
                                                    if (!TextUtils.isEmpty(gVar4.l().Ng())) {
                                                        boolean a = gVar4.a();
                                                        SharedPreferences sharedPreferences2 = o5a1Var.w;
                                                        if (!(sharedPreferences2 == null ? false : sharedPreferences2.contains("deferred_analytics_collection")) && !j691Var.Tg()) {
                                                            o5a1Var.Pg(!a);
                                                        }
                                                        if (a) {
                                                            g.f(jVar);
                                                            jVar.Sg();
                                                        }
                                                        m8b1 m8b1Var = gVar4.A;
                                                        g.f(m8b1Var);
                                                        m8b1Var.y.b();
                                                        gVar4.j().Kg(new AtomicReference());
                                                        gVar4.j().Lg(o5a1Var.S.D());
                                                    }
                                                } else {
                                                    if (gVar2.a()) {
                                                        if (ieb1Var.ch("android.permission.INTERNET")) {
                                                            l1a1Var2 = l1a1Var;
                                                        } else {
                                                            g.g(y1a1Var2);
                                                            l1a1Var2 = l1a1Var;
                                                            l1a1Var2.a("App is missing INTERNET permission");
                                                        }
                                                        if (!ieb1Var.ch("android.permission.ACCESS_NETWORK_STATE")) {
                                                            g.g(y1a1Var2);
                                                            l1a1Var2.a("App is missing ACCESS_NETWORK_STATE permission");
                                                        }
                                                        gVar4 = gVar2;
                                                        Context context2 = gVar4.a;
                                                        if (!nb51.a(context2).e() && !j691Var.Jg()) {
                                                            if (!ieb1.vh(context2)) {
                                                                g.g(y1a1Var2);
                                                                l1a1Var2.a("AppMeasurementReceiver not registered/enabled");
                                                            }
                                                            if (!ieb1.Zg(context2)) {
                                                                g.g(y1a1Var2);
                                                                l1a1Var2.a("AppMeasurementService not registered/enabled");
                                                            }
                                                        }
                                                        g.g(y1a1Var2);
                                                        l1a1Var2.a("Uploading is not possible. App measurement disabled");
                                                    } else {
                                                        gVar4 = gVar2;
                                                    }
                                                    y1a1Var = y1a1Var2;
                                                }
                                                eib1.a();
                                                if (j691Var.Qg(null, nw91.Q0)) {
                                                    ieb1Var.Gg();
                                                    if (ieb1Var.ah() == 1) {
                                                        long intValue = ((Integer) nw91.x0.a(null)).intValue();
                                                        long nextInt = new Random().nextInt(5000);
                                                        gVar4.D.getClass();
                                                        long max = Math.max(500L, ((intValue * 1000) + nextInt) - SystemClock.elapsedRealtime());
                                                        if (max > 500) {
                                                            g.g(y1a1Var);
                                                            l1a1Var5.b(Long.valueOf(max), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                        }
                                                        g.f(jVar);
                                                        jVar.Gg();
                                                        if (jVar.F == null) {
                                                            jVar.F = new cla1(jVar, gVar3, 0);
                                                        }
                                                        jVar.F.b(max);
                                                    }
                                                }
                                                o5a1Var.I.b(true);
                                                return;
                                            }
                                        } else {
                                            l1a1Var = l1a1Var6;
                                            gVar2 = gVar5;
                                        }
                                        if (!TextUtils.isEmpty(gVar2.l().Ng()) && (i3 == 0 || i3 == 30 || i3 == 10 || i3 == 40)) {
                                            g.f(jVar);
                                            jVar.ch(new wia1(-10), false);
                                        }
                                        wia1Var = null;
                                        if (wia1Var != null) {
                                        }
                                        g.f(jVar);
                                        gVar3 = (g) jVar.b;
                                        jVar.Kg(wia1Var);
                                        o5a1Var.Gg();
                                        int i42 = x791.b(o5a1Var.Kg().getString("dma_consent_settings", null)).a;
                                        Vg2 = j691Var.Vg("google_analytics_default_allow_ad_personalization_signals", true);
                                        if (Vg2 != zzjiVar) {
                                        }
                                        Vg3 = j691Var.Vg("google_analytics_default_allow_ad_user_data", true);
                                        if (Vg3 == zzjiVar) {
                                        }
                                        if (TextUtils.isEmpty(gVar2.l().Ng())) {
                                        }
                                        if (TextUtils.isEmpty(gVar2.l().Ng())) {
                                            x791 c2 = x791.c(30, bundle);
                                            it = c2.e.values().iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                }
                                            }
                                        }
                                        Sg = j691Var.Sg("google_analytics_tcf_data_enabled");
                                        if (Sg != null) {
                                        }
                                        g.g(y1a1Var2);
                                        l1a1Var3.a("TCF client enabled.");
                                        g.f(jVar);
                                        jVar.Gg();
                                        y1a1 y1a1Var92 = gVar3.y;
                                        g.g(y1a1Var92);
                                        y1a1Var92.G.a("Register tcfPrefChangeListener.");
                                        if (jVar.O == null) {
                                        }
                                        o5a1 o5a1Var22 = gVar3.x;
                                        g.e(o5a1Var22);
                                        o5a1Var22.Lg().registerOnSharedPreferenceChangeListener(jVar.O);
                                        g.f(jVar);
                                        jVar.Mg();
                                        u4a1Var = o5a1Var.z;
                                        if (u4a1Var.a() == 0) {
                                        }
                                        g.f(jVar);
                                        svb1Var = jVar.L;
                                        if (svb1Var.d()) {
                                            o5a1 o5a1Var32 = ((g) svb1Var.a).x;
                                            g.e(o5a1Var32);
                                            o5a1Var32.Q.p(null);
                                        }
                                        if (gVar2.c()) {
                                        }
                                        eib1.a();
                                        if (j691Var.Qg(null, nw91.Q0)) {
                                        }
                                        o5a1Var.I.b(true);
                                        return;
                                    }
                                }
                                gVar = gVar6;
                                lxj lxjVar22 = o5a1Var.A;
                                wia1 Ng4 = o5a1Var.Ng();
                                int i32 = Ng4.b;
                                Vg = j691Var.Vg("google_analytics_default_allow_ad_storage", false);
                                g gVar92 = gVar;
                                zzji Vg42 = j691Var.Vg("google_analytics_default_allow_analytics_storage", false);
                                zzjiVar = zzji.UNINITIALIZED;
                                if (Vg == zzjiVar) {
                                }
                                gVar2 = gVar5;
                                l1a1Var = l1a1Var6;
                                if (wia1.l(-10, o5a1Var.Kg().getInt("consent_source", 100))) {
                                }
                                if (!TextUtils.isEmpty(gVar2.l().Ng())) {
                                    g.f(jVar);
                                    jVar.ch(new wia1(-10), false);
                                }
                                wia1Var = null;
                                if (wia1Var != null) {
                                }
                                g.f(jVar);
                                gVar3 = (g) jVar.b;
                                jVar.Kg(wia1Var);
                                o5a1Var.Gg();
                                int i422 = x791.b(o5a1Var.Kg().getString("dma_consent_settings", null)).a;
                                Vg2 = j691Var.Vg("google_analytics_default_allow_ad_personalization_signals", true);
                                if (Vg2 != zzjiVar) {
                                }
                                Vg3 = j691Var.Vg("google_analytics_default_allow_ad_user_data", true);
                                if (Vg3 == zzjiVar) {
                                }
                                if (TextUtils.isEmpty(gVar2.l().Ng())) {
                                }
                                if (TextUtils.isEmpty(gVar2.l().Ng())) {
                                }
                                Sg = j691Var.Sg("google_analytics_tcf_data_enabled");
                                if (Sg != null) {
                                }
                                g.g(y1a1Var2);
                                l1a1Var3.a("TCF client enabled.");
                                g.f(jVar);
                                jVar.Gg();
                                y1a1 y1a1Var922 = gVar3.y;
                                g.g(y1a1Var922);
                                y1a1Var922.G.a("Register tcfPrefChangeListener.");
                                if (jVar.O == null) {
                                }
                                o5a1 o5a1Var222 = gVar3.x;
                                g.e(o5a1Var222);
                                o5a1Var222.Lg().registerOnSharedPreferenceChangeListener(jVar.O);
                                g.f(jVar);
                                jVar.Mg();
                                u4a1Var = o5a1Var.z;
                                if (u4a1Var.a() == 0) {
                                }
                                g.f(jVar);
                                svb1Var = jVar.L;
                                if (svb1Var.d()) {
                                }
                                if (gVar2.c()) {
                                }
                                eib1.a();
                                if (j691Var.Qg(null, nw91.Q0)) {
                                }
                                o5a1Var.I.b(true);
                                return;
                            }
                            fz91Var3.E = asList;
                            if (packageManager != null) {
                            }
                            ((g) fz91Var3.b).V.incrementAndGet();
                            fz91Var3.c = true;
                            tva1Var = new tva1(gVar5);
                            tva1Var.Ig();
                            gVar5.N = tva1Var;
                            if (tva1Var.c) {
                            }
                        }
                    }
                    asList = null;
                    if (asList != null) {
                    }
                    fz91Var3.E = asList;
                    if (packageManager != null) {
                    }
                    ((g) fz91Var3.b).V.incrementAndGet();
                    fz91Var3.c = true;
                    tva1Var = new tva1(gVar5);
                    tva1Var.Ig();
                    gVar5.N = tva1Var;
                    if (tva1Var.c) {
                    }
                }
                valueOf = null;
                if (valueOf != null) {
                }
                asList = null;
                if (asList != null) {
                }
                fz91Var3.E = asList;
                if (packageManager != null) {
                }
                ((g) fz91Var3.b).V.incrementAndGet();
                fz91Var3.c = true;
                tva1Var = new tva1(gVar5);
                tva1Var.Ig();
                gVar5.N = tva1Var;
                if (tva1Var.c) {
                }
                break;
            default:
                zznf zznfVar = (zznf) this.c;
                synchronized (zznfVar) {
                    try {
                        zznfVar.zzd(false);
                        j5b1 j5b1Var2 = zznfVar.zza;
                        if (!j5b1Var2.Xg()) {
                            y1a1 y1a1Var10 = ((g) j5b1Var2.b).y;
                            g.g(y1a1Var10);
                            y1a1Var10.H.a("Connected to service");
                            zzgb zzgbVar = (zzgb) this.b;
                            j5b1Var2.Gg();
                            j5b1Var2.x = zzgbVar;
                            j5b1Var2.Tg();
                            j5b1Var2.Vg();
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
