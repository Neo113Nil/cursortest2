package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.mlkit_vision_text_common.o;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsb;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.a;
import defpackage.ap91;
import defpackage.ebb1;
import defpackage.g7b1;
import defpackage.gsy0;
import defpackage.i971;
import defpackage.j591;
import defpackage.kd91;
import defpackage.kz;
import defpackage.na91;
import defpackage.np91;
import defpackage.ny61;
import defpackage.o3;
import defpackage.vp91;
import defpackage.w511;
import defpackage.y6b1;
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
public final class gsy0 extends c000 {
    public static final itx0 h = new itx0();
    public static boolean i = true;
    public final uxa1 d;
    public final o e;
    public final btb1 f;
    public final fsy0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsy0(o oVar, uxa1 uxa1Var, fsy0 fsy0Var) {
        super(h);
        fsy0Var.getClass();
        this.e = oVar;
        this.d = uxa1Var;
        this.f = new btb1(qk20.c().b(), 0);
        this.g = fsy0Var;
    }

    @Override // defpackage.u430
    public final synchronized void b() {
        this.d.zzb();
    }

    @Override // defpackage.u430
    public final synchronized void c() {
        i = true;
        this.d.zzc();
    }

    @Override // defpackage.c000
    public final Object d(xzv xzvVar) {
        njy0 a;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a = this.d.a(xzvVar);
                e(zzou.NO_ERROR, elapsedRealtime, xzvVar);
                i = false;
            } catch (MlKitException e) {
                e(e.a() == 14 ? zzou.MODEL_NOT_DOWNLOADED : zzou.UNKNOWN_ERROR, elapsedRealtime, xzvVar);
                throw e;
            }
        }
        return a;
    }

    public final void e(zzou zzouVar, long j, xzv xzvVar) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.e.b(new bqe0(this, elapsedRealtime, zzouVar, xzvVar), zzov.ON_DEVICE_TEXT_DETECT);
        fp91 fp91Var = new fp91();
        fp91Var.a = zzouVar;
        fp91Var.b = Boolean.valueOf(i);
        jnb1 jnb1Var = new jnb1();
        this.g.getClass();
        jnb1Var.a = zzsb.LATIN;
        fp91Var.c = new qnb1(jnb1Var);
        final np91 np91Var = new np91(fp91Var);
        final i971 i971Var = new i971(29, this);
        final zzov zzovVar = zzov.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
        Executor c = a.c();
        final o oVar = this.e;
        c.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.n
            @Override // java.lang.Runnable
            public final void run() {
                final o oVar2 = o.this;
                HashMap hashMap = oVar2.j;
                final zzov zzovVar2 = zzovVar;
                if (!hashMap.containsKey(zzovVar2)) {
                    zzba zzbaVar = new zzba();
                    zzao zzaoVar = new zzao();
                    if (!zzbaVar.isEmpty()) {
                        w511.q();
                        throw null;
                    }
                    zzaoVar.c = zzbaVar;
                    hashMap.put(zzovVar2, zzaoVar);
                }
                kd91 kd91Var = (na91) hashMap.get(zzovVar2);
                Long valueOf = Long.valueOf(elapsedRealtime);
                zzba zzbaVar2 = (zzba) ((zzal) kd91Var).c;
                np91 np91Var2 = np91Var;
                Collection collection = (Collection) zzbaVar2.get(np91Var2);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(valueOf)) {
                        ny61.f("New Collection violated the Collection spec");
                        return;
                    }
                    zzbaVar2.put(np91Var2, arrayList);
                } else {
                    collection.add(valueOf);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (oVar2.d(zzovVar2, elapsedRealtime2)) {
                    oVar2.i.put(zzovVar2, Long.valueOf(elapsedRealtime2));
                    Executor c2 = com.google.mlkit.common.sdkinternal.a.c();
                    final i971 i971Var2 = i971Var;
                    c2.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            o oVar3 = o.this;
                            HashMap hashMap2 = oVar3.j;
                            zzov zzovVar3 = zzovVar2;
                            kd91 kd91Var2 = (na91) hashMap2.get(zzovVar3);
                            if (kd91Var2 != null) {
                                f fVar = (f) kd91Var2;
                                d dVar = fVar.a;
                                if (dVar == null) {
                                    zzal zzalVar = (zzal) fVar;
                                    d dVar2 = new d(zzalVar, zzalVar.c);
                                    fVar.a = dVar2;
                                    dVar = dVar2;
                                }
                                Iterator it = dVar.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    zzaa zzaaVar = (zzaa) kd91Var2;
                                    Object obj = (Collection) ((zzba) zzaaVar.c).get(next);
                                    if (obj == null) {
                                        obj = new ArrayList(3);
                                    }
                                    List list = (List) obj;
                                    ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new j591(zzaaVar, next, list, null) : new e(zzaaVar, next, list, null));
                                    Collections.sort(arrayList2);
                                    y6b1 y6b1Var = new y6b1();
                                    Iterator it2 = arrayList2.iterator();
                                    long j2 = 0;
                                    while (it2.hasNext()) {
                                        j2 += ((Long) it2.next()).longValue();
                                    }
                                    y6b1Var.c = Long.valueOf((j2 / arrayList2.size()) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    y6b1Var.a = Long.valueOf(o.a(100.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    y6b1Var.f = Long.valueOf(o.a(75.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    y6b1Var.e = Long.valueOf(o.a(50.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    y6b1Var.d = Long.valueOf(o.a(25.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    y6b1Var.b = Long.valueOf(o.a(0.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    g7b1 g7b1Var = new g7b1(y6b1Var);
                                    int size = arrayList2.size();
                                    gsy0 gsy0Var = (gsy0) i971Var2.b;
                                    np91 np91Var3 = (np91) next;
                                    ebb1 ebb1Var = new ebb1();
                                    ebb1Var.c = gsy0Var.g.a() ? zzot.TYPE_THICK : zzot.TYPE_THIN;
                                    ap91 ap91Var = new ap91();
                                    ap91Var.b = Integer.valueOf(size & Integer.MAX_VALUE);
                                    ap91Var.a = np91Var3;
                                    ap91Var.c = g7b1Var;
                                    ebb1Var.f = new vp91(ap91Var);
                                    com.google.mlkit.common.sdkinternal.a.c().execute(new kz(oVar3, new o3(ebb1Var, 0), zzovVar3, oVar3.c(), 17));
                                }
                                hashMap2.remove(zzovVar3);
                            }
                        }
                    });
                }
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - elapsedRealtime;
        btb1 btb1Var = this.f;
        int i2 = this.g.a() ? 24317 : 24306;
        int zza = zzouVar.zza();
        synchronized (btb1Var) {
            AtomicLong atomicLong = btb1Var.b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - btb1Var.b.get() <= 1800000) {
                return;
            }
            btb1Var.a.e(new TelemetryData(0, Arrays.asList(new MethodInvocation(i2, zza, 0, j2, currentTimeMillis, null, null, 0, -1)))).d(new qgg(btb1Var, elapsedRealtime2, 13));
        }
    }
}
