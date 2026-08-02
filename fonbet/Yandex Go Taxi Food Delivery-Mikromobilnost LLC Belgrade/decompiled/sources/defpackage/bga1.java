package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.k;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zznz;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzoa;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzob;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zztz;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzub;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzud;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzue;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzuf;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzuh;
import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzuj;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.a;
import defpackage.kz;
import defpackage.l8b1;
import defpackage.mk91;
import defpackage.n3b1;
import defpackage.n991;
import defpackage.ny61;
import defpackage.o3;
import defpackage.o891;
import defpackage.ol91;
import defpackage.ujb1;
import defpackage.v3b1;
import defpackage.w511;
import defpackage.yk91;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public final class bga1 extends c000 {
    public static final Feature[] k = {bg70.e};
    public static final dab1 l = dab1.H;
    public final Context d;
    public final ezu0 e;
    public final k f;
    public final q8b1 g;
    public boolean h = true;
    public boolean i;
    public zzub j;

    public bga1(qk20 qk20Var, ezu0 ezu0Var, k kVar, q8b1 q8b1Var) {
        cvw.m(qk20Var, "MlKitContext can not be null");
        cvw.m(ezu0Var, "SubjectSegmenterOptions can not be null");
        this.d = qk20Var.b();
        this.e = ezu0Var;
        this.f = kVar;
        this.g = q8b1Var;
    }

    @Override // defpackage.u430
    public final synchronized void b() {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Context context = this.d;
            Feature[] featureArr = k;
            if (!bg70.a(context, featureArr)) {
                if (!this.i) {
                    bg70.d(this.d, featureArr);
                    this.i = true;
                }
                e(zzoa.OPTIONAL_MODULE_NOT_AVAILABLE, elapsedRealtime);
                throw new MlKitException("Waiting for the subject segmentation optional module to be downloaded. Please wait.", 14);
            }
            try {
                if (this.j == null) {
                    zzue zza = zzud.zza(gan.c(this.d, gan.b, "com.google.android.gms.mlkit_subject_segmentation").b("com.google.android.gms.mlkit.segmentation.subject.SubjectSegmenterCreator"));
                    IObjectWrapper wrap = ObjectWrapper.wrap(this.d);
                    this.e.getClass();
                    this.e.getClass();
                    this.j = zza.zzd(wrap, new zzuj(false, false, this.e.a, false, false));
                }
                try {
                    this.j.zze();
                    e(zzoa.NO_ERROR, elapsedRealtime);
                } catch (RemoteException e) {
                    e(zzoa.OPTIONAL_MODULE_INIT_ERROR, elapsedRealtime);
                    throw new MlKitException(13, e, "Failed to init module subject segmenter");
                }
            } catch (Exception e2) {
                e(zzoa.OPTIONAL_MODULE_CREATE_ERROR, elapsedRealtime);
                throw new MlKitException(13, e2, "Failed to load subject segmentation module");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.u430
    public final synchronized void c() {
        try {
            zzub zzubVar = this.j;
            if (zzubVar != null) {
                zzubVar.zzf();
            }
        } catch (RemoteException unused) {
            Log.e("SubjectSegmenterTask", "Failed to release subject segmenter");
        } finally {
            this.j = null;
        }
        this.h = true;
        k kVar = this.f;
        zzob zzobVar = zzob.ON_DEVICE_SUBJECT_SEGMENTATION_CLOSE;
        kVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (kVar.d(zzobVar, elapsedRealtime)) {
            kVar.i.put(zzobVar, Long.valueOf(elapsedRealtime));
            l8b1 l8b1Var = new l8b1();
            l8b1Var.c = zznz.TYPE_THIN;
            a.c().execute(new kz(kVar, new o3(l8b1Var, 0), zzobVar, kVar.c(), 16));
        }
    }

    @Override // defpackage.c000
    public final Object d(xzv xzvVar) {
        bga1 bga1Var;
        Throwable th;
        xzv xzvVar2;
        synchronized (this) {
            try {
                cvw.m(xzvVar, "Input image can not be null");
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzub zzubVar = this.j;
                cvw.l(zzubVar);
                try {
                    zzuh zzd = zzubVar.zzd(dab1.i(xzvVar), new zztz(xzvVar.g, xzvVar.d, xzvVar.e, qnc.a(xzvVar.f), SystemClock.elapsedRealtime()));
                    ArrayList arrayList = new ArrayList();
                    if (this.e.a) {
                        try {
                            for (zzuf zzufVar : zzd.zzc()) {
                                float[] zzf = zzufVar.zzf();
                                if (zzf != null) {
                                    FloatBuffer allocate = FloatBuffer.allocate(zzf.length);
                                    allocate.put(zzf);
                                    allocate.rewind();
                                }
                                zzufVar.zze();
                                arrayList.add(new wyu0(zzufVar.zzd(), zzufVar.zza(), zzufVar.zzb(), zzufVar.zzc()));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bga1Var = this;
                            throw th;
                        }
                    }
                    bga1Var = this;
                    xzvVar2 = xzvVar;
                    try {
                        try {
                            bga1Var.f(zzoa.NO_ERROR, elapsedRealtime, this.h, xzvVar2, zzd);
                            bga1Var.h = false;
                            float[] zzd2 = zzd.zzd();
                            if (zzd2 != null) {
                                try {
                                    try {
                                        try {
                                            FloatBuffer allocate2 = FloatBuffer.allocate(zzd2.length);
                                            allocate2.put(zzd2);
                                            allocate2.rewind();
                                        } catch (RemoteException e) {
                                            e = e;
                                            bga1Var.f(zzoa.OPTIONAL_MODULE_INFERENCE_ERROR, elapsedRealtime, bga1Var.h, xzvVar2, null);
                                            throw new MlKitException(13, e, "Failed to run thin subject segmenter.");
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                } catch (RemoteException e2) {
                                    e = e2;
                                }
                            }
                            zzd.zza();
                            azu0 azu0Var = new azu0(arrayList);
                            return azu0Var;
                        } catch (RemoteException e3) {
                            e = e3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        throw th;
                    }
                } catch (RemoteException e4) {
                    e = e4;
                    bga1Var = this;
                    xzvVar2 = xzvVar;
                }
            } catch (Throwable th5) {
                th = th5;
                bga1Var = this;
            }
        }
    }

    public final void e(zzoa zzoaVar, long j) {
        this.f.b(new vjx(j, this, zzoaVar), zzob.ON_DEVICE_SUBJECT_SEGMENTATION_LOAD);
    }

    public final void f(zzoa zzoaVar, long j, boolean z, xzv xzvVar, zzuh zzuhVar) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f.b(new ufg(this, elapsedRealtime, zzoaVar, z, xzvVar, zzuhVar), zzob.ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE);
        qk91 qk91Var = new qk91();
        qk91Var.c = this.e.a();
        qk91Var.a = zzoaVar;
        qk91Var.b = Boolean.valueOf(z);
        final yk91 yk91Var = new yk91(qk91Var);
        final zzob zzobVar = zzob.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
        Executor c = a.c();
        final k kVar = this.f;
        c.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_subject_segmentation.j
            @Override // java.lang.Runnable
            public final void run() {
                final k kVar2 = k.this;
                HashMap hashMap = kVar2.j;
                final zzob zzobVar2 = zzobVar;
                if (!hashMap.containsKey(zzobVar2)) {
                    zzal zzalVar = new zzal();
                    zzz zzzVar = new zzz();
                    if (!zzalVar.isEmpty()) {
                        w511.q();
                        throw null;
                    }
                    zzzVar.c = zzalVar;
                    hashMap.put(zzobVar2, zzzVar);
                }
                n991 n991Var = (o891) hashMap.get(zzobVar2);
                Long valueOf = Long.valueOf(elapsedRealtime);
                zzal zzalVar2 = (zzal) ((zzw) n991Var).c;
                yk91 yk91Var2 = yk91Var;
                Collection collection = (Collection) zzalVar2.get(yk91Var2);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(valueOf)) {
                        ny61.f("New Collection violated the Collection spec");
                        return;
                    }
                    zzalVar2.put(yk91Var2, arrayList);
                } else {
                    collection.add(valueOf);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (kVar2.d(zzobVar2, elapsedRealtime2)) {
                    kVar2.i.put(zzobVar2, Long.valueOf(elapsedRealtime2));
                    com.google.mlkit.common.sdkinternal.a.c().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_subject_segmentation.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            k kVar3 = k.this;
                            HashMap hashMap2 = kVar3.j;
                            zzob zzobVar3 = zzobVar2;
                            n991 n991Var2 = (o891) hashMap2.get(zzobVar3);
                            if (n991Var2 != null) {
                                m mVar = (m) n991Var2;
                                h hVar = mVar.a;
                                if (hVar == null) {
                                    zzw zzwVar = (zzw) mVar;
                                    h hVar2 = new h(zzwVar, zzwVar.c);
                                    mVar.a = hVar2;
                                    hVar = hVar2;
                                }
                                Iterator it = hVar.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    zzl zzlVar = (zzl) n991Var2;
                                    Object obj = (Collection) ((zzal) zzlVar.c).get(next);
                                    if (obj == null) {
                                        obj = new ArrayList(3);
                                    }
                                    List list = (List) obj;
                                    ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new ujb1(zzlVar, next, list, null) : new l(zzlVar, next, list, null));
                                    Collections.sort(arrayList2);
                                    n3b1 n3b1Var = new n3b1();
                                    Iterator it2 = arrayList2.iterator();
                                    long j2 = 0;
                                    while (it2.hasNext()) {
                                        j2 += ((Long) it2.next()).longValue();
                                    }
                                    n3b1Var.c = Long.valueOf((j2 / arrayList2.size()) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    n3b1Var.a = Long.valueOf(k.a(100.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    n3b1Var.f = Long.valueOf(k.a(75.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    n3b1Var.e = Long.valueOf(k.a(50.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    n3b1Var.d = Long.valueOf(k.a(25.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    n3b1Var.b = Long.valueOf(k.a(0.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    v3b1 v3b1Var = new v3b1(n3b1Var);
                                    int size = arrayList2.size();
                                    l8b1 l8b1Var = new l8b1();
                                    l8b1Var.c = zznz.TYPE_THIN;
                                    mk91 mk91Var = new mk91();
                                    mk91Var.b = Integer.valueOf(size & Integer.MAX_VALUE);
                                    mk91Var.a = (yk91) next;
                                    mk91Var.c = v3b1Var;
                                    l8b1Var.g = new ol91(mk91Var);
                                    com.google.mlkit.common.sdkinternal.a.c().execute(new kz(kVar3, new o3(l8b1Var, 0), zzobVar3, kVar3.c(), 16));
                                }
                                hashMap2.remove(zzobVar3);
                            }
                        }
                    });
                }
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - elapsedRealtime;
        q8b1 q8b1Var = this.g;
        int zza = zzoaVar.zza();
        synchronized (q8b1Var) {
            AtomicLong atomicLong = q8b1Var.b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - q8b1Var.b.get() <= 1800000) {
                return;
            }
            q8b1Var.a.e(new TelemetryData(0, Arrays.asList(new MethodInvocation(24336, zza, 0, j2, currentTimeMillis, null, null, 0)))).d(new qgg(q8b1Var, elapsedRealtime2, 12));
        }
    }
}
