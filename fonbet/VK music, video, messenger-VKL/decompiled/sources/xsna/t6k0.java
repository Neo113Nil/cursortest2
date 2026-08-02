package xsna;

/* compiled from: SmsInboxValidationStatus.kt */
/* loaded from: classes15.dex */
public abstract class t6k0 {

    /* compiled from: SmsInboxValidationStatus.kt */
    public static final class a extends t6k0 {
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
            String str = this.a;
            return this.c.hashCode() + qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            return "Error(message=" + this.a + ", isTerminal=" + this.b + ", errorType=" + this.c + ')';
        }
    }

    /* compiled from: SmsInboxValidationStatus.kt */
    public static final class b extends t6k0 {
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
            return ho8.a(new StringBuilder("ValidationCompleted(code="), this.a, ')');
        }
    }

    /* compiled from: SmsInboxValidationStatus.kt */
    public static final class c extends t6k0 {
        public static final c a = new c();
    }
}
