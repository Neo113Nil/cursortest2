package xsna;

import io.opentelemetry.api.trace.SpanKind;

/* compiled from: DefaultTracer.java */
/* loaded from: classes11.dex */
public final class dpl implements wdp0 {
    public static final dpl a = new dpl();

    @Override // xsna.wdp0
    public final phk0 a(String str) {
        return new a();
    }

    /* compiled from: DefaultTracer.java */
    public static final class a implements phk0 {
        public qhk0 a;

        @Override // xsna.phk0
        public final phk0 b() {
            this.a = kpw.a;
            return this;
        }

        @Override // xsna.phk0
        public final ohk0 e() {
            if (this.a == null) {
                this.a = ohk0.current().i();
            }
            qhk0 qhk0Var = this.a;
            if (qhk0Var != null) {
                return new u6e0(qhk0Var);
            }
            i03.a();
            return u6e0.b;
        }

        @Override // xsna.phk0
        public final phk0 f(wmj wmjVar) {
            if (wmjVar == null) {
                i03.a();
                return this;
            }
            this.a = ohk0.o(wmjVar).i();
            return this;
        }

        @Override // xsna.phk0
        public final phk0 a(boolean z) {
            return this;
        }

        @Override // xsna.phk0
        public final phk0 c(long j) {
            return this;
        }

        @Override // xsna.phk0
        public final phk0 d(SpanKind spanKind) {
            return this;
        }

        @Override // xsna.phk0
        public final phk0 setAttribute(String str, String str2) {
            return this;
        }
    }
}
