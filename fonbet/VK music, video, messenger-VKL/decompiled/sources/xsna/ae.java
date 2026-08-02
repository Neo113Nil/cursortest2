package xsna;

import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* compiled from: AbstractDataSource.java */
/* loaded from: classes12.dex */
public abstract class ae<T> implements zuk<T> {
    public Map<String, Object> a;
    public T d = null;
    public Throwable e = null;
    public float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public boolean c = false;
    public a b = a.IN_PROGRESS;
    public final ConcurrentLinkedQueue<Pair<vvk<T>, Executor>> g = new ConcurrentLinkedQueue<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractDataSource.java */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a FAILURE;
        public static final a IN_PROGRESS;
        public static final a SUCCESS;

        static {
            a aVar = new a("IN_PROGRESS", 0);
            IN_PROGRESS = aVar;
            a aVar2 = new a("SUCCESS", 1);
            SUCCESS = aVar2;
            a aVar3 = new a("FAILURE", 2);
            FAILURE = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
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

    @Override // xsna.zuk
    public synchronized boolean a() {
        return this.d != null;
    }

    @Override // xsna.zuk
    public final synchronized Throwable b() {
        return this.e;
    }

    @Override // xsna.zuk
    public final synchronized boolean c() {
        return this.b != a.IN_PROGRESS;
    }

    @Override // xsna.zuk
    public boolean close() {
        synchronized (this) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                T t = this.d;
                this.d = null;
                if (t != null) {
                    e(t);
                }
                if (!c()) {
                    g();
                }
                synchronized (this) {
                    this.g.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050 A[RETURN] */
    @Override // xsna.zuk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(vvk<T> vvkVar, Executor executor) {
        boolean z;
        boolean z2;
        executor.getClass();
        synchronized (this) {
            try {
                if (this.c) {
                    return;
                }
                if (this.b == a.IN_PROGRESS) {
                    this.g.add(Pair.create(vvkVar, executor));
                }
                if (!a() && !c() && !k()) {
                    z = false;
                    if (z) {
                        return;
                    }
                    synchronized (this) {
                        z2 = this.b == a.FAILURE;
                    }
                    executor.execute(new yd(this, z2, vvkVar, k()));
                    return;
                }
                z = true;
                if (z) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean f() {
        return this.c;
    }

    public final void g() {
        boolean z;
        synchronized (this) {
            z = this.b == a.FAILURE;
        }
        boolean k = k();
        Iterator<Pair<vvk<T>, Executor>> it = this.g.iterator();
        while (it.hasNext()) {
            Pair<vvk<T>, Executor> next = it.next();
            ((Executor) next.second).execute(new yd(this, z, (vvk) next.first, k));
        }
    }

    @Override // xsna.zuk
    public final Map<String, Object> getExtras() {
        return this.a;
    }

    @Override // xsna.zuk
    public final synchronized float getProgress() {
        return this.f;
    }

    @Override // xsna.zuk
    public synchronized T getResult() {
        return this.d;
    }

    public final boolean h(Throwable th, Map<String, Object> map) {
        boolean z;
        synchronized (this) {
            if (!this.c && this.b == a.IN_PROGRESS) {
                this.b = a.FAILURE;
                this.e = th;
                this.a = map;
                z = true;
            }
            z = false;
        }
        if (z) {
            g();
        }
        return z;
    }

    public final boolean i(float f) {
        boolean z;
        synchronized (this) {
            z = false;
            if (!this.c && this.b == a.IN_PROGRESS) {
                if (f >= this.f) {
                    this.f = f;
                    z = true;
                }
            }
        }
        if (z) {
            Iterator<Pair<vvk<T>, Executor>> it = this.g.iterator();
            while (it.hasNext()) {
                Pair<vvk<T>, Executor> next = it.next();
                ((Executor) next.second).execute(new zd(this, (vvk) next.first));
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r4 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0036, code lost:
    
        if (r3 != null) goto L23;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x001b -> B:30:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean j(T t, boolean z, Map<String, Object> map) {
        boolean z2;
        this.a = map;
        T t2 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.c && this.b == a.IN_PROGRESS) {
                            if (z) {
                                this.b = a.SUCCESS;
                                this.f = 1.0f;
                            }
                            T t3 = this.d;
                            if (t3 != t) {
                                try {
                                    this.d = t;
                                    t = t3;
                                } catch (Throwable th) {
                                    th = th;
                                    t2 = t3;
                                    throw th;
                                }
                            } else {
                                t = null;
                            }
                            z2 = true;
                        }
                        z2 = false;
                    } catch (Throwable th2) {
                        t2 = t;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } finally {
            if (t2 != null) {
                e(t2);
            }
        }
    }

    public final synchronized boolean k() {
        boolean z;
        if (f()) {
            z = c() ? false : true;
        }
        return z;
    }

    public void e(T t) {
    }
}
