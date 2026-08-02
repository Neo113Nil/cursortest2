package xsna;

import android.graphics.Bitmap;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* compiled from: CloseableReference.java */
/* loaded from: classes12.dex */
public abstract class uvf<T> implements Cloneable, Closeable {
    public static final a f = new a();
    public static final b g = new b();
    public boolean b = false;
    public final SharedReference<T> c;
    public final c d;
    public final Throwable e;

    /* compiled from: CloseableReference.java */
    public class a implements zag0<Closeable> {
        @Override // xsna.zag0
        public final void a(Closeable closeable) {
            try {
                yvf.a(closeable);
            } catch (IOException unused) {
            }
        }
    }

    /* compiled from: CloseableReference.java */
    public class b implements c {
        @Override // xsna.uvf.c
        public final boolean a() {
            return false;
        }

        @Override // xsna.uvf.c
        public final void b(SharedReference<Object> sharedReference, Throwable th) {
            Object a = sharedReference.a();
            ahq.j(uvf.class, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), a == null ? null : a.getClass().getName());
        }
    }

    /* compiled from: CloseableReference.java */
    /* loaded from: classes.dex */
    public interface c {
        boolean a();

        void b(SharedReference<Object> sharedReference, Throwable th);
    }

    public uvf(SharedReference<T> sharedReference, c cVar, Throwable th) {
        int i;
        boolean z;
        sharedReference.getClass();
        this.c = sharedReference;
        synchronized (sharedReference) {
            synchronized (sharedReference) {
                i = sharedReference.b;
                z = i > 0;
            }
            this.d = cVar;
            this.e = th;
        }
        if (!z) {
            throw new SharedReference.NullReferenceException();
        }
        sharedReference.b = i + 1;
        this.d = cVar;
        this.e = th;
    }

    public static <T> uvf<T> o(uvf<T> uvfVar) {
        if (uvfVar != null) {
            return uvfVar.n();
        }
        return null;
    }

    public static void p(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q((uvf) it.next());
            }
        }
    }

    public static void q(uvf<?> uvfVar) {
        if (uvfVar != null) {
            uvfVar.close();
        }
    }

    public static boolean t(uvf<?> uvfVar) {
        return uvfVar != null && uvfVar.s();
    }

    public static kcl v(Closeable closeable) {
        return x(closeable, f, g);
    }

    public static kcl w(Object obj, zag0 zag0Var) {
        return x(obj, zag0Var, g);
    }

    public static kcl x(Object obj, zag0 zag0Var, c cVar) {
        if (obj == null) {
            return null;
        }
        Throwable th = cVar.a() ? new Throwable() : null;
        if (!(obj instanceof Bitmap)) {
            boolean z = obj instanceof svf;
        }
        return new kcl(obj, zag0Var, cVar, th, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0075 A[ORIG_RETURN, RETURN] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() {
        int i;
        boolean z;
        int i2;
        T t;
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                SharedReference<T> sharedReference = this.c;
                synchronized (sharedReference) {
                    synchronized (sharedReference) {
                        i = sharedReference.b;
                        z = i > 0;
                    }
                    if (i2 != 0) {
                        synchronized (sharedReference) {
                            t = sharedReference.a;
                            sharedReference.a = null;
                        }
                        if (t != null) {
                            zag0<T> zag0Var = sharedReference.c;
                            if (zag0Var != null) {
                                zag0Var.a(t);
                            }
                            IdentityHashMap identityHashMap = SharedReference.d;
                            synchronized (identityHashMap) {
                                try {
                                    Integer num = (Integer) identityHashMap.get(t);
                                    if (num == null) {
                                        ahq.m("SharedReference", "No entry in sLiveObjects for value of type %s", t.getClass());
                                    } else if (num.intValue() == 1) {
                                        identityHashMap.remove(t);
                                    } else {
                                        identityHashMap.put(t, Integer.valueOf(num.intValue() - 1));
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!z) {
                    throw new SharedReference.NullReferenceException();
                }
                if (!(i > 0)) {
                    throw new IllegalArgumentException();
                }
                i2 = sharedReference.b - 1;
                sharedReference.b = i2;
                if (i2 != 0) {
                }
            } finally {
            }
        }
    }

    @Override // 
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract uvf<T> clone();

    public synchronized uvf<T> n() {
        if (!s()) {
            return null;
        }
        return clone();
    }

    public final synchronized T r() {
        T a2;
        sex0.f(!this.b);
        a2 = this.c.a();
        a2.getClass();
        return a2;
    }

    public synchronized boolean s() {
        return !this.b;
    }

    public uvf(T t, zag0<T> zag0Var, c cVar, Throwable th, boolean z) {
        this.c = new SharedReference<>(t, zag0Var, z);
        this.d = cVar;
        this.e = th;
    }
}
