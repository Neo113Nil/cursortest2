package xsna;

/* compiled from: LaunchConfig.kt */
/* loaded from: classes7.dex */
public abstract class rmy {

    /* compiled from: LaunchConfig.kt */
    public static final class a extends rmy {
        public final String a;
        public final String b;
        public final ffw0 c;
        public final boolean d;

        public a(String str, String str2, ffw0 ffw0Var, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = ffw0Var;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("New(ownerId=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", privacy=");
            sb.append(this.c);
            sb.append(", isCallRecord=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: LaunchConfig.kt */
    public static final class b extends rmy {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Scheduled(id=");
            sb.append(this.a);
            sb.append(", ownerId=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
