package xsna;

/* compiled from: SmsInboxViewState.kt */
/* loaded from: classes15.dex */
public interface v6k0 {

    /* compiled from: SmsInboxViewState.kt */
    public static final class a implements v6k0 {
        public final String a;
        public final boolean b;
        public final r6k0 c;

        public a(String str, boolean z, r6k0 r6k0Var) {
            this.a = str;
            this.b = z;
            this.c = r6k0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "Error(errorText=" + this.a + ", isTerminal=" + this.b + ", type=" + this.c + ')';
        }
    }

    /* compiled from: SmsInboxViewState.kt */
    public static final class b implements v6k0 {
        public static final b a = new b();
    }

    /* compiled from: SmsInboxViewState.kt */
    public static final class c implements v6k0 {
        public static final c a = new c();
    }
}
