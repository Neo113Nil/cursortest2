package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcq;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzcx;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdc;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import defpackage.aaa1;
import defpackage.bh91;
import defpackage.cmk;
import defpackage.cvw;
import defpackage.do91;
import defpackage.fka1;
import defpackage.fz91;
import defpackage.goa1;
import defpackage.h3k;
import defpackage.hva1;
import defpackage.ieb1;
import defpackage.jya1;
import defpackage.l1a1;
import defpackage.npa1;
import defpackage.ny61;
import defpackage.oma1;
import defpackage.ona1;
import defpackage.p891;
import defpackage.qwa1;
import defpackage.rms;
import defpackage.tpa1;
import defpackage.tqs;
import defpackage.w53;
import defpackage.y1a1;
import defpackage.yja1;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends zzcq {
    g zza = null;
    private final Map zzb = new w53();

    private final void zzb() {
        if (this.zza != null) {
            return;
        }
        ny61.r("Attempting to perform action before initialize.");
    }

    private final void zzc(zzcu zzcuVar, String str) {
        zzb();
        ieb1 ieb1Var = this.zza.B;
        g.e(ieb1Var);
        ieb1Var.nh(zzcuVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        bh91 bh91Var = this.zza.G;
        g.d(bh91Var);
        bh91Var.Hg(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        jVar.Ug(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        jVar.Hg();
        aaa1 aaa1Var = ((g) jVar.b).z;
        g.g(aaa1Var);
        Object obj = null;
        aaa1Var.Pg(new do91((Object) jVar, obj, false, 26));
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        bh91 bh91Var = this.zza.G;
        g.d(bh91Var);
        bh91Var.Ig(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void generateEventId(zzcu zzcuVar) throws RemoteException {
        zzb();
        ieb1 ieb1Var = this.zza.B;
        g.e(ieb1Var);
        long Bh = ieb1Var.Bh();
        zzb();
        ieb1 ieb1Var2 = this.zza.B;
        g.e(ieb1Var2);
        ieb1Var2.oh(zzcuVar, Bh);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void getAppInstanceId(zzcu zzcuVar) throws RemoteException {
        zzb();
        aaa1 aaa1Var = this.zza.z;
        g.g(aaa1Var);
        aaa1Var.Pg(new f(0, this, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void getCachedAppInstanceId(zzcu zzcuVar) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        zzc(zzcuVar, (String) jVar.A.get());
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void getConditionalUserProperties(String str, String str2, zzcu zzcuVar) throws RemoteException {
        zzb();
        aaa1 aaa1Var = this.zza.z;
        g.g(aaa1Var);
        aaa1Var.Pg(new h(this, zzcuVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void getCurrentScreenClass(zzcu zzcuVar) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        jya1 jya1Var = ((g) jVar.b).E;
        g.f(jya1Var);
        qwa1 qwa1Var = jya1Var.w;
        zzc(zzcuVar, qwa1Var != null ? qwa1Var.b : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void getCurrentScreenName(zzcu zzcuVar) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        jya1 jya1Var = ((g) jVar.b).E;
        g.f(jya1Var);
        qwa1 qwa1Var = jya1Var.w;
        zzc(zzcuVar, qwa1Var != null ? qwa1Var.a : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void getGmpAppId(zzcu zzcuVar) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        zzc(zzcuVar, jVar.Vg());
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void getMaxUserProperties(String str, zzcu zzcuVar) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        cvw.i(str);
        ((g) jVar.b).getClass();
        zzb();
        ieb1 ieb1Var = this.zza.B;
        g.e(ieb1Var);
        ieb1Var.ph(zzcuVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void getSessionId(zzcu zzcuVar) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        aaa1 aaa1Var = ((g) jVar.b).z;
        g.g(aaa1Var);
        aaa1Var.Pg(new tqs(jVar, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void getTestFlag(zzcu zzcuVar, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            ieb1 ieb1Var = this.zza.B;
            g.e(ieb1Var);
            j jVar = this.zza.F;
            g.f(jVar);
            AtomicReference atomicReference = new AtomicReference();
            aaa1 aaa1Var = ((g) jVar.b).z;
            g.g(aaa1Var);
            ieb1Var.nh(zzcuVar, (String) aaa1Var.Qg(atomicReference, 15000L, "String test flag value", new npa1(jVar, atomicReference, 0)));
            return;
        }
        if (i == 1) {
            ieb1 ieb1Var2 = this.zza.B;
            g.e(ieb1Var2);
            j jVar2 = this.zza.F;
            g.f(jVar2);
            AtomicReference atomicReference2 = new AtomicReference();
            aaa1 aaa1Var2 = ((g) jVar2.b).z;
            g.g(aaa1Var2);
            ieb1Var2.oh(zzcuVar, ((Long) aaa1Var2.Qg(atomicReference2, 15000L, "long test flag value", new tpa1(jVar2, atomicReference2, 0))).longValue());
            return;
        }
        if (i == 2) {
            ieb1 ieb1Var3 = this.zza.B;
            g.e(ieb1Var3);
            j jVar3 = this.zza.F;
            g.f(jVar3);
            AtomicReference atomicReference3 = new AtomicReference();
            aaa1 aaa1Var3 = ((g) jVar3.b).z;
            g.g(aaa1Var3);
            double doubleValue = ((Double) aaa1Var3.Qg(atomicReference3, 15000L, "double test flag value", new npa1(jVar3, atomicReference3, 1))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzcuVar.zzb(bundle);
                return;
            } catch (RemoteException e) {
                y1a1 y1a1Var = ((g) ieb1Var3.b).y;
                g.g(y1a1Var);
                y1a1Var.C.b(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            ieb1 ieb1Var4 = this.zza.B;
            g.e(ieb1Var4);
            j jVar4 = this.zza.F;
            g.f(jVar4);
            AtomicReference atomicReference4 = new AtomicReference();
            aaa1 aaa1Var4 = ((g) jVar4.b).z;
            g.g(aaa1Var4);
            ieb1Var4.ph(zzcuVar, ((Integer) aaa1Var4.Qg(atomicReference4, 15000L, "int test flag value", new ona1(jVar4, atomicReference4, 1))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        ieb1 ieb1Var5 = this.zza.B;
        g.e(ieb1Var5);
        j jVar5 = this.zza.F;
        g.f(jVar5);
        AtomicReference atomicReference5 = new AtomicReference();
        aaa1 aaa1Var5 = ((g) jVar5.b).z;
        g.g(aaa1Var5);
        ieb1Var5.rh(zzcuVar, ((Boolean) aaa1Var5.Qg(atomicReference5, 15000L, "boolean test flag value", new ona1(jVar5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void getUserProperties(String str, String str2, boolean z, zzcu zzcuVar) throws RemoteException {
        zzb();
        aaa1 aaa1Var = this.zza.z;
        g.g(aaa1Var);
        aaa1Var.Pg(new i(this, zzcuVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void initialize(IObjectWrapper iObjectWrapper, zzdd zzddVar, long j) throws RemoteException {
        g gVar = this.zza;
        if (gVar == null) {
            Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            cvw.l(context);
            this.zza = g.m(context, zzddVar, Long.valueOf(j));
        } else {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.C.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void isDataCollectionEnabled(zzcu zzcuVar) throws RemoteException {
        zzb();
        aaa1 aaa1Var = this.zza.z;
        g.g(aaa1Var);
        aaa1Var.Pg(new e(3, this, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        jVar.Lg(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j) throws RemoteException {
        zzb();
        cvw.i(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        zzbg zzbgVar = new zzbg(str2, new zzbe(bundle), "app", j);
        aaa1 aaa1Var = this.zza.z;
        g.g(aaa1Var);
        aaa1Var.Pg(new h(this, zzcuVar, zzbgVar, str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        zzb();
        Object unwrap = iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper);
        Object unwrap2 = iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2);
        Object unwrap3 = iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null;
        y1a1 y1a1Var = this.zza.y;
        g.g(y1a1Var);
        y1a1Var.Pg(i, true, false, str, unwrap, unwrap2, unwrap3);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        cvw.l(activity);
        onActivityCreatedByScionActivityInfo(zzdf.zza(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        zzky zzkyVar = jVar.w;
        if (zzkyVar != null) {
            j jVar2 = this.zza.F;
            g.f(jVar2);
            jVar2.Zg();
            zzkyVar.zza(zzdfVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        cvw.l(activity);
        onActivityDestroyedByScionActivityInfo(zzdf.zza(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        zzky zzkyVar = jVar.w;
        if (zzkyVar != null) {
            j jVar2 = this.zza.F;
            g.f(jVar2);
            jVar2.Zg();
            zzkyVar.zzb(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        cvw.l(activity);
        onActivityPausedByScionActivityInfo(zzdf.zza(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        zzky zzkyVar = jVar.w;
        if (zzkyVar != null) {
            j jVar2 = this.zza.F;
            g.f(jVar2);
            jVar2.Zg();
            zzkyVar.zzc(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        cvw.l(activity);
        onActivityResumedByScionActivityInfo(zzdf.zza(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        zzky zzkyVar = jVar.w;
        if (zzkyVar != null) {
            j jVar2 = this.zza.F;
            g.f(jVar2);
            jVar2.Zg();
            zzkyVar.zzd(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcu zzcuVar, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        cvw.l(activity);
        onActivitySaveInstanceStateByScionActivityInfo(zzdf.zza(activity), zzcuVar, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        zzky zzkyVar = jVar.w;
        Bundle bundle = new Bundle();
        if (zzkyVar != null) {
            j jVar2 = this.zza.F;
            g.f(jVar2);
            jVar2.Zg();
            zzkyVar.zze(zzdfVar, bundle);
        }
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e) {
            y1a1 y1a1Var = this.zza.y;
            g.g(y1a1Var);
            y1a1Var.C.b(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        cvw.l(activity);
        onActivityStartedByScionActivityInfo(zzdf.zza(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        if (jVar.w != null) {
            j jVar2 = this.zza.F;
            g.f(jVar2);
            jVar2.Zg();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        cvw.l(activity);
        onActivityStoppedByScionActivityInfo(zzdf.zza(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        if (jVar.w != null) {
            j jVar2 = this.zza.F;
            g.f(jVar2);
            jVar2.Zg();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void performAction(Bundle bundle, zzcu zzcuVar, long j) throws RemoteException {
        zzb();
        zzcuVar.zzb(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void registerOnMeasurementEventListener(zzda zzdaVar) throws RemoteException {
        Object obj;
        zzb();
        Map map = this.zzb;
        synchronized (map) {
            try {
                obj = (fka1) map.get(Integer.valueOf(zzdaVar.zzf()));
                if (obj == null) {
                    obj = new o(this, zzdaVar);
                    map.put(Integer.valueOf(zzdaVar.zzf()), obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j jVar = this.zza.F;
        g.f(jVar);
        jVar.Hg();
        if (jVar.y.add(obj)) {
            return;
        }
        y1a1 y1a1Var = ((g) jVar.b).y;
        g.g(y1a1Var);
        y1a1Var.C.a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        jVar.A.set(null);
        aaa1 aaa1Var = ((g) jVar.b).z;
        g.g(aaa1Var);
        aaa1Var.Pg(new oma1(jVar, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void retrieveAndUploadBatches(zzcx zzcxVar) {
        zzlr zzlrVar;
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        e eVar = new e(this, zzcxVar);
        jVar.Hg();
        g gVar = (g) jVar.b;
        aaa1 aaa1Var = gVar.z;
        g.g(aaa1Var);
        if (aaa1Var.Mg()) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        aaa1 aaa1Var2 = gVar.z;
        g.g(aaa1Var2);
        if (Thread.currentThread() == aaa1Var2.x) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.z.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean k = rms.k();
        y1a1 y1a1Var3 = gVar.y;
        if (k) {
            g.g(y1a1Var3);
            y1a1Var3.z.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        g.g(y1a1Var3);
        y1a1Var3.H.a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (!z) {
            y1a1 y1a1Var4 = gVar.y;
            g.g(y1a1Var4);
            y1a1Var4.H.a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            aaa1 aaa1Var3 = gVar.z;
            g.g(aaa1Var3);
            aaa1Var3.Qg(atomicReference, 10000L, "[sgtm] Getting upload batches", new ona1(jVar, atomicReference, 2));
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.zza;
            if (list.isEmpty()) {
                break;
            }
            y1a1 y1a1Var5 = gVar.y;
            g.g(y1a1Var5);
            y1a1Var5.H.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            i += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                zzom zzomVar = (zzom) it.next();
                try {
                    URL url = new URI(zzomVar.zzc).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    fz91 l = ((g) jVar.b).l();
                    l.Hg();
                    cvw.l(l.A);
                    String str = l.A;
                    g gVar2 = (g) jVar.b;
                    y1a1 y1a1Var6 = gVar2.y;
                    g.g(y1a1Var6);
                    l1a1 l1a1Var = y1a1Var6.H;
                    Long valueOf = Long.valueOf(zzomVar.zza);
                    l1a1Var.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, zzomVar.zzc, Integer.valueOf(zzomVar.zzb.length));
                    if (!TextUtils.isEmpty(zzomVar.zzg)) {
                        y1a1 y1a1Var7 = gVar2.y;
                        g.g(y1a1Var7);
                        y1a1Var7.H.c("[sgtm] Uploading data from app. row_id", valueOf, zzomVar.zzg);
                    }
                    HashMap hashMap = new HashMap();
                    Bundle bundle = zzomVar.zzd;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(str2, string);
                        }
                    }
                    hva1 hva1Var = gVar2.H;
                    g.g(hva1Var);
                    byte[] bArr = zzomVar.zzb;
                    p891 p891Var = new p891(7, jVar, atomicReference2, zzomVar);
                    hva1Var.Ig();
                    cvw.l(url);
                    cvw.l(bArr);
                    aaa1 aaa1Var4 = ((g) hva1Var.b).z;
                    g.g(aaa1Var4);
                    aaa1Var4.Sg(new h3k(hva1Var, str, url, bArr, hashMap, p891Var));
                    try {
                        ieb1 ieb1Var = gVar2.B;
                        g.e(ieb1Var);
                        g gVar3 = (g) ieb1Var.b;
                        gVar3.D.getClass();
                        long currentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long j = 60000; atomicReference2.get() == null && j > 0; j = currentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(j);
                                    gVar3.D.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        y1a1 y1a1Var8 = ((g) jVar.b).y;
                        g.g(y1a1Var8);
                        y1a1Var8.C.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    zzlrVar = atomicReference2.get() == null ? zzlr.UNKNOWN : (zzlr) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    y1a1 y1a1Var9 = ((g) jVar.b).y;
                    g.g(y1a1Var9);
                    y1a1Var9.z.d("[sgtm] Bad upload url for row_id", zzomVar.zzc, Long.valueOf(zzomVar.zza), e);
                    zzlrVar = zzlr.FAILURE;
                }
                if (zzlrVar != zzlr.SUCCESS) {
                    if (zzlrVar == zzlr.BACKOFF) {
                        z = true;
                        break;
                    }
                } else {
                    i2++;
                }
            }
        }
        y1a1 y1a1Var10 = gVar.y;
        g.g(y1a1Var10);
        y1a1Var10.H.c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i), Integer.valueOf(i2));
        eVar.run();
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        zzb();
        g gVar = this.zza;
        if (bundle == null) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.a("Conditional user property must not be null");
        } else {
            j jVar = gVar.F;
            g.f(jVar);
            jVar.Tg(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void setConsent(Bundle bundle, long j) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        jVar.ah(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        zzb();
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        cvw.l(activity);
        setCurrentScreenByScionActivityInfo(zzdf.zza(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r2 <= 500) goto L31;
     */
    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j) throws RemoteException {
        zzb();
        jya1 jya1Var = this.zza.E;
        g.f(jya1Var);
        g gVar = (g) jya1Var.b;
        if (!gVar.w.Ug()) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.E.a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        qwa1 qwa1Var = jya1Var.w;
        if (qwa1Var == null) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.E.a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = jya1Var.z;
        Integer valueOf = Integer.valueOf(zzdfVar.zza);
        if (concurrentHashMap.get(valueOf) == null) {
            y1a1 y1a1Var3 = gVar.y;
            g.g(y1a1Var3);
            y1a1Var3.E.a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = jya1Var.Ng(zzdfVar.zzb);
        }
        String str3 = qwa1Var.b;
        String str4 = qwa1Var.a;
        boolean equals = Objects.equals(str3, str2);
        boolean equals2 = Objects.equals(str4, str);
        if (equals && equals2) {
            y1a1 y1a1Var4 = gVar.y;
            g.g(y1a1Var4);
            y1a1Var4.E.a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                gVar.w.getClass();
            }
            y1a1 y1a1Var5 = gVar.y;
            g.g(y1a1Var5);
            y1a1Var5.E.b(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2.length() > 0) {
            int length2 = str2.length();
            gVar.w.getClass();
            if (length2 <= 500) {
                y1a1 y1a1Var6 = gVar.y;
                g.g(y1a1Var6);
                y1a1Var6.H.c("Setting current screen to name, class", str == null ? "null" : str, str2);
                ieb1 ieb1Var = gVar.B;
                g.e(ieb1Var);
                qwa1 qwa1Var2 = new qwa1(str, str2, ieb1Var.Bh());
                concurrentHashMap.put(valueOf, qwa1Var2);
                jya1Var.Pg(zzdfVar.zzb, qwa1Var2, true);
                return;
            }
        }
        y1a1 y1a1Var7 = gVar.y;
        g.g(y1a1Var7);
        y1a1Var7.E.b(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        jVar.Hg();
        aaa1 aaa1Var = ((g) jVar.b).z;
        g.g(aaa1Var);
        aaa1Var.Pg(new cmk(jVar, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        aaa1 aaa1Var = ((g) jVar.b).z;
        g.g(aaa1Var);
        aaa1Var.Pg(new goa1(jVar, bundle2, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void setEventInterceptor(zzda zzdaVar) throws RemoteException {
        zzb();
        m mVar = new m(this, zzdaVar);
        aaa1 aaa1Var = this.zza.z;
        g.g(aaa1Var);
        boolean Mg = aaa1Var.Mg();
        g gVar = this.zza;
        char c = 1;
        if (!Mg) {
            aaa1 aaa1Var2 = gVar.z;
            g.g(aaa1Var2);
            aaa1Var2.Pg(new e(c == true ? 1 : 0, this, mVar));
            return;
        }
        j jVar = gVar.F;
        g.f(jVar);
        jVar.Gg();
        jVar.Hg();
        yja1 yja1Var = jVar.x;
        if (mVar != yja1Var) {
            cvw.n("EventInterceptor already set.", yja1Var == null);
        }
        jVar.x = mVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void setInstanceIdProvider(zzdc zzdcVar) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        Boolean valueOf = Boolean.valueOf(z);
        jVar.Hg();
        aaa1 aaa1Var = ((g) jVar.b).z;
        g.g(aaa1Var);
        aaa1Var.Pg(new do91((Object) jVar, (Object) valueOf, false, 26));
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        aaa1 aaa1Var = ((g) jVar.b).z;
        g.g(aaa1Var);
        aaa1Var.Pg(new oma1(jVar, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        g gVar = (g) jVar.b;
        Uri data = intent.getData();
        if (data == null) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.F.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            y1a1 y1a1Var2 = gVar.y;
            g.g(y1a1Var2);
            y1a1Var2.F.a("[sgtm] Preview Mode was not enabled.");
            gVar.w.w = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        y1a1 y1a1Var3 = gVar.y;
        g.g(y1a1Var3);
        y1a1Var3.F.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        gVar.w.w = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void setUserId(String str, long j) throws RemoteException {
        zzb();
        j jVar = this.zza.F;
        g.f(jVar);
        g gVar = (g) jVar.b;
        if (str != null && TextUtils.isEmpty(str)) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.C.a("User ID must be non-empty or null");
        } else {
            aaa1 aaa1Var = gVar.z;
            g.g(aaa1Var);
            aaa1Var.Pg(new do91(27, jVar, str));
            jVar.Qg(null, ClidProvider._ID, str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        zzb();
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        j jVar = this.zza.F;
        g.f(jVar);
        jVar.Qg(str, str2, unwrap, z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcq, com.google.android.gms.internal.measurement.zzcr
    public void unregisterOnMeasurementEventListener(zzda zzdaVar) throws RemoteException {
        Object obj;
        zzb();
        Map map = this.zzb;
        synchronized (map) {
            obj = (fka1) map.remove(Integer.valueOf(zzdaVar.zzf()));
        }
        if (obj == null) {
            obj = new o(this, zzdaVar);
        }
        j jVar = this.zza.F;
        g.f(jVar);
        jVar.Hg();
        if (jVar.y.remove(obj)) {
            return;
        }
        y1a1 y1a1Var = ((g) jVar.b).y;
        g.g(y1a1Var);
        y1a1Var.C.a("OnEventListener had not been registered");
    }
}
