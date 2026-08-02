package ru.mail.libverify.api;

import ru.mail.verify.core.api.ApplicationModule;
import ru.mail.verify.core.utils.components.MessageBus;
import ru.ok.tracer.lite.TracerLite;
import xsna.c6o;
import xsna.d9e0;
import xsna.rtl;

/* loaded from: classes9.dex */
public final class i {

    public static final class a {
        private ApplicationModule a;
        private ru.mail.libverify.g0.b b;

        public /* synthetic */ a(int i) {
            this();
        }

        public final ru.mail.libverify.c.d a() {
            if (this.a == null) {
                this.a = new ApplicationModule();
            }
            ru.mail.libverify.g0.b bVar = this.b;
            if (bVar != null) {
                return new b(this.a, bVar);
            }
            throw new IllegalStateException(ru.mail.libverify.g0.b.class.getCanonicalName() + " must be set");
        }

        private a() {
        }

        public final a a(ru.mail.libverify.g0.b bVar) {
            bVar.getClass();
            this.b = bVar;
            return this;
        }

        public final a a(ApplicationModule applicationModule) {
            applicationModule.getClass();
            this.a = applicationModule;
            return this;
        }
    }

    public static final class b implements ru.mail.libverify.c.d {
        ru.mail.libverify.y.b A;
        d9e0<q> B;
        d9e0<ru.mail.libverify.g0.d> a;
        ru.mail.verify.core.api.g b;
        d9e0<ru.mail.libverify.c.g> c;
        d9e0<ru.mail.libverify.g0.a> d;
        d9e0<ru.mail.libverify.l0.e> e;
        d9e0<MessageBus> f;
        d9e0<ru.mail.libverify.u.a0> g;
        d9e0<ru.mail.libverify.h0.a> h;
        rtl i;
        ru.mail.verify.core.api.h j;
        d9e0<u> k;
        d9e0<ru.mail.libverify.f0.c> l;
        ru.mail.libverify.g0.i m;
        ru.mail.libverify.g0.h n;
        ru.mail.libverify.g0.g o;
        d9e0<ru.mail.libverify.o.g> p;
        d9e0<ru.mail.libverify.j0.b> q;
        ru.mail.verify.core.api.k r;
        d9e0<TracerLite> s;
        d9e0<ru.mail.libverify.c0.a> t;
        ru.mail.libverify.i.n u;
        d9e0<ru.mail.libverify.i.f> v;
        d9e0<ru.mail.libverify.i.c> w;
        ru.mail.verify.core.api.l x;
        ru.mail.verify.core.api.i y;
        ru.mail.libverify.g0.k z;

        public static final class a implements d9e0<ru.mail.libverify.g0.a> {
            private final ru.mail.libverify.g0.b a;

            public a(ru.mail.libverify.g0.b bVar) {
                this.a = bVar;
            }

            @Override // xsna.e9e0
            public final Object get() {
                ru.mail.libverify.g0.a c = this.a.c();
                if (c != null) {
                    return c;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: ru.mail.libverify.api.i$b$b, reason: collision with other inner class name */
        public static final class C2190b implements d9e0<MessageBus> {
            private final ru.mail.libverify.g0.b a;

            public C2190b(ru.mail.libverify.g0.b bVar) {
                this.a = bVar;
            }

            @Override // xsna.e9e0
            public final Object get() {
                MessageBus a = this.a.a();
                if (a != null) {
                    return a;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        public static final class c implements d9e0<ru.mail.libverify.l0.e> {
            private final ru.mail.libverify.g0.b a;

            public c(ru.mail.libverify.g0.b bVar) {
                this.a = bVar;
            }

            @Override // xsna.e9e0
            public final Object get() {
                ru.mail.libverify.l0.e d = this.a.d();
                if (d != null) {
                    return d;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        public static final class d implements d9e0<ru.mail.libverify.g0.d> {
            private final ru.mail.libverify.g0.b a;

            public d(ru.mail.libverify.g0.b bVar) {
                this.a = bVar;
            }

            @Override // xsna.e9e0
            public final Object get() {
                ru.mail.libverify.g0.d dVar = this.a.get();
                if (dVar != null) {
                    return dVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        public static final class e implements d9e0<ru.mail.libverify.f0.c> {
            private final ru.mail.libverify.g0.b a;

            public e(ru.mail.libverify.g0.b bVar) {
                this.a = bVar;
            }

            @Override // xsna.e9e0
            public final Object get() {
                ru.mail.libverify.f0.c b = this.a.b();
                if (b != null) {
                    return b;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        public b(ApplicationModule applicationModule, ru.mail.libverify.g0.b bVar) {
            this.a = new d(bVar);
            ru.mail.verify.core.api.g a2 = ru.mail.verify.core.api.g.a(applicationModule);
            this.b = a2;
            this.c = c6o.b(ru.mail.libverify.c.h.a(a2));
            this.d = new a(bVar);
            this.e = new c(bVar);
            this.f = new C2190b(bVar);
            d9e0<ru.mail.libverify.u.a0> b = c6o.b(ru.mail.libverify.u.b0.a(this.a, this.b));
            this.g = b;
            this.h = c6o.b(ru.mail.libverify.e0.b.a(this.b, this.e, this.a, this.f, this.c, b));
            this.i = new rtl();
            this.j = ru.mail.verify.core.api.h.a(applicationModule);
            this.k = c6o.b(v.a(this.b, this.i, this.f, this.j, ru.mail.verify.core.api.j.a(applicationModule)));
            this.l = new e(bVar);
            this.m = ru.mail.libverify.g0.i.a(applicationModule, this.b);
            this.n = ru.mail.libverify.g0.h.a(applicationModule, this.i);
            ru.mail.libverify.g0.g a3 = ru.mail.libverify.g0.g.a(applicationModule, this.g);
            this.o = a3;
            d9e0<ru.mail.libverify.o.g> b2 = c6o.b(ru.mail.libverify.o.h.a(this.i, this.n, a3, this.a));
            this.p = b2;
            ru.mail.libverify.storage.h a4 = ru.mail.libverify.storage.h.a(this.b, this.c, this.d, this.h, this.k, this.g, this.l, this.m, b2);
            rtl rtlVar = this.i;
            d9e0<T> b3 = c6o.b(a4);
            if (rtlVar.b != null) {
                throw new IllegalStateException();
            }
            rtlVar.b = b3;
            this.q = c6o.b(ru.mail.libverify.j0.d.a(this.a, this.k, this.g, this.f, this.e, c6o.b(ru.mail.libverify.requests.n.a(this.i)), this.o));
            this.r = ru.mail.verify.core.api.k.a(applicationModule);
            d9e0<TracerLite> b4 = c6o.b(ru.mail.libverify.g0.m.a(applicationModule, this.b, this.i));
            this.s = b4;
            this.t = c6o.b(ru.mail.libverify.c0.b.a(this.r, c6o.b(ru.mail.libverify.g0.l.a(applicationModule, b4))));
            this.u = ru.mail.libverify.i.n.a(this.b);
            this.v = c6o.b(ru.mail.libverify.i.h.a(this.b, this.i));
            this.w = c6o.b(ru.mail.libverify.i.d.a(this.b, this.f, this.a, this.u, this.v, c6o.b(ru.mail.libverify.w.h.a(c6o.b(ru.mail.libverify.w.e.a(this.i)), this.i))));
            this.x = ru.mail.verify.core.api.l.a(applicationModule);
            this.y = ru.mail.verify.core.api.i.a(applicationModule);
            this.z = ru.mail.libverify.g0.k.a(applicationModule);
            this.A = ru.mail.libverify.y.b.a(this.o, c6o.b(ru.mail.libverify.o.k.a(this.s, this.i, this.r)));
            this.B = c6o.b(r.a(this.a, this.i, this.f, this.c, this.d, this.h, this.q, this.t, this.w, this.x, this.y, this.z, this.A, this.o, ru.mail.libverify.g0.j.a(applicationModule, this.m), this.p));
        }

        @Override // ru.mail.libverify.c.d
        public final VerificationApi get() {
            return this.B.get();
        }
    }

    public static a a() {
        return new a(0);
    }
}
