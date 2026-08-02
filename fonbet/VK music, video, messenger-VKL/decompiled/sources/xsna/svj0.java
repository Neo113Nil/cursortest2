package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestCoordinator;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.klp;
import xsna.n470;
import xsna.vuk0;

/* compiled from: SingleRequest.java */
/* loaded from: classes12.dex */
public final class svj0<R> implements f7g0 {
    public static final boolean A = Log.isLoggable("GlideRequest", 2);
    public final vuk0.a a;
    public final Object b;

    @Nullable
    public final x7g0<R> c;
    public final RequestCoordinator d;
    public final com.bumptech.glide.c e;

    @Nullable
    public final Object f;
    public final Class<R> g;
    public final dm6<?> h;
    public final int i;
    public final int j;
    public final Priority k;
    public final u3o0<R> l;

    @Nullable
    public final List<x7g0<R>> m;
    public final n470.a n;
    public final Executor o;
    public hag0<R> p;
    public klp.d q;
    public volatile klp r;
    public a s;

    @Nullable
    public Drawable t;

    @Nullable
    public Drawable u;

    @Nullable
    public Drawable v;
    public int w;
    public int x;
    public boolean y;

    @Nullable
    public final RuntimeException z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SingleRequest.java */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a CLEARED;
        public static final a COMPLETE;
        public static final a FAILED;
        public static final a PENDING;
        public static final a RUNNING;
        public static final a WAITING_FOR_SIZE;

        static {
            a aVar = new a("PENDING", 0);
            PENDING = aVar;
            a aVar2 = new a("RUNNING", 1);
            RUNNING = aVar2;
            a aVar3 = new a("WAITING_FOR_SIZE", 2);
            WAITING_FOR_SIZE = aVar3;
            a aVar4 = new a("COMPLETE", 3);
            COMPLETE = aVar4;
            a aVar5 = new a(SignalingProtocol.HUNGUP_REASON_FAILED, 4);
            FAILED = aVar5;
            a aVar6 = new a("CLEARED", 5);
            CLEARED = aVar6;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public svj0(Context context, com.bumptech.glide.c cVar, @NonNull Object obj, @Nullable Object obj2, Class cls, dm6 dm6Var, int i, int i2, Priority priority, u3o0 u3o0Var, @Nullable x7g0 x7g0Var, @Nullable ArrayList arrayList, RequestCoordinator requestCoordinator, klp klpVar, Executor executor) {
        n470.a aVar = n470.a;
        if (A) {
            String.valueOf(hashCode());
        }
        this.a = new vuk0.a();
        this.b = obj;
        this.e = cVar;
        this.f = obj2;
        this.g = cls;
        this.h = dm6Var;
        this.i = i;
        this.j = i2;
        this.k = priority;
        this.l = u3o0Var;
        this.c = x7g0Var;
        this.m = arrayList;
        this.d = requestCoordinator;
        this.r = klpVar;
        this.n = aVar;
        this.o = executor;
        this.s = a.PENDING;
        if (this.z == null && cVar.g.a.containsKey(y0u.class)) {
            this.z = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // xsna.f7g0
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.s == a.COMPLETE;
        }
        return z;
    }

    @Override // xsna.f7g0
    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = this.s == a.COMPLETE;
        }
        return z;
    }

    public final void c() {
        if (this.y) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.a.a();
        this.l.getClass();
        klp.d dVar = this.q;
        if (dVar != null) {
            synchronized (klp.this) {
                dVar.a.g(dVar.b);
            }
            this.q = null;
        }
    }

    @Override // xsna.f7g0
    public final void clear() {
        synchronized (this.b) {
            try {
                if (this.y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                a aVar = this.s;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                c();
                hag0<R> hag0Var = this.p;
                if (hag0Var != null) {
                    this.p = null;
                } else {
                    hag0Var = null;
                }
                RequestCoordinator requestCoordinator = this.d;
                if (requestCoordinator == null || requestCoordinator.h(this)) {
                    u3o0<R> u3o0Var = this.l;
                    d();
                    u3o0Var.f();
                }
                this.s = aVar2;
                if (hag0Var != null) {
                    this.r.getClass();
                    klp.e(hag0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Drawable d() {
        if (this.u == null) {
            this.h.getClass();
            this.u = null;
        }
        return this.u;
    }

    @Override // xsna.f7g0
    public final boolean e(f7g0 f7g0Var) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        dm6<?> dm6Var;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        dm6<?> dm6Var2;
        Priority priority2;
        int size2;
        if (!(f7g0Var instanceof svj0)) {
            return false;
        }
        synchronized (this.b) {
            try {
                i = this.i;
                i2 = this.j;
                obj = this.f;
                cls = this.g;
                dm6Var = this.h;
                priority = this.k;
                List<x7g0<R>> list = this.m;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        svj0 svj0Var = (svj0) f7g0Var;
        synchronized (svj0Var.b) {
            try {
                i3 = svj0Var.i;
                i4 = svj0Var.j;
                obj2 = svj0Var.f;
                cls2 = svj0Var.g;
                dm6Var2 = svj0Var.h;
                priority2 = svj0Var.k;
                List<x7g0<R>> list2 = svj0Var.m;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i != i3 || i2 != i4) {
            return false;
        }
        char[] cArr = s2r0.a;
        if ((obj == null ? obj2 == null : obj instanceof w230 ? ((w230) obj).a() : obj.equals(obj2)) && cls.equals(cls2)) {
            return (dm6Var == null ? dm6Var2 == null : dm6Var.h(dm6Var2)) && priority == priority2 && size == size2;
        }
        return false;
    }

    @Override // xsna.f7g0
    public final boolean f() {
        boolean z;
        synchronized (this.b) {
            z = this.s == a.CLEARED;
        }
        return z;
    }

    public final void g(GlideException glideException, int i) {
        Drawable drawable;
        this.a.a();
        synchronized (this.b) {
            try {
                glideException.f(this.z);
                int i2 = this.e.h;
                if (i2 <= i) {
                    Objects.toString(this.f);
                    if (i2 <= 4) {
                        ArrayList arrayList = new ArrayList();
                        GlideException.a(glideException, arrayList);
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            int i4 = i3 + 1;
                            i3 = i4;
                        }
                    }
                }
                this.q = null;
                this.s = a.FAILED;
                RequestCoordinator requestCoordinator = this.d;
                if (requestCoordinator != null) {
                    requestCoordinator.j(this);
                }
                boolean z = true;
                this.y = true;
                try {
                    List<x7g0<R>> list = this.m;
                    if (list != null) {
                        for (x7g0<R> x7g0Var : list) {
                            RequestCoordinator requestCoordinator2 = this.d;
                            if (requestCoordinator2 != null) {
                                requestCoordinator2.getRoot().b();
                            }
                            x7g0Var.d(glideException);
                        }
                    }
                    x7g0<R> x7g0Var2 = this.c;
                    if (x7g0Var2 != null) {
                        RequestCoordinator requestCoordinator3 = this.d;
                        if (requestCoordinator3 != null) {
                            requestCoordinator3.getRoot().b();
                        }
                        x7g0Var2.d(glideException);
                    }
                    RequestCoordinator requestCoordinator4 = this.d;
                    if (requestCoordinator4 != null && !requestCoordinator4.c(this)) {
                        z = false;
                    }
                    if (this.f == null) {
                        if (this.v == null) {
                            this.h.getClass();
                            this.v = null;
                        }
                        drawable = this.v;
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        if (this.t == null) {
                            this.h.getClass();
                            this.t = null;
                        }
                        drawable = this.t;
                    }
                    if (drawable == null) {
                        d();
                    }
                    this.l.a();
                } finally {
                    this.y = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(hag0<?> hag0Var, DataSource dataSource, boolean z) {
        this.a.a();
        hag0<?> hag0Var2 = null;
        try {
            synchronized (this.b) {
                try {
                    this.q = null;
                    if (hag0Var == null) {
                        g(new GlideException("Expected to receive a Resource<R> with an object of " + this.g + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = hag0Var.get();
                    try {
                        if (obj != null && this.g.isAssignableFrom(obj.getClass())) {
                            RequestCoordinator requestCoordinator = this.d;
                            if (requestCoordinator == null || requestCoordinator.g(this)) {
                                j(hag0Var, obj, dataSource, z);
                                return;
                            }
                            this.p = null;
                            this.s = a.COMPLETE;
                            this.r.getClass();
                            klp.e(hag0Var);
                        }
                        this.p = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.g);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(hag0Var);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        g(new GlideException(sb.toString()), 5);
                        this.r.getClass();
                        klp.e(hag0Var);
                    } catch (Throwable th) {
                        hag0Var2 = hag0Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (hag0Var2 != null) {
                this.r.getClass();
                klp.e(hag0Var2);
            }
            throw th3;
        }
    }

    @Override // xsna.f7g0
    public final void i() {
        synchronized (this.b) {
            try {
                if (this.y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                int i = w000.a;
                SystemClock.elapsedRealtimeNanos();
                if (this.f == null) {
                    if (s2r0.i(this.i, this.j)) {
                        this.w = this.i;
                        this.x = this.j;
                    }
                    if (this.v == null) {
                        this.h.getClass();
                        this.v = null;
                    }
                    g(new GlideException("Received null model"), this.v == null ? 5 : 3);
                    return;
                }
                a aVar = this.s;
                if (aVar == a.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    h(this.p, DataSource.MEMORY_CACHE, false);
                    return;
                }
                List<x7g0<R>> list = this.m;
                if (list != null) {
                    for (x7g0<R> x7g0Var : list) {
                        if (x7g0Var instanceof m9q) {
                            ((m9q) x7g0Var).getClass();
                        }
                    }
                }
                a aVar2 = a.WAITING_FOR_SIZE;
                this.s = aVar2;
                if (s2r0.i(this.i, this.j)) {
                    k(this.i, this.j);
                } else {
                    this.l.e(this);
                }
                a aVar3 = this.s;
                if (aVar3 == a.RUNNING || aVar3 == aVar2) {
                    RequestCoordinator requestCoordinator = this.d;
                    if (requestCoordinator == null || requestCoordinator.c(this)) {
                        u3o0<R> u3o0Var = this.l;
                        d();
                        u3o0Var.getClass();
                    }
                }
                if (A) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.f7g0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            try {
                a aVar = this.s;
                z = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z;
    }

    public final void j(hag0<R> hag0Var, R r, DataSource dataSource, boolean z) {
        boolean z2;
        RequestCoordinator requestCoordinator = this.d;
        if (requestCoordinator != null) {
            requestCoordinator.getRoot().b();
        }
        this.s = a.COMPLETE;
        this.p = hag0Var;
        if (this.e.h <= 3) {
            Objects.toString(dataSource);
            Objects.toString(this.f);
            int i = w000.a;
            SystemClock.elapsedRealtimeNanos();
        }
        if (requestCoordinator != null) {
            requestCoordinator.d(this);
        }
        this.y = true;
        try {
            List<x7g0<R>> list = this.m;
            if (list != null) {
                z2 = false;
                for (x7g0<R> x7g0Var : list) {
                    x7g0Var.c(r);
                    if (x7g0Var instanceof m9q) {
                        z2 |= ((m9q) x7g0Var).a();
                    }
                }
            } else {
                z2 = false;
            }
            x7g0<R> x7g0Var2 = this.c;
            if (x7g0Var2 != null) {
                x7g0Var2.c(r);
            }
            if (!z2) {
                this.n.getClass();
                this.l.g(r);
            }
            this.y = false;
        } catch (Throwable th) {
            this.y = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(int i, int i2) {
        svj0<R> svj0Var = this;
        int i3 = i;
        svj0Var.a.a();
        Object obj = svj0Var.b;
        synchronized (obj) {
            try {
                try {
                    boolean z = A;
                    if (z) {
                        int i4 = w000.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (svj0Var.s == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        svj0Var.s = aVar;
                        svj0Var.h.getClass();
                        if (i3 != Integer.MIN_VALUE) {
                            i3 = Math.round(i3 * 1.0f);
                        }
                        svj0Var.w = i3;
                        svj0Var.x = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                        if (z) {
                            int i5 = w000.a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        klp klpVar = svj0Var.r;
                        try {
                            com.bumptech.glide.c cVar = svj0Var.e;
                            Object obj2 = svj0Var.f;
                            dm6<?> dm6Var = svj0Var.h;
                            try {
                                ady adyVar = dm6Var.h;
                                int i6 = svj0Var.w;
                                try {
                                    int i7 = svj0Var.x;
                                    Class<?> cls = dm6Var.m;
                                    try {
                                        Class<R> cls2 = svj0Var.g;
                                        Priority priority = svj0Var.k;
                                        try {
                                            bbn bbnVar = dm6Var.c;
                                            hy8 hy8Var = dm6Var.l;
                                            try {
                                                boolean z2 = dm6Var.i;
                                                boolean z3 = dm6Var.q;
                                                try {
                                                    au80 au80Var = dm6Var.k;
                                                    boolean z4 = dm6Var.e;
                                                    boolean z5 = dm6Var.r;
                                                    Executor executor = svj0Var.o;
                                                    svj0Var = obj;
                                                    try {
                                                        svj0Var.q = klpVar.b(cVar, obj2, adyVar, i6, i7, cls, cls2, priority, bbnVar, hy8Var, z2, z3, au80Var, z4, z5, svj0Var, executor);
                                                        if (svj0Var.s != aVar) {
                                                            svj0Var.q = null;
                                                        }
                                                        if (z) {
                                                            int i8 = w000.a;
                                                            SystemClock.elapsedRealtimeNanos();
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    svj0Var = obj;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                svj0Var = obj;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            svj0Var = obj;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        svj0Var = obj;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    svj0Var = obj;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                svj0Var = obj;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            svj0Var = obj;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    svj0Var = obj;
                }
            } catch (Throwable th10) {
                th = th10;
            }
        }
    }

    @Override // xsna.f7g0
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
        Class<R> cls;
        synchronized (this.b) {
            obj = this.f;
            cls = this.g;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + X3.j.e;
    }
}
