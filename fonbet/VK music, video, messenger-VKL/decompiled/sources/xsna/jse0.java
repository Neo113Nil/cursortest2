package xsna;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: QueuedMeasuringSession.kt */
/* loaded from: classes4.dex */
public final class jse0 implements mzp0 {
    public final gzs<mzp0> a;
    public boolean b;
    public final LinkedList<a> c = new LinkedList<>();
    public boolean d;

    /* compiled from: QueuedMeasuringSession.kt */
    public static abstract class a {

        /* compiled from: QueuedMeasuringSession.kt */
        /* renamed from: xsna.jse0$a$a, reason: collision with other inner class name */
        public static final class C3143a extends a {
            public static final C3143a a = new C3143a();
        }

        /* compiled from: QueuedMeasuringSession.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: QueuedMeasuringSession.kt */
        public static final class c extends a {
            public final View a;

            public c(View view) {
                this.a = view;
            }
        }

        /* compiled from: QueuedMeasuringSession.kt */
        public static final class d extends a {
            public static final d a = new d();
        }

        /* compiled from: QueuedMeasuringSession.kt */
        public static final class e extends a {
            public final boolean a;

            public e(boolean z) {
                this.a = z;
            }
        }

        /* compiled from: QueuedMeasuringSession.kt */
        public static final class f extends a {
            public final View a;

            public f(View view) {
                this.a = view;
            }
        }

        /* compiled from: QueuedMeasuringSession.kt */
        public static final class g extends a {
            public static final g a = new g();
        }

        /* compiled from: QueuedMeasuringSession.kt */
        public static final class h extends a {
            public static final h a = new h();
        }

        /* compiled from: QueuedMeasuringSession.kt */
        public static final class i extends a {
            public static final i a = new i();
        }

        /* compiled from: QueuedMeasuringSession.kt */
        public static final class j extends a {
            public final String a;

            public j(String str) {
                this.a = str;
            }
        }

        /* compiled from: QueuedMeasuringSession.kt */
        public static final class k extends a {
            public static final k a = new k();
        }

        /* compiled from: QueuedMeasuringSession.kt */
        public static final class l extends a {
            public static final l a = new l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jse0(gzs<? extends mzp0> gzsVar) {
        this.a = gzsVar;
    }

    @Override // xsna.mzp0
    public final UUID Y0() {
        UUID Y0;
        mzp0 invoke = this.a.invoke();
        return (invoke == null || (Y0 = invoke.Y0()) == null) ? UUID.randomUUID() : Y0;
    }

    @Override // xsna.mzp0
    public final void a() {
        l(a.d.a);
    }

    @Override // xsna.mzp0
    public final void b() {
        l(a.k.a);
    }

    @Override // xsna.mzp0
    public final void c(boolean z) {
        l(new a.e(z));
    }

    @Override // xsna.mzp0
    public final void d(View view) {
        l(new a.c(view));
    }

    @Override // xsna.mzp0
    public final void e(View view) {
        l(new a.f(view));
    }

    @Override // xsna.mzp0
    public final void f() {
        l(a.C3143a.a);
    }

    @Override // xsna.mzp0
    public final void g() {
        l(a.h.a);
    }

    @Override // xsna.mzp0
    public final void h() {
        l(a.g.a);
    }

    @Override // xsna.mzp0
    public final void init() {
        mzp0 invoke = this.a.invoke();
        if (this.b || invoke == null) {
            this.d = true;
            return;
        }
        this.b = true;
        l(a.b.a);
        LinkedList<a> linkedList = this.c;
        Iterator<a> it = linkedList.iterator();
        while (it.hasNext()) {
            l(it.next());
        }
        linkedList.clear();
    }

    @Override // xsna.mzp0
    public final void j() {
        l(a.i.a);
    }

    @Override // xsna.mzp0
    public final void k(String str) {
        l(new a.j(str));
    }

    public final void l(a aVar) {
        mzp0 invoke = this.a.invoke();
        if (!this.b || invoke == null) {
            this.c.add(aVar);
            return;
        }
        if (aVar instanceof a.b) {
            invoke.init();
            return;
        }
        if (aVar instanceof a.i) {
            invoke.j();
            return;
        }
        if (aVar instanceof a.k) {
            invoke.b();
            return;
        }
        if (aVar instanceof a.j) {
            invoke.k(((a.j) aVar).a);
            return;
        }
        if (aVar instanceof a.l) {
            invoke.start();
            return;
        }
        if (aVar instanceof a.d) {
            invoke.a();
            return;
        }
        if (aVar instanceof a.g) {
            invoke.h();
            return;
        }
        if (aVar instanceof a.e) {
            invoke.c(((a.e) aVar).a);
            return;
        }
        if (aVar instanceof a.f) {
            invoke.e(((a.f) aVar).a);
            return;
        }
        if (aVar instanceof a.c) {
            invoke.d(((a.c) aVar).a);
        } else if (aVar instanceof a.h) {
            invoke.g();
        } else {
            if (!(aVar instanceof a.C3143a)) {
                throw new NoWhenBranchMatchedException();
            }
            invoke.f();
        }
    }

    @Override // xsna.mzp0
    public final void start() {
        l(a.l.a);
    }

    @Override // xsna.mzp0
    public final void i() {
    }
}
