package xsna;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import xsna.cuk;
import xsna.klp;
import xsna.qlp;
import xsna.vlp;
import xsna.vuk0;
import xsna.yhq;

/* compiled from: DecodeJob.java */
/* loaded from: classes12.dex */
public final class r7l<R> implements cuk.a, Runnable, Comparable<r7l<?>>, yhq.d {
    public buk<?> A;
    public volatile cuk B;
    public volatile boolean C;
    public volatile boolean D;
    public boolean E;
    public final d e;
    public final svb0<r7l<?>> f;
    public com.bumptech.glide.c i;
    public ady j;
    public Priority k;
    public slp l;
    public int m;
    public int n;
    public bbn o;
    public au80 p;
    public qlp q;
    public int r;
    public g s;
    public f t;
    public Object u;
    public Thread v;
    public ady w;
    public ady x;
    public Object y;
    public DataSource z;
    public final q7l<R> b = new q7l<>();
    public final ArrayList c = new ArrayList();
    public final vuk0.a d = new vuk0.a();
    public final c<?> g = new c<>();
    public final e h = new e();

    /* compiled from: DecodeJob.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[g.values().length];
            b = iArr2;
            try {
                iArr2[g.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[g.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[g.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[g.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[g.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[f.values().length];
            a = iArr3;
            try {
                iArr3[f.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[f.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[f.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: DecodeJob.java */
    public final class b<Z> {
        public final DataSource a;

        public b(DataSource dataSource) {
            this.a = dataSource;
        }
    }

    /* compiled from: DecodeJob.java */
    public static class c<Z> {
        public ady a;
        public pag0<Z> b;
        public b000<Z> c;
    }

    /* compiled from: DecodeJob.java */
    public interface d {
    }

    /* compiled from: DecodeJob.java */
    public static class e {
        public boolean a;
        public boolean b;
        public boolean c;

        public final boolean a() {
            return (this.c || this.b) && this.a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DecodeJob.java */
    public static final class f {
        private static final /* synthetic */ f[] $VALUES;
        public static final f DECODE_DATA;
        public static final f INITIALIZE;
        public static final f SWITCH_TO_SOURCE_SERVICE;

        static {
            f fVar = new f("INITIALIZE", 0);
            INITIALIZE = fVar;
            f fVar2 = new f("SWITCH_TO_SOURCE_SERVICE", 1);
            SWITCH_TO_SOURCE_SERVICE = fVar2;
            f fVar3 = new f("DECODE_DATA", 2);
            DECODE_DATA = fVar3;
            $VALUES = new f[]{fVar, fVar2, fVar3};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DecodeJob.java */
    public static final class g {
        private static final /* synthetic */ g[] $VALUES;
        public static final g DATA_CACHE;
        public static final g ENCODE;
        public static final g FINISHED;
        public static final g INITIALIZE;
        public static final g RESOURCE_CACHE;
        public static final g SOURCE;

        static {
            g gVar = new g("INITIALIZE", 0);
            INITIALIZE = gVar;
            g gVar2 = new g("RESOURCE_CACHE", 1);
            RESOURCE_CACHE = gVar2;
            g gVar3 = new g("DATA_CACHE", 2);
            DATA_CACHE = gVar3;
            g gVar4 = new g("SOURCE", 3);
            SOURCE = gVar4;
            g gVar5 = new g("ENCODE", 4);
            ENCODE = gVar5;
            g gVar6 = new g("FINISHED", 5);
            FINISHED = gVar6;
            $VALUES = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
        }

        public g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }
    }

    public r7l(klp.c cVar, yhq.c cVar2) {
        this.e = cVar;
        this.f = cVar2;
    }

    public final <Data> hag0<R> a(buk<?> bukVar, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            bukVar.a();
            return null;
        }
        try {
            int i = w000.a;
            SystemClock.elapsedRealtimeNanos();
            hag0<R> d2 = d(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                d2.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.l);
                Thread.currentThread().getName();
            }
            return d2;
        } finally {
            bukVar.a();
        }
    }

    @Override // xsna.cuk.a
    public final void b(ady adyVar, Exception exc, buk<?> bukVar, DataSource dataSource) {
        bukVar.a();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        glideException.e(adyVar, dataSource, bukVar.b());
        this.c.add(glideException);
        if (Thread.currentThread() != this.v) {
            n(f.SWITCH_TO_SOURCE_SERVICE);
        } else {
            o();
        }
    }

    @Override // xsna.cuk.a
    public final void c(ady adyVar, Object obj, buk<?> bukVar, DataSource dataSource, ady adyVar2) {
        this.w = adyVar;
        this.y = obj;
        this.A = bukVar;
        this.z = dataSource;
        this.x = adyVar2;
        this.E = adyVar != this.b.a().get(0);
        if (Thread.currentThread() != this.v) {
            n(f.DECODE_DATA);
        } else {
            i();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull r7l<?> r7lVar) {
        r7l<?> r7lVar2 = r7lVar;
        int ordinal = this.k.ordinal() - r7lVar2.k.ordinal();
        return ordinal == 0 ? this.r - r7lVar2.r : ordinal;
    }

    public final <Data> hag0<R> d(Data data, DataSource dataSource) throws GlideException {
        Class<?> cls = data.getClass();
        q7l<R> q7lVar = this.b;
        fqz<Data, ?, R> c2 = q7lVar.c(cls);
        au80 au80Var = this.p;
        boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || q7lVar.r;
        ht80<Boolean> ht80Var = com.bumptech.glide.load.resource.bitmap.a.i;
        Boolean bool = (Boolean) au80Var.c(ht80Var);
        if (bool == null || (bool.booleanValue() && !z)) {
            au80Var = new au80();
            hy8 hy8Var = this.p.b;
            hy8 hy8Var2 = au80Var.b;
            hy8Var2.g(hy8Var);
            hy8Var2.put(ht80Var, Boolean.valueOf(z));
        }
        au80 au80Var2 = au80Var;
        com.bumptech.glide.load.data.a g2 = this.i.a().g(data);
        try {
            return c2.a(this.m, this.n, g2, new b(dataSource), au80Var2);
        } finally {
            g2.a();
        }
    }

    @Override // xsna.yhq.d
    @NonNull
    public final vuk0.a h() {
        return this.d;
    }

    public final void i() {
        b000 b000Var;
        boolean a2;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.y + ", cache key: " + this.w + ", fetcher: " + this.A;
            int i = w000.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.l);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        b000 b000Var2 = null;
        try {
            b000Var = a(this.A, this.y, this.z);
        } catch (GlideException e2) {
            e2.e(this.x, this.z, null);
            this.c.add(e2);
            b000Var = null;
        }
        if (b000Var == null) {
            o();
            return;
        }
        DataSource dataSource = this.z;
        boolean z = this.E;
        if (b000Var instanceof hzw) {
            ((hzw) b000Var).initialize();
        }
        if (this.g.c != null) {
            b000Var2 = (b000) b000.f.c();
            b000Var2.e = false;
            b000Var2.d = true;
            b000Var2.c = b000Var;
            b000Var = b000Var2;
        }
        q();
        qlp<?> qlpVar = this.q;
        synchronized (qlpVar) {
            qlpVar.o = b000Var;
            qlpVar.p = dataSource;
            qlpVar.w = z;
        }
        synchronized (qlpVar) {
            try {
                qlpVar.c.a();
                if (qlpVar.v) {
                    qlpVar.o.a();
                    qlpVar.f();
                } else {
                    if (qlpVar.b.b.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (qlpVar.q) {
                        throw new IllegalStateException("Already have resource");
                    }
                    qlp.c cVar = qlpVar.f;
                    hag0<?> hag0Var = qlpVar.o;
                    boolean z2 = qlpVar.m;
                    slp slpVar = qlpVar.l;
                    vlp.a aVar = qlpVar.d;
                    cVar.getClass();
                    qlpVar.t = new vlp<>(hag0Var, z2, true, slpVar, aVar);
                    qlpVar.q = true;
                    qlp.e eVar = qlpVar.b;
                    eVar.getClass();
                    ArrayList arrayList = new ArrayList(eVar.b);
                    qlpVar.d(arrayList.size() + 1);
                    ((klp) qlpVar.g).d(qlpVar, qlpVar.l, qlpVar.t);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        qlp.d dVar = (qlp.d) it.next();
                        dVar.b.execute(new qlp.b(dVar.a));
                    }
                    qlpVar.c();
                }
            } finally {
            }
        }
        this.s = g.ENCODE;
        try {
            c<?> cVar2 = this.g;
            if (cVar2.c != null) {
                d dVar2 = this.e;
                au80 au80Var = this.p;
                cVar2.getClass();
                try {
                    ((klp.c) dVar2).a().a(cVar2.a, new com.vk.movika.sdk.base.model.l(cVar2.b, cVar2.c, au80Var));
                    cVar2.c.c();
                } catch (Throwable th) {
                    cVar2.c.c();
                    throw th;
                }
            }
            e eVar2 = this.h;
            synchronized (eVar2) {
                eVar2.b = true;
                a2 = eVar2.a();
            }
            if (a2) {
                m();
            }
        } finally {
            if (b000Var2 != null) {
                b000Var2.c();
            }
        }
    }

    public final cuk j() {
        int i = a.b[this.s.ordinal()];
        q7l<R> q7lVar = this.b;
        if (i == 1) {
            return new jag0(q7lVar, this);
        }
        if (i == 2) {
            return new stk(q7lVar.a(), q7lVar, this);
        }
        if (i == 3) {
            return new kgk0(q7lVar, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.s);
    }

    public final g k(g gVar) {
        int i = a.b[gVar.ordinal()];
        if (i == 1) {
            return this.o.a() ? g.DATA_CACHE : k(g.DATA_CACHE);
        }
        if (i == 2) {
            return g.SOURCE;
        }
        if (i == 3 || i == 4) {
            return g.FINISHED;
        }
        if (i == 5) {
            return this.o.b() ? g.RESOURCE_CACHE : k(g.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + gVar);
    }

    public final void l() {
        boolean a2;
        q();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.c));
        qlp<?> qlpVar = this.q;
        synchronized (qlpVar) {
            qlpVar.r = glideException;
        }
        synchronized (qlpVar) {
            try {
                qlpVar.c.a();
                if (qlpVar.v) {
                    qlpVar.f();
                } else {
                    if (qlpVar.b.b.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (qlpVar.s) {
                        throw new IllegalStateException("Already failed once");
                    }
                    qlpVar.s = true;
                    slp slpVar = qlpVar.l;
                    qlp.e eVar = qlpVar.b;
                    eVar.getClass();
                    ArrayList arrayList = new ArrayList(eVar.b);
                    qlpVar.d(arrayList.size() + 1);
                    ((klp) qlpVar.g).d(qlpVar, slpVar, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        qlp.d dVar = (qlp.d) it.next();
                        dVar.b.execute(new qlp.a(dVar.a));
                    }
                    qlpVar.c();
                }
            } finally {
            }
        }
        e eVar2 = this.h;
        synchronized (eVar2) {
            eVar2.c = true;
            a2 = eVar2.a();
        }
        if (a2) {
            m();
        }
    }

    public final void m() {
        e eVar = this.h;
        synchronized (eVar) {
            eVar.b = false;
            eVar.a = false;
            eVar.c = false;
        }
        c<?> cVar = this.g;
        cVar.a = null;
        cVar.b = null;
        cVar.c = null;
        q7l<R> q7lVar = this.b;
        q7lVar.c = null;
        q7lVar.d = null;
        q7lVar.n = null;
        q7lVar.g = null;
        q7lVar.k = null;
        q7lVar.i = null;
        q7lVar.o = null;
        q7lVar.j = null;
        q7lVar.p = null;
        q7lVar.a.clear();
        q7lVar.l = false;
        q7lVar.b.clear();
        q7lVar.m = false;
        this.C = false;
        this.i = null;
        this.j = null;
        this.p = null;
        this.k = null;
        this.l = null;
        this.q = null;
        this.s = null;
        this.B = null;
        this.v = null;
        this.w = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.D = false;
        this.u = null;
        this.c.clear();
        this.f.a(this);
    }

    public final void n(f fVar) {
        this.t = fVar;
        qlp qlpVar = this.q;
        (qlpVar.n ? qlpVar.j : qlpVar.i).execute(this);
    }

    public final void o() {
        this.v = Thread.currentThread();
        int i = w000.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.D && this.B != null && !(z = this.B.a())) {
            this.s = k(this.s);
            this.B = j();
            if (this.s == g.SOURCE) {
                n(f.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.s == g.FINISHED || this.D) && !z) {
            l();
        }
    }

    public final void p() {
        int i = a.a[this.t.ordinal()];
        if (i == 1) {
            this.s = k(g.INITIALIZE);
            this.B = j();
            o();
        } else if (i == 2) {
            o();
        } else if (i == 3) {
            i();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.t);
        }
    }

    public final void q() {
        this.d.a();
        if (this.C) {
            throw new IllegalStateException("Already notified", this.c.isEmpty() ? null : (Throwable) xy9.b(1, this.c));
        }
        this.C = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        buk<?> bukVar = this.A;
        try {
            try {
                if (this.D) {
                    l();
                    if (bukVar != null) {
                        bukVar.a();
                        return;
                    }
                    return;
                }
                p();
                if (bukVar != null) {
                    bukVar.a();
                }
            } catch (Throwable th) {
                if (bukVar != null) {
                    bukVar.a();
                }
                throw th;
            }
        } catch (mb9 e2) {
            throw e2;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Objects.toString(this.s);
            }
            if (this.s != g.ENCODE) {
                this.c.add(th2);
                l();
            }
            if (!this.D) {
                throw th2;
            }
            throw th2;
        }
    }
}
