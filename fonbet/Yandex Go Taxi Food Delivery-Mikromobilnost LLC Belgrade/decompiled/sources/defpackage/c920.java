package defpackage;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class c920 implements pdv, z9s {
    public Executor A;
    public final LongSparseArray B;
    public final LongSparseArray C;
    public int D;
    public final ArrayList E;
    public final ArrayList F;
    public final Object a;
    public final sn7 b;
    public int c;
    public final uhx w;
    public boolean x;
    public final tis0 y;
    public odv z;

    public c920(int i, int i2, int i3, int i4) {
        tis0 tis0Var = new tis0(ImageReader.newInstance(i, i2, i3, i4));
        this.a = new Object();
        this.b = new sn7(2, this);
        this.c = 0;
        this.w = new uhx(15, this);
        this.x = false;
        this.B = new LongSparseArray();
        this.C = new LongSparseArray();
        this.F = new ArrayList();
        this.y = tis0Var;
        this.D = 0;
        this.E = new ArrayList(l());
    }

    @Override // defpackage.z9s
    public final void a(aas aasVar) {
        synchronized (this.a) {
            b(aasVar);
        }
    }

    @Override // defpackage.pdv
    public final jdv acquireLatestImage() {
        synchronized (this.a) {
            try {
                if (this.E.isEmpty()) {
                    return null;
                }
                if (this.D >= this.E.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.E.size() - 1; i++) {
                    if (!this.F.contains(this.E.get(i))) {
                        arrayList.add((jdv) this.E.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((jdv) it.next()).close();
                }
                int size = this.E.size();
                ArrayList arrayList2 = this.E;
                this.D = size;
                jdv jdvVar = (jdv) arrayList2.get(size - 1);
                this.F.add(jdvVar);
                return jdvVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(aas aasVar) {
        synchronized (this.a) {
            try {
                int indexOf = this.E.indexOf(aasVar);
                if (indexOf >= 0) {
                    this.E.remove(indexOf);
                    int i = this.D;
                    if (indexOf <= i) {
                        this.D = i - 1;
                    }
                }
                this.F.remove(aasVar);
                if (this.c > 0) {
                    d(this.y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(x4r0 x4r0Var) {
        odv odvVar;
        Executor executor;
        synchronized (this.a) {
            try {
                if (this.E.size() < l()) {
                    x4r0Var.a(this);
                    this.E.add(x4r0Var);
                    odvVar = this.z;
                    executor = this.A;
                } else {
                    sgb1.g(3, "TAG");
                    x4r0Var.close();
                    odvVar = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (odvVar != null) {
            if (executor != null) {
                executor.execute(new p500(23, this, odvVar));
            } else {
                odvVar.r(this);
            }
        }
    }

    @Override // defpackage.pdv
    public final void close() {
        synchronized (this.a) {
            try {
                if (this.x) {
                    return;
                }
                Iterator it = new ArrayList(this.E).iterator();
                while (it.hasNext()) {
                    ((jdv) it.next()).close();
                }
                this.E.clear();
                this.y.close();
                this.x = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(pdv pdvVar) {
        jdv jdvVar;
        synchronized (this.a) {
            try {
                if (this.x) {
                    return;
                }
                int size = this.C.size() + this.E.size();
                if (size >= pdvVar.l()) {
                    sgb1.g(3, "MetadataImageReader");
                    return;
                }
                do {
                    try {
                        jdvVar = pdvVar.w();
                        if (jdvVar != null) {
                            this.c--;
                            size++;
                            this.C.put(jdvVar.G0().getTimestamp(), jdvVar);
                            e();
                        }
                    } catch (IllegalStateException unused) {
                        sgb1.g(3, "MetadataImageReader");
                        jdvVar = null;
                    }
                    if (jdvVar == null || this.c <= 0) {
                        break;
                    }
                } while (size < pdvVar.l());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.a) {
            try {
                for (int size = this.B.size() - 1; size >= 0; size--) {
                    dav davVar = (dav) this.B.valueAt(size);
                    long timestamp = davVar.getTimestamp();
                    jdv jdvVar = (jdv) this.C.get(timestamp);
                    if (jdvVar != null) {
                        this.C.remove(timestamp);
                        this.B.removeAt(size);
                        c(new x4r0(jdvVar, null, davVar));
                    }
                }
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.a) {
            try {
                if (this.C.size() != 0 && this.B.size() != 0) {
                    long keyAt = this.C.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.B.keyAt(0);
                    d6z.n(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.C.size() - 1; size >= 0; size--) {
                            if (this.C.keyAt(size) < keyAt2) {
                                ((jdv) this.C.valueAt(size)).close();
                                this.C.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.B.size() - 1; size2 >= 0; size2--) {
                            if (this.B.keyAt(size2) < keyAt) {
                                this.B.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.pdv
    public final int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.y.getHeight();
        }
        return height;
    }

    @Override // defpackage.pdv
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.y.getSurface();
        }
        return surface;
    }

    @Override // defpackage.pdv
    public final int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.y.getWidth();
        }
        return width;
    }

    @Override // defpackage.pdv
    public final int h() {
        int h;
        synchronized (this.a) {
            h = this.y.h();
        }
        return h;
    }

    @Override // defpackage.pdv
    public final int l() {
        int l;
        synchronized (this.a) {
            l = this.y.l();
        }
        return l;
    }

    @Override // defpackage.pdv
    public final void u(odv odvVar, Executor executor) {
        synchronized (this.a) {
            odvVar.getClass();
            this.z = odvVar;
            executor.getClass();
            this.A = executor;
            this.y.u(this.w, executor);
        }
    }

    @Override // defpackage.pdv
    public final jdv w() {
        synchronized (this.a) {
            try {
                if (this.E.isEmpty()) {
                    return null;
                }
                if (this.D >= this.E.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.E;
                int i = this.D;
                this.D = i + 1;
                jdv jdvVar = (jdv) arrayList.get(i);
                this.F.add(jdvVar);
                return jdvVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pdv
    public final void x() {
        synchronized (this.a) {
            this.y.x();
            this.z = null;
            this.A = null;
            this.c = 0;
        }
    }
}
