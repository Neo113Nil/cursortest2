package ru.mail.verify.core.api;

import ru.mail.verify.core.utils.components.MessageBus;
import xsna.c6o;
import xsna.d9e0;
import xsna.rtl;

/* loaded from: classes9.dex */
public final class m {

    public static final class a implements ru.mail.libverify.g0.b {
        rtl a;
        d9e0<MessageBus> b;
        l c;
        k d;
        i e;
        g f;
        d9e0<ru.mail.libverify.l0.f> g;
        d9e0<ru.mail.libverify.g0.a> h;
        d9e0<ru.mail.libverify.f0.c> i;

        public a(ApplicationModule applicationModule) {
            rtl rtlVar = new rtl();
            this.a = rtlVar;
            this.b = c6o.b(ru.mail.libverify.p0.d.a(rtlVar));
            this.c = l.a(applicationModule);
            this.d = k.a(applicationModule);
            this.e = i.a(applicationModule);
            g a = g.a(applicationModule);
            this.f = a;
            d9e0<ru.mail.libverify.l0.f> b = c6o.b(ru.mail.libverify.l0.g.a(a));
            this.g = b;
            rtl rtlVar2 = this.a;
            d9e0<T> b2 = c6o.b(d.a(this.b, this.c, this.d, this.e, b));
            if (rtlVar2.b != null) {
                throw new IllegalStateException();
            }
            rtlVar2.b = b2;
            this.h = c6o.b(ru.mail.verify.core.api.b.a(this.f, h.a(applicationModule)));
            this.i = c6o.b(ru.mail.libverify.f0.e.a(this.f));
        }

        @Override // ru.mail.libverify.g0.b
        public final MessageBus a() {
            return this.b.get();
        }

        @Override // ru.mail.libverify.g0.b
        public final ru.mail.libverify.f0.c b() {
            return this.i.get();
        }

        @Override // ru.mail.libverify.g0.b
        public final ru.mail.libverify.g0.a c() {
            return this.h.get();
        }

        @Override // ru.mail.libverify.g0.b
        public final ru.mail.libverify.l0.e d() {
            return this.g.get();
        }

        @Override // ru.mail.libverify.g0.b
        public final ru.mail.libverify.g0.d get() {
            return (ru.mail.libverify.g0.d) this.a.get();
        }
    }

    public static final class b {
        private ApplicationModule a;

        public /* synthetic */ b(int i) {
            this();
        }

        public final ru.mail.libverify.g0.b a() {
            if (this.a == null) {
                this.a = new ApplicationModule();
            }
            return new a(this.a);
        }

        private b() {
        }

        public final b a(ApplicationModule applicationModule) {
            applicationModule.getClass();
            this.a = applicationModule;
            return this;
        }
    }

    public static b a() {
        return new b(0);
    }
}
