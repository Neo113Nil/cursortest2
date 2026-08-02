package xsna;

import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.taz0;
import xsna.u3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class jfz0 {
    public static final AtomicBoolean j = new AtomicBoolean(false);
    public static long k = 7200000;
    public final Executor a;
    public final taz0 b;
    public final u3z0 c;
    public final qjz0 e;
    public final idy0 f;
    public Handler g = null;
    public final ArrayList i = new ArrayList();
    public final int d = 10;
    public final int h = 4;

    public jfz0(Executor executor, taz0 taz0Var, u3z0 u3z0Var, qjz0 qjz0Var, idy0 idy0Var) {
        this.a = executor;
        this.b = taz0Var;
        this.c = u3z0Var;
        this.e = qjz0Var;
        this.f = idy0Var;
    }

    public final void a(final String str, final String str2, long j2, final e7z0 e7z0Var, final nl nlVar) {
        Throwable th;
        boolean z;
        boolean z2;
        u3z0.a aVar;
        String str3 = e7z0Var.a.a;
        vfz0 vfz0Var = ziz0.a;
        if (TextUtils.isEmpty(str2)) {
            z2 = false;
        } else {
            synchronized (ziz0.a(str3)) {
                try {
                    Set set = (Set) ziz0.b.get(str3);
                    if (set != null) {
                        try {
                            if (set.contains(str2)) {
                                z = true;
                                z2 = z;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    z = false;
                    z2 = z;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        if (z2) {
            new eez0(str, str2, e7z0Var).f();
        }
        if (j.get()) {
            this.b.a(str, str2, j2, k + j2, e7z0Var, z2);
            b(nlVar);
            return;
        }
        final boolean z3 = z2;
        u3z0 u3z0Var = this.c;
        int i = this.d;
        qjz0 qjz0Var = this.e;
        u3z0Var.getClass();
        u3z0.a c = u3z0.c(str, i, qjz0Var);
        if (z3) {
            aVar = c;
            ziz0.b(str, str2, e7z0Var, aVar, false, nlVar != null ? ((g9z0) nlVar.b).b : 0);
        } else {
            aVar = c;
        }
        if (aVar.a()) {
            return;
        }
        e7z0Var.a("responseCode=" + aVar.c + ", error=" + aVar.d + ", " + e7z0Var.d);
        if (nlVar != null) {
            final long j3 = ((g9z0) nlVar.b).a;
            Runnable runnable = new Runnable() { // from class: xsna.ffz0
                @Override // java.lang.Runnable
                public final void run() {
                    jfz0 jfz0Var = jfz0.this;
                    jfz0Var.d(str, str2, jfz0Var.d, jfz0Var.e, z3, false, e7z0Var, j3, ((g9z0) nlVar.b).b);
                }
            };
            Handler handler = this.g;
            Objects.requireNonNull(handler);
            handler.postDelayed(runnable, j3);
        }
    }

    public final void b(final nl nlVar) {
        if (this.f.a()) {
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            int i = this.h;
            if (size < i) {
                try {
                    taz0.a a = this.b.a();
                    while (a.moveToNext() && arrayList.size() < i) {
                        try {
                            final bez0 a2 = a.a();
                            if (!arrayList.contains(Long.valueOf(a2.a))) {
                                arrayList.add(Long.valueOf(a2.a));
                                this.a.execute(new Runnable() { // from class: xsna.gfz0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final jfz0 jfz0Var = jfz0.this;
                                        u3z0 u3z0Var = jfz0Var.c;
                                        final bez0 bez0Var = a2;
                                        String str = bez0Var.b;
                                        int i2 = jfz0Var.d;
                                        qjz0 qjz0Var = jfz0Var.e;
                                        u3z0Var.getClass();
                                        u3z0.a c = u3z0.c(str, i2, qjz0Var);
                                        boolean z = bez0Var.e;
                                        final nl nlVar2 = nlVar;
                                        if (z) {
                                            ziz0.b(bez0Var.b, bez0Var.c, bez0Var.d, c, true, nlVar2 != null ? ((g9z0) nlVar2.b).b : 0);
                                        }
                                        if (!c.a() && nlVar2 != null) {
                                            final long j2 = ((g9z0) nlVar2.b).a;
                                            Runnable runnable = new Runnable() { // from class: xsna.ifz0
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    bez0 bez0Var2 = bez0Var;
                                                    String str2 = bez0Var2.b;
                                                    String str3 = bez0Var2.c;
                                                    jfz0 jfz0Var2 = jfz0.this;
                                                    jfz0Var2.d(str2, str3, jfz0Var2.d, jfz0Var2.e, bez0Var2.e, true, bez0Var2.d, j2, ((g9z0) nlVar2.b).b);
                                                }
                                            };
                                            Handler handler = jfz0Var.g;
                                            Objects.requireNonNull(handler);
                                            handler.postDelayed(runnable, j2);
                                        }
                                        fzb0 fzb0Var = new fzb0(jfz0Var, bez0Var, c, 1);
                                        Handler handler2 = jfz0Var.g;
                                        Objects.requireNonNull(handler2);
                                        handler2.post(fzb0Var);
                                    }
                                });
                            }
                        } finally {
                        }
                    }
                    a.close();
                } catch (Throwable th) {
                    gu8.e(null, "StatSender error: " + th);
                }
            }
        }
    }

    public final void c() {
        HashSet hashSet = new HashSet(this.b.b());
        for (Map.Entry entry : ziz0.d.entrySet()) {
            String str = (String) entry.getKey();
            synchronized (ziz0.a(str)) {
                try {
                    Iterator it = ((ConcurrentHashMap) entry.getValue()).entrySet().iterator();
                    while (it.hasNext()) {
                        ((eez0) ((Map.Entry) it.next()).getValue()).d(!hashSet.contains(r5.getKey()));
                    }
                    if (ziz0.c(str)) {
                        ziz0.d(str);
                    }
                } finally {
                }
            }
        }
    }

    public final void d(final String str, final String str2, final int i, final qjz0 qjz0Var, final boolean z, final boolean z2, final e7z0 e7z0Var, final long j2, final int i2) {
        if (i2 < 1) {
            return;
        }
        this.c.getClass();
        u3z0.a c = u3z0.c(str, i, qjz0Var);
        if (z) {
            ziz0.b(str, str2, e7z0Var, c, z2, i2 - 1);
        }
        if (!c.a() && i2 - 1 >= 1) {
            Runnable runnable = new Runnable() { // from class: xsna.hfz0
                @Override // java.lang.Runnable
                public final void run() {
                    jfz0.this.d(str, str2, i, qjz0Var, z, z2, e7z0Var, j2, i2 - 1);
                }
            };
            Handler handler = this.g;
            Objects.requireNonNull(handler);
            handler.postDelayed(runnable, j2);
        }
    }
}
