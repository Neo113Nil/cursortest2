package xsna;

import android.os.Handler;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.queue.sync.utils.InterruptionType;
import com.vk.queue.sync.utils.RecoverableException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import xsna.acc;
import xsna.ise0;

/* compiled from: QueueSyncWorker.kt */
/* loaded from: classes5.dex */
public final class ise0 {
    public final zqe0 a;
    public final qre0 b;
    public final ExecutorService c;
    public final wuj d;
    public final gzs<dox> e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final bzw i;
    public final fv90 j;
    public final vlc0 k;
    public final bpn0 l = new bpn0(new y84(21));

    /* compiled from: QueueSyncWorker.kt */
    public static final class a extends Exception {
        public static final long serialVersionUID = 8479387458275842941L;
    }

    public ise0(zqe0 zqe0Var, qre0 qre0Var, ExecutorService executorService, wuj wujVar, gzs gzsVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, bzw bzwVar, fv90 fv90Var, vlc0 vlc0Var) {
        this.a = zqe0Var;
        this.b = qre0Var;
        this.c = executorService;
        this.d = wujVar;
        this.e = gzsVar;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = arrayList3;
        this.i = bzwVar;
        this.j = fv90Var;
        this.k = vlc0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0160 A[Catch: all -> 0x015a, TRY_LEAVE, TryCatch #1 {all -> 0x015a, blocks: (B:31:0x0145, B:33:0x014b, B:35:0x0151, B:40:0x0160, B:42:0x017e), top: B:30:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ArrayList arrayList) {
        boolean z;
        ArrayList arrayList2;
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((zwm0) it.next()).b);
        }
        zqe0 zqe0Var = this.a;
        ExecutorService executorService = this.c;
        wuj wujVar = this.d;
        final nre0 nre0Var = new nre0(zqe0Var, executorService, wujVar);
        Collection values = this.b.a(hashSet).values();
        izs<? super Map<xqe0, ? extends List<? extends JSONObject>>, s3q0> ml1Var = new ml1(24, arrayList, this);
        izs<? super Map<xqe0, xqe0>, s3q0> b140Var = new b140(this, 12);
        if (values.isEmpty()) {
            throw new IllegalArgumentException("AccessParams are empty, nothing to observe");
        }
        wujVar.e("Prepare to start sync for " + values.size() + " queues");
        ArrayList a2 = acc.a.a(values);
        wujVar.e("Queues are split into " + a2.size() + " chunks");
        int size = a2.size();
        if (size == 0) {
            throw new IllegalStateException("Empty chunks");
        }
        if (size == 1) {
            wujVar.e("Chunks number is 1. Run sync loop on current thread");
            nre0Var.a("queue-sync-manager-slave-observer-1", (acc) a2.get(0), ml1Var, b140Var);
            throw null;
        }
        wujVar.e("Chunks number is " + a2.size() + ". Run each chunk on separate thread, handle their events on current thread");
        Object obj = new Object();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        final yl0 yl0Var = new yl0(21, obj, linkedHashMap);
        final com.vk.movika.sdk.base.logic.interactor.i iVar = new com.vk.movika.sdk.base.logic.interactor.i(25, obj, linkedHashMap2);
        final b7 b7Var = new b7(20, obj, arrayList3);
        ArrayList arrayList4 = new ArrayList(c5g.u(a2, 10));
        Iterator it2 = a2.iterator();
        ArrayList arrayList5 = arrayList3;
        final int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            final acc accVar = (acc) next;
            ArrayList arrayList6 = arrayList4;
            arrayList6.add(new Runnable() { // from class: xsna.mre0
                @Override // java.lang.Runnable
                public final void run() {
                    nre0 nre0Var2 = nre0.this;
                    acc accVar2 = accVar;
                    yl0 yl0Var2 = yl0Var;
                    com.vk.movika.sdk.base.logic.interactor.i iVar2 = iVar;
                    b7 b7Var2 = b7Var;
                    String a3 = lhg.a(i, "queue-sync-manager-slave-observer-");
                    String name = Thread.currentThread().getName();
                    try {
                        try {
                            Thread.currentThread().setName(a3);
                            nre0Var2.a(a3, accVar2, yl0Var2, iVar2);
                            throw null;
                        } catch (Exception e) {
                            b7Var2.invoke(e);
                            Thread.currentThread().setName(name);
                        }
                    } catch (Throwable th) {
                        Thread.currentThread().setName(name);
                        throw th;
                    }
                }
            });
            arrayList4 = arrayList6;
            linkedHashMap2 = linkedHashMap2;
            arrayList5 = arrayList5;
            i = i2;
        }
        ArrayList arrayList7 = arrayList4;
        ArrayList arrayList8 = arrayList5;
        LinkedHashMap linkedHashMap3 = linkedHashMap2;
        ExecutorService executorService2 = nre0Var.b;
        Handler handler = owi.a;
        ArrayList arrayList9 = new ArrayList(c5g.u(arrayList7, 10));
        Iterator it3 = arrayList7.iterator();
        while (it3.hasNext()) {
            arrayList9.add(executorService2.submit((Runnable) it3.next()));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        ArrayList arrayList10 = new ArrayList();
        while (true) {
            synchronized (obj) {
                try {
                    if (linkedHashMap.isEmpty() && linkedHashMap3.isEmpty() && arrayList8.isEmpty()) {
                        z = false;
                        if (z) {
                            arrayList2 = arrayList8;
                            try {
                                obj.wait();
                            } catch (Throwable th) {
                                th = th;
                            }
                        } else {
                            linkedHashMap4.putAll(linkedHashMap);
                            linkedHashMap5.putAll(linkedHashMap3);
                            arrayList2 = arrayList8;
                            arrayList10.addAll(arrayList2);
                            linkedHashMap.clear();
                            linkedHashMap3.clear();
                            arrayList2.clear();
                        }
                        th = null;
                        s3q0 s3q0Var = s3q0.a;
                    }
                    z = true;
                    if (z) {
                    }
                    th = null;
                    s3q0 s3q0Var2 = s3q0.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (th != null) {
                Iterator it4 = arrayList9.iterator();
                while (it4.hasNext()) {
                    ((Future) it4.next()).cancel(true);
                }
                s3q0 s3q0Var3 = s3q0.a;
                throw th;
            }
            if (z) {
                if (!arrayList10.isEmpty()) {
                    Iterator it5 = arrayList9.iterator();
                    while (it5.hasNext()) {
                        ((Future) it5.next()).cancel(true);
                    }
                    s3q0 s3q0Var4 = s3q0.a;
                    throw ((Throwable) arrayList10.get(0));
                }
                try {
                    if (!linkedHashMap4.isEmpty()) {
                        ml1Var.invoke(linkedHashMap4);
                    }
                    if (!linkedHashMap5.isEmpty()) {
                        b140Var.invoke(linkedHashMap5);
                    }
                    linkedHashMap4.clear();
                    linkedHashMap5.clear();
                    arrayList10.clear();
                } catch (Throwable th3) {
                    Iterator it6 = arrayList9.iterator();
                    while (it6.hasNext()) {
                        ((Future) it6.next()).cancel(true);
                    }
                    s3q0 s3q0Var5 = s3q0.a;
                    throw th3;
                }
            }
            arrayList8 = arrayList2;
        }
    }

    public final void b() {
        HashMap hashMap;
        boolean z;
        if (this.f.isEmpty()) {
            qre0 qre0Var = this.b;
            synchronized (qre0Var) {
                qre0Var.a.clear();
            }
            return;
        }
        ArrayList arrayList = this.f;
        final HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((zwm0) it.next()).b);
        }
        ArrayList arrayList2 = new ArrayList();
        qre0 qre0Var2 = this.b;
        synchronized (qre0Var2) {
            try {
                hashMap = new HashMap(qre0Var2.a);
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        arrayList2.addAll(hashMap.keySet());
        arrayList2.removeAll(hashSet);
        this.b.b(arrayList2);
        final dox invoke = this.e.invoke();
        final boolean z2 = invoke == null;
        for (zwm0 zwm0Var : this.g) {
            InterruptionType j = sdy.j(z2);
            if (j.i()) {
                if (invoke != null) {
                    invoke.invoke("RESUBSCRIBE", Boolean.valueOf(j.h()));
                    return;
                }
                return;
            } else {
                ig igVar = zwm0Var.d;
                try {
                    s3q0 s3q0Var = s3q0.a;
                } finally {
                    if (!z) {
                        this.i.invoke(zwm0Var);
                    }
                }
                this.i.invoke(zwm0Var);
            }
        }
        final Set R0 = j5g.R0(this.h);
        c("syncLoop", new gzs() { // from class: xsna.fse0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.gzs
            public final Object invoke() {
                final HashSet hashSet2;
                boolean z3;
                final ise0 ise0Var = ise0.this;
                HashSet hashSet3 = hashSet;
                Set<zwm0> set = R0;
                final boolean z4 = z2;
                final dox doxVar = invoke;
                Boolean bool = (Boolean) ise0Var.c("releasePreviousConnections", new ys40(z4, doxVar, ise0Var, hashSet3));
                Boolean bool2 = Boolean.TRUE;
                if (!epx.f(bool, bool2)) {
                    return s3q0.a;
                }
                qre0 qre0Var3 = ise0Var.b;
                synchronized (qre0Var3) {
                    hashSet2 = new HashSet();
                    hashSet2.addAll(hashSet3);
                    hashSet2.removeAll(qre0Var3.a.keySet());
                }
                if (!epx.f((Boolean) ise0Var.c("refreshAccessParams", new gzs() { // from class: xsna.gse0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.gzs
                    public final Object invoke() {
                        boolean z5;
                        boolean z6 = z4;
                        dox doxVar2 = doxVar;
                        ise0 ise0Var2 = ise0Var;
                        HashSet hashSet4 = hashSet2;
                        InterruptionType j2 = sdy.j(z6);
                        if (j2.i()) {
                            if (doxVar2 != null) {
                                doxVar2.invoke("REFRESH_ACCESS_PARAMS", Boolean.valueOf(j2.h()));
                            }
                            z5 = false;
                        } else {
                            qre0 qre0Var4 = ise0Var2.b;
                            zqe0 zqe0Var = ise0Var2.a;
                            if (((Boolean) ise0Var2.l.getValue()).booleanValue()) {
                                Object obj = zqe0Var.a(hashSet4).a;
                                synchronized (qre0Var4) {
                                    qre0Var4.a.putAll(obj);
                                }
                            } else {
                                Map<? extends String, ? extends xqe0> d = zqe0Var.d(hashSet4);
                                synchronized (qre0Var4) {
                                    qre0Var4.a.putAll(d);
                                }
                            }
                            z5 = true;
                        }
                        return Boolean.valueOf(z5);
                    }
                }), bool2)) {
                    return s3q0.a;
                }
                int size = ise0Var.f.size();
                for (int i = 0; i < size && i < size; i++) {
                    zwm0 zwm0Var2 = (zwm0) ise0Var.f.get(i);
                    if (hashSet2.contains(zwm0Var2.b)) {
                        set.add(zwm0Var2);
                    }
                }
                for (zwm0 zwm0Var3 : set) {
                    InterruptionType j2 = sdy.j(z4);
                    if (j2.i()) {
                        if (doxVar != null) {
                            doxVar.invoke("INVALIDATE_SUBSCRIBERS", Boolean.valueOf(j2.h()));
                        }
                        return s3q0.a;
                    }
                    try {
                        zwm0Var3.e.invoke();
                    } finally {
                        if (!z3) {
                            ise0Var.j.invoke(zwm0Var3);
                        }
                    }
                    ise0Var.j.invoke(zwm0Var3);
                }
                set.clear();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                if (!epx.f((Boolean) ise0Var.c("observeEvents", new hse0(z4, doxVar, ise0Var, ref$ObjectRef)), Boolean.TRUE)) {
                    return s3q0.a;
                }
                Exception exc = (Exception) ref$ObjectRef.element;
                if (exc == null) {
                    throw new IllegalStateException("gotoSyncLoopException must be not null");
                }
                throw new ise0.a(exc);
            }
        });
    }

    public final <T> T c(String str, gzs<? extends T> gzsVar) {
        laq laqVar = new laq(16, TimeUnit.SECONDS.toMillis(2L), 2.0f, TimeUnit.MINUTES.toMillis(10L));
        while (true) {
            try {
                this.k.invoke(Long.valueOf(laqVar.g));
                laqVar.e();
                T invoke = gzsVar.invoke();
                this.k.invoke(0L);
                return invoke;
            } catch (VKApiExecutionException e) {
                if (e.s() == 10) {
                    laqVar.a(laqVar.d);
                } else {
                    laqVar.b();
                }
                this.d.d(e);
                d(e);
            } catch (IllegalArgumentException e2) {
                this.d.d(e2);
                d(e2);
                return null;
            } catch (InterruptedException e3) {
                throw e3;
            } catch (a e4) {
                laqVar.b();
                this.d.d(e4);
                d(e4);
            } catch (Throwable th) {
                laqVar.b();
                this.d.h("Unexpected error during queue sync cycle: ".concat(str), th);
                d(th);
            }
        }
    }

    public final void d(Throwable th) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((zwm0) it.next()).c(new RecoverableException(th));
        }
    }
}
