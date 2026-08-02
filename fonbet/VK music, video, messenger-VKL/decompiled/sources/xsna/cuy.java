package xsna;

import java.util.ArrayList;
import xsna.vzc0;
import xsna.vzc0.a;

/* compiled from: LazyLayoutPrefetchState.kt */
/* loaded from: classes11.dex */
public final class cuy {
    public final g0d0 a;
    public final izs<? super b160, s3q0> b;
    public final lvc0 c;
    public vzc0 d;
    public int e;
    public int f;
    public int g;

    /* compiled from: LazyLayoutPrefetchState.kt */
    public final class a implements b160 {
        public final int a;
        public final ArrayList b = new ArrayList();

        public a(int i) {
            this.a = i;
        }

        @Override // xsna.b160
        public final void a(int i) {
            cuy cuyVar = cuy.this;
            vzc0 vzc0Var = cuyVar.d;
            if (vzc0Var == null) {
                return;
            }
            lvc0 lvc0Var = cuyVar.c;
            g0d0 g0d0Var = vzc0Var.c;
            this.b.add(vzc0Var.new a(i, lvc0Var, g0d0Var instanceof bcd0 ? (bcd0) g0d0Var : null, null));
        }

        @Override // xsna.b160
        public final int b() {
            return this.a;
        }
    }

    /* compiled from: LazyLayoutPrefetchState.kt */
    public interface b {
        void cancel();

        void d();
    }

    /* compiled from: LazyLayoutPrefetchState.kt */
    public interface c {
        long a(int i);

        int b();

        int getIndex();
    }

    public cuy() {
        this.c = new lvc0();
        this.e = -1;
        this.f = -1;
    }

    public final b a(int i, long j, boolean z, izs<? super c, s3q0> izsVar) {
        vzc0 vzc0Var = this.d;
        if (vzc0Var == null) {
            return ono.a;
        }
        g0d0 g0d0Var = vzc0Var.c;
        boolean z2 = g0d0Var instanceof bcd0;
        vzc0.a aVar = vzc0Var.new a(i, this.c, z2 ? (bcd0) g0d0Var : null, izsVar);
        aVar.e = new o6j(j);
        if (!z2) {
            g0d0Var.a(aVar);
        } else if (z) {
            ((bcd0) g0d0Var).b(aVar);
        } else {
            ((bcd0) g0d0Var).c(aVar);
        }
        ld2.a(i, "compose:lazy:schedule_prefetch:index");
        return aVar;
    }

    @ozl
    public cuy(g0d0 g0d0Var, izs<? super b160, s3q0> izsVar) {
        this();
        this.a = g0d0Var;
        this.b = izsVar;
    }
}
