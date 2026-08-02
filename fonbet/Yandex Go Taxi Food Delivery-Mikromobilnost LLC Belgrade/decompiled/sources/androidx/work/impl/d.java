package androidx.work.impl;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import androidx.room.RoomDatabase;
import androidx.room.util.a;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.d;
import defpackage.b64;
import defpackage.brd;
import defpackage.c0w;
import defpackage.csf0;
import defpackage.e0w;
import defpackage.fa51;
import defpackage.ffx;
import defpackage.fgw0;
import defpackage.guy;
import defpackage.hdu0;
import defpackage.hgz;
import defpackage.ia51;
import defpackage.jse;
import defpackage.juy;
import defpackage.jzz0;
import defpackage.kuy;
import defpackage.l8x;
import defpackage.lv21;
import defpackage.m951;
import defpackage.n2x0;
import defpackage.ny61;
import defpackage.ong;
import defpackage.ooc;
import defpackage.oyr;
import defpackage.qo6;
import defpackage.s8x;
import defpackage.sa51;
import defpackage.scc;
import defpackage.seu;
import defpackage.sjh;
import defpackage.t2s;
import defpackage.t951;
import defpackage.ta51;
import defpackage.tje;
import defpackage.tls;
import defpackage.u0e;
import defpackage.ua51;
import defpackage.unr0;
import defpackage.va51;
import defpackage.xnh;
import defpackage.xw91;
import defpackage.y951;
import defpackage.ya51;
import defpackage.ycc;
import defpackage.ywi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class d {
    public final fa51 a;
    public final Context b;
    public final String c;
    public final WorkerParameters.a d;
    public final t951 e;
    public final u0e f;
    public final n2x0 g;
    public final t2s h;
    public final WorkDatabase i;
    public final ia51 j;
    public final ywi k;
    public final ArrayList l;
    public final String m;
    public final s8x n;

    public d(sa51 sa51Var) {
        fa51 fa51Var = sa51Var.e;
        this.a = fa51Var;
        this.b = sa51Var.g;
        String str = fa51Var.a;
        this.c = str;
        this.d = sa51Var.h;
        this.e = sa51Var.b;
        u0e u0eVar = sa51Var.a;
        this.f = u0eVar;
        this.g = u0eVar.d;
        this.h = sa51Var.c;
        WorkDatabase workDatabase = sa51Var.d;
        this.i = workDatabase;
        this.j = workDatabase.X0();
        this.k = workDatabase.S0();
        ArrayList arrayList = sa51Var.f;
        this.l = arrayList;
        this.m = oyr.t(unr0.x("Work [ id=", str, ", tags={ "), kotlin.collections.a.X(arrayList, ",", null, null, null, 62), " } ]");
        this.n = kotlinx.coroutines.a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(final d dVar, ContinuationImpl continuationImpl) {
        WorkerWrapper$runWorker$1 workerWrapper$runWorker$1;
        int i;
        String str;
        CoroutineSingletons coroutineSingletons;
        c0w c0wVar;
        WorkerWrapper$runWorker$1 workerWrapper$runWorker$12;
        ong a;
        u0e u0eVar;
        Throwable th;
        String str2;
        CancellationException e;
        hgz g;
        String str3 = dVar.m;
        String str4 = dVar.c;
        t951 t951Var = dVar.e;
        WorkDatabase workDatabase = dVar.i;
        u0e u0eVar2 = dVar.f;
        fa51 fa51Var = dVar.a;
        if (continuationImpl instanceof WorkerWrapper$runWorker$1) {
            workerWrapper$runWorker$1 = (WorkerWrapper$runWorker$1) continuationImpl;
            int i2 = workerWrapper$runWorker$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                workerWrapper$runWorker$1.label = i2 - Integer.MIN_VALUE;
                Object obj = workerWrapper$runWorker$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = workerWrapper$runWorker$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    xw91 xw91Var = u0eVar2.o;
                    xnh xnhVar = u0eVar2.e;
                    xw91Var.getClass();
                    final boolean a2 = jzz0.a();
                    final String str5 = fa51Var.x;
                    String str6 = fa51Var.c;
                    String str7 = fa51Var.d;
                    if (a2 && str5 != null) {
                        xw91 xw91Var2 = u0eVar2.o;
                        int hashCode = fa51Var.hashCode();
                        xw91Var2.getClass();
                        Trace.beginAsyncSection(ffx.f0(str5), hashCode);
                    }
                    final int i3 = 0;
                    str = str3;
                    if (((Boolean) workDatabase.P0(new csf0(14, new Callable(dVar) { // from class: qa51
                        public final /* synthetic */ d b;

                        {
                            this.b = dVar;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i4 = i3;
                            d dVar2 = this.b;
                            switch (i4) {
                                case 0:
                                    fa51 fa51Var2 = dVar2.a;
                                    WorkInfo$State workInfo$State = fa51Var2.b;
                                    WorkInfo$State workInfo$State2 = WorkInfo$State.ENQUEUED;
                                    if (workInfo$State != workInfo$State2) {
                                        String str8 = ya51.a;
                                        hgz.g().getClass();
                                        return Boolean.TRUE;
                                    }
                                    if (fa51Var2.c() || (fa51Var2.b == workInfo$State2 && fa51Var2.k > 0)) {
                                        dVar2.g.getClass();
                                        if (System.currentTimeMillis() < fa51Var2.a()) {
                                            hgz g2 = hgz.g();
                                            String str9 = ya51.a;
                                            g2.getClass();
                                            return Boolean.TRUE;
                                        }
                                    }
                                    return Boolean.FALSE;
                                default:
                                    ia51 ia51Var = dVar2.j;
                                    String str10 = dVar2.c;
                                    boolean z = false;
                                    if (ia51Var.c(str10) == WorkInfo$State.ENQUEUED) {
                                        ia51Var.g(WorkInfo$State.RUNNING, str10);
                                        ((Number) a.b(ia51Var.a, false, true, new brd(str10, 23))).intValue();
                                        ia51Var.h(str10, -256);
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                            }
                        }
                    }))).booleanValue()) {
                        return new va51((Object) null);
                    }
                    if (fa51Var.c()) {
                        a = fa51Var.e;
                        workerWrapper$runWorker$12 = workerWrapper$runWorker$1;
                        coroutineSingletons = coroutineSingletons2;
                    } else {
                        u0eVar2.f.getClass();
                        String str8 = e0w.a;
                        try {
                            c0wVar = (c0w) Class.forName(str7).getDeclaredConstructor(null).newInstance(null);
                            coroutineSingletons = coroutineSingletons2;
                        } catch (Exception e2) {
                            coroutineSingletons = coroutineSingletons2;
                            hgz.g().f(e0w.a, "Trouble instantiating ".concat(str7), e2);
                            c0wVar = null;
                        }
                        if (c0wVar == null) {
                            hgz.g().e(ya51.a, "Could not create Input Merger ".concat(str7));
                            return new ta51(0);
                        }
                        workerWrapper$runWorker$12 = workerWrapper$runWorker$1;
                        a = c0wVar.a(kotlin.collections.a.m0((List) androidx.room.util.a.b(dVar.j.a, true, false, new brd(str4, 21)), Collections.singletonList(fa51Var.e)));
                    }
                    UUID fromString = UUID.fromString(str4);
                    ArrayList arrayList = dVar.l;
                    WorkerParameters.a aVar = dVar.d;
                    int i4 = fa51Var.k;
                    ExecutorService executorService = u0eVar2.a;
                    sjh sjhVar = u0eVar2.b;
                    u0eVar = u0eVar2;
                    y951 y951Var = new y951(workDatabase, t951Var);
                    m951 m951Var = new m951(workDatabase, dVar.h, t951Var);
                    WorkerParameters workerParameters = new WorkerParameters();
                    workerParameters.a = fromString;
                    workerParameters.b = a;
                    workerParameters.c = new HashSet(arrayList);
                    workerParameters.d = aVar;
                    workerParameters.e = i4;
                    workerParameters.f = executorService;
                    workerParameters.g = sjhVar;
                    workerParameters.h = t951Var;
                    workerParameters.i = xnhVar;
                    workerParameters.j = y951Var;
                    workerParameters.k = m951Var;
                    try {
                        final kuy a3 = xnhVar.a(dVar.b, str6, workerParameters);
                        a3.setUsed();
                        l8x l8xVar = (l8x) workerWrapper$runWorker$12.get_context().get(seu.C);
                        l8xVar.w(new tls() { // from class: ra51
                            @Override // defpackage.tls
                            public final Object invoke(Object obj2) {
                                String str9;
                                Throwable th2 = (Throwable) obj2;
                                if (th2 instanceof WorkerStoppedException) {
                                    kuy.this.stop(((WorkerStoppedException) th2).getReason());
                                }
                                if (a2 && (str9 = str5) != null) {
                                    d dVar2 = dVar;
                                    xw91 xw91Var3 = dVar2.f.o;
                                    int hashCode2 = dVar2.a.hashCode();
                                    xw91Var3.getClass();
                                    Trace.endAsyncSection(ffx.f0(str9), hashCode2);
                                }
                                return zy11.a;
                            }
                        });
                        final int i5 = 1;
                        if (((Boolean) workDatabase.P0(new csf0(14, new Callable(dVar) { // from class: qa51
                            public final /* synthetic */ d b;

                            {
                                this.b = dVar;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i42 = i5;
                                d dVar2 = this.b;
                                switch (i42) {
                                    case 0:
                                        fa51 fa51Var2 = dVar2.a;
                                        WorkInfo$State workInfo$State = fa51Var2.b;
                                        WorkInfo$State workInfo$State2 = WorkInfo$State.ENQUEUED;
                                        if (workInfo$State != workInfo$State2) {
                                            String str82 = ya51.a;
                                            hgz.g().getClass();
                                            return Boolean.TRUE;
                                        }
                                        if (fa51Var2.c() || (fa51Var2.b == workInfo$State2 && fa51Var2.k > 0)) {
                                            dVar2.g.getClass();
                                            if (System.currentTimeMillis() < fa51Var2.a()) {
                                                hgz g2 = hgz.g();
                                                String str9 = ya51.a;
                                                g2.getClass();
                                                return Boolean.TRUE;
                                            }
                                        }
                                        return Boolean.FALSE;
                                    default:
                                        ia51 ia51Var = dVar2.j;
                                        String str10 = dVar2.c;
                                        boolean z = false;
                                        if (ia51Var.c(str10) == WorkInfo$State.ENQUEUED) {
                                            ia51Var.g(WorkInfo$State.RUNNING, str10);
                                            ((Number) a.b(ia51Var.a, false, true, new brd(str10, 23))).intValue();
                                            ia51Var.h(str10, -256);
                                            z = true;
                                        }
                                        return Boolean.valueOf(z);
                                }
                            }
                        }))).booleanValue() && !l8xVar.isCancelled()) {
                            jse o = ooc.o(t951Var.d);
                            try {
                                WorkerWrapper$runWorker$result$1 workerWrapper$runWorker$result$1 = new WorkerWrapper$runWorker$result$1(dVar, a3, m951Var, null);
                                WorkerWrapper$runWorker$1 workerWrapper$runWorker$13 = workerWrapper$runWorker$12;
                                workerWrapper$runWorker$13.L$0 = workerParameters;
                                workerWrapper$runWorker$13.label = 1;
                                obj = tje.k0(o, workerWrapper$runWorker$result$1, workerWrapper$runWorker$13);
                                CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                                if (obj == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                            } catch (CancellationException e3) {
                                e = e3;
                                str2 = str;
                                String str9 = ya51.a;
                                g = hgz.g();
                                String j = b64.j(str2, " was cancelled");
                                if (g.a <= 4) {
                                }
                                throw e;
                            } catch (Throwable th2) {
                                th = th2;
                                String str10 = ya51.a;
                                hgz.g().f(str10, str + " failed because it threw an exception/error", th);
                                u0eVar.getClass();
                                return new ta51(0);
                            }
                        }
                        return new va51((Object) null);
                    } catch (Throwable unused) {
                        String str11 = ya51.a;
                        hgz.g().e(str11, "Could not create Worker " + str6);
                        return new ta51(0);
                    }
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    kotlin.b.b(obj);
                    str = str3;
                    u0eVar = u0eVar2;
                } catch (CancellationException e4) {
                    e = e4;
                    str2 = str3;
                    String str92 = ya51.a;
                    g = hgz.g();
                    String j2 = b64.j(str2, " was cancelled");
                    if (g.a <= 4) {
                        Log.i(str92, j2, e);
                    }
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    str = str3;
                    u0eVar = u0eVar2;
                    String str102 = ya51.a;
                    hgz.g().f(str102, str + " failed because it threw an exception/error", th);
                    u0eVar.getClass();
                    return new ta51(0);
                }
                return new ua51((juy) obj);
            }
        }
        workerWrapper$runWorker$1 = new WorkerWrapper$runWorker$1(dVar, continuationImpl);
        Object obj2 = workerWrapper$runWorker$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = workerWrapper$runWorker$1.label;
        if (i != 0) {
        }
        return new ua51((juy) obj2);
    }

    public final void b(int i) {
        WorkInfo$State workInfo$State = WorkInfo$State.ENQUEUED;
        ia51 ia51Var = this.j;
        String str = this.c;
        ia51Var.g(workInfo$State, str);
        this.g.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        RoomDatabase roomDatabase = ia51Var.a;
        androidx.room.util.a.b(roomDatabase, false, true, new qo6(currentTimeMillis, str, 26));
        androidx.room.util.a.b(roomDatabase, false, true, new hdu0(str, this.a.v, 2));
        ia51Var.f(-1L, str);
        ia51Var.h(str, i);
    }

    public final void c() {
        this.g.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        ia51 ia51Var = this.j;
        RoomDatabase roomDatabase = ia51Var.a;
        String str = this.c;
        androidx.room.util.a.b(roomDatabase, false, true, new qo6(currentTimeMillis, str, 26));
        ia51Var.g(WorkInfo$State.ENQUEUED, str);
        RoomDatabase roomDatabase2 = ia51Var.a;
        ((Number) androidx.room.util.a.b(roomDatabase2, false, true, new lv21(str, 7))).intValue();
        androidx.room.util.a.b(roomDatabase2, false, true, new hdu0(str, this.a.v, 2));
        androidx.room.util.a.b(roomDatabase2, false, true, new lv21(str, 8));
        ia51Var.f(-1L, str);
    }

    public final void d(juy juyVar) {
        String str = this.c;
        ArrayList i = scc.i(str);
        while (true) {
            boolean isEmpty = i.isEmpty();
            ia51 ia51Var = this.j;
            if (isEmpty) {
                ong a = ((guy) juyVar).a();
                androidx.room.util.a.b(ia51Var.a, false, true, new hdu0(str, this.a.v, 2));
                androidx.room.util.a.b(ia51Var.a, false, true, new fgw0(7, a, str));
                return;
            }
            String str2 = (String) ycc.z(i);
            if (ia51Var.c(str2) != WorkInfo$State.CANCELLED) {
                ia51Var.g(WorkInfo$State.FAILED, str2);
            }
            i.addAll(this.k.a(str2));
        }
    }
}
