package xsna;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import xsna.hlw;
import xsna.ub9;

/* compiled from: ProcessingImageReader.java */
/* loaded from: classes11.dex */
public final class ghd0 implements hlw {
    public final Object a;
    public final a b;
    public final b c;
    public final c d;
    public boolean e;
    public boolean f;
    public final pi20 g;
    public final ea2 h;

    @Nullable
    public hlw.a i;

    @Nullable
    public Executor j;
    public ub9.a<Void> k;
    public ub9.d l;

    @NonNull
    public final Executor m;

    @NonNull
    public final es9 n;
    public String o;

    @NonNull
    public nzi0 p;
    public final ArrayList q;

    /* compiled from: ProcessingImageReader.java */
    public class a implements hlw.a {
        public a() {
        }

        @Override // xsna.hlw.a
        public final void d(@NonNull hlw hlwVar) {
            ghd0 ghd0Var = ghd0.this;
            synchronized (ghd0Var.a) {
                if (ghd0Var.e) {
                    return;
                }
                try {
                    alw b = hlwVar.b();
                    if (b != null) {
                        if (ghd0Var.q.contains(b.B().c().a(ghd0Var.o))) {
                            ghd0Var.p.c(b);
                        } else {
                            b.close();
                        }
                    }
                } catch (IllegalStateException e) {
                    s100.a("ProcessingImageReader", "Failed to acquire latest image.", e);
                }
            }
        }
    }

    /* compiled from: ProcessingImageReader.java */
    public class b implements hlw.a {
        public b() {
        }

        @Override // xsna.hlw.a
        public final void d(@NonNull hlw hlwVar) {
            hlw.a aVar;
            Executor executor;
            synchronized (ghd0.this.a) {
                ghd0 ghd0Var = ghd0.this;
                aVar = ghd0Var.i;
                executor = ghd0Var.j;
                ghd0Var.p.e();
                ghd0.this.g();
            }
            if (aVar != null) {
                if (executor != null) {
                    executor.execute(new qyc(3, this, aVar));
                } else {
                    aVar.d(ghd0.this);
                }
            }
        }
    }

    public ghd0(int i, int i2, int i3, int i4, @NonNull Executor executor, @NonNull zr9 zr9Var, @NonNull es9 es9Var, int i5) {
        pi20 pi20Var = new pi20(i, i2, i3, i4);
        this.a = new Object();
        this.b = new a();
        this.c = new b();
        this.d = new c();
        this.e = false;
        this.f = false;
        String str = new String();
        this.o = str;
        this.p = new nzi0(Collections.EMPTY_LIST, str);
        this.q = new ArrayList();
        if (pi20Var.e() < zr9Var.a().size()) {
            throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
        }
        this.g = pi20Var;
        int i6 = pi20Var.i();
        int h = pi20Var.h();
        if (i5 == 256) {
            i6 = pi20Var.i() * pi20Var.h();
            h = 1;
        }
        ea2 ea2Var = new ea2(ImageReader.newInstance(i6, h, i5, pi20Var.e()));
        this.h = ea2Var;
        this.m = executor;
        this.n = es9Var;
        es9Var.a(i5, ea2Var.getSurface());
        es9Var.c(new Size(pi20Var.i(), pi20Var.h()));
        f(zr9Var);
    }

    @Override // xsna.hlw
    public final void a(@NonNull hlw.a aVar, @NonNull Executor executor) {
        synchronized (this.a) {
            aVar.getClass();
            this.i = aVar;
            executor.getClass();
            this.j = executor;
            this.g.a(this.b, executor);
            this.h.a(this.c, executor);
        }
    }

    @Override // xsna.hlw
    @Nullable
    public final alw b() {
        alw b2;
        synchronized (this.a) {
            b2 = this.h.b();
        }
        return b2;
    }

    @Override // xsna.hlw
    @Nullable
    public final alw c() {
        alw c2;
        synchronized (this.a) {
            c2 = this.h.c();
        }
        return c2;
    }

    @Override // xsna.hlw
    public final void close() {
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                this.h.d();
                if (!this.f) {
                    this.g.close();
                    this.p.d();
                    this.h.close();
                    ub9.a<Void> aVar = this.k;
                    if (aVar != null) {
                        aVar.b(null);
                    }
                }
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.hlw
    public final void d() {
        synchronized (this.a) {
            try {
                this.i = null;
                this.j = null;
                this.g.d();
                this.h.d();
                if (!this.f) {
                    this.p.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.hlw
    public final int e() {
        int e;
        synchronized (this.a) {
            e = this.g.e();
        }
        return e;
    }

    public final void f(@NonNull zr9 zr9Var) {
        synchronized (this.a) {
            try {
                if (zr9Var.a() != null) {
                    if (this.g.e() < zr9Var.a().size()) {
                        throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                    }
                    this.q.clear();
                    Iterator<androidx.camera.core.impl.g> it = zr9Var.a().iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            this.q.add(0);
                        }
                    }
                }
                String num = Integer.toString(zr9Var.hashCode());
                this.o = num;
                this.p = new nzi0(this.q, num);
                g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            arrayList.add(this.p.b(((Integer) it.next()).intValue()));
        }
        r0t.a(new sez(new ArrayList(arrayList), true, xo9.g()), this.d, this.m);
    }

    @Override // xsna.hlw
    @Nullable
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.g.getSurface();
        }
        return surface;
    }

    /* compiled from: ProcessingImageReader.java */
    public class c implements o0t<List<alw>> {
        public c() {
        }

        @Override // xsna.o0t
        public final void onSuccess(@Nullable List<alw> list) {
            synchronized (ghd0.this.a) {
                try {
                    ghd0 ghd0Var = ghd0.this;
                    if (ghd0Var.e) {
                        return;
                    }
                    ghd0Var.f = true;
                    ghd0Var.n.b(ghd0Var.p);
                    synchronized (ghd0.this.a) {
                        try {
                            ghd0 ghd0Var2 = ghd0.this;
                            ghd0Var2.f = false;
                            if (ghd0Var2.e) {
                                ghd0Var2.g.close();
                                ghd0.this.p.d();
                                ghd0.this.h.close();
                                ub9.a<Void> aVar = ghd0.this.k;
                                if (aVar != null) {
                                    aVar.b(null);
                                }
                            }
                        } finally {
                        }
                    }
                } finally {
                }
            }
        }

        @Override // xsna.o0t
        public final void onFailure(Throwable th) {
        }
    }
}
