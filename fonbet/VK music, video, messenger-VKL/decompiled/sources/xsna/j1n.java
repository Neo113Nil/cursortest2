package xsna;

/* compiled from: DisconnectReason.kt */
/* loaded from: classes3.dex */
public abstract class j1n {

    /* compiled from: DisconnectReason.kt */
    public static final class a extends j1n {
        public final int a;
        public final String b;
        public final String c = toString();

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // xsna.j1n
        public final String a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Closed(code=");
            sb.append(this.a);
            sb.append(", reason=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: DisconnectReason.kt */
    public static final class b extends j1n {
        public final Throwable a;
        public final String b = "DisconnectReason.ConnectionIssue";

        public b(Throwable th) {
            this.a = th;
        }

        @Override // xsna.j1n
        public final String a() {
            return this.b;
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
            return oq.c(new StringBuilder("ConnectionIssue(cause="), this.a, ')');
        }
    }

    /* compiled from: DisconnectReason.kt */
    public static final class c extends j1n {
        public static final c a = new c();
        public static final String b = "DisconnectReason.FloodControl";

        @Override // xsna.j1n
        public final String a() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -598868646;
        }

        public final String toString() {
            return "FloodControl";
        }
    }

    /* compiled from: DisconnectReason.kt */
    public static final class d extends j1n {
        public final int a;
        public final String b;
        public final String c = toString();

        public d(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // xsna.j1n
        public final String a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HandshakeError(code=");
            sb.append(this.a);
            sb.append(", reason=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: DisconnectReason.kt */
    public static final class e extends j1n {
        public final int a;
        public final String b;
        public final String c = toString();

        public e(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // xsna.j1n
        public final String a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InvalidToken(code=");
            sb.append(this.a);
            sb.append(", reason=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: DisconnectReason.kt */
    public static final class f extends j1n {
        public final Throwable a;
        public final String b = "DisconnectReason.Unknown";

        public f(Throwable th) {
            this.a = th;
        }

        @Override // xsna.j1n
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Unknown(cause="), this.a, ')');
        }
    }

    public abstract String a();
}
