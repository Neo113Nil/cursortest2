package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.drm0;
import xsna.s3q0;

/* loaded from: classes8.dex */
public final class Km {
    public final Lm a;
    public volatile NetworkTask b;

    public Km(Lm lm) {
        this.a = lm;
    }

    public final Context b() {
        return this.a.a;
    }

    public final synchronized NetworkTask c() {
        NetworkTask networkTask;
        try {
            try {
                if (g()) {
                    networkTask = this.b;
                    if (networkTask != null && !networkTask.isRemoved()) {
                    }
                    C4996lm d = d();
                    C4859ge c4859ge = C4859ge.a;
                    C4893hm c4893hm = new C4893hm(new C5143re(), C5342za.I.p());
                    FinalConfigProvider finalConfigProvider = new FinalConfigProvider(d);
                    try {
                        NetworkTask networkTask2 = new NetworkTask(new SynchronizedBlockingExecutor(), new B5(this.a.a), new AllHostsExponentialBackoffPolicy(C4859ge.a.a(EnumC4807ee.STARTUP)), new Im(this, new C4738bm(), new FullUrlFormer(c4893hm, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), EmptyList.b, C4859ge.c);
                        this.b = networkTask2;
                        networkTask = networkTask2;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } else {
                    networkTask = null;
                }
                return networkTask;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final C4996lm d() {
        return (C4996lm) this.a.l.a();
    }

    public final C5100pm e() {
        C5100pm c5100pm;
        Sl sl = this.a.l;
        synchronized (sl) {
            c5100pm = sl.c.a;
        }
        return c5100pm;
    }

    public final void f() {
        C5100pm c5100pm;
        Sl sl = this.a.l;
        synchronized (sl) {
            c5100pm = sl.c.a;
        }
        C5203tm c5203tm = c5100pm.c;
        C5177sm a = c5203tm.a(c5203tm.m);
        String str = c5100pm.a;
        String str2 = c5100pm.b;
        zo zoVar = this.a.n;
        String str3 = c5100pm.d;
        zoVar.getClass();
        if (!zo.a(str3)) {
            a.a = this.a.m.a().id;
        }
        String str4 = c5100pm.a;
        if (str4 == null || str4.length() == 0) {
            str = this.a.h.a();
            str2 = "";
        }
        List<String> list = this.a.c.e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        a.g = list;
        C5100pm c5100pm2 = new C5100pm(str, str2, new C5203tm(a));
        b(c5100pm2);
        a(c5100pm2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r0 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:9:0x0010, B:11:0x001b, B:16:0x0035, B:18:0x003d, B:20:0x0045, B:23:0x004e), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean g() {
        boolean z;
        try {
            boolean z2 = false;
            if (C5342za.I.h().isRestrictedForSdk()) {
                return false;
            }
            C5100pm e = e();
            Set set = AbstractC5022mm.a;
            boolean z3 = true;
            if (!e.w) {
                if (AbstractC5022mm.b.currentTimeSeconds() <= e.o + e.z.a) {
                    z = false;
                    if (!z) {
                        if (AbstractC5022mm.a(e.d) && AbstractC5022mm.a(e.a) && AbstractC5022mm.a(e.b)) {
                            z2 = true;
                        }
                        z = !z2;
                        O3 o3 = this.a.k;
                        Map map = d().h;
                        L3 l3 = this.a.j;
                        o3.getClass();
                        boolean a = O3.a(map, e, l3);
                        if (z2) {
                        }
                    }
                    z3 = z;
                    return z3;
                }
            }
            z = true;
            if (!z) {
            }
            z3 = z;
            return z3;
        } finally {
        }
    }

    public final synchronized void h() {
        this.b = null;
    }

    public final C4747c5 a() {
        return this.a.f;
    }

    public final synchronized void b(C5100pm c5100pm) {
        this.a.l.a(c5100pm);
        C5074om c5074om = this.a.g;
        c5074om.b.a(c5100pm.a);
        c5074om.b.b(c5100pm.b);
        c5074om.a.save(c5100pm.c);
        this.a.e.a(c5100pm);
    }

    public final synchronized boolean a(List<String> list, Map<String, String> map) {
        return !AbstractC5022mm.a(e(), list, map, new Jm(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5100pm a(C5048nm c5048nm, C4996lm c4996lm, long j) {
        String str;
        boolean equals;
        String a = Pm.a(c4996lm.h);
        Map map = c4996lm.i.a;
        String str2 = c5048nm.j;
        String str3 = e().k;
        if (!Pm.a(Pm.a(str2))) {
            str2 = Pm.a(Pm.a(str3)) ? str3 : null;
        }
        String str4 = e().a;
        if (str4 != null) {
            str = drm0.N(str4) ? null : str4;
        }
        str = c5048nm.h;
        C5177sm c5177sm = new C5177sm(c5048nm.b);
        String str5 = c5048nm.i;
        c5177sm.o = this.a.i.currentTimeSeconds();
        c5177sm.a = e().d;
        c5177sm.c = c5048nm.d;
        c5177sm.f = c5048nm.c;
        c5177sm.g = c4996lm.e;
        c5177sm.b = c5048nm.e;
        c5177sm.d = c5048nm.f;
        c5177sm.e = c5048nm.g;
        c5177sm.h = c5048nm.n;
        c5177sm.i = c5048nm.o;
        c5177sm.j = str2;
        c5177sm.k = a;
        this.a.k.getClass();
        HashMap a2 = Pm.a(str2);
        if (vo.a(map)) {
            equals = vo.a((Map) a2);
        } else {
            equals = a2.equals(map);
        }
        c5177sm.q = equals;
        c5177sm.l = Pm.a(map);
        c5177sm.r = c5048nm.m;
        c5177sm.n = c5048nm.k;
        c5177sm.s = c5048nm.p;
        c5177sm.p = true;
        c5177sm.t = j;
        C4996lm d = d();
        if (d.n == 0) {
            d.n = j;
        }
        c5177sm.u = d.n;
        c5177sm.v = false;
        c5177sm.w = c5048nm.q;
        c5177sm.x = c5048nm.r;
        c5177sm.y = c5048nm.s;
        c5177sm.z = c5048nm.t;
        c5177sm.A = c5048nm.u;
        c5177sm.B = c5048nm.v;
        return new C5100pm(str, str5, new C5203tm(c5177sm));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0037, B:12:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C5048nm c5048nm, C4996lm c4996lm, Map<String, ? extends List<String>> map) {
        Long l;
        C5100pm a;
        synchronized (this) {
            if (!vo.a((Map) map)) {
                List list = (List) CollectionUtils.getFromMapIgnoreCase(map, "Date");
                if (!vo.a((Collection) list)) {
                    try {
                        l = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                    } catch (Throwable unused) {
                    }
                    long longValue = l == null ? l.longValue() : 0L;
                    AbstractC4865gk.a.a(longValue, c5048nm.l);
                    a = a(c5048nm, c4996lm, longValue);
                    h();
                    b(a);
                    s3q0 s3q0Var = s3q0.a;
                }
            }
            l = null;
            if (l == null) {
            }
            AbstractC4865gk.a.a(longValue, c5048nm.l);
            a = a(c5048nm, c4996lm, longValue);
            h();
            b(a);
            s3q0 s3q0Var2 = s3q0.a;
        }
        a(a);
    }

    public final void a(C5100pm c5100pm) {
        ArrayList arrayList;
        Lm lm = this.a;
        Pl pl = lm.d;
        String str = lm.b;
        synchronized (pl.a.b) {
            try {
                Rl rl = pl.a;
                rl.c = c5100pm;
                Collection collection = (Collection) rl.a.a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC4712am) it.next()).a(c5100pm);
        }
    }

    public final void a(Tl tl) {
        synchronized (this) {
            this.b = null;
        }
        Lm lm = this.a;
        lm.d.a(lm.f.a, tl, e());
    }

    public final synchronized void a(C4944jm c4944jm) {
        try {
            this.a.l.a(c4944jm);
            C4996lm d = d();
            if (d.k) {
                List list = d.j;
                if (list != null && !list.isEmpty()) {
                    if (!vo.a(list, d.e)) {
                        C5100pm e = e();
                        C5203tm c5203tm = e.c;
                        C5177sm a = c5203tm.a(c5203tm.m);
                        String str = e.a;
                        String str2 = e.b;
                        a.g = list;
                        C5100pm c5100pm = new C5100pm(str, str2, new C5203tm(a));
                        b(c5100pm);
                        a(c5100pm);
                    }
                }
                if (d.e != null && (!r5.isEmpty())) {
                    C5100pm e2 = e();
                    C5203tm c5203tm2 = e2.c;
                    C5177sm a2 = c5203tm2.a(c5203tm2.m);
                    String str3 = e2.a;
                    String str4 = e2.b;
                    a2.g = null;
                    C5100pm c5100pm2 = new C5100pm(str3, str4, new C5203tm(a2));
                    b(c5100pm2);
                    a(c5100pm2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
