package xsna;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import xsna.hlw;
import xsna.l9s;

/* compiled from: MetadataImageReader.java */
/* loaded from: classes11.dex */
public final class pi20 implements hlw, l9s.a {
    public final Object a;
    public final a b;
    public final vx6 c;
    public boolean d;
    public final ea2 e;

    @Nullable
    public hlw.a f;

    @Nullable
    public Executor g;
    public final LongSparseArray<ojw> h;
    public final LongSparseArray<alw> i;
    public int j;
    public final ArrayList k;
    public final ArrayList l;

    /* compiled from: MetadataImageReader.java */
    public class a extends gg9 {
        public a() {
        }

        @Override // xsna.gg9
        public final void b(@NonNull he9 he9Var) {
            pi20 pi20Var = pi20.this;
            synchronized (pi20Var.a) {
                try {
                    if (pi20Var.d) {
                        return;
                    }
                    pi20Var.h.put(he9Var.f(), new ig9(he9Var));
                    pi20Var.j();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public pi20(int i, int i2, int i3, int i4) {
        ea2 ea2Var = new ea2(ImageReader.newInstance(i, i2, i3, i4));
        this.a = new Object();
        this.b = new a();
        this.c = new vx6(this, 22);
        this.d = false;
        this.h = new LongSparseArray<>();
        this.i = new LongSparseArray<>();
        this.l = new ArrayList();
        this.e = ea2Var;
        this.j = 0;
        this.k = new ArrayList(e());
    }

    @Override // xsna.hlw
    public final void a(@NonNull hlw.a aVar, @NonNull Executor executor) {
        synchronized (this.a) {
            aVar.getClass();
            this.f = aVar;
            executor.getClass();
            this.g = executor;
            this.e.a(this.c, executor);
        }
    }

    @Override // xsna.hlw
    @Nullable
    public final alw b() {
        synchronized (this.a) {
            try {
                if (this.k.isEmpty()) {
                    return null;
                }
                if (this.j >= this.k.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.k;
                int i = this.j;
                this.j = i + 1;
                alw alwVar = (alw) arrayList.get(i);
                this.l.add(alwVar);
                return alwVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.hlw
    @Nullable
    public final alw c() {
        synchronized (this.a) {
            try {
                if (this.k.isEmpty()) {
                    return null;
                }
                if (this.j >= this.k.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.k.size() - 1; i++) {
                    if (!this.l.contains(this.k.get(i))) {
                        arrayList.add((alw) this.k.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((alw) it.next()).close();
                }
                int size = this.k.size();
                ArrayList arrayList2 = this.k;
                this.j = size;
                alw alwVar = (alw) arrayList2.get(size - 1);
                this.l.add(alwVar);
                return alwVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.hlw
    public final void close() {
        synchronized (this.a) {
            try {
                if (this.d) {
                    return;
                }
                Iterator it = new ArrayList(this.k).iterator();
                while (it.hasNext()) {
                    ((alw) it.next()).close();
                }
                this.k.clear();
                this.e.close();
                this.d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.hlw
    public final void d() {
        synchronized (this.a) {
            this.f = null;
            this.g = null;
        }
    }

    @Override // xsna.hlw
    public final int e() {
        int e;
        synchronized (this.a) {
            e = this.e.e();
        }
        return e;
    }

    @Override // xsna.l9s.a
    public final void f(l9s l9sVar) {
        synchronized (this.a) {
            synchronized (this.a) {
                try {
                    int indexOf = this.k.indexOf(l9sVar);
                    if (indexOf >= 0) {
                        this.k.remove(indexOf);
                        int i = this.j;
                        if (indexOf <= i) {
                            this.j = i - 1;
                        }
                    }
                    this.l.remove(l9sVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g(mzi0 mzi0Var) {
        hlw.a aVar;
        Executor executor;
        synchronized (this.a) {
            try {
                if (this.k.size() < e()) {
                    mzi0Var.b(this);
                    this.k.add(mzi0Var);
                    aVar = this.f;
                    executor = this.g;
                } else {
                    mzi0Var.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new wq8(3, this, aVar));
            } else {
                aVar.d(this);
            }
        }
    }

    @Override // xsna.hlw
    @Nullable
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.e.getSurface();
        }
        return surface;
    }

    public final int h() {
        int height;
        synchronized (this.a) {
            ea2 ea2Var = this.e;
            synchronized (ea2Var) {
                height = ea2Var.a.getHeight();
            }
        }
        return height;
    }

    public final int i() {
        int width;
        synchronized (this.a) {
            ea2 ea2Var = this.e;
            synchronized (ea2Var) {
                width = ea2Var.a.getWidth();
            }
        }
        return width;
    }

    public final void j() {
        synchronized (this.a) {
            try {
                for (int size = this.h.size() - 1; size >= 0; size--) {
                    ojw valueAt = this.h.valueAt(size);
                    long timestamp = valueAt.getTimestamp();
                    alw alwVar = this.i.get(timestamp);
                    if (alwVar != null) {
                        this.i.remove(timestamp);
                        this.h.removeAt(size);
                        g(new mzi0(alwVar, valueAt, 0));
                    }
                }
                k();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.a) {
            try {
                if (this.i.size() != 0 && this.h.size() != 0) {
                    long keyAt = this.i.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.h.keyAt(0);
                    obr.b(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.i.size() - 1; size >= 0; size--) {
                            if (this.i.keyAt(size) < keyAt2) {
                                this.i.valueAt(size).close();
                                this.i.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
                            if (this.h.keyAt(size2) < keyAt) {
                                this.h.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }
}
