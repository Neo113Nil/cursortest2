package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.Executor;
import xsna.crl;
import xsna.kms0;
import xsna.uns0;

/* compiled from: SingleInputVideoGraph.java */
/* loaded from: classes12.dex */
public final class ouj0 implements uns0 {
    public final Context a;
    public final kms0.b b;
    public final m6g c;
    public final uns0.b d;
    public final g7l e;
    public final Executor f;
    public final boolean g;

    @Nullable
    public kms0 h;

    @Nullable
    public njn0 i;
    public ImmutableList<p8p> j;
    public boolean k;
    public volatile boolean l;
    public int m;

    /* compiled from: SingleInputVideoGraph.java */
    public class a implements kms0.c {
        public long a;

        public a() {
        }

        @Override // xsna.kms0.c
        public final void a(VideoFrameProcessingException videoFrameProcessingException) {
            ouj0.this.f.execute(new qyc(5, this, videoFrameProcessingException));
        }

        @Override // xsna.kms0.c
        public final void b(float f) {
            ouj0.this.f.execute(new luj0(this, f, 0));
        }

        @Override // xsna.kms0.c
        public final void c(int i, int i2) {
            ouj0.this.f.execute(new muj0(i, i2, 0, this));
        }

        @Override // xsna.kms0.c
        public final void d(final long j, final boolean z) {
            if (j == 0) {
                ouj0.this.l = true;
            }
            this.a = j;
            ouj0.this.f.execute(new Runnable() { // from class: xsna.nuj0
                @Override // java.lang.Runnable
                public final void run() {
                    ouj0.this.d.d(j, z);
                }
            });
        }

        @Override // xsna.kms0.c
        public final void f() {
            ouj0.this.f.execute(new jk9(this, 11));
        }
    }

    /* compiled from: SingleInputVideoGraph.java */
    public static final class b implements uns0.a {
        public final kms0.b a;

        public b() {
            this(new crl.b.a().a());
        }

        @Override // xsna.uns0.a
        public final uns0 a(Context context, m6g m6gVar, g7l g7lVar, uns0.b bVar, Executor executor, long j, boolean z) {
            return new ouj0(context, executor, m6gVar, g7lVar, this.a, bVar, z);
        }

        public b(kms0.b bVar) {
            this.a = bVar;
        }
    }

    public ouj0(Context context, Executor executor, m6g m6gVar, g7l g7lVar, kms0.b bVar, uns0.b bVar2, boolean z) {
        this.a = context;
        this.b = bVar;
        this.c = m6gVar;
        this.d = bVar2;
        this.e = g7lVar;
        this.f = executor;
        ImmutableList.b bVar3 = ImmutableList.c;
        this.j = com.google.common.collect.g.f;
        this.g = z;
        this.m = -1;
    }

    @Override // xsna.uns0
    public final void a(@Nullable njn0 njn0Var) {
        this.i = njn0Var;
        kms0 kms0Var = this.h;
        if (kms0Var != null) {
            kms0Var.a(njn0Var);
        }
    }

    @Override // xsna.uns0
    public final boolean b(int i, Bitmap bitmap, k5j k5jVar) {
        this.h.getClass();
        return this.h.d(bitmap, k5jVar);
    }

    @Override // xsna.uns0
    public final void c() {
        kms0 kms0Var = this.h;
        kms0Var.getClass();
        kms0Var.c();
    }

    @Override // xsna.uns0
    public final void d(dds0 dds0Var) {
        fxc0.q(dds0Var.equals(dds0.a), "SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings");
    }

    @Override // xsna.uns0
    public final void e(long j) {
        this.h.getClass();
        this.h.e(j);
    }

    @Override // xsna.uns0
    public final void f(int i) {
        this.h.getClass();
        this.h.h();
    }

    @Override // xsna.uns0
    public final void flush() {
        this.h.getClass();
        this.h.flush();
    }

    @Override // xsna.uns0
    public final void g(List<p8p> list) {
        this.j = ImmutableList.m(list);
    }

    @Override // xsna.uns0
    public final int h(int i) {
        this.h.getClass();
        return this.h.g();
    }

    @Override // xsna.uns0
    public final boolean i(int i) {
        this.h.getClass();
        return this.h.f();
    }

    @Override // xsna.uns0
    public final Surface j(int i) {
        this.h.getClass();
        return this.h.b();
    }

    @Override // xsna.uns0
    public final void k(int i, int i2, androidx.media3.common.a aVar, List<p8p> list, long j) {
        this.h.getClass();
        kms0 kms0Var = this.h;
        ImmutableList.a aVar2 = new ImmutableList.a();
        aVar2.e(list);
        aVar2.e(this.j);
        kms0Var.i(i2, j, aVar, aVar2.g());
    }

    @Override // xsna.uns0
    public final boolean l() {
        return this.l;
    }

    @Override // xsna.uns0
    public final void m(int i) throws VideoFrameProcessingException {
        fxc0.z(this.h == null && !this.k);
        fxc0.A(this.m == -1, "This VideoGraph supports only one input.");
        this.m = i;
        kms0 a2 = this.b.a(this.a, this.e, this.c, this.g, kzm.INSTANCE, new a());
        this.h = a2;
        njn0 njn0Var = this.i;
        if (njn0Var != null) {
            a2.a(njn0Var);
        }
    }

    @Override // xsna.uns0
    public final void release() {
        if (this.k) {
            return;
        }
        kms0 kms0Var = this.h;
        if (kms0Var != null) {
            kms0Var.release();
        }
        this.k = true;
    }

    @Override // xsna.uns0
    public final void initialize() {
    }
}
