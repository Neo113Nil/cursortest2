package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import defpackage.atx0;
import defpackage.b321;
import defpackage.b64;
import defpackage.cvw;
import defpackage.e091;
import defpackage.fwt;
import defpackage.g091;
import defpackage.iy81;
import defpackage.j63;
import defpackage.jy81;
import defpackage.ky81;
import defpackage.luy;
import defpackage.lz81;
import defpackage.mwk0;
import defpackage.o8u0;
import defpackage.om2;
import defpackage.ox5;
import defpackage.oyr;
import defpackage.oz81;
import defpackage.pdy0;
import defpackage.py81;
import defpackage.pz81;
import defpackage.q3w;
import defpackage.qdy0;
import defpackage.qza1;
import defpackage.s8o;
import defpackage.sx81;
import defpackage.ust;
import defpackage.uy81;
import defpackage.vez0;
import defpackage.vkt;
import defpackage.vy81;
import defpackage.vz81;
import defpackage.wn2;
import defpackage.wpi0;
import defpackage.wy81;
import defpackage.xy81;
import defpackage.yqv;
import defpackage.yz81;
import defpackage.zsx0;
import defpackage.zz81;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes.dex */
public class GoogleApiManager implements Handler.Callback {
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status zab = new Status(4, "The user must be signed in to make this API call.");
    private static final Object zac = new Object();
    private static GoogleApiManager zad;
    private TelemetryData zag;
    private pdy0 zah;
    private final Context zai;
    private final com.google.android.gms.common.a zaj;
    private final yz81 zak;
    private final Handler zar;
    private volatile boolean zas;
    private long zae = 10000;
    private boolean zaf = false;
    private final AtomicInteger zal = new AtomicInteger(1);
    private final AtomicInteger zam = new AtomicInteger(0);
    private final Map zan = new ConcurrentHashMap(5, 0.75f, 1);
    private zaae zao = null;
    private final Set zap = new j63();
    private final Set zaq = new j63();

    private GoogleApiManager(Context context, Looper looper, com.google.android.gms.common.a aVar) {
        this.zas = true;
        this.zai = context;
        zau zauVar = new zau(looper, this);
        this.zar = zauVar;
        this.zaj = aVar;
        this.zak = new yz81(aVar);
        PackageManager packageManager = context.getPackageManager();
        if (s8o.g == null) {
            s8o.g = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (s8o.g.booleanValue()) {
            this.zas = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void reportSignOut() {
        synchronized (zac) {
            try {
                GoogleApiManager googleApiManager = zad;
                if (googleApiManager != null) {
                    googleApiManager.zam.incrementAndGet();
                    Handler handler = googleApiManager.zar;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status zaF(wn2 wn2Var, ConnectionResult connectionResult) {
        return new Status(connectionResult, b64.l("API: ", wn2Var.b.c, " is not available on this device. Connection failed with: ", String.valueOf(connectionResult)));
    }

    @ResultIgnorabilityUnspecified
    private final jy81 zaG(ust ustVar) {
        Map map = this.zan;
        wn2 wn2Var = ustVar.e;
        jy81 jy81Var = (jy81) map.get(wn2Var);
        if (jy81Var == null) {
            jy81Var = new jy81(this, ustVar);
            this.zan.put(wn2Var, jy81Var);
        }
        if (jy81Var.b.requiresSignIn()) {
            this.zaq.add(wn2Var);
        }
        jy81Var.m();
        return jy81Var;
    }

    private final pdy0 zaH() {
        if (this.zah == null) {
            this.zah = vez0.v(this.zai, qdy0.b);
        }
        return this.zah;
    }

    private final void zaI() {
        TelemetryData telemetryData = this.zag;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zaD()) {
                ((e091) zaH()).e(telemetryData);
            }
            this.zag = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zaJ(atx0 atx0Var, int i, ust ustVar) {
        uy81 uy81Var;
        GoogleApiManager googleApiManager;
        if (i == 0) {
            return;
        }
        wn2 wn2Var = ustVar.e;
        if (zaD()) {
            RootTelemetryConfiguration a = mwk0.b().a();
            boolean z = true;
            if (a != null) {
                if (a.getMethodInvocationTelemetryEnabled()) {
                    boolean methodTimingTelemetryEnabled = a.getMethodTimingTelemetryEnabled();
                    jy81 zai = zai(wn2Var);
                    if (zai != null) {
                        Object obj = zai.b;
                        if (obj instanceof com.google.android.gms.common.internal.a) {
                            com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) obj;
                            if (aVar.T != null && !aVar.isConnecting()) {
                                ConnectionTelemetryConfiguration a2 = uy81.a(zai, aVar, i);
                                if (a2 != null) {
                                    zai.E++;
                                    z = a2.getMethodTimingTelemetryEnabled();
                                }
                            }
                        }
                    }
                    z = methodTimingTelemetryEnabled;
                }
            }
            googleApiManager = this;
            uy81Var = new uy81(googleApiManager, i, wn2Var, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            if (uy81Var == null) {
                zzw zzwVar = atx0Var.a;
                Handler handler = googleApiManager.zar;
                handler.getClass();
                zzwVar.c(new ox5(handler), uy81Var);
                return;
            }
            return;
        }
        uy81Var = null;
        googleApiManager = this;
        if (uy81Var == null) {
        }
    }

    public static GoogleApiManager zaj() {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            cvw.m(zad, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @ResultIgnorabilityUnspecified
    public static GoogleApiManager zak(Context context) {
        GoogleApiManager googleApiManager;
        HandlerThread handlerThread;
        synchronized (zac) {
            if (zad == null) {
                synchronized (vkt.a) {
                    try {
                        handlerThread = vkt.c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            vkt.c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = vkt.c;
                        }
                    } finally {
                    }
                }
                zad = new GoogleApiManager(context.getApplicationContext(), handlerThread.getLooper(), com.google.android.gms.common.a.d);
            }
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        wn2 wn2Var;
        wn2 wn2Var2;
        wn2 wn2Var3;
        wn2 wn2Var4;
        Feature feature;
        Feature[] g;
        int i = message.what;
        long j = MapiClientImpl.RETRIES_TIME_MILLIS;
        jy81 jy81Var = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.zae = j;
                this.zar.removeMessages(12);
                for (wn2 wn2Var5 : this.zan.keySet()) {
                    Handler handler = this.zar;
                    handler.sendMessageDelayed(handler.obtainMessage(12, wn2Var5), this.zae);
                }
                return true;
            case 2:
                zz81 zz81Var = (zz81) message.obj;
                Iterator it = zz81Var.b().iterator();
                while (true) {
                    yqv yqvVar = (yqv) it;
                    if (!yqvVar.hasNext()) {
                        break;
                    } else {
                        wn2 wn2Var6 = (wn2) yqvVar.next();
                        jy81 jy81Var2 = (jy81) this.zan.get(wn2Var6);
                        if (jy81Var2 == null) {
                            zz81Var.c(wn2Var6, new ConnectionResult(13), null);
                            return true;
                        }
                        GoogleApiManager googleApiManager = jy81Var2.F;
                        om2 om2Var = jy81Var2.b;
                        if (om2Var.isConnected()) {
                            zz81Var.c(wn2Var6, ConnectionResult.RESULT_SUCCESS, om2Var.getEndpointPackageName());
                        } else {
                            cvw.g(googleApiManager.zar);
                            ConnectionResult connectionResult = jy81Var2.D;
                            if (connectionResult != null) {
                                zz81Var.c(wn2Var6, connectionResult, null);
                            } else {
                                cvw.g(googleApiManager.zar);
                                jy81Var2.x.add(zz81Var);
                                jy81Var2.m();
                            }
                        }
                    }
                }
            case 3:
                for (jy81 jy81Var3 : this.zan.values()) {
                    cvw.g(jy81Var3.F.zar);
                    jy81Var3.D = null;
                    jy81Var3.m();
                }
                return true;
            case 4:
            case 8:
            case 13:
                wy81 wy81Var = (wy81) message.obj;
                Map map = this.zan;
                ust ustVar = wy81Var.c;
                vz81 vz81Var = wy81Var.a;
                jy81 jy81Var4 = (jy81) map.get(ustVar.e);
                if (jy81Var4 == null) {
                    jy81Var4 = zaG(wy81Var.c);
                }
                if (!jy81Var4.b.requiresSignIn() || this.zam.get() == wy81Var.b) {
                    jy81Var4.n(vz81Var);
                    return true;
                }
                vz81Var.a(zaa);
                jy81Var4.q();
                return true;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult2 = (ConnectionResult) message.obj;
                Iterator it2 = this.zan.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        jy81 jy81Var5 = (jy81) it2.next();
                        if (jy81Var5.z == i2) {
                            jy81Var = jy81Var5;
                        }
                    }
                }
                if (jy81Var == null) {
                    Log.wtf("GoogleApiManager", oyr.j(i2, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                if (connectionResult2.getErrorCode() != 13) {
                    jy81Var.c(zaF(jy81Var.c, connectionResult2));
                    return true;
                }
                com.google.android.gms.common.a aVar = this.zaj;
                int errorCode = connectionResult2.getErrorCode();
                aVar.getClass();
                AtomicBoolean atomicBoolean = fwt.a;
                jy81Var.c(new Status(17, b64.l("Error resolution was canceled by the user, original error message: ", ConnectionResult.zza(errorCode), Extension.COLON_SPACE, connectionResult2.getErrorMessage())));
                return true;
            case 6:
                if (this.zai.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.zai.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new iy81(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zae = MapiClientImpl.RETRIES_TIME_MILLIS;
                        return true;
                    }
                }
                return true;
            case 7:
                zaG((ust) message.obj);
                return true;
            case 9:
                if (this.zan.containsKey(message.obj)) {
                    jy81 jy81Var6 = (jy81) this.zan.get(message.obj);
                    cvw.g(jy81Var6.F.zar);
                    if (jy81Var6.B) {
                        jy81Var6.m();
                        return true;
                    }
                }
                return true;
            case 10:
                Iterator it3 = this.zaq.iterator();
                while (it3.hasNext()) {
                    jy81 jy81Var7 = (jy81) this.zan.remove((wn2) it3.next());
                    if (jy81Var7 != null) {
                        jy81Var7.q();
                    }
                }
                this.zaq.clear();
                return true;
            case 11:
                if (this.zan.containsKey(message.obj)) {
                    jy81 jy81Var8 = (jy81) this.zan.get(message.obj);
                    GoogleApiManager googleApiManager2 = jy81Var8.F;
                    cvw.g(googleApiManager2.zar);
                    if (jy81Var8.B) {
                        jy81Var8.i();
                        jy81Var8.c(googleApiManager2.zaj.d(googleApiManager2.zai, com.google.android.gms.common.b.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
                        jy81Var8.b.disconnect("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (this.zan.containsKey(message.obj)) {
                    ((jy81) this.zan.get(message.obj)).l(true);
                    return true;
                }
                return true;
            case 14:
                sx81 sx81Var = (sx81) message.obj;
                wn2 a = sx81Var.a();
                if (this.zan.containsKey(a)) {
                    sx81Var.b().a(Boolean.valueOf(((jy81) this.zan.get(a)).l(false)));
                    return true;
                }
                sx81Var.b().a(Boolean.FALSE);
                return true;
            case 15:
                ky81 ky81Var = (ky81) message.obj;
                Map map2 = this.zan;
                wn2Var = ky81Var.a;
                if (map2.containsKey(wn2Var)) {
                    Map map3 = this.zan;
                    wn2Var2 = ky81Var.a;
                    jy81 jy81Var9 = (jy81) map3.get(wn2Var2);
                    if (jy81Var9.C.contains(ky81Var) && !jy81Var9.B) {
                        if (jy81Var9.b.isConnected()) {
                            jy81Var9.e();
                            return true;
                        }
                        jy81Var9.m();
                        return true;
                    }
                }
                return true;
            case 16:
                ky81 ky81Var2 = (ky81) message.obj;
                Map map4 = this.zan;
                wn2Var3 = ky81Var2.a;
                if (map4.containsKey(wn2Var3)) {
                    Map map5 = this.zan;
                    wn2Var4 = ky81Var2.a;
                    jy81 jy81Var10 = (jy81) map5.get(wn2Var4);
                    ArrayList arrayList = jy81Var10.C;
                    GoogleApiManager googleApiManager3 = jy81Var10.F;
                    LinkedList<vz81> linkedList = jy81Var10.a;
                    if (arrayList.remove(ky81Var2)) {
                        googleApiManager3.zar.removeMessages(15, ky81Var2);
                        googleApiManager3.zar.removeMessages(16, ky81Var2);
                        feature = ky81Var2.b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (vz81 vz81Var2 : linkedList) {
                            if ((vz81Var2 instanceof py81) && (g = ((py81) vz81Var2).g(jy81Var10)) != null && qza1.d(g, feature)) {
                                arrayList2.add(vz81Var2);
                            }
                        }
                        int size = arrayList2.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            vz81 vz81Var3 = (vz81) arrayList2.get(i3);
                            linkedList.remove(vz81Var3);
                            vz81Var3.b(new UnsupportedApiCallException(feature));
                        }
                    }
                }
                return true;
            case 17:
                zaI();
                return true;
            case 18:
                vy81 vy81Var = (vy81) message.obj;
                long j2 = vy81Var.c;
                MethodInvocation methodInvocation = vy81Var.a;
                int i4 = vy81Var.b;
                if (j2 == 0) {
                    ((e091) zaH()).e(new TelemetryData(i4, Arrays.asList(methodInvocation)));
                    return true;
                }
                TelemetryData telemetryData = this.zag;
                if (telemetryData != null) {
                    List zab2 = telemetryData.zab();
                    if (telemetryData.zaa() != i4 || (zab2 != null && zab2.size() >= vy81Var.d)) {
                        this.zar.removeMessages(17);
                        zaI();
                    } else {
                        this.zag.zac(methodInvocation);
                    }
                }
                if (this.zag == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(methodInvocation);
                    this.zag = new TelemetryData(i4, arrayList3);
                    Handler handler2 = this.zar;
                    handler2.sendMessageDelayed(handler2.obtainMessage(17), vy81Var.c);
                    return true;
                }
                return true;
            case 19:
                this.zaf = false;
                return true;
            default:
                return false;
        }
    }

    public final void zaA(zaae zaaeVar) {
        synchronized (zac) {
            try {
                if (this.zao != zaaeVar) {
                    this.zao = zaaeVar;
                    this.zap.clear();
                }
                this.zap.addAll(zaaeVar.zaa());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zaB(zaae zaaeVar) {
        synchronized (zac) {
            try {
                if (this.zao == zaaeVar) {
                    this.zao = null;
                    this.zap.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zaD() {
        if (this.zaf) {
            return false;
        }
        RootTelemetryConfiguration a = mwk0.b().a();
        if (a != null && !a.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int i = this.zak.a.get(203400000, -1);
        return i == -1 || i == 0;
    }

    @ResultIgnorabilityUnspecified
    public final boolean zaE(ConnectionResult connectionResult, int i) {
        com.google.android.gms.common.a aVar = this.zaj;
        Context context = this.zai;
        aVar.getClass();
        if (!q3w.a(context)) {
            PendingIntent resolution = connectionResult.hasResolution() ? connectionResult.getResolution() : aVar.c(context, connectionResult.getErrorCode(), null);
            if (resolution != null) {
                aVar.i(context, connectionResult.getErrorCode(), PendingIntent.getActivity(context, 0, GoogleApiActivity.zaa(context, resolution, i, true), g091.a | SelfTester_JCP.DECRYPT_CNT));
                return true;
            }
        }
        return false;
    }

    public final int zaa() {
        return this.zal.getAndIncrement();
    }

    public final jy81 zai(wn2 wn2Var) {
        return (jy81) this.zan.get(wn2Var);
    }

    public final Task zam(Iterable iterable) {
        zz81 zz81Var = new zz81(iterable);
        this.zar.sendMessage(this.zar.obtainMessage(2, zz81Var));
        return zz81Var.a();
    }

    @ResultIgnorabilityUnspecified
    public final Task zan(ust ustVar) {
        sx81 sx81Var = new sx81(ustVar.e);
        this.zar.sendMessage(this.zar.obtainMessage(14, sx81Var));
        return sx81Var.b().a;
    }

    public final Task zao(ust ustVar, wpi0 wpi0Var, b321 b321Var, Runnable runnable) {
        atx0 atx0Var = new atx0();
        zaJ(atx0Var, wpi0Var.d(), ustVar);
        this.zar.sendMessage(this.zar.obtainMessage(8, new wy81(new oz81(new xy81(wpi0Var, b321Var, runnable), atx0Var), this.zam.get(), ustVar)));
        return atx0Var.a;
    }

    public final Task zap(ust ustVar, luy luyVar, int i) {
        atx0 atx0Var = new atx0();
        zaJ(atx0Var, i, ustVar);
        this.zar.sendMessage(this.zar.obtainMessage(13, new wy81(new oz81(luyVar, atx0Var), this.zam.get(), ustVar)));
        return atx0Var.a;
    }

    public final void zau(ust ustVar, int i, a aVar) {
        this.zar.sendMessage(this.zar.obtainMessage(4, new wy81(new lz81(i, aVar), this.zam.get(), ustVar)));
    }

    public final void zav(ust ustVar, int i, zsx0 zsx0Var, atx0 atx0Var, o8u0 o8u0Var) {
        zaJ(atx0Var, zsx0Var.c, ustVar);
        this.zar.sendMessage(this.zar.obtainMessage(4, new wy81(new pz81(i, zsx0Var, atx0Var, o8u0Var), this.zam.get(), ustVar)));
    }

    public final void zaw(MethodInvocation methodInvocation, int i, long j, int i2) {
        this.zar.sendMessage(this.zar.obtainMessage(18, new vy81(methodInvocation, i, j, i2)));
    }

    public final void zax(ConnectionResult connectionResult, int i) {
        if (zaE(connectionResult, i)) {
            return;
        }
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void zay() {
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaz(ust ustVar) {
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(7, ustVar));
    }
}
