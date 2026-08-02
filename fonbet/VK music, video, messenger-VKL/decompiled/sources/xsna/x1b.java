package xsna;

/* compiled from: ChannelMessageSendReporter.kt */
/* loaded from: classes2.dex */
public interface x1b extends eik0<mdz<b>, Object> {

    /* compiled from: ChannelMessageSendReporter.kt */
    public static final class b {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Span(guid="), this.a, ')');
        }
    }

    void e(String str);

    void l(String str);

    /* compiled from: ChannelMessageSendReporter.kt */
    public static final class a {
        public static final C3968a a = new C3968a();

        /* compiled from: ChannelMessageSendReporter.kt */
        /* renamed from: xsna.x1b$a$a, reason: collision with other inner class name */
        public static final class C3968a implements x1b {
            @Override // xsna.eik0
            public final /* bridge */ /* synthetic */ void c(Object obj) {
            }

            @Override // xsna.eik0
            public final /* bridge */ /* synthetic */ void f(mdz<b> mdzVar, Object obj) {
            }

            @Override // xsna.eik0
            public final boolean h() {
                return false;
            }

            @Override // xsna.eik0
            public final void b() {
            }

            @Override // xsna.eik0
            public final void d(Object obj) {
            }

            @Override // xsna.x1b
            public final void e(String str) {
            }

            @Override // xsna.eik0
            public final void g(String str) {
            }

            @Override // xsna.x1b
            public final void l(String str) {
            }

            @Override // xsna.eik0
            public final void m(String str) {
            }

            @Override // xsna.eik0
            public final void n(Object obj) {
            }
        }
    }
}
