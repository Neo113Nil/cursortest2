package xsna;

/* compiled from: LibverifyState.kt */
/* loaded from: classes6.dex */
public interface s3z {

    /* compiled from: LibverifyState.kt */
    public static final class a implements s3z {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("CallReset(digitsCount="), this.a, ')');
        }
    }

    /* compiled from: LibverifyState.kt */
    public static final class b implements s3z {
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
            StringBuilder sb = new StringBuilder("Completed(sessionId=");
            sb.append(this.a);
            sb.append(", token=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: LibverifyState.kt */
    public static final class c implements s3z {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Error(libverifyErrorCode="), this.a, ')');
        }
    }

    /* compiled from: LibverifyState.kt */
    public static final class d implements s3z {
        public static final d a = new d();
    }

    /* compiled from: LibverifyState.kt */
    public static final class e implements s3z {
        public static final e a = new e();
    }

    /* compiled from: LibverifyState.kt */
    public static final class f implements s3z {
        public static final f a = new f();
    }
}
