package xsna;

/* compiled from: InstallReferrerReporter.kt */
/* loaded from: classes.dex */
public abstract class f6x {
    public boolean a;

    /* compiled from: InstallReferrerReporter.kt */
    /* loaded from: classes17.dex */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InstallReferrerDetails(installReferrer=");
            sb.append(this.a);
            sb.append(", installStore=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
