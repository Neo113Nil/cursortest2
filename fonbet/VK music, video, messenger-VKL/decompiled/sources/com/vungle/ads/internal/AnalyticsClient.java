package com.vungle.ads.internal;

import android.os.Build;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.vw1;
import xsna.xw1;
import xsna.yw1;

/* loaded from: classes7.dex */
public final class AnalyticsClient {
    public static VungleApiClient e;
    public static com.vungle.ads.internal.executor.j f;
    public static boolean g;
    public static final AnalyticsClient INSTANCE = new AnalyticsClient();
    public static final LinkedBlockingQueue a = new LinkedBlockingQueue();
    public static final LinkedBlockingQueue b = new LinkedBlockingQueue();
    public static final LinkedBlockingQueue c = new LinkedBlockingQueue();
    public static final LinkedBlockingQueue d = new LinkedBlockingQueue();
    public static int h = 2;
    public static boolean i = true;
    public static final AtomicBoolean j = new AtomicBoolean(false);

    private AnalyticsClient() {
    }

    public static void a(AnalyticsClient analyticsClient, t1 t1Var, com.vungle.ads.internal.util.s sVar) {
        analyticsClient.a(t1Var, sVar, t1Var.b);
    }

    public static final void b(Sdk.SDKError.Reason reason, String str, com.vungle.ads.internal.util.s sVar) {
        AnalyticsClient analyticsClient = INSTANCE;
        synchronized (analyticsClient) {
            if (h != 1) {
                try {
                    Sdk.SDKError.Builder a2 = a(reason, str, sVar);
                    LinkedBlockingQueue linkedBlockingQueue = a;
                    linkedBlockingQueue.put(a2);
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", new z(reason, str, a2));
                    if (linkedBlockingQueue.size() >= 20) {
                        analyticsClient.report();
                    }
                } catch (Exception e2) {
                    boolean z2 = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logError", e2);
                }
            }
        }
    }

    private final synchronized void report() {
        VungleApiClient vungleApiClient;
        VungleApiClient vungleApiClient2;
        try {
            if (h != 1) {
                LinkedBlockingQueue linkedBlockingQueue = a;
                if (linkedBlockingQueue.size() > 0) {
                    boolean z = com.vungle.ads.internal.util.u.a;
                    StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Sending ");
                    a2.append(linkedBlockingQueue.size());
                    a2.append(" errors");
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", a2.toString());
                    LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
                    linkedBlockingQueue.drainTo(linkedBlockingQueue2);
                    if (!linkedBlockingQueue2.isEmpty() && (vungleApiClient2 = e) != null) {
                        vungleApiClient2.a(linkedBlockingQueue2, new x(linkedBlockingQueue2));
                    }
                }
            }
            if (g) {
                LinkedBlockingQueue linkedBlockingQueue3 = b;
                if (linkedBlockingQueue3.size() > 0) {
                    boolean z2 = com.vungle.ads.internal.util.u.a;
                    StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("Sending ");
                    a3.append(linkedBlockingQueue3.size());
                    a3.append(" metrics");
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", a3.toString());
                    LinkedBlockingQueue linkedBlockingQueue4 = new LinkedBlockingQueue();
                    linkedBlockingQueue3.drainTo(linkedBlockingQueue4);
                    if (!linkedBlockingQueue4.isEmpty() && (vungleApiClient = e) != null) {
                        vungleApiClient.a(linkedBlockingQueue4, new y(linkedBlockingQueue4));
                    }
                }
            }
        } finally {
        }
    }

    public final synchronized void c(Sdk.SDKError.Reason reason, String str, com.vungle.ads.internal.util.s sVar) {
        com.vungle.ads.internal.executor.j jVar;
        try {
            jVar = f;
        } catch (Exception e2) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logError " + reason + ", " + str + ", " + sVar, e2);
        }
        if (jVar != null) {
            jVar.execute(new vw1(reason, str, sVar, 0));
        } else {
            c.put(a(reason, str, sVar));
        }
    }

    public final synchronized void a(VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.j jVar, int i2, boolean z) {
        try {
            h = t.a(i2);
            g = z;
            int i3 = 0;
            if (i2 == u.a(3)) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.u.a = true;
            } else if (i2 == u.a(2)) {
                boolean z3 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.u.a = false;
            } else if (i2 == u.a(1)) {
                boolean z4 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.u.a = false;
            }
            if (j.getAndSet(true)) {
                boolean z5 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AnalyticsClient", "AnalyticsClient already initialized");
                return;
            }
            f = jVar;
            e = vungleApiClient;
            try {
                LinkedBlockingQueue linkedBlockingQueue = c;
                if (!linkedBlockingQueue.isEmpty()) {
                    linkedBlockingQueue.drainTo(a);
                }
            } catch (Exception e2) {
                boolean z6 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AnalyticsClient", "Failed to add pendingErrors to errors queue.", e2);
            }
            try {
                LinkedBlockingQueue linkedBlockingQueue2 = d;
                if (!linkedBlockingQueue2.isEmpty()) {
                    linkedBlockingQueue2.drainTo(b);
                }
            } catch (Exception e3) {
                boolean z7 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AnalyticsClient", "Failed to add pendingMetrics to metrics queue.", e3);
            }
            if (i) {
                Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new xw1(jVar, i3), 5000L, 5000L, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j2, com.vungle.ads.internal.util.s sVar, String str) {
        final Sdk.SDKMetric.SDKMetricType sDKMetricType2;
        final long j3;
        final com.vungle.ads.internal.util.s sVar2;
        final String str2;
        com.vungle.ads.internal.executor.j jVar;
        try {
            jVar = f;
        } catch (Exception e2) {
            e = e2;
            sDKMetricType2 = sDKMetricType;
            j3 = j2;
            sVar2 = sVar;
            str2 = str;
        }
        if (jVar == null) {
            d.put(a(sDKMetricType, j2, sVar, str));
            return;
        }
        sDKMetricType2 = sDKMetricType;
        j3 = j2;
        sVar2 = sVar;
        str2 = str;
        try {
            jVar.execute(new Runnable() { // from class: xsna.ww1
                @Override // java.lang.Runnable
                public final void run() {
                    AnalyticsClient.b(Sdk.SDKMetric.SDKMetricType.this, j3, sVar2, str2);
                }
            });
        } catch (Exception e3) {
            e = e3;
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logMetric " + sDKMetricType2 + ", " + j3 + ", " + sVar2 + ", " + str2, e);
        }
    }

    public static final void b(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j2, com.vungle.ads.internal.util.s sVar, String str) {
        AnalyticsClient analyticsClient = INSTANCE;
        synchronized (analyticsClient) {
            if (g) {
                try {
                    Sdk.SDKMetric.Builder a2 = a(sDKMetricType, j2, sVar, str);
                    LinkedBlockingQueue linkedBlockingQueue = b;
                    linkedBlockingQueue.put(a2);
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", new a0(sDKMetricType, j2, sVar, a2));
                    if (linkedBlockingQueue.size() >= 20) {
                        analyticsClient.report();
                    }
                } catch (Exception e2) {
                    boolean z2 = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logMetrics", e2);
                }
            }
        }
    }

    public static final void a(com.vungle.ads.internal.executor.j jVar) {
        jVar.execute(new yw1(0));
    }

    public static final void a() {
        INSTANCE.report();
    }

    public static Sdk.SDKError.Builder a(Sdk.SDKError.Reason reason, String str, com.vungle.ads.internal.util.s sVar) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String d2;
        String str7;
        String str8;
        Long a2;
        Boolean b2;
        Boolean f2;
        Boolean k;
        String e2;
        h d3;
        Sdk.SDKError.Builder newBuilder = Sdk.SDKError.newBuilder();
        String str9 = Build.MANUFACTURER;
        Sdk.SDKError.Builder at = newBuilder.setOs("Amazon".equals(str9) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT)).setMake(str9).setModel(Build.MODEL).setReason(reason).setMessage(str).setAt(System.currentTimeMillis());
        String str10 = "";
        if (sVar == null || (str2 = sVar.l()) == null) {
            str2 = "";
        }
        Sdk.SDKError.Builder placementReferenceId = at.setPlacementReferenceId(str2);
        if (sVar == null || (str3 = sVar.g()) == null) {
            str3 = "";
        }
        Sdk.SDKError.Builder creativeId = placementReferenceId.setCreativeId(str3);
        if (sVar == null || (str4 = sVar.h()) == null) {
            str4 = "";
        }
        Sdk.SDKError.Builder eventId = creativeId.setEventId(str4);
        if (sVar == null || (str5 = sVar.c()) == null) {
            str5 = "";
        }
        Sdk.SDKError.Builder adSource = eventId.setAdSource(str5);
        if (sVar == null || (str6 = sVar.m()) == null) {
            str6 = "";
        }
        Sdk.SDKError.Builder vmVersion = adSource.setVmVersion(str6);
        if (sVar == null || (d2 = sVar.j()) == null) {
            d2 = com.vungle.ads.internal.network.d0.d();
        }
        Sdk.SDKError.Builder mediationName = vmVersion.setMediationName(d2);
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        Sdk.SDKError.Builder appState = mediationName.setAppState(com.vungle.ads.internal.util.a.a() ? 0L : 2L);
        if (sVar == null || (d3 = sVar.d()) == null || (str7 = d3.toString()) == null) {
            str7 = "";
        }
        Sdk.SDKError.Builder adState = appState.setAdState(str7);
        if (sVar == null || (str8 = sVar.i()) == null) {
            str8 = "";
        }
        Sdk.SDKError.Builder experiments = adState.setExperiments(str8);
        if (sVar != null && (e2 = sVar.e()) != null) {
            str10 = e2;
        }
        Sdk.SDKError.Builder adapterAdFormat = experiments.setAdapterAdFormat(str10);
        if (sVar != null && (k = sVar.k()) != null) {
            adapterAdFormat.setIsPartialDownloadEnabled(k.booleanValue());
        }
        if (sVar != null && (f2 = sVar.f()) != null) {
            adapterAdFormat.setIsAdoEnabled(f2.booleanValue());
        }
        if (sVar != null && (b2 = sVar.b()) != null) {
            adapterAdFormat.setIsAdPodding(b2.booleanValue());
        }
        if (sVar != null && (a2 = sVar.a()) != null) {
            adapterAdFormat.setAdLoadType(a2.longValue());
        }
        return adapterAdFormat;
    }

    public static /* synthetic */ void a(AnalyticsClient analyticsClient, Sdk.SDKMetric.SDKMetricType sDKMetricType, long j2, com.vungle.ads.internal.util.s sVar, String str, int i2) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        analyticsClient.c(sDKMetricType, j2, (i2 & 4) != 0 ? null : sVar, (i2 & 8) != 0 ? null : str);
    }

    public static Sdk.SDKMetric.Builder a(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j2, com.vungle.ads.internal.util.s sVar, String str) {
        String str2;
        String str3;
        String str4;
        String d2;
        String str5;
        String str6;
        String str7;
        String str8;
        Long a2;
        Boolean b2;
        Boolean f2;
        Boolean k;
        String e2;
        h d3;
        Sdk.SDKMetric.Builder value = Sdk.SDKMetric.newBuilder().setType(sDKMetricType).setValue(j2);
        String str9 = Build.MANUFACTURER;
        Sdk.SDKMetric.Builder osVersion = value.setMake(str9).setModel(Build.MODEL).setOs("Amazon".equals(str9) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT));
        String str10 = "";
        if (sVar == null || (str2 = sVar.l()) == null) {
            str2 = "";
        }
        Sdk.SDKMetric.Builder placementReferenceId = osVersion.setPlacementReferenceId(str2);
        if (sVar == null || (str3 = sVar.g()) == null) {
            str3 = "";
        }
        Sdk.SDKMetric.Builder creativeId = placementReferenceId.setCreativeId(str3);
        if (sVar == null || (str4 = sVar.h()) == null) {
            str4 = "";
        }
        Sdk.SDKMetric.Builder eventId = creativeId.setEventId(str4);
        if (str == null) {
            str = "";
        }
        Sdk.SDKMetric.Builder meta = eventId.setMeta(str);
        if (sVar == null || (d2 = sVar.j()) == null) {
            d2 = com.vungle.ads.internal.network.d0.d();
        }
        Sdk.SDKMetric.Builder mediationName = meta.setMediationName(d2);
        if (sVar == null || (str5 = sVar.c()) == null) {
            str5 = "";
        }
        Sdk.SDKMetric.Builder adSource = mediationName.setAdSource(str5);
        if (sVar == null || (str6 = sVar.m()) == null) {
            str6 = "";
        }
        Sdk.SDKMetric.Builder vmVersion = adSource.setVmVersion(str6);
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        Sdk.SDKMetric.Builder appState = vmVersion.setAppState(com.vungle.ads.internal.util.a.a() ? 0L : 2L);
        if (sVar == null || (d3 = sVar.d()) == null || (str7 = d3.toString()) == null) {
            str7 = "";
        }
        Sdk.SDKMetric.Builder adState = appState.setAdState(str7);
        if (sVar == null || (str8 = sVar.i()) == null) {
            str8 = "";
        }
        Sdk.SDKMetric.Builder experiments = adState.setExperiments(str8);
        if (sVar != null && (e2 = sVar.e()) != null) {
            str10 = e2;
        }
        Sdk.SDKMetric.Builder adapterAdFormat = experiments.setAdapterAdFormat(str10);
        if (sVar != null && (k = sVar.k()) != null) {
            adapterAdFormat.setIsPartialDownloadEnabled(k.booleanValue());
        }
        if (sVar != null && (f2 = sVar.f()) != null) {
            adapterAdFormat.setIsAdoEnabled(f2.booleanValue());
        }
        if (sVar != null && (b2 = sVar.b()) != null) {
            adapterAdFormat.setIsAdPodding(b2.booleanValue());
        }
        if (sVar != null && (a2 = sVar.a()) != null) {
            adapterAdFormat.setAdLoadType(a2.longValue());
        }
        return adapterAdFormat;
    }

    public static void a(AnalyticsClient analyticsClient, m2 m2Var, com.vungle.ads.internal.util.s sVar, int i2) {
        AnalyticsClient analyticsClient2;
        com.vungle.ads.internal.util.s sVar2 = (i2 & 2) != 0 ? null : sVar;
        String a2 = (i2 & 4) != 0 ? m2Var.a() : null;
        synchronized (analyticsClient) {
            try {
                analyticsClient2 = analyticsClient;
                try {
                    analyticsClient2.c(m2Var.b(), m2Var.c(), sVar2, a2);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                analyticsClient2 = analyticsClient;
            }
        }
    }

    public final synchronized void a(m2 m2Var, com.vungle.ads.internal.util.s sVar, String str) {
        try {
            try {
                c(m2Var.b(), m2Var.c(), sVar, str);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public static void a(AnalyticsClient analyticsClient, s1 s1Var, com.vungle.ads.internal.util.s sVar) {
        AnalyticsClient analyticsClient2;
        String a2 = s1Var.a();
        synchronized (analyticsClient) {
            try {
                if (s1Var.d()) {
                    analyticsClient2 = analyticsClient;
                } else {
                    try {
                        synchronized (analyticsClient) {
                            try {
                                analyticsClient2 = analyticsClient;
                                try {
                                    analyticsClient2.c(s1Var.b(), s1Var.c(), sVar, a2);
                                    s1Var.e();
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                analyticsClient2 = analyticsClient;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                return;
            } catch (Throwable th5) {
                th = th5;
            }
        }
        throw th;
    }

    public static void a(AnalyticsClient analyticsClient, n2 n2Var, com.vungle.ads.internal.util.s sVar, int i2) {
        AnalyticsClient analyticsClient2;
        com.vungle.ads.internal.util.s sVar2 = (i2 & 2) != 0 ? null : sVar;
        String a2 = (i2 & 4) != 0 ? n2Var.a() : null;
        synchronized (analyticsClient) {
            try {
                analyticsClient2 = analyticsClient;
                try {
                    analyticsClient2.c(n2Var.b(), n2Var.c(), sVar2, a2);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                analyticsClient2 = analyticsClient;
            }
        }
    }

    public final synchronized void a(n2 n2Var, com.vungle.ads.internal.util.s sVar, String str) {
        try {
            try {
                c(n2Var.b(), n2Var.c(), sVar, str);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void a(t1 t1Var, com.vungle.ads.internal.util.s sVar, String str) {
        try {
            try {
                if (!t1Var.f()) {
                    synchronized (this) {
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            c(t1Var.b(), t1Var.c(), sVar, str);
                            t1Var.g();
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
