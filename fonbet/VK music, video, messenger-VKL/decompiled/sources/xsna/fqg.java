package xsna;

/* compiled from: CommunityAddDescriptionAction.kt */
/* loaded from: classes5.dex */
public interface fqg extends kj50 {

    /* compiled from: CommunityAddDescriptionAction.kt */
    public static final class a implements fqg {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 401527266;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: CommunityAddDescriptionAction.kt */
    public static final class b implements fqg {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 401813071;
        }

        public final String toString() {
            return "Save";
        }
    }

    /* compiled from: CommunityAddDescriptionAction.kt */
    public static final class c implements fqg {
        public final String b;
        public final long c;

        public c(String str, long j) {
            this.b = str;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && qko0.b(this.c, cVar.c);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = str == null ? 0 : str.hashCode();
            int i = qko0.c;
            return Long.hashCode(this.c) + (hashCode * 31);
        }

        public final String toString() {
            return "TextChanged(text=" + this.b + ", textSelection=" + ((Object) qko0.h(this.c)) + ')';
        }
    }
}
