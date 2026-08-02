package xsna;

import xsna.sht0;

/* compiled from: PrefetchPlayerWrapper.kt */
/* loaded from: classes17.dex */
public final class d0d0<T extends sht0> implements o0f {
    public final int a;
    public final o0f b;
    public final w0d0<T> c;
    public io.reactivex.rxjava3.disposables.c d;

    /* compiled from: PrefetchPlayerWrapper.kt */
    public static final class a implements io.reactivex.rxjava3.functions.a {
        public a() {
        }

        @Override // io.reactivex.rxjava3.functions.a
        public final void run() {
            d0d0 d0d0Var = d0d0.this;
            d0d0Var.b.play();
            d0d0Var.c.a(d0d0Var.a);
        }
    }

    /* compiled from: PrefetchPlayerWrapper.kt */
    public static final class b implements io.reactivex.rxjava3.functions.a {
        public b() {
        }

        @Override // io.reactivex.rxjava3.functions.a
        public final void run() {
            d0d0.this.b.prepare();
        }
    }

    /* compiled from: PrefetchPlayerWrapper.kt */
    public static final class c implements io.reactivex.rxjava3.functions.a {
        public c() {
        }

        @Override // io.reactivex.rxjava3.functions.a
        public final void run() {
            d0d0 d0d0Var = d0d0.this;
            d0d0Var.b.f();
            d0d0Var.c.a(d0d0Var.a);
        }
    }

    public d0d0(int i, o0f o0fVar, w0d0<T> w0d0Var) {
        this.a = i;
        this.b = o0fVar;
        this.c = w0d0Var;
    }

    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d = null;
    }

    @Override // xsna.o0f
    public final void f() {
        a();
        w0d0<T> w0d0Var = this.c;
        if (!w0d0Var.c.d()) {
            this.d = w0d0Var.c.c().o(io.reactivex.rxjava3.android.schedulers.a.b()).g(new c()).subscribe();
        } else {
            this.b.f();
            w0d0Var.a(this.a);
        }
    }

    @Override // xsna.o0f
    public final boolean isPrepared() {
        return this.b.isPrepared();
    }

    @Override // xsna.o0f
    public final void pause() {
        a();
        this.b.pause();
    }

    @Override // xsna.o0f
    public final void play() {
        a();
        w0d0<T> w0d0Var = this.c;
        if (!w0d0Var.c.d()) {
            this.d = w0d0Var.c.c().o(io.reactivex.rxjava3.android.schedulers.a.b()).g(new a()).subscribe();
        } else {
            this.b.play();
            w0d0Var.a(this.a);
        }
    }

    @Override // xsna.o0f
    public final void prepare() {
        a();
        w0d0<T> w0d0Var = this.c;
        if (w0d0Var.c.d()) {
            this.b.prepare();
        } else {
            this.d = w0d0Var.c.c().o(io.reactivex.rxjava3.android.schedulers.a.b()).g(new b()).subscribe();
        }
    }

    @Override // xsna.o0f
    public final void release() {
        a();
        this.b.release();
    }
}
