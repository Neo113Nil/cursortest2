package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.c;
import defpackage.c6u0;
import defpackage.d95;
import defpackage.e5j0;
import defpackage.i7j0;
import defpackage.iax0;
import defpackage.iy01;
import defpackage.jdj;
import defpackage.jm91;
import defpackage.ny61;
import defpackage.od60;
import defpackage.oht;
import defpackage.ojs0;
import defpackage.otj0;
import defpackage.pw21;
import defpackage.s5j0;
import defpackage.uqo;
import defpackage.vfz;
import defpackage.x1o;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class a implements e5j0, ojs0 {
    public static final boolean B = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;
    public final Object b;
    public final i7j0 c;
    public final s5j0 d;
    public final Context e;
    public final GlideContext f;
    public final Object g;
    public final Class h;
    public final d95 i;
    public final int j;
    public final int k;
    public final Priority l;
    public final iax0 m;
    public final List n;
    public final iy01 o;
    public final Executor p;
    public otj0 q;
    public jdj r;
    public volatile c s;
    public Drawable u;
    public Drawable v;
    public Drawable w;
    public int x;
    public int y;
    public boolean z;
    public final c6u0 a = new c6u0();
    public SingleRequest$Status t = SingleRequest$Status.PENDING;

    public a(Context context, GlideContext glideContext, Object obj, Object obj2, Class cls, d95 d95Var, int i, int i2, Priority priority, iax0 iax0Var, i7j0 i7j0Var, ArrayList arrayList, s5j0 s5j0Var, c cVar, iy01 iy01Var, Executor executor) {
        this.b = obj;
        this.e = context;
        this.f = glideContext;
        this.g = obj2;
        this.h = cls;
        this.i = d95Var;
        this.j = i;
        this.k = i2;
        this.l = priority;
        this.m = iax0Var;
        this.c = i7j0Var;
        this.n = arrayList;
        this.d = s5j0Var;
        this.s = cVar;
        this.o = iy01Var;
        this.p = executor;
        if (this.A == null && glideContext.getExperiments().a.containsKey(oht.a.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // defpackage.e5j0
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.t == SingleRequest$Status.COMPLETE;
        }
        return z;
    }

    @Override // defpackage.e5j0
    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = this.t == SingleRequest$Status.COMPLETE;
        }
        return z;
    }

    @Override // defpackage.e5j0
    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.t == SingleRequest$Status.CLEARED;
        }
        return z;
    }

    @Override // defpackage.e5j0
    public final void clear() {
        synchronized (this.b) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                SingleRequest$Status singleRequest$Status = this.t;
                SingleRequest$Status singleRequest$Status2 = SingleRequest$Status.CLEARED;
                if (singleRequest$Status == singleRequest$Status2) {
                    return;
                }
                e();
                otj0 otj0Var = this.q;
                if (otj0Var != null) {
                    this.q = null;
                } else {
                    otj0Var = null;
                }
                s5j0 s5j0Var = this.d;
                if (s5j0Var == null || s5j0Var.h(this)) {
                    this.m.onLoadCleared(f());
                }
                this.t = singleRequest$Status2;
                if (otj0Var != null) {
                    this.s.getClass();
                    c.e(otj0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.e5j0
    public final boolean d(e5j0 e5j0Var) {
        int i;
        int i2;
        Object obj;
        Class cls;
        d95 d95Var;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        d95 d95Var2;
        Priority priority2;
        int size2;
        if (!(e5j0Var instanceof a)) {
            return false;
        }
        synchronized (this.b) {
            try {
                i = this.j;
                i2 = this.k;
                obj = this.g;
                cls = this.h;
                d95Var = this.i;
                priority = this.l;
                List list = this.n;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        a aVar = (a) e5j0Var;
        synchronized (aVar.b) {
            try {
                i3 = aVar.j;
                i4 = aVar.k;
                obj2 = aVar.g;
                cls2 = aVar.h;
                d95Var2 = aVar.i;
                priority2 = aVar.l;
                List list2 = aVar.n;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((d95Var == null ? d95Var2 == null : d95Var.i(d95Var2)) && priority == priority2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e() {
        if (this.z) {
            ny61.r("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.a.a();
        this.m.removeCallback(this);
        jdj jdjVar = this.r;
        if (jdjVar != null) {
            synchronized (((c) jdjVar.w)) {
                ((x1o) jdjVar.c).g((a) jdjVar.b);
            }
            this.r = null;
        }
    }

    public final Drawable f() {
        int i;
        if (this.v == null) {
            d95 d95Var = this.i;
            Drawable drawable = d95Var.y;
            this.v = drawable;
            if (drawable == null && (i = d95Var.z) > 0) {
                Resources.Theme theme = d95Var.K;
                Context context = this.e;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.v = jm91.e(context, context, i, theme);
            }
        }
        return this.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007d A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:15:0x0036, B:17:0x003a, B:18:0x003f, B:20:0x0045, B:22:0x004f, B:24:0x0057, B:27:0x0061, B:29:0x0065, B:31:0x0069, B:32:0x0071, B:35:0x007a, B:37:0x007d, B:39:0x0081, B:45:0x008c, B:47:0x0090, B:49:0x0094, B:50:0x009b, B:52:0x009f, B:54:0x00a3, B:56:0x00ab, B:58:0x00af, B:61:0x00ba, B:62:0x00b6, B:63:0x00c0, B:65:0x00c4, B:66:0x00c8), top: B:14:0x0036, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(GlideException glideException, int i) {
        boolean z;
        boolean z2;
        int i2;
        this.a.a();
        synchronized (this.b) {
            try {
                glideException.i(this.A);
                int logLevel = this.f.getLogLevel();
                if (logLevel <= i) {
                    Objects.toString(this.g);
                    if (logLevel <= 4) {
                        glideException.f();
                    }
                }
                Drawable drawable = null;
                this.r = null;
                this.t = SingleRequest$Status.FAILED;
                s5j0 s5j0Var = this.d;
                if (s5j0Var != null) {
                    s5j0Var.i(this);
                }
                boolean z3 = true;
                this.z = true;
                try {
                    List<i7j0> list = this.n;
                    if (list != null) {
                        z = false;
                        for (i7j0 i7j0Var : list) {
                            s5j0 s5j0Var2 = this.d;
                            if (s5j0Var2 != null) {
                                s5j0Var2.getRoot().a();
                            }
                            z |= i7j0Var.b(glideException);
                        }
                    } else {
                        z = false;
                    }
                    i7j0 i7j0Var2 = this.c;
                    if (i7j0Var2 != null) {
                        s5j0 s5j0Var3 = this.d;
                        if (s5j0Var3 != null) {
                            s5j0Var3.getRoot().a();
                        }
                        if (i7j0Var2.b(glideException)) {
                            z2 = true;
                            if (!(z2 | z)) {
                                s5j0 s5j0Var4 = this.d;
                                if (s5j0Var4 != null && !s5j0Var4.f(this)) {
                                    z3 = false;
                                }
                                if (this.g == null) {
                                    if (this.w == null) {
                                        this.i.getClass();
                                        this.w = null;
                                    }
                                    drawable = this.w;
                                }
                                if (drawable == null) {
                                    if (this.u == null) {
                                        d95 d95Var = this.i;
                                        Drawable drawable2 = d95Var.w;
                                        this.u = drawable2;
                                        if (drawable2 == null && (i2 = d95Var.x) > 0) {
                                            Context context = this.e;
                                            Resources.Theme theme = d95Var.K;
                                            if (theme == null) {
                                                theme = context.getTheme();
                                            }
                                            this.u = jm91.e(context, context, i2, theme);
                                        }
                                    }
                                    drawable = this.u;
                                }
                                if (drawable == null) {
                                    drawable = f();
                                }
                                this.m.onLoadFailed(drawable);
                            }
                        }
                    }
                    z2 = false;
                    if (!(z2 | z)) {
                    }
                } finally {
                    this.z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(otj0 otj0Var, DataSource dataSource, boolean z) {
        this.a.a();
        otj0 otj0Var2 = null;
        try {
            synchronized (this.b) {
                try {
                    this.r = null;
                    if (otj0Var == null) {
                        g(new GlideException("Expected to receive a Resource<R> with an object of " + this.h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = otj0Var.get();
                    try {
                        if (obj != null && this.h.isAssignableFrom(obj.getClass())) {
                            s5j0 s5j0Var = this.d;
                            if (s5j0Var == null || s5j0Var.g(this)) {
                                i(otj0Var, obj, dataSource, z);
                                return;
                            }
                            this.q = null;
                            this.t = SingleRequest$Status.COMPLETE;
                            this.s.getClass();
                            c.e(otj0Var);
                        }
                        this.q = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.h);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(otj0Var);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        g(new GlideException(sb.toString()), 5);
                        this.s.getClass();
                        c.e(otj0Var);
                    } catch (Throwable th) {
                        otj0Var2 = otj0Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (otj0Var2 != null) {
                this.s.getClass();
                c.e(otj0Var2);
            }
            throw th3;
        }
    }

    public final void i(otj0 otj0Var, Object obj, DataSource dataSource, boolean z) {
        boolean z2;
        s5j0 s5j0Var = this.d;
        if (s5j0Var != null) {
            s5j0Var.getRoot().a();
        }
        this.t = SingleRequest$Status.COMPLETE;
        this.q = otj0Var;
        if (this.f.getLogLevel() <= 3) {
            Objects.toString(dataSource);
            Objects.toString(this.g);
            int i = vfz.a;
            SystemClock.elapsedRealtimeNanos();
        }
        if (s5j0Var != null) {
            s5j0Var.e(this);
        }
        boolean z3 = true;
        this.z = true;
        try {
            List<i7j0> list = this.n;
            if (list != null) {
                z2 = false;
                for (i7j0 i7j0Var : list) {
                    z2 |= i7j0Var.a(obj, dataSource);
                    if (i7j0Var instanceof uqo) {
                        z2 |= ((uqo) i7j0Var).c();
                    }
                }
            } else {
                z2 = false;
            }
            i7j0 i7j0Var2 = this.c;
            if (i7j0Var2 == null || !i7j0Var2.a(obj, dataSource)) {
                z3 = false;
            }
            if (!(z3 | z2)) {
                ((od60.a) this.o).getClass();
                this.m.onResourceReady(obj, od60.a);
            }
            this.z = false;
        } catch (Throwable th) {
            this.z = false;
            throw th;
        }
    }

    @Override // defpackage.e5j0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            try {
                SingleRequest$Status singleRequest$Status = this.t;
                z = singleRequest$Status == SingleRequest$Status.RUNNING || singleRequest$Status == SingleRequest$Status.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.e5j0
    public final void j() {
        synchronized (this.b) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                int i = vfz.a;
                SystemClock.elapsedRealtimeNanos();
                if (this.g == null) {
                    if (pw21.m(this.j, this.k)) {
                        this.x = this.j;
                        this.y = this.k;
                    }
                    if (this.w == null) {
                        this.i.getClass();
                        this.w = null;
                    }
                    g(new GlideException("Received null model"), this.w == null ? 5 : 3);
                    return;
                }
                SingleRequest$Status singleRequest$Status = this.t;
                if (singleRequest$Status == SingleRequest$Status.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (singleRequest$Status == SingleRequest$Status.COMPLETE) {
                    h(this.q, DataSource.MEMORY_CACHE, false);
                    return;
                }
                List<i7j0> list = this.n;
                if (list != null) {
                    for (i7j0 i7j0Var : list) {
                    }
                }
                SingleRequest$Status singleRequest$Status2 = SingleRequest$Status.WAITING_FOR_SIZE;
                this.t = singleRequest$Status2;
                if (pw21.m(this.j, this.k)) {
                    onSizeReady(this.j, this.k);
                } else {
                    this.m.getSize(this);
                }
                SingleRequest$Status singleRequest$Status3 = this.t;
                if (singleRequest$Status3 == SingleRequest$Status.RUNNING || singleRequest$Status3 == singleRequest$Status2) {
                    s5j0 s5j0Var = this.d;
                    if (s5j0Var == null || s5j0Var.f(this)) {
                        this.m.onLoadStarted(f());
                    }
                }
                if (B) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // defpackage.ojs0
    public final void onSizeReady(int i, int i2) {
        ?? r1;
        int i3 = i;
        this.a.a();
        Object obj = this.b;
        synchronized (obj) {
            try {
                try {
                    boolean z = B;
                    if (z) {
                        int i4 = vfz.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (this.t != SingleRequest$Status.WAITING_FOR_SIZE) {
                        return;
                    }
                    SingleRequest$Status singleRequest$Status = SingleRequest$Status.RUNNING;
                    this.t = singleRequest$Status;
                    this.i.getClass();
                    this.x = i3 == Integer.MIN_VALUE ? i3 : Math.round(i3 * 1.0f);
                    this.y = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                    if (z) {
                        int i5 = vfz.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    c cVar = this.s;
                    GlideContext glideContext = this.f;
                    Object obj2 = this.g;
                    d95 d95Var = this.i;
                    this.r = cVar.a(glideContext, obj2, d95Var.D, this.x, this.y, d95Var.I, this.h, this.l, d95Var.b, d95Var.H, d95Var.E, d95Var.M, d95Var.G, d95Var.A, d95Var.N, this, this.p);
                    if (this.t != singleRequest$Status) {
                        this.r = null;
                    }
                    if (z) {
                        int i6 = vfz.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                } catch (Throwable th) {
                    th = th;
                    r1 = obj;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r1 = i3;
            }
        }
    }

    @Override // defpackage.e5j0
    public final void pause() {
        synchronized (this.b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.b) {
            obj = this.g;
            cls = this.h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
