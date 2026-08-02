package xsna;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import android.util.Log;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.api.generated.GsonHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.irk0;
import xsna.wuk0;

/* compiled from: StatImpl.kt */
/* loaded from: classes11.dex */
public final class fsk0 extends irk0 {
    public irk0.a d;
    public wwk g;
    public o8f0 l;
    public wwk m;
    public volatile epf n;
    public volatile boolean o;
    public boolean r;
    public volatile lb3 t;
    public final String c = "StatLog:";
    public volatile AtomicReference<m0q> e = new AtomicReference<>(new m0q());
    public volatile AtomicReference<m0q> f = new AtomicReference<>(new m0q());
    public final bpn0 h = new bpn0(new mu2(this, 6));
    public final bpn0 i = new bpn0(new iw00(this, 5));
    public final bpn0 j = new bpn0(new uy2(this, 9));
    public izs<? super String, ? extends ExecutorService> k = irk0.b;
    public final CountDownLatch p = new CountDownLatch(1);
    public gzs<UserId> q = new mb3(16);
    public final SecureRandom s = new SecureRandom();

    public static final void g(final fsk0 fsk0Var, final boolean z, final boolean z2, boolean z3, rrk0 rrk0Var, final qyp qypVar) {
        final UserId invoke = fsk0Var.q.invoke();
        Runnable runnable = new Runnable() { // from class: xsna.bsk0
            @Override // java.lang.Runnable
            public final void run() {
                epf epfVar;
                qyp qypVar2 = qyp.this;
                fsk0 fsk0Var2 = fsk0Var;
                boolean z4 = z;
                boolean z5 = z2;
                UserId userId = invoke;
                if (qypVar2.a.length() == 0) {
                    return;
                }
                if (fsk0Var2.r) {
                    wwk wwkVar = fsk0Var2.m;
                    if (wwkVar != null) {
                        m0q m0qVar = (z5 ? fsk0Var2.e : fsk0Var2.f).get();
                        if (qypVar2.a.length() != 0) {
                            m0qVar.getClass();
                            String b = wuk0.a.b(new wuk0(m0qVar.b, m0qVar.c));
                            SQLiteDatabase writableDatabase = wwkVar.getWritableDatabase();
                            writableDatabase.beginTransactionNonExclusive();
                            try {
                                wwkVar.n(wwk.j(z4, z5), qypVar2, userId);
                                wwkVar.h(wwk.k(z5));
                                wwkVar.n(wwk.k(z5), new qyp(b, qypVar2.b), userId);
                                writableDatabase.setTransactionSuccessful();
                            } finally {
                                writableDatabase.endTransaction();
                            }
                        }
                    }
                } else {
                    wwk wwkVar2 = fsk0Var2.m;
                    if (wwkVar2 != null && qypVar2.a.length() != 0) {
                        wwkVar2.n(wwk.j(z4, z5), qypVar2, userId);
                    }
                }
                if (!z5 && (epfVar = fsk0Var2.n) != null) {
                    epfVar.b();
                }
                if (z4) {
                    if (z5) {
                        fsk0Var2.j(new esk0(1, fsk0Var2, fsk0.class, "sendProductEvents", "sendProductEvents(ZZLkotlin/jvm/functions/Function0;)V", 0), true);
                    } else {
                        fsk0Var2.j(new kms(fsk0Var2), true);
                    }
                }
            }
        };
        bpn0 bpn0Var = fsk0Var.h;
        Future<?> submit = ((ExecutorService) bpn0Var.getValue()).submit(runnable);
        if (rrk0Var.a()) {
            try {
                submit.get(2000L, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (!z3 || fsk0Var.r) {
            return;
        }
        ((ExecutorService) bpn0Var.getValue()).submit(new hhv(fsk0Var, qypVar.b, invoke, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(fsk0 fsk0Var, boolean z, boolean z2, gzs gzsVar, int i) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            gzsVar = null;
        }
        fsk0Var.h(z, false, z2, gzsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void k(fsk0 fsk0Var, boolean z, boolean z2, gzs gzsVar, int i) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            gzsVar = null;
        }
        fsk0Var.h(z, true, z2, gzsVar);
    }

    @Override // xsna.irk0
    public final void a(final rrk0 rrk0Var, final boolean z, final boolean z2, Long l) {
        long a;
        final dti dtiVar;
        qo qoVar;
        if (f()) {
            irk0.a aVar = this.d;
            Boolean bool = (aVar == null || (qoVar = aVar.c) == null) ? null : (Boolean) qoVar.invoke();
            epf epfVar = this.n;
            if (epfVar != null) {
                r3 = epfVar.a(rrk0Var, bool == null || !bool.booleanValue());
            }
        }
        if (r3) {
            final boolean b = rrk0Var.b();
            if (l != null) {
                a = l.longValue();
            } else {
                this.d.e.getClass();
                a = qni0.a();
            }
            final m0q m0qVar = (b ? this.e : this.f).get();
            irk0.a aVar2 = this.d;
            if (aVar2 == null || (dtiVar = aVar2.a) == null) {
                throw new IllegalStateException("Null event generator!");
            }
            if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                final long j = a;
                ((ExecutorService) this.j.getValue()).execute(new Runnable() { // from class: xsna.ask0
                    @Override // java.lang.Runnable
                    public final void run() {
                        zyp zypVar = dtiVar;
                        long j2 = j;
                        rrk0 rrk0Var2 = rrk0Var;
                        qyp a2 = zypVar.a(j2, rrk0Var2, m0qVar);
                        fsk0 fsk0Var = fsk0.this;
                        fsk0Var.getClass();
                        if (a2.b.a.equals("NO_PLATFORM")) {
                            a2 = null;
                        }
                        qyp qypVar = a2;
                        if (qypVar != null) {
                            fsk0.g(fsk0Var, z, b, z2, rrk0Var2, qypVar);
                        }
                    }
                });
            } else {
                qyp a2 = dtiVar.a(a, rrk0Var, m0qVar);
                qyp qypVar = !a2.b.a.equals("NO_PLATFORM") ? a2 : null;
                if (qypVar != null) {
                    g(this, z, b, z2, rrk0Var, qypVar);
                }
            }
            lb3 lb3Var = this.t;
            if (lb3Var != null) {
                lb3Var.invoke(rrk0Var);
            }
        }
    }

    public final void b() {
        epf epfVar = this.n;
        if (epfVar != null) {
            epfVar.clear();
        }
        wwk wwkVar = this.m;
        if (wwkVar != null) {
            SQLiteDatabase writableDatabase = wwkVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                xwk.c(writableDatabase, new g1j(writableDatabase, 2));
                wwk.b(writableDatabase);
                s3q0 s3q0Var = s3q0.a;
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        }
    }

    public final void c(final boolean z, final boolean z2, final kgl0 kgl0Var) {
        try {
            ((ExecutorService) this.h.getValue()).submit(new Runnable() { // from class: xsna.zrk0
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z3 = z;
                    boolean z4 = z2;
                    kgl0 kgl0Var2 = kgl0Var;
                    wwk wwkVar = fsk0.this.m;
                    if (wwkVar != null) {
                        try {
                            String j = wwk.j(z3, z4);
                            Collection collection = kgl0Var2.b;
                            if (collection == null) {
                                collection = EmptyList.b;
                            }
                            Collection collection2 = collection;
                            Iterable iterable = kgl0Var2.c;
                            if (iterable == null) {
                                iterable = EmptyList.b;
                            }
                            ArrayList u0 = j5g.u0(iterable, collection2);
                            wwkVar.getClass();
                            Iterator it = u0.iterator();
                            while (it.hasNext()) {
                                wwkVar.getWritableDatabase().execSQL(zil0.a(((Number) it.next()).intValue(), "DELETE FROM ", j, " WHERE id = "));
                            }
                        } catch (Throwable th) {
                            th.toString();
                        }
                    }
                }
            }).get(10000L, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0139 A[LOOP:2: B:32:0x0133->B:34:0x0139, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(irk0.a aVar, boolean z, boolean z2, eta0 eta0Var, boolean z3) {
        kgl0 c;
        boolean z4;
        dz2 x;
        Iterator it;
        epf epfVar;
        do {
            wwk wwkVar = this.m;
            if (wwkVar == null) {
                return;
            }
            c = wwkVar.c(wwk.j(z, z2), eta0Var);
            if (z3 && c.e < aVar.j) {
                return;
            }
            Map<UserId, List<x9y>> map = c.a;
            if (map == null || map.isEmpty()) {
                c(z, z2, c);
                return;
            }
            Map<UserId, List<x9y>> map2 = c.a;
            if (map2 != null) {
                boolean z5 = false;
                for (Map.Entry<UserId, List<x9y>> entry : map2.entrySet()) {
                    UserId key = entry.getKey();
                    List<x9y> value = entry.getValue();
                    aVar.d.getClass();
                    String s = key != null ? o25.a().s(key) : null;
                    if (eta0Var.a.equals("SAK")) {
                        if (o25.a().b()) {
                            ufx ufxVar = new ufx("statEvents.addSAKMobile", new xr(29), new trk0(0));
                            ufx.n(ufxVar, "events", GsonHolder.a().toJson(value), 0, 12);
                            x = yfb.x(ufxVar);
                            if (s != null) {
                                x.l = s;
                                x.m = null;
                            }
                        } else {
                            ufx ufxVar2 = new ufx("statEvents.addSAKMobileAnonymously", new lby(), new x9());
                            ufx.n(ufxVar2, "events", GsonHolder.a().toJson(value), 0, 12);
                            x = yfb.x(ufxVar2);
                            x.d = true;
                        }
                    } else if (o25.a().b()) {
                        ufx ufxVar3 = new ufx("statEvents.add", new tr(26), new ggj0(2));
                        ufx.n(ufxVar3, "events", GsonHolder.a().toJson(value), 0, 12);
                        x = yfb.x(ufxVar3);
                        if (s != null) {
                            x.l = s;
                            x.m = null;
                        }
                    } else {
                        ufx ufxVar4 = new ufx("statEvents.addAnonymously", new bxj0(1), new ky80(6));
                        ufx.n(ufxVar4, "events", GsonHolder.a().toJson(value), 0, 12);
                        x = yfb.x(ufxVar4);
                        x.d = true;
                        it = RegistrationStatParamsFactory.a().iterator();
                        while (it.hasNext()) {
                            Pair pair = (Pair) it.next();
                            x.j((String) pair.d(), (String) pair.g());
                        }
                        x.n = true;
                        if (x.u(0L) == null) {
                            c(z, z2, c);
                            if (z2 || ((epfVar = this.n) != null && epfVar.b())) {
                                List<Integer> list = c.b;
                                if (list != null) {
                                    list.size();
                                }
                                j5g.g0(value, StringUtils.COMMA, null, null, 0, null, 62);
                            }
                            z5 = true;
                        } else {
                            c(z, z2, new kgl0(11, null, c.c));
                        }
                    }
                    it = RegistrationStatParamsFactory.a().iterator();
                    while (it.hasNext()) {
                    }
                    x.n = true;
                    if (x.u(0L) == null) {
                    }
                }
                z4 = z5;
            } else {
                z4 = false;
            }
            if (!z4 && c.d && aVar.k) {
                return;
            }
        } while (c.d);
    }

    public final void e(jx40 jx40Var) {
        j(new csk0(0, jx40Var, this), false);
    }

    public final boolean f() {
        return this.d != null;
    }

    public final void h(final boolean z, final boolean z2, final boolean z3, final gzs<s3q0> gzsVar) {
        if (f()) {
            int i = Calendar.getInstance().get(12);
            int i2 = Calendar.getInstance().get(13);
            if (((i != 59 || i2 <= 45) && (i != 0 || i2 >= 15)) || this.s.nextInt(6) <= 0) {
                ((ExecutorService) this.h.getValue()).submit(new Runnable() { // from class: xsna.dsk0
                    /* JADX WARN: Removed duplicated region for block: B:20:0x002c A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x000a, B:8:0x0010, B:14:0x0019, B:16:0x001d, B:20:0x002c, B:33:0x004b, B:36:0x004f, B:23:0x0030, B:27:0x0046), top: B:2:0x000a, inners: #1 }] */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x004f A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x000a, B:8:0x0010, B:14:0x0019, B:16:0x001d, B:20:0x002c, B:33:0x004b, B:36:0x004f, B:23:0x0030, B:27:0x0046), top: B:2:0x000a, inners: #1 }] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        boolean z4;
                        final fsk0 fsk0Var = this;
                        final boolean z5 = z2;
                        final boolean z6 = z;
                        final boolean z7 = z3;
                        final gzs gzsVar2 = gzsVar;
                        try {
                            if (fsk0Var.m != null && !fsk0Var.o) {
                                boolean z8 = true;
                                if (z5) {
                                    epf epfVar = fsk0Var.n;
                                    if (epfVar != null ? epfVar.c() : false) {
                                        z4 = true;
                                        if (z4) {
                                            ((ExecutorService) fsk0Var.i.getValue()).execute(new Runnable() { // from class: xsna.yrk0
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    fsk0 fsk0Var2 = fsk0Var;
                                                    boolean z9 = z6;
                                                    boolean z10 = z5;
                                                    boolean z11 = z7;
                                                    try {
                                                        irk0.a aVar = fsk0Var2.d;
                                                        if (aVar != null) {
                                                            Iterator<eta0> it = aVar.b.iterator();
                                                            while (it.hasNext()) {
                                                                fsk0Var2.d(aVar, z9, z10, it.next(), z11);
                                                            }
                                                        }
                                                        gzs gzsVar3 = gzsVar2;
                                                        if (gzsVar3 != null) {
                                                            gzsVar3.invoke();
                                                        }
                                                    } catch (Throwable th) {
                                                        Log.e(fsk0Var2.c, "Send events error=" + th);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        wwk wwkVar = fsk0Var.m;
                                        if (wwkVar != null) {
                                            try {
                                                String j = wwk.j(z6, z5);
                                                if (DatabaseUtils.queryNumEntries(wwkVar.getReadableDatabase(), j) != 0) {
                                                    z8 = false;
                                                }
                                                if (z8) {
                                                    return;
                                                }
                                                wwkVar.h(j);
                                                return;
                                            } catch (Throwable th) {
                                                th.toString();
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                }
                                z4 = false;
                                if (z4) {
                                }
                            }
                        } catch (Throwable th2) {
                            Log.e(fsk0Var.c, "restore events error=" + th2);
                        }
                    }
                });
            }
        }
    }

    public final void j(izs izsVar, boolean z) {
        o8f0 o8f0Var = this.l;
        if (o8f0Var != null) {
            vj80 vj80Var = new vj80(z, 0L, izsVar);
            vj80Var.e = o8f0Var.b;
            vj80Var.a();
        }
    }
}
