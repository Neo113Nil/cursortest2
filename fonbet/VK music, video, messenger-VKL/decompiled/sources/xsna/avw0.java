package xsna;

/* compiled from: VoipPastCallsState.kt */
/* loaded from: classes7.dex */
public interface avw0 extends km50 {

    /* compiled from: VoipPastCallsState.kt */
    public static final class a implements avw0 {
        public final rp90 b;
        public final a990<Long> c;
        public final boolean d;

        public a(rp90 rp90Var, a990<Long> a990Var, boolean z) {
            this.b = rp90Var;
            this.c = a990Var;
            this.d = z;
        }

        public static a a(a aVar, rp90 rp90Var, a990 a990Var, int i) {
            if ((i & 1) != 0) {
                rp90Var = aVar.b;
            }
            if ((i & 2) != 0) {
                a990Var = aVar.c;
            }
            boolean z = aVar.d;
            aVar.getClass();
            return new a(rp90Var, a990Var, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(pastCalls=");
            sb.append(this.b);
            sb.append(", page=");
            sb.append(this.c);
            sb.append(", hasAdministratedGroups=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: VoipPastCallsState.kt */
    public static final class b implements avw0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 764260980;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: VoipPastCallsState.kt */
    public static final class c implements avw0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1831032488;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
