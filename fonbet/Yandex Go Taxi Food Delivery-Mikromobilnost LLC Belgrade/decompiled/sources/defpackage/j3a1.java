package defpackage;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_face.n;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.a;
import defpackage.ad91;
import defpackage.aj91;
import defpackage.c691;
import defpackage.fla1;
import defpackage.j3a1;
import defpackage.kj91;
import defpackage.kz;
import defpackage.lm71;
import defpackage.ny61;
import defpackage.o3;
import defpackage.rqa1;
import defpackage.sj91;
import defpackage.uka1;
import defpackage.va91;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public final class j3a1 extends c000 {
    public static final AtomicBoolean j = new AtomicBoolean(true);
    public static final dab1 k = dab1.H;
    public final r7p d;
    public final n e;
    public final q8b1 f;
    public final g891 g;
    public boolean h;
    public final z06 i = new z06();

    public j3a1(n nVar, r7p r7pVar, g891 g891Var) {
        cvw.m(r7pVar, "FaceDetectorOptions can not be null");
        this.d = r7pVar;
        this.e = nVar;
        this.g = g891Var;
        this.f = new q8b1(qk20.c().b(), 0);
    }

    public static void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((i7p) it.next()).b = -1;
        }
    }

    @Override // defpackage.u430
    public final synchronized void b() {
        this.h = this.g.zzd();
    }

    @Override // defpackage.u430
    public final synchronized void c() {
        try {
            this.g.zzb();
            j.set(true);
            n nVar = this.e;
            rqa1 rqa1Var = new rqa1();
            rqa1Var.c = this.h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN;
            a.c().execute(new kz(nVar, new o3(rqa1Var, 0), zzkt.ON_DEVICE_FACE_CLOSE, nVar.c(), 14));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        defpackage.cvw.l(r0);
        r6 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011a A[Catch: all -> 0x002b, MlKitException -> 0x002e, Merged into TryCatch #1 {all -> 0x002b, MlKitException -> 0x002e, blocks: (B:4:0x0005, B:6:0x000e, B:10:0x0021, B:11:0x002a, B:14:0x0033, B:16:0x010a, B:22:0x0120, B:25:0x011a, B:26:0x0110, B:28:0x0041, B:29:0x0045, B:30:0x004e, B:32:0x0054, B:33:0x005f, B:35:0x0065, B:37:0x006f, B:39:0x0073, B:41:0x0079, B:43:0x00ca, B:44:0x00d2, B:46:0x00d8, B:50:0x00ec, B:57:0x00f9, B:62:0x0102, B:65:0x012b, B:67:0x0133, B:69:0x013a, B:70:0x0143, B:71:0x0137), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0110 A[Catch: all -> 0x002b, MlKitException -> 0x002e, Merged into TryCatch #1 {all -> 0x002b, MlKitException -> 0x002e, blocks: (B:4:0x0005, B:6:0x000e, B:10:0x0021, B:11:0x002a, B:14:0x0033, B:16:0x010a, B:22:0x0120, B:25:0x011a, B:26:0x0110, B:28:0x0041, B:29:0x0045, B:30:0x004e, B:32:0x0054, B:33:0x005f, B:35:0x0065, B:37:0x006f, B:39:0x0073, B:41:0x0079, B:43:0x00ca, B:44:0x00d2, B:46:0x00d8, B:50:0x00ec, B:57:0x00f9, B:62:0x0102, B:65:0x012b, B:67:0x0133, B:69:0x013a, B:70:0x0143, B:71:0x0137), top: B:3:0x0005 }] */
    @Override // defpackage.c000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(xzv xzvVar) {
        long elapsedRealtime;
        List list;
        Collection arrayList;
        List list2;
        List list3;
        Rect rect;
        synchronized (this) {
            try {
                elapsedRealtime = SystemClock.elapsedRealtime();
                this.i.a(xzvVar);
                Pair a = this.g.a(xzvVar);
                List<i7p> list4 = (List) a.first;
                List<i7p> list5 = (List) a.second;
                if (list4 == null && list5 == null) {
                    throw new MlKitException("No detector is enabled", 13);
                }
                if (list5 == null) {
                    List list6 = list4;
                    list = list5;
                    list2 = list4;
                    arrayList = list6;
                    f(zzks.NO_ERROR, elapsedRealtime, xzvVar, list != null ? 0 : list.size(), list2 != null ? 0 : list2.size());
                    j.set(false);
                } else {
                    HashSet hashSet = new HashSet();
                    for (i7p i7pVar : list5) {
                        boolean z = false;
                        for (i7p i7pVar2 : list4) {
                            Rect rect2 = i7pVar.a;
                            if (rect2 == null || (rect = i7pVar2.a) == null || !rect2.intersect(rect)) {
                                list3 = list5;
                            } else {
                                list3 = list5;
                                double min = (Math.min(rect2.bottom, rect.bottom) - Math.max(rect2.top, rect.top)) * (Math.min(rect2.right, rect.right) - Math.max(rect2.left, rect.left));
                                if (min / ((((rect2.bottom - rect2.top) * (rect2.right - rect2.left)) + ((rect.bottom - rect.top) * (rect.right - rect.left))) - min) > 0.6d) {
                                    SparseArray sparseArray = i7pVar.j;
                                    SparseArray sparseArray2 = i7pVar2.j;
                                    sparseArray2.clear();
                                    for (int i = 0; i < sparseArray.size(); i++) {
                                        sparseArray2.put(sparseArray.keyAt(i), (j7p) sparseArray.valueAt(i));
                                    }
                                    z = true;
                                }
                            }
                            hashSet.add(i7pVar2);
                            list5 = list3;
                        }
                        List list7 = list5;
                        if (!z) {
                            hashSet.add(i7pVar);
                        }
                        list5 = list7;
                    }
                    list = list5;
                    arrayList = new ArrayList(hashSet);
                    list2 = list4;
                    f(zzks.NO_ERROR, elapsedRealtime, xzvVar, list != null ? 0 : list.size(), list2 != null ? 0 : list2.size());
                    j.set(false);
                }
            } catch (MlKitException e) {
                f(e.a() == 14 ? zzks.MODEL_NOT_DOWNLOADED : zzks.UNKNOWN_ERROR, elapsedRealtime, xzvVar, 0, 0);
                throw e;
            } finally {
            }
        }
        return arrayList;
    }

    public final synchronized void f(zzks zzksVar, long j2, xzv xzvVar, int i, int i2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
        this.e.b(new hcs0(this, elapsedRealtime, zzksVar, i, i2, xzvVar), zzkt.ON_DEVICE_FACE_DETECT);
        dj91 dj91Var = new dj91();
        dj91Var.a = zzksVar;
        dj91Var.b = Boolean.valueOf(j.get());
        dj91Var.d = Integer.valueOf(i & Integer.MAX_VALUE);
        dj91Var.e = Integer.valueOf(i2 & Integer.MAX_VALUE);
        dj91Var.c = aga1.a(this.d);
        final kj91 kj91Var = new kj91(dj91Var);
        final lm71 lm71Var = new lm71(24, this);
        final n nVar = this.e;
        final zzkt zzktVar = zzkt.AGGREGATED_ON_DEVICE_FACE_DETECTION;
        a.c().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_face.l
            @Override // java.lang.Runnable
            public final void run() {
                final n nVar2 = n.this;
                HashMap hashMap = nVar2.j;
                final zzkt zzktVar2 = zzktVar;
                if (!hashMap.containsKey(zzktVar2)) {
                    zzbd zzbdVar = new zzbd();
                    zzas zzasVar = new zzas();
                    if (!zzbdVar.isEmpty()) {
                        w511.q();
                        throw null;
                    }
                    zzasVar.c = zzbdVar;
                    hashMap.put(zzktVar2, zzasVar);
                }
                ad91 ad91Var = (va91) hashMap.get(zzktVar2);
                Long valueOf = Long.valueOf(elapsedRealtime);
                zzap zzapVar = (zzap) ad91Var;
                zzbd zzbdVar2 = (zzbd) zzapVar.c;
                kj91 kj91Var2 = kj91Var;
                Collection collection = (Collection) zzbdVar2.get(kj91Var2);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(valueOf)) {
                        ny61.f("New Collection violated the Collection spec");
                        return;
                    } else {
                        zzapVar.w++;
                        zzbdVar2.put(kj91Var2, arrayList);
                    }
                } else if (collection.add(valueOf)) {
                    zzapVar.w++;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (nVar2.d(zzktVar2, elapsedRealtime2)) {
                    nVar2.i.put(zzktVar2, Long.valueOf(elapsedRealtime2));
                    Executor c = com.google.mlkit.common.sdkinternal.a.c();
                    final lm71 lm71Var2 = lm71Var;
                    c.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_face.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            n nVar3 = n.this;
                            HashMap hashMap2 = nVar3.j;
                            zzkt zzktVar3 = zzktVar2;
                            ad91 ad91Var2 = (va91) hashMap2.get(zzktVar3);
                            if (ad91Var2 != null) {
                                g gVar = (g) ad91Var2;
                                d dVar = gVar.a;
                                if (dVar == null) {
                                    zzap zzapVar2 = (zzap) gVar;
                                    d dVar2 = new d(zzapVar2, zzapVar2.c);
                                    gVar.a = dVar2;
                                    dVar = dVar2;
                                }
                                Iterator it = dVar.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    zzae zzaeVar = (zzae) ad91Var2;
                                    Object obj = (Collection) ((zzbd) zzaeVar.c).get(next);
                                    if (obj == null) {
                                        obj = new ArrayList(3);
                                    }
                                    List list = (List) obj;
                                    ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new c691(zzaeVar, next, list, null) : new f(zzaeVar, next, list, null));
                                    Collections.sort(arrayList2);
                                    uka1 uka1Var = new uka1();
                                    Iterator it2 = arrayList2.iterator();
                                    long j3 = 0;
                                    while (it2.hasNext()) {
                                        j3 += ((Long) it2.next()).longValue();
                                    }
                                    uka1Var.c = Long.valueOf((j3 / arrayList2.size()) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    uka1Var.a = Long.valueOf(n.a(100.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    uka1Var.f = Long.valueOf(n.a(75.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    uka1Var.e = Long.valueOf(n.a(50.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    uka1Var.d = Long.valueOf(n.a(25.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    uka1Var.b = Long.valueOf(n.a(0.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    fla1 fla1Var = new fla1(uka1Var);
                                    int size = arrayList2.size();
                                    j3a1 j3a1Var = (j3a1) lm71Var2.b;
                                    kj91 kj91Var3 = (kj91) next;
                                    rqa1 rqa1Var = new rqa1();
                                    rqa1Var.c = j3a1Var.h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN;
                                    aj91 aj91Var = new aj91();
                                    aj91Var.b = Integer.valueOf(size & Integer.MAX_VALUE);
                                    aj91Var.a = kj91Var3;
                                    aj91Var.c = fla1Var;
                                    rqa1Var.f = new sj91(aj91Var);
                                    com.google.mlkit.common.sdkinternal.a.c().execute(new kz(nVar3, new o3(rqa1Var, 0), zzktVar3, nVar3.c(), 14));
                                }
                                hashMap2.remove(zzktVar3);
                            }
                        }
                    });
                }
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        this.f.b(true != this.h ? 24303 : 24304, zzksVar.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }
}
