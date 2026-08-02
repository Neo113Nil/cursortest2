package xsna;

/* compiled from: EmailActualizationResult.kt */
/* loaded from: classes18.dex */
public interface ybp {

    /* compiled from: EmailActualizationResult.kt */
    public static final class a implements ybp {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1894933472;
        }

        public final String toString() {
            return "Dismissed";
        }
    }

    /* compiled from: EmailActualizationResult.kt */
    public static final class b implements ybp {
        public final boolean a;
        public final String b;

        public b(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EmailActualized(isSuccess=");
            sb.append(this.a);
            sb.append(", accessToken=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: EmailActualizationResult.kt */
    public static final class c implements ybp {
        public final String a;
        public final boolean b;

        public c(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EmailUpdateRequested(accessToken=");
            sb.append(this.a);
            sb.append(", isAddingEmail=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
